package p341ge.bog.mobilebank.deposits.data.entity.depositbreak;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakInfoEntity */
public final class DepositBreakInfoEntity {
    private final double breakAmount;
    private final List<DepositBreakDestinationAccountEntity> breakDestinationAccounts;
    private final double breakInterest;

    public DepositBreakInfoEntity(double d, double d2, List<DepositBreakDestinationAccountEntity> list) {
        C41536l.m120489i(list, "breakDestinationAccounts");
        this.breakInterest = d;
        this.breakAmount = d2;
        this.breakDestinationAccounts = list;
    }

    public static /* synthetic */ DepositBreakInfoEntity copy$default(DepositBreakInfoEntity depositBreakInfoEntity, double d, double d2, List<DepositBreakDestinationAccountEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = depositBreakInfoEntity.breakInterest;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = depositBreakInfoEntity.breakAmount;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            list = depositBreakInfoEntity.breakDestinationAccounts;
        }
        return depositBreakInfoEntity.copy(d3, d4, list);
    }

    public final double component1() {
        return this.breakInterest;
    }

    public final double component2() {
        return this.breakAmount;
    }

    public final List<DepositBreakDestinationAccountEntity> component3() {
        return this.breakDestinationAccounts;
    }

    public final DepositBreakInfoEntity copy(double d, double d2, List<DepositBreakDestinationAccountEntity> list) {
        C41536l.m120489i(list, "breakDestinationAccounts");
        return new DepositBreakInfoEntity(d, d2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositBreakInfoEntity)) {
            return false;
        }
        DepositBreakInfoEntity depositBreakInfoEntity = (DepositBreakInfoEntity) obj;
        return Double.compare(this.breakInterest, depositBreakInfoEntity.breakInterest) == 0 && Double.compare(this.breakAmount, depositBreakInfoEntity.breakAmount) == 0 && C41536l.m120484d(this.breakDestinationAccounts, depositBreakInfoEntity.breakDestinationAccounts);
    }

    public final double getBreakAmount() {
        return this.breakAmount;
    }

    public final List<DepositBreakDestinationAccountEntity> getBreakDestinationAccounts() {
        return this.breakDestinationAccounts;
    }

    public final double getBreakInterest() {
        return this.breakInterest;
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.breakInterest) * 31) + Double.doubleToLongBits(this.breakAmount)) * 31) + this.breakDestinationAccounts.hashCode();
    }

    public String toString() {
        double d = this.breakInterest;
        double d2 = this.breakAmount;
        List<DepositBreakDestinationAccountEntity> list = this.breakDestinationAccounts;
        return "DepositBreakInfoEntity(breakInterest=" + d + ", breakAmount=" + d2 + ", breakDestinationAccounts=" + list + ")";
    }
}
