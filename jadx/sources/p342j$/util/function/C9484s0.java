package p342j$.util.function;

import p342j$.util.function.Predicate;

/* renamed from: j$.util.function.s0 */
public final /* synthetic */ class C9484s0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f26129a;

    public /* synthetic */ C9484s0(Predicate predicate) {
        this.f26129a = predicate;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo25500or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return !this.f26129a.test(obj);
    }
}
