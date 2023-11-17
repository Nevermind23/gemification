package dg1;

import java.io.OutputStream;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.q */
final class C40696q implements C40705x {

    /* renamed from: d */
    private final OutputStream f96355d;

    /* renamed from: e */
    private final C40669a0 f96356e;

    public C40696q(OutputStream outputStream, C40669a0 a0Var) {
        C41536l.m120489i(outputStream, "out");
        C41536l.m120489i(a0Var, "timeout");
        this.f96355d = outputStream;
        this.f96356e = a0Var;
    }

    /* renamed from: C */
    public C40669a0 mo94673C() {
        return this.f96356e;
    }

    public void close() {
        this.f96355d.close();
    }

    public void flush() {
        this.f96355d.flush();
    }

    public String toString() {
        return "sink(" + this.f96355d + ')';
    }

    /* renamed from: x1 */
    public void mo21301x1(C40672b bVar, long j) {
        C41536l.m120489i(bVar, "source");
        C40683e0.m117729b(bVar.mo94709M0(), 0, j);
        while (j > 0) {
            this.f96356e.mo94687f();
            C40701u uVar = bVar.f96314d;
            C41536l.m120486f(uVar);
            int min = (int) Math.min(j, (long) (uVar.f96373c - uVar.f96372b));
            this.f96355d.write(uVar.f96371a, uVar.f96372b, min);
            uVar.f96372b += min;
            long j2 = (long) min;
            j -= j2;
            bVar.mo94706K0(bVar.mo94709M0() - j2);
            if (uVar.f96372b == uVar.f96373c) {
                bVar.f96314d = uVar.mo94861b();
                C40703v.m117851b(uVar);
            }
        }
    }
}
