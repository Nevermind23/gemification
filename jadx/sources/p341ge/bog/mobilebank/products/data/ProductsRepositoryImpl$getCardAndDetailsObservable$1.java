package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import o70.C26766e;
import p341ge.bog.mobilebank.products.data.mapper.CardsAndDetailsApiModelMapper;
import p341ge.bog.mobilebank.products.data.model.CardsAndDetailsApiModel;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getCardAndDetailsObservable$1 */
/* synthetic */ class ProductsRepositoryImpl$getCardAndDetailsObservable$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getCardAndDetailsObservable$1(Object obj) {
        super(1, obj, CardsAndDetailsApiModelMapper.class, "convert", "convert(Lge/bog/mobilebank/products/data/model/CardsAndDetailsApiModel;)Lge/bog/mobilebank/cleanarch/shareddomain/model/cards/CardsAndDetailsModel;", 0);
    }

    public final C26766e invoke(CardsAndDetailsApiModel cardsAndDetailsApiModel) {
        C41536l.m120489i(cardsAndDetailsApiModel, "p0");
        return ((CardsAndDetailsApiModelMapper) this.receiver).convert(cardsAndDetailsApiModel);
    }
}
