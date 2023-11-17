package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LoanInvoiceWrapperApiModel */
public final class LoanInvoiceWrapperApiModel {
    @C8664c("amount")
    private final BigDecimal amount;
    @C8664c("list")
    private final List<LoanInvoiceApiModel> list;
    @C8664c("paymentDate")
    private final long paymentDate;

    public LoanInvoiceWrapperApiModel(long j, BigDecimal bigDecimal, List<LoanInvoiceApiModel> list2) {
        C41536l.m120489i(list2, "list");
        this.paymentDate = j;
        this.amount = bigDecimal;
        this.list = list2;
    }

    public static /* synthetic */ LoanInvoiceWrapperApiModel copy$default(LoanInvoiceWrapperApiModel loanInvoiceWrapperApiModel, long j, BigDecimal bigDecimal, List<LoanInvoiceApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = loanInvoiceWrapperApiModel.paymentDate;
        }
        if ((i & 2) != 0) {
            bigDecimal = loanInvoiceWrapperApiModel.amount;
        }
        if ((i & 4) != 0) {
            list2 = loanInvoiceWrapperApiModel.list;
        }
        return loanInvoiceWrapperApiModel.copy(j, bigDecimal, list2);
    }

    public final long component1() {
        return this.paymentDate;
    }

    public final BigDecimal component2() {
        return this.amount;
    }

    public final List<LoanInvoiceApiModel> component3() {
        return this.list;
    }

    public final LoanInvoiceWrapperApiModel copy(long j, BigDecimal bigDecimal, List<LoanInvoiceApiModel> list2) {
        C41536l.m120489i(list2, "list");
        return new LoanInvoiceWrapperApiModel(j, bigDecimal, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanInvoiceWrapperApiModel)) {
            return false;
        }
        LoanInvoiceWrapperApiModel loanInvoiceWrapperApiModel = (LoanInvoiceWrapperApiModel) obj;
        return this.paymentDate == loanInvoiceWrapperApiModel.paymentDate && C41536l.m120484d(this.amount, loanInvoiceWrapperApiModel.amount) && C41536l.m120484d(this.list, loanInvoiceWrapperApiModel.list);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final List<LoanInvoiceApiModel> getList() {
        return this.list;
    }

    public final long getPaymentDate() {
        return this.paymentDate;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.paymentDate) * 31;
        BigDecimal bigDecimal = this.amount;
        return ((a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.list.hashCode();
    }

    public String toString() {
        long j = this.paymentDate;
        BigDecimal bigDecimal = this.amount;
        List<LoanInvoiceApiModel> list2 = this.list;
        return "LoanInvoiceWrapperApiModel(paymentDate=" + j + ", amount=" + bigDecimal + ", list=" + list2 + ")";
    }
}
