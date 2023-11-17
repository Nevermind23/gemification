package p342j$.util.function;

import java.util.function.Consumer;

/* renamed from: j$.util.function.h */
public final /* synthetic */ class C9461h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f26110a;

    private /* synthetic */ C9461h(Consumer consumer) {
        this.f26110a = consumer;
    }

    /* renamed from: a */
    public static /* synthetic */ Consumer m34819a(Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof C9459g ? ((C9459g) consumer).f26108a : new C9461h(consumer);
    }

    public final /* synthetic */ void accept(Object obj) {
        this.f26110a.accept(obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return m34819a(this.f26110a.andThen(C9459g.m34817a(consumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Consumer consumer = this.f26110a;
        if (obj instanceof C9461h) {
            obj = ((C9461h) obj).f26110a;
        }
        return consumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26110a.hashCode();
    }
}
