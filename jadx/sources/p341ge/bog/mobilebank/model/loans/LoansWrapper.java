package p341ge.bog.mobilebank.model.loans;

import androidx.annotation.Keep;
import java.util.ArrayList;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.LoanSummery;

@Keep
/* renamed from: ge.bog.mobilebank.model.loans.LoansWrapper */
public class LoansWrapper {
    @C8664c("cosignerSummary")
    public LoanSummery cosignerSummary;
    @C8664c("details")
    private ArrayList<LoanDetailsWrapper> details;
    @C8664c("loans")
    private ArrayList<Loan> loans;
    private ArrayList<LoanOffsetAccount> offsetAccounts;
    @C8664c("summary")
    private LoanSummery summary;

    public ArrayList<LoanDetailsWrapper> getDetails() {
        return this.details;
    }

    public Loan getLoanByPos(int i) {
        if (getLoans() != null) {
            return getLoans().get(i);
        }
        return null;
    }

    public int getLoanPositionByLoanKey(long j) {
        if (getLoans() == null) {
            return -1;
        }
        for (int i = 0; i < getLoans().size(); i++) {
            if (getLoans().get(i).getLoanKey() == j) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Loan> getLoans() {
        return this.loans;
    }

    public ArrayList<LoanOffsetAccount> getOffsetAccounts() {
        return this.offsetAccounts;
    }

    public LoanSummery getSummary() {
        return this.summary;
    }

    public void setDetails(ArrayList<LoanDetailsWrapper> arrayList) {
        this.details = arrayList;
    }

    public void setLoans(ArrayList<Loan> arrayList) {
        this.loans = arrayList;
    }

    public void setOffsetAccounts(ArrayList<LoanOffsetAccount> arrayList) {
        this.offsetAccounts = arrayList;
    }

    public void setSummary(LoanSummery loanSummery) {
        this.summary = loanSummery;
    }
}
