package p341ge.bog.mobilebank.model.datareport;

/* renamed from: ge.bog.mobilebank.model.datareport.SmsDataReport */
public class SmsDataReport {
    private int avgReceivedTextSize;
    private int avgSentTextSize;
    private long calculationStartDate;
    private int incomingCount;
    private int outgoingCount;
    private int uniqueReceiverCount;
    private int uniqueSenderCount;

    public void setAvgReceivedTextSize(int i) {
        this.avgReceivedTextSize = i;
    }

    public void setAvgSentTextSize(int i) {
        this.avgSentTextSize = i;
    }

    public void setCalculationStartDate(long j) {
        this.calculationStartDate = j;
    }

    public void setIncomingCount(int i) {
        this.incomingCount = i;
    }

    public void setOutgoingCount(int i) {
        this.outgoingCount = i;
    }

    public void setUniqueReceiverCount(int i) {
        this.uniqueReceiverCount = i;
    }

    public void setUniqueSenderCount(int i) {
        this.uniqueSenderCount = i;
    }

    public String toString() {
        return "SmsDataReport{incomingCount=" + this.incomingCount + ", uniqueSenderCount=" + this.uniqueSenderCount + ", outgoingCount=" + this.outgoingCount + ", uniqueReceiverCount=" + this.uniqueReceiverCount + ", avgSentTextSize=" + this.avgSentTextSize + ", avgReceivedTextSize=" + this.avgReceivedTextSize + ", calculationStartDate=" + this.calculationStartDate + '}';
    }
}
