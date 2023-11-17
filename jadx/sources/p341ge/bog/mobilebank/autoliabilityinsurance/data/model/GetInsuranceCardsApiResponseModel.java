package p341ge.bog.mobilebank.autoliabilityinsurance.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.data.model.GetInsuranceCardsApiResponseModel */
public final class GetInsuranceCardsApiResponseModel {
    private final List<InsuranceCardApiModel> cards;

    public GetInsuranceCardsApiResponseModel(List<InsuranceCardApiModel> list) {
        C41536l.m120489i(list, "cards");
        this.cards = list;
    }

    public static /* synthetic */ GetInsuranceCardsApiResponseModel copy$default(GetInsuranceCardsApiResponseModel getInsuranceCardsApiResponseModel, List<InsuranceCardApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getInsuranceCardsApiResponseModel.cards;
        }
        return getInsuranceCardsApiResponseModel.copy(list);
    }

    public final List<InsuranceCardApiModel> component1() {
        return this.cards;
    }

    public final GetInsuranceCardsApiResponseModel copy(List<InsuranceCardApiModel> list) {
        C41536l.m120489i(list, "cards");
        return new GetInsuranceCardsApiResponseModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetInsuranceCardsApiResponseModel) && C41536l.m120484d(this.cards, ((GetInsuranceCardsApiResponseModel) obj).cards);
    }

    public final List<InsuranceCardApiModel> getCards() {
        return this.cards;
    }

    public int hashCode() {
        return this.cards.hashCode();
    }

    public String toString() {
        List<InsuranceCardApiModel> list = this.cards;
        return "GetInsuranceCardsApiResponseModel(cards=" + list + ")";
    }
}
