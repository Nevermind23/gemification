package p342j$.util.stream;

import java.util.Arrays;
import p342j$.util.C9371P;
import p342j$.util.C9417e0;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.I0 */
class C9554I0 implements C9539F0 {

    /* renamed from: a */
    final Object[] f26223a;

    /* renamed from: b */
    int f26224b;

    C9554I0(long j, C9431J j2) {
        if (j < 2147483639) {
            this.f26223a = (Object[]) j2.apply((int) j);
            this.f26224b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C9554I0(Object[] objArr) {
        this.f26223a = objArr;
        this.f26224b = objArr.length;
    }

    /* renamed from: a */
    public final void mo25794a(Consumer consumer) {
        for (int i = 0; i < this.f26224b; i++) {
            consumer.accept(this.f26223a[i]);
        }
    }

    /* renamed from: c */
    public final C9539F0 mo25746c(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f26224b;
    }

    /* renamed from: j */
    public final void mo25796j(Object[] objArr, int i) {
        System.arraycopy(this.f26223a, 0, objArr, i, this.f26224b);
    }

    public final C9371P spliterator() {
        return C9417e0.m34765m(this.f26223a, 0, this.f26224b);
    }

    /* renamed from: t */
    public final /* synthetic */ int mo25797t() {
        return 0;
    }

    public String toString() {
        Object[] objArr = this.f26223a;
        return String.format("ArrayNode[%d][%s]", new Object[]{Integer.valueOf(objArr.length - this.f26224b), Arrays.toString(objArr)});
    }

    /* renamed from: u */
    public final Object[] mo25798u(C9431J j) {
        Object[] objArr = this.f26223a;
        if (objArr.length == this.f26224b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35795I0(this, j, j2, j3);
    }
}
