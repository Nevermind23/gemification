package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.mapper.ContractApiModelMapper;
import p341ge.bog.mobilebank.products.data.model.ContractApiModel;
import ue1.C43075l;
import xy0.C39945i;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getContract$2 */
/* synthetic */ class ProductsRepositoryImpl$getContract$2 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getContract$2(Object obj) {
        super(1, obj, ContractApiModelMapper.class, "convert", "convert(Lge/bog/mobilebank/products/data/model/ContractApiModel;)Lge/bog/mobilebank/products/domain/model/Contract;", 0);
    }

    public final C39945i invoke(ContractApiModel contractApiModel) {
        C41536l.m120489i(contractApiModel, "p0");
        return ((ContractApiModelMapper) this.receiver).convert(contractApiModel);
    }
}
