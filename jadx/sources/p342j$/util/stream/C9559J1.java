package p342j$.util.stream;

import p342j$.util.function.C9424C;
import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.J1 */
final class C9559J1 implements C9583P1, C9647e2 {

    /* renamed from: a */
    private int f26231a;

    /* renamed from: b */
    final /* synthetic */ int f26232b;

    /* renamed from: c */
    final /* synthetic */ C9424C f26233c;

    C9559J1(int i, C9424C c) {
        this.f26232b = i;
        this.f26233c = c;
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final void accept(int i) {
        this.f26231a = this.f26233c.applyAsInt(this.f26231a, i);
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
        return Integer.valueOf(this.f26231a);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        accept(((C9559J1) p1).f26231a);
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
        this.f26231a = this.f26232b;
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
