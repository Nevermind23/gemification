package p341ge.bog.mobilebank.cleanarch.domain.creditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p913uu.C28942h;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.domain.creditapplication.model.CreditCardOfferLimit */
public final class CreditCardOfferLimit implements Parcelable {
    public static final Parcelable.Creator<CreditCardOfferLimit> CREATOR = new C20996a();
    private final String cardCcy;
    private final BigDecimal cardLimit;
    private final OfferProductCode limitCategory;
    private final C28942h operationType;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.creditapplication.model.CreditCardOfferLimit$a */
    public static final class C20996a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditCardOfferLimit createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CreditCardOfferLimit(C28942h.valueOf(parcel.readString()), parcel.readString(), (OfferProductCode) parcel.readParcelable(CreditCardOfferLimit.class.getClassLoader()), (BigDecimal) parcel.readSerializable());
        }

        /* renamed from: b */
        public final CreditCardOfferLimit[] newArray(int i) {
            return new CreditCardOfferLimit[i];
        }
    }

    public CreditCardOfferLimit(C28942h hVar, String str, OfferProductCode offerProductCode, BigDecimal bigDecimal) {
        C41536l.m120489i(hVar, "operationType");
        C41536l.m120489i(str, "cardCcy");
        C41536l.m120489i(offerProductCode, "limitCategory");
        C41536l.m120489i(bigDecimal, "cardLimit");
        this.operationType = hVar;
        this.cardCcy = str;
        this.limitCategory = offerProductCode;
        this.cardLimit = bigDecimal;
    }

    public static /* synthetic */ CreditCardOfferLimit copy$default(CreditCardOfferLimit creditCardOfferLimit, C28942h hVar, String str, OfferProductCode offerProductCode, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = creditCardOfferLimit.operationType;
        }
        if ((i & 2) != 0) {
            str = creditCardOfferLimit.cardCcy;
        }
        if ((i & 4) != 0) {
            offerProductCode = creditCardOfferLimit.limitCategory;
        }
        if ((i & 8) != 0) {
            bigDecimal = creditCardOfferLimit.cardLimit;
        }
        return creditCardOfferLimit.copy(hVar, str, offerProductCode, bigDecimal);
    }

    public final C28942h component1() {
        return this.operationType;
    }

    public final String component2() {
        return this.cardCcy;
    }

    public final OfferProductCode component3() {
        return this.limitCategory;
    }

    public final BigDecimal component4() {
        return this.cardLimit;
    }

    public final CreditCardOfferLimit copy(C28942h hVar, String str, OfferProductCode offerProductCode, BigDecimal bigDecimal) {
        C41536l.m120489i(hVar, "operationType");
        C41536l.m120489i(str, "cardCcy");
        C41536l.m120489i(offerProductCode, "limitCategory");
        C41536l.m120489i(bigDecimal, "cardLimit");
        return new CreditCardOfferLimit(hVar, str, offerProductCode, bigDecimal);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardOfferLimit)) {
            return false;
        }
        CreditCardOfferLimit creditCardOfferLimit = (CreditCardOfferLimit) obj;
        return this.operationType == creditCardOfferLimit.operationType && C41536l.m120484d(this.cardCcy, creditCardOfferLimit.cardCcy) && C41536l.m120484d(this.limitCategory, creditCardOfferLimit.limitCategory) && C41536l.m120484d(this.cardLimit, creditCardOfferLimit.cardLimit);
    }

    public final String getCardCcy() {
        return this.cardCcy;
    }

    public final BigDecimal getCardLimit() {
        return this.cardLimit;
    }

    public final OfferProductCode getLimitCategory() {
        return this.limitCategory;
    }

    public final C28942h getOperationType() {
        return this.operationType;
    }

    public int hashCode() {
        return (((((this.operationType.hashCode() * 31) + this.cardCcy.hashCode()) * 31) + this.limitCategory.hashCode()) * 31) + this.cardLimit.hashCode();
    }

    public String toString() {
        C28942h hVar = this.operationType;
        String str = this.cardCcy;
        OfferProductCode offerProductCode = this.limitCategory;
        BigDecimal bigDecimal = this.cardLimit;
        return "CreditCardOfferLimit(operationType=" + hVar + ", cardCcy=" + str + ", limitCategory=" + offerProductCode + ", cardLimit=" + bigDecimal + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.operationType.name());
        parcel.writeString(this.cardCcy);
        parcel.writeParcelable(this.limitCategory, i);
        parcel.writeSerializable(this.cardLimit);
    }
}
