package p342j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.j */
public final /* synthetic */ class C9465j implements DoubleBinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C9467k f26113a;

    private /* synthetic */ C9465j(C9467k kVar) {
        this.f26113a = kVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleBinaryOperator m34824a(C9467k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar instanceof C9463i ? ((C9463i) kVar).f26111a : new C9465j(kVar);
    }

    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.f26113a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9467k kVar = this.f26113a;
        if (obj instanceof C9465j) {
            obj = ((C9465j) obj).f26113a;
        }
        return kVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26113a.hashCode();
    }
}
