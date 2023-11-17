package p341ge.bog.mobilebank.model.loans.history;

import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.loans.history.LoanHistoryWrapper */
public class LoanHistoryWrapper {
    private ArrayList<LoanHistoryItem> repayments;
    private LoanHistorySummary summary;

    public ArrayList<LoanHistoryItem> getSchedule() {
        return this.repayments;
    }

    public LoanHistorySummary getSummary() {
        return this.summary;
    }

    public void setSchedule(ArrayList<LoanHistoryItem> arrayList) {
        this.repayments = arrayList;
    }

    public void setSummary(LoanHistorySummary loanHistorySummary) {
        this.summary = loanHistorySummary;
    }
}
