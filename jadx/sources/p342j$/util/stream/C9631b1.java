package p342j$.util.stream;

import java.util.Arrays;
import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.C9417e0;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.b1 */
class C9631b1 implements C9524C0 {

    /* renamed from: a */
    final int[] f26345a;

    /* renamed from: b */
    int f26346b;

    C9631b1(long j) {
        if (j < 2147483639) {
            this.f26345a = new int[((int) j)];
            this.f26346b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C9631b1(int[] iArr) {
        this.f26345a = iArr;
        this.f26346b = iArr.length;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25794a(Consumer consumer) {
        C9735w0.m35790D0(this, consumer);
    }

    /* renamed from: c */
    public final C9534E0 mo25746c(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f26346b;
    }

    /* renamed from: e */
    public final void mo25748e(Object obj, int i) {
        int i2 = this.f26346b;
        System.arraycopy(this.f26345a, 0, (int[]) obj, i, i2);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo25796j(Integer[] numArr, int i) {
        C9735w0.m35787A0(this, numArr, i);
    }

    /* renamed from: g */
    public final Object mo25749g() {
        int[] iArr = this.f26345a;
        int length = iArr.length;
        int i = this.f26346b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    /* renamed from: h */
    public final void mo25750h(Object obj) {
        C9428G g = (C9428G) obj;
        for (int i = 0; i < this.f26346b; i++) {
            g.accept(this.f26345a[i]);
        }
    }

    public final C9368M spliterator() {
        return C9417e0.m34763k(this.f26345a, 0, this.f26346b);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final C9371P m124810spliterator() {
        return C9417e0.m34763k(this.f26345a, 0, this.f26346b);
    }

    /* renamed from: t */
    public final /* synthetic */ int mo25797t() {
        return 0;
    }

    public String toString() {
        int[] iArr = this.f26345a;
        return String.format("IntArrayNode[%d][%s]", new Object[]{Integer.valueOf(iArr.length - this.f26346b), Arrays.toString(iArr)});
    }

    /* renamed from: u */
    public final /* synthetic */ Object[] mo25798u(C9431J j) {
        return C9735w0.m35838y0(this, j);
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35793G0(this, j, j2);
    }
}
