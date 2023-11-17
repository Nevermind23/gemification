package p203p1;

import androidx.work.C2073m;
import androidx.work.impl.C2007e0;
import androidx.work.impl.C2060v;

/* renamed from: p1.w */
public class C7660w implements Runnable {

    /* renamed from: g */
    private static final String f22277g = C2073m.m8073i("StopWorkRunnable");

    /* renamed from: d */
    private final C2007e0 f22278d;

    /* renamed from: e */
    private final C2060v f22279e;

    /* renamed from: f */
    private final boolean f22280f;

    public C7660w(C2007e0 e0Var, C2060v vVar, boolean z) {
        this.f22278d = e0Var;
        this.f22279e = vVar;
        this.f22280f = z;
    }

    public void run() {
        boolean z;
        if (this.f22280f) {
            z = this.f22278d.mo6825p().mo6877t(this.f22279e);
        } else {
            z = this.f22278d.mo6825p().mo6878u(this.f22279e);
        }
        C2073m e = C2073m.m8071e();
        String str = f22277g;
        e.mo6959a(str, "StopWorkRunnable for " + this.f22279e.mo6911a().mo21770b() + "; Processor.stopWork = " + z);
    }
}
