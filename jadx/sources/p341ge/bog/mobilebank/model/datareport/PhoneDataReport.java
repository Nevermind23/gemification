package p341ge.bog.mobilebank.model.datareport;

/* renamed from: ge.bog.mobilebank.model.datareport.PhoneDataReport */
public class PhoneDataReport {
    private int answeredCallCount;
    private long avgInCallDuration;
    private long avgOutCallDuration;
    private long calculationStartDate;
    private int contactListSize;
    private int contactsConnectionCount;
    private int incomingCount;
    private long maxInCallDuration;
    private long maxOutCallDuration;
    private long minInCallDuration;
    private long minOutCallDuration;
    private int missedCallCount;
    private int missedRecalledCount;
    private int outgoingCount;
    private int uniqueCallerCount;
    private int uniqueReceiverCount;
    private int uniqueReceiverNotFromContactCount;

    public void setAnsweredCallCount(int i) {
        this.answeredCallCount = i;
    }

    public void setAvgInCallDuration(long j) {
        this.avgInCallDuration = j;
    }

    public void setAvgOutCallDuration(long j) {
        this.avgOutCallDuration = j;
    }

    public void setCalculationStartDate(long j) {
        this.calculationStartDate = j;
    }

    public void setContactListSize(int i) {
        this.contactListSize = i;
    }

    public void setContactsConnectionCount(int i) {
        this.contactsConnectionCount = i;
    }

    public void setIncomingCount(int i) {
        this.incomingCount = i;
    }

    public void setMaxInCallDuration(long j) {
        this.maxInCallDuration = j;
    }

    public void setMaxOutCallDuration(long j) {
        this.maxOutCallDuration = j;
    }

    public void setMinInCallDuration(long j) {
        this.minInCallDuration = j;
    }

    public void setMinOutCallDuration(long j) {
        this.minOutCallDuration = j;
    }

    public void setMissedCallCount(int i) {
        this.missedCallCount = i;
    }

    public void setMissedRecalledCount(int i) {
        this.missedRecalledCount = i;
    }

    public void setOutgoingCount(int i) {
        this.outgoingCount = i;
    }

    public void setUniqueCallerCount(int i) {
        this.uniqueCallerCount = i;
    }

    public void setUniqueReceiverCount(int i) {
        this.uniqueReceiverCount = i;
    }

    public void setUniqueReceiverNotFromContactCount(int i) {
        this.uniqueReceiverNotFromContactCount = i;
    }

    public String toString() {
        return "PhoneDataReport{incomingCount=" + this.incomingCount + ", uniqueCallerCount=" + this.uniqueCallerCount + ", outgoingCount=" + this.outgoingCount + ", uniqueReceiverCount=" + this.uniqueReceiverCount + ", answeredCallCount=" + this.answeredCallCount + ", missedCallCount=" + this.missedCallCount + ", missedRecalledCount=" + this.missedRecalledCount + ", minInCallDuration=" + this.minInCallDuration + ", maxInCallDuration=" + this.maxInCallDuration + ", avgInCallDuration=" + this.avgInCallDuration + ", minOutCallDuration=" + this.minOutCallDuration + ", maxOutCallDuration=" + this.maxOutCallDuration + ", avgOutCallDuration=" + this.avgOutCallDuration + ", uniqueReceiverNotFromContactCount=" + this.uniqueReceiverNotFromContactCount + ", contactsConnectionCount=" + this.contactsConnectionCount + ", contactListSize=" + this.contactListSize + ", calculationStartDate=" + this.calculationStartDate + '}';
    }
}
