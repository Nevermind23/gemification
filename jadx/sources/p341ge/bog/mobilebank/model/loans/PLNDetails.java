package p341ge.bog.mobilebank.model.loans;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.loans.PLNDetails */
public class PLNDetails {
    private String acctNo;
    private BigDecimal amount;
    private BigDecimal availableAmount;
    public String fileId;
    public String fileUrl;
    private BigDecimal initialPrincipal;
    private BigDecimal intAmount;
    private BigDecimal interestRate;
    private long maturityDate;
    private BigDecimal penalty;
    private String productDictionaryKey;
    private long startDate;

    public String getAcctNo() {
        return this.acctNo;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public BigDecimal getInitialPrincipal() {
        return this.initialPrincipal;
    }

    public BigDecimal getIntAmount() {
        return this.intAmount;
    }

    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public long getMaturityDate() {
        return this.maturityDate;
    }

    public BigDecimal getPenalty() {
        return this.penalty;
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public long getStartDate() {
        return this.startDate;
    }

    public void setAcctNo(String str) {
        this.acctNo = str;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setAvailableAmount(BigDecimal bigDecimal) {
        this.availableAmount = bigDecimal;
    }

    public void setInterestRate(BigDecimal bigDecimal) {
        this.interestRate = bigDecimal;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }

    public void setStartDate(long j) {
        this.startDate = j;
    }
}
