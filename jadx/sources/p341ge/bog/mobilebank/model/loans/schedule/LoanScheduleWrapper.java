package p341ge.bog.mobilebank.model.loans.schedule;

import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.loans.schedule.LoanScheduleWrapper */
public class LoanScheduleWrapper {
    private ArrayList<LoanScheduleItem> schedule;
    private LoanScheduleSummary summary;

    public ArrayList<LoanScheduleItem> getSchedule() {
        return this.schedule;
    }

    public LoanScheduleSummary getSummary() {
        return this.summary;
    }

    public void setSchedule(ArrayList<LoanScheduleItem> arrayList) {
        this.schedule = arrayList;
    }

    public void setSummary(LoanScheduleSummary loanScheduleSummary) {
        this.summary = loanScheduleSummary;
    }
}
