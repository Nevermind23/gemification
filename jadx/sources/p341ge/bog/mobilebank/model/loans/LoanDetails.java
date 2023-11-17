package p341ge.bog.mobilebank.model.loans;

import java.math.BigDecimal;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.LoanRepayment;
import p341ge.bog.mobilebank.model.LoanRepaymentWrapper;
import p341ge.bog.mobilebank.model.OldLoanScheduleWrapper;
import p341ge.bog.mobilebank.model.loans.schedule.LoanSchedule;

/* renamed from: ge.bog.mobilebank.model.loans.LoanDetails */
public class LoanDetails {
    @C8664c("clientKey")
    private long clientKey;
    @C8664c("fileUrl")
    private String fileUrl;
    public Long firstDdDate;
    @C8664c("initialPrincipal")
    private BigDecimal initialPrincipal;
    @C8664c("insAmount")
    private BigDecimal insAmount;
    @C8664c("insFlag")
    public String insFlag;
    @C8664c("interestRate")
    private BigDecimal interestRate;
    public String isLoanReverseAllowed;
    public String isOnlineInstallment;
    private boolean isPln;
    public String isReversible;
    @C8664c("linkAcctKey")
    private long linkAcctKey;
    @C8664c("linkAcctNo")
    private String linkAcctNo;
    public BigDecimal loanDebt;
    @C8664c("loanKey")
    private long loanKey;
    private LoanRepaymentWrapper loanRepaymentWrapper;
    public String loanSubType;
    @C8664c("matureDate")
    private long matureDate;
    public String nextFloatingRate;
    public BigDecimal nextInterest;
    public String nextLoanIntTypeDictionaryKey;
    public String nextLoanIntTypeDictionaryValue;
    public String nextLoanIntTypeName;
    public Long nextLoanRateChangeDate;
    public Float nextMinIntRate;
    public BigDecimal nextPayment;
    public Float nextSpreadRate;
    @C8664c("offsetIntSaved")
    private BigDecimal offsetIntSaved;
    private OldLoanScheduleWrapper oldLoanScheduleWrapper;
    @C8664c("prePaymentCom")
    public BigDecimal prePaymentCom;
    @C8664c("remainingInterest")
    private BigDecimal remainingInterest;
    @C8664c("repaymentFlag")
    private String repaymentFlag;
    @C8664c("restAmount")
    public BigDecimal restAmount;
    public String reversalStatus;
    @C8664c("reversalStatusDictionaryKey")
    private String reversalStatusDictionaryKey;
    public String reversalStatusDictionaryValue;
    @C8664c("signedDate")
    private long signedDate;
    public String smsScheme;
    public String subTypeGroup;

    public long getClientKey() {
        return this.clientKey;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public BigDecimal getInitialPrincipal() {
        return this.initialPrincipal;
    }

    public BigDecimal getInsAmount() {
        return this.insAmount;
    }

    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public long getLinkAcctKey() {
        return this.linkAcctKey;
    }

    public String getLinkAcctNo() {
        return this.linkAcctNo;
    }

    public long getLoanKey() {
        return this.loanKey;
    }

    public LoanRepaymentWrapper getLoanRepaymentWrapper() {
        return this.loanRepaymentWrapper;
    }

    public long getMatureDate() {
        return this.matureDate;
    }

    public BigDecimal getOffsetIntSaved() {
        return this.offsetIntSaved;
    }

    public OldLoanScheduleWrapper getOldLoanScheduleWrapper() {
        return this.oldLoanScheduleWrapper;
    }

    public BigDecimal getRemainingInterest() {
        return this.remainingInterest;
    }

    public String getRepaymentFlag() {
        return this.repaymentFlag;
    }

    public BigDecimal getRepaymentsBaseAmountSum() {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (!(getLoanRepaymentWrapper() == null || getLoanRepaymentWrapper().getRepayments() == null)) {
            for (LoanRepayment principal : getLoanRepaymentWrapper().getRepayments()) {
                bigDecimal = bigDecimal.add(principal.getPrincipal());
            }
        }
        return bigDecimal;
    }

    public BigDecimal getRepaymentsCommisionAmountSum() {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (!(getLoanRepaymentWrapper() == null || getLoanRepaymentWrapper().getRepayments() == null)) {
            for (LoanRepayment penalty : getLoanRepaymentWrapper().getRepayments()) {
                bigDecimal = bigDecimal.add(penalty.getPenalty());
            }
        }
        return bigDecimal;
    }

    public BigDecimal getRepaymentsInterestAmountSum() {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (!(getLoanRepaymentWrapper() == null || getLoanRepaymentWrapper().getRepayments() == null)) {
            for (LoanRepayment interest : getLoanRepaymentWrapper().getRepayments()) {
                bigDecimal = bigDecimal.add(interest.getInterest());
            }
        }
        return bigDecimal;
    }

    public BigDecimal getRepaymentsPayAmountSum() {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (!(getLoanRepaymentWrapper() == null || getLoanRepaymentWrapper().getRepayments() == null)) {
            for (LoanRepayment amountPaid : getLoanRepaymentWrapper().getRepayments()) {
                bigDecimal = bigDecimal.add(amountPaid.getAmountPaid());
            }
        }
        return bigDecimal;
    }

    public BigDecimal getRepaymentsPenaltyAmountSum() {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (!(getLoanRepaymentWrapper() == null || getLoanRepaymentWrapper().getRepayments() == null)) {
            for (LoanRepayment scheduledFee : getLoanRepaymentWrapper().getRepayments()) {
                bigDecimal = bigDecimal.add(scheduledFee.getScheduledFee());
            }
        }
        return bigDecimal;
    }

    public String getReversalStatusDictionaryKey() {
        return this.reversalStatusDictionaryKey;
    }

    public BigDecimal getScheduleBaseAmountSum() {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (!(getOldLoanScheduleWrapper() == null || getOldLoanScheduleWrapper().getSchedule() == null)) {
            for (LoanSchedule priAmt : getOldLoanScheduleWrapper().getSchedule()) {
                bigDecimal = bigDecimal.add(priAmt.getPriAmt());
            }
        }
        return bigDecimal;
    }

    public BigDecimal getScheduleCommisionAmountSum() {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (!(getOldLoanScheduleWrapper() == null || getOldLoanScheduleWrapper().getSchedule() == null)) {
            for (LoanSchedule feeAmt : getOldLoanScheduleWrapper().getSchedule()) {
                bigDecimal = bigDecimal.add(feeAmt.getFeeAmt());
            }
        }
        return bigDecimal;
    }

    public BigDecimal getScheduleInterestAmountSum() {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (!(getOldLoanScheduleWrapper() == null || getOldLoanScheduleWrapper().getSchedule() == null)) {
            for (LoanSchedule intAmt : getOldLoanScheduleWrapper().getSchedule()) {
                bigDecimal = bigDecimal.add(intAmt.getIntAmt());
            }
        }
        return bigDecimal;
    }

    public BigDecimal getSchedulePayAmountSum() {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (!(getOldLoanScheduleWrapper() == null || getOldLoanScheduleWrapper().getSchedule() == null)) {
            for (LoanSchedule totalAmt : getOldLoanScheduleWrapper().getSchedule()) {
                bigDecimal = bigDecimal.add(totalAmt.getTotalAmt());
            }
        }
        return bigDecimal;
    }

    public long getSignedDate() {
        return this.signedDate;
    }

    public boolean hasInsFlag() {
        return "Y".equals(this.insFlag);
    }

    public boolean isPln() {
        return this.isPln;
    }

    public void setClientKey(long j) {
        this.clientKey = j;
    }

    public void setInitialPrincipal(BigDecimal bigDecimal) {
        this.initialPrincipal = bigDecimal;
    }

    public void setInterestRate(BigDecimal bigDecimal) {
        this.interestRate = bigDecimal;
    }

    public void setLinkAcctNo(String str) {
        this.linkAcctNo = str;
    }

    public void setLoanKey(long j) {
        this.loanKey = j;
    }

    public void setMatureDate(long j) {
        this.matureDate = j;
    }

    public void setPln(boolean z) {
        this.isPln = z;
    }

    public void setSignedDate(long j) {
        this.signedDate = j;
    }
}
