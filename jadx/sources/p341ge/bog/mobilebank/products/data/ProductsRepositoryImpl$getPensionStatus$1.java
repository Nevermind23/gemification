package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.mapper.PensionApiModelMapper;
import p341ge.bog.mobilebank.products.data.model.PensionStatusApiModel;
import ue1.C43075l;
import xy0.C39961y;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getPensionStatus$1 */
/* synthetic */ class ProductsRepositoryImpl$getPensionStatus$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getPensionStatus$1(Object obj) {
        super(1, obj, PensionApiModelMapper.class, "convert", "convert(Lge/bog/mobilebank/products/data/model/PensionStatusApiModel;)Lge/bog/mobilebank/products/domain/model/PensionStatus;", 0);
    }

    public final C39961y invoke(PensionStatusApiModel pensionStatusApiModel) {
        C41536l.m120489i(pensionStatusApiModel, "p0");
        return ((PensionApiModelMapper) this.receiver).convert(pensionStatusApiModel);
    }
}
