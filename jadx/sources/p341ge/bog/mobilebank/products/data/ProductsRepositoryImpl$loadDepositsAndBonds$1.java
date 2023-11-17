package p341ge.bog.mobilebank.products.data;

import ed1.C40749p;
import kotlin.jvm.internal.C41535k;
import p341ge.bog.mobilebank.model.DepositBondsContainer;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$loadDepositsAndBonds$1 */
/* synthetic */ class ProductsRepositoryImpl$loadDepositsAndBonds$1 extends C41535k implements C43064a {
    ProductsRepositoryImpl$loadDepositsAndBonds$1(Object obj) {
        super(0, obj, ProductsRepositoryImpl.class, "getDepositsAndBondsObservable", "getDepositsAndBondsObservable()Lio/reactivex/Observable;", 0);
    }

    public final C40749p<DepositBondsContainer> invoke() {
        return ((ProductsRepositoryImpl) this.receiver).getDepositsAndBondsObservable();
    }
}
