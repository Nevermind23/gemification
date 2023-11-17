package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.OfferExpirationApiModel */
public final class OfferExpirationApiModel {
    private final String afterPurchaseDays;
    private final Long fixedDate;

    public OfferExpirationApiModel(String str, Long l) {
        this.afterPurchaseDays = str;
        this.fixedDate = l;
    }

    public static /* synthetic */ OfferExpirationApiModel copy$default(OfferExpirationApiModel offerExpirationApiModel, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerExpirationApiModel.afterPurchaseDays;
        }
        if ((i & 2) != 0) {
            l = offerExpirationApiModel.fixedDate;
        }
        return offerExpirationApiModel.copy(str, l);
    }

    public final String component1() {
        return this.afterPurchaseDays;
    }

    public final Long component2() {
        return this.fixedDate;
    }

    public final OfferExpirationApiModel copy(String str, Long l) {
        return new OfferExpirationApiModel(str, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferExpirationApiModel)) {
            return false;
        }
        OfferExpirationApiModel offerExpirationApiModel = (OfferExpirationApiModel) obj;
        return C41536l.m120484d(this.afterPurchaseDays, offerExpirationApiModel.afterPurchaseDays) && C41536l.m120484d(this.fixedDate, offerExpirationApiModel.fixedDate);
    }

    public final String getAfterPurchaseDays() {
        return this.afterPurchaseDays;
    }

    public final Long getFixedDate() {
        return this.fixedDate;
    }

    public int hashCode() {
        String str = this.afterPurchaseDays;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.fixedDate;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.afterPurchaseDays;
        Long l = this.fixedDate;
        return "OfferExpirationApiModel(afterPurchaseDays=" + str + ", fixedDate=" + l + ")";
    }
}
