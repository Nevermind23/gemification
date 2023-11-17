package p342j$.util.function;

import java.util.function.IntFunction;

/* renamed from: j$.util.function.H */
public final /* synthetic */ class C9429H implements C9431J {

    /* renamed from: a */
    public final /* synthetic */ IntFunction f26077a;

    private /* synthetic */ C9429H(IntFunction intFunction) {
        this.f26077a = intFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9431J m34786a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return intFunction instanceof C9430I ? ((C9430I) intFunction).f26078a : new C9429H(intFunction);
    }

    public final /* synthetic */ Object apply(int i) {
        return this.f26077a.apply(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9429H) {
            obj = ((C9429H) obj).f26077a;
        }
        return this.f26077a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26077a.hashCode();
    }
}
