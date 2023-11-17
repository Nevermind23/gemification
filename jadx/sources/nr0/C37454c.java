package nr0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loans.data.model.LoanPlnHistoryApiModel;
import p341ge.bog.mobilebank.loans.data.model.LoanPlnHistorySummaryApiModel;
import p341ge.bog.mobilebank.loans.data.model.LoanPlnRepaymentApiModel;
import tr0.C38785f;
import tr0.C38786g;
import tr0.C38787h;

/* renamed from: nr0.c */
public final class C37454c {
    /* renamed from: a */
    private final List m110348a(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LoanPlnRepaymentApiModel loanPlnRepaymentApiModel = (LoanPlnRepaymentApiModel) it.next();
            arrayList.add(new C38787h(loanPlnRepaymentApiModel.getAgreeId(), loanPlnRepaymentApiModel.getAmount(), loanPlnRepaymentApiModel.getCcy(), loanPlnRepaymentApiModel.getId(), loanPlnRepaymentApiModel.getOperDate(), loanPlnRepaymentApiModel.getOperType(), loanPlnRepaymentApiModel.getOperTypeDictionaryKey(), loanPlnRepaymentApiModel.getOperTypeDictionaryValue()));
        }
        return arrayList;
    }

    /* renamed from: b */
    private final C38786g m110349b(LoanPlnHistorySummaryApiModel loanPlnHistorySummaryApiModel) {
        return new C38786g(loanPlnHistorySummaryApiModel.getAmount(), loanPlnHistorySummaryApiModel.getCcy(), loanPlnHistorySummaryApiModel.getOperDate(), loanPlnHistorySummaryApiModel.getOperType(), loanPlnHistorySummaryApiModel.getOperTypeDictionaryKey(), loanPlnHistorySummaryApiModel.getOperTypeDictionaryValue(), loanPlnHistorySummaryApiModel.getProductDictionaryKey());
    }

    /* renamed from: c */
    public final C38785f mo90586c(LoanPlnHistoryApiModel loanPlnHistoryApiModel) {
        C41536l.m120489i(loanPlnHistoryApiModel, "loanPlnHistoryApiModel");
        return new C38785f(m110348a(loanPlnHistoryApiModel.getRepayments()), m110349b(loanPlnHistoryApiModel.getSummary()));
    }
}
