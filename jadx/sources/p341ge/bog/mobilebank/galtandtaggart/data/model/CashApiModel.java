package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.CashApiModel */
public final class CashApiModel {
    private final BigDecimal accruedCommission;
    private final BigDecimal cashAvailableForTrade;
    private final BigDecimal cashAvailableForWithdrawal;
    private final BigDecimal cashBalance;
    private final List<CashInfoPair> cashSettlement;
    private final BigDecimal cashSettlementTotalAmount;
    private final BigDecimal pendingPaymentsAmount;
    private final BigDecimal pendingWithdrawalsAmount;

    public CashApiModel(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List<CashInfoPair> list, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7) {
        C41536l.m120489i(bigDecimal, "cashAvailableForTrade");
        C41536l.m120489i(bigDecimal2, "cashAvailableForWithdrawal");
        C41536l.m120489i(bigDecimal3, "cashBalance");
        C41536l.m120489i(bigDecimal4, "pendingPaymentsAmount");
        C41536l.m120489i(list, "cashSettlement");
        this.cashAvailableForTrade = bigDecimal;
        this.cashAvailableForWithdrawal = bigDecimal2;
        this.cashBalance = bigDecimal3;
        this.pendingPaymentsAmount = bigDecimal4;
        this.cashSettlement = list;
        this.pendingWithdrawalsAmount = bigDecimal5;
        this.accruedCommission = bigDecimal6;
        this.cashSettlementTotalAmount = bigDecimal7;
    }

    public static /* synthetic */ CashApiModel copy$default(CashApiModel cashApiModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List list, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i, Object obj) {
        CashApiModel cashApiModel2 = cashApiModel;
        int i2 = i;
        return cashApiModel.copy((i2 & 1) != 0 ? cashApiModel2.cashAvailableForTrade : bigDecimal, (i2 & 2) != 0 ? cashApiModel2.cashAvailableForWithdrawal : bigDecimal2, (i2 & 4) != 0 ? cashApiModel2.cashBalance : bigDecimal3, (i2 & 8) != 0 ? cashApiModel2.pendingPaymentsAmount : bigDecimal4, (i2 & 16) != 0 ? cashApiModel2.cashSettlement : list, (i2 & 32) != 0 ? cashApiModel2.pendingWithdrawalsAmount : bigDecimal5, (i2 & 64) != 0 ? cashApiModel2.accruedCommission : bigDecimal6, (i2 & 128) != 0 ? cashApiModel2.cashSettlementTotalAmount : bigDecimal7);
    }

    public final BigDecimal component1() {
        return this.cashAvailableForTrade;
    }

    public final BigDecimal component2() {
        return this.cashAvailableForWithdrawal;
    }

    public final BigDecimal component3() {
        return this.cashBalance;
    }

    public final BigDecimal component4() {
        return this.pendingPaymentsAmount;
    }

    public final List<CashInfoPair> component5() {
        return this.cashSettlement;
    }

    public final BigDecimal component6() {
        return this.pendingWithdrawalsAmount;
    }

    public final BigDecimal component7() {
        return this.accruedCommission;
    }

    public final BigDecimal component8() {
        return this.cashSettlementTotalAmount;
    }

    public final CashApiModel copy(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List<CashInfoPair> list, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7) {
        C41536l.m120489i(bigDecimal, "cashAvailableForTrade");
        C41536l.m120489i(bigDecimal2, "cashAvailableForWithdrawal");
        C41536l.m120489i(bigDecimal3, "cashBalance");
        C41536l.m120489i(bigDecimal4, "pendingPaymentsAmount");
        C41536l.m120489i(list, "cashSettlement");
        return new CashApiModel(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, list, bigDecimal5, bigDecimal6, bigDecimal7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashApiModel)) {
            return false;
        }
        CashApiModel cashApiModel = (CashApiModel) obj;
        return C41536l.m120484d(this.cashAvailableForTrade, cashApiModel.cashAvailableForTrade) && C41536l.m120484d(this.cashAvailableForWithdrawal, cashApiModel.cashAvailableForWithdrawal) && C41536l.m120484d(this.cashBalance, cashApiModel.cashBalance) && C41536l.m120484d(this.pendingPaymentsAmount, cashApiModel.pendingPaymentsAmount) && C41536l.m120484d(this.cashSettlement, cashApiModel.cashSettlement) && C41536l.m120484d(this.pendingWithdrawalsAmount, cashApiModel.pendingWithdrawalsAmount) && C41536l.m120484d(this.accruedCommission, cashApiModel.accruedCommission) && C41536l.m120484d(this.cashSettlementTotalAmount, cashApiModel.cashSettlementTotalAmount);
    }

    public final BigDecimal getAccruedCommission() {
        return this.accruedCommission;
    }

    public final BigDecimal getCashAvailableForTrade() {
        return this.cashAvailableForTrade;
    }

    public final BigDecimal getCashAvailableForWithdrawal() {
        return this.cashAvailableForWithdrawal;
    }

    public final BigDecimal getCashBalance() {
        return this.cashBalance;
    }

    public final List<CashInfoPair> getCashSettlement() {
        return this.cashSettlement;
    }

    public final BigDecimal getCashSettlementTotalAmount() {
        return this.cashSettlementTotalAmount;
    }

    public final BigDecimal getPendingPaymentsAmount() {
        return this.pendingPaymentsAmount;
    }

    public final BigDecimal getPendingWithdrawalsAmount() {
        return this.pendingWithdrawalsAmount;
    }

    public int hashCode() {
        int hashCode = ((((((((this.cashAvailableForTrade.hashCode() * 31) + this.cashAvailableForWithdrawal.hashCode()) * 31) + this.cashBalance.hashCode()) * 31) + this.pendingPaymentsAmount.hashCode()) * 31) + this.cashSettlement.hashCode()) * 31;
        BigDecimal bigDecimal = this.pendingWithdrawalsAmount;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.accruedCommission;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.cashSettlementTotalAmount;
        if (bigDecimal3 != null) {
            i = bigDecimal3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.cashAvailableForTrade;
        BigDecimal bigDecimal2 = this.cashAvailableForWithdrawal;
        BigDecimal bigDecimal3 = this.cashBalance;
        BigDecimal bigDecimal4 = this.pendingPaymentsAmount;
        List<CashInfoPair> list = this.cashSettlement;
        BigDecimal bigDecimal5 = this.pendingWithdrawalsAmount;
        BigDecimal bigDecimal6 = this.accruedCommission;
        BigDecimal bigDecimal7 = this.cashSettlementTotalAmount;
        return "CashApiModel(cashAvailableForTrade=" + bigDecimal + ", cashAvailableForWithdrawal=" + bigDecimal2 + ", cashBalance=" + bigDecimal3 + ", pendingPaymentsAmount=" + bigDecimal4 + ", cashSettlement=" + list + ", pendingWithdrawalsAmount=" + bigDecimal5 + ", accruedCommission=" + bigDecimal6 + ", cashSettlementTotalAmount=" + bigDecimal7 + ")";
    }
}
