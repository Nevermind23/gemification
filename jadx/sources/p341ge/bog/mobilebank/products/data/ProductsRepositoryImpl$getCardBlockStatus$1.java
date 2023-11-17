package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import o70.C26762a;
import p341ge.bog.mobilebank.products.data.mapper.CardsAndDetailsApiModelMapper;
import p341ge.bog.mobilebank.products.data.model.CardBlockStatusApiModel;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getCardBlockStatus$1 */
/* synthetic */ class ProductsRepositoryImpl$getCardBlockStatus$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getCardBlockStatus$1(Object obj) {
        super(1, obj, CardsAndDetailsApiModelMapper.class, "convert", "convert(Lge/bog/mobilebank/products/data/model/CardBlockStatusApiModel;)Lge/bog/mobilebank/cleanarch/shareddomain/model/cards/CardBlockStatusModel;", 0);
    }

    public final C26762a invoke(CardBlockStatusApiModel cardBlockStatusApiModel) {
        C41536l.m120489i(cardBlockStatusApiModel, "p0");
        return ((CardsAndDetailsApiModelMapper) this.receiver).convert(cardBlockStatusApiModel);
    }
}
