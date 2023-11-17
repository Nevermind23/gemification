package p342j$.util.stream;

import p342j$.util.C9505l;
import p342j$.util.function.C9424C;
import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.K1 */
final class C9563K1 implements C9583P1, C9647e2 {

    /* renamed from: a */
    private boolean f26235a;

    /* renamed from: b */
    private int f26236b;

    /* renamed from: c */
    final /* synthetic */ C9424C f26237c;

    C9563K1(C9424C c) {
        this.f26237c = c;
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final void accept(int i) {
        if (this.f26235a) {
            this.f26235a = false;
        } else {
            i = this.f26237c.applyAsInt(this.f26236b, i);
        }
        this.f26236b = i;
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25881q((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object get() {
        return this.f26235a ? C9505l.m34868a() : C9505l.m34869d(this.f26236b);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        C9563K1 k1 = (C9563K1) p1;
        if (!k1.f26235a) {
            accept(k1.f26236b);
        }
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26235a = true;
        this.f26236b = 0;
    }

    /* renamed from: q */
    public final /* synthetic */ void mo25881q(Integer num) {
        C9735w0.m35829s0(this, num);
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
