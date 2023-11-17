package ef1;

import kotlinx.coroutines.internal.C41583a;

/* renamed from: ef1.y0 */
public abstract class C40882y0 extends C40793d0 {

    /* renamed from: f */
    private long f96603f;

    /* renamed from: g */
    private boolean f96604g;

    /* renamed from: h */
    private C41583a f96605h;

    /* renamed from: e0 */
    public static /* synthetic */ void m118579e0(C40882y0 y0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            y0Var.mo95269Q(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: f0 */
    private final long m118580f0(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m118581o0(C40882y0 y0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            y0Var.mo95272n0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: F0 */
    public boolean mo95268F0() {
        return false;
    }

    /* renamed from: Q */
    public final void mo95269Q(boolean z) {
        long f0 = this.f96603f - m118580f0(z);
        this.f96603f = f0;
        if (f0 <= 0 && this.f96604g) {
            shutdown();
        }
    }

    /* renamed from: h0 */
    public final void mo95270h0(C40861s0 s0Var) {
        C41583a aVar = this.f96605h;
        if (aVar == null) {
            aVar = new C41583a();
            this.f96605h = aVar;
        }
        aVar.mo96351a(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public long mo95271m0() {
        C41583a aVar = this.f96605h;
        if (aVar != null && !aVar.mo96352c()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: n0 */
    public final void mo95272n0(boolean z) {
        this.f96603f += m118580f0(z);
        if (!z) {
            this.f96604g = true;
        }
    }

    /* renamed from: p0 */
    public final boolean mo95273p0() {
        return this.f96603f >= m118580f0(true);
    }

    /* renamed from: q0 */
    public final boolean mo95274q0() {
        C41583a aVar = this.f96605h;
        if (aVar != null) {
            return aVar.mo96352c();
        }
        return true;
    }

    /* renamed from: s0 */
    public abstract long mo95275s0();

    public abstract void shutdown();

    /* renamed from: x0 */
    public final boolean mo95276x0() {
        C40861s0 s0Var;
        C41583a aVar = this.f96605h;
        if (aVar == null || (s0Var = (C40861s0) aVar.mo96353d()) == null) {
            return false;
        }
        s0Var.run();
        return true;
    }
}
