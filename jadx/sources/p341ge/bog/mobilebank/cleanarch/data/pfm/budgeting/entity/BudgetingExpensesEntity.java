package p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingExpensesEntity */
public final class BudgetingExpensesEntity {
    private final List<BudgetingMonthExpensesEntity> pfmData;

    public BudgetingExpensesEntity(List<BudgetingMonthExpensesEntity> list) {
        C41536l.m120489i(list, "pfmData");
        this.pfmData = list;
    }

    public static /* synthetic */ BudgetingExpensesEntity copy$default(BudgetingExpensesEntity budgetingExpensesEntity, List<BudgetingMonthExpensesEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = budgetingExpensesEntity.pfmData;
        }
        return budgetingExpensesEntity.copy(list);
    }

    public final List<BudgetingMonthExpensesEntity> component1() {
        return this.pfmData;
    }

    public final BudgetingExpensesEntity copy(List<BudgetingMonthExpensesEntity> list) {
        C41536l.m120489i(list, "pfmData");
        return new BudgetingExpensesEntity(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BudgetingExpensesEntity) && C41536l.m120484d(this.pfmData, ((BudgetingExpensesEntity) obj).pfmData);
    }

    public final List<BudgetingMonthExpensesEntity> getPfmData() {
        return this.pfmData;
    }

    public int hashCode() {
        return this.pfmData.hashCode();
    }

    public String toString() {
        List<BudgetingMonthExpensesEntity> list = this.pfmData;
        return "BudgetingExpensesEntity(pfmData=" + list + ")";
    }
}
