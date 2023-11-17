package p342j$.util.stream;

import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.G1 */
final class C9545G1 extends C9587Q1 implements C9583P1 {

    /* renamed from: b */
    final /* synthetic */ C9494x0 f26201b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f26202c;

    /* renamed from: d */
    final /* synthetic */ C9457f f26203d;

    C9545G1(C9494x0 x0Var, BiConsumer biConsumer, C9457f fVar) {
        this.f26201b = x0Var;
        this.f26202c = biConsumer;
        this.f26203d = fVar;
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
        this.f26202c.accept(this.f26269a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        this.f26269a = this.f26203d.apply(this.f26269a, ((C9545G1) p1).f26269a);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26269a = this.f26201b.get();
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
