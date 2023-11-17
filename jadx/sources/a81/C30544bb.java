package a81;

import p341ge.bog.mobilebank.model.search.SearchResultObject;
import p341ge.bog.mobilebank.p975ui.activities.SearchActivity;
import p342j$.util.function.Predicate;

/* renamed from: a81.bb */
public final /* synthetic */ class C30544bb implements Predicate {
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public /* synthetic */ Predicate mo25500or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return SearchActivity.m104774U2((SearchResultObject) obj);
    }
}
