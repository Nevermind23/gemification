package p342j$.util.stream;

import p342j$.util.C9506m;
import p342j$.util.function.C9440T;
import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.O1 */
final class C9579O1 implements C9583P1, C9652f2 {

    /* renamed from: a */
    private boolean f26256a;

    /* renamed from: b */
    private long f26257b;

    /* renamed from: c */
    final /* synthetic */ C9440T f26258c;

    C9579O1(C9440T t) {
        this.f26258c = t;
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final void accept(long j) {
        if (this.f26256a) {
            this.f26256a = false;
        } else {
            j = this.f26258c.applyAsLong(this.f26257b, j);
        }
        this.f26257b = j;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25901k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        x.getClass();
        return new C9441U(this, x);
    }

    public final Object get() {
        return this.f26256a ? C9506m.m34872a() : C9506m.m34873d(this.f26257b);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        C9579O1 o1 = (C9579O1) p1;
        if (!o1.f26256a) {
            accept(o1.f26257b);
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void mo25901k(Long l) {
        C9735w0.m35833u0(this, l);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26256a = true;
        this.f26257b = 0;
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
