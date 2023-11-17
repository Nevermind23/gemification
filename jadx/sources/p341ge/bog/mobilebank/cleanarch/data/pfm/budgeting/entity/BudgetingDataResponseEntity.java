package p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingDataResponseEntity */
public final class BudgetingDataResponseEntity {
    private final List<BudgetEntity> budgets;
    private final String month;
    private final String serverDate;
    private final BigDecimal totalIncome;
    private final BigDecimal totalIncomeValue;
    private final BigDecimal totalSpend;
    private final BigDecimal totalValue;

    public BudgetingDataResponseEntity(List<BudgetEntity> list, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        C41536l.m120489i(list, "budgets");
        C41536l.m120489i(str, "month");
        C41536l.m120489i(str2, "serverDate");
        C41536l.m120489i(bigDecimal, "totalIncome");
        C41536l.m120489i(bigDecimal2, "totalIncomeValue");
        C41536l.m120489i(bigDecimal3, "totalSpend");
        C41536l.m120489i(bigDecimal4, "totalValue");
        this.budgets = list;
        this.month = str;
        this.serverDate = str2;
        this.totalIncome = bigDecimal;
        this.totalIncomeValue = bigDecimal2;
        this.totalSpend = bigDecimal3;
        this.totalValue = bigDecimal4;
    }

    public static /* synthetic */ BudgetingDataResponseEntity copy$default(BudgetingDataResponseEntity budgetingDataResponseEntity, List<BudgetEntity> list, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = budgetingDataResponseEntity.budgets;
        }
        if ((i & 2) != 0) {
            str = budgetingDataResponseEntity.month;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = budgetingDataResponseEntity.serverDate;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            bigDecimal = budgetingDataResponseEntity.totalIncome;
        }
        BigDecimal bigDecimal5 = bigDecimal;
        if ((i & 16) != 0) {
            bigDecimal2 = budgetingDataResponseEntity.totalIncomeValue;
        }
        BigDecimal bigDecimal6 = bigDecimal2;
        if ((i & 32) != 0) {
            bigDecimal3 = budgetingDataResponseEntity.totalSpend;
        }
        BigDecimal bigDecimal7 = bigDecimal3;
        if ((i & 64) != 0) {
            bigDecimal4 = budgetingDataResponseEntity.totalValue;
        }
        return budgetingDataResponseEntity.copy(list, str3, str4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal4);
    }

    public final List<BudgetEntity> component1() {
        return this.budgets;
    }

    public final String component2() {
        return this.month;
    }

    public final String component3() {
        return this.serverDate;
    }

    public final BigDecimal component4() {
        return this.totalIncome;
    }

    public final BigDecimal component5() {
        return this.totalIncomeValue;
    }

    public final BigDecimal component6() {
        return this.totalSpend;
    }

    public final BigDecimal component7() {
        return this.totalValue;
    }

    public final BudgetingDataResponseEntity copy(List<BudgetEntity> list, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        C41536l.m120489i(list, "budgets");
        C41536l.m120489i(str, "month");
        C41536l.m120489i(str2, "serverDate");
        C41536l.m120489i(bigDecimal, "totalIncome");
        C41536l.m120489i(bigDecimal2, "totalIncomeValue");
        C41536l.m120489i(bigDecimal3, "totalSpend");
        BigDecimal bigDecimal5 = bigDecimal4;
        C41536l.m120489i(bigDecimal5, "totalValue");
        return new BudgetingDataResponseEntity(list, str, str2, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BudgetingDataResponseEntity)) {
            return false;
        }
        BudgetingDataResponseEntity budgetingDataResponseEntity = (BudgetingDataResponseEntity) obj;
        return C41536l.m120484d(this.budgets, budgetingDataResponseEntity.budgets) && C41536l.m120484d(this.month, budgetingDataResponseEntity.month) && C41536l.m120484d(this.serverDate, budgetingDataResponseEntity.serverDate) && C41536l.m120484d(this.totalIncome, budgetingDataResponseEntity.totalIncome) && C41536l.m120484d(this.totalIncomeValue, budgetingDataResponseEntity.totalIncomeValue) && C41536l.m120484d(this.totalSpend, budgetingDataResponseEntity.totalSpend) && C41536l.m120484d(this.totalValue, budgetingDataResponseEntity.totalValue);
    }

    public final List<BudgetEntity> getBudgets() {
        return this.budgets;
    }

    public final String getMonth() {
        return this.month;
    }

    public final String getServerDate() {
        return this.serverDate;
    }

    public final BigDecimal getTotalIncome() {
        return this.totalIncome;
    }

    public final BigDecimal getTotalIncomeValue() {
        return this.totalIncomeValue;
    }

    public final BigDecimal getTotalSpend() {
        return this.totalSpend;
    }

    public final BigDecimal getTotalValue() {
        return this.totalValue;
    }

    public int hashCode() {
        return (((((((((((this.budgets.hashCode() * 31) + this.month.hashCode()) * 31) + this.serverDate.hashCode()) * 31) + this.totalIncome.hashCode()) * 31) + this.totalIncomeValue.hashCode()) * 31) + this.totalSpend.hashCode()) * 31) + this.totalValue.hashCode();
    }

    public String toString() {
        List<BudgetEntity> list = this.budgets;
        String str = this.month;
        String str2 = this.serverDate;
        BigDecimal bigDecimal = this.totalIncome;
        BigDecimal bigDecimal2 = this.totalIncomeValue;
        BigDecimal bigDecimal3 = this.totalSpend;
        BigDecimal bigDecimal4 = this.totalValue;
        return "BudgetingDataResponseEntity(budgets=" + list + ", month=" + str + ", serverDate=" + str2 + ", totalIncome=" + bigDecimal + ", totalIncomeValue=" + bigDecimal2 + ", totalSpend=" + bigDecimal3 + ", totalValue=" + bigDecimal4 + ")";
    }
}
