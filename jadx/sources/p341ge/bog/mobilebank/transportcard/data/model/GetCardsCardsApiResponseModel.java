package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.GetCardsCardsApiResponseModel */
public final class GetCardsCardsApiResponseModel {
    private final List<CardApiModel> cards;

    public GetCardsCardsApiResponseModel(List<CardApiModel> list) {
        C41536l.m120489i(list, "cards");
        this.cards = list;
    }

    public static /* synthetic */ GetCardsCardsApiResponseModel copy$default(GetCardsCardsApiResponseModel getCardsCardsApiResponseModel, List<CardApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getCardsCardsApiResponseModel.cards;
        }
        return getCardsCardsApiResponseModel.copy(list);
    }

    public final List<CardApiModel> component1() {
        return this.cards;
    }

    public final GetCardsCardsApiResponseModel copy(List<CardApiModel> list) {
        C41536l.m120489i(list, "cards");
        return new GetCardsCardsApiResponseModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCardsCardsApiResponseModel) && C41536l.m120484d(this.cards, ((GetCardsCardsApiResponseModel) obj).cards);
    }

    public final List<CardApiModel> getCards() {
        return this.cards;
    }

    public int hashCode() {
        return this.cards.hashCode();
    }

    public String toString() {
        List<CardApiModel> list = this.cards;
        return "GetCardsCardsApiResponseModel(cards=" + list + ")";
    }
}
