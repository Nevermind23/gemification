package p342j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.w2 */
final class C9737w2 extends C9717s2 {

    /* renamed from: c */
    private C9568L2 f26518c;

    C9737w2(C9657g2 g2Var) {
        super(g2Var);
    }

    public final void accept(int i) {
        this.f26518c.accept(i);
    }

    /* renamed from: o */
    public final void mo25694o() {
        int[] iArr = (int[]) this.f26518c.mo25916g();
        Arrays.sort(iArr);
        C9657g2 g2Var = this.f26342a;
        g2Var.mo25695p((long) iArr.length);
        int i = 0;
        if (!this.f26477b) {
            int length = iArr.length;
            while (i < length) {
                g2Var.accept(iArr[i]);
                i++;
            }
        } else {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (g2Var.mo25696r()) {
                    break;
                }
                g2Var.accept(i2);
                i++;
            }
        }
        g2Var.mo25694o();
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        if (j < 2147483639) {
            this.f26518c = j > 0 ? new C9568L2((int) j) : new C9568L2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
