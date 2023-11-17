package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.products.data.mapper.PensionApiModelMapper;
import ue1.C43075l;
import xy0.C39960x;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getPensionAmount$1 */
/* synthetic */ class ProductsRepositoryImpl$getPensionAmount$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getPensionAmount$1(Object obj) {
        super(1, obj, PensionApiModelMapper.class, "convert", "convert(Lge/bog/mobilebank/model/PensionResult;)Lge/bog/mobilebank/products/domain/model/PensionAmount;", 0);
    }

    public final C39960x invoke(PensionResult pensionResult) {
        C41536l.m120489i(pensionResult, "p0");
        return ((PensionApiModelMapper) this.receiver).convert(pensionResult);
    }
}
