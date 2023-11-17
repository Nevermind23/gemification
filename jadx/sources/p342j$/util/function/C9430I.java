package p342j$.util.function;

import java.util.function.IntFunction;

/* renamed from: j$.util.function.I */
public final /* synthetic */ class C9430I implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ C9431J f26078a;

    private /* synthetic */ C9430I(C9431J j) {
        this.f26078a = j;
    }

    /* renamed from: a */
    public static /* synthetic */ IntFunction m34787a(C9431J j) {
        if (j == null) {
            return null;
        }
        return j instanceof C9429H ? ((C9429H) j).f26077a : new C9430I(j);
    }

    public final /* synthetic */ Object apply(int i) {
        return this.f26078a.apply(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9431J j = this.f26078a;
        if (obj instanceof C9430I) {
            obj = ((C9430I) obj).f26078a;
        }
        return j.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26078a.hashCode();
    }
}
