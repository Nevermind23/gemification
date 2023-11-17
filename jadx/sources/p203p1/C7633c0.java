package p203p1;

import android.content.Context;
import androidx.work.C1963h;
import androidx.work.C1964i;
import androidx.work.C2073m;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C2016a;
import androidx.work.impl.foreground.C2017b;
import androidx.work.impl.utils.futures.C2059c;
import java.util.UUID;
import p190o1.C7399v;
import p190o1.C7402w;
import p190o1.C7417y;
import p216q1.C7819c;
import p262t8.C8421a;

/* renamed from: p1.c0 */
public class C7633c0 implements C1964i {

    /* renamed from: d */
    private static final String f22234d = C2073m.m8073i("WMFgUpdater");

    /* renamed from: a */
    private final C7819c f22235a;

    /* renamed from: b */
    final C2016a f22236b;

    /* renamed from: c */
    final C7402w f22237c;

    /* renamed from: p1.c0$a */
    class C7634a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C2059c f22238d;

        /* renamed from: e */
        final /* synthetic */ UUID f22239e;

        /* renamed from: f */
        final /* synthetic */ C1963h f22240f;

        /* renamed from: g */
        final /* synthetic */ Context f22241g;

        C7634a(C2059c cVar, UUID uuid, C1963h hVar, Context context) {
            this.f22238d = cVar;
            this.f22239e = uuid;
            this.f22240f = hVar;
            this.f22241g = context;
        }

        public void run() {
            try {
                if (!this.f22238d.isCancelled()) {
                    String uuid = this.f22239e.toString();
                    C7399v i = C7633c0.this.f22237c.mo21808i(uuid);
                    if (i == null || i.f21631b.mo6980b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C7633c0.this.f22236b.mo6844c(uuid, this.f22240f);
                    this.f22241g.startService(C2017b.m7898c(this.f22241g, C7417y.m28225a(i), this.f22240f));
                }
                this.f22238d.mo6896p((Object) null);
            } catch (Throwable th) {
                this.f22238d.mo6897q(th);
            }
        }
    }

    public C7633c0(WorkDatabase workDatabase, C2016a aVar, C7819c cVar) {
        this.f22236b = aVar;
        this.f22235a = cVar;
        this.f22237c = workDatabase.mo6751N();
    }

    /* renamed from: a */
    public C8421a mo6745a(Context context, UUID uuid, C1963h hVar) {
        C2059c t = C2059c.m8028t();
        this.f22235a.mo22739c(new C7634a(t, uuid, hVar, context));
        return t;
    }
}
