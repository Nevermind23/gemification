package p342j$.util.stream;

import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.M */
abstract class C9569M implements C9542F3 {

    /* renamed from: a */
    boolean f26243a;

    /* renamed from: b */
    Object f26244b;

    C9569M() {
    }

    public /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    /* renamed from: accept */
    public final void mo25895s(Object obj) {
        if (!this.f26243a) {
            this.f26243a = true;
            this.f26244b = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo25695p(long j) {
    }

    /* renamed from: r */
    public final boolean mo25696r() {
        return this.f26243a;
    }
}
