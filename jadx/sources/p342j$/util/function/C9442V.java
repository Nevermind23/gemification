package p342j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.V */
public final /* synthetic */ class C9442V implements C9444X {

    /* renamed from: a */
    public final /* synthetic */ LongConsumer f26091a;

    private /* synthetic */ C9442V(LongConsumer longConsumer) {
        this.f26091a = longConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C9444X m34797a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof C9443W ? ((C9443W) longConsumer).f26092a : new C9442V(longConsumer);
    }

    public final /* synthetic */ void accept(long j) {
        this.f26091a.accept(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9442V) {
            obj = ((C9442V) obj).f26091a;
        }
        return this.f26091a.equals(obj);
    }

    /* renamed from: f */
    public final /* synthetic */ C9444X mo25289f(C9444X x) {
        return m34797a(this.f26091a.andThen(C9443W.m34799a(x)));
    }

    public final /* synthetic */ int hashCode() {
        return this.f26091a.hashCode();
    }
}
