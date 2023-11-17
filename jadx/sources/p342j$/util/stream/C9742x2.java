package p342j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.x2 */
final class C9742x2 extends C9722t2 {

    /* renamed from: c */
    private C9576N2 f26525c;

    C9742x2(C9657g2 g2Var) {
        super(g2Var);
    }

    public final void accept(long j) {
        this.f26525c.accept(j);
    }

    /* renamed from: o */
    public final void mo25694o() {
        long[] jArr = (long[]) this.f26525c.mo25916g();
        Arrays.sort(jArr);
        C9657g2 g2Var = this.f26347a;
        g2Var.mo25695p((long) jArr.length);
        int i = 0;
        if (!this.f26483b) {
            int length = jArr.length;
            while (i < length) {
                g2Var.accept(jArr[i]);
                i++;
            }
        } else {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (g2Var.mo25696r()) {
                    break;
                }
                g2Var.accept(j);
                i++;
            }
        }
        g2Var.mo25694o();
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        if (j < 2147483639) {
            this.f26525c = j > 0 ? new C9576N2((int) j) : new C9576N2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
