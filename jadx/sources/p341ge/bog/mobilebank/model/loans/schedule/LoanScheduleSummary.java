package p341ge.bog.mobilebank.model.loans.schedule;

import g91.C32303f;
import g91.C32319m;
import java.math.BigDecimal;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.loans.ILoanHistoryScheduleSummary;

/* renamed from: ge.bog.mobilebank.model.loans.schedule.LoanScheduleSummary */
public class LoanScheduleSummary implements ILoanHistoryScheduleSummary {
    @C8664c("ccy")
    private String ccy;
    @C8664c("feeAmt")
    private BigDecimal feeAmt;
    @C8664c("feeType")
    private String feeType;
    @C8664c("feeTypeDictionaryKey")
    private String feeTypeDictionaryKey;
    @C8664c("initialPrincipal")
    private String initialPrincipal;
    @C8664c("insAmt")
    private BigDecimal insAmt;
    @C8664c("intAmt")
    private BigDecimal intAmt;
    @C8664c("nextPayAmt")
    private BigDecimal nextPayAmt;
    @C8664c("payDate")
    private long payDate;
    @C8664c("priAmt")
    private BigDecimal priAmt;
    @C8664c("productDictionaryKey")
    private String productDictionaryKey;
    @C8664c("totalAmt")
    private BigDecimal totalAmt;

    public String getAmount() {
        return C32303f.m95204o(this.totalAmt.doubleValue()) + " " + C32303f.m95197h(this.ccy);
    }

    public String getCcy() {
        return this.ccy;
    }

    public String getDate() {
        return C32319m.m95314u(this.payDate);
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }
}
