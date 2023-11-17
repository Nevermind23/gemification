package p342j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: j$.util.stream.G2 */
final class C9546G2 extends C9727u2 {

    /* renamed from: d */
    private Object[] f26204d;

    /* renamed from: e */
    private int f26205e;

    C9546G2(C9657g2 g2Var, Comparator comparator) {
        super(g2Var, comparator);
    }

    public final void accept(Object obj) {
        Object[] objArr = this.f26204d;
        int i = this.f26205e;
        this.f26205e = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: o */
    public final void mo25694o() {
        int i = 0;
        Arrays.sort(this.f26204d, 0, this.f26205e, this.f26495b);
        C9657g2 g2Var = this.f26360a;
        g2Var.mo25695p((long) this.f26205e);
        if (!this.f26496c) {
            while (i < this.f26205e) {
                g2Var.accept(this.f26204d[i]);
                i++;
            }
        } else {
            while (i < this.f26205e && !g2Var.mo25696r()) {
                g2Var.accept(this.f26204d[i]);
                i++;
            }
        }
        g2Var.mo25694o();
        this.f26204d = null;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        if (j < 2147483639) {
            this.f26204d = new Object[((int) j)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
