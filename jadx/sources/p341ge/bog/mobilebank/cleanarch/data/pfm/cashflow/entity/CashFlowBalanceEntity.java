package p341ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity.CashFlowBalanceEntity */
public final class CashFlowBalanceEntity {
    private final BigDecimal balance;
    private final BigDecimal expenses;
    private final BigDecimal income;
    private final BigDecimal netCashFlow;

    public CashFlowBalanceEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        C41536l.m120489i(bigDecimal, "balance");
        C41536l.m120489i(bigDecimal2, "income");
        C41536l.m120489i(bigDecimal3, "expenses");
        C41536l.m120489i(bigDecimal4, "netCashFlow");
        this.balance = bigDecimal;
        this.income = bigDecimal2;
        this.expenses = bigDecimal3;
        this.netCashFlow = bigDecimal4;
    }

    public static /* synthetic */ CashFlowBalanceEntity copy$default(CashFlowBalanceEntity cashFlowBalanceEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = cashFlowBalanceEntity.balance;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = cashFlowBalanceEntity.income;
        }
        if ((i & 4) != 0) {
            bigDecimal3 = cashFlowBalanceEntity.expenses;
        }
        if ((i & 8) != 0) {
            bigDecimal4 = cashFlowBalanceEntity.netCashFlow;
        }
        return cashFlowBalanceEntity.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4);
    }

    public final BigDecimal component1() {
        return this.balance;
    }

    public final BigDecimal component2() {
        return this.income;
    }

    public final BigDecimal component3() {
        return this.expenses;
    }

    public final BigDecimal component4() {
        return this.netCashFlow;
    }

    public final CashFlowBalanceEntity copy(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        C41536l.m120489i(bigDecimal, "balance");
        C41536l.m120489i(bigDecimal2, "income");
        C41536l.m120489i(bigDecimal3, "expenses");
        C41536l.m120489i(bigDecimal4, "netCashFlow");
        return new CashFlowBalanceEntity(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashFlowBalanceEntity)) {
            return false;
        }
        CashFlowBalanceEntity cashFlowBalanceEntity = (CashFlowBalanceEntity) obj;
        return C41536l.m120484d(this.balance, cashFlowBalanceEntity.balance) && C41536l.m120484d(this.income, cashFlowBalanceEntity.income) && C41536l.m120484d(this.expenses, cashFlowBalanceEntity.expenses) && C41536l.m120484d(this.netCashFlow, cashFlowBalanceEntity.netCashFlow);
    }

    public final BigDecimal getBalance() {
        return this.balance;
    }

    public final BigDecimal getExpenses() {
        return this.expenses;
    }

    public final BigDecimal getIncome() {
        return this.income;
    }

    public final BigDecimal getNetCashFlow() {
        return this.netCashFlow;
    }

    public int hashCode() {
        return (((((this.balance.hashCode() * 31) + this.income.hashCode()) * 31) + this.expenses.hashCode()) * 31) + this.netCashFlow.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.balance;
        BigDecimal bigDecimal2 = this.income;
        BigDecimal bigDecimal3 = this.expenses;
        BigDecimal bigDecimal4 = this.netCashFlow;
        return "CashFlowBalanceEntity(balance=" + bigDecimal + ", income=" + bigDecimal2 + ", expenses=" + bigDecimal3 + ", netCashFlow=" + bigDecimal4 + ")";
    }
}
