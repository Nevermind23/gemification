package p341ge.bog.mobilebank.deposits.data.entity.depositprolongation;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositChangeProlParametersEntity */
public final class DepositChangeProlParametersEntity {
    @C8664c("AgreeType")
    private final String agreeType;
    @C8664c("IntCalcAmt")
    private final String interestAmount;
    @C8664c("IntRate")
    private final String interestRate;
    private final String irr;

    public DepositChangeProlParametersEntity(String str, String str2, String str3, String str4) {
        this.interestRate = str;
        this.interestAmount = str2;
        this.agreeType = str3;
        this.irr = str4;
    }

    public static /* synthetic */ DepositChangeProlParametersEntity copy$default(DepositChangeProlParametersEntity depositChangeProlParametersEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositChangeProlParametersEntity.interestRate;
        }
        if ((i & 2) != 0) {
            str2 = depositChangeProlParametersEntity.interestAmount;
        }
        if ((i & 4) != 0) {
            str3 = depositChangeProlParametersEntity.agreeType;
        }
        if ((i & 8) != 0) {
            str4 = depositChangeProlParametersEntity.irr;
        }
        return depositChangeProlParametersEntity.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.interestRate;
    }

    public final String component2() {
        return this.interestAmount;
    }

    public final String component3() {
        return this.agreeType;
    }

    public final String component4() {
        return this.irr;
    }

    public final DepositChangeProlParametersEntity copy(String str, String str2, String str3, String str4) {
        return new DepositChangeProlParametersEntity(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositChangeProlParametersEntity)) {
            return false;
        }
        DepositChangeProlParametersEntity depositChangeProlParametersEntity = (DepositChangeProlParametersEntity) obj;
        return C41536l.m120484d(this.interestRate, depositChangeProlParametersEntity.interestRate) && C41536l.m120484d(this.interestAmount, depositChangeProlParametersEntity.interestAmount) && C41536l.m120484d(this.agreeType, depositChangeProlParametersEntity.agreeType) && C41536l.m120484d(this.irr, depositChangeProlParametersEntity.irr);
    }

    public final String getAgreeType() {
        return this.agreeType;
    }

    public final String getInterestAmount() {
        return this.interestAmount;
    }

    public final String getInterestRate() {
        return this.interestRate;
    }

    public final String getIrr() {
        return this.irr;
    }

    public int hashCode() {
        String str = this.interestRate;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.interestAmount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agreeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.irr;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.interestRate;
        String str2 = this.interestAmount;
        String str3 = this.agreeType;
        String str4 = this.irr;
        return "DepositChangeProlParametersEntity(interestRate=" + str + ", interestAmount=" + str2 + ", agreeType=" + str3 + ", irr=" + str4 + ")";
    }
}
