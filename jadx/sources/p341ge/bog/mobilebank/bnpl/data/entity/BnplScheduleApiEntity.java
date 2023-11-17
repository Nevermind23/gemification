package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplScheduleApiEntity */
public final class BnplScheduleApiEntity {
    private final String ccy;
    private final Double exAmt;
    private final Double feeAmt;
    private final String feeType;
    private final String feeTypeDictionaryKey;
    private final String feeTypeDictionaryValue;
    private final Double forgiveFee;
    private final Double forgiveInt;
    private final Double forgiveOdi;
    private final Double graceInt;
    private final Double insAmt;
    private final Double intAmt;
    private final Double intAmtWithoutOffset;
    private final Long loanKey;
    private final String loanNo;
    private final Double nextPayAmt;
    private final Long payDate;
    private final Double priAmt;
    private final String primaryKey;
    private final Double rliAmt;
    private final Double totalAmt;

    public BnplScheduleApiEntity(String str, Long l, String str2, Long l2, String str3, Double d, Double d2, Double d3, String str4, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d12, Double d13, Double d14, Double d15, String str5, String str6) {
        this.primaryKey = str;
        this.loanKey = l;
        this.loanNo = str2;
        this.payDate = l2;
        this.ccy = str3;
        this.priAmt = d;
        this.intAmt = d2;
        this.feeAmt = d3;
        this.feeType = str4;
        this.exAmt = d4;
        this.insAmt = d5;
        this.rliAmt = d6;
        this.forgiveInt = d7;
        this.forgiveFee = d8;
        this.forgiveOdi = d9;
        this.graceInt = d12;
        this.totalAmt = d13;
        this.nextPayAmt = d14;
        this.intAmtWithoutOffset = d15;
        this.feeTypeDictionaryKey = str5;
        this.feeTypeDictionaryValue = str6;
    }

    public static /* synthetic */ BnplScheduleApiEntity copy$default(BnplScheduleApiEntity bnplScheduleApiEntity, String str, Long l, String str2, Long l2, String str3, Double d, Double d2, Double d3, String str4, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d12, Double d13, Double d14, Double d15, String str5, String str6, int i, Object obj) {
        BnplScheduleApiEntity bnplScheduleApiEntity2 = bnplScheduleApiEntity;
        int i2 = i;
        return bnplScheduleApiEntity.copy((i2 & 1) != 0 ? bnplScheduleApiEntity2.primaryKey : str, (i2 & 2) != 0 ? bnplScheduleApiEntity2.loanKey : l, (i2 & 4) != 0 ? bnplScheduleApiEntity2.loanNo : str2, (i2 & 8) != 0 ? bnplScheduleApiEntity2.payDate : l2, (i2 & 16) != 0 ? bnplScheduleApiEntity2.ccy : str3, (i2 & 32) != 0 ? bnplScheduleApiEntity2.priAmt : d, (i2 & 64) != 0 ? bnplScheduleApiEntity2.intAmt : d2, (i2 & 128) != 0 ? bnplScheduleApiEntity2.feeAmt : d3, (i2 & C11398b.f33139r) != 0 ? bnplScheduleApiEntity2.feeType : str4, (i2 & C11398b.f33140s) != 0 ? bnplScheduleApiEntity2.exAmt : d4, (i2 & C11398b.f33141t) != 0 ? bnplScheduleApiEntity2.insAmt : d5, (i2 & C11398b.f33142u) != 0 ? bnplScheduleApiEntity2.rliAmt : d6, (i2 & C11398b.f33143v) != 0 ? bnplScheduleApiEntity2.forgiveInt : d7, (i2 & 8192) != 0 ? bnplScheduleApiEntity2.forgiveFee : d8, (i2 & 16384) != 0 ? bnplScheduleApiEntity2.forgiveOdi : d9, (i2 & 32768) != 0 ? bnplScheduleApiEntity2.graceInt : d12, (i2 & 65536) != 0 ? bnplScheduleApiEntity2.totalAmt : d13, (i2 & 131072) != 0 ? bnplScheduleApiEntity2.nextPayAmt : d14, (i2 & 262144) != 0 ? bnplScheduleApiEntity2.intAmtWithoutOffset : d15, (i2 & 524288) != 0 ? bnplScheduleApiEntity2.feeTypeDictionaryKey : str5, (i2 & 1048576) != 0 ? bnplScheduleApiEntity2.feeTypeDictionaryValue : str6);
    }

    public final String component1() {
        return this.primaryKey;
    }

    public final Double component10() {
        return this.exAmt;
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
        return this.totalAmt;
    }

    public final Double component18() {
        return this.nextPayAmt;
    }

    public final Double component19() {
        return this.intAmtWithoutOffset;
    }

    public final Long component2() {
        return this.loanKey;
    }

    public final String component20() {
        return this.feeTypeDictionaryKey;
    }

    public final String component21() {
        return this.feeTypeDictionaryValue;
    }

    public final String component3() {
        return this.loanNo;
    }

    public final Long component4() {
        return this.payDate;
    }

    public final String component5() {
        return this.ccy;
    }

    public final Double component6() {
        return this.priAmt;
    }

    public final Double component7() {
        return this.intAmt;
    }

    public final Double component8() {
        return this.feeAmt;
    }

    public final String component9() {
        return this.feeType;
    }

    public final BnplScheduleApiEntity copy(String str, Long l, String str2, Long l2, String str3, Double d, Double d2, Double d3, String str4, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d12, Double d13, Double d14, Double d15, String str5, String str6) {
        return new BnplScheduleApiEntity(str, l, str2, l2, str3, d, d2, d3, str4, d4, d5, d6, d7, d8, d9, d12, d13, d14, d15, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplScheduleApiEntity)) {
            return false;
        }
        BnplScheduleApiEntity bnplScheduleApiEntity = (BnplScheduleApiEntity) obj;
        return C41536l.m120484d(this.primaryKey, bnplScheduleApiEntity.primaryKey) && C41536l.m120484d(this.loanKey, bnplScheduleApiEntity.loanKey) && C41536l.m120484d(this.loanNo, bnplScheduleApiEntity.loanNo) && C41536l.m120484d(this.payDate, bnplScheduleApiEntity.payDate) && C41536l.m120484d(this.ccy, bnplScheduleApiEntity.ccy) && C41536l.m120484d(this.priAmt, bnplScheduleApiEntity.priAmt) && C41536l.m120484d(this.intAmt, bnplScheduleApiEntity.intAmt) && C41536l.m120484d(this.feeAmt, bnplScheduleApiEntity.feeAmt) && C41536l.m120484d(this.feeType, bnplScheduleApiEntity.feeType) && C41536l.m120484d(this.exAmt, bnplScheduleApiEntity.exAmt) && C41536l.m120484d(this.insAmt, bnplScheduleApiEntity.insAmt) && C41536l.m120484d(this.rliAmt, bnplScheduleApiEntity.rliAmt) && C41536l.m120484d(this.forgiveInt, bnplScheduleApiEntity.forgiveInt) && C41536l.m120484d(this.forgiveFee, bnplScheduleApiEntity.forgiveFee) && C41536l.m120484d(this.forgiveOdi, bnplScheduleApiEntity.forgiveOdi) && C41536l.m120484d(this.graceInt, bnplScheduleApiEntity.graceInt) && C41536l.m120484d(this.totalAmt, bnplScheduleApiEntity.totalAmt) && C41536l.m120484d(this.nextPayAmt, bnplScheduleApiEntity.nextPayAmt) && C41536l.m120484d(this.intAmtWithoutOffset, bnplScheduleApiEntity.intAmtWithoutOffset) && C41536l.m120484d(this.feeTypeDictionaryKey, bnplScheduleApiEntity.feeTypeDictionaryKey) && C41536l.m120484d(this.feeTypeDictionaryValue, bnplScheduleApiEntity.feeTypeDictionaryValue);
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Double getExAmt() {
        return this.exAmt;
    }

    public final Double getFeeAmt() {
        return this.feeAmt;
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

    public final Double getIntAmt() {
        return this.intAmt;
    }

    public final Double getIntAmtWithoutOffset() {
        return this.intAmtWithoutOffset;
    }

    public final Long getLoanKey() {
        return this.loanKey;
    }

    public final String getLoanNo() {
        return this.loanNo;
    }

    public final Double getNextPayAmt() {
        return this.nextPayAmt;
    }

    public final Long getPayDate() {
        return this.payDate;
    }

    public final Double getPriAmt() {
        return this.priAmt;
    }

    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final Double getRliAmt() {
        return this.rliAmt;
    }

    public final Double getTotalAmt() {
        return this.totalAmt;
    }

    public int hashCode() {
        String str = this.primaryKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.loanKey;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.loanNo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.payDate;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.ccy;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.priAmt;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.intAmt;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.feeAmt;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str4 = this.feeType;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.exAmt;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.insAmt;
        int hashCode11 = (hashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.rliAmt;
        int hashCode12 = (hashCode11 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.forgiveInt;
        int hashCode13 = (hashCode12 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.forgiveFee;
        int hashCode14 = (hashCode13 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.forgiveOdi;
        int hashCode15 = (hashCode14 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d12 = this.graceInt;
        int hashCode16 = (hashCode15 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.totalAmt;
        int hashCode17 = (hashCode16 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.nextPayAmt;
        int hashCode18 = (hashCode17 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.intAmtWithoutOffset;
        int hashCode19 = (hashCode18 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str5 = this.feeTypeDictionaryKey;
        int hashCode20 = (hashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.feeTypeDictionaryValue;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode20 + i;
    }

    public String toString() {
        String str = this.primaryKey;
        Long l = this.loanKey;
        String str2 = this.loanNo;
        Long l2 = this.payDate;
        String str3 = this.ccy;
        Double d = this.priAmt;
        Double d2 = this.intAmt;
        Double d3 = this.feeAmt;
        String str4 = this.feeType;
        Double d4 = this.exAmt;
        Double d5 = this.insAmt;
        Double d6 = this.rliAmt;
        Double d7 = this.forgiveInt;
        Double d8 = this.forgiveFee;
        Double d9 = this.forgiveOdi;
        Double d12 = this.graceInt;
        Double d13 = this.totalAmt;
        Double d14 = this.nextPayAmt;
        Double d15 = this.intAmtWithoutOffset;
        String str5 = this.feeTypeDictionaryKey;
        String str6 = this.feeTypeDictionaryValue;
        return "BnplScheduleApiEntity(primaryKey=" + str + ", loanKey=" + l + ", loanNo=" + str2 + ", payDate=" + l2 + ", ccy=" + str3 + ", priAmt=" + d + ", intAmt=" + d2 + ", feeAmt=" + d3 + ", feeType=" + str4 + ", exAmt=" + d4 + ", insAmt=" + d5 + ", rliAmt=" + d6 + ", forgiveInt=" + d7 + ", forgiveFee=" + d8 + ", forgiveOdi=" + d9 + ", graceInt=" + d12 + ", totalAmt=" + d13 + ", nextPayAmt=" + d14 + ", intAmtWithoutOffset=" + d15 + ", feeTypeDictionaryKey=" + str5 + ", feeTypeDictionaryValue=" + str6 + ")";
    }
}
