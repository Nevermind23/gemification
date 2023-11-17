package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.LoanPlnHistoryApiModel */
public final class LoanPlnHistoryApiModel {
    private final List<LoanPlnRepaymentApiModel> repayments;
    private final LoanPlnHistorySummaryApiModel summary;

    public LoanPlnHistoryApiModel(List<LoanPlnRepaymentApiModel> list, LoanPlnHistorySummaryApiModel loanPlnHistorySummaryApiModel) {
        C41536l.m120489i(list, "repayments");
        C41536l.m120489i(loanPlnHistorySummaryApiModel, "summary");
        this.repayments = list;
        this.summary = loanPlnHistorySummaryApiModel;
    }

    public static /* synthetic */ LoanPlnHistoryApiModel copy$default(LoanPlnHistoryApiModel loanPlnHistoryApiModel, List<LoanPlnRepaymentApiModel> list, LoanPlnHistorySummaryApiModel loanPlnHistorySummaryApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            list = loanPlnHistoryApiModel.repayments;
        }
        if ((i & 2) != 0) {
            loanPlnHistorySummaryApiModel = loanPlnHistoryApiModel.summary;
        }
        return loanPlnHistoryApiModel.copy(list, loanPlnHistorySummaryApiModel);
    }

    public final List<LoanPlnRepaymentApiModel> component1() {
        return this.repayments;
    }

    public final LoanPlnHistorySummaryApiModel component2() {
        return this.summary;
    }

    public final LoanPlnHistoryApiModel copy(List<LoanPlnRepaymentApiModel> list, LoanPlnHistorySummaryApiModel loanPlnHistorySummaryApiModel) {
        C41536l.m120489i(list, "repayments");
        C41536l.m120489i(loanPlnHistorySummaryApiModel, "summary");
        return new LoanPlnHistoryApiModel(list, loanPlnHistorySummaryApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanPlnHistoryApiModel)) {
            return false;
        }
        LoanPlnHistoryApiModel loanPlnHistoryApiModel = (LoanPlnHistoryApiModel) obj;
        return C41536l.m120484d(this.repayments, loanPlnHistoryApiModel.repayments) && C41536l.m120484d(this.summary, loanPlnHistoryApiModel.summary);
    }

    public final List<LoanPlnRepaymentApiModel> getRepayments() {
        return this.repayments;
    }

    public final LoanPlnHistorySummaryApiModel getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (this.repayments.hashCode() * 31) + this.summary.hashCode();
    }

    public String toString() {
        List<LoanPlnRepaymentApiModel> list = this.repayments;
        LoanPlnHistorySummaryApiModel loanPlnHistorySummaryApiModel = this.summary;
        return "LoanPlnHistoryApiModel(repayments=" + list + ", summary=" + loanPlnHistorySummaryApiModel + ")";
    }
}
