package p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.LoanPrepareApplicationEntity */
public final class LoanPrepareApplicationEntity {
    private final ClLoanDetailsEntity loanDetails;

    public LoanPrepareApplicationEntity(ClLoanDetailsEntity clLoanDetailsEntity) {
        C41536l.m120489i(clLoanDetailsEntity, "loanDetails");
        this.loanDetails = clLoanDetailsEntity;
    }

    public static /* synthetic */ LoanPrepareApplicationEntity copy$default(LoanPrepareApplicationEntity loanPrepareApplicationEntity, ClLoanDetailsEntity clLoanDetailsEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            clLoanDetailsEntity = loanPrepareApplicationEntity.loanDetails;
        }
        return loanPrepareApplicationEntity.copy(clLoanDetailsEntity);
    }

    public final ClLoanDetailsEntity component1() {
        return this.loanDetails;
    }

    public final LoanPrepareApplicationEntity copy(ClLoanDetailsEntity clLoanDetailsEntity) {
        C41536l.m120489i(clLoanDetailsEntity, "loanDetails");
        return new LoanPrepareApplicationEntity(clLoanDetailsEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoanPrepareApplicationEntity) && C41536l.m120484d(this.loanDetails, ((LoanPrepareApplicationEntity) obj).loanDetails);
    }

    public final ClLoanDetailsEntity getLoanDetails() {
        return this.loanDetails;
    }

    public int hashCode() {
        return this.loanDetails.hashCode();
    }

    public String toString() {
        ClLoanDetailsEntity clLoanDetailsEntity = this.loanDetails;
        return "LoanPrepareApplicationEntity(loanDetails=" + clLoanDetailsEntity + ")";
    }
}
