package p955ys;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetUpdateEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingDataResponseEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingExpenseEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingExpensesEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingMonthExpensesEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingResponseEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.EditBudgetResponseEntity;
import p936wv.C29575a;
import p936wv.C29576b;
import p936wv.C29577c;
import p936wv.C29578d;
import p936wv.C29580f;
import p936wv.C29581g;
import p936wv.C29582h;

/* renamed from: ys.a */
public final class C30112a {
    /* renamed from: b */
    private final C29575a m91097b(BudgetEntity budgetEntity) {
        Long valueOf = Long.valueOf(budgetEntity.getId());
        long catId = budgetEntity.getCatId();
        Long parentCatId = budgetEntity.getParentCatId();
        String color = budgetEntity.getColor();
        Boolean valueOf2 = Boolean.valueOf(budgetEntity.isCatIncome());
        String name = budgetEntity.getName();
        String parentCatName = budgetEntity.getParentCatName();
        BigDecimal abs = budgetEntity.getSpent().abs();
        C41536l.m120488h(abs, "spent.abs()");
        return new C29575a(valueOf, catId, parentCatId, color, valueOf2, name, parentCatName, abs, budgetEntity.getValue(), budgetEntity.getOrderNo());
    }

    /* renamed from: c */
    private final C29576b m91098c(BudgetUpdateEntity budgetUpdateEntity) {
        return new C29576b(budgetUpdateEntity.getId(), budgetUpdateEntity.getCatId(), budgetUpdateEntity.getValue(), budgetUpdateEntity.getErrorDictionaryKey());
    }

    /* renamed from: d */
    private final C29577c m91099d(BudgetingDataResponseEntity budgetingDataResponseEntity) {
        List<BudgetEntity> budgets = budgetingDataResponseEntity.getBudgets();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(budgets, 10));
        for (BudgetEntity b : budgets) {
            arrayList.add(m91097b(b));
        }
        String month = budgetingDataResponseEntity.getMonth();
        String serverDate = budgetingDataResponseEntity.getServerDate();
        BigDecimal totalIncome = budgetingDataResponseEntity.getTotalIncome();
        BigDecimal totalIncomeValue = budgetingDataResponseEntity.getTotalIncomeValue();
        BigDecimal abs = budgetingDataResponseEntity.getTotalSpend().abs();
        C41536l.m120488h(abs, "totalSpend.abs()");
        return new C29577c(arrayList, month, serverDate, totalIncome, totalIncomeValue, abs, budgetingDataResponseEntity.getTotalValue());
    }

    /* renamed from: e */
    private final C29578d m91100e(BudgetingExpenseEntity budgetingExpenseEntity) {
        BigDecimal abs = budgetingExpenseEntity.getAmount().abs();
        C41536l.m120488h(abs, "amount.abs()");
        return new C29578d(abs, budgetingExpenseEntity.getNumber(), budgetingExpenseEntity.getCatId(), (Long) null, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    private final C29580f m91101f(BudgetingMonthExpensesEntity budgetingMonthExpensesEntity) {
        List<BudgetingExpenseEntity> expenses = budgetingMonthExpensesEntity.getExpenses();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(expenses, 10));
        for (BudgetingExpenseEntity e : expenses) {
            arrayList.add(m91100e(e));
        }
        String month = budgetingMonthExpensesEntity.getMonth();
        long totalNumber = budgetingMonthExpensesEntity.getTotalNumber();
        BigDecimal abs = budgetingMonthExpensesEntity.getTotalAmount().abs();
        C41536l.m120488h(abs, "totalAmount.abs()");
        return new C29580f(arrayList, month, totalNumber, abs);
    }

    /* renamed from: a */
    public final List mo70398a(BudgetingExpensesEntity budgetingExpensesEntity) {
        C41536l.m120489i(budgetingExpensesEntity, "budgetingExpensesEntity");
        List<BudgetingMonthExpensesEntity> pfmData = budgetingExpensesEntity.getPfmData();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(pfmData, 10));
        for (BudgetingMonthExpensesEntity f : pfmData) {
            arrayList.add(m91101f(f));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final C29581g mo70399g(BudgetingResponseEntity budgetingResponseEntity) {
        C41536l.m120489i(budgetingResponseEntity, "budgetingResponseEntity");
        return new C29581g(m91099d(budgetingResponseEntity.getPfmData()), budgetingResponseEntity.getHashCode());
    }

    /* renamed from: h */
    public final C29582h mo70400h(EditBudgetResponseEntity editBudgetResponseEntity) {
        C41536l.m120489i(editBudgetResponseEntity, "editBudgetResponseEntity");
        List<BudgetUpdateEntity> updatedBudgets = editBudgetResponseEntity.getPfmData().getUpdatedBudgets();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(updatedBudgets, 10));
        for (BudgetUpdateEntity c : updatedBudgets) {
            arrayList.add(m91098c(c));
        }
        List<BudgetUpdateEntity> createdBudgets = editBudgetResponseEntity.getPfmData().getCreatedBudgets();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(createdBudgets, 10));
        for (BudgetUpdateEntity c2 : createdBudgets) {
            arrayList2.add(m91098c(c2));
        }
        return new C29582h(arrayList, arrayList2);
    }
}
