package kotlinx.coroutines.scheduling;

import ef1.C40801e1;
import me1.C41752f;

/* renamed from: kotlinx.coroutines.scheduling.f */
public abstract class C41637f extends C40801e1 {

    /* renamed from: g */
    private final int f97869g;

    /* renamed from: h */
    private final int f97870h;

    /* renamed from: i */
    private final long f97871i;

    /* renamed from: j */
    private final String f97872j;

    /* renamed from: k */
    private C41628a f97873k = m120823Q();

    public C41637f(int i, int i2, long j, String str) {
        this.f97869g = i;
        this.f97870h = i2;
        this.f97871i = j;
        this.f97872j = str;
    }

    /* renamed from: Q */
    private final C41628a m120823Q() {
        return new C41628a(this.f97869g, this.f97870h, this.f97871i, this.f97872j);
    }

    /* renamed from: e0 */
    public final void mo96446e0(Runnable runnable, C41640i iVar, boolean z) {
        this.f97873k.mo96428o(runnable, iVar, z);
    }

    /* renamed from: h */
    public void mo95148h(C41752f fVar, Runnable runnable) {
        C41628a.m120788p(this.f97873k, runnable, (C41640i) null, false, 6, (Object) null);
    }
}
