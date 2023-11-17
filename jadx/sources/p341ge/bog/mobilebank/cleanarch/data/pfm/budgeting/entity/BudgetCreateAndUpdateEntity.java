package p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetCreateAndUpdateEntity */
public final class BudgetCreateAndUpdateEntity {
    private final List<BudgetUpdateEntity> createdBudgets;
    private final List<BudgetUpdateEntity> updatedBudgets;

    public BudgetCreateAndUpdateEntity(List<BudgetUpdateEntity> list, List<BudgetUpdateEntity> list2) {
        C41536l.m120489i(list, "createdBudgets");
        C41536l.m120489i(list2, "updatedBudgets");
        this.createdBudgets = list;
        this.updatedBudgets = list2;
    }

    public static /* synthetic */ BudgetCreateAndUpdateEntity copy$default(BudgetCreateAndUpdateEntity budgetCreateAndUpdateEntity, List<BudgetUpdateEntity> list, List<BudgetUpdateEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = budgetCreateAndUpdateEntity.createdBudgets;
        }
        if ((i & 2) != 0) {
            list2 = budgetCreateAndUpdateEntity.updatedBudgets;
        }
        return budgetCreateAndUpdateEntity.copy(list, list2);
    }

    public final List<BudgetUpdateEntity> component1() {
        return this.createdBudgets;
    }

    public final List<BudgetUpdateEntity> component2() {
        return this.updatedBudgets;
    }

    public final BudgetCreateAndUpdateEntity copy(List<BudgetUpdateEntity> list, List<BudgetUpdateEntity> list2) {
        C41536l.m120489i(list, "createdBudgets");
        C41536l.m120489i(list2, "updatedBudgets");
        return new BudgetCreateAndUpdateEntity(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BudgetCreateAndUpdateEntity)) {
            return false;
        }
        BudgetCreateAndUpdateEntity budgetCreateAndUpdateEntity = (BudgetCreateAndUpdateEntity) obj;
        return C41536l.m120484d(this.createdBudgets, budgetCreateAndUpdateEntity.createdBudgets) && C41536l.m120484d(this.updatedBudgets, budgetCreateAndUpdateEntity.updatedBudgets);
    }

    public final List<BudgetUpdateEntity> getCreatedBudgets() {
        return this.createdBudgets;
    }

    public final List<BudgetUpdateEntity> getUpdatedBudgets() {
        return this.updatedBudgets;
    }

    public int hashCode() {
        return (this.createdBudgets.hashCode() * 31) + this.updatedBudgets.hashCode();
    }

    public String toString() {
        List<BudgetUpdateEntity> list = this.createdBudgets;
        List<BudgetUpdateEntity> list2 = this.updatedBudgets;
        return "BudgetCreateAndUpdateEntity(createdBudgets=" + list + ", updatedBudgets=" + list2 + ")";
    }
}
