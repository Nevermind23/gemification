package p342j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.F */
public final /* synthetic */ class C9427F implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ C9428G f26075a;

    private /* synthetic */ C9427F(C9428G g) {
        this.f26075a = g;
    }

    /* renamed from: a */
    public static /* synthetic */ IntConsumer m34780a(C9428G g) {
        if (g == null) {
            return null;
        }
        return g instanceof C9426E ? ((C9426E) g).f26074a : new C9427F(g);
    }

    public final /* synthetic */ void accept(int i) {
        this.f26075a.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return m34780a(this.f26075a.mo25284n(C9426E.m34778a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9428G g = this.f26075a;
        if (obj instanceof C9427F) {
            obj = ((C9427F) obj).f26075a;
        }
        return g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26075a.hashCode();
    }
}
