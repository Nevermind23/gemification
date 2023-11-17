package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.LoanPaymentParamsEntity */
public final class LoanPaymentParamsEntity {
    private final boolean isAmount;
    private final boolean isHighLighted;
    private final boolean isWarning;
    private final int orderNumber;
    private final String paramDictionaryKey;
    private final String parameterName;
    private final double parameterValue;

    public LoanPaymentParamsEntity(String str, double d, String str2, int i, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(str, "parameterName");
        C41536l.m120489i(str2, "paramDictionaryKey");
        this.parameterName = str;
        this.parameterValue = d;
        this.paramDictionaryKey = str2;
        this.orderNumber = i;
        this.isAmount = z;
        this.isHighLighted = z2;
        this.isWarning = z3;
    }

    public static /* synthetic */ LoanPaymentParamsEntity copy$default(LoanPaymentParamsEntity loanPaymentParamsEntity, String str, double d, String str2, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        LoanPaymentParamsEntity loanPaymentParamsEntity2 = loanPaymentParamsEntity;
        return loanPaymentParamsEntity.copy((i2 & 1) != 0 ? loanPaymentParamsEntity2.parameterName : str, (i2 & 2) != 0 ? loanPaymentParamsEntity2.parameterValue : d, (i2 & 4) != 0 ? loanPaymentParamsEntity2.paramDictionaryKey : str2, (i2 & 8) != 0 ? loanPaymentParamsEntity2.orderNumber : i, (i2 & 16) != 0 ? loanPaymentParamsEntity2.isAmount : z, (i2 & 32) != 0 ? loanPaymentParamsEntity2.isHighLighted : z2, (i2 & 64) != 0 ? loanPaymentParamsEntity2.isWarning : z3);
    }

    public final String component1() {
        return this.parameterName;
    }

    public final double component2() {
        return this.parameterValue;
    }

    public final String component3() {
        return this.paramDictionaryKey;
    }

    public final int component4() {
        return this.orderNumber;
    }

    public final boolean component5() {
        return this.isAmount;
    }

    public final boolean component6() {
        return this.isHighLighted;
    }

    public final boolean component7() {
        return this.isWarning;
    }

    public final LoanPaymentParamsEntity copy(String str, double d, String str2, int i, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(str, "parameterName");
        C41536l.m120489i(str2, "paramDictionaryKey");
        return new LoanPaymentParamsEntity(str, d, str2, i, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanPaymentParamsEntity)) {
            return false;
        }
        LoanPaymentParamsEntity loanPaymentParamsEntity = (LoanPaymentParamsEntity) obj;
        return C41536l.m120484d(this.parameterName, loanPaymentParamsEntity.parameterName) && Double.compare(this.parameterValue, loanPaymentParamsEntity.parameterValue) == 0 && C41536l.m120484d(this.paramDictionaryKey, loanPaymentParamsEntity.paramDictionaryKey) && this.orderNumber == loanPaymentParamsEntity.orderNumber && this.isAmount == loanPaymentParamsEntity.isAmount && this.isHighLighted == loanPaymentParamsEntity.isHighLighted && this.isWarning == loanPaymentParamsEntity.isWarning;
    }

    public final int getOrderNumber() {
        return this.orderNumber;
    }

    public final String getParamDictionaryKey() {
        return this.paramDictionaryKey;
    }

    public final String getParameterName() {
        return this.parameterName;
    }

    public final double getParameterValue() {
        return this.parameterValue;
    }

    public int hashCode() {
        int hashCode = ((((((this.parameterName.hashCode() * 31) + Double.doubleToLongBits(this.parameterValue)) * 31) + this.paramDictionaryKey.hashCode()) * 31) + this.orderNumber) * 31;
        boolean z = this.isAmount;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isHighLighted;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isWarning;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final boolean isAmount() {
        return this.isAmount;
    }

    public final boolean isHighLighted() {
        return this.isHighLighted;
    }

    public final boolean isWarning() {
        return this.isWarning;
    }

    public String toString() {
        String str = this.parameterName;
        double d = this.parameterValue;
        String str2 = this.paramDictionaryKey;
        int i = this.orderNumber;
        boolean z = this.isAmount;
        boolean z2 = this.isHighLighted;
        boolean z3 = this.isWarning;
        return "LoanPaymentParamsEntity(parameterName=" + str + ", parameterValue=" + d + ", paramDictionaryKey=" + str2 + ", orderNumber=" + i + ", isAmount=" + z + ", isHighLighted=" + z2 + ", isWarning=" + z3 + ")";
    }
}
