package p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingResponseEntity */
public final class BudgetingResponseEntity {
    private final long hashCode;
    private final BudgetingDataResponseEntity pfmData;

    public BudgetingResponseEntity(BudgetingDataResponseEntity budgetingDataResponseEntity, long j) {
        C41536l.m120489i(budgetingDataResponseEntity, "pfmData");
        this.pfmData = budgetingDataResponseEntity;
        this.hashCode = j;
    }

    public static /* synthetic */ BudgetingResponseEntity copy$default(BudgetingResponseEntity budgetingResponseEntity, BudgetingDataResponseEntity budgetingDataResponseEntity, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            budgetingDataResponseEntity = budgetingResponseEntity.pfmData;
        }
        if ((i & 2) != 0) {
            j = budgetingResponseEntity.hashCode;
        }
        return budgetingResponseEntity.copy(budgetingDataResponseEntity, j);
    }

    public final BudgetingDataResponseEntity component1() {
        return this.pfmData;
    }

    public final long component2() {
        return this.hashCode;
    }

    public final BudgetingResponseEntity copy(BudgetingDataResponseEntity budgetingDataResponseEntity, long j) {
        C41536l.m120489i(budgetingDataResponseEntity, "pfmData");
        return new BudgetingResponseEntity(budgetingDataResponseEntity, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BudgetingResponseEntity)) {
            return false;
        }
        BudgetingResponseEntity budgetingResponseEntity = (BudgetingResponseEntity) obj;
        return C41536l.m120484d(this.pfmData, budgetingResponseEntity.pfmData) && this.hashCode == budgetingResponseEntity.hashCode;
    }

    public final long getHashCode() {
        return this.hashCode;
    }

    public final BudgetingDataResponseEntity getPfmData() {
        return this.pfmData;
    }

    public int hashCode() {
        return (this.pfmData.hashCode() * 31) + C7397t.m28148a(this.hashCode);
    }

    public String toString() {
        BudgetingDataResponseEntity budgetingDataResponseEntity = this.pfmData;
        long j = this.hashCode;
        return "BudgetingResponseEntity(pfmData=" + budgetingDataResponseEntity + ", hashCode=" + j + ")";
    }
}
