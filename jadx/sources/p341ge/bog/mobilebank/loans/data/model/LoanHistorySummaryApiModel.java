package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.LoanHistorySummaryApiModel */
public final class LoanHistorySummaryApiModel {
    private final BigDecimal amountPaid;
    private final String ccy;
    private final BigDecimal fee;
    private final String feeTypeDictionaryValue;
    private final BigDecimal forgiveFee;
    private final BigDecimal forgiveInt;
    private final BigDecimal forgiveOdi;
    private final BigDecimal graceInt;
    private final BigDecimal initialPrincipal;
    private final BigDecimal insAmt;
    private final BigDecimal interest;
    private final Long paymentDate;
    private final BigDecimal penalty;
    private final String primaryKey;
    private final BigDecimal principal;
    private final String productDictionaryKey;
    private final BigDecimal rliAmt;
    private final BigDecimal scheduledFee;

    public LoanHistorySummaryApiModel(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, Long l, BigDecimal bigDecimal10, String str3, BigDecimal bigDecimal11, String str4, BigDecimal bigDecimal12, BigDecimal bigDecimal13) {
        this.amountPaid = bigDecimal;
        this.ccy = str;
        this.fee = bigDecimal2;
        this.feeTypeDictionaryValue = str2;
        this.forgiveFee = bigDecimal3;
        this.forgiveInt = bigDecimal4;
        this.forgiveOdi = bigDecimal5;
        this.graceInt = bigDecimal6;
        this.initialPrincipal = bigDecimal7;
        this.insAmt = bigDecimal8;
        this.interest = bigDecimal9;
        this.paymentDate = l;
        this.penalty = bigDecimal10;
        this.primaryKey = str3;
        this.principal = bigDecimal11;
        this.productDictionaryKey = str4;
        this.rliAmt = bigDecimal12;
        this.scheduledFee = bigDecimal13;
    }

    public static /* synthetic */ LoanHistorySummaryApiModel copy$default(LoanHistorySummaryApiModel loanHistorySummaryApiModel, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, Long l, BigDecimal bigDecimal10, String str3, BigDecimal bigDecimal11, String str4, BigDecimal bigDecimal12, BigDecimal bigDecimal13, int i, Object obj) {
        LoanHistorySummaryApiModel loanHistorySummaryApiModel2 = loanHistorySummaryApiModel;
        int i2 = i;
        return loanHistorySummaryApiModel.copy((i2 & 1) != 0 ? loanHistorySummaryApiModel2.amountPaid : bigDecimal, (i2 & 2) != 0 ? loanHistorySummaryApiModel2.ccy : str, (i2 & 4) != 0 ? loanHistorySummaryApiModel2.fee : bigDecimal2, (i2 & 8) != 0 ? loanHistorySummaryApiModel2.feeTypeDictionaryValue : str2, (i2 & 16) != 0 ? loanHistorySummaryApiModel2.forgiveFee : bigDecimal3, (i2 & 32) != 0 ? loanHistorySummaryApiModel2.forgiveInt : bigDecimal4, (i2 & 64) != 0 ? loanHistorySummaryApiModel2.forgiveOdi : bigDecimal5, (i2 & 128) != 0 ? loanHistorySummaryApiModel2.graceInt : bigDecimal6, (i2 & C11398b.f33139r) != 0 ? loanHistorySummaryApiModel2.initialPrincipal : bigDecimal7, (i2 & C11398b.f33140s) != 0 ? loanHistorySummaryApiModel2.insAmt : bigDecimal8, (i2 & C11398b.f33141t) != 0 ? loanHistorySummaryApiModel2.interest : bigDecimal9, (i2 & C11398b.f33142u) != 0 ? loanHistorySummaryApiModel2.paymentDate : l, (i2 & C11398b.f33143v) != 0 ? loanHistorySummaryApiModel2.penalty : bigDecimal10, (i2 & 8192) != 0 ? loanHistorySummaryApiModel2.primaryKey : str3, (i2 & 16384) != 0 ? loanHistorySummaryApiModel2.principal : bigDecimal11, (i2 & 32768) != 0 ? loanHistorySummaryApiModel2.productDictionaryKey : str4, (i2 & 65536) != 0 ? loanHistorySummaryApiModel2.rliAmt : bigDecimal12, (i2 & 131072) != 0 ? loanHistorySummaryApiModel2.scheduledFee : bigDecimal13);
    }

    public final BigDecimal component1() {
        return this.amountPaid;
    }

    public final BigDecimal component10() {
        return this.insAmt;
    }

    public final BigDecimal component11() {
        return this.interest;
    }

    public final Long component12() {
        return this.paymentDate;
    }

    public final BigDecimal component13() {
        return this.penalty;
    }

    public final String component14() {
        return this.primaryKey;
    }

    public final BigDecimal component15() {
        return this.principal;
    }

    public final String component16() {
        return this.productDictionaryKey;
    }

    public final BigDecimal component17() {
        return this.rliAmt;
    }

    public final BigDecimal component18() {
        return this.scheduledFee;
    }

    public final String component2() {
        return this.ccy;
    }

    public final BigDecimal component3() {
        return this.fee;
    }

    public final String component4() {
        return this.feeTypeDictionaryValue;
    }

    public final BigDecimal component5() {
        return this.forgiveFee;
    }

    public final BigDecimal component6() {
        return this.forgiveInt;
    }

    public final BigDecimal component7() {
        return this.forgiveOdi;
    }

    public final BigDecimal component8() {
        return this.graceInt;
    }

    public final BigDecimal component9() {
        return this.initialPrincipal;
    }

    public final LoanHistorySummaryApiModel copy(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, Long l, BigDecimal bigDecimal10, String str3, BigDecimal bigDecimal11, String str4, BigDecimal bigDecimal12, BigDecimal bigDecimal13) {
        return new LoanHistorySummaryApiModel(bigDecimal, str, bigDecimal2, str2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, l, bigDecimal10, str3, bigDecimal11, str4, bigDecimal12, bigDecimal13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanHistorySummaryApiModel)) {
            return false;
        }
        LoanHistorySummaryApiModel loanHistorySummaryApiModel = (LoanHistorySummaryApiModel) obj;
        return C41536l.m120484d(this.amountPaid, loanHistorySummaryApiModel.amountPaid) && C41536l.m120484d(this.ccy, loanHistorySummaryApiModel.ccy) && C41536l.m120484d(this.fee, loanHistorySummaryApiModel.fee) && C41536l.m120484d(this.feeTypeDictionaryValue, loanHistorySummaryApiModel.feeTypeDictionaryValue) && C41536l.m120484d(this.forgiveFee, loanHistorySummaryApiModel.forgiveFee) && C41536l.m120484d(this.forgiveInt, loanHistorySummaryApiModel.forgiveInt) && C41536l.m120484d(this.forgiveOdi, loanHistorySummaryApiModel.forgiveOdi) && C41536l.m120484d(this.graceInt, loanHistorySummaryApiModel.graceInt) && C41536l.m120484d(this.initialPrincipal, loanHistorySummaryApiModel.initialPrincipal) && C41536l.m120484d(this.insAmt, loanHistorySummaryApiModel.insAmt) && C41536l.m120484d(this.interest, loanHistorySummaryApiModel.interest) && C41536l.m120484d(this.paymentDate, loanHistorySummaryApiModel.paymentDate) && C41536l.m120484d(this.penalty, loanHistorySummaryApiModel.penalty) && C41536l.m120484d(this.primaryKey, loanHistorySummaryApiModel.primaryKey) && C41536l.m120484d(this.principal, loanHistorySummaryApiModel.principal) && C41536l.m120484d(this.productDictionaryKey, loanHistorySummaryApiModel.productDictionaryKey) && C41536l.m120484d(this.rliAmt, loanHistorySummaryApiModel.rliAmt) && C41536l.m120484d(this.scheduledFee, loanHistorySummaryApiModel.scheduledFee);
    }

    public final BigDecimal getAmountPaid() {
        return this.amountPaid;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final BigDecimal getFee() {
        return this.fee;
    }

    public final String getFeeTypeDictionaryValue() {
        return this.feeTypeDictionaryValue;
    }

    public final BigDecimal getForgiveFee() {
        return this.forgiveFee;
    }

    public final BigDecimal getForgiveInt() {
        return this.forgiveInt;
    }

    public final BigDecimal getForgiveOdi() {
        return this.forgiveOdi;
    }

    public final BigDecimal getGraceInt() {
        return this.graceInt;
    }

    public final BigDecimal getInitialPrincipal() {
        return this.initialPrincipal;
    }

    public final BigDecimal getInsAmt() {
        return this.insAmt;
    }

    public final BigDecimal getInterest() {
        return this.interest;
    }

    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    public final BigDecimal getPenalty() {
        return this.penalty;
    }

    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final BigDecimal getPrincipal() {
        return this.principal;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final BigDecimal getRliAmt() {
        return this.rliAmt;
    }

    public final BigDecimal getScheduledFee() {
        return this.scheduledFee;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amountPaid;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.ccy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.fee;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.feeTypeDictionaryValue;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.forgiveFee;
        int hashCode5 = (hashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.forgiveInt;
        int hashCode6 = (hashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.forgiveOdi;
        int hashCode7 = (hashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.graceInt;
        int hashCode8 = (hashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.initialPrincipal;
        int hashCode9 = (hashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.insAmt;
        int hashCode10 = (hashCode9 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.interest;
        int hashCode11 = (hashCode10 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        Long l = this.paymentDate;
        int hashCode12 = (hashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.penalty;
        int hashCode13 = (hashCode12 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        String str3 = this.primaryKey;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.principal;
        int hashCode15 = (hashCode14 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        String str4 = this.productDictionaryKey;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.rliAmt;
        int hashCode17 = (hashCode16 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.scheduledFee;
        if (bigDecimal13 != null) {
            i = bigDecimal13.hashCode();
        }
        return hashCode17 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amountPaid;
        String str = this.ccy;
        BigDecimal bigDecimal2 = this.fee;
        String str2 = this.feeTypeDictionaryValue;
        BigDecimal bigDecimal3 = this.forgiveFee;
        BigDecimal bigDecimal4 = this.forgiveInt;
        BigDecimal bigDecimal5 = this.forgiveOdi;
        BigDecimal bigDecimal6 = this.graceInt;
        BigDecimal bigDecimal7 = this.initialPrincipal;
        BigDecimal bigDecimal8 = this.insAmt;
        BigDecimal bigDecimal9 = this.interest;
        Long l = this.paymentDate;
        BigDecimal bigDecimal10 = this.penalty;
        String str3 = this.primaryKey;
        BigDecimal bigDecimal11 = this.principal;
        String str4 = this.productDictionaryKey;
        BigDecimal bigDecimal12 = this.rliAmt;
        BigDecimal bigDecimal13 = this.scheduledFee;
        return "LoanHistorySummaryApiModel(amountPaid=" + bigDecimal + ", ccy=" + str + ", fee=" + bigDecimal2 + ", feeTypeDictionaryValue=" + str2 + ", forgiveFee=" + bigDecimal3 + ", forgiveInt=" + bigDecimal4 + ", forgiveOdi=" + bigDecimal5 + ", graceInt=" + bigDecimal6 + ", initialPrincipal=" + bigDecimal7 + ", insAmt=" + bigDecimal8 + ", interest=" + bigDecimal9 + ", paymentDate=" + l + ", penalty=" + bigDecimal10 + ", primaryKey=" + str3 + ", principal=" + bigDecimal11 + ", productDictionaryKey=" + str4 + ", rliAmt=" + bigDecimal12 + ", scheduledFee=" + bigDecimal13 + ")";
    }
}
