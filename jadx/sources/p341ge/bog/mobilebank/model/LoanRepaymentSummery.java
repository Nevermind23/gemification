package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.LoanRepaymentSummery */
public class LoanRepaymentSummery {
    @C8664c("amountPaid")
    private BigDecimal amountPaid;
    @C8664c("ccy")
    private String ccy;
    @C8664c("initialPrincipal")
    private BigDecimal initialPrincipal;
    @C8664c("interest")
    private BigDecimal interest;
    @C8664c("paymentDate")
    private String paymentDate;
    @C8664c("penalty")
    private BigDecimal penalty;
    @C8664c("principal")
    private BigDecimal principal;
    @C8664c("productDictionaryKey")
    private String productDictionaryKey;
    @C8664c("scheduledFee")
    private BigDecimal scheduledFee;

    public String getCcy() {
        return this.ccy;
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
