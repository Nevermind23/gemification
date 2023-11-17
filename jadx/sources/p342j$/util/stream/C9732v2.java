package p342j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.v2 */
final class C9732v2 extends C9712r2 {

    /* renamed from: c */
    private C9560J2 f26503c;

    C9732v2(C9657g2 g2Var) {
        super(g2Var);
    }

    public final void accept(double d) {
        this.f26503c.accept(d);
    }

    /* renamed from: o */
    public final void mo25694o() {
        double[] dArr = (double[]) this.f26503c.mo25916g();
        Arrays.sort(dArr);
        C9657g2 g2Var = this.f26338a;
        g2Var.mo25695p((long) dArr.length);
        int i = 0;
        if (!this.f26472b) {
            int length = dArr.length;
            while (i < length) {
                g2Var.accept(dArr[i]);
                i++;
            }
        } else {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (g2Var.mo25696r()) {
                    break;
                }
                g2Var.accept(d);
                i++;
            }
        }
        g2Var.mo25694o();
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        if (j < 2147483639) {
            this.f26503c = j > 0 ? new C9560J2((int) j) : new C9560J2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
