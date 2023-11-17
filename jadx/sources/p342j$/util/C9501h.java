package p342j$.util;

import com.github.mikephil.charting.utils.Utils;
import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;

/* renamed from: j$.util.h */
public final class C9501h implements C9428G {
    private long count;
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    private long sum;

    /* renamed from: a */
    public final void mo25640a(C9501h hVar) {
        this.count += hVar.count;
        this.sum += hVar.sum;
        this.min = Math.min(this.min, hVar.min);
        this.max = Math.max(this.max, hVar.max);
    }

    public final void accept(int i) {
        this.count++;
        this.sum += (long) i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C9501h.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? ((double) this.sum) / ((double) j) : Utils.DOUBLE_EPSILON);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
