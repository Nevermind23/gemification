package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.RepaymentApiModel */
public final class RepaymentApiModel {
    private final BigDecimal amountPaid;
    private final String ccy;
    private final BigDecimal fee;
    private final String feeType;
    private final String feeTypeDictionaryKey;
    private final String feeTypeDictionaryValue;
    private final BigDecimal forgiveFee;
    private final BigDecimal forgiveInt;
    private final BigDecimal forgiveOdi;
    private final BigDecimal graceInt;
    private final BigDecimal insAmt;
    private final BigDecimal interest;
    private final Long loanKey;
    private final Long paymentDate;
    private final BigDecimal penalty;
    private final String primaryKey;
    private final BigDecimal principal;
    private final BigDecimal rliAmt;
    private final BigDecimal scheduledFee;

    public RepaymentApiModel(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, String str3, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Long l, Long l2, BigDecimal bigDecimal9, String str5, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12) {
        this.amountPaid = bigDecimal;
        this.ccy = str;
        this.fee = bigDecimal2;
        this.feeType = str2;
        this.feeTypeDictionaryKey = str3;
        this.feeTypeDictionaryValue = str4;
        this.forgiveFee = bigDecimal3;
        this.forgiveInt = bigDecimal4;
        this.forgiveOdi = bigDecimal5;
        this.graceInt = bigDecimal6;
        this.insAmt = bigDecimal7;
        this.interest = bigDecimal8;
        this.loanKey = l;
        this.paymentDate = l2;
        this.penalty = bigDecimal9;
        this.primaryKey = str5;
        this.principal = bigDecimal10;
        this.rliAmt = bigDecimal11;
        this.scheduledFee = bigDecimal12;
    }

    public static /* synthetic */ RepaymentApiModel copy$default(RepaymentApiModel repaymentApiModel, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, String str3, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Long l, Long l2, BigDecimal bigDecimal9, String str5, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, int i, Object obj) {
        RepaymentApiModel repaymentApiModel2 = repaymentApiModel;
        int i2 = i;
        return repaymentApiModel.copy((i2 & 1) != 0 ? repaymentApiModel2.amountPaid : bigDecimal, (i2 & 2) != 0 ? repaymentApiModel2.ccy : str, (i2 & 4) != 0 ? repaymentApiModel2.fee : bigDecimal2, (i2 & 8) != 0 ? repaymentApiModel2.feeType : str2, (i2 & 16) != 0 ? repaymentApiModel2.feeTypeDictionaryKey : str3, (i2 & 32) != 0 ? repaymentApiModel2.feeTypeDictionaryValue : str4, (i2 & 64) != 0 ? repaymentApiModel2.forgiveFee : bigDecimal3, (i2 & 128) != 0 ? repaymentApiModel2.forgiveInt : bigDecimal4, (i2 & C11398b.f33139r) != 0 ? repaymentApiModel2.forgiveOdi : bigDecimal5, (i2 & C11398b.f33140s) != 0 ? repaymentApiModel2.graceInt : bigDecimal6, (i2 & C11398b.f33141t) != 0 ? repaymentApiModel2.insAmt : bigDecimal7, (i2 & C11398b.f33142u) != 0 ? repaymentApiModel2.interest : bigDecimal8, (i2 & C11398b.f33143v) != 0 ? repaymentApiModel2.loanKey : l, (i2 & 8192) != 0 ? repaymentApiModel2.paymentDate : l2, (i2 & 16384) != 0 ? repaymentApiModel2.penalty : bigDecimal9, (i2 & 32768) != 0 ? repaymentApiModel2.primaryKey : str5, (i2 & 65536) != 0 ? repaymentApiModel2.principal : bigDecimal10, (i2 & 131072) != 0 ? repaymentApiModel2.rliAmt : bigDecimal11, (i2 & 262144) != 0 ? repaymentApiModel2.scheduledFee : bigDecimal12);
    }

    public final BigDecimal component1() {
        return this.amountPaid;
    }

    public final BigDecimal component10() {
        return this.graceInt;
    }

    public final BigDecimal component11() {
        return this.insAmt;
    }

    public final BigDecimal component12() {
        return this.interest;
    }

    public final Long component13() {
        return this.loanKey;
    }

    public final Long component14() {
        return this.paymentDate;
    }

    public final BigDecimal component15() {
        return this.penalty;
    }

    public final String component16() {
        return this.primaryKey;
    }

    public final BigDecimal component17() {
        return this.principal;
    }

    public final BigDecimal component18() {
        return this.rliAmt;
    }

    public final BigDecimal component19() {
        return this.scheduledFee;
    }

    public final String component2() {
        return this.ccy;
    }

    public final BigDecimal component3() {
        return this.fee;
    }

    public final String component4() {
        return this.feeType;
    }

    public final String component5() {
        return this.feeTypeDictionaryKey;
    }

    public final String component6() {
        return this.feeTypeDictionaryValue;
    }

    public final BigDecimal component7() {
        return this.forgiveFee;
    }

    public final BigDecimal component8() {
        return this.forgiveInt;
    }

    public final BigDecimal component9() {
        return this.forgiveOdi;
    }

    public final RepaymentApiModel copy(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, String str3, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Long l, Long l2, BigDecimal bigDecimal9, String str5, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12) {
        return new RepaymentApiModel(bigDecimal, str, bigDecimal2, str2, str3, str4, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, l, l2, bigDecimal9, str5, bigDecimal10, bigDecimal11, bigDecimal12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepaymentApiModel)) {
            return false;
        }
        RepaymentApiModel repaymentApiModel = (RepaymentApiModel) obj;
        return C41536l.m120484d(this.amountPaid, repaymentApiModel.amountPaid) && C41536l.m120484d(this.ccy, repaymentApiModel.ccy) && C41536l.m120484d(this.fee, repaymentApiModel.fee) && C41536l.m120484d(this.feeType, repaymentApiModel.feeType) && C41536l.m120484d(this.feeTypeDictionaryKey, repaymentApiModel.feeTypeDictionaryKey) && C41536l.m120484d(this.feeTypeDictionaryValue, repaymentApiModel.feeTypeDictionaryValue) && C41536l.m120484d(this.forgiveFee, repaymentApiModel.forgiveFee) && C41536l.m120484d(this.forgiveInt, repaymentApiModel.forgiveInt) && C41536l.m120484d(this.forgiveOdi, repaymentApiModel.forgiveOdi) && C41536l.m120484d(this.graceInt, repaymentApiModel.graceInt) && C41536l.m120484d(this.insAmt, repaymentApiModel.insAmt) && C41536l.m120484d(this.interest, repaymentApiModel.interest) && C41536l.m120484d(this.loanKey, repaymentApiModel.loanKey) && C41536l.m120484d(this.paymentDate, repaymentApiModel.paymentDate) && C41536l.m120484d(this.penalty, repaymentApiModel.penalty) && C41536l.m120484d(this.primaryKey, repaymentApiModel.primaryKey) && C41536l.m120484d(this.principal, repaymentApiModel.principal) && C41536l.m120484d(this.rliAmt, repaymentApiModel.rliAmt) && C41536l.m120484d(this.scheduledFee, repaymentApiModel.scheduledFee);
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

    public final String getFeeType() {
        return this.feeType;
    }

    public final String getFeeTypeDictionaryKey() {
        return this.feeTypeDictionaryKey;
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

    public final BigDecimal getInsAmt() {
        return this.insAmt;
    }

    public final BigDecimal getInterest() {
        return this.interest;
    }

    public final Long getLoanKey() {
        return this.loanKey;
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
        String str2 = this.feeType;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feeTypeDictionaryKey;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.feeTypeDictionaryValue;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.forgiveFee;
        int hashCode7 = (hashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.forgiveInt;
        int hashCode8 = (hashCode7 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.forgiveOdi;
        int hashCode9 = (hashCode8 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.graceInt;
        int hashCode10 = (hashCode9 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.insAmt;
        int hashCode11 = (hashCode10 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.interest;
        int hashCode12 = (hashCode11 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Long l = this.loanKey;
        int hashCode13 = (hashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.paymentDate;
        int hashCode14 = (hashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.penalty;
        int hashCode15 = (hashCode14 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        String str5 = this.primaryKey;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.principal;
        int hashCode17 = (hashCode16 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.rliAmt;
        int hashCode18 = (hashCode17 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.scheduledFee;
        if (bigDecimal12 != null) {
            i = bigDecimal12.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amountPaid;
        String str = this.ccy;
        BigDecimal bigDecimal2 = this.fee;
        String str2 = this.feeType;
        String str3 = this.feeTypeDictionaryKey;
        String str4 = this.feeTypeDictionaryValue;
        BigDecimal bigDecimal3 = this.forgiveFee;
        BigDecimal bigDecimal4 = this.forgiveInt;
        BigDecimal bigDecimal5 = this.forgiveOdi;
        BigDecimal bigDecimal6 = this.graceInt;
        BigDecimal bigDecimal7 = this.insAmt;
        BigDecimal bigDecimal8 = this.interest;
        Long l = this.loanKey;
        Long l2 = this.paymentDate;
        BigDecimal bigDecimal9 = this.penalty;
        String str5 = this.primaryKey;
        BigDecimal bigDecimal10 = this.principal;
        BigDecimal bigDecimal11 = this.rliAmt;
        BigDecimal bigDecimal12 = this.scheduledFee;
        return "RepaymentApiModel(amountPaid=" + bigDecimal + ", ccy=" + str + ", fee=" + bigDecimal2 + ", feeType=" + str2 + ", feeTypeDictionaryKey=" + str3 + ", feeTypeDictionaryValue=" + str4 + ", forgiveFee=" + bigDecimal3 + ", forgiveInt=" + bigDecimal4 + ", forgiveOdi=" + bigDecimal5 + ", graceInt=" + bigDecimal6 + ", insAmt=" + bigDecimal7 + ", interest=" + bigDecimal8 + ", loanKey=" + l + ", paymentDate=" + l2 + ", penalty=" + bigDecimal9 + ", primaryKey=" + str5 + ", principal=" + bigDecimal10 + ", rliAmt=" + bigDecimal11 + ", scheduledFee=" + bigDecimal12 + ")";
    }
}
