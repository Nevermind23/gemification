package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.PaymentCommissionApiModel */
public final class PaymentCommissionApiModel {
    private final String clientsAmountIsOverLimit;
    private final BigDecimal commission;
    private final String infoDictionaryKey;
    private final String limitType;
    private final BigDecimal oldCommission;
    private final String randomString;

    public PaymentCommissionApiModel(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, String str4) {
        C41536l.m120489i(bigDecimal, "commission");
        this.commission = bigDecimal;
        this.oldCommission = bigDecimal2;
        this.limitType = str;
        this.infoDictionaryKey = str2;
        this.clientsAmountIsOverLimit = str3;
        this.randomString = str4;
    }

    public static /* synthetic */ PaymentCommissionApiModel copy$default(PaymentCommissionApiModel paymentCommissionApiModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = paymentCommissionApiModel.commission;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = paymentCommissionApiModel.oldCommission;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        if ((i & 4) != 0) {
            str = paymentCommissionApiModel.limitType;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = paymentCommissionApiModel.infoDictionaryKey;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = paymentCommissionApiModel.clientsAmountIsOverLimit;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = paymentCommissionApiModel.randomString;
        }
        return paymentCommissionApiModel.copy(bigDecimal, bigDecimal3, str5, str6, str7, str4);
    }

    public final BigDecimal component1() {
        return this.commission;
    }

    public final BigDecimal component2() {
        return this.oldCommission;
    }

    public final String component3() {
        return this.limitType;
    }

    public final String component4() {
        return this.infoDictionaryKey;
    }

    public final String component5() {
        return this.clientsAmountIsOverLimit;
    }

    public final String component6() {
        return this.randomString;
    }

    public final PaymentCommissionApiModel copy(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, String str4) {
        C41536l.m120489i(bigDecimal, "commission");
        return new PaymentCommissionApiModel(bigDecimal, bigDecimal2, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCommissionApiModel)) {
            return false;
        }
        PaymentCommissionApiModel paymentCommissionApiModel = (PaymentCommissionApiModel) obj;
        return C41536l.m120484d(this.commission, paymentCommissionApiModel.commission) && C41536l.m120484d(this.oldCommission, paymentCommissionApiModel.oldCommission) && C41536l.m120484d(this.limitType, paymentCommissionApiModel.limitType) && C41536l.m120484d(this.infoDictionaryKey, paymentCommissionApiModel.infoDictionaryKey) && C41536l.m120484d(this.clientsAmountIsOverLimit, paymentCommissionApiModel.clientsAmountIsOverLimit) && C41536l.m120484d(this.randomString, paymentCommissionApiModel.randomString);
    }

    public final String getClientsAmountIsOverLimit() {
        return this.clientsAmountIsOverLimit;
    }

    public final BigDecimal getCommission() {
        return this.commission;
    }

    public final String getInfoDictionaryKey() {
        return this.infoDictionaryKey;
    }

    public final String getLimitType() {
        return this.limitType;
    }

    public final BigDecimal getOldCommission() {
        return this.oldCommission;
    }

    public final String getRandomString() {
        return this.randomString;
    }

    public int hashCode() {
        int hashCode = this.commission.hashCode() * 31;
        BigDecimal bigDecimal = this.oldCommission;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.limitType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.infoDictionaryKey;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientsAmountIsOverLimit;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.randomString;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.commission;
        BigDecimal bigDecimal2 = this.oldCommission;
        String str = this.limitType;
        String str2 = this.infoDictionaryKey;
        String str3 = this.clientsAmountIsOverLimit;
        String str4 = this.randomString;
        return "PaymentCommissionApiModel(commission=" + bigDecimal + ", oldCommission=" + bigDecimal2 + ", limitType=" + str + ", infoDictionaryKey=" + str2 + ", clientsAmountIsOverLimit=" + str3 + ", randomString=" + str4 + ")";
    }
}
