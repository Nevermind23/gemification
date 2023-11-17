package p341ge.bog.mobilebank.products.data;

import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.mapper.ProductTypeApiModelMapper;
import p341ge.bog.mobilebank.products.data.model.ProductTypeApiModel;
import q70.C27686b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getProductTypesObservable$1 */
/* synthetic */ class ProductsRepositoryImpl$getProductTypesObservable$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getProductTypesObservable$1(Object obj) {
        super(1, obj, ProductTypeApiModelMapper.class, "convert", "transformProductTypes(Ljava/util/List;)Ljava/util/List;", 0);
    }

    public final List<C27686b> invoke(List<ProductTypeApiModel> list) {
        C41536l.m120489i(list, "p0");
        return ((ProductTypeApiModelMapper) this.receiver).transformProductTypes(list);
    }
}
