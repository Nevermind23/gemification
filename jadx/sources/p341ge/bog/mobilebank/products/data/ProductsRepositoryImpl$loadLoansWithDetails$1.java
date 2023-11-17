package p341ge.bog.mobilebank.products.data;

import ed1.C40749p;
import kotlin.jvm.internal.C41535k;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$loadLoansWithDetails$1 */
/* synthetic */ class ProductsRepositoryImpl$loadLoansWithDetails$1 extends C41535k implements C43064a {
    ProductsRepositoryImpl$loadLoansWithDetails$1(Object obj) {
        super(0, obj, ProductsRepositoryImpl.class, "getLoansWithDetailsObservable", "getLoansWithDetailsObservable()Lio/reactivex/Observable;", 0);
    }

    public final C40749p<LoansWrapper> invoke() {
        return ((ProductsRepositoryImpl) this.receiver).getLoansWithDetailsObservable();
    }
}
