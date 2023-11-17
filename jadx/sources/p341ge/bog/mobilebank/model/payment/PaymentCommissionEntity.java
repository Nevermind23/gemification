package p341ge.bog.mobilebank.model.payment;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.model.payment.PaymentCommissionEntity */
public final class PaymentCommissionEntity {
    private final boolean clientsAmountIsOverLimit;
    private final int commission;
    private final String infoDictionaryKey;
    private final String limitType;
    private final int oldCommission;

    public PaymentCommissionEntity(int i, int i2, String str, boolean z, String str2) {
        C41536l.m120489i(str, "limitType");
        this.commission = i;
        this.oldCommission = i2;
        this.limitType = str;
        this.clientsAmountIsOverLimit = z;
        this.infoDictionaryKey = str2;
    }

    public static /* synthetic */ PaymentCommissionEntity copy$default(PaymentCommissionEntity paymentCommissionEntity, int i, int i2, String str, boolean z, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = paymentCommissionEntity.commission;
        }
        if ((i3 & 2) != 0) {
            i2 = paymentCommissionEntity.oldCommission;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = paymentCommissionEntity.limitType;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            z = paymentCommissionEntity.clientsAmountIsOverLimit;
        }
        boolean z2 = z;
        if ((i3 & 16) != 0) {
            str2 = paymentCommissionEntity.infoDictionaryKey;
        }
        return paymentCommissionEntity.copy(i, i4, str3, z2, str2);
    }

    public final int component1() {
        return this.commission;
    }

    public final int component2() {
        return this.oldCommission;
    }

    public final String component3() {
        return this.limitType;
    }

    public final boolean component4() {
        return this.clientsAmountIsOverLimit;
    }

    public final String component5() {
        return this.infoDictionaryKey;
    }

    public final PaymentCommissionEntity copy(int i, int i2, String str, boolean z, String str2) {
        C41536l.m120489i(str, "limitType");
        return new PaymentCommissionEntity(i, i2, str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCommissionEntity)) {
            return false;
        }
        PaymentCommissionEntity paymentCommissionEntity = (PaymentCommissionEntity) obj;
        return this.commission == paymentCommissionEntity.commission && this.oldCommission == paymentCommissionEntity.oldCommission && C41536l.m120484d(this.limitType, paymentCommissionEntity.limitType) && this.clientsAmountIsOverLimit == paymentCommissionEntity.clientsAmountIsOverLimit && C41536l.m120484d(this.infoDictionaryKey, paymentCommissionEntity.infoDictionaryKey);
    }

    public final boolean getClientsAmountIsOverLimit() {
        return this.clientsAmountIsOverLimit;
    }

    public final int getCommission() {
        return this.commission;
    }

    public final String getInfoDictionaryKey() {
        return this.infoDictionaryKey;
    }

    public final String getLimitType() {
        return this.limitType;
    }

    public final int getOldCommission() {
        return this.oldCommission;
    }

    public int hashCode() {
        int hashCode = ((((this.commission * 31) + this.oldCommission) * 31) + this.limitType.hashCode()) * 31;
        boolean z = this.clientsAmountIsOverLimit;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.infoDictionaryKey;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.commission;
        int i2 = this.oldCommission;
        String str = this.limitType;
        boolean z = this.clientsAmountIsOverLimit;
        String str2 = this.infoDictionaryKey;
        return "PaymentCommissionEntity(commission=" + i + ", oldCommission=" + i2 + ", limitType=" + str + ", clientsAmountIsOverLimit=" + z + ", infoDictionaryKey=" + str2 + ")";
    }
}
