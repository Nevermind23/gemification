package p203p1;

import android.content.Context;
import android.os.Build;
import androidx.work.C1963h;
import androidx.work.C1964i;
import androidx.work.C2068l;
import androidx.work.C2073m;
import androidx.work.impl.utils.futures.C2059c;
import p190o1.C7399v;
import p216q1.C7819c;
import p262t8.C8421a;

/* renamed from: p1.b0 */
public class C7627b0 implements Runnable {

    /* renamed from: j */
    static final String f22217j = C2073m.m8073i("WorkForegroundRunnable");

    /* renamed from: d */
    final C2059c f22218d = C2059c.m8028t();

    /* renamed from: e */
    final Context f22219e;

    /* renamed from: f */
    final C7399v f22220f;

    /* renamed from: g */
    final C2068l f22221g;

    /* renamed from: h */
    final C1964i f22222h;

    /* renamed from: i */
    final C7819c f22223i;

    /* renamed from: p1.b0$a */
    class C7628a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C2059c f22224d;

        C7628a(C2059c cVar) {
            this.f22224d = cVar;
        }

        public void run() {
            if (!C7627b0.this.f22218d.isCancelled()) {
                try {
                    C1963h hVar = (C1963h) this.f22224d.get();
                    if (hVar != null) {
                        C2073m e = C2073m.m8071e();
                        String str = C7627b0.f22217j;
                        e.mo6959a(str, "Updating notification for " + C7627b0.this.f22220f.f21632c);
                        C7627b0 b0Var = C7627b0.this;
                        b0Var.f22218d.mo6898r(b0Var.f22222h.mo6745a(b0Var.f22219e, b0Var.f22221g.getId(), hVar));
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + C7627b0.this.f22220f.f21632c + ") but did not provide ForegroundInfo");
                } catch (Throwable th) {
                    C7627b0.this.f22218d.mo6897q(th);
                }
            }
        }
    }

    public C7627b0(Context context, C7399v vVar, C2068l lVar, C1964i iVar, C7819c cVar) {
        this.f22219e = context;
        this.f22220f = vVar;
        this.f22221g = lVar;
        this.f22222h = iVar;
        this.f22223i = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m29048c(C2059c cVar) {
        if (!this.f22218d.isCancelled()) {
            cVar.mo6898r(this.f22221g.getForegroundInfoAsync());
        } else {
            cVar.cancel(true);
        }
    }

    /* renamed from: b */
    public C8421a mo22333b() {
        return this.f22218d;
    }

    public void run() {
        if (!this.f22220f.f21646q || Build.VERSION.SDK_INT >= 31) {
            this.f22218d.mo6896p((Object) null);
            return;
        }
        C2059c t = C2059c.m8028t();
        this.f22223i.mo22737a().execute(new C7625a0(this, t));
        t.mo2810c(new C7628a(t), this.f22223i.mo22737a());
    }
}
