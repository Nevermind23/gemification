package p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditCardOfferDetailsEntity */
public final class CreditCardOfferDetailsEntity {
    private String accessType;
    private String cardCcy;
    private String cardClass;
    private String cardLast4;
    private BigDecimal cardLimit;
    private String cardName;
    private String cardType;
    private String cardTypeDictionaryKey;
    private String comisAmount;
    private Long decisionNo;
    private String decisionScheme;
    private BigDecimal disbursementAmount;
    private BigDecimal disbursementAmount2;
    private String feeAmount;
    private String irr2Purchase;
    private String irr2Withdrawal;
    private String irrPurchase;
    private Double irrWithdrawal;
    private String newCardIconBase64;
    private String offerDetailsText;
    private String offerMainText;
    private String operationType;
    private Double overCancelRate;
    private String overPenaltyRate;
    private String overdueHard;
    private String overdueHardRate;
    private String overdueSoft;
    private Double overdueSoftRate;
    private Integer periodLength;
    private String periodUnit;
    private Double ratePurchase;
    private Double rateWithdrawal;
    private String templCode;
    private BigDecimal withdrawalAmount;

    public CreditCardOfferDetailsEntity() {
        this((String) null, (String) null, (Double) null, (String) null, (Double) null, (String) null, (Double) null, (BigDecimal) null, (Long) null, (String) null, (String) null, (String) null, (BigDecimal) null, (Double) null, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (BigDecimal) null, (BigDecimal) null, (String) null, (String) null, (String) null, (String) null, -1, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CreditCardOfferDetailsEntity copy$default(CreditCardOfferDetailsEntity creditCardOfferDetailsEntity, String str, String str2, Double d, String str3, Double d2, String str4, Double d3, BigDecimal bigDecimal, Long l, String str5, String str6, String str7, BigDecimal bigDecimal2, Double d4, Double d5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18, String str19, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str20, String str21, String str22, String str23, int i, int i2, Object obj) {
        CreditCardOfferDetailsEntity creditCardOfferDetailsEntity2 = creditCardOfferDetailsEntity;
        int i3 = i;
        return creditCardOfferDetailsEntity.copy((i3 & 1) != 0 ? creditCardOfferDetailsEntity2.irr2Purchase : str, (i3 & 2) != 0 ? creditCardOfferDetailsEntity2.cardName : str2, (i3 & 4) != 0 ? creditCardOfferDetailsEntity2.ratePurchase : d, (i3 & 8) != 0 ? creditCardOfferDetailsEntity2.periodUnit : str3, (i3 & 16) != 0 ? creditCardOfferDetailsEntity2.overCancelRate : d2, (i3 & 32) != 0 ? creditCardOfferDetailsEntity2.accessType : str4, (i3 & 64) != 0 ? creditCardOfferDetailsEntity2.overdueSoftRate : d3, (i3 & 128) != 0 ? creditCardOfferDetailsEntity2.withdrawalAmount : bigDecimal, (i3 & C11398b.f33139r) != 0 ? creditCardOfferDetailsEntity2.decisionNo : l, (i3 & C11398b.f33140s) != 0 ? creditCardOfferDetailsEntity2.newCardIconBase64 : str5, (i3 & C11398b.f33141t) != 0 ? creditCardOfferDetailsEntity2.decisionScheme : str6, (i3 & C11398b.f33142u) != 0 ? creditCardOfferDetailsEntity2.cardClass : str7, (i3 & C11398b.f33143v) != 0 ? creditCardOfferDetailsEntity2.cardLimit : bigDecimal2, (i3 & 8192) != 0 ? creditCardOfferDetailsEntity2.irrWithdrawal : d4, (i3 & 16384) != 0 ? creditCardOfferDetailsEntity2.rateWithdrawal : d5, (i3 & 32768) != 0 ? creditCardOfferDetailsEntity2.cardType : str8, (i3 & 65536) != 0 ? creditCardOfferDetailsEntity2.cardCcy : str9, (i3 & 131072) != 0 ? creditCardOfferDetailsEntity2.overPenaltyRate : str10, (i3 & 262144) != 0 ? creditCardOfferDetailsEntity2.comisAmount : str11, (i3 & 524288) != 0 ? creditCardOfferDetailsEntity2.feeAmount : str12, (i3 & 1048576) != 0 ? creditCardOfferDetailsEntity2.templCode : str13, (i3 & 2097152) != 0 ? creditCardOfferDetailsEntity2.irrPurchase : str14, (i3 & 4194304) != 0 ? creditCardOfferDetailsEntity2.overdueHardRate : str15, (i3 & 8388608) != 0 ? creditCardOfferDetailsEntity2.irr2Withdrawal : str16, (i3 & 16777216) != 0 ? creditCardOfferDetailsEntity2.operationType : str17, (i3 & 33554432) != 0 ? creditCardOfferDetailsEntity2.periodLength : num, (i3 & 67108864) != 0 ? creditCardOfferDetailsEntity2.overdueHard : str18, (i3 & 134217728) != 0 ? creditCardOfferDetailsEntity2.overdueSoft : str19, (i3 & 268435456) != 0 ? creditCardOfferDetailsEntity2.disbursementAmount : bigDecimal3, (i3 & 536870912) != 0 ? creditCardOfferDetailsEntity2.disbursementAmount2 : bigDecimal4, (i3 & 1073741824) != 0 ? creditCardOfferDetailsEntity2.cardLast4 : str20, (i3 & Integer.MIN_VALUE) != 0 ? creditCardOfferDetailsEntity2.cardTypeDictionaryKey : str21, (i2 & 1) != 0 ? creditCardOfferDetailsEntity2.offerDetailsText : str22, (i2 & 2) != 0 ? creditCardOfferDetailsEntity2.offerMainText : str23);
    }

    public final String component1() {
        return this.irr2Purchase;
    }

    public final String component10() {
        return this.newCardIconBase64;
    }

    public final String component11() {
        return this.decisionScheme;
    }

    public final String component12() {
        return this.cardClass;
    }

    public final BigDecimal component13() {
        return this.cardLimit;
    }

    public final Double component14() {
        return this.irrWithdrawal;
    }

    public final Double component15() {
        return this.rateWithdrawal;
    }

    public final String component16() {
        return this.cardType;
    }

    public final String component17() {
        return this.cardCcy;
    }

    public final String component18() {
        return this.overPenaltyRate;
    }

    public final String component19() {
        return this.comisAmount;
    }

    public final String component2() {
        return this.cardName;
    }

    public final String component20() {
        return this.feeAmount;
    }

    public final String component21() {
        return this.templCode;
    }

    public final String component22() {
        return this.irrPurchase;
    }

    public final String component23() {
        return this.overdueHardRate;
    }

    public final String component24() {
        return this.irr2Withdrawal;
    }

    public final String component25() {
        return this.operationType;
    }

    public final Integer component26() {
        return this.periodLength;
    }

    public final String component27() {
        return this.overdueHard;
    }

    public final String component28() {
        return this.overdueSoft;
    }

    public final BigDecimal component29() {
        return this.disbursementAmount;
    }

    public final Double component3() {
        return this.ratePurchase;
    }

    public final BigDecimal component30() {
        return this.disbursementAmount2;
    }

    public final String component31() {
        return this.cardLast4;
    }

    public final String component32() {
        return this.cardTypeDictionaryKey;
    }

    public final String component33() {
        return this.offerDetailsText;
    }

    public final String component34() {
        return this.offerMainText;
    }

    public final String component4() {
        return this.periodUnit;
    }

    public final Double component5() {
        return this.overCancelRate;
    }

    public final String component6() {
        return this.accessType;
    }

    public final Double component7() {
        return this.overdueSoftRate;
    }

    public final BigDecimal component8() {
        return this.withdrawalAmount;
    }

    public final Long component9() {
        return this.decisionNo;
    }

    public final CreditCardOfferDetailsEntity copy(String str, String str2, Double d, String str3, Double d2, String str4, Double d3, BigDecimal bigDecimal, Long l, String str5, String str6, String str7, BigDecimal bigDecimal2, Double d4, Double d5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18, String str19, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str20, String str21, String str22, String str23) {
        return new CreditCardOfferDetailsEntity(str, str2, d, str3, d2, str4, d3, bigDecimal, l, str5, str6, str7, bigDecimal2, d4, d5, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, num, str18, str19, bigDecimal3, bigDecimal4, str20, str21, str22, str23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardOfferDetailsEntity)) {
            return false;
        }
        CreditCardOfferDetailsEntity creditCardOfferDetailsEntity = (CreditCardOfferDetailsEntity) obj;
        return C41536l.m120484d(this.irr2Purchase, creditCardOfferDetailsEntity.irr2Purchase) && C41536l.m120484d(this.cardName, creditCardOfferDetailsEntity.cardName) && C41536l.m120484d(this.ratePurchase, creditCardOfferDetailsEntity.ratePurchase) && C41536l.m120484d(this.periodUnit, creditCardOfferDetailsEntity.periodUnit) && C41536l.m120484d(this.overCancelRate, creditCardOfferDetailsEntity.overCancelRate) && C41536l.m120484d(this.accessType, creditCardOfferDetailsEntity.accessType) && C41536l.m120484d(this.overdueSoftRate, creditCardOfferDetailsEntity.overdueSoftRate) && C41536l.m120484d(this.withdrawalAmount, creditCardOfferDetailsEntity.withdrawalAmount) && C41536l.m120484d(this.decisionNo, creditCardOfferDetailsEntity.decisionNo) && C41536l.m120484d(this.newCardIconBase64, creditCardOfferDetailsEntity.newCardIconBase64) && C41536l.m120484d(this.decisionScheme, creditCardOfferDetailsEntity.decisionScheme) && C41536l.m120484d(this.cardClass, creditCardOfferDetailsEntity.cardClass) && C41536l.m120484d(this.cardLimit, creditCardOfferDetailsEntity.cardLimit) && C41536l.m120484d(this.irrWithdrawal, creditCardOfferDetailsEntity.irrWithdrawal) && C41536l.m120484d(this.rateWithdrawal, creditCardOfferDetailsEntity.rateWithdrawal) && C41536l.m120484d(this.cardType, creditCardOfferDetailsEntity.cardType) && C41536l.m120484d(this.cardCcy, creditCardOfferDetailsEntity.cardCcy) && C41536l.m120484d(this.overPenaltyRate, creditCardOfferDetailsEntity.overPenaltyRate) && C41536l.m120484d(this.comisAmount, creditCardOfferDetailsEntity.comisAmount) && C41536l.m120484d(this.feeAmount, creditCardOfferDetailsEntity.feeAmount) && C41536l.m120484d(this.templCode, creditCardOfferDetailsEntity.templCode) && C41536l.m120484d(this.irrPurchase, creditCardOfferDetailsEntity.irrPurchase) && C41536l.m120484d(this.overdueHardRate, creditCardOfferDetailsEntity.overdueHardRate) && C41536l.m120484d(this.irr2Withdrawal, creditCardOfferDetailsEntity.irr2Withdrawal) && C41536l.m120484d(this.operationType, creditCardOfferDetailsEntity.operationType) && C41536l.m120484d(this.periodLength, creditCardOfferDetailsEntity.periodLength) && C41536l.m120484d(this.overdueHard, creditCardOfferDetailsEntity.overdueHard) && C41536l.m120484d(this.overdueSoft, creditCardOfferDetailsEntity.overdueSoft) && C41536l.m120484d(this.disbursementAmount, creditCardOfferDetailsEntity.disbursementAmount) && C41536l.m120484d(this.disbursementAmount2, creditCardOfferDetailsEntity.disbursementAmount2) && C41536l.m120484d(this.cardLast4, creditCardOfferDetailsEntity.cardLast4) && C41536l.m120484d(this.cardTypeDictionaryKey, creditCardOfferDetailsEntity.cardTypeDictionaryKey) && C41536l.m120484d(this.offerDetailsText, creditCardOfferDetailsEntity.offerDetailsText) && C41536l.m120484d(this.offerMainText, creditCardOfferDetailsEntity.offerMainText);
    }

    public final String getAccessType() {
        return this.accessType;
    }

    public final String getCardCcy() {
        return this.cardCcy;
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final String getCardLast4() {
        return this.cardLast4;
    }

    public final BigDecimal getCardLimit() {
        return this.cardLimit;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCardTypeDictionaryKey() {
        return this.cardTypeDictionaryKey;
    }

    public final String getComisAmount() {
        return this.comisAmount;
    }

    public final Long getDecisionNo() {
        return this.decisionNo;
    }

    public final String getDecisionScheme() {
        return this.decisionScheme;
    }

    public final BigDecimal getDisbursementAmount() {
        return this.disbursementAmount;
    }

    public final BigDecimal getDisbursementAmount2() {
        return this.disbursementAmount2;
    }

    public final String getFeeAmount() {
        return this.feeAmount;
    }

    public final String getIrr2Purchase() {
        return this.irr2Purchase;
    }

    public final String getIrr2Withdrawal() {
        return this.irr2Withdrawal;
    }

    public final String getIrrPurchase() {
        return this.irrPurchase;
    }

    public final Double getIrrWithdrawal() {
        return this.irrWithdrawal;
    }

    public final String getNewCardIconBase64() {
        return this.newCardIconBase64;
    }

    public final String getOfferDetailsText() {
        return this.offerDetailsText;
    }

    public final String getOfferMainText() {
        return this.offerMainText;
    }

    public final String getOperationType() {
        return this.operationType;
    }

    public final Double getOverCancelRate() {
        return this.overCancelRate;
    }

    public final String getOverPenaltyRate() {
        return this.overPenaltyRate;
    }

    public final String getOverdueHard() {
        return this.overdueHard;
    }

    public final String getOverdueHardRate() {
        return this.overdueHardRate;
    }

    public final String getOverdueSoft() {
        return this.overdueSoft;
    }

    public final Double getOverdueSoftRate() {
        return this.overdueSoftRate;
    }

    public final Integer getPeriodLength() {
        return this.periodLength;
    }

    public final String getPeriodUnit() {
        return this.periodUnit;
    }

    public final Double getRatePurchase() {
        return this.ratePurchase;
    }

    public final Double getRateWithdrawal() {
        return this.rateWithdrawal;
    }

    public final String getTemplCode() {
        return this.templCode;
    }

    public final BigDecimal getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public int hashCode() {
        String str = this.irr2Purchase;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.ratePurchase;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.periodUnit;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d2 = this.overCancelRate;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str4 = this.accessType;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d3 = this.overdueSoftRate;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        BigDecimal bigDecimal = this.withdrawalAmount;
        int hashCode8 = (hashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l = this.decisionNo;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.newCardIconBase64;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.decisionScheme;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardClass;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.cardLimit;
        int hashCode13 = (hashCode12 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Double d4 = this.irrWithdrawal;
        int hashCode14 = (hashCode13 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.rateWithdrawal;
        int hashCode15 = (hashCode14 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str8 = this.cardType;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardCcy;
        int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.overPenaltyRate;
        int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.comisAmount;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.feeAmount;
        int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.templCode;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.irrPurchase;
        int hashCode22 = (hashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.overdueHardRate;
        int hashCode23 = (hashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.irr2Withdrawal;
        int hashCode24 = (hashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.operationType;
        int hashCode25 = (hashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num = this.periodLength;
        int hashCode26 = (hashCode25 + (num == null ? 0 : num.hashCode())) * 31;
        String str18 = this.overdueHard;
        int hashCode27 = (hashCode26 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.overdueSoft;
        int hashCode28 = (hashCode27 + (str19 == null ? 0 : str19.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.disbursementAmount;
        int hashCode29 = (hashCode28 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.disbursementAmount2;
        int hashCode30 = (hashCode29 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str20 = this.cardLast4;
        int hashCode31 = (hashCode30 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.cardTypeDictionaryKey;
        int hashCode32 = (hashCode31 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.offerDetailsText;
        int hashCode33 = (hashCode32 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.offerMainText;
        if (str23 != null) {
            i = str23.hashCode();
        }
        return hashCode33 + i;
    }

    public final void setAccessType(String str) {
        this.accessType = str;
    }

    public final void setCardCcy(String str) {
        this.cardCcy = str;
    }

    public final void setCardClass(String str) {
        this.cardClass = str;
    }

    public final void setCardLast4(String str) {
        this.cardLast4 = str;
    }

    public final void setCardLimit(BigDecimal bigDecimal) {
        this.cardLimit = bigDecimal;
    }

    public final void setCardName(String str) {
        this.cardName = str;
    }

    public final void setCardType(String str) {
        this.cardType = str;
    }

    public final void setCardTypeDictionaryKey(String str) {
        this.cardTypeDictionaryKey = str;
    }

    public final void setComisAmount(String str) {
        this.comisAmount = str;
    }

    public final void setDecisionNo(Long l) {
        this.decisionNo = l;
    }

    public final void setDecisionScheme(String str) {
        this.decisionScheme = str;
    }

    public final void setDisbursementAmount(BigDecimal bigDecimal) {
        this.disbursementAmount = bigDecimal;
    }

    public final void setDisbursementAmount2(BigDecimal bigDecimal) {
        this.disbursementAmount2 = bigDecimal;
    }

    public final void setFeeAmount(String str) {
        this.feeAmount = str;
    }

    public final void setIrr2Purchase(String str) {
        this.irr2Purchase = str;
    }

    public final void setIrr2Withdrawal(String str) {
        this.irr2Withdrawal = str;
    }

    public final void setIrrPurchase(String str) {
        this.irrPurchase = str;
    }

    public final void setIrrWithdrawal(Double d) {
        this.irrWithdrawal = d;
    }

    public final void setNewCardIconBase64(String str) {
        this.newCardIconBase64 = str;
    }

    public final void setOfferDetailsText(String str) {
        this.offerDetailsText = str;
    }

    public final void setOfferMainText(String str) {
        this.offerMainText = str;
    }

    public final void setOperationType(String str) {
        this.operationType = str;
    }

    public final void setOverCancelRate(Double d) {
        this.overCancelRate = d;
    }

    public final void setOverPenaltyRate(String str) {
        this.overPenaltyRate = str;
    }

    public final void setOverdueHard(String str) {
        this.overdueHard = str;
    }

    public final void setOverdueHardRate(String str) {
        this.overdueHardRate = str;
    }

    public final void setOverdueSoft(String str) {
        this.overdueSoft = str;
    }

    public final void setOverdueSoftRate(Double d) {
        this.overdueSoftRate = d;
    }

    public final void setPeriodLength(Integer num) {
        this.periodLength = num;
    }

    public final void setPeriodUnit(String str) {
        this.periodUnit = str;
    }

    public final void setRatePurchase(Double d) {
        this.ratePurchase = d;
    }

    public final void setRateWithdrawal(Double d) {
        this.rateWithdrawal = d;
    }

    public final void setTemplCode(String str) {
        this.templCode = str;
    }

    public final void setWithdrawalAmount(BigDecimal bigDecimal) {
        this.withdrawalAmount = bigDecimal;
    }

    public String toString() {
        String str = this.irr2Purchase;
        String str2 = this.cardName;
        Double d = this.ratePurchase;
        String str3 = this.periodUnit;
        Double d2 = this.overCancelRate;
        String str4 = this.accessType;
        Double d3 = this.overdueSoftRate;
        BigDecimal bigDecimal = this.withdrawalAmount;
        Long l = this.decisionNo;
        String str5 = this.newCardIconBase64;
        String str6 = this.decisionScheme;
        String str7 = this.cardClass;
        BigDecimal bigDecimal2 = this.cardLimit;
        Double d4 = this.irrWithdrawal;
        Double d5 = this.rateWithdrawal;
        String str8 = this.cardType;
        String str9 = this.cardCcy;
        String str10 = this.overPenaltyRate;
        String str11 = this.comisAmount;
        String str12 = this.feeAmount;
        String str13 = this.templCode;
        String str14 = this.irrPurchase;
        String str15 = this.overdueHardRate;
        String str16 = this.irr2Withdrawal;
        String str17 = this.operationType;
        Integer num = this.periodLength;
        String str18 = this.overdueHard;
        String str19 = this.overdueSoft;
        BigDecimal bigDecimal3 = this.disbursementAmount;
        BigDecimal bigDecimal4 = this.disbursementAmount2;
        String str20 = this.cardLast4;
        String str21 = this.cardTypeDictionaryKey;
        String str22 = this.offerDetailsText;
        String str23 = this.offerMainText;
        return "CreditCardOfferDetailsEntity(irr2Purchase=" + str + ", cardName=" + str2 + ", ratePurchase=" + d + ", periodUnit=" + str3 + ", overCancelRate=" + d2 + ", accessType=" + str4 + ", overdueSoftRate=" + d3 + ", withdrawalAmount=" + bigDecimal + ", decisionNo=" + l + ", newCardIconBase64=" + str5 + ", decisionScheme=" + str6 + ", cardClass=" + str7 + ", cardLimit=" + bigDecimal2 + ", irrWithdrawal=" + d4 + ", rateWithdrawal=" + d5 + ", cardType=" + str8 + ", cardCcy=" + str9 + ", overPenaltyRate=" + str10 + ", comisAmount=" + str11 + ", feeAmount=" + str12 + ", templCode=" + str13 + ", irrPurchase=" + str14 + ", overdueHardRate=" + str15 + ", irr2Withdrawal=" + str16 + ", operationType=" + str17 + ", periodLength=" + num + ", overdueHard=" + str18 + ", overdueSoft=" + str19 + ", disbursementAmount=" + bigDecimal3 + ", disbursementAmount2=" + bigDecimal4 + ", cardLast4=" + str20 + ", cardTypeDictionaryKey=" + str21 + ", offerDetailsText=" + str22 + ", offerMainText=" + str23 + ")";
    }

    public CreditCardOfferDetailsEntity(String str, String str2, Double d, String str3, Double d2, String str4, Double d3, BigDecimal bigDecimal, Long l, String str5, String str6, String str7, BigDecimal bigDecimal2, Double d4, Double d5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18, String str19, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str20, String str21, String str22, String str23) {
        this.irr2Purchase = str;
        this.cardName = str2;
        this.ratePurchase = d;
        this.periodUnit = str3;
        this.overCancelRate = d2;
        this.accessType = str4;
        this.overdueSoftRate = d3;
        this.withdrawalAmount = bigDecimal;
        this.decisionNo = l;
        this.newCardIconBase64 = str5;
        this.decisionScheme = str6;
        this.cardClass = str7;
        this.cardLimit = bigDecimal2;
        this.irrWithdrawal = d4;
        this.rateWithdrawal = d5;
        this.cardType = str8;
        this.cardCcy = str9;
        this.overPenaltyRate = str10;
        this.comisAmount = str11;
        this.feeAmount = str12;
        this.templCode = str13;
        this.irrPurchase = str14;
        this.overdueHardRate = str15;
        this.irr2Withdrawal = str16;
        this.operationType = str17;
        this.periodLength = num;
        this.overdueHard = str18;
        this.overdueSoft = str19;
        this.disbursementAmount = bigDecimal3;
        this.disbursementAmount2 = bigDecimal4;
        this.cardLast4 = str20;
        this.cardTypeDictionaryKey = str21;
        this.offerDetailsText = str22;
        this.offerMainText = str23;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreditCardOfferDetailsEntity(java.lang.String r35, java.lang.String r36, java.lang.Double r37, java.lang.String r38, java.lang.Double r39, java.lang.String r40, java.lang.Double r41, java.math.BigDecimal r42, java.lang.Long r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.math.BigDecimal r47, java.lang.Double r48, java.lang.Double r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.Integer r60, java.lang.String r61, java.lang.String r62, java.math.BigDecimal r63, java.math.BigDecimal r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, int r69, int r70, kotlin.jvm.internal.DefaultConstructorMarker r71) {
        /*
            r34 = this;
            r0 = r69
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r35
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r36
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r37
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r38
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r39
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r40
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r41
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r42
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r43
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r44
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r45
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r46
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r47
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r48
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r49
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r50
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r51
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r52
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r53
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r54
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r55
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r56
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r57
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r58
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r59
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f2
            r26 = 0
            goto L_0x00f4
        L_0x00f2:
            r26 = r60
        L_0x00f4:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00fd
            r27 = 0
            goto L_0x00ff
        L_0x00fd:
            r27 = r61
        L_0x00ff:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0108
            r28 = 0
            goto L_0x010a
        L_0x0108:
            r28 = r62
        L_0x010a:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x0113
            r29 = 0
            goto L_0x0115
        L_0x0113:
            r29 = r63
        L_0x0115:
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x011e
            r30 = 0
            goto L_0x0120
        L_0x011e:
            r30 = r64
        L_0x0120:
            r31 = 1073741824(0x40000000, float:2.0)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0129
            r31 = 0
            goto L_0x012b
        L_0x0129:
            r31 = r65
        L_0x012b:
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r32
            if (r0 == 0) goto L_0x0133
            r0 = 0
            goto L_0x0135
        L_0x0133:
            r0 = r66
        L_0x0135:
            r32 = r70 & 1
            if (r32 == 0) goto L_0x013c
            r32 = 0
            goto L_0x013e
        L_0x013c:
            r32 = r67
        L_0x013e:
            r33 = r70 & 2
            if (r33 == 0) goto L_0x0145
            r33 = 0
            goto L_0x0147
        L_0x0145:
            r33 = r68
        L_0x0147:
            r35 = r34
            r36 = r1
            r37 = r3
            r38 = r4
            r39 = r5
            r40 = r6
            r41 = r7
            r42 = r8
            r43 = r9
            r44 = r10
            r45 = r11
            r46 = r12
            r47 = r13
            r48 = r14
            r49 = r15
            r50 = r2
            r51 = r16
            r52 = r17
            r53 = r18
            r54 = r19
            r55 = r20
            r56 = r21
            r57 = r22
            r58 = r23
            r59 = r24
            r60 = r25
            r61 = r26
            r62 = r27
            r63 = r28
            r64 = r29
            r65 = r30
            r66 = r31
            r67 = r0
            r68 = r32
            r69 = r33
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditCardOfferDetailsEntity.<init>(java.lang.String, java.lang.String, java.lang.Double, java.lang.String, java.lang.Double, java.lang.String, java.lang.Double, java.math.BigDecimal, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
