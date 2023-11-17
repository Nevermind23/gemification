package p342j$.util.stream;

import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.B3 */
public final /* synthetic */ class C9522B3 implements C9657g2 {

    /* renamed from: a */
    public final /* synthetic */ int f26172a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f26173b;

    public /* synthetic */ C9522B3(Consumer consumer, int i) {
        this.f26172a = i;
        this.f26173b = consumer;
    }

    public final /* synthetic */ void accept(double d) {
        switch (this.f26172a) {
            case 0:
                C9735w0.m35824p0();
                throw null;
            default:
                C9735w0.m35824p0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(int i) {
        switch (this.f26172a) {
            case 0:
                C9735w0.m35836w0();
                throw null;
            default:
                C9735w0.m35836w0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(long j) {
        switch (this.f26172a) {
            case 0:
                C9735w0.m35837x0();
                throw null;
            default:
                C9735w0.m35837x0();
                throw null;
        }
    }

    public final void accept(Object obj) {
        int i = this.f26172a;
        Consumer consumer = this.f26173b;
        switch (i) {
            case 0:
                ((C9588Q2) consumer).accept(obj);
                return;
            default:
                consumer.accept(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26172a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo25695p(long j) {
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
