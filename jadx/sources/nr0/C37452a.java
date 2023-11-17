package nr0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loans.data.model.LoanHistoryApiModel;
import p341ge.bog.mobilebank.loans.data.model.LoanHistorySummaryApiModel;
import p341ge.bog.mobilebank.loans.data.model.RepaymentApiModel;
import tr0.C38780a;
import tr0.C38781b;
import tr0.C38782c;

/* renamed from: nr0.a */
public final class C37452a {
    /* renamed from: a */
    private final C38781b m110340a(RepaymentApiModel repaymentApiModel) {
        return new C38781b(repaymentApiModel.getAmountPaid(), repaymentApiModel.getCcy(), repaymentApiModel.getFee(), repaymentApiModel.getFeeType(), repaymentApiModel.getFeeTypeDictionaryKey(), repaymentApiModel.getFeeTypeDictionaryValue(), repaymentApiModel.getForgiveFee(), repaymentApiModel.getForgiveInt(), repaymentApiModel.getForgiveOdi(), repaymentApiModel.getGraceInt(), repaymentApiModel.getInsAmt(), repaymentApiModel.getInterest(), repaymentApiModel.getLoanKey(), repaymentApiModel.getPaymentDate(), repaymentApiModel.getPenalty(), repaymentApiModel.getPrimaryKey(), repaymentApiModel.getPrincipal(), repaymentApiModel.getRliAmt(), repaymentApiModel.getScheduledFee());
    }

    /* renamed from: b */
    private final C38782c m110341b(LoanHistorySummaryApiModel loanHistorySummaryApiModel) {
        return new C38782c(loanHistorySummaryApiModel.getAmountPaid(), loanHistorySummaryApiModel.getCcy(), loanHistorySummaryApiModel.getFee(), loanHistorySummaryApiModel.getFeeTypeDictionaryValue(), loanHistorySummaryApiModel.getForgiveFee(), loanHistorySummaryApiModel.getForgiveInt(), loanHistorySummaryApiModel.getForgiveOdi(), loanHistorySummaryApiModel.getGraceInt(), loanHistorySummaryApiModel.getInitialPrincipal(), loanHistorySummaryApiModel.getInsAmt(), loanHistorySummaryApiModel.getInterest(), loanHistorySummaryApiModel.getPaymentDate(), loanHistorySummaryApiModel.getPenalty(), loanHistorySummaryApiModel.getPrimaryKey(), loanHistorySummaryApiModel.getPrincipal(), loanHistorySummaryApiModel.getProductDictionaryKey(), loanHistorySummaryApiModel.getRliAmt(), loanHistorySummaryApiModel.getScheduledFee());
    }

    /* renamed from: c */
    public final C38780a mo90584c(LoanHistoryApiModel loanHistoryApiModel) {
        C38782c cVar;
        C41536l.m120489i(loanHistoryApiModel, "loanHistoryApiModel");
        List<RepaymentApiModel> repayments = loanHistoryApiModel.getRepayments();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(repayments, 10));
        for (RepaymentApiModel a : repayments) {
            arrayList.add(m110340a(a));
        }
        LoanHistorySummaryApiModel summary = loanHistoryApiModel.getSummary();
        if (summary != null) {
            cVar = m110341b(summary);
        } else {
            cVar = null;
        }
        return new C38780a(arrayList, cVar);
    }
}
