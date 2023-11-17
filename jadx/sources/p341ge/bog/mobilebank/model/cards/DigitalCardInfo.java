package p341ge.bog.mobilebank.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.products.model.CardExtraDetailsUIModel;

/* renamed from: ge.bog.mobilebank.model.cards.DigitalCardInfo */
public final class DigitalCardInfo implements Parcelable {
    public static final Parcelable.Creator<DigitalCardInfo> CREATOR = new Creator();
    private final String cardHolder;
    private final String cardName;
    private final String cardSubProductCode;
    private final String cardValidThru;
    private final CardExtraDetailsUIModel details;
    private final String imageUrl;

    /* renamed from: ge.bog.mobilebank.model.cards.DigitalCardInfo$Creator */
    public static final class Creator implements Parcelable.Creator<DigitalCardInfo> {
        public final DigitalCardInfo createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DigitalCardInfo(CardExtraDetailsUIModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final DigitalCardInfo[] newArray(int i) {
            return new DigitalCardInfo[i];
        }
    }

    public DigitalCardInfo(CardExtraDetailsUIModel cardExtraDetailsUIModel, String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(cardExtraDetailsUIModel, "details");
        C41536l.m120489i(str, "cardName");
        C41536l.m120489i(str2, "cardHolder");
        C41536l.m120489i(str3, "cardValidThru");
        C41536l.m120489i(str4, "cardSubProductCode");
        this.details = cardExtraDetailsUIModel;
        this.cardName = str;
        this.cardHolder = str2;
        this.cardValidThru = str3;
        this.cardSubProductCode = str4;
        this.imageUrl = str5;
    }

    public static /* synthetic */ DigitalCardInfo copy$default(DigitalCardInfo digitalCardInfo, CardExtraDetailsUIModel cardExtraDetailsUIModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            cardExtraDetailsUIModel = digitalCardInfo.details;
        }
        if ((i & 2) != 0) {
            str = digitalCardInfo.cardName;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = digitalCardInfo.cardHolder;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = digitalCardInfo.cardValidThru;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = digitalCardInfo.cardSubProductCode;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = digitalCardInfo.imageUrl;
        }
        return digitalCardInfo.copy(cardExtraDetailsUIModel, str6, str7, str8, str9, str5);
    }

    public final CardExtraDetailsUIModel component1() {
        return this.details;
    }

    public final String component2() {
        return this.cardName;
    }

    public final String component3() {
        return this.cardHolder;
    }

    public final String component4() {
        return this.cardValidThru;
    }

    public final String component5() {
        return this.cardSubProductCode;
    }

    public final String component6() {
        return this.imageUrl;
    }

    public final DigitalCardInfo copy(CardExtraDetailsUIModel cardExtraDetailsUIModel, String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(cardExtraDetailsUIModel, "details");
        C41536l.m120489i(str, "cardName");
        C41536l.m120489i(str2, "cardHolder");
        C41536l.m120489i(str3, "cardValidThru");
        C41536l.m120489i(str4, "cardSubProductCode");
        return new DigitalCardInfo(cardExtraDetailsUIModel, str, str2, str3, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DigitalCardInfo)) {
            return false;
        }
        DigitalCardInfo digitalCardInfo = (DigitalCardInfo) obj;
        return C41536l.m120484d(this.details, digitalCardInfo.details) && C41536l.m120484d(this.cardName, digitalCardInfo.cardName) && C41536l.m120484d(this.cardHolder, digitalCardInfo.cardHolder) && C41536l.m120484d(this.cardValidThru, digitalCardInfo.cardValidThru) && C41536l.m120484d(this.cardSubProductCode, digitalCardInfo.cardSubProductCode) && C41536l.m120484d(this.imageUrl, digitalCardInfo.imageUrl);
    }

    public final String getCardHolder() {
        return this.cardHolder;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardSubProductCode() {
        return this.cardSubProductCode;
    }

    public final String getCardValidThru() {
        return this.cardValidThru;
    }

    public final CardExtraDetailsUIModel getDetails() {
        return this.details;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int hashCode = ((((((((this.details.hashCode() * 31) + this.cardName.hashCode()) * 31) + this.cardHolder.hashCode()) * 31) + this.cardValidThru.hashCode()) * 31) + this.cardSubProductCode.hashCode()) * 31;
        String str = this.imageUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        CardExtraDetailsUIModel cardExtraDetailsUIModel = this.details;
        String str = this.cardName;
        String str2 = this.cardHolder;
        String str3 = this.cardValidThru;
        String str4 = this.cardSubProductCode;
        String str5 = this.imageUrl;
        return "DigitalCardInfo(details=" + cardExtraDetailsUIModel + ", cardName=" + str + ", cardHolder=" + str2 + ", cardValidThru=" + str3 + ", cardSubProductCode=" + str4 + ", imageUrl=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.details.writeToParcel(parcel, i);
        parcel.writeString(this.cardName);
        parcel.writeString(this.cardHolder);
        parcel.writeString(this.cardValidThru);
        parcel.writeString(this.cardSubProductCode);
        parcel.writeString(this.imageUrl);
    }
}
