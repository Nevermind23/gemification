package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LoanInvoiceApiModel */
public final class LoanInvoiceApiModel {
    @C8664c("amount")
    private final BigDecimal amount;
    @C8664c("ccy")
    private final String ccy;
    @C8664c("feeType")
    private final String feeType;
    @C8664c("invoiceType")
    private final String invoiceType;
    @C8664c("invoiceTypeDictionaryKey")
    private final String invoiceTypeDictionaryKey;
    @C8664c("loanKey")
    private final long loanKey;
    @C8664c("paymentDate")
    private final long paymentDate;

    public LoanInvoiceApiModel(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4) {
        this.loanKey = j;
        this.paymentDate = j2;
        this.invoiceType = str;
        this.feeType = str2;
        this.ccy = str3;
        this.amount = bigDecimal;
        this.invoiceTypeDictionaryKey = str4;
    }

    public static /* synthetic */ LoanInvoiceApiModel copy$default(LoanInvoiceApiModel loanInvoiceApiModel, long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, int i, Object obj) {
        LoanInvoiceApiModel loanInvoiceApiModel2 = loanInvoiceApiModel;
        return loanInvoiceApiModel.copy((i & 1) != 0 ? loanInvoiceApiModel2.loanKey : j, (i & 2) != 0 ? loanInvoiceApiModel2.paymentDate : j2, (i & 4) != 0 ? loanInvoiceApiModel2.invoiceType : str, (i & 8) != 0 ? loanInvoiceApiModel2.feeType : str2, (i & 16) != 0 ? loanInvoiceApiModel2.ccy : str3, (i & 32) != 0 ? loanInvoiceApiModel2.amount : bigDecimal, (i & 64) != 0 ? loanInvoiceApiModel2.invoiceTypeDictionaryKey : str4);
    }

    public final long component1() {
        return this.loanKey;
    }

    public final long component2() {
        return this.paymentDate;
    }

    public final String component3() {
        return this.invoiceType;
    }

    public final String component4() {
        return this.feeType;
    }

    public final String component5() {
        return this.ccy;
    }

    public final BigDecimal component6() {
        return this.amount;
    }

    public final String component7() {
        return this.invoiceTypeDictionaryKey;
    }

    public final LoanInvoiceApiModel copy(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4) {
        return new LoanInvoiceApiModel(j, j2, str, str2, str3, bigDecimal, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanInvoiceApiModel)) {
            return false;
        }
        LoanInvoiceApiModel loanInvoiceApiModel = (LoanInvoiceApiModel) obj;
        return this.loanKey == loanInvoiceApiModel.loanKey && this.paymentDate == loanInvoiceApiModel.paymentDate && C41536l.m120484d(this.invoiceType, loanInvoiceApiModel.invoiceType) && C41536l.m120484d(this.feeType, loanInvoiceApiModel.feeType) && C41536l.m120484d(this.ccy, loanInvoiceApiModel.ccy) && C41536l.m120484d(this.amount, loanInvoiceApiModel.amount) && C41536l.m120484d(this.invoiceTypeDictionaryKey, loanInvoiceApiModel.invoiceTypeDictionaryKey);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getFeeType() {
        return this.feeType;
    }

    public final String getInvoiceType() {
        return this.invoiceType;
    }

    public final String getInvoiceTypeDictionaryKey() {
        return this.invoiceTypeDictionaryKey;
    }

    public final long getLoanKey() {
        return this.loanKey;
    }

    public final long getPaymentDate() {
        return this.paymentDate;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.loanKey) * 31) + C7397t.m28148a(this.paymentDate)) * 31;
        String str = this.invoiceType;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.feeType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ccy;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str4 = this.invoiceTypeDictionaryKey;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.loanKey;
        long j2 = this.paymentDate;
        String str = this.invoiceType;
        String str2 = this.feeType;
        String str3 = this.ccy;
        BigDecimal bigDecimal = this.amount;
        String str4 = this.invoiceTypeDictionaryKey;
        return "LoanInvoiceApiModel(loanKey=" + j + ", paymentDate=" + j2 + ", invoiceType=" + str + ", feeType=" + str2 + ", ccy=" + str3 + ", amount=" + bigDecimal + ", invoiceTypeDictionaryKey=" + str4 + ")";
    }
}
