package p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingMonthExpensesEntity */
public final class BudgetingMonthExpensesEntity {
    private final List<BudgetingExpenseEntity> expenses;
    private final String month;
    private final BigDecimal totalAmount;
    private final long totalNumber;

    public BudgetingMonthExpensesEntity(List<BudgetingExpenseEntity> list, String str, long j, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "expenses");
        C41536l.m120489i(str, "month");
        C41536l.m120489i(bigDecimal, "totalAmount");
        this.expenses = list;
        this.month = str;
        this.totalNumber = j;
        this.totalAmount = bigDecimal;
    }

    public static /* synthetic */ BudgetingMonthExpensesEntity copy$default(BudgetingMonthExpensesEntity budgetingMonthExpensesEntity, List<BudgetingExpenseEntity> list, String str, long j, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            list = budgetingMonthExpensesEntity.expenses;
        }
        if ((i & 2) != 0) {
            str = budgetingMonthExpensesEntity.month;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j = budgetingMonthExpensesEntity.totalNumber;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            bigDecimal = budgetingMonthExpensesEntity.totalAmount;
        }
        return budgetingMonthExpensesEntity.copy(list, str2, j2, bigDecimal);
    }

    public final List<BudgetingExpenseEntity> component1() {
        return this.expenses;
    }

    public final String component2() {
        return this.month;
    }

    public final long component3() {
        return this.totalNumber;
    }

    public final BigDecimal component4() {
        return this.totalAmount;
    }

    public final BudgetingMonthExpensesEntity copy(List<BudgetingExpenseEntity> list, String str, long j, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "expenses");
        C41536l.m120489i(str, "month");
        C41536l.m120489i(bigDecimal, "totalAmount");
        return new BudgetingMonthExpensesEntity(list, str, j, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BudgetingMonthExpensesEntity)) {
            return false;
        }
        BudgetingMonthExpensesEntity budgetingMonthExpensesEntity = (BudgetingMonthExpensesEntity) obj;
        return C41536l.m120484d(this.expenses, budgetingMonthExpensesEntity.expenses) && C41536l.m120484d(this.month, budgetingMonthExpensesEntity.month) && this.totalNumber == budgetingMonthExpensesEntity.totalNumber && C41536l.m120484d(this.totalAmount, budgetingMonthExpensesEntity.totalAmount);
    }

    public final List<BudgetingExpenseEntity> getExpenses() {
        return this.expenses;
    }

    public final String getMonth() {
        return this.month;
    }

    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public final long getTotalNumber() {
        return this.totalNumber;
    }

    public int hashCode() {
        return (((((this.expenses.hashCode() * 31) + this.month.hashCode()) * 31) + C7397t.m28148a(this.totalNumber)) * 31) + this.totalAmount.hashCode();
    }

    public String toString() {
        List<BudgetingExpenseEntity> list = this.expenses;
        String str = this.month;
        long j = this.totalNumber;
        BigDecimal bigDecimal = this.totalAmount;
        return "BudgetingMonthExpensesEntity(expenses=" + list + ", month=" + str + ", totalNumber=" + j + ", totalAmount=" + bigDecimal + ")";
    }
}
