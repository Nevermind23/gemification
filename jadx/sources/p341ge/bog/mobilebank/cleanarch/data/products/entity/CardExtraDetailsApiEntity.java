package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.CardExtraDetailsApiEntity */
public final class CardExtraDetailsApiEntity {
    private final String cardCVC2;
    private final String cardNumber;

    public CardExtraDetailsApiEntity(String str, String str2) {
        C41536l.m120489i(str, "cardCVC2");
        C41536l.m120489i(str2, "cardNumber");
        this.cardCVC2 = str;
        this.cardNumber = str2;
    }

    public static /* synthetic */ CardExtraDetailsApiEntity copy$default(CardExtraDetailsApiEntity cardExtraDetailsApiEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardExtraDetailsApiEntity.cardCVC2;
        }
        if ((i & 2) != 0) {
            str2 = cardExtraDetailsApiEntity.cardNumber;
        }
        return cardExtraDetailsApiEntity.copy(str, str2);
    }

    public final String component1() {
        return this.cardCVC2;
    }

    public final String component2() {
        return this.cardNumber;
    }

    public final CardExtraDetailsApiEntity copy(String str, String str2) {
        C41536l.m120489i(str, "cardCVC2");
        C41536l.m120489i(str2, "cardNumber");
        return new CardExtraDetailsApiEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardExtraDetailsApiEntity)) {
            return false;
        }
        CardExtraDetailsApiEntity cardExtraDetailsApiEntity = (CardExtraDetailsApiEntity) obj;
        return C41536l.m120484d(this.cardCVC2, cardExtraDetailsApiEntity.cardCVC2) && C41536l.m120484d(this.cardNumber, cardExtraDetailsApiEntity.cardNumber);
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
        return "CardExtraDetailsApiEntity(cardCVC2=" + str + ", cardNumber=" + str2 + ")";
    }
}
