package ef1;

import ef1.C40885z0;
import java.util.concurrent.locks.LockSupport;

/* renamed from: ef1.a1 */
public abstract class C40779a1 extends C40882y0 {
    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public abstract Thread mo95135G0();

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public void mo95136H0(long j, C40885z0.C40887b bVar) {
        C40836m0.f96547k.mo95284p1(j, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public final void mo95137K0() {
        Thread G0 = mo95135G0();
        if (Thread.currentThread() != G0) {
            C40785c.m118257a();
            LockSupport.unpark(G0);
        }
    }
}
