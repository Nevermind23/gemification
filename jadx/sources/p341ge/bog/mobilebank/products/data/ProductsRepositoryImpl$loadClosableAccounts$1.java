package p341ge.bog.mobilebank.products.data;

import ed1.C40749p;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import m70.C26157j;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$loadClosableAccounts$1 */
/* synthetic */ class ProductsRepositoryImpl$loadClosableAccounts$1 extends C41535k implements C43064a {
    ProductsRepositoryImpl$loadClosableAccounts$1(Object obj) {
        super(0, obj, ProductsRepositoryImpl.class, "getClosableAccountsObservable", "getClosableAccountsObservable()Lio/reactivex/Observable;", 0);
    }

    public final C40749p<List<C26157j>> invoke() {
        return ((ProductsRepositoryImpl) this.receiver).getClosableAccountsObservable();
    }
}
