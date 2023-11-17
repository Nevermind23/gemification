package p342j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.E */
public final /* synthetic */ class C9426E implements C9428G {

    /* renamed from: a */
    public final /* synthetic */ IntConsumer f26074a;

    private /* synthetic */ C9426E(IntConsumer intConsumer) {
        this.f26074a = intConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C9428G m34778a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof C9427F ? ((C9427F) intConsumer).f26075a : new C9426E(intConsumer);
    }

    public final /* synthetic */ void accept(int i) {
        this.f26074a.accept(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9426E) {
            obj = ((C9426E) obj).f26074a;
        }
        return this.f26074a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26074a.hashCode();
    }

    /* renamed from: n */
    public final /* synthetic */ C9428G mo25284n(C9428G g) {
        return m34778a(this.f26074a.andThen(C9427F.m34780a(g)));
    }
}
