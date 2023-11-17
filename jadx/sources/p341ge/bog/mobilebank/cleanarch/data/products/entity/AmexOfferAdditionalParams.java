package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AmexOfferAdditionalParams */
public final class AmexOfferAdditionalParams {
    private final Boolean isPayroll;
    private final String product;
    private final String subProductCode;

    public AmexOfferAdditionalParams(Boolean bool, String str, String str2) {
        this.isPayroll = bool;
        this.product = str;
        this.subProductCode = str2;
    }

    public static /* synthetic */ AmexOfferAdditionalParams copy$default(AmexOfferAdditionalParams amexOfferAdditionalParams, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = amexOfferAdditionalParams.isPayroll;
        }
        if ((i & 2) != 0) {
            str = amexOfferAdditionalParams.product;
        }
        if ((i & 4) != 0) {
            str2 = amexOfferAdditionalParams.subProductCode;
        }
        return amexOfferAdditionalParams.copy(bool, str, str2);
    }

    public final Boolean component1() {
        return this.isPayroll;
    }

    public final String component2() {
        return this.product;
    }

    public final String component3() {
        return this.subProductCode;
    }

    public final AmexOfferAdditionalParams copy(Boolean bool, String str, String str2) {
        return new AmexOfferAdditionalParams(bool, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmexOfferAdditionalParams)) {
            return false;
        }
        AmexOfferAdditionalParams amexOfferAdditionalParams = (AmexOfferAdditionalParams) obj;
        return C41536l.m120484d(this.isPayroll, amexOfferAdditionalParams.isPayroll) && C41536l.m120484d(this.product, amexOfferAdditionalParams.product) && C41536l.m120484d(this.subProductCode, amexOfferAdditionalParams.subProductCode);
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        Boolean bool = this.isPayroll;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.product;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subProductCode;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final Boolean isPayroll() {
        return this.isPayroll;
    }

    public String toString() {
        Boolean bool = this.isPayroll;
        String str = this.product;
        String str2 = this.subProductCode;
        return "AmexOfferAdditionalParams(isPayroll=" + bool + ", product=" + str + ", subProductCode=" + str2 + ")";
    }
}
