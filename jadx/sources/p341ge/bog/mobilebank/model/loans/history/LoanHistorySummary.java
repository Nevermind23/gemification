package p341ge.bog.mobilebank.model.loans.history;

import g91.C32303f;
import g91.C32319m;
import java.math.BigDecimal;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.loans.ILoanHistoryScheduleSummary;

/* renamed from: ge.bog.mobilebank.model.loans.history.LoanHistorySummary */
public class LoanHistorySummary implements ILoanHistoryScheduleSummary {
    @C8664c("amount")
    private BigDecimal amount;
    @C8664c("amountPaid")
    private BigDecimal amountPaid;
    @C8664c("ccy")
    private String ccy;
    @C8664c("feeType")
    private String feeType;
    @C8664c("initialPrincipal")
    private String initialPrincipal;
    @C8664c("insAmt")
    private BigDecimal insAmt;
    @C8664c("interest")
    private BigDecimal interest;
    @C8664c("paymentDate")
    private long paymentDate;
    @C8664c("penalty")
    private BigDecimal penalty;
    @C8664c("principal")
    private BigDecimal principal;
    @C8664c("productDictionaryKey")
    private String productDictionaryKey;
    @C8664c("scheduledFee")
    private BigDecimal scheduledFee;

    public String getAmount() {
        if (this.amountPaid != null) {
            return C32303f.m95204o(this.amountPaid.doubleValue()) + " " + C32303f.m95197h(this.ccy);
        }
        return C32303f.m95204o(this.amount.doubleValue()) + " " + C32303f.m95197h(this.ccy);
    }

    public String getCcy() {
        return this.ccy;
    }

    public String getDate() {
        return C32319m.m95314u(this.paymentDate);
    }

    public BigDecimal getInterest() {
        return this.interest;
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setInterest(BigDecimal bigDecimal) {
        this.interest = bigDecimal;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }
}
