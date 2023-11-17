package p342j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.D2 */
final class C9531D2 extends C9712r2 {

    /* renamed from: c */
    private double[] f26183c;

    /* renamed from: d */
    private int f26184d;

    C9531D2(C9657g2 g2Var) {
        super(g2Var);
    }

    public final void accept(double d) {
        double[] dArr = this.f26183c;
        int i = this.f26184d;
        this.f26184d = i + 1;
        dArr[i] = d;
    }

    /* renamed from: o */
    public final void mo25694o() {
        int i = 0;
        Arrays.sort(this.f26183c, 0, this.f26184d);
        C9657g2 g2Var = this.f26338a;
        g2Var.mo25695p((long) this.f26184d);
        if (!this.f26472b) {
            while (i < this.f26184d) {
                g2Var.accept(this.f26183c[i]);
                i++;
            }
        } else {
            while (i < this.f26184d && !g2Var.mo25696r()) {
                g2Var.accept(this.f26183c[i]);
                i++;
            }
        }
        g2Var.mo25694o();
        this.f26183c = null;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        if (j < 2147483639) {
            this.f26183c = new double[((int) j)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
