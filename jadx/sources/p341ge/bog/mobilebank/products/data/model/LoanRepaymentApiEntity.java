package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LoanRepaymentApiEntity */
public final class LoanRepaymentApiEntity {
    @C8664c("amountPaid")
    private final BigDecimal amountPaid;
    @C8664c("ccy")
    private final String ccy;
    @C8664c("interest")
    private final BigDecimal interest;
    @C8664c("loanKey")
    private final long loanKey;
    @C8664c("paymentDate")
    private final String paymentDate;
    @C8664c("penalty")
    private final BigDecimal penalty;
    @C8664c("principal")
    private final BigDecimal principal;
    @C8664c("receiptKey")
    private final long receiptKey;
    @C8664c("scheduledFee")
    private final BigDecimal scheduledFee;

    public LoanRepaymentApiEntity(long j, long j2, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str2) {
        this.receiptKey = j;
        this.loanKey = j2;
        this.paymentDate = str;
        this.principal = bigDecimal;
        this.interest = bigDecimal2;
        this.penalty = bigDecimal3;
        this.scheduledFee = bigDecimal4;
        this.amountPaid = bigDecimal5;
        this.ccy = str2;
    }

    public static /* synthetic */ LoanRepaymentApiEntity copy$default(LoanRepaymentApiEntity loanRepaymentApiEntity, long j, long j2, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str2, int i, Object obj) {
        LoanRepaymentApiEntity loanRepaymentApiEntity2 = loanRepaymentApiEntity;
        int i2 = i;
        return loanRepaymentApiEntity.copy((i2 & 1) != 0 ? loanRepaymentApiEntity2.receiptKey : j, (i2 & 2) != 0 ? loanRepaymentApiEntity2.loanKey : j2, (i2 & 4) != 0 ? loanRepaymentApiEntity2.paymentDate : str, (i2 & 8) != 0 ? loanRepaymentApiEntity2.principal : bigDecimal, (i2 & 16) != 0 ? loanRepaymentApiEntity2.interest : bigDecimal2, (i2 & 32) != 0 ? loanRepaymentApiEntity2.penalty : bigDecimal3, (i2 & 64) != 0 ? loanRepaymentApiEntity2.scheduledFee : bigDecimal4, (i2 & 128) != 0 ? loanRepaymentApiEntity2.amountPaid : bigDecimal5, (i2 & C11398b.f33139r) != 0 ? loanRepaymentApiEntity2.ccy : str2);
    }

    public final long component1() {
        return this.receiptKey;
    }

    public final long component2() {
        return this.loanKey;
    }

    public final String component3() {
        return this.paymentDate;
    }

    public final BigDecimal component4() {
        return this.principal;
    }

    public final BigDecimal component5() {
        return this.interest;
    }

    public final BigDecimal component6() {
        return this.penalty;
    }

    public final BigDecimal component7() {
        return this.scheduledFee;
    }

    public final BigDecimal component8() {
        return this.amountPaid;
    }

    public final String component9() {
        return this.ccy;
    }

    public final LoanRepaymentApiEntity copy(long j, long j2, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str2) {
        return new LoanRepaymentApiEntity(j, j2, str, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanRepaymentApiEntity)) {
            return false;
        }
        LoanRepaymentApiEntity loanRepaymentApiEntity = (LoanRepaymentApiEntity) obj;
        return this.receiptKey == loanRepaymentApiEntity.receiptKey && this.loanKey == loanRepaymentApiEntity.loanKey && C41536l.m120484d(this.paymentDate, loanRepaymentApiEntity.paymentDate) && C41536l.m120484d(this.principal, loanRepaymentApiEntity.principal) && C41536l.m120484d(this.interest, loanRepaymentApiEntity.interest) && C41536l.m120484d(this.penalty, loanRepaymentApiEntity.penalty) && C41536l.m120484d(this.scheduledFee, loanRepaymentApiEntity.scheduledFee) && C41536l.m120484d(this.amountPaid, loanRepaymentApiEntity.amountPaid) && C41536l.m120484d(this.ccy, loanRepaymentApiEntity.ccy);
    }

    public final BigDecimal getAmountPaid() {
        return this.amountPaid;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final BigDecimal getInterest() {
        return this.interest;
    }

    public final long getLoanKey() {
        return this.loanKey;
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

    public final long getReceiptKey() {
        return this.receiptKey;
    }

    public final BigDecimal getScheduledFee() {
        return this.scheduledFee;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.receiptKey) * 31) + C7397t.m28148a(this.loanKey)) * 31;
        String str = this.paymentDate;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.principal;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.interest;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.penalty;
        int hashCode4 = (hashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.scheduledFee;
        int hashCode5 = (hashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.amountPaid;
        int hashCode6 = (hashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str2 = this.ccy;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        long j = this.receiptKey;
        long j2 = this.loanKey;
        String str = this.paymentDate;
        BigDecimal bigDecimal = this.principal;
        BigDecimal bigDecimal2 = this.interest;
        BigDecimal bigDecimal3 = this.penalty;
        BigDecimal bigDecimal4 = this.scheduledFee;
        BigDecimal bigDecimal5 = this.amountPaid;
        String str2 = this.ccy;
        return "LoanRepaymentApiEntity(receiptKey=" + j + ", loanKey=" + j2 + ", paymentDate=" + str + ", principal=" + bigDecimal + ", interest=" + bigDecimal2 + ", penalty=" + bigDecimal3 + ", scheduledFee=" + bigDecimal4 + ", amountPaid=" + bigDecimal5 + ", ccy=" + str2 + ")";
    }
}
