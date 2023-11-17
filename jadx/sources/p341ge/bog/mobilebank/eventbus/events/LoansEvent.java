package p341ge.bog.mobilebank.eventbus.events;

import java.util.Iterator;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoanDetails;
import p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.model.loans.PLNDetails;

/* renamed from: ge.bog.mobilebank.eventbus.events.LoansEvent */
public class LoansEvent extends RootEvent {
    private LoansWrapper loansWrapper;

    private LoanDetailsWrapper wrapPlnToLnd(LoanDetailsWrapper loanDetailsWrapper) {
        PLNDetails plnDetails;
        if (loanDetailsWrapper.getDetails() == null && (plnDetails = loanDetailsWrapper.getPlnDetails()) != null) {
            LoanDetails loanDetails = new LoanDetails();
            loanDetails.setPln(true);
            loanDetails.setSignedDate(plnDetails.getStartDate());
            loanDetails.setMatureDate(plnDetails.getMaturityDate());
            loanDetails.setLinkAcctNo(plnDetails.getAcctNo());
            loanDetails.setInitialPrincipal(plnDetails.getInitialPrincipal());
            loanDetails.setInterestRate(plnDetails.getInterestRate());
            loanDetailsWrapper.setDetails(loanDetails);
        }
        return loanDetailsWrapper;
    }

    public LoansWrapper getLoansWrapper() {
        return this.loansWrapper;
    }

    public void setLoansWrapper(LoansWrapper loansWrapper2) {
        this.loansWrapper = loansWrapper2;
        if (loansWrapper2 != null && loansWrapper2.getLoans() != null) {
            Iterator<Loan> it = loansWrapper2.getLoans().iterator();
            while (it.hasNext()) {
                Loan next = it.next();
                Iterator<LoanDetailsWrapper> it2 = loansWrapper2.getDetails().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    LoanDetailsWrapper next2 = it2.next();
                    if (next2.getLoanKey() == next.getLoanKey()) {
                        next.setDetails(wrapPlnToLnd(next2));
                        break;
                    }
                }
            }
        }
    }
}
