package p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.ApplicationStructures */
public final class ApplicationStructures {
    private final BigDecimal incomeMinAmount;

    public ApplicationStructures(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "incomeMinAmount");
        this.incomeMinAmount = bigDecimal;
    }

    public static /* synthetic */ ApplicationStructures copy$default(ApplicationStructures applicationStructures, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = applicationStructures.incomeMinAmount;
        }
        return applicationStructures.copy(bigDecimal);
    }

    public final BigDecimal component1() {
        return this.incomeMinAmount;
    }

    public final ApplicationStructures copy(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "incomeMinAmount");
        return new ApplicationStructures(bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplicationStructures) && C41536l.m120484d(this.incomeMinAmount, ((ApplicationStructures) obj).incomeMinAmount);
    }

    public final BigDecimal getIncomeMinAmount() {
        return this.incomeMinAmount;
    }

    public int hashCode() {
        return this.incomeMinAmount.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.incomeMinAmount;
        return "ApplicationStructures(incomeMinAmount=" + bigDecimal + ")";
    }
}
