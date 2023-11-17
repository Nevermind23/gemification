package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LoanScheduleApiModel */
public final class LoanScheduleApiModel {
    private final String ccy;
    private final BigDecimal exAmt;
    private final BigDecimal feeAmt;
    private final String feeType;
    private final String feeTypeDictionaryKey;
    private final String feeTypeDictionaryValue;
    private final BigDecimal intAmt;
    private final BigDecimal intAmtWithoutOffset;
    private final long loanKey;
    private final String loanNo;
    private final BigDecimal nextPayAmt;
    private final long payDate;
    private final BigDecimal priAmt;
    private final String primaryKey;
    private final BigDecimal totalAmt;

    public LoanScheduleApiModel(String str, long j, String str2, long j2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str5, String str6) {
        C41536l.m120489i(str, "primaryKey");
        C41536l.m120489i(str2, "loanNo");
        C41536l.m120489i(str3, "ccy");
        this.primaryKey = str;
        this.loanKey = j;
        this.loanNo = str2;
        this.payDate = j2;
        this.ccy = str3;
        this.priAmt = bigDecimal;
        this.intAmt = bigDecimal2;
        this.feeAmt = bigDecimal3;
        this.feeType = str4;
        this.exAmt = bigDecimal4;
        this.totalAmt = bigDecimal5;
        this.nextPayAmt = bigDecimal6;
        this.intAmtWithoutOffset = bigDecimal7;
        this.feeTypeDictionaryKey = str5;
        this.feeTypeDictionaryValue = str6;
    }

    public static /* synthetic */ LoanScheduleApiModel copy$default(LoanScheduleApiModel loanScheduleApiModel, String str, long j, String str2, long j2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str5, String str6, int i, Object obj) {
        LoanScheduleApiModel loanScheduleApiModel2 = loanScheduleApiModel;
        int i2 = i;
        return loanScheduleApiModel.copy((i2 & 1) != 0 ? loanScheduleApiModel2.primaryKey : str, (i2 & 2) != 0 ? loanScheduleApiModel2.loanKey : j, (i2 & 4) != 0 ? loanScheduleApiModel2.loanNo : str2, (i2 & 8) != 0 ? loanScheduleApiModel2.payDate : j2, (i2 & 16) != 0 ? loanScheduleApiModel2.ccy : str3, (i2 & 32) != 0 ? loanScheduleApiModel2.priAmt : bigDecimal, (i2 & 64) != 0 ? loanScheduleApiModel2.intAmt : bigDecimal2, (i2 & 128) != 0 ? loanScheduleApiModel2.feeAmt : bigDecimal3, (i2 & C11398b.f33139r) != 0 ? loanScheduleApiModel2.feeType : str4, (i2 & C11398b.f33140s) != 0 ? loanScheduleApiModel2.exAmt : bigDecimal4, (i2 & C11398b.f33141t) != 0 ? loanScheduleApiModel2.totalAmt : bigDecimal5, (i2 & C11398b.f33142u) != 0 ? loanScheduleApiModel2.nextPayAmt : bigDecimal6, (i2 & C11398b.f33143v) != 0 ? loanScheduleApiModel2.intAmtWithoutOffset : bigDecimal7, (i2 & 8192) != 0 ? loanScheduleApiModel2.feeTypeDictionaryKey : str5, (i2 & 16384) != 0 ? loanScheduleApiModel2.feeTypeDictionaryValue : str6);
    }

    public final String component1() {
        return this.primaryKey;
    }

    public final BigDecimal component10() {
        return this.exAmt;
    }

    public final BigDecimal component11() {
        return this.totalAmt;
    }

    public final BigDecimal component12() {
        return this.nextPayAmt;
    }

    public final BigDecimal component13() {
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

    public final long component4() {
        return this.payDate;
    }

    public final String component5() {
        return this.ccy;
    }

    public final BigDecimal component6() {
        return this.priAmt;
    }

    public final BigDecimal component7() {
        return this.intAmt;
    }

    public final BigDecimal component8() {
        return this.feeAmt;
    }

    public final String component9() {
        return this.feeType;
    }

    public final LoanScheduleApiModel copy(String str, long j, String str2, long j2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str5, String str6) {
        String str7 = str;
        C41536l.m120489i(str7, "primaryKey");
        C41536l.m120489i(str2, "loanNo");
        C41536l.m120489i(str3, "ccy");
        return new LoanScheduleApiModel(str7, j, str2, j2, str3, bigDecimal, bigDecimal2, bigDecimal3, str4, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanScheduleApiModel)) {
            return false;
        }
        LoanScheduleApiModel loanScheduleApiModel = (LoanScheduleApiModel) obj;
        return C41536l.m120484d(this.primaryKey, loanScheduleApiModel.primaryKey) && this.loanKey == loanScheduleApiModel.loanKey && C41536l.m120484d(this.loanNo, loanScheduleApiModel.loanNo) && this.payDate == loanScheduleApiModel.payDate && C41536l.m120484d(this.ccy, loanScheduleApiModel.ccy) && C41536l.m120484d(this.priAmt, loanScheduleApiModel.priAmt) && C41536l.m120484d(this.intAmt, loanScheduleApiModel.intAmt) && C41536l.m120484d(this.feeAmt, loanScheduleApiModel.feeAmt) && C41536l.m120484d(this.feeType, loanScheduleApiModel.feeType) && C41536l.m120484d(this.exAmt, loanScheduleApiModel.exAmt) && C41536l.m120484d(this.totalAmt, loanScheduleApiModel.totalAmt) && C41536l.m120484d(this.nextPayAmt, loanScheduleApiModel.nextPayAmt) && C41536l.m120484d(this.intAmtWithoutOffset, loanScheduleApiModel.intAmtWithoutOffset) && C41536l.m120484d(this.feeTypeDictionaryKey, loanScheduleApiModel.feeTypeDictionaryKey) && C41536l.m120484d(this.feeTypeDictionaryValue, loanScheduleApiModel.feeTypeDictionaryValue);
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final BigDecimal getExAmt() {
        return this.exAmt;
    }

    public final BigDecimal getFeeAmt() {
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

    public final BigDecimal getIntAmt() {
        return this.intAmt;
    }

    public final BigDecimal getIntAmtWithoutOffset() {
        return this.intAmtWithoutOffset;
    }

    public final long getLoanKey() {
        return this.loanKey;
    }

    public final String getLoanNo() {
        return this.loanNo;
    }

    public final BigDecimal getNextPayAmt() {
        return this.nextPayAmt;
    }

    public final long getPayDate() {
        return this.payDate;
    }

    public final BigDecimal getPriAmt() {
        return this.priAmt;
    }

    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final BigDecimal getTotalAmt() {
        return this.totalAmt;
    }

    public int hashCode() {
        int hashCode = ((((((((this.primaryKey.hashCode() * 31) + C7397t.m28148a(this.loanKey)) * 31) + this.loanNo.hashCode()) * 31) + C7397t.m28148a(this.payDate)) * 31) + this.ccy.hashCode()) * 31;
        BigDecimal bigDecimal = this.priAmt;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.intAmt;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.feeAmt;
        int hashCode4 = (hashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str = this.feeType;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.exAmt;
        int hashCode6 = (hashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.totalAmt;
        int hashCode7 = (hashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.nextPayAmt;
        int hashCode8 = (hashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.intAmtWithoutOffset;
        int hashCode9 = (hashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str2 = this.feeTypeDictionaryKey;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feeTypeDictionaryValue;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        String str = this.primaryKey;
        long j = this.loanKey;
        String str2 = this.loanNo;
        long j2 = this.payDate;
        String str3 = this.ccy;
        BigDecimal bigDecimal = this.priAmt;
        BigDecimal bigDecimal2 = this.intAmt;
        BigDecimal bigDecimal3 = this.feeAmt;
        String str4 = this.feeType;
        BigDecimal bigDecimal4 = this.exAmt;
        BigDecimal bigDecimal5 = this.totalAmt;
        BigDecimal bigDecimal6 = this.nextPayAmt;
        BigDecimal bigDecimal7 = this.intAmtWithoutOffset;
        String str5 = this.feeTypeDictionaryKey;
        String str6 = this.feeTypeDictionaryValue;
        return "LoanScheduleApiModel(primaryKey=" + str + ", loanKey=" + j + ", loanNo=" + str2 + ", payDate=" + j2 + ", ccy=" + str3 + ", priAmt=" + bigDecimal + ", intAmt=" + bigDecimal2 + ", feeAmt=" + bigDecimal3 + ", feeType=" + str4 + ", exAmt=" + bigDecimal4 + ", totalAmt=" + bigDecimal5 + ", nextPayAmt=" + bigDecimal6 + ", intAmtWithoutOffset=" + bigDecimal7 + ", feeTypeDictionaryKey=" + str5 + ", feeTypeDictionaryValue=" + str6 + ")";
    }
}
