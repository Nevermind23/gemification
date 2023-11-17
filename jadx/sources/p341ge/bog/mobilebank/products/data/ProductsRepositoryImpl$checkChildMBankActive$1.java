package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.mapper.ChildMBankMapper;
import p341ge.bog.mobilebank.products.data.model.CheckChildMBankActiveApiModel;
import p341ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$checkChildMBankActive$1 */
/* synthetic */ class ProductsRepositoryImpl$checkChildMBankActive$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$checkChildMBankActive$1(Object obj) {
        super(1, obj, ChildMBankMapper.class, "convert", "convert(Lge/bog/mobilebank/products/data/model/CheckChildMBankActiveApiModel;)Lge/bog/mobilebank/products/domain/model/CheckChildMBankActiveModel;", 0);
    }

    public final CheckChildMBankActiveModel invoke(CheckChildMBankActiveApiModel checkChildMBankActiveApiModel) {
        C41536l.m120489i(checkChildMBankActiveApiModel, "p0");
        return ((ChildMBankMapper) this.receiver).convert(checkChildMBankActiveApiModel);
    }
}
