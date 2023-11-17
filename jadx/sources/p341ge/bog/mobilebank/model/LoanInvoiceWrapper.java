package p341ge.bog.mobilebank.model;

import g91.C32319m;
import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.LoanInvoiceWrapper */
public class LoanInvoiceWrapper {
    @C8664c("amount")
    private BigDecimal amount;
    @C8664c("isOverdue")
    public Boolean isOverdue;
    @C8664c("list")
    private LoanInvoice[] list;
    @C8664c("paymentDate")
    private long paymentDate;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getInvoicePaymentDate() {
        long j = this.paymentDate;
        if (j == 0) {
            return "";
        }
        return C32319m.m95314u(j);
    }

    public LoanInvoice[] getList() {
        return this.list;
    }

    public long getPaymentDate() {
        return this.paymentDate;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setList(LoanInvoice[] loanInvoiceArr) {
        this.list = loanInvoiceArr;
    }
}
