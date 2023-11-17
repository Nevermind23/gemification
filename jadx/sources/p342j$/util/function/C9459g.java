package p342j$.util.function;

import java.util.function.Consumer;

/* renamed from: j$.util.function.g */
public final /* synthetic */ class C9459g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f26108a;

    private /* synthetic */ C9459g(Consumer consumer) {
        this.f26108a = consumer;
    }

    /* renamed from: a */
    public static /* synthetic */ Consumer m34817a(Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof C9461h ? ((C9461h) consumer).f26110a : new C9459g(consumer);
    }

    public final /* synthetic */ void accept(Object obj) {
        this.f26108a.accept(obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return m34817a(this.f26108a.andThen(C9461h.m34819a(consumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9459g) {
            obj = ((C9459g) obj).f26108a;
        }
        return this.f26108a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26108a.hashCode();
    }
}
