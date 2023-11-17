package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.LoanHistoryApiModel */
public final class LoanHistoryApiModel {
    private final List<RepaymentApiModel> repayments;
    private final LoanHistorySummaryApiModel summary;

    public LoanHistoryApiModel(List<RepaymentApiModel> list, LoanHistorySummaryApiModel loanHistorySummaryApiModel) {
        C41536l.m120489i(list, "repayments");
        this.repayments = list;
        this.summary = loanHistorySummaryApiModel;
    }

    public static /* synthetic */ LoanHistoryApiModel copy$default(LoanHistoryApiModel loanHistoryApiModel, List<RepaymentApiModel> list, LoanHistorySummaryApiModel loanHistorySummaryApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            list = loanHistoryApiModel.repayments;
        }
        if ((i & 2) != 0) {
            loanHistorySummaryApiModel = loanHistoryApiModel.summary;
        }
        return loanHistoryApiModel.copy(list, loanHistorySummaryApiModel);
    }

    public final List<RepaymentApiModel> component1() {
        return this.repayments;
    }

    public final LoanHistorySummaryApiModel component2() {
        return this.summary;
    }

    public final LoanHistoryApiModel copy(List<RepaymentApiModel> list, LoanHistorySummaryApiModel loanHistorySummaryApiModel) {
        C41536l.m120489i(list, "repayments");
        return new LoanHistoryApiModel(list, loanHistorySummaryApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanHistoryApiModel)) {
            return false;
        }
        LoanHistoryApiModel loanHistoryApiModel = (LoanHistoryApiModel) obj;
        return C41536l.m120484d(this.repayments, loanHistoryApiModel.repayments) && C41536l.m120484d(this.summary, loanHistoryApiModel.summary);
    }

    public final List<RepaymentApiModel> getRepayments() {
        return this.repayments;
    }

    public final LoanHistorySummaryApiModel getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = this.repayments.hashCode() * 31;
        LoanHistorySummaryApiModel loanHistorySummaryApiModel = this.summary;
        return hashCode + (loanHistorySummaryApiModel == null ? 0 : loanHistorySummaryApiModel.hashCode());
    }

    public String toString() {
        List<RepaymentApiModel> list = this.repayments;
        LoanHistorySummaryApiModel loanHistorySummaryApiModel = this.summary;
        return "LoanHistoryApiModel(repayments=" + list + ", summary=" + loanHistorySummaryApiModel + ")";
    }
}
