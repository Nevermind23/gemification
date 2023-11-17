package p342j$.util;

import com.github.mikephil.charting.utils.Utils;
import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;

/* renamed from: j$.util.j */
public final class C9503j implements C9444X, C9428G {
    private long count;
    private long max = Long.MIN_VALUE;
    private long min = Long.MAX_VALUE;
    private long sum;

    /* renamed from: a */
    public final void mo25642a(C9503j jVar) {
        this.count += jVar.count;
        this.sum += jVar.sum;
        this.min = Math.min(this.min, jVar.min);
        this.max = Math.max(this.max, jVar.max);
    }

    public final void accept(int i) {
        accept((long) i);
    }

    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        x.getClass();
        return new C9441U(this, x);
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C9503j.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? ((double) this.sum) / ((double) j) : Utils.DOUBLE_EPSILON);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
