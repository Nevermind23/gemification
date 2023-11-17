package p203p1;

import androidx.work.WorkerParameters;
import androidx.work.impl.C2007e0;
import androidx.work.impl.C2060v;

/* renamed from: p1.v */
public class C7659v implements Runnable {

    /* renamed from: d */
    private C2007e0 f22274d;

    /* renamed from: e */
    private C2060v f22275e;

    /* renamed from: f */
    private WorkerParameters.C1948a f22276f;

    public C7659v(C2007e0 e0Var, C2060v vVar, WorkerParameters.C1948a aVar) {
        this.f22274d = e0Var;
        this.f22275e = vVar;
        this.f22276f = aVar;
    }

    public void run() {
        this.f22274d.mo6825p().mo6875q(this.f22275e, this.f22276f);
    }
}
