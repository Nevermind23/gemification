package p203p1;

import androidx.work.C2073m;
import androidx.work.C2091u;
import java.util.HashMap;
import java.util.Map;
import p190o1.C7386m;

/* renamed from: p1.e0 */
public class C7639e0 {

    /* renamed from: e */
    private static final String f22253e = C2073m.m8073i("WorkTimer");

    /* renamed from: a */
    final C2091u f22254a;

    /* renamed from: b */
    final Map f22255b = new HashMap();

    /* renamed from: c */
    final Map f22256c = new HashMap();

    /* renamed from: d */
    final Object f22257d = new Object();

    /* renamed from: p1.e0$a */
    public interface C7640a {
        /* renamed from: a */
        void mo6782a(C7386m mVar);
    }

    /* renamed from: p1.e0$b */
    public static class C7641b implements Runnable {

        /* renamed from: d */
        private final C7639e0 f22258d;

        /* renamed from: e */
        private final C7386m f22259e;

        C7641b(C7639e0 e0Var, C7386m mVar) {
            this.f22258d = e0Var;
            this.f22259e = mVar;
        }

        public void run() {
            synchronized (this.f22258d.f22257d) {
                if (((C7641b) this.f22258d.f22255b.remove(this.f22259e)) != null) {
                    C7640a aVar = (C7640a) this.f22258d.f22256c.remove(this.f22259e);
                    if (aVar != null) {
                        aVar.mo6782a(this.f22259e);
                    }
                } else {
                    C2073m.m8071e().mo6959a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f22259e}));
                }
            }
        }
    }

    public C7639e0(C2091u uVar) {
        this.f22254a = uVar;
    }

    /* renamed from: a */
    public void mo22347a(C7386m mVar, long j, C7640a aVar) {
        synchronized (this.f22257d) {
            C2073m e = C2073m.m8071e();
            String str = f22253e;
            e.mo6959a(str, "Starting timer for " + mVar);
            mo22348b(mVar);
            C7641b bVar = new C7641b(this, mVar);
            this.f22255b.put(mVar, bVar);
            this.f22256c.put(mVar, aVar);
            this.f22254a.mo6811b(j, bVar);
        }
    }

    /* renamed from: b */
    public void mo22348b(C7386m mVar) {
        synchronized (this.f22257d) {
            if (((C7641b) this.f22255b.remove(mVar)) != null) {
                C2073m e = C2073m.m8071e();
                String str = f22253e;
                e.mo6959a(str, "Stopping timer for " + mVar);
                this.f22256c.remove(mVar);
            }
        }
    }
}
