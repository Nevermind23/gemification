package p342j$.util.stream;

import java.util.Arrays;
import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.C9417e0;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.k1 */
class C9676k1 implements C9529D0 {

    /* renamed from: a */
    final long[] f26409a;

    /* renamed from: b */
    int f26410b;

    C9676k1(long j) {
        if (j < 2147483639) {
            this.f26409a = new long[((int) j)];
            this.f26410b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C9676k1(long[] jArr) {
        this.f26409a = jArr;
        this.f26410b = jArr.length;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25794a(Consumer consumer) {
        C9735w0.m35791E0(this, consumer);
    }

    /* renamed from: c */
    public final C9534E0 mo25746c(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f26410b;
    }

    /* renamed from: e */
    public final void mo25748e(Object obj, int i) {
        int i2 = this.f26410b;
        System.arraycopy(this.f26409a, 0, (long[]) obj, i, i2);
    }

    /* renamed from: g */
    public final Object mo25749g() {
        long[] jArr = this.f26409a;
        int length = jArr.length;
        int i = this.f26410b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    /* renamed from: h */
    public final void mo25750h(Object obj) {
        C9444X x = (C9444X) obj;
        for (int i = 0; i < this.f26410b; i++) {
            x.accept(this.f26409a[i]);
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo25796j(Long[] lArr, int i) {
        C9735w0.m35788B0(this, lArr, i);
    }

    public final C9368M spliterator() {
        return C9417e0.m34764l(this.f26409a, 0, this.f26410b);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final C9371P m124812spliterator() {
        return C9417e0.m34764l(this.f26409a, 0, this.f26410b);
    }

    /* renamed from: t */
    public final /* synthetic */ int mo25797t() {
        return 0;
    }

    public String toString() {
        long[] jArr = this.f26409a;
        return String.format("LongArrayNode[%d][%s]", new Object[]{Integer.valueOf(jArr.length - this.f26410b), Arrays.toString(jArr)});
    }

    /* renamed from: u */
    public final /* synthetic */ Object[] mo25798u(C9431J j) {
        return C9735w0.m35838y0(this, j);
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35794H0(this, j, j2);
    }
}
