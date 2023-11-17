package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CardExtraDetailsApiModel */
public final class CardExtraDetailsApiModel {
    private final String cardCVC2;
    private final String cardNumber;

    public CardExtraDetailsApiModel(String str, String str2) {
        C41536l.m120489i(str, "cardCVC2");
        C41536l.m120489i(str2, "cardNumber");
        this.cardCVC2 = str;
        this.cardNumber = str2;
    }

    public static /* synthetic */ CardExtraDetailsApiModel copy$default(CardExtraDetailsApiModel cardExtraDetailsApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardExtraDetailsApiModel.cardCVC2;
        }
        if ((i & 2) != 0) {
            str2 = cardExtraDetailsApiModel.cardNumber;
        }
        return cardExtraDetailsApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.cardCVC2;
    }

    public final String component2() {
        return this.cardNumber;
    }

    public final CardExtraDetailsApiModel copy(String str, String str2) {
        C41536l.m120489i(str, "cardCVC2");
        C41536l.m120489i(str2, "cardNumber");
        return new CardExtraDetailsApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardExtraDetailsApiModel)) {
            return false;
        }
        CardExtraDetailsApiModel cardExtraDetailsApiModel = (CardExtraDetailsApiModel) obj;
        return C41536l.m120484d(this.cardCVC2, cardExtraDetailsApiModel.cardCVC2) && C41536l.m120484d(this.cardNumber, cardExtraDetailsApiModel.cardNumber);
    }

    public final String getCardCVC2() {
        return this.cardCVC2;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public int hashCode() {
        return (this.cardCVC2.hashCode() * 31) + this.cardNumber.hashCode();
    }

    public String toString() {
        String str = this.cardCVC2;
        String str2 = this.cardNumber;
        return "CardExtraDetailsApiModel(cardCVC2=" + str + ", cardNumber=" + str2 + ")";
    }
}
