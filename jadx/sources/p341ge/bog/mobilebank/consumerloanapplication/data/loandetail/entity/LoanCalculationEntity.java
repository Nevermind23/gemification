package p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.LoanCalculationEntity */
public final class LoanCalculationEntity {
    private final BigDecimal pmtAmount;

    public LoanCalculationEntity(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "pmtAmount");
        this.pmtAmount = bigDecimal;
    }

    public static /* synthetic */ LoanCalculationEntity copy$default(LoanCalculationEntity loanCalculationEntity, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = loanCalculationEntity.pmtAmount;
        }
        return loanCalculationEntity.copy(bigDecimal);
    }

    public final BigDecimal component1() {
        return this.pmtAmount;
    }

    public final LoanCalculationEntity copy(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "pmtAmount");
        return new LoanCalculationEntity(bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoanCalculationEntity) && C41536l.m120484d(this.pmtAmount, ((LoanCalculationEntity) obj).pmtAmount);
    }

    public final BigDecimal getPmtAmount() {
        return this.pmtAmount;
    }

    public int hashCode() {
        return this.pmtAmount.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.pmtAmount;
        return "LoanCalculationEntity(pmtAmount=" + bigDecimal + ")";
    }
}
