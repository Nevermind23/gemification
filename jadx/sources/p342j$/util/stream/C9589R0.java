package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.R0 */
final class C9589R0 extends C9549H0 {
    C9589R0(C9539F0 f0, C9539F0 f02) {
        super(f0, f02);
    }

    /* renamed from: a */
    public final void mo25794a(Consumer consumer) {
        this.f26210a.mo25794a(consumer);
        this.f26211b.mo25794a(consumer);
    }

    /* renamed from: j */
    public final void mo25796j(Object[] objArr, int i) {
        objArr.getClass();
        C9539F0 f0 = this.f26210a;
        f0.mo25796j(objArr, i);
        this.f26211b.mo25796j(objArr, i + ((int) f0.count()));
    }

    public final C9371P spliterator() {
        return new C9666i1(this);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("ConcNode[%s.%s]", new Object[]{this.f26210a, this.f26211b});
        }
        return String.format("ConcNode[size=%d]", new Object[]{Long.valueOf(count())});
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
    public final C9539F0 mo25799v(long j, long j2, C9431J j3) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.f26210a.count();
        if (j >= count) {
            return this.f26211b.mo25799v(j - count, j2 - count, j3);
        }
        if (j2 <= count) {
            return this.f26210a.mo25799v(j, j2, j3);
        }
        C9431J j4 = j3;
        return C9735w0.m35807U0(C9611W2.REFERENCE, this.f26210a.mo25799v(j, count, j4), this.f26211b.mo25799v(0, j2 - count, j4));
    }
}
