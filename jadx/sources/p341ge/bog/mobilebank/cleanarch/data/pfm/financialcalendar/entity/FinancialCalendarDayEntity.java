package p341ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity.FinancialCalendarDayEntity */
public final class FinancialCalendarDayEntity {
    private final BigDecimal balance;
    private final BigDecimal bogHeatLevel;
    private final BigDecimal totalIn;
    private final BigDecimal totalOut;
    private final List<FinancialCalendarTransactionEntity> transactions;

    public FinancialCalendarDayEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, List<FinancialCalendarTransactionEntity> list, BigDecimal bigDecimal4) {
        C41536l.m120489i(bigDecimal, "balance");
        C41536l.m120489i(bigDecimal2, "totalIn");
        C41536l.m120489i(bigDecimal3, "totalOut");
        C41536l.m120489i(list, "transactions");
        C41536l.m120489i(bigDecimal4, "bogHeatLevel");
        this.balance = bigDecimal;
        this.totalIn = bigDecimal2;
        this.totalOut = bigDecimal3;
        this.transactions = list;
        this.bogHeatLevel = bigDecimal4;
    }

    public static /* synthetic */ FinancialCalendarDayEntity copy$default(FinancialCalendarDayEntity financialCalendarDayEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, List<FinancialCalendarTransactionEntity> list, BigDecimal bigDecimal4, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = financialCalendarDayEntity.balance;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = financialCalendarDayEntity.totalIn;
        }
        BigDecimal bigDecimal5 = bigDecimal2;
        if ((i & 4) != 0) {
            bigDecimal3 = financialCalendarDayEntity.totalOut;
        }
        BigDecimal bigDecimal6 = bigDecimal3;
        if ((i & 8) != 0) {
            list = financialCalendarDayEntity.transactions;
        }
        List<FinancialCalendarTransactionEntity> list2 = list;
        if ((i & 16) != 0) {
            bigDecimal4 = financialCalendarDayEntity.bogHeatLevel;
        }
        return financialCalendarDayEntity.copy(bigDecimal, bigDecimal5, bigDecimal6, list2, bigDecimal4);
    }

    public final BigDecimal component1() {
        return this.balance;
    }

    public final BigDecimal component2() {
        return this.totalIn;
    }

    public final BigDecimal component3() {
        return this.totalOut;
    }

    public final List<FinancialCalendarTransactionEntity> component4() {
        return this.transactions;
    }

    public final BigDecimal component5() {
        return this.bogHeatLevel;
    }

    public final FinancialCalendarDayEntity copy(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, List<FinancialCalendarTransactionEntity> list, BigDecimal bigDecimal4) {
        C41536l.m120489i(bigDecimal, "balance");
        C41536l.m120489i(bigDecimal2, "totalIn");
        C41536l.m120489i(bigDecimal3, "totalOut");
        C41536l.m120489i(list, "transactions");
        C41536l.m120489i(bigDecimal4, "bogHeatLevel");
        return new FinancialCalendarDayEntity(bigDecimal, bigDecimal2, bigDecimal3, list, bigDecimal4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialCalendarDayEntity)) {
            return false;
        }
        FinancialCalendarDayEntity financialCalendarDayEntity = (FinancialCalendarDayEntity) obj;
        return C41536l.m120484d(this.balance, financialCalendarDayEntity.balance) && C41536l.m120484d(this.totalIn, financialCalendarDayEntity.totalIn) && C41536l.m120484d(this.totalOut, financialCalendarDayEntity.totalOut) && C41536l.m120484d(this.transactions, financialCalendarDayEntity.transactions) && C41536l.m120484d(this.bogHeatLevel, financialCalendarDayEntity.bogHeatLevel);
    }

    public final BigDecimal getBalance() {
        return this.balance;
    }

    public final BigDecimal getBogHeatLevel() {
        return this.bogHeatLevel;
    }

    public final BigDecimal getTotalIn() {
        return this.totalIn;
    }

    public final BigDecimal getTotalOut() {
        return this.totalOut;
    }

    public final List<FinancialCalendarTransactionEntity> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        return (((((((this.balance.hashCode() * 31) + this.totalIn.hashCode()) * 31) + this.totalOut.hashCode()) * 31) + this.transactions.hashCode()) * 31) + this.bogHeatLevel.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.balance;
        BigDecimal bigDecimal2 = this.totalIn;
        BigDecimal bigDecimal3 = this.totalOut;
        List<FinancialCalendarTransactionEntity> list = this.transactions;
        BigDecimal bigDecimal4 = this.bogHeatLevel;
        return "FinancialCalendarDayEntity(balance=" + bigDecimal + ", totalIn=" + bigDecimal2 + ", totalOut=" + bigDecimal3 + ", transactions=" + list + ", bogHeatLevel=" + bigDecimal4 + ")";
    }
}
