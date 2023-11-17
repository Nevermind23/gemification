package p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingExpenseEntity */
public final class BudgetingExpenseEntity {
    private final BigDecimal amount;
    private final long catId;
    private final long number;

    public BudgetingExpenseEntity(BigDecimal bigDecimal, long j, long j2) {
        C41536l.m120489i(bigDecimal, "amount");
        this.amount = bigDecimal;
        this.number = j;
        this.catId = j2;
    }

    public static /* synthetic */ BudgetingExpenseEntity copy$default(BudgetingExpenseEntity budgetingExpenseEntity, BigDecimal bigDecimal, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = budgetingExpenseEntity.amount;
        }
        if ((i & 2) != 0) {
            j = budgetingExpenseEntity.number;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = budgetingExpenseEntity.catId;
        }
        return budgetingExpenseEntity.copy(bigDecimal, j3, j2);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final long component2() {
        return this.number;
    }

    public final long component3() {
        return this.catId;
    }

    public final BudgetingExpenseEntity copy(BigDecimal bigDecimal, long j, long j2) {
        C41536l.m120489i(bigDecimal, "amount");
        return new BudgetingExpenseEntity(bigDecimal, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BudgetingExpenseEntity)) {
            return false;
        }
        BudgetingExpenseEntity budgetingExpenseEntity = (BudgetingExpenseEntity) obj;
        return C41536l.m120484d(this.amount, budgetingExpenseEntity.amount) && this.number == budgetingExpenseEntity.number && this.catId == budgetingExpenseEntity.catId;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final long getCatId() {
        return this.catId;
    }

    public final long getNumber() {
        return this.number;
    }

    public int hashCode() {
        return (((this.amount.hashCode() * 31) + C7397t.m28148a(this.number)) * 31) + C7397t.m28148a(this.catId);
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        long j = this.number;
        long j2 = this.catId;
        return "BudgetingExpenseEntity(amount=" + bigDecimal + ", number=" + j + ", catId=" + j2 + ")";
    }
}
