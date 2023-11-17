package p341ge.bog.mobilebank.products.data;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m70.C26157j;
import p341ge.bog.mobilebank.products.data.model.ClosableAccountEntity;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getClosableAccountsObservable$1 */
final class ProductsRepositoryImpl$getClosableAccountsObservable$1 extends C41537m implements C43075l {
    final /* synthetic */ ProductsRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductsRepositoryImpl$getClosableAccountsObservable$1(ProductsRepositoryImpl productsRepositoryImpl) {
        super(1);
        this.this$0 = productsRepositoryImpl;
    }

    public final List<C26157j> invoke(List<ClosableAccountEntity> list) {
        C41536l.m120489i(list, "it");
        return this.this$0.accountsMapper.convert(list);
    }
}
