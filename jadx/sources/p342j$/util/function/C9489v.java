package p342j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.v */
public final /* synthetic */ class C9489v implements DoubleToLongFunction {

    /* renamed from: a */
    public final /* synthetic */ C9491w f26134a;

    private /* synthetic */ C9489v(C9491w wVar) {
        this.f26134a = wVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleToLongFunction m34846a(C9491w wVar) {
        if (wVar == null) {
            return null;
        }
        return wVar instanceof C9487u ? ((C9487u) wVar).f26132a : new C9489v(wVar);
    }

    public final /* synthetic */ long applyAsLong(double d) {
        return this.f26134a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9491w wVar = this.f26134a;
        if (obj instanceof C9489v) {
            obj = ((C9489v) obj).f26134a;
        }
        return wVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26134a.hashCode();
    }
}
