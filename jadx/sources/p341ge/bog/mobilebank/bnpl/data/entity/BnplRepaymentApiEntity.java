package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplRepaymentApiEntity */
public final class BnplRepaymentApiEntity {
    private final Double amountPaid;
    private final String ccy;
    private final Double fee;
    private final String feeType;
    private final String feeTypeDictionaryKey;
    private final String feeTypeDictionaryValue;
    private final Double forgiveFee;
    private final Double forgiveInt;
    private final Double forgiveOdi;
    private final Double graceInt;
    private final Double insAmt;
    private final Double interest;
    private final Long loanKey;
    private final Long paymentDate;
    private final Double penalty;
    private final String primaryKey;
    private final Double principal;
    private final Double rliAmt;
    private final Double scheduledFee;

    public BnplRepaymentApiEntity(String str, Long l, Long l2, String str2, Double d, Double d2, Double d3, Double d4, Double d5, String str3, Double d6, Double d7, Double d8, Double d9, Double d12, Double d13, Double d14, String str4, String str5) {
        this.primaryKey = str;
        this.loanKey = l;
        this.paymentDate = l2;
        this.ccy = str2;
        this.principal = d;
        this.interest = d2;
        this.penalty = d3;
        this.fee = d4;
        this.scheduledFee = d5;
        this.feeType = str3;
        this.insAmt = d6;
        this.rliAmt = d7;
        this.forgiveInt = d8;
        this.forgiveFee = d9;
        this.forgiveOdi = d12;
        this.graceInt = d13;
        this.amountPaid = d14;
        this.feeTypeDictionaryKey = str4;
        this.feeTypeDictionaryValue = str5;
    }

    public static /* synthetic */ BnplRepaymentApiEntity copy$default(BnplRepaymentApiEntity bnplRepaymentApiEntity, String str, Long l, Long l2, String str2, Double d, Double d2, Double d3, Double d4, Double d5, String str3, Double d6, Double d7, Double d8, Double d9, Double d12, Double d13, Double d14, String str4, String str5, int i, Object obj) {
        BnplRepaymentApiEntity bnplRepaymentApiEntity2 = bnplRepaymentApiEntity;
        int i2 = i;
        return bnplRepaymentApiEntity.copy((i2 & 1) != 0 ? bnplRepaymentApiEntity2.primaryKey : str, (i2 & 2) != 0 ? bnplRepaymentApiEntity2.loanKey : l, (i2 & 4) != 0 ? bnplRepaymentApiEntity2.paymentDate : l2, (i2 & 8) != 0 ? bnplRepaymentApiEntity2.ccy : str2, (i2 & 16) != 0 ? bnplRepaymentApiEntity2.principal : d, (i2 & 32) != 0 ? bnplRepaymentApiEntity2.interest : d2, (i2 & 64) != 0 ? bnplRepaymentApiEntity2.penalty : d3, (i2 & 128) != 0 ? bnplRepaymentApiEntity2.fee : d4, (i2 & C11398b.f33139r) != 0 ? bnplRepaymentApiEntity2.scheduledFee : d5, (i2 & C11398b.f33140s) != 0 ? bnplRepaymentApiEntity2.feeType : str3, (i2 & C11398b.f33141t) != 0 ? bnplRepaymentApiEntity2.insAmt : d6, (i2 & C11398b.f33142u) != 0 ? bnplRepaymentApiEntity2.rliAmt : d7, (i2 & C11398b.f33143v) != 0 ? bnplRepaymentApiEntity2.forgiveInt : d8, (i2 & 8192) != 0 ? bnplRepaymentApiEntity2.forgiveFee : d9, (i2 & 16384) != 0 ? bnplRepaymentApiEntity2.forgiveOdi : d12, (i2 & 32768) != 0 ? bnplRepaymentApiEntity2.graceInt : d13, (i2 & 65536) != 0 ? bnplRepaymentApiEntity2.amountPaid : d14, (i2 & 131072) != 0 ? bnplRepaymentApiEntity2.feeTypeDictionaryKey : str4, (i2 & 262144) != 0 ? bnplRepaymentApiEntity2.feeTypeDictionaryValue : str5);
    }

    public final String component1() {
        return this.primaryKey;
    }

    public final String component10() {
        return this.feeType;
    }

    public final Double component11() {
        return this.insAmt;
    }

    public final Double component12() {
        return this.rliAmt;
    }

    public final Double component13() {
        return this.forgiveInt;
    }

    public final Double component14() {
        return this.forgiveFee;
    }

    public final Double component15() {
        return this.forgiveOdi;
    }

    public final Double component16() {
        return this.graceInt;
    }

    public final Double component17() {
        return this.amountPaid;
    }

    public final String component18() {
        return this.feeTypeDictionaryKey;
    }

    public final String component19() {
        return this.feeTypeDictionaryValue;
    }

    public final Long component2() {
        return this.loanKey;
    }

    public final Long component3() {
        return this.paymentDate;
    }

    public final String component4() {
        return this.ccy;
    }

    public final Double component5() {
        return this.principal;
    }

    public final Double component6() {
        return this.interest;
    }

    public final Double component7() {
        return this.penalty;
    }

    public final Double component8() {
        return this.fee;
    }

    public final Double component9() {
        return this.scheduledFee;
    }

    public final BnplRepaymentApiEntity copy(String str, Long l, Long l2, String str2, Double d, Double d2, Double d3, Double d4, Double d5, String str3, Double d6, Double d7, Double d8, Double d9, Double d12, Double d13, Double d14, String str4, String str5) {
        return new BnplRepaymentApiEntity(str, l, l2, str2, d, d2, d3, d4, d5, str3, d6, d7, d8, d9, d12, d13, d14, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplRepaymentApiEntity)) {
            return false;
        }
        BnplRepaymentApiEntity bnplRepaymentApiEntity = (BnplRepaymentApiEntity) obj;
        return C41536l.m120484d(this.primaryKey, bnplRepaymentApiEntity.primaryKey) && C41536l.m120484d(this.loanKey, bnplRepaymentApiEntity.loanKey) && C41536l.m120484d(this.paymentDate, bnplRepaymentApiEntity.paymentDate) && C41536l.m120484d(this.ccy, bnplRepaymentApiEntity.ccy) && C41536l.m120484d(this.principal, bnplRepaymentApiEntity.principal) && C41536l.m120484d(this.interest, bnplRepaymentApiEntity.interest) && C41536l.m120484d(this.penalty, bnplRepaymentApiEntity.penalty) && C41536l.m120484d(this.fee, bnplRepaymentApiEntity.fee) && C41536l.m120484d(this.scheduledFee, bnplRepaymentApiEntity.scheduledFee) && C41536l.m120484d(this.feeType, bnplRepaymentApiEntity.feeType) && C41536l.m120484d(this.insAmt, bnplRepaymentApiEntity.insAmt) && C41536l.m120484d(this.rliAmt, bnplRepaymentApiEntity.rliAmt) && C41536l.m120484d(this.forgiveInt, bnplRepaymentApiEntity.forgiveInt) && C41536l.m120484d(this.forgiveFee, bnplRepaymentApiEntity.forgiveFee) && C41536l.m120484d(this.forgiveOdi, bnplRepaymentApiEntity.forgiveOdi) && C41536l.m120484d(this.graceInt, bnplRepaymentApiEntity.graceInt) && C41536l.m120484d(this.amountPaid, bnplRepaymentApiEntity.amountPaid) && C41536l.m120484d(this.feeTypeDictionaryKey, bnplRepaymentApiEntity.feeTypeDictionaryKey) && C41536l.m120484d(this.feeTypeDictionaryValue, bnplRepaymentApiEntity.feeTypeDictionaryValue);
    }

    public final Double getAmountPaid() {
        return this.amountPaid;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Double getFee() {
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

    public final Double getForgiveFee() {
        return this.forgiveFee;
    }

    public final Double getForgiveInt() {
        return this.forgiveInt;
    }

    public final Double getForgiveOdi() {
        return this.forgiveOdi;
    }

    public final Double getGraceInt() {
        return this.graceInt;
    }

    public final Double getInsAmt() {
        return this.insAmt;
    }

    public final Double getInterest() {
        return this.interest;
    }

    public final Long getLoanKey() {
        return this.loanKey;
    }

    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    public final Double getPenalty() {
        return this.penalty;
    }

    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final Double getPrincipal() {
        return this.principal;
    }

    public final Double getRliAmt() {
        return this.rliAmt;
    }

    public final Double getScheduledFee() {
        return this.scheduledFee;
    }

    public int hashCode() {
        String str = this.primaryKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.loanKey;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.paymentDate;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.ccy;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.principal;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.interest;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.penalty;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.fee;
        int hashCode8 = (hashCode7 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.scheduledFee;
        int hashCode9 = (hashCode8 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str3 = this.feeType;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d6 = this.insAmt;
        int hashCode11 = (hashCode10 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.rliAmt;
        int hashCode12 = (hashCode11 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.forgiveInt;
        int hashCode13 = (hashCode12 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.forgiveFee;
        int hashCode14 = (hashCode13 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d12 = this.forgiveOdi;
        int hashCode15 = (hashCode14 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.graceInt;
        int hashCode16 = (hashCode15 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.amountPaid;
        int hashCode17 = (hashCode16 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.feeTypeDictionaryKey;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.feeTypeDictionaryValue;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        String str = this.primaryKey;
        Long l = this.loanKey;
        Long l2 = this.paymentDate;
        String str2 = this.ccy;
        Double d = this.principal;
        Double d2 = this.interest;
        Double d3 = this.penalty;
        Double d4 = this.fee;
        Double d5 = this.scheduledFee;
        String str3 = this.feeType;
        Double d6 = this.insAmt;
        Double d7 = this.rliAmt;
        Double d8 = this.forgiveInt;
        Double d9 = this.forgiveFee;
        Double d12 = this.forgiveOdi;
        Double d13 = this.graceInt;
        Double d14 = this.amountPaid;
        String str4 = this.feeTypeDictionaryKey;
        String str5 = this.feeTypeDictionaryValue;
        return "BnplRepaymentApiEntity(primaryKey=" + str + ", loanKey=" + l + ", paymentDate=" + l2 + ", ccy=" + str2 + ", principal=" + d + ", interest=" + d2 + ", penalty=" + d3 + ", fee=" + d4 + ", scheduledFee=" + d5 + ", feeType=" + str3 + ", insAmt=" + d6 + ", rliAmt=" + d7 + ", forgiveInt=" + d8 + ", forgiveFee=" + d9 + ", forgiveOdi=" + d12 + ", graceInt=" + d13 + ", amountPaid=" + d14 + ", feeTypeDictionaryKey=" + str4 + ", feeTypeDictionaryValue=" + str5 + ")";
    }
}
