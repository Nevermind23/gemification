package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplDetailsScheduleApiEntity */
public final class BnplDetailsScheduleApiEntity {
    private final String ccy;
    private final Double exAmt;
    private final Double feeAmt;
    private final String feeType;
    private final String feeTypeDictionaryKey;
    private final String feeTypeDictionaryValue;
    private final Double intAmt;
    private final Double intAmtWithoutOffset;
    private final long loanKey;
    private final String loanNo;
    private final Double nextPayAmt;
    private final Long payDate;
    private final Double priAmt;
    private final String primaryKey;
    private final Double totalAmt;

    public BnplDetailsScheduleApiEntity(String str, long j, String str2, Long l, String str3, Double d, Double d2, Double d3, String str4, Double d4, Double d5, Double d6, Double d7, String str5, String str6) {
        C41536l.m120489i(str, "primaryKey");
        this.primaryKey = str;
        this.loanKey = j;
        this.loanNo = str2;
        this.payDate = l;
        this.ccy = str3;
        this.priAmt = d;
        this.intAmt = d2;
        this.feeAmt = d3;
        this.feeType = str4;
        this.exAmt = d4;
        this.totalAmt = d5;
        this.nextPayAmt = d6;
        this.intAmtWithoutOffset = d7;
        this.feeTypeDictionaryKey = str5;
        this.feeTypeDictionaryValue = str6;
    }

    public static /* synthetic */ BnplDetailsScheduleApiEntity copy$default(BnplDetailsScheduleApiEntity bnplDetailsScheduleApiEntity, String str, long j, String str2, Long l, String str3, Double d, Double d2, Double d3, String str4, Double d4, Double d5, Double d6, Double d7, String str5, String str6, int i, Object obj) {
        BnplDetailsScheduleApiEntity bnplDetailsScheduleApiEntity2 = bnplDetailsScheduleApiEntity;
        int i2 = i;
        return bnplDetailsScheduleApiEntity.copy((i2 & 1) != 0 ? bnplDetailsScheduleApiEntity2.primaryKey : str, (i2 & 2) != 0 ? bnplDetailsScheduleApiEntity2.loanKey : j, (i2 & 4) != 0 ? bnplDetailsScheduleApiEntity2.loanNo : str2, (i2 & 8) != 0 ? bnplDetailsScheduleApiEntity2.payDate : l, (i2 & 16) != 0 ? bnplDetailsScheduleApiEntity2.ccy : str3, (i2 & 32) != 0 ? bnplDetailsScheduleApiEntity2.priAmt : d, (i2 & 64) != 0 ? bnplDetailsScheduleApiEntity2.intAmt : d2, (i2 & 128) != 0 ? bnplDetailsScheduleApiEntity2.feeAmt : d3, (i2 & C11398b.f33139r) != 0 ? bnplDetailsScheduleApiEntity2.feeType : str4, (i2 & C11398b.f33140s) != 0 ? bnplDetailsScheduleApiEntity2.exAmt : d4, (i2 & C11398b.f33141t) != 0 ? bnplDetailsScheduleApiEntity2.totalAmt : d5, (i2 & C11398b.f33142u) != 0 ? bnplDetailsScheduleApiEntity2.nextPayAmt : d6, (i2 & C11398b.f33143v) != 0 ? bnplDetailsScheduleApiEntity2.intAmtWithoutOffset : d7, (i2 & 8192) != 0 ? bnplDetailsScheduleApiEntity2.feeTypeDictionaryKey : str5, (i2 & 16384) != 0 ? bnplDetailsScheduleApiEntity2.feeTypeDictionaryValue : str6);
    }

    public final String component1() {
        return this.primaryKey;
    }

    public final Double component10() {
        return this.exAmt;
    }

    public final Double component11() {
        return this.totalAmt;
    }

    public final Double component12() {
        return this.nextPayAmt;
    }

    public final Double component13() {
        return this.intAmtWithoutOffset;
    }

    public final String component14() {
        return this.feeTypeDictionaryKey;
    }

    public final String component15() {
        return this.feeTypeDictionaryValue;
    }

    public final long component2() {
        return this.loanKey;
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

    public final BnplDetailsScheduleApiEntity copy(String str, long j, String str2, Long l, String str3, Double d, Double d2, Double d3, String str4, Double d4, Double d5, Double d6, Double d7, String str5, String str6) {
        String str7 = str;
        String str8 = str7;
        C41536l.m120489i(str7, "primaryKey");
        return new BnplDetailsScheduleApiEntity(str7, j, str2, l, str3, d, d2, d3, str4, d4, d5, d6, d7, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplDetailsScheduleApiEntity)) {
            return false;
        }
        BnplDetailsScheduleApiEntity bnplDetailsScheduleApiEntity = (BnplDetailsScheduleApiEntity) obj;
        return C41536l.m120484d(this.primaryKey, bnplDetailsScheduleApiEntity.primaryKey) && this.loanKey == bnplDetailsScheduleApiEntity.loanKey && C41536l.m120484d(this.loanNo, bnplDetailsScheduleApiEntity.loanNo) && C41536l.m120484d(this.payDate, bnplDetailsScheduleApiEntity.payDate) && C41536l.m120484d(this.ccy, bnplDetailsScheduleApiEntity.ccy) && C41536l.m120484d(this.priAmt, bnplDetailsScheduleApiEntity.priAmt) && C41536l.m120484d(this.intAmt, bnplDetailsScheduleApiEntity.intAmt) && C41536l.m120484d(this.feeAmt, bnplDetailsScheduleApiEntity.feeAmt) && C41536l.m120484d(this.feeType, bnplDetailsScheduleApiEntity.feeType) && C41536l.m120484d(this.exAmt, bnplDetailsScheduleApiEntity.exAmt) && C41536l.m120484d(this.totalAmt, bnplDetailsScheduleApiEntity.totalAmt) && C41536l.m120484d(this.nextPayAmt, bnplDetailsScheduleApiEntity.nextPayAmt) && C41536l.m120484d(this.intAmtWithoutOffset, bnplDetailsScheduleApiEntity.intAmtWithoutOffset) && C41536l.m120484d(this.feeTypeDictionaryKey, bnplDetailsScheduleApiEntity.feeTypeDictionaryKey) && C41536l.m120484d(this.feeTypeDictionaryValue, bnplDetailsScheduleApiEntity.feeTypeDictionaryValue);
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

    public final Double getIntAmt() {
        return this.intAmt;
    }

    public final Double getIntAmtWithoutOffset() {
        return this.intAmtWithoutOffset;
    }

    public final long getLoanKey() {
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

    public final Double getTotalAmt() {
        return this.totalAmt;
    }

    public int hashCode() {
        int hashCode = ((this.primaryKey.hashCode() * 31) + C7397t.m28148a(this.loanKey)) * 31;
        String str = this.loanNo;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.payDate;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.ccy;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.priAmt;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.intAmt;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.feeAmt;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str3 = this.feeType;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d4 = this.exAmt;
        int hashCode9 = (hashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.totalAmt;
        int hashCode10 = (hashCode9 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.nextPayAmt;
        int hashCode11 = (hashCode10 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.intAmtWithoutOffset;
        int hashCode12 = (hashCode11 + (d7 == null ? 0 : d7.hashCode())) * 31;
        String str4 = this.feeTypeDictionaryKey;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.feeTypeDictionaryValue;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        String str = this.primaryKey;
        long j = this.loanKey;
        String str2 = this.loanNo;
        Long l = this.payDate;
        String str3 = this.ccy;
        Double d = this.priAmt;
        Double d2 = this.intAmt;
        Double d3 = this.feeAmt;
        String str4 = this.feeType;
        Double d4 = this.exAmt;
        Double d5 = this.totalAmt;
        Double d6 = this.nextPayAmt;
        Double d7 = this.intAmtWithoutOffset;
        String str5 = this.feeTypeDictionaryKey;
        String str6 = this.feeTypeDictionaryValue;
        return "BnplDetailsScheduleApiEntity(primaryKey=" + str + ", loanKey=" + j + ", loanNo=" + str2 + ", payDate=" + l + ", ccy=" + str3 + ", priAmt=" + d + ", intAmt=" + d2 + ", feeAmt=" + d3 + ", feeType=" + str4 + ", exAmt=" + d4 + ", totalAmt=" + d5 + ", nextPayAmt=" + d6 + ", intAmtWithoutOffset=" + d7 + ", feeTypeDictionaryKey=" + str5 + ", feeTypeDictionaryValue=" + str6 + ")";
    }
}
