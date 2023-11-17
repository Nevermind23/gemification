package p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.EditBudgetResponseEntity */
public final class EditBudgetResponseEntity {
    private final BudgetCreateAndUpdateEntity pfmData;

    public EditBudgetResponseEntity(BudgetCreateAndUpdateEntity budgetCreateAndUpdateEntity) {
        C41536l.m120489i(budgetCreateAndUpdateEntity, "pfmData");
        this.pfmData = budgetCreateAndUpdateEntity;
    }

    public static /* synthetic */ EditBudgetResponseEntity copy$default(EditBudgetResponseEntity editBudgetResponseEntity, BudgetCreateAndUpdateEntity budgetCreateAndUpdateEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            budgetCreateAndUpdateEntity = editBudgetResponseEntity.pfmData;
        }
        return editBudgetResponseEntity.copy(budgetCreateAndUpdateEntity);
    }

    public final BudgetCreateAndUpdateEntity component1() {
        return this.pfmData;
    }

    public final EditBudgetResponseEntity copy(BudgetCreateAndUpdateEntity budgetCreateAndUpdateEntity) {
        C41536l.m120489i(budgetCreateAndUpdateEntity, "pfmData");
        return new EditBudgetResponseEntity(budgetCreateAndUpdateEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditBudgetResponseEntity) && C41536l.m120484d(this.pfmData, ((EditBudgetResponseEntity) obj).pfmData);
    }

    public final BudgetCreateAndUpdateEntity getPfmData() {
        return this.pfmData;
    }

    public int hashCode() {
        return this.pfmData.hashCode();
    }

    public String toString() {
        BudgetCreateAndUpdateEntity budgetCreateAndUpdateEntity = this.pfmData;
        return "EditBudgetResponseEntity(pfmData=" + budgetCreateAndUpdateEntity + ")";
    }
}
