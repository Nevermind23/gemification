package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import n70.C26374a;
import p341ge.bog.mobilebank.products.data.model.DeactivationAccountEntity;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$deactivateAccount$1 */
final class ProductsRepositoryImpl$deactivateAccount$1 extends C41537m implements C43075l {
    final /* synthetic */ ProductsRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductsRepositoryImpl$deactivateAccount$1(ProductsRepositoryImpl productsRepositoryImpl) {
        super(1);
        this.this$0 = productsRepositoryImpl;
    }

    public final C26374a invoke(DeactivationAccountEntity deactivationAccountEntity) {
        C41536l.m120489i(deactivationAccountEntity, "it");
        return this.this$0.accountsMapper.convert(deactivationAccountEntity);
    }
}
