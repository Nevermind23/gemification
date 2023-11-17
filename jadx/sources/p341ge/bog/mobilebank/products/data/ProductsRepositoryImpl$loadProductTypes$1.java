package p341ge.bog.mobilebank.products.data;

import ed1.C40749p;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import q70.C27686b;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$loadProductTypes$1 */
/* synthetic */ class ProductsRepositoryImpl$loadProductTypes$1 extends C41535k implements C43064a {
    ProductsRepositoryImpl$loadProductTypes$1(Object obj) {
        super(0, obj, ProductsRepositoryImpl.class, "getProductTypesObservable", "getProductTypesObservable()Lio/reactivex/Observable;", 0);
    }

    public final C40749p<List<C27686b>> invoke() {
        return ((ProductsRepositoryImpl) this.receiver).getProductTypesObservable();
    }
}
