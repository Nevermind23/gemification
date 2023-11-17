package p342j$.util.stream;

import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.Q0 */
abstract class C9586Q0 extends C9549H0 implements C9534E0 {
    C9586Q0(C9534E0 e0, C9534E0 e02) {
        super(e0, e02);
    }

    /* renamed from: e */
    public final void mo25748e(Object obj, int i) {
        C9539F0 f0 = this.f26210a;
        ((C9534E0) f0).mo25748e(obj, i);
        ((C9534E0) this.f26211b).mo25748e(obj, i + ((int) ((C9534E0) f0).count()));
    }

    /* renamed from: g */
    public final Object mo25749g() {
        long count = count();
        if (count < 2147483639) {
            Object d = mo25747d((int) count);
            mo25748e(d, 0);
            return d;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: h */
    public final void mo25750h(Object obj) {
        ((C9534E0) this.f26210a).mo25750h(obj);
        ((C9534E0) this.f26211b).mo25750h(obj);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("%s[%s.%s]", new Object[]{getClass().getName(), this.f26210a, this.f26211b});
        }
        return String.format("%s[size=%d]", new Object[]{getClass().getName(), Long.valueOf(count())});
    }

    /* renamed from: u */
    public final /* synthetic */ Object[] mo25798u(C9431J j) {
        return C9735w0.m35838y0(this, j);
    }
}
