package p342j$.util.function;

import java.util.function.Predicate;

/* renamed from: j$.util.function.u0 */
public final /* synthetic */ class C9488u0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f26133a;

    private /* synthetic */ C9488u0(Predicate predicate) {
        this.f26133a = predicate;
    }

    /* renamed from: a */
    public static /* synthetic */ Predicate m34844a(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof C9486t0 ? ((C9486t0) predicate).f26131a : new C9488u0(predicate);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return m34844a(this.f26133a.and(C9486t0.m34841a(predicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Predicate predicate = this.f26133a;
        if (obj instanceof C9488u0) {
            obj = ((C9488u0) obj).f26133a;
        }
        return predicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26133a.hashCode();
    }

    public final /* synthetic */ Predicate negate() {
        return m34844a(this.f26133a.negate());
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo25614or(Predicate predicate) {
        return m34844a(this.f26133a.mo25500or(C9486t0.m34841a(predicate)));
    }

    public final /* synthetic */ boolean test(Object obj) {
        return this.f26133a.test(obj);
    }
}
