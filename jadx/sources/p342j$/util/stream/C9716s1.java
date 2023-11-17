package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.s1 */
final class C9716s1 extends C9588Q2 implements C9539F0, C9514A0 {
    C9716s1() {
    }

    /* renamed from: a */
    public final void mo24915a(Consumer consumer) {
        super.mo24915a(consumer);
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final void accept(Object obj) {
        super.accept(obj);
    }

    /* renamed from: b */
    public final C9539F0 mo25682b() {
        return this;
    }

    /* renamed from: c */
    public final C9539F0 mo25746c(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: j */
    public final void mo25796j(Object[] objArr, int i) {
        long j = (long) i;
        long count = count() + j;
        if (count > ((long) objArr.length) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f26367c == 0) {
            System.arraycopy(this.f26270e, 0, objArr, i, this.f26366b);
        } else {
            for (int i2 = 0; i2 < this.f26367c; i2++) {
                Object[] objArr2 = this.f26271f[i2];
                System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
                i += this.f26271f[i2].length;
            }
            int i3 = this.f26366b;
            if (i3 > 0) {
                System.arraycopy(this.f26270e, 0, objArr, i, i3);
            }
        }
    }

    /* renamed from: o */
    public final void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        clear();
        mo25926w(j);
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    public final C9371P spliterator() {
        return super.spliterator();
    }

    /* renamed from: t */
    public final /* synthetic */ int mo25797t() {
        return 0;
    }

    /* renamed from: u */
    public final Object[] mo25798u(C9431J j) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) j.apply((int) count);
            mo25796j(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35795I0(this, j, j2, j3);
    }
}
