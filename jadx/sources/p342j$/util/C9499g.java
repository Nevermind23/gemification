package p342j$.util;

import com.github.mikephil.charting.utils.Utils;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;

/* renamed from: j$.util.g */
public final class C9499g implements C9475o {

    /* renamed from: a */
    private double f26144a;

    /* renamed from: b */
    private double f26145b;
    private long count;
    private double max = Double.NEGATIVE_INFINITY;
    private double min = Double.POSITIVE_INFINITY;
    private double sum;

    /* renamed from: a */
    public final void mo25638a(C9499g gVar) {
        this.count += gVar.count;
        this.f26145b += gVar.f26145b;
        double d = gVar.sum - this.f26144a;
        double d2 = this.sum;
        double d3 = d2 + d;
        double d4 = (d3 - d2) - d;
        this.f26144a = d4;
        double d5 = gVar.f26144a - d4;
        double d6 = d3 + d5;
        this.f26144a = (d6 - d3) - d5;
        this.sum = d6;
        this.min = Math.min(this.min, gVar.min);
        this.max = Math.max(this.max, gVar.max);
    }

    public final void accept(double d) {
        this.count++;
        this.f26145b += d;
        double d2 = d - this.f26144a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.f26144a = (d4 - d3) - d2;
        this.sum = d4;
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    public final String toString() {
        double d;
        Object[] objArr = new Object[6];
        objArr[0] = C9499g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d2 = this.sum + this.f26144a;
        if (Double.isNaN(d2) && Double.isInfinite(this.f26145b)) {
            d2 = this.f26145b;
        }
        objArr[2] = Double.valueOf(d2);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d3 = this.sum + this.f26144a;
            if (Double.isNaN(d3) && Double.isInfinite(this.f26145b)) {
                d3 = this.f26145b;
            }
            d = d3 / ((double) this.count);
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        objArr[4] = Double.valueOf(d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
