package p342j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.s */
public final /* synthetic */ class C9483s {

    /* renamed from: a */
    public final /* synthetic */ DoublePredicate f26128a;

    private /* synthetic */ C9483s(DoublePredicate doublePredicate) {
        this.f26128a = doublePredicate;
    }

    /* renamed from: a */
    public static /* synthetic */ C9483s m34838a(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new C9483s(doublePredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9483s) {
            obj = ((C9483s) obj).f26128a;
        }
        return this.f26128a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26128a.hashCode();
    }
}
