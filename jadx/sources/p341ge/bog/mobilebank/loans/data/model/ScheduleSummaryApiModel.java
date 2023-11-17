package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.ScheduleSummaryApiModel */
public final class ScheduleSummaryApiModel {
    private final String ccy;
    private final BigDecimal exAmt;
    private final BigDecimal feeAmt;
    private final String feeType;
    private final String feeTypeDictionaryKey;
    private final String feeTypeDictionaryValue;
    private final BigDecimal forgiveFee;
    private final BigDecimal forgiveInt;
    private final BigDecimal forgiveOdi;
    private final BigDecimal graceInt;
    private final BigDecimal initialPrincipal;
    private final BigDecimal insAmt;
    private final BigDecimal intAmt;
    private final BigDecimal intAmtWithoutOffset;
    private final Long loanNo;
    private final BigDecimal nextPayAmt;
    private final Long payDate;
    private final BigDecimal priAmt;
    private final String productDictionaryKey;
    private final BigDecimal rliAmt;
    private final BigDecimal totalAmt;

    public ScheduleSummaryApiModel(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, Long l, BigDecimal bigDecimal11, Long l2, BigDecimal bigDecimal12, String str5, BigDecimal bigDecimal13, BigDecimal bigDecimal14) {
        this.ccy = str;
        this.exAmt = bigDecimal;
        this.feeAmt = bigDecimal2;
        this.feeType = str2;
        this.feeTypeDictionaryKey = str3;
        this.feeTypeDictionaryValue = str4;
        this.forgiveFee = bigDecimal3;
        this.forgiveInt = bigDecimal4;
        this.forgiveOdi = bigDecimal5;
        this.graceInt = bigDecimal6;
        this.initialPrincipal = bigDecimal7;
        this.insAmt = bigDecimal8;
        this.intAmt = bigDecimal9;
        this.intAmtWithoutOffset = bigDecimal10;
        this.loanNo = l;
        this.nextPayAmt = bigDecimal11;
        this.payDate = l2;
        this.priAmt = bigDecimal12;
        this.productDictionaryKey = str5;
        this.rliAmt = bigDecimal13;
        this.totalAmt = bigDecimal14;
    }

    public static /* synthetic */ ScheduleSummaryApiModel copy$default(ScheduleSummaryApiModel scheduleSummaryApiModel, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, Long l, BigDecimal bigDecimal11, Long l2, BigDecimal bigDecimal12, String str5, BigDecimal bigDecimal13, BigDecimal bigDecimal14, int i, Object obj) {
        ScheduleSummaryApiModel scheduleSummaryApiModel2 = scheduleSummaryApiModel;
        int i2 = i;
        return scheduleSummaryApiModel.copy((i2 & 1) != 0 ? scheduleSummaryApiModel2.ccy : str, (i2 & 2) != 0 ? scheduleSummaryApiModel2.exAmt : bigDecimal, (i2 & 4) != 0 ? scheduleSummaryApiModel2.feeAmt : bigDecimal2, (i2 & 8) != 0 ? scheduleSummaryApiModel2.feeType : str2, (i2 & 16) != 0 ? scheduleSummaryApiModel2.feeTypeDictionaryKey : str3, (i2 & 32) != 0 ? scheduleSummaryApiModel2.feeTypeDictionaryValue : str4, (i2 & 64) != 0 ? scheduleSummaryApiModel2.forgiveFee : bigDecimal3, (i2 & 128) != 0 ? scheduleSummaryApiModel2.forgiveInt : bigDecimal4, (i2 & C11398b.f33139r) != 0 ? scheduleSummaryApiModel2.forgiveOdi : bigDecimal5, (i2 & C11398b.f33140s) != 0 ? scheduleSummaryApiModel2.graceInt : bigDecimal6, (i2 & C11398b.f33141t) != 0 ? scheduleSummaryApiModel2.initialPrincipal : bigDecimal7, (i2 & C11398b.f33142u) != 0 ? scheduleSummaryApiModel2.insAmt : bigDecimal8, (i2 & C11398b.f33143v) != 0 ? scheduleSummaryApiModel2.intAmt : bigDecimal9, (i2 & 8192) != 0 ? scheduleSummaryApiModel2.intAmtWithoutOffset : bigDecimal10, (i2 & 16384) != 0 ? scheduleSummaryApiModel2.loanNo : l, (i2 & 32768) != 0 ? scheduleSummaryApiModel2.nextPayAmt : bigDecimal11, (i2 & 65536) != 0 ? scheduleSummaryApiModel2.payDate : l2, (i2 & 131072) != 0 ? scheduleSummaryApiModel2.priAmt : bigDecimal12, (i2 & 262144) != 0 ? scheduleSummaryApiModel2.productDictionaryKey : str5, (i2 & 524288) != 0 ? scheduleSummaryApiModel2.rliAmt : bigDecimal13, (i2 & 1048576) != 0 ? scheduleSummaryApiModel2.totalAmt : bigDecimal14);
    }

    public final String component1() {
        return this.ccy;
    }

    public final BigDecimal component10() {
        return this.graceInt;
    }

    public final BigDecimal component11() {
        return this.initialPrincipal;
    }

    public final BigDecimal component12() {
        return this.insAmt;
    }

    public final BigDecimal component13() {
        return this.intAmt;
    }

    public final BigDecimal component14() {
        return this.intAmtWithoutOffset;
    }

    public final Long component15() {
        return this.loanNo;
    }

    public final BigDecimal component16() {
        return this.nextPayAmt;
    }

    public final Long component17() {
        return this.payDate;
    }

    public final BigDecimal component18() {
        return this.priAmt;
    }

    public final String component19() {
        return this.productDictionaryKey;
    }

    public final BigDecimal component2() {
        return this.exAmt;
    }

    public final BigDecimal component20() {
        return this.rliAmt;
    }

    public final BigDecimal component21() {
        return this.totalAmt;
    }

    public final BigDecimal component3() {
        return this.feeAmt;
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

    public final ScheduleSummaryApiModel copy(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, Long l, BigDecimal bigDecimal11, Long l2, BigDecimal bigDecimal12, String str5, BigDecimal bigDecimal13, BigDecimal bigDecimal14) {
        return new ScheduleSummaryApiModel(str, bigDecimal, bigDecimal2, str2, str3, str4, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, l, bigDecimal11, l2, bigDecimal12, str5, bigDecimal13, bigDecimal14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleSummaryApiModel)) {
            return false;
        }
        ScheduleSummaryApiModel scheduleSummaryApiModel = (ScheduleSummaryApiModel) obj;
        return C41536l.m120484d(this.ccy, scheduleSummaryApiModel.ccy) && C41536l.m120484d(this.exAmt, scheduleSummaryApiModel.exAmt) && C41536l.m120484d(this.feeAmt, scheduleSummaryApiModel.feeAmt) && C41536l.m120484d(this.feeType, scheduleSummaryApiModel.feeType) && C41536l.m120484d(this.feeTypeDictionaryKey, scheduleSummaryApiModel.feeTypeDictionaryKey) && C41536l.m120484d(this.feeTypeDictionaryValue, scheduleSummaryApiModel.feeTypeDictionaryValue) && C41536l.m120484d(this.forgiveFee, scheduleSummaryApiModel.forgiveFee) && C41536l.m120484d(this.forgiveInt, scheduleSummaryApiModel.forgiveInt) && C41536l.m120484d(this.forgiveOdi, scheduleSummaryApiModel.forgiveOdi) && C41536l.m120484d(this.graceInt, scheduleSummaryApiModel.graceInt) && C41536l.m120484d(this.initialPrincipal, scheduleSummaryApiModel.initialPrincipal) && C41536l.m120484d(this.insAmt, scheduleSummaryApiModel.insAmt) && C41536l.m120484d(this.intAmt, scheduleSummaryApiModel.intAmt) && C41536l.m120484d(this.intAmtWithoutOffset, scheduleSummaryApiModel.intAmtWithoutOffset) && C41536l.m120484d(this.loanNo, scheduleSummaryApiModel.loanNo) && C41536l.m120484d(this.nextPayAmt, scheduleSummaryApiModel.nextPayAmt) && C41536l.m120484d(this.payDate, scheduleSummaryApiModel.payDate) && C41536l.m120484d(this.priAmt, scheduleSummaryApiModel.priAmt) && C41536l.m120484d(this.productDictionaryKey, scheduleSummaryApiModel.productDictionaryKey) && C41536l.m120484d(this.rliAmt, scheduleSummaryApiModel.rliAmt) && C41536l.m120484d(this.totalAmt, scheduleSummaryApiModel.totalAmt);
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

    public final BigDecimal getIntAmt() {
        return this.intAmt;
    }

    public final BigDecimal getIntAmtWithoutOffset() {
        return this.intAmtWithoutOffset;
    }

    public final Long getLoanNo() {
        return this.loanNo;
    }

    public final BigDecimal getNextPayAmt() {
        return this.nextPayAmt;
    }

    public final Long getPayDate() {
        return this.payDate;
    }

    public final BigDecimal getPriAmt() {
        return this.priAmt;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final BigDecimal getRliAmt() {
        return this.rliAmt;
    }

    public final BigDecimal getTotalAmt() {
        return this.totalAmt;
    }

    public int hashCode() {
        String str = this.ccy;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.exAmt;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.feeAmt;
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
        BigDecimal bigDecimal7 = this.initialPrincipal;
        int hashCode11 = (hashCode10 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.insAmt;
        int hashCode12 = (hashCode11 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.intAmt;
        int hashCode13 = (hashCode12 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.intAmtWithoutOffset;
        int hashCode14 = (hashCode13 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        Long l = this.loanNo;
        int hashCode15 = (hashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.nextPayAmt;
        int hashCode16 = (hashCode15 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        Long l2 = this.payDate;
        int hashCode17 = (hashCode16 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.priAmt;
        int hashCode18 = (hashCode17 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        String str5 = this.productDictionaryKey;
        int hashCode19 = (hashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.rliAmt;
        int hashCode20 = (hashCode19 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.totalAmt;
        if (bigDecimal14 != null) {
            i = bigDecimal14.hashCode();
        }
        return hashCode20 + i;
    }

    public String toString() {
        String str = this.ccy;
        BigDecimal bigDecimal = this.exAmt;
        BigDecimal bigDecimal2 = this.feeAmt;
        String str2 = this.feeType;
        String str3 = this.feeTypeDictionaryKey;
        String str4 = this.feeTypeDictionaryValue;
        BigDecimal bigDecimal3 = this.forgiveFee;
        BigDecimal bigDecimal4 = this.forgiveInt;
        BigDecimal bigDecimal5 = this.forgiveOdi;
        BigDecimal bigDecimal6 = this.graceInt;
        BigDecimal bigDecimal7 = this.initialPrincipal;
        BigDecimal bigDecimal8 = this.insAmt;
        BigDecimal bigDecimal9 = this.intAmt;
        BigDecimal bigDecimal10 = this.intAmtWithoutOffset;
        Long l = this.loanNo;
        BigDecimal bigDecimal11 = this.nextPayAmt;
        Long l2 = this.payDate;
        BigDecimal bigDecimal12 = this.priAmt;
        String str5 = this.productDictionaryKey;
        BigDecimal bigDecimal13 = this.rliAmt;
        BigDecimal bigDecimal14 = this.totalAmt;
        return "ScheduleSummaryApiModel(ccy=" + str + ", exAmt=" + bigDecimal + ", feeAmt=" + bigDecimal2 + ", feeType=" + str2 + ", feeTypeDictionaryKey=" + str3 + ", feeTypeDictionaryValue=" + str4 + ", forgiveFee=" + bigDecimal3 + ", forgiveInt=" + bigDecimal4 + ", forgiveOdi=" + bigDecimal5 + ", graceInt=" + bigDecimal6 + ", initialPrincipal=" + bigDecimal7 + ", insAmt=" + bigDecimal8 + ", intAmt=" + bigDecimal9 + ", intAmtWithoutOffset=" + bigDecimal10 + ", loanNo=" + l + ", nextPayAmt=" + bigDecimal11 + ", payDate=" + l2 + ", priAmt=" + bigDecimal12 + ", productDictionaryKey=" + str5 + ", rliAmt=" + bigDecimal13 + ", totalAmt=" + bigDecimal14 + ")";
    }
}
