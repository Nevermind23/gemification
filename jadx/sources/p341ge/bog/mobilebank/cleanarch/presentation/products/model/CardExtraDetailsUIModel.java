package p341ge.bog.mobilebank.cleanarch.presentation.products.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.presentation.products.model.CardExtraDetailsUIModel */
public final class CardExtraDetailsUIModel implements Parcelable {
    public static final Parcelable.Creator<CardExtraDetailsUIModel> CREATOR = new C22290a();
    private final String cardCVC2;
    private final String cardNumber;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.products.model.CardExtraDetailsUIModel$a */
    public static final class C22290a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardExtraDetailsUIModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardExtraDetailsUIModel(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CardExtraDetailsUIModel[] newArray(int i) {
            return new CardExtraDetailsUIModel[i];
        }
    }

    public CardExtraDetailsUIModel(String str, String str2) {
        C41536l.m120489i(str, "cardCVC2");
        C41536l.m120489i(str2, "cardNumber");
        this.cardCVC2 = str;
        this.cardNumber = str2;
    }

    public static /* synthetic */ CardExtraDetailsUIModel copy$default(CardExtraDetailsUIModel cardExtraDetailsUIModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardExtraDetailsUIModel.cardCVC2;
        }
        if ((i & 2) != 0) {
            str2 = cardExtraDetailsUIModel.cardNumber;
        }
        return cardExtraDetailsUIModel.copy(str, str2);
    }

    public final String component1() {
        return this.cardCVC2;
    }

    public final String component2() {
        return this.cardNumber;
    }

    public final CardExtraDetailsUIModel copy(String str, String str2) {
        C41536l.m120489i(str, "cardCVC2");
        C41536l.m120489i(str2, "cardNumber");
        return new CardExtraDetailsUIModel(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardExtraDetailsUIModel)) {
            return false;
        }
        CardExtraDetailsUIModel cardExtraDetailsUIModel = (CardExtraDetailsUIModel) obj;
        return C41536l.m120484d(this.cardCVC2, cardExtraDetailsUIModel.cardCVC2) && C41536l.m120484d(this.cardNumber, cardExtraDetailsUIModel.cardNumber);
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
        return "CardExtraDetailsUIModel(cardCVC2=" + str + ", cardNumber=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.cardCVC2);
        parcel.writeString(this.cardNumber);
    }
}
