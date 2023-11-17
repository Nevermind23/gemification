package p341ge.bog.mobilebank.model.loans;

/* renamed from: ge.bog.mobilebank.model.loans.LoanOffsetAccount */
public class LoanOffsetAccount {
    private long acctKey;
    private String loanType;
    private long mainAcctKey;

    public long getAcctKey() {
        return this.acctKey;
    }

    public long getMainAcctKey() {
        return this.mainAcctKey;
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }
}
