package p342j$.util.stream;

import p342j$.util.function.C9440T;
import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.N1 */
final class C9575N1 implements C9583P1, C9652f2 {

    /* renamed from: a */
    private long f26252a;

    /* renamed from: b */
    final /* synthetic */ long f26253b;

    /* renamed from: c */
    final /* synthetic */ C9440T f26254c;

    C9575N1(long j, C9440T t) {
        this.f26253b = j;
        this.f26254c = t;
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
        this.f26252a = this.f26254c.applyAsLong(this.f26252a, j);
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
        return Long.valueOf(this.f26252a);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        accept(((C9575N1) p1).f26252a);
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
        this.f26252a = this.f26253b;
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
