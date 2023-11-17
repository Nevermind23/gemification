package p342j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.W */
public final /* synthetic */ class C9443W implements LongConsumer {

    /* renamed from: a */
    public final /* synthetic */ C9444X f26092a;

    private /* synthetic */ C9443W(C9444X x) {
        this.f26092a = x;
    }

    /* renamed from: a */
    public static /* synthetic */ LongConsumer m34799a(C9444X x) {
        if (x == null) {
            return null;
        }
        return x instanceof C9442V ? ((C9442V) x).f26091a : new C9443W(x);
    }

    public final /* synthetic */ void accept(long j) {
        this.f26092a.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return m34799a(this.f26092a.mo25289f(C9442V.m34797a(longConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9444X x = this.f26092a;
        if (obj instanceof C9443W) {
            obj = ((C9443W) obj).f26092a;
        }
        return x.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26092a.hashCode();
    }
}
