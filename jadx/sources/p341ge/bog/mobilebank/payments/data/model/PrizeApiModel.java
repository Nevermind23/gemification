package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.PrizeApiModel */
public final class PrizeApiModel {
    private final BigDecimal amount;
    private final String campaignCode;
    private final String ccy;

    public PrizeApiModel(BigDecimal bigDecimal, String str, String str2) {
        this.amount = bigDecimal;
        this.ccy = str;
        this.campaignCode = str2;
    }

    public static /* synthetic */ PrizeApiModel copy$default(PrizeApiModel prizeApiModel, BigDecimal bigDecimal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = prizeApiModel.amount;
        }
        if ((i & 2) != 0) {
            str = prizeApiModel.ccy;
        }
        if ((i & 4) != 0) {
            str2 = prizeApiModel.campaignCode;
        }
        return prizeApiModel.copy(bigDecimal, str, str2);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.ccy;
    }

    public final String component3() {
        return this.campaignCode;
    }

    public final PrizeApiModel copy(BigDecimal bigDecimal, String str, String str2) {
        return new PrizeApiModel(bigDecimal, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrizeApiModel)) {
            return false;
        }
        PrizeApiModel prizeApiModel = (PrizeApiModel) obj;
        return C41536l.m120484d(this.amount, prizeApiModel.amount) && C41536l.m120484d(this.ccy, prizeApiModel.ccy) && C41536l.m120484d(this.campaignCode, prizeApiModel.campaignCode);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCampaignCode() {
        return this.campaignCode;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.ccy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.campaignCode;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.ccy;
        String str2 = this.campaignCode;
        return "PrizeApiModel(amount=" + bigDecimal + ", ccy=" + str + ", campaignCode=" + str2 + ")";
    }
}
