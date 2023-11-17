package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.LoanInvoice */
public class LoanInvoice {
    @C8664c("amount")
    private BigDecimal amount;
    @C8664c("ccy")
    private String ccy;
    @C8664c("feeType")
    public String feeType;
    @C8664c("invoiceType")
    public String invoiceType;
    @C8664c("invoiceTypeDictionaryKey")
    private String invoiceTypeDictionaryKey;
    @C8664c("loanKey")
    private long loanKey;
    @C8664c("paymentDate")
    public long paymentDate;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public String getInvoiceTypeDictionaryKey() {
        return this.invoiceTypeDictionaryKey;
    }

    public long getLoanKey() {
        return this.loanKey;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setLoanKey(long j) {
        this.loanKey = j;
    }
}
