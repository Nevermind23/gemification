package a81;

import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.p975ui.activities.ProviderListActivity;
import p342j$.util.function.Predicate;

/* renamed from: a81.x9 */
public final /* synthetic */ class C30836x9 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ ProviderListActivity f76845a;

    public /* synthetic */ C30836x9(ProviderListActivity providerListActivity) {
        this.f76845a = providerListActivity;
    }

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
        return this.f76845a.m104698X2((PaymentProviderConfiguration) obj);
    }
}
