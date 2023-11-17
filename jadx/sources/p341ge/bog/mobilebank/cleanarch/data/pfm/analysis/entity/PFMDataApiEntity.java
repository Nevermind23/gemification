package p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.PFMDataApiEntity */
public final class PFMDataApiEntity {
    private final AnalysisIncomeAndExpensesApiEntity expenses;
    private final AnalysisIncomeAndExpensesApiEntity incomes;

    public PFMDataApiEntity(AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity, AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity2) {
        C41536l.m120489i(analysisIncomeAndExpensesApiEntity, "expenses");
        C41536l.m120489i(analysisIncomeAndExpensesApiEntity2, "incomes");
        this.expenses = analysisIncomeAndExpensesApiEntity;
        this.incomes = analysisIncomeAndExpensesApiEntity2;
    }

    public static /* synthetic */ PFMDataApiEntity copy$default(PFMDataApiEntity pFMDataApiEntity, AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity, AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity2, int i, Object obj) {
        if ((i & 1) != 0) {
            analysisIncomeAndExpensesApiEntity = pFMDataApiEntity.expenses;
        }
        if ((i & 2) != 0) {
            analysisIncomeAndExpensesApiEntity2 = pFMDataApiEntity.incomes;
        }
        return pFMDataApiEntity.copy(analysisIncomeAndExpensesApiEntity, analysisIncomeAndExpensesApiEntity2);
    }

    public final AnalysisIncomeAndExpensesApiEntity component1() {
        return this.expenses;
    }

    public final AnalysisIncomeAndExpensesApiEntity component2() {
        return this.incomes;
    }

    public final PFMDataApiEntity copy(AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity, AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity2) {
        C41536l.m120489i(analysisIncomeAndExpensesApiEntity, "expenses");
        C41536l.m120489i(analysisIncomeAndExpensesApiEntity2, "incomes");
        return new PFMDataApiEntity(analysisIncomeAndExpensesApiEntity, analysisIncomeAndExpensesApiEntity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PFMDataApiEntity)) {
            return false;
        }
        PFMDataApiEntity pFMDataApiEntity = (PFMDataApiEntity) obj;
        return C41536l.m120484d(this.expenses, pFMDataApiEntity.expenses) && C41536l.m120484d(this.incomes, pFMDataApiEntity.incomes);
    }

    public final AnalysisIncomeAndExpensesApiEntity getExpenses() {
        return this.expenses;
    }

    public final AnalysisIncomeAndExpensesApiEntity getIncomes() {
        return this.incomes;
    }

    public int hashCode() {
        return (this.expenses.hashCode() * 31) + this.incomes.hashCode();
    }

    public String toString() {
        AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity = this.expenses;
        AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity2 = this.incomes;
        return "PFMDataApiEntity(expenses=" + analysisIncomeAndExpensesApiEntity + ", incomes=" + analysisIncomeAndExpensesApiEntity2 + ")";
    }
}
