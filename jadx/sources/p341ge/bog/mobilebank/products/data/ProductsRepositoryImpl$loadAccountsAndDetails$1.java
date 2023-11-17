package p341ge.bog.mobilebank.products.data;

import ed1.C40749p;
import kotlin.jvm.internal.C41535k;
import m70.C26156i;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$loadAccountsAndDetails$1 */
/* synthetic */ class ProductsRepositoryImpl$loadAccountsAndDetails$1 extends C41535k implements C43064a {
    ProductsRepositoryImpl$loadAccountsAndDetails$1(Object obj) {
        super(0, obj, ProductsRepositoryImpl.class, "getAccountDetailsObservable", "getAccountDetailsObservable()Lio/reactivex/Observable;", 0);
    }

    public final C40749p<C26156i> invoke() {
        return ((ProductsRepositoryImpl) this.receiver).getAccountDetailsObservable();
    }
}
