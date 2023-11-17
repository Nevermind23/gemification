package p342j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.F2 */
final class C9541F2 extends C9722t2 {

    /* renamed from: c */
    private long[] f26198c;

    /* renamed from: d */
    private int f26199d;

    C9541F2(C9657g2 g2Var) {
        super(g2Var);
    }

    public final void accept(long j) {
        long[] jArr = this.f26198c;
        int i = this.f26199d;
        this.f26199d = i + 1;
        jArr[i] = j;
    }

    /* renamed from: o */
    public final void mo25694o() {
        int i = 0;
        Arrays.sort(this.f26198c, 0, this.f26199d);
        C9657g2 g2Var = this.f26347a;
        g2Var.mo25695p((long) this.f26199d);
        if (!this.f26483b) {
            while (i < this.f26199d) {
                g2Var.accept(this.f26198c[i]);
                i++;
            }
        } else {
            while (i < this.f26199d && !g2Var.mo25696r()) {
                g2Var.accept(this.f26198c[i]);
                i++;
            }
        }
        g2Var.mo25694o();
        this.f26198c = null;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        if (j < 2147483639) {
            this.f26198c = new long[((int) j)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
