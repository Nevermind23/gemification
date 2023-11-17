package p342j$.util.function;

import java.util.function.IntPredicate;

/* renamed from: j$.util.function.K */
public final /* synthetic */ class C9432K {

    /* renamed from: a */
    public final /* synthetic */ IntPredicate f26079a;

    private /* synthetic */ C9432K(IntPredicate intPredicate) {
        this.f26079a = intPredicate;
    }

    /* renamed from: a */
    public static /* synthetic */ C9432K m34788a(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new C9432K(intPredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9432K) {
            obj = ((C9432K) obj).f26079a;
        }
        return this.f26079a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26079a.hashCode();
    }
}
