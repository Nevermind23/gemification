package p341ge.bog.mobilebank.products.data;

import ed1.C40749p;
import kotlin.jvm.internal.C41535k;
import p341ge.bog.mobilebank.model.PensionResult;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$loadPensionAmount$1 */
/* synthetic */ class ProductsRepositoryImpl$loadPensionAmount$1 extends C41535k implements C43064a {
    ProductsRepositoryImpl$loadPensionAmount$1(Object obj) {
        super(0, obj, ProductsRepositoryImpl.class, "getPensionAmountObservable", "getPensionAmountObservable()Lio/reactivex/Observable;", 0);
    }

    public final C40749p<PensionResult> invoke() {
        return ((ProductsRepositoryImpl) this.receiver).getPensionAmountObservable();
    }
}
