package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import o70.C26764c;
import p341ge.bog.mobilebank.products.data.model.CardExtraDetailsApiModel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getCardExtraDetails$1 */
final class ProductsRepositoryImpl$getCardExtraDetails$1 extends C41537m implements C43075l {
    final /* synthetic */ ProductsRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductsRepositoryImpl$getCardExtraDetails$1(ProductsRepositoryImpl productsRepositoryImpl) {
        super(1);
        this.this$0 = productsRepositoryImpl;
    }

    public final C26764c invoke(BankApiResponse<CardExtraDetailsApiModel> bankApiResponse) {
        C41536l.m120489i(bankApiResponse, "it");
        CardExtraDetailsApiModel result = bankApiResponse.getResult();
        if (result != null) {
            return this.this$0.cardsAndDetailsApiModelMapper.convert(result);
        }
        throw new IllegalArgumentException("getCardExtraDetails result shouldn't be null".toString());
    }
}
