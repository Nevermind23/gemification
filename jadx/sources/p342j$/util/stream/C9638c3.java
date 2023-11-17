package p342j$.util.stream;

import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.c3 */
final class C9638c3 extends C9643d3 implements Consumer {

    /* renamed from: b */
    final Object[] f26361b = new Object[128];

    C9638c3() {
    }

    public final void accept(Object obj) {
        int i = this.f26364a;
        this.f26364a = i + 1;
        this.f26361b[i] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
