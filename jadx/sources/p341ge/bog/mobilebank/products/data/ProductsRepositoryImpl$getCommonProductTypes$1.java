package p341ge.bog.mobilebank.products.data;

import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.mapper.ProductTypeApiModelMapper;
import p341ge.bog.mobilebank.products.data.model.addproduct.CommonGetProductTypeApiModel;
import ue1.C43075l;
import xy0.C39944h;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getCommonProductTypes$1 */
/* synthetic */ class ProductsRepositoryImpl$getCommonProductTypes$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getCommonProductTypes$1(Object obj) {
        super(1, obj, ProductTypeApiModelMapper.class, "transform", "transformCommonProducts(Ljava/util/List;)Ljava/util/List;", 0);
    }

    public final List<C39944h> invoke(List<CommonGetProductTypeApiModel> list) {
        C41536l.m120489i(list, "p0");
        return ((ProductTypeApiModelMapper) this.receiver).transformCommonProducts(list);
    }
}
