package p341ge.bog.mobilebank.loanactivation.data.entity.loandecision;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loanactivation.data.entity.loandecision.DecisionDetailsApiModel */
public final class DecisionDetailsApiModel {
    private final String CreditorIdentified;
    private final String accessType;
    private final Double comisAmount;
    private final Double comisMin;
    private final Double comisRate;
    private final Integer conditionDays;
    private final String conditionRate;
    private final Long decisionNo;
    private final String decisionScheme;
    private final Double downPayment;
    private final Double drawAmount;
    private final Double drawAmount2;
    private final Long firstPayDate;
    private final Double forgiveFeeAmount;
    private final Double forgiveIntAmount;
    private final Double forgiveOdiAmount;
    private final Double fullPaymentAmount;
    private final String graceFlag;
    private final Double insIncAmount;
    private final String insIncFlag;
    private final Double insLifeAmount;
    private final Double keepAmount;
    private final Double lastPaymentAmount;
    private final Double loanAmount;
    private final String loanCcy;
    private final Double loanIrr;
    private final Double loanIrr2;
    private final Double loanIrr3;
    private final Double loanIrr4;
    private final Long loanMaturity;
    private final Double loanRate;
    private final Integer loanTerm;
    private final Double maxLoanAmount;
    private final Integer maxTerm;
    private final Double minLoanAmount;
    private final Integer minTerm;
    private final String operationType;
    private final Integer payDay;
    private final Integer paymentCount;
    private final Double penaltyFee;
    private final String penaltyFeeValue;
    private final Double penaltyInt;
    private final Double penaltyOne;
    private final Double penaltyPre;
    private final Double penaltyPri;
    private final Double pmtAmount;
    private final Double rfncAmount;
    private final Double rqstDownPayment;
    private final String titleDictionaryKey;
    private final String titleDictionaryKeyValue;
    private final Double withdrawalAmount;

    public DecisionDetailsApiModel(String str, String str2, Double d, Double d2, Double d3, Integer num, String str3, Long l, String str4, Double d4, Double d5, Double d6, Long l2, Double d7, Double d8, Double d9, Double d12, String str5, Double d13, String str6, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, String str7, Double d22, Double d23, Double d24, Double d25, Long l3, Double d26, Integer num2, Integer num3, Integer num4, String str8, Integer num5, Integer num6, Double d27, String str9, Double d28, Double d29, Double d32, Double d33, Double d34, Double d35, Double d36, String str10, String str11, Double d37) {
        this.CreditorIdentified = str;
        this.accessType = str2;
        this.comisAmount = d;
        this.comisMin = d2;
        this.comisRate = d3;
        this.conditionDays = num;
        this.conditionRate = str3;
        this.decisionNo = l;
        this.decisionScheme = str4;
        this.downPayment = d4;
        this.drawAmount = d5;
        this.drawAmount2 = d6;
        this.firstPayDate = l2;
        this.forgiveFeeAmount = d7;
        this.forgiveIntAmount = d8;
        this.forgiveOdiAmount = d9;
        this.fullPaymentAmount = d12;
        this.graceFlag = str5;
        this.insIncAmount = d13;
        this.insIncFlag = str6;
        this.insLifeAmount = d14;
        this.keepAmount = d15;
        this.lastPaymentAmount = d16;
        this.loanAmount = d17;
        this.minLoanAmount = d18;
        this.maxLoanAmount = d19;
        this.loanCcy = str7;
        this.loanIrr = d22;
        this.loanIrr2 = d23;
        this.loanIrr3 = d24;
        this.loanIrr4 = d25;
        this.loanMaturity = l3;
        this.loanRate = d26;
        this.loanTerm = num2;
        this.maxTerm = num3;
        this.minTerm = num4;
        this.operationType = str8;
        this.payDay = num5;
        this.paymentCount = num6;
        this.penaltyFee = d27;
        this.penaltyFeeValue = str9;
        this.penaltyInt = d28;
        this.penaltyOne = d29;
        this.penaltyPre = d32;
        this.penaltyPri = d33;
        this.pmtAmount = d34;
        this.rfncAmount = d35;
        this.rqstDownPayment = d36;
        this.titleDictionaryKey = str10;
        this.titleDictionaryKeyValue = str11;
        this.withdrawalAmount = d37;
    }

    public static /* synthetic */ DecisionDetailsApiModel copy$default(DecisionDetailsApiModel decisionDetailsApiModel, String str, String str2, Double d, Double d2, Double d3, Integer num, String str3, Long l, String str4, Double d4, Double d5, Double d6, Long l2, Double d7, Double d8, Double d9, Double d12, String str5, Double d13, String str6, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, String str7, Double d22, Double d23, Double d24, Double d25, Long l3, Double d26, Integer num2, Integer num3, Integer num4, String str8, Integer num5, Integer num6, Double d27, String str9, Double d28, Double d29, Double d32, Double d33, Double d34, Double d35, Double d36, String str10, String str11, Double d37, int i, int i2, Object obj) {
        DecisionDetailsApiModel decisionDetailsApiModel2 = decisionDetailsApiModel;
        int i3 = i;
        int i4 = i2;
        return decisionDetailsApiModel.copy((i3 & 1) != 0 ? decisionDetailsApiModel2.CreditorIdentified : str, (i3 & 2) != 0 ? decisionDetailsApiModel2.accessType : str2, (i3 & 4) != 0 ? decisionDetailsApiModel2.comisAmount : d, (i3 & 8) != 0 ? decisionDetailsApiModel2.comisMin : d2, (i3 & 16) != 0 ? decisionDetailsApiModel2.comisRate : d3, (i3 & 32) != 0 ? decisionDetailsApiModel2.conditionDays : num, (i3 & 64) != 0 ? decisionDetailsApiModel2.conditionRate : str3, (i3 & 128) != 0 ? decisionDetailsApiModel2.decisionNo : l, (i3 & C11398b.f33139r) != 0 ? decisionDetailsApiModel2.decisionScheme : str4, (i3 & C11398b.f33140s) != 0 ? decisionDetailsApiModel2.downPayment : d4, (i3 & C11398b.f33141t) != 0 ? decisionDetailsApiModel2.drawAmount : d5, (i3 & C11398b.f33142u) != 0 ? decisionDetailsApiModel2.drawAmount2 : d6, (i3 & C11398b.f33143v) != 0 ? decisionDetailsApiModel2.firstPayDate : l2, (i3 & 8192) != 0 ? decisionDetailsApiModel2.forgiveFeeAmount : d7, (i3 & 16384) != 0 ? decisionDetailsApiModel2.forgiveIntAmount : d8, (i3 & 32768) != 0 ? decisionDetailsApiModel2.forgiveOdiAmount : d9, (i3 & 65536) != 0 ? decisionDetailsApiModel2.fullPaymentAmount : d12, (i3 & 131072) != 0 ? decisionDetailsApiModel2.graceFlag : str5, (i3 & 262144) != 0 ? decisionDetailsApiModel2.insIncAmount : d13, (i3 & 524288) != 0 ? decisionDetailsApiModel2.insIncFlag : str6, (i3 & 1048576) != 0 ? decisionDetailsApiModel2.insLifeAmount : d14, (i3 & 2097152) != 0 ? decisionDetailsApiModel2.keepAmount : d15, (i3 & 4194304) != 0 ? decisionDetailsApiModel2.lastPaymentAmount : d16, (i3 & 8388608) != 0 ? decisionDetailsApiModel2.loanAmount : d17, (i3 & 16777216) != 0 ? decisionDetailsApiModel2.minLoanAmount : d18, (i3 & 33554432) != 0 ? decisionDetailsApiModel2.maxLoanAmount : d19, (i3 & 67108864) != 0 ? decisionDetailsApiModel2.loanCcy : str7, (i3 & 134217728) != 0 ? decisionDetailsApiModel2.loanIrr : d22, (i3 & 268435456) != 0 ? decisionDetailsApiModel2.loanIrr2 : d23, (i3 & 536870912) != 0 ? decisionDetailsApiModel2.loanIrr3 : d24, (i3 & 1073741824) != 0 ? decisionDetailsApiModel2.loanIrr4 : d25, (i3 & Integer.MIN_VALUE) != 0 ? decisionDetailsApiModel2.loanMaturity : l3, (i4 & 1) != 0 ? decisionDetailsApiModel2.loanRate : d26, (i4 & 2) != 0 ? decisionDetailsApiModel2.loanTerm : num2, (i4 & 4) != 0 ? decisionDetailsApiModel2.maxTerm : num3, (i4 & 8) != 0 ? decisionDetailsApiModel2.minTerm : num4, (i4 & 16) != 0 ? decisionDetailsApiModel2.operationType : str8, (i4 & 32) != 0 ? decisionDetailsApiModel2.payDay : num5, (i4 & 64) != 0 ? decisionDetailsApiModel2.paymentCount : num6, (i4 & 128) != 0 ? decisionDetailsApiModel2.penaltyFee : d27, (i4 & C11398b.f33139r) != 0 ? decisionDetailsApiModel2.penaltyFeeValue : str9, (i4 & C11398b.f33140s) != 0 ? decisionDetailsApiModel2.penaltyInt : d28, (i4 & C11398b.f33141t) != 0 ? decisionDetailsApiModel2.penaltyOne : d29, (i4 & C11398b.f33142u) != 0 ? decisionDetailsApiModel2.penaltyPre : d32, (i4 & C11398b.f33143v) != 0 ? decisionDetailsApiModel2.penaltyPri : d33, (i4 & 8192) != 0 ? decisionDetailsApiModel2.pmtAmount : d34, (i4 & 16384) != 0 ? decisionDetailsApiModel2.rfncAmount : d35, (i4 & 32768) != 0 ? decisionDetailsApiModel2.rqstDownPayment : d36, (i4 & 65536) != 0 ? decisionDetailsApiModel2.titleDictionaryKey : str10, (i4 & 131072) != 0 ? decisionDetailsApiModel2.titleDictionaryKeyValue : str11, (i4 & 262144) != 0 ? decisionDetailsApiModel2.withdrawalAmount : d37);
    }

    public final String component1() {
        return this.CreditorIdentified;
    }

    public final Double component10() {
        return this.downPayment;
    }

    public final Double component11() {
        return this.drawAmount;
    }

    public final Double component12() {
        return this.drawAmount2;
    }

    public final Long component13() {
        return this.firstPayDate;
    }

    public final Double component14() {
        return this.forgiveFeeAmount;
    }

    public final Double component15() {
        return this.forgiveIntAmount;
    }

    public final Double component16() {
        return this.forgiveOdiAmount;
    }

    public final Double component17() {
        return this.fullPaymentAmount;
    }

    public final String component18() {
        return this.graceFlag;
    }

    public final Double component19() {
        return this.insIncAmount;
    }

    public final String component2() {
        return this.accessType;
    }

    public final String component20() {
        return this.insIncFlag;
    }

    public final Double component21() {
        return this.insLifeAmount;
    }

    public final Double component22() {
        return this.keepAmount;
    }

    public final Double component23() {
        return this.lastPaymentAmount;
    }

    public final Double component24() {
        return this.loanAmount;
    }

    public final Double component25() {
        return this.minLoanAmount;
    }

    public final Double component26() {
        return this.maxLoanAmount;
    }

    public final String component27() {
        return this.loanCcy;
    }

    public final Double component28() {
        return this.loanIrr;
    }

    public final Double component29() {
        return this.loanIrr2;
    }

    public final Double component3() {
        return this.comisAmount;
    }

    public final Double component30() {
        return this.loanIrr3;
    }

    public final Double component31() {
        return this.loanIrr4;
    }

    public final Long component32() {
        return this.loanMaturity;
    }

    public final Double component33() {
        return this.loanRate;
    }

    public final Integer component34() {
        return this.loanTerm;
    }

    public final Integer component35() {
        return this.maxTerm;
    }

    public final Integer component36() {
        return this.minTerm;
    }

    public final String component37() {
        return this.operationType;
    }

    public final Integer component38() {
        return this.payDay;
    }

    public final Integer component39() {
        return this.paymentCount;
    }

    public final Double component4() {
        return this.comisMin;
    }

    public final Double component40() {
        return this.penaltyFee;
    }

    public final String component41() {
        return this.penaltyFeeValue;
    }

    public final Double component42() {
        return this.penaltyInt;
    }

    public final Double component43() {
        return this.penaltyOne;
    }

    public final Double component44() {
        return this.penaltyPre;
    }

    public final Double component45() {
        return this.penaltyPri;
    }

    public final Double component46() {
        return this.pmtAmount;
    }

    public final Double component47() {
        return this.rfncAmount;
    }

    public final Double component48() {
        return this.rqstDownPayment;
    }

    public final String component49() {
        return this.titleDictionaryKey;
    }

    public final Double component5() {
        return this.comisRate;
    }

    public final String component50() {
        return this.titleDictionaryKeyValue;
    }

    public final Double component51() {
        return this.withdrawalAmount;
    }

    public final Integer component6() {
        return this.conditionDays;
    }

    public final String component7() {
        return this.conditionRate;
    }

    public final Long component8() {
        return this.decisionNo;
    }

    public final String component9() {
        return this.decisionScheme;
    }

    public final DecisionDetailsApiModel copy(String str, String str2, Double d, Double d2, Double d3, Integer num, String str3, Long l, String str4, Double d4, Double d5, Double d6, Long l2, Double d7, Double d8, Double d9, Double d12, String str5, Double d13, String str6, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, String str7, Double d22, Double d23, Double d24, Double d25, Long l3, Double d26, Integer num2, Integer num3, Integer num4, String str8, Integer num5, Integer num6, Double d27, String str9, Double d28, Double d29, Double d32, Double d33, Double d34, Double d35, Double d36, String str10, String str11, Double d37) {
        return new DecisionDetailsApiModel(str, str2, d, d2, d3, num, str3, l, str4, d4, d5, d6, l2, d7, d8, d9, d12, str5, d13, str6, d14, d15, d16, d17, d18, d19, str7, d22, d23, d24, d25, l3, d26, num2, num3, num4, str8, num5, num6, d27, str9, d28, d29, d32, d33, d34, d35, d36, str10, str11, d37);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecisionDetailsApiModel)) {
            return false;
        }
        DecisionDetailsApiModel decisionDetailsApiModel = (DecisionDetailsApiModel) obj;
        return C41536l.m120484d(this.CreditorIdentified, decisionDetailsApiModel.CreditorIdentified) && C41536l.m120484d(this.accessType, decisionDetailsApiModel.accessType) && C41536l.m120484d(this.comisAmount, decisionDetailsApiModel.comisAmount) && C41536l.m120484d(this.comisMin, decisionDetailsApiModel.comisMin) && C41536l.m120484d(this.comisRate, decisionDetailsApiModel.comisRate) && C41536l.m120484d(this.conditionDays, decisionDetailsApiModel.conditionDays) && C41536l.m120484d(this.conditionRate, decisionDetailsApiModel.conditionRate) && C41536l.m120484d(this.decisionNo, decisionDetailsApiModel.decisionNo) && C41536l.m120484d(this.decisionScheme, decisionDetailsApiModel.decisionScheme) && C41536l.m120484d(this.downPayment, decisionDetailsApiModel.downPayment) && C41536l.m120484d(this.drawAmount, decisionDetailsApiModel.drawAmount) && C41536l.m120484d(this.drawAmount2, decisionDetailsApiModel.drawAmount2) && C41536l.m120484d(this.firstPayDate, decisionDetailsApiModel.firstPayDate) && C41536l.m120484d(this.forgiveFeeAmount, decisionDetailsApiModel.forgiveFeeAmount) && C41536l.m120484d(this.forgiveIntAmount, decisionDetailsApiModel.forgiveIntAmount) && C41536l.m120484d(this.forgiveOdiAmount, decisionDetailsApiModel.forgiveOdiAmount) && C41536l.m120484d(this.fullPaymentAmount, decisionDetailsApiModel.fullPaymentAmount) && C41536l.m120484d(this.graceFlag, decisionDetailsApiModel.graceFlag) && C41536l.m120484d(this.insIncAmount, decisionDetailsApiModel.insIncAmount) && C41536l.m120484d(this.insIncFlag, decisionDetailsApiModel.insIncFlag) && C41536l.m120484d(this.insLifeAmount, decisionDetailsApiModel.insLifeAmount) && C41536l.m120484d(this.keepAmount, decisionDetailsApiModel.keepAmount) && C41536l.m120484d(this.lastPaymentAmount, decisionDetailsApiModel.lastPaymentAmount) && C41536l.m120484d(this.loanAmount, decisionDetailsApiModel.loanAmount) && C41536l.m120484d(this.minLoanAmount, decisionDetailsApiModel.minLoanAmount) && C41536l.m120484d(this.maxLoanAmount, decisionDetailsApiModel.maxLoanAmount) && C41536l.m120484d(this.loanCcy, decisionDetailsApiModel.loanCcy) && C41536l.m120484d(this.loanIrr, decisionDetailsApiModel.loanIrr) && C41536l.m120484d(this.loanIrr2, decisionDetailsApiModel.loanIrr2) && C41536l.m120484d(this.loanIrr3, decisionDetailsApiModel.loanIrr3) && C41536l.m120484d(this.loanIrr4, decisionDetailsApiModel.loanIrr4) && C41536l.m120484d(this.loanMaturity, decisionDetailsApiModel.loanMaturity) && C41536l.m120484d(this.loanRate, decisionDetailsApiModel.loanRate) && C41536l.m120484d(this.loanTerm, decisionDetailsApiModel.loanTerm) && C41536l.m120484d(this.maxTerm, decisionDetailsApiModel.maxTerm) && C41536l.m120484d(this.minTerm, decisionDetailsApiModel.minTerm) && C41536l.m120484d(this.operationType, decisionDetailsApiModel.operationType) && C41536l.m120484d(this.payDay, decisionDetailsApiModel.payDay) && C41536l.m120484d(this.paymentCount, decisionDetailsApiModel.paymentCount) && C41536l.m120484d(this.penaltyFee, decisionDetailsApiModel.penaltyFee) && C41536l.m120484d(this.penaltyFeeValue, decisionDetailsApiModel.penaltyFeeValue) && C41536l.m120484d(this.penaltyInt, decisionDetailsApiModel.penaltyInt) && C41536l.m120484d(this.penaltyOne, decisionDetailsApiModel.penaltyOne) && C41536l.m120484d(this.penaltyPre, decisionDetailsApiModel.penaltyPre) && C41536l.m120484d(this.penaltyPri, decisionDetailsApiModel.penaltyPri) && C41536l.m120484d(this.pmtAmount, decisionDetailsApiModel.pmtAmount) && C41536l.m120484d(this.rfncAmount, decisionDetailsApiModel.rfncAmount) && C41536l.m120484d(this.rqstDownPayment, decisionDetailsApiModel.rqstDownPayment) && C41536l.m120484d(this.titleDictionaryKey, decisionDetailsApiModel.titleDictionaryKey) && C41536l.m120484d(this.titleDictionaryKeyValue, decisionDetailsApiModel.titleDictionaryKeyValue) && C41536l.m120484d(this.withdrawalAmount, decisionDetailsApiModel.withdrawalAmount);
    }

    public final String getAccessType() {
        return this.accessType;
    }

    public final Double getComisAmount() {
        return this.comisAmount;
    }

    public final Double getComisMin() {
        return this.comisMin;
    }

    public final Double getComisRate() {
        return this.comisRate;
    }

    public final Integer getConditionDays() {
        return this.conditionDays;
    }

    public final String getConditionRate() {
        return this.conditionRate;
    }

    public final String getCreditorIdentified() {
        return this.CreditorIdentified;
    }

    public final Long getDecisionNo() {
        return this.decisionNo;
    }

    public final String getDecisionScheme() {
        return this.decisionScheme;
    }

    public final Double getDownPayment() {
        return this.downPayment;
    }

    public final Double getDrawAmount() {
        return this.drawAmount;
    }

    public final Double getDrawAmount2() {
        return this.drawAmount2;
    }

    public final Long getFirstPayDate() {
        return this.firstPayDate;
    }

    public final Double getForgiveFeeAmount() {
        return this.forgiveFeeAmount;
    }

    public final Double getForgiveIntAmount() {
        return this.forgiveIntAmount;
    }

    public final Double getForgiveOdiAmount() {
        return this.forgiveOdiAmount;
    }

    public final Double getFullPaymentAmount() {
        return this.fullPaymentAmount;
    }

    public final String getGraceFlag() {
        return this.graceFlag;
    }

    public final Double getInsIncAmount() {
        return this.insIncAmount;
    }

    public final String getInsIncFlag() {
        return this.insIncFlag;
    }

    public final Double getInsLifeAmount() {
        return this.insLifeAmount;
    }

    public final Double getKeepAmount() {
        return this.keepAmount;
    }

    public final Double getLastPaymentAmount() {
        return this.lastPaymentAmount;
    }

    public final Double getLoanAmount() {
        return this.loanAmount;
    }

    public final String getLoanCcy() {
        return this.loanCcy;
    }

    public final Double getLoanIrr() {
        return this.loanIrr;
    }

    public final Double getLoanIrr2() {
        return this.loanIrr2;
    }

    public final Double getLoanIrr3() {
        return this.loanIrr3;
    }

    public final Double getLoanIrr4() {
        return this.loanIrr4;
    }

    public final Long getLoanMaturity() {
        return this.loanMaturity;
    }

    public final Double getLoanRate() {
        return this.loanRate;
    }

    public final Integer getLoanTerm() {
        return this.loanTerm;
    }

    public final Double getMaxLoanAmount() {
        return this.maxLoanAmount;
    }

    public final Integer getMaxTerm() {
        return this.maxTerm;
    }

    public final Double getMinLoanAmount() {
        return this.minLoanAmount;
    }

    public final Integer getMinTerm() {
        return this.minTerm;
    }

    public final String getOperationType() {
        return this.operationType;
    }

    public final Integer getPayDay() {
        return this.payDay;
    }

    public final Integer getPaymentCount() {
        return this.paymentCount;
    }

    public final Double getPenaltyFee() {
        return this.penaltyFee;
    }

    public final String getPenaltyFeeValue() {
        return this.penaltyFeeValue;
    }

    public final Double getPenaltyInt() {
        return this.penaltyInt;
    }

    public final Double getPenaltyOne() {
        return this.penaltyOne;
    }

    public final Double getPenaltyPre() {
        return this.penaltyPre;
    }

    public final Double getPenaltyPri() {
        return this.penaltyPri;
    }

    public final Double getPmtAmount() {
        return this.pmtAmount;
    }

    public final Double getRfncAmount() {
        return this.rfncAmount;
    }

    public final Double getRqstDownPayment() {
        return this.rqstDownPayment;
    }

    public final String getTitleDictionaryKey() {
        return this.titleDictionaryKey;
    }

    public final String getTitleDictionaryKeyValue() {
        return this.titleDictionaryKeyValue;
    }

    public final Double getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public int hashCode() {
        String str = this.CreditorIdentified;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accessType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.comisAmount;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.comisMin;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.comisRate;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.conditionDays;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.conditionRate;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.decisionNo;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.decisionScheme;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.downPayment;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.drawAmount;
        int hashCode11 = (hashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.drawAmount2;
        int hashCode12 = (hashCode11 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Long l2 = this.firstPayDate;
        int hashCode13 = (hashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d7 = this.forgiveFeeAmount;
        int hashCode14 = (hashCode13 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.forgiveIntAmount;
        int hashCode15 = (hashCode14 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.forgiveOdiAmount;
        int hashCode16 = (hashCode15 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d12 = this.fullPaymentAmount;
        int hashCode17 = (hashCode16 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str5 = this.graceFlag;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d13 = this.insIncAmount;
        int hashCode19 = (hashCode18 + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str6 = this.insIncFlag;
        int hashCode20 = (hashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d14 = this.insLifeAmount;
        int hashCode21 = (hashCode20 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.keepAmount;
        int hashCode22 = (hashCode21 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.lastPaymentAmount;
        int hashCode23 = (hashCode22 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.loanAmount;
        int hashCode24 = (hashCode23 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.minLoanAmount;
        int hashCode25 = (hashCode24 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.maxLoanAmount;
        int hashCode26 = (hashCode25 + (d19 == null ? 0 : d19.hashCode())) * 31;
        String str7 = this.loanCcy;
        int hashCode27 = (hashCode26 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d22 = this.loanIrr;
        int hashCode28 = (hashCode27 + (d22 == null ? 0 : d22.hashCode())) * 31;
        Double d23 = this.loanIrr2;
        int hashCode29 = (hashCode28 + (d23 == null ? 0 : d23.hashCode())) * 31;
        Double d24 = this.loanIrr3;
        int hashCode30 = (hashCode29 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.loanIrr4;
        int hashCode31 = (hashCode30 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Long l3 = this.loanMaturity;
        int hashCode32 = (hashCode31 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d26 = this.loanRate;
        int hashCode33 = (hashCode32 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Integer num2 = this.loanTerm;
        int hashCode34 = (hashCode33 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxTerm;
        int hashCode35 = (hashCode34 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minTerm;
        int hashCode36 = (hashCode35 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.operationType;
        int hashCode37 = (hashCode36 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num5 = this.payDay;
        int hashCode38 = (hashCode37 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.paymentCount;
        int hashCode39 = (hashCode38 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d27 = this.penaltyFee;
        int hashCode40 = (hashCode39 + (d27 == null ? 0 : d27.hashCode())) * 31;
        String str9 = this.penaltyFeeValue;
        int hashCode41 = (hashCode40 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Double d28 = this.penaltyInt;
        int hashCode42 = (hashCode41 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.penaltyOne;
        int hashCode43 = (hashCode42 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d32 = this.penaltyPre;
        int hashCode44 = (hashCode43 + (d32 == null ? 0 : d32.hashCode())) * 31;
        Double d33 = this.penaltyPri;
        int hashCode45 = (hashCode44 + (d33 == null ? 0 : d33.hashCode())) * 31;
        Double d34 = this.pmtAmount;
        int hashCode46 = (hashCode45 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.rfncAmount;
        int hashCode47 = (hashCode46 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.rqstDownPayment;
        int hashCode48 = (hashCode47 + (d36 == null ? 0 : d36.hashCode())) * 31;
        String str10 = this.titleDictionaryKey;
        int hashCode49 = (hashCode48 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.titleDictionaryKeyValue;
        int hashCode50 = (hashCode49 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Double d37 = this.withdrawalAmount;
        if (d37 != null) {
            i = d37.hashCode();
        }
        return hashCode50 + i;
    }

    public String toString() {
        String str = this.CreditorIdentified;
        String str2 = this.accessType;
        Double d = this.comisAmount;
        Double d2 = this.comisMin;
        Double d3 = this.comisRate;
        Integer num = this.conditionDays;
        String str3 = this.conditionRate;
        Long l = this.decisionNo;
        String str4 = this.decisionScheme;
        Double d4 = this.downPayment;
        Double d5 = this.drawAmount;
        Double d6 = this.drawAmount2;
        Long l2 = this.firstPayDate;
        Double d7 = this.forgiveFeeAmount;
        Double d8 = this.forgiveIntAmount;
        Double d9 = this.forgiveOdiAmount;
        Double d12 = this.fullPaymentAmount;
        String str5 = this.graceFlag;
        Double d13 = this.insIncAmount;
        String str6 = this.insIncFlag;
        Double d14 = this.insLifeAmount;
        Double d15 = this.keepAmount;
        Double d16 = this.lastPaymentAmount;
        Double d17 = this.loanAmount;
        Double d18 = this.minLoanAmount;
        Double d19 = this.maxLoanAmount;
        String str7 = this.loanCcy;
        Double d22 = this.loanIrr;
        Double d23 = this.loanIrr2;
        Double d24 = this.loanIrr3;
        Double d25 = this.loanIrr4;
        Long l3 = this.loanMaturity;
        Double d26 = this.loanRate;
        Integer num2 = this.loanTerm;
        Integer num3 = this.maxTerm;
        Integer num4 = this.minTerm;
        String str8 = this.operationType;
        Integer num5 = this.payDay;
        Integer num6 = this.paymentCount;
        Double d27 = this.penaltyFee;
        String str9 = this.penaltyFeeValue;
        Double d28 = this.penaltyInt;
        Double d29 = this.penaltyOne;
        Double d32 = this.penaltyPre;
        Double d33 = this.penaltyPri;
        Double d34 = this.pmtAmount;
        Double d35 = this.rfncAmount;
        Double d36 = this.rqstDownPayment;
        String str10 = this.titleDictionaryKey;
        String str11 = this.titleDictionaryKeyValue;
        Double d37 = this.withdrawalAmount;
        return "DecisionDetailsApiModel(CreditorIdentified=" + str + ", accessType=" + str2 + ", comisAmount=" + d + ", comisMin=" + d2 + ", comisRate=" + d3 + ", conditionDays=" + num + ", conditionRate=" + str3 + ", decisionNo=" + l + ", decisionScheme=" + str4 + ", downPayment=" + d4 + ", drawAmount=" + d5 + ", drawAmount2=" + d6 + ", firstPayDate=" + l2 + ", forgiveFeeAmount=" + d7 + ", forgiveIntAmount=" + d8 + ", forgiveOdiAmount=" + d9 + ", fullPaymentAmount=" + d12 + ", graceFlag=" + str5 + ", insIncAmount=" + d13 + ", insIncFlag=" + str6 + ", insLifeAmount=" + d14 + ", keepAmount=" + d15 + ", lastPaymentAmount=" + d16 + ", loanAmount=" + d17 + ", minLoanAmount=" + d18 + ", maxLoanAmount=" + d19 + ", loanCcy=" + str7 + ", loanIrr=" + d22 + ", loanIrr2=" + d23 + ", loanIrr3=" + d24 + ", loanIrr4=" + d25 + ", loanMaturity=" + l3 + ", loanRate=" + d26 + ", loanTerm=" + num2 + ", maxTerm=" + num3 + ", minTerm=" + num4 + ", operationType=" + str8 + ", payDay=" + num5 + ", paymentCount=" + num6 + ", penaltyFee=" + d27 + ", penaltyFeeValue=" + str9 + ", penaltyInt=" + d28 + ", penaltyOne=" + d29 + ", penaltyPre=" + d32 + ", penaltyPri=" + d33 + ", pmtAmount=" + d34 + ", rfncAmount=" + d35 + ", rqstDownPayment=" + d36 + ", titleDictionaryKey=" + str10 + ", titleDictionaryKeyValue=" + str11 + ", withdrawalAmount=" + d37 + ")";
    }
}
