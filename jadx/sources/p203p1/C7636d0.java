package p203p1;

import android.content.Context;
import androidx.work.C1959e;
import androidx.work.C2073m;
import androidx.work.C2089s;
import androidx.work.C2093w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C2059c;
import java.util.UUID;
import p190o1.C7391q;
import p190o1.C7399v;
import p216q1.C7819c;
import p262t8.C8421a;

/* renamed from: p1.d0 */
public class C7636d0 implements C2089s {

    /* renamed from: c */
    static final String f22246c = C2073m.m8073i("WorkProgressUpdater");

    /* renamed from: a */
    final WorkDatabase f22247a;

    /* renamed from: b */
    final C7819c f22248b;

    /* renamed from: p1.d0$a */
    class C7637a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ UUID f22249d;

        /* renamed from: e */
        final /* synthetic */ C1959e f22250e;

        /* renamed from: f */
        final /* synthetic */ C2059c f22251f;

        C7637a(UUID uuid, C1959e eVar, C2059c cVar) {
            this.f22249d = uuid;
            this.f22250e = eVar;
            this.f22251f = cVar;
        }

        public void run() {
            String uuid = this.f22249d.toString();
            C2073m e = C2073m.m8071e();
            String str = C7636d0.f22246c;
            e.mo6959a(str, "Updating progress for " + this.f22249d + " (" + this.f22250e + ")");
            C7636d0.this.f22247a.mo23807e();
            try {
                C7399v i = C7636d0.this.f22247a.mo6751N().mo21808i(uuid);
                if (i != null) {
                    if (i.f21631b == C2093w.RUNNING) {
                        C7636d0.this.f22247a.mo6750M().mo21783c(new C7391q(uuid, this.f22250e));
                    } else {
                        C2073m e2 = C2073m.m8071e();
                        e2.mo6966k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid + ") is not in a RUNNING state.");
                    }
                    this.f22251f.mo6896p((Object) null);
                    C7636d0.this.f22247a.mo23804F();
                    C7636d0.this.f22247a.mo23809i();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            } catch (Throwable th) {
                C7636d0.this.f22247a.mo23809i();
                throw th;
            }
        }
    }

    public C7636d0(WorkDatabase workDatabase, C7819c cVar) {
        this.f22247a = workDatabase;
        this.f22248b = cVar;
    }

    /* renamed from: a */
    public C8421a mo6979a(Context context, UUID uuid, C1959e eVar) {
        C2059c t = C2059c.m8028t();
        this.f22248b.mo22739c(new C7637a(uuid, eVar, t));
        return t;
    }
}
