package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LoanRepaymentSummeryApiEntity */
public final class LoanRepaymentSummeryApiEntity {
    @C8664c("amountPaid")
    private final BigDecimal amountPaid;
    @C8664c("ccy")
    private final String ccy;
    @C8664c("initialPrincipal")
    private final BigDecimal initialPrincipal;
    @C8664c("interest")
    private final BigDecimal interest;
    @C8664c("paymentDate")
    private final String paymentDate;
    @C8664c("penalty")
    private final BigDecimal penalty;
    @C8664c("principal")
    private final BigDecimal principal;
    @C8664c("productDictionaryKey")
    private String productDictionaryKey;
    @C8664c("scheduledFee")
    private final BigDecimal scheduledFee;

    public final BigDecimal getAmountPaid() {
        return this.amountPaid;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final BigDecimal getInitialPrincipal() {
        return this.initialPrincipal;
    }

    public final BigDecimal getInterest() {
        return this.interest;
    }

    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public final BigDecimal getPenalty() {
        return this.penalty;
    }

    public final BigDecimal getPrincipal() {
        return this.principal;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final BigDecimal getScheduledFee() {
        return this.scheduledFee;
    }

    public final void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }
}
