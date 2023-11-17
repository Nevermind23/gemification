package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CreditCardsWrapperApiModel */
public final class CreditCardsWrapperApiModel {
    private final List<BillInfoApiModel> billInfo;
    private final CardsContainerApiModel cardsContainer;
    private final List<CreditCardDetailApiModel> details;

    public CreditCardsWrapperApiModel(CardsContainerApiModel cardsContainerApiModel, List<BillInfoApiModel> list, List<CreditCardDetailApiModel> list2) {
        C41536l.m120489i(cardsContainerApiModel, "cardsContainer");
        C41536l.m120489i(list, "billInfo");
        C41536l.m120489i(list2, "details");
        this.cardsContainer = cardsContainerApiModel;
        this.billInfo = list;
        this.details = list2;
    }

    public static /* synthetic */ CreditCardsWrapperApiModel copy$default(CreditCardsWrapperApiModel creditCardsWrapperApiModel, CardsContainerApiModel cardsContainerApiModel, List<BillInfoApiModel> list, List<CreditCardDetailApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            cardsContainerApiModel = creditCardsWrapperApiModel.cardsContainer;
        }
        if ((i & 2) != 0) {
            list = creditCardsWrapperApiModel.billInfo;
        }
        if ((i & 4) != 0) {
            list2 = creditCardsWrapperApiModel.details;
        }
        return creditCardsWrapperApiModel.copy(cardsContainerApiModel, list, list2);
    }

    public final CardsContainerApiModel component1() {
        return this.cardsContainer;
    }

    public final List<BillInfoApiModel> component2() {
        return this.billInfo;
    }

    public final List<CreditCardDetailApiModel> component3() {
        return this.details;
    }

    public final CreditCardsWrapperApiModel copy(CardsContainerApiModel cardsContainerApiModel, List<BillInfoApiModel> list, List<CreditCardDetailApiModel> list2) {
        C41536l.m120489i(cardsContainerApiModel, "cardsContainer");
        C41536l.m120489i(list, "billInfo");
        C41536l.m120489i(list2, "details");
        return new CreditCardsWrapperApiModel(cardsContainerApiModel, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardsWrapperApiModel)) {
            return false;
        }
        CreditCardsWrapperApiModel creditCardsWrapperApiModel = (CreditCardsWrapperApiModel) obj;
        return C41536l.m120484d(this.cardsContainer, creditCardsWrapperApiModel.cardsContainer) && C41536l.m120484d(this.billInfo, creditCardsWrapperApiModel.billInfo) && C41536l.m120484d(this.details, creditCardsWrapperApiModel.details);
    }

    public final List<BillInfoApiModel> getBillInfo() {
        return this.billInfo;
    }

    public final CardsContainerApiModel getCardsContainer() {
        return this.cardsContainer;
    }

    public final List<CreditCardDetailApiModel> getDetails() {
        return this.details;
    }

    public int hashCode() {
        return (((this.cardsContainer.hashCode() * 31) + this.billInfo.hashCode()) * 31) + this.details.hashCode();
    }

    public String toString() {
        CardsContainerApiModel cardsContainerApiModel = this.cardsContainer;
        List<BillInfoApiModel> list = this.billInfo;
        List<CreditCardDetailApiModel> list2 = this.details;
        return "CreditCardsWrapperApiModel(cardsContainer=" + cardsContainerApiModel + ", billInfo=" + list + ", details=" + list2 + ")";
    }
}
