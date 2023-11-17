package p342j$.util.stream;

import java.util.Arrays;
import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.C9417e0;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.S0 */
class C9593S0 implements C9519B0 {

    /* renamed from: a */
    final double[] f26275a;

    /* renamed from: b */
    int f26276b;

    C9593S0(long j) {
        if (j < 2147483639) {
            this.f26275a = new double[((int) j)];
            this.f26276b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C9593S0(double[] dArr) {
        this.f26275a = dArr;
        this.f26276b = dArr.length;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25794a(Consumer consumer) {
        C9735w0.m35789C0(this, consumer);
    }

    /* renamed from: c */
    public final C9534E0 mo25746c(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f26276b;
    }

    /* renamed from: e */
    public final void mo25748e(Object obj, int i) {
        int i2 = this.f26276b;
        System.arraycopy(this.f26275a, 0, (double[]) obj, i, i2);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo25796j(Double[] dArr, int i) {
        C9735w0.m35839z0(this, dArr, i);
    }

    /* renamed from: g */
    public final Object mo25749g() {
        double[] dArr = this.f26275a;
        int length = dArr.length;
        int i = this.f26276b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    /* renamed from: h */
    public final void mo25750h(Object obj) {
        C9475o oVar = (C9475o) obj;
        for (int i = 0; i < this.f26276b; i++) {
            oVar.accept(this.f26275a[i]);
        }
    }

    public final C9368M spliterator() {
        return C9417e0.m34762j(this.f26275a, 0, this.f26276b);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final C9371P m124805spliterator() {
        return C9417e0.m34762j(this.f26275a, 0, this.f26276b);
    }

    /* renamed from: t */
    public final /* synthetic */ int mo25797t() {
        return 0;
    }

    public String toString() {
        double[] dArr = this.f26275a;
        return String.format("DoubleArrayNode[%d][%s]", new Object[]{Integer.valueOf(dArr.length - this.f26276b), Arrays.toString(dArr)});
    }

    /* renamed from: u */
    public final /* synthetic */ Object[] mo25798u(C9431J j) {
        return C9735w0.m35838y0(this, j);
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35792F0(this, j, j2);
    }
}
