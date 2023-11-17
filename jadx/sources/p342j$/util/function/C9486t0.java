package p342j$.util.function;

import java.util.function.Predicate;

/* renamed from: j$.util.function.t0 */
public final /* synthetic */ class C9486t0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f26131a;

    private /* synthetic */ C9486t0(Predicate predicate) {
        this.f26131a = predicate;
    }

    /* renamed from: a */
    public static /* synthetic */ Predicate m34841a(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof C9488u0 ? ((C9488u0) predicate).f26133a : new C9486t0(predicate);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return m34841a(this.f26131a.and(C9488u0.m34844a(predicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9486t0) {
            obj = ((C9486t0) obj).f26131a;
        }
        return this.f26131a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26131a.hashCode();
    }

    public final /* synthetic */ Predicate negate() {
        return m34841a(this.f26131a.negate());
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo25500or(Predicate predicate) {
        return m34841a(this.f26131a.or(C9488u0.m34844a(predicate)));
    }

    public final /* synthetic */ boolean test(Object obj) {
        return this.f26131a.test(obj);
    }
}
