package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LoanRepaymentWrapperApiEntity */
public final class LoanRepaymentWrapperApiEntity {
    @C8664c("repayments")
    private final List<LoanRepaymentApiEntity> repayments;
    @C8664c("summary")
    private final LoanRepaymentSummeryApiEntity summary;

    public LoanRepaymentWrapperApiEntity(LoanRepaymentSummeryApiEntity loanRepaymentSummeryApiEntity, List<LoanRepaymentApiEntity> list) {
        C41536l.m120489i(list, "repayments");
        this.summary = loanRepaymentSummeryApiEntity;
        this.repayments = list;
    }

    public static /* synthetic */ LoanRepaymentWrapperApiEntity copy$default(LoanRepaymentWrapperApiEntity loanRepaymentWrapperApiEntity, LoanRepaymentSummeryApiEntity loanRepaymentSummeryApiEntity, List<LoanRepaymentApiEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            loanRepaymentSummeryApiEntity = loanRepaymentWrapperApiEntity.summary;
        }
        if ((i & 2) != 0) {
            list = loanRepaymentWrapperApiEntity.repayments;
        }
        return loanRepaymentWrapperApiEntity.copy(loanRepaymentSummeryApiEntity, list);
    }

    public final LoanRepaymentSummeryApiEntity component1() {
        return this.summary;
    }

    public final List<LoanRepaymentApiEntity> component2() {
        return this.repayments;
    }

    public final LoanRepaymentWrapperApiEntity copy(LoanRepaymentSummeryApiEntity loanRepaymentSummeryApiEntity, List<LoanRepaymentApiEntity> list) {
        C41536l.m120489i(list, "repayments");
        return new LoanRepaymentWrapperApiEntity(loanRepaymentSummeryApiEntity, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanRepaymentWrapperApiEntity)) {
            return false;
        }
        LoanRepaymentWrapperApiEntity loanRepaymentWrapperApiEntity = (LoanRepaymentWrapperApiEntity) obj;
        return C41536l.m120484d(this.summary, loanRepaymentWrapperApiEntity.summary) && C41536l.m120484d(this.repayments, loanRepaymentWrapperApiEntity.repayments);
    }

    public final List<LoanRepaymentApiEntity> getRepayments() {
        return this.repayments;
    }

    public final LoanRepaymentSummeryApiEntity getSummary() {
        return this.summary;
    }

    public int hashCode() {
        LoanRepaymentSummeryApiEntity loanRepaymentSummeryApiEntity = this.summary;
        return ((loanRepaymentSummeryApiEntity == null ? 0 : loanRepaymentSummeryApiEntity.hashCode()) * 31) + this.repayments.hashCode();
    }

    public String toString() {
        LoanRepaymentSummeryApiEntity loanRepaymentSummeryApiEntity = this.summary;
        List<LoanRepaymentApiEntity> list = this.repayments;
        return "LoanRepaymentWrapperApiEntity(summary=" + loanRepaymentSummeryApiEntity + ", repayments=" + list + ")";
    }
}
