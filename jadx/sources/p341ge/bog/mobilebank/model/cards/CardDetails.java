package p341ge.bog.mobilebank.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.model.cards.CardDetails */
public final class CardDetails implements Parcelable {
    public static final Parcelable.Creator<CardDetails> CREATOR = new Creator();
    private final String cardCVC2;
    private final String cardNumber;

    /* renamed from: ge.bog.mobilebank.model.cards.CardDetails$Creator */
    public static final class Creator implements Parcelable.Creator<CardDetails> {
        public final CardDetails createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardDetails(parcel.readString(), parcel.readString());
        }

        public final CardDetails[] newArray(int i) {
            return new CardDetails[i];
        }
    }

    public CardDetails(String str, String str2) {
        C41536l.m120489i(str, "cardCVC2");
        C41536l.m120489i(str2, "cardNumber");
        this.cardCVC2 = str;
        this.cardNumber = str2;
    }

    public static /* synthetic */ CardDetails copy$default(CardDetails cardDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardDetails.cardCVC2;
        }
        if ((i & 2) != 0) {
            str2 = cardDetails.cardNumber;
        }
        return cardDetails.copy(str, str2);
    }

    public final String component1() {
        return this.cardCVC2;
    }

    public final String component2() {
        return this.cardNumber;
    }

    public final CardDetails copy(String str, String str2) {
        C41536l.m120489i(str, "cardCVC2");
        C41536l.m120489i(str2, "cardNumber");
        return new CardDetails(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDetails)) {
            return false;
        }
        CardDetails cardDetails = (CardDetails) obj;
        return C41536l.m120484d(this.cardCVC2, cardDetails.cardCVC2) && C41536l.m120484d(this.cardNumber, cardDetails.cardNumber);
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
        return "CardDetails(cardCVC2=" + str + ", cardNumber=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.cardCVC2);
        parcel.writeString(this.cardNumber);
    }
}
