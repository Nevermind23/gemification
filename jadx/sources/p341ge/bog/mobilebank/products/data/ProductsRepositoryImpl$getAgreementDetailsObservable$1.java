package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.mapper.BondsWrapperApiModelMapper;
import p341ge.bog.mobilebank.products.data.model.BondsWrapperApiModel;
import ue1.C43075l;
import xy0.C39941e;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getAgreementDetailsObservable$1 */
/* synthetic */ class ProductsRepositoryImpl$getAgreementDetailsObservable$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getAgreementDetailsObservable$1(Object obj) {
        super(1, obj, BondsWrapperApiModelMapper.class, "convert", "convert(Lge/bog/mobilebank/products/data/model/BondsWrapperApiModel;)Lge/bog/mobilebank/products/domain/model/BondsWrapper;", 0);
    }

    public final C39941e invoke(BondsWrapperApiModel bondsWrapperApiModel) {
        C41536l.m120489i(bondsWrapperApiModel, "p0");
        return ((BondsWrapperApiModelMapper) this.receiver).convert(bondsWrapperApiModel);
    }
}
