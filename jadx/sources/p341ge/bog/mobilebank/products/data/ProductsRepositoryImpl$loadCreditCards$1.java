package p341ge.bog.mobilebank.products.data;

import ed1.C40749p;
import kotlin.jvm.internal.C41535k;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$loadCreditCards$1 */
/* synthetic */ class ProductsRepositoryImpl$loadCreditCards$1 extends C41535k implements C43064a {
    ProductsRepositoryImpl$loadCreditCards$1(Object obj) {
        super(0, obj, ProductsRepositoryImpl.class, "getCreditCardsObservable", "getCreditCardsObservable()Lio/reactivex/Observable;", 0);
    }

    public final C40749p<CreditCardsWrapper> invoke() {
        return ((ProductsRepositoryImpl) this.receiver).getCreditCardsObservable();
    }
}
