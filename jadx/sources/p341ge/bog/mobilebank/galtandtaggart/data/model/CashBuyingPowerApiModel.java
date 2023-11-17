package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.CashBuyingPowerApiModel */
public final class CashBuyingPowerApiModel {
    private final BigDecimal pendingDepositsAmountAvailable;
    private final BigDecimal pendingDepositsAmountNotAvailable;

    public CashBuyingPowerApiModel(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C41536l.m120489i(bigDecimal, "pendingDepositsAmountAvailable");
        C41536l.m120489i(bigDecimal2, "pendingDepositsAmountNotAvailable");
        this.pendingDepositsAmountAvailable = bigDecimal;
        this.pendingDepositsAmountNotAvailable = bigDecimal2;
    }

    public static /* synthetic */ CashBuyingPowerApiModel copy$default(CashBuyingPowerApiModel cashBuyingPowerApiModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = cashBuyingPowerApiModel.pendingDepositsAmountAvailable;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = cashBuyingPowerApiModel.pendingDepositsAmountNotAvailable;
        }
        return cashBuyingPowerApiModel.copy(bigDecimal, bigDecimal2);
    }

    public final BigDecimal component1() {
        return this.pendingDepositsAmountAvailable;
    }

    public final BigDecimal component2() {
        return this.pendingDepositsAmountNotAvailable;
    }

    public final CashBuyingPowerApiModel copy(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C41536l.m120489i(bigDecimal, "pendingDepositsAmountAvailable");
        C41536l.m120489i(bigDecimal2, "pendingDepositsAmountNotAvailable");
        return new CashBuyingPowerApiModel(bigDecimal, bigDecimal2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashBuyingPowerApiModel)) {
            return false;
        }
        CashBuyingPowerApiModel cashBuyingPowerApiModel = (CashBuyingPowerApiModel) obj;
        return C41536l.m120484d(this.pendingDepositsAmountAvailable, cashBuyingPowerApiModel.pendingDepositsAmountAvailable) && C41536l.m120484d(this.pendingDepositsAmountNotAvailable, cashBuyingPowerApiModel.pendingDepositsAmountNotAvailable);
    }

    public final BigDecimal getPendingDepositsAmountAvailable() {
        return this.pendingDepositsAmountAvailable;
    }

    public final BigDecimal getPendingDepositsAmountNotAvailable() {
        return this.pendingDepositsAmountNotAvailable;
    }

    public int hashCode() {
        return (this.pendingDepositsAmountAvailable.hashCode() * 31) + this.pendingDepositsAmountNotAvailable.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.pendingDepositsAmountAvailable;
        BigDecimal bigDecimal2 = this.pendingDepositsAmountNotAvailable;
        return "CashBuyingPowerApiModel(pendingDepositsAmountAvailable=" + bigDecimal + ", pendingDepositsAmountNotAvailable=" + bigDecimal2 + ")";
    }
}
