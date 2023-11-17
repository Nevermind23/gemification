package p342j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.E2 */
final class C9536E2 extends C9717s2 {

    /* renamed from: c */
    private int[] f26191c;

    /* renamed from: d */
    private int f26192d;

    C9536E2(C9657g2 g2Var) {
        super(g2Var);
    }

    public final void accept(int i) {
        int[] iArr = this.f26191c;
        int i2 = this.f26192d;
        this.f26192d = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: o */
    public final void mo25694o() {
        int i = 0;
        Arrays.sort(this.f26191c, 0, this.f26192d);
        C9657g2 g2Var = this.f26342a;
        g2Var.mo25695p((long) this.f26192d);
        if (!this.f26477b) {
            while (i < this.f26192d) {
                g2Var.accept(this.f26191c[i]);
                i++;
            }
        } else {
            while (i < this.f26192d && !g2Var.mo25696r()) {
                g2Var.accept(this.f26191c[i]);
                i++;
            }
        }
        g2Var.mo25694o();
        this.f26191c = null;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        if (j < 2147483639) {
            this.f26191c = new int[((int) j)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
