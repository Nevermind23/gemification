package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import m70.C26156i;
import p341ge.bog.mobilebank.products.data.mapper.AccountsApiModelMapper;
import p341ge.bog.mobilebank.products.data.model.AccountsAndDetailsApiModel;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getAccountDetailsObservable$1 */
/* synthetic */ class ProductsRepositoryImpl$getAccountDetailsObservable$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getAccountDetailsObservable$1(Object obj) {
        super(1, obj, AccountsApiModelMapper.class, "convert", "convert(Lge/bog/mobilebank/products/data/model/AccountsAndDetailsApiModel;)Lge/bog/mobilebank/cleanarch/shareddomain/model/account/AccountsAndDetailsModel;", 0);
    }

    public final C26156i invoke(AccountsAndDetailsApiModel accountsAndDetailsApiModel) {
        C41536l.m120489i(accountsAndDetailsApiModel, "p0");
        return ((AccountsApiModelMapper) this.receiver).convert(accountsAndDetailsApiModel);
    }
}
