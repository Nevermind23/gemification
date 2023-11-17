package p341ge.bog.mobilebank.deposits.data.entity.depositprolongation;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationDetailsEntity */
public final class DepositProlongationDetailsEntity {
    private final Long acctKey;
    private final String agreeType;
    private final String ccy;
    private final YesNoApiEntity copyCas;
    private final YesNoApiEntity copySto;
    private final String intRate;
    private final String intWithPeriod;
    private final String interestAmt;
    private final String irr;
    private final Long maturityDate;
    private final String minAmount;
    private final String name;
    private final String oldAgreeAmount;
    private final Double periodLength;
    private final String prodType;
    private final String purpose;
    private final Long result;
    private final Long startDate;
    private final String term;

    public DepositProlongationDetailsEntity(String str, Long l, Long l2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l3, Long l4, Double d, String str9, String str10, String str11, String str12, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2) {
        this.ccy = str;
        this.result = l;
        this.acctKey = l2;
        this.oldAgreeAmount = str2;
        this.minAmount = str3;
        this.interestAmt = str4;
        this.intRate = str5;
        this.irr = str6;
        this.prodType = str7;
        this.term = str8;
        this.maturityDate = l3;
        this.startDate = l4;
        this.periodLength = d;
        this.name = str9;
        this.intWithPeriod = str10;
        this.purpose = str11;
        this.agreeType = str12;
        this.copyCas = yesNoApiEntity;
        this.copySto = yesNoApiEntity2;
    }

    public static /* synthetic */ DepositProlongationDetailsEntity copy$default(DepositProlongationDetailsEntity depositProlongationDetailsEntity, String str, Long l, Long l2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l3, Long l4, Double d, String str9, String str10, String str11, String str12, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, int i, Object obj) {
        DepositProlongationDetailsEntity depositProlongationDetailsEntity2 = depositProlongationDetailsEntity;
        int i2 = i;
        return depositProlongationDetailsEntity.copy((i2 & 1) != 0 ? depositProlongationDetailsEntity2.ccy : str, (i2 & 2) != 0 ? depositProlongationDetailsEntity2.result : l, (i2 & 4) != 0 ? depositProlongationDetailsEntity2.acctKey : l2, (i2 & 8) != 0 ? depositProlongationDetailsEntity2.oldAgreeAmount : str2, (i2 & 16) != 0 ? depositProlongationDetailsEntity2.minAmount : str3, (i2 & 32) != 0 ? depositProlongationDetailsEntity2.interestAmt : str4, (i2 & 64) != 0 ? depositProlongationDetailsEntity2.intRate : str5, (i2 & 128) != 0 ? depositProlongationDetailsEntity2.irr : str6, (i2 & C11398b.f33139r) != 0 ? depositProlongationDetailsEntity2.prodType : str7, (i2 & C11398b.f33140s) != 0 ? depositProlongationDetailsEntity2.term : str8, (i2 & C11398b.f33141t) != 0 ? depositProlongationDetailsEntity2.maturityDate : l3, (i2 & C11398b.f33142u) != 0 ? depositProlongationDetailsEntity2.startDate : l4, (i2 & C11398b.f33143v) != 0 ? depositProlongationDetailsEntity2.periodLength : d, (i2 & 8192) != 0 ? depositProlongationDetailsEntity2.name : str9, (i2 & 16384) != 0 ? depositProlongationDetailsEntity2.intWithPeriod : str10, (i2 & 32768) != 0 ? depositProlongationDetailsEntity2.purpose : str11, (i2 & 65536) != 0 ? depositProlongationDetailsEntity2.agreeType : str12, (i2 & 131072) != 0 ? depositProlongationDetailsEntity2.copyCas : yesNoApiEntity, (i2 & 262144) != 0 ? depositProlongationDetailsEntity2.copySto : yesNoApiEntity2);
    }

    public final String component1() {
        return this.ccy;
    }

    public final String component10() {
        return this.term;
    }

    public final Long component11() {
        return this.maturityDate;
    }

    public final Long component12() {
        return this.startDate;
    }

    public final Double component13() {
        return this.periodLength;
    }

    public final String component14() {
        return this.name;
    }

    public final String component15() {
        return this.intWithPeriod;
    }

    public final String component16() {
        return this.purpose;
    }

    public final String component17() {
        return this.agreeType;
    }

    public final YesNoApiEntity component18() {
        return this.copyCas;
    }

    public final YesNoApiEntity component19() {
        return this.copySto;
    }

    public final Long component2() {
        return this.result;
    }

    public final Long component3() {
        return this.acctKey;
    }

    public final String component4() {
        return this.oldAgreeAmount;
    }

    public final String component5() {
        return this.minAmount;
    }

    public final String component6() {
        return this.interestAmt;
    }

    public final String component7() {
        return this.intRate;
    }

    public final String component8() {
        return this.irr;
    }

    public final String component9() {
        return this.prodType;
    }

    public final DepositProlongationDetailsEntity copy(String str, Long l, Long l2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l3, Long l4, Double d, String str9, String str10, String str11, String str12, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2) {
        return new DepositProlongationDetailsEntity(str, l, l2, str2, str3, str4, str5, str6, str7, str8, l3, l4, d, str9, str10, str11, str12, yesNoApiEntity, yesNoApiEntity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositProlongationDetailsEntity)) {
            return false;
        }
        DepositProlongationDetailsEntity depositProlongationDetailsEntity = (DepositProlongationDetailsEntity) obj;
        return C41536l.m120484d(this.ccy, depositProlongationDetailsEntity.ccy) && C41536l.m120484d(this.result, depositProlongationDetailsEntity.result) && C41536l.m120484d(this.acctKey, depositProlongationDetailsEntity.acctKey) && C41536l.m120484d(this.oldAgreeAmount, depositProlongationDetailsEntity.oldAgreeAmount) && C41536l.m120484d(this.minAmount, depositProlongationDetailsEntity.minAmount) && C41536l.m120484d(this.interestAmt, depositProlongationDetailsEntity.interestAmt) && C41536l.m120484d(this.intRate, depositProlongationDetailsEntity.intRate) && C41536l.m120484d(this.irr, depositProlongationDetailsEntity.irr) && C41536l.m120484d(this.prodType, depositProlongationDetailsEntity.prodType) && C41536l.m120484d(this.term, depositProlongationDetailsEntity.term) && C41536l.m120484d(this.maturityDate, depositProlongationDetailsEntity.maturityDate) && C41536l.m120484d(this.startDate, depositProlongationDetailsEntity.startDate) && C41536l.m120484d(this.periodLength, depositProlongationDetailsEntity.periodLength) && C41536l.m120484d(this.name, depositProlongationDetailsEntity.name) && C41536l.m120484d(this.intWithPeriod, depositProlongationDetailsEntity.intWithPeriod) && C41536l.m120484d(this.purpose, depositProlongationDetailsEntity.purpose) && C41536l.m120484d(this.agreeType, depositProlongationDetailsEntity.agreeType) && this.copyCas == depositProlongationDetailsEntity.copyCas && this.copySto == depositProlongationDetailsEntity.copySto;
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final String getAgreeType() {
        return this.agreeType;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final YesNoApiEntity getCopyCas() {
        return this.copyCas;
    }

    public final YesNoApiEntity getCopySto() {
        return this.copySto;
    }

    public final String getIntRate() {
        return this.intRate;
    }

    public final String getIntWithPeriod() {
        return this.intWithPeriod;
    }

    public final String getInterestAmt() {
        return this.interestAmt;
    }

    public final String getIrr() {
        return this.irr;
    }

    public final Long getMaturityDate() {
        return this.maturityDate;
    }

    public final String getMinAmount() {
        return this.minAmount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOldAgreeAmount() {
        return this.oldAgreeAmount;
    }

    public final Double getPeriodLength() {
        return this.periodLength;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public final Long getResult() {
        return this.result;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final String getTerm() {
        return this.term;
    }

    public int hashCode() {
        String str = this.ccy;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.result;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.acctKey;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.oldAgreeAmount;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minAmount;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.interestAmt;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.intRate;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.irr;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.prodType;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.term;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l3 = this.maturityDate;
        int hashCode11 = (hashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.startDate;
        int hashCode12 = (hashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Double d = this.periodLength;
        int hashCode13 = (hashCode12 + (d == null ? 0 : d.hashCode())) * 31;
        String str9 = this.name;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.intWithPeriod;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.purpose;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.agreeType;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.copyCas;
        int hashCode18 = (hashCode17 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.copySto;
        if (yesNoApiEntity2 != null) {
            i = yesNoApiEntity2.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        String str = this.ccy;
        Long l = this.result;
        Long l2 = this.acctKey;
        String str2 = this.oldAgreeAmount;
        String str3 = this.minAmount;
        String str4 = this.interestAmt;
        String str5 = this.intRate;
        String str6 = this.irr;
        String str7 = this.prodType;
        String str8 = this.term;
        Long l3 = this.maturityDate;
        Long l4 = this.startDate;
        Double d = this.periodLength;
        String str9 = this.name;
        String str10 = this.intWithPeriod;
        String str11 = this.purpose;
        String str12 = this.agreeType;
        YesNoApiEntity yesNoApiEntity = this.copyCas;
        YesNoApiEntity yesNoApiEntity2 = this.copySto;
        return "DepositProlongationDetailsEntity(ccy=" + str + ", result=" + l + ", acctKey=" + l2 + ", oldAgreeAmount=" + str2 + ", minAmount=" + str3 + ", interestAmt=" + str4 + ", intRate=" + str5 + ", irr=" + str6 + ", prodType=" + str7 + ", term=" + str8 + ", maturityDate=" + l3 + ", startDate=" + l4 + ", periodLength=" + d + ", name=" + str9 + ", intWithPeriod=" + str10 + ", purpose=" + str11 + ", agreeType=" + str12 + ", copyCas=" + yesNoApiEntity + ", copySto=" + yesNoApiEntity2 + ")";
    }
}
