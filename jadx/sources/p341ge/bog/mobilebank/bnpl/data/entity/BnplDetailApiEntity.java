package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplDetailApiEntity */
public final class BnplDetailApiEntity {
    private final Long clientKey;
    private final String fileUrl;
    private final Long firstDdDate;
    private final Boolean hasInsFlag;
    private final Boolean hasSmsScheme;
    private final Double initialPrincipal;
    private final Double insAmount;
    private final Double interestRate;
    private final Boolean isLoanReverseAllowed;
    private final String isOnlineInstallment;
    private final Boolean isReversible;
    private final Long linkAcctKey;
    private final String linkAcctNo;
    private final Double loanDebt;
    private final long loanKey;
    private final String loanSubType;
    private final Long matureDate;
    private final Double nextInterest;
    private final Double nextPayment;
    private final Double offsetIntSaved;
    private final Double prePaymentCom;
    private final Double remainingInterest;
    private final RePaymentFlagApi repaymentFlag;
    private final Double restAmount;
    private final String reversalStatus;
    private final String reversalStatusDictionaryKey;
    private final String reversalStatusDictionaryValue;
    private final Long signedDate;
    private final String subTypeGroup;

    public BnplDetailApiEntity(long j, Long l, Long l2, Long l3, Long l4, Double d, Double d2, Double d3, Double d4, Long l5, Boolean bool, Double d5, String str, Double d6, Double d7, String str2, Boolean bool2, Boolean bool3, String str3, Double d8, Double d9, RePaymentFlagApi rePaymentFlagApi, Boolean bool4, Double d12, String str4, String str5, String str6, String str7, String str8) {
        this.loanKey = j;
        this.signedDate = l;
        this.firstDdDate = l2;
        this.matureDate = l3;
        this.linkAcctKey = l4;
        this.initialPrincipal = d;
        this.remainingInterest = d2;
        this.offsetIntSaved = d3;
        this.interestRate = d4;
        this.clientKey = l5;
        this.hasInsFlag = bool;
        this.insAmount = d5;
        this.loanSubType = str;
        this.nextInterest = d6;
        this.nextPayment = d7;
        this.subTypeGroup = str2;
        this.hasSmsScheme = bool2;
        this.isLoanReverseAllowed = bool3;
        this.linkAcctNo = str3;
        this.restAmount = d8;
        this.prePaymentCom = d9;
        this.repaymentFlag = rePaymentFlagApi;
        this.isReversible = bool4;
        this.loanDebt = d12;
        this.fileUrl = str4;
        this.isOnlineInstallment = str5;
        this.reversalStatus = str6;
        this.reversalStatusDictionaryKey = str7;
        this.reversalStatusDictionaryValue = str8;
    }

    public static /* synthetic */ BnplDetailApiEntity copy$default(BnplDetailApiEntity bnplDetailApiEntity, long j, Long l, Long l2, Long l3, Long l4, Double d, Double d2, Double d3, Double d4, Long l5, Boolean bool, Double d5, String str, Double d6, Double d7, String str2, Boolean bool2, Boolean bool3, String str3, Double d8, Double d9, RePaymentFlagApi rePaymentFlagApi, Boolean bool4, Double d12, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        BnplDetailApiEntity bnplDetailApiEntity2 = bnplDetailApiEntity;
        int i2 = i;
        return bnplDetailApiEntity.copy((i2 & 1) != 0 ? bnplDetailApiEntity2.loanKey : j, (i2 & 2) != 0 ? bnplDetailApiEntity2.signedDate : l, (i2 & 4) != 0 ? bnplDetailApiEntity2.firstDdDate : l2, (i2 & 8) != 0 ? bnplDetailApiEntity2.matureDate : l3, (i2 & 16) != 0 ? bnplDetailApiEntity2.linkAcctKey : l4, (i2 & 32) != 0 ? bnplDetailApiEntity2.initialPrincipal : d, (i2 & 64) != 0 ? bnplDetailApiEntity2.remainingInterest : d2, (i2 & 128) != 0 ? bnplDetailApiEntity2.offsetIntSaved : d3, (i2 & C11398b.f33139r) != 0 ? bnplDetailApiEntity2.interestRate : d4, (i2 & C11398b.f33140s) != 0 ? bnplDetailApiEntity2.clientKey : l5, (i2 & C11398b.f33141t) != 0 ? bnplDetailApiEntity2.hasInsFlag : bool, (i2 & C11398b.f33142u) != 0 ? bnplDetailApiEntity2.insAmount : d5, (i2 & C11398b.f33143v) != 0 ? bnplDetailApiEntity2.loanSubType : str, (i2 & 8192) != 0 ? bnplDetailApiEntity2.nextInterest : d6, (i2 & 16384) != 0 ? bnplDetailApiEntity2.nextPayment : d7, (i2 & 32768) != 0 ? bnplDetailApiEntity2.subTypeGroup : str2, (i2 & 65536) != 0 ? bnplDetailApiEntity2.hasSmsScheme : bool2, (i2 & 131072) != 0 ? bnplDetailApiEntity2.isLoanReverseAllowed : bool3, (i2 & 262144) != 0 ? bnplDetailApiEntity2.linkAcctNo : str3, (i2 & 524288) != 0 ? bnplDetailApiEntity2.restAmount : d8, (i2 & 1048576) != 0 ? bnplDetailApiEntity2.prePaymentCom : d9, (i2 & 2097152) != 0 ? bnplDetailApiEntity2.repaymentFlag : rePaymentFlagApi, (i2 & 4194304) != 0 ? bnplDetailApiEntity2.isReversible : bool4, (i2 & 8388608) != 0 ? bnplDetailApiEntity2.loanDebt : d12, (i2 & 16777216) != 0 ? bnplDetailApiEntity2.fileUrl : str4, (i2 & 33554432) != 0 ? bnplDetailApiEntity2.isOnlineInstallment : str5, (i2 & 67108864) != 0 ? bnplDetailApiEntity2.reversalStatus : str6, (i2 & 134217728) != 0 ? bnplDetailApiEntity2.reversalStatusDictionaryKey : str7, (i2 & 268435456) != 0 ? bnplDetailApiEntity2.reversalStatusDictionaryValue : str8);
    }

    public final long component1() {
        return this.loanKey;
    }

    public final Long component10() {
        return this.clientKey;
    }

    public final Boolean component11() {
        return this.hasInsFlag;
    }

    public final Double component12() {
        return this.insAmount;
    }

    public final String component13() {
        return this.loanSubType;
    }

    public final Double component14() {
        return this.nextInterest;
    }

    public final Double component15() {
        return this.nextPayment;
    }

    public final String component16() {
        return this.subTypeGroup;
    }

    public final Boolean component17() {
        return this.hasSmsScheme;
    }

    public final Boolean component18() {
        return this.isLoanReverseAllowed;
    }

    public final String component19() {
        return this.linkAcctNo;
    }

    public final Long component2() {
        return this.signedDate;
    }

    public final Double component20() {
        return this.restAmount;
    }

    public final Double component21() {
        return this.prePaymentCom;
    }

    public final RePaymentFlagApi component22() {
        return this.repaymentFlag;
    }

    public final Boolean component23() {
        return this.isReversible;
    }

    public final Double component24() {
        return this.loanDebt;
    }

    public final String component25() {
        return this.fileUrl;
    }

    public final String component26() {
        return this.isOnlineInstallment;
    }

    public final String component27() {
        return this.reversalStatus;
    }

    public final String component28() {
        return this.reversalStatusDictionaryKey;
    }

    public final String component29() {
        return this.reversalStatusDictionaryValue;
    }

    public final Long component3() {
        return this.firstDdDate;
    }

    public final Long component4() {
        return this.matureDate;
    }

    public final Long component5() {
        return this.linkAcctKey;
    }

    public final Double component6() {
        return this.initialPrincipal;
    }

    public final Double component7() {
        return this.remainingInterest;
    }

    public final Double component8() {
        return this.offsetIntSaved;
    }

    public final Double component9() {
        return this.interestRate;
    }

    public final BnplDetailApiEntity copy(long j, Long l, Long l2, Long l3, Long l4, Double d, Double d2, Double d3, Double d4, Long l5, Boolean bool, Double d5, String str, Double d6, Double d7, String str2, Boolean bool2, Boolean bool3, String str3, Double d8, Double d9, RePaymentFlagApi rePaymentFlagApi, Boolean bool4, Double d12, String str4, String str5, String str6, String str7, String str8) {
        return new BnplDetailApiEntity(j, l, l2, l3, l4, d, d2, d3, d4, l5, bool, d5, str, d6, d7, str2, bool2, bool3, str3, d8, d9, rePaymentFlagApi, bool4, d12, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplDetailApiEntity)) {
            return false;
        }
        BnplDetailApiEntity bnplDetailApiEntity = (BnplDetailApiEntity) obj;
        return this.loanKey == bnplDetailApiEntity.loanKey && C41536l.m120484d(this.signedDate, bnplDetailApiEntity.signedDate) && C41536l.m120484d(this.firstDdDate, bnplDetailApiEntity.firstDdDate) && C41536l.m120484d(this.matureDate, bnplDetailApiEntity.matureDate) && C41536l.m120484d(this.linkAcctKey, bnplDetailApiEntity.linkAcctKey) && C41536l.m120484d(this.initialPrincipal, bnplDetailApiEntity.initialPrincipal) && C41536l.m120484d(this.remainingInterest, bnplDetailApiEntity.remainingInterest) && C41536l.m120484d(this.offsetIntSaved, bnplDetailApiEntity.offsetIntSaved) && C41536l.m120484d(this.interestRate, bnplDetailApiEntity.interestRate) && C41536l.m120484d(this.clientKey, bnplDetailApiEntity.clientKey) && C41536l.m120484d(this.hasInsFlag, bnplDetailApiEntity.hasInsFlag) && C41536l.m120484d(this.insAmount, bnplDetailApiEntity.insAmount) && C41536l.m120484d(this.loanSubType, bnplDetailApiEntity.loanSubType) && C41536l.m120484d(this.nextInterest, bnplDetailApiEntity.nextInterest) && C41536l.m120484d(this.nextPayment, bnplDetailApiEntity.nextPayment) && C41536l.m120484d(this.subTypeGroup, bnplDetailApiEntity.subTypeGroup) && C41536l.m120484d(this.hasSmsScheme, bnplDetailApiEntity.hasSmsScheme) && C41536l.m120484d(this.isLoanReverseAllowed, bnplDetailApiEntity.isLoanReverseAllowed) && C41536l.m120484d(this.linkAcctNo, bnplDetailApiEntity.linkAcctNo) && C41536l.m120484d(this.restAmount, bnplDetailApiEntity.restAmount) && C41536l.m120484d(this.prePaymentCom, bnplDetailApiEntity.prePaymentCom) && this.repaymentFlag == bnplDetailApiEntity.repaymentFlag && C41536l.m120484d(this.isReversible, bnplDetailApiEntity.isReversible) && C41536l.m120484d(this.loanDebt, bnplDetailApiEntity.loanDebt) && C41536l.m120484d(this.fileUrl, bnplDetailApiEntity.fileUrl) && C41536l.m120484d(this.isOnlineInstallment, bnplDetailApiEntity.isOnlineInstallment) && C41536l.m120484d(this.reversalStatus, bnplDetailApiEntity.reversalStatus) && C41536l.m120484d(this.reversalStatusDictionaryKey, bnplDetailApiEntity.reversalStatusDictionaryKey) && C41536l.m120484d(this.reversalStatusDictionaryValue, bnplDetailApiEntity.reversalStatusDictionaryValue);
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final Long getFirstDdDate() {
        return this.firstDdDate;
    }

    public final Boolean getHasInsFlag() {
        return this.hasInsFlag;
    }

    public final Boolean getHasSmsScheme() {
        return this.hasSmsScheme;
    }

    public final Double getInitialPrincipal() {
        return this.initialPrincipal;
    }

    public final Double getInsAmount() {
        return this.insAmount;
    }

    public final Double getInterestRate() {
        return this.interestRate;
    }

    public final Long getLinkAcctKey() {
        return this.linkAcctKey;
    }

    public final String getLinkAcctNo() {
        return this.linkAcctNo;
    }

    public final Double getLoanDebt() {
        return this.loanDebt;
    }

    public final long getLoanKey() {
        return this.loanKey;
    }

    public final String getLoanSubType() {
        return this.loanSubType;
    }

    public final Long getMatureDate() {
        return this.matureDate;
    }

    public final Double getNextInterest() {
        return this.nextInterest;
    }

    public final Double getNextPayment() {
        return this.nextPayment;
    }

    public final Double getOffsetIntSaved() {
        return this.offsetIntSaved;
    }

    public final Double getPrePaymentCom() {
        return this.prePaymentCom;
    }

    public final Double getRemainingInterest() {
        return this.remainingInterest;
    }

    public final RePaymentFlagApi getRepaymentFlag() {
        return this.repaymentFlag;
    }

    public final Double getRestAmount() {
        return this.restAmount;
    }

    public final String getReversalStatus() {
        return this.reversalStatus;
    }

    public final String getReversalStatusDictionaryKey() {
        return this.reversalStatusDictionaryKey;
    }

    public final String getReversalStatusDictionaryValue() {
        return this.reversalStatusDictionaryValue;
    }

    public final Long getSignedDate() {
        return this.signedDate;
    }

    public final String getSubTypeGroup() {
        return this.subTypeGroup;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.loanKey) * 31;
        Long l = this.signedDate;
        int i = 0;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.firstDdDate;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.matureDate;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.linkAcctKey;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Double d = this.initialPrincipal;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.remainingInterest;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.offsetIntSaved;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.interestRate;
        int hashCode8 = (hashCode7 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Long l5 = this.clientKey;
        int hashCode9 = (hashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool = this.hasInsFlag;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d5 = this.insAmount;
        int hashCode11 = (hashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str = this.loanSubType;
        int hashCode12 = (hashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        Double d6 = this.nextInterest;
        int hashCode13 = (hashCode12 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.nextPayment;
        int hashCode14 = (hashCode13 + (d7 == null ? 0 : d7.hashCode())) * 31;
        String str2 = this.subTypeGroup;
        int hashCode15 = (hashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.hasSmsScheme;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLoanReverseAllowed;
        int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.linkAcctNo;
        int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d8 = this.restAmount;
        int hashCode19 = (hashCode18 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.prePaymentCom;
        int hashCode20 = (hashCode19 + (d9 == null ? 0 : d9.hashCode())) * 31;
        RePaymentFlagApi rePaymentFlagApi = this.repaymentFlag;
        int hashCode21 = (hashCode20 + (rePaymentFlagApi == null ? 0 : rePaymentFlagApi.hashCode())) * 31;
        Boolean bool4 = this.isReversible;
        int hashCode22 = (hashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Double d12 = this.loanDebt;
        int hashCode23 = (hashCode22 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str4 = this.fileUrl;
        int hashCode24 = (hashCode23 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.isOnlineInstallment;
        int hashCode25 = (hashCode24 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.reversalStatus;
        int hashCode26 = (hashCode25 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.reversalStatusDictionaryKey;
        int hashCode27 = (hashCode26 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.reversalStatusDictionaryValue;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode27 + i;
    }

    public final Boolean isLoanReverseAllowed() {
        return this.isLoanReverseAllowed;
    }

    public final String isOnlineInstallment() {
        return this.isOnlineInstallment;
    }

    public final Boolean isReversible() {
        return this.isReversible;
    }

    public String toString() {
        long j = this.loanKey;
        Long l = this.signedDate;
        Long l2 = this.firstDdDate;
        Long l3 = this.matureDate;
        Long l4 = this.linkAcctKey;
        Double d = this.initialPrincipal;
        Double d2 = this.remainingInterest;
        Double d3 = this.offsetIntSaved;
        Double d4 = this.interestRate;
        Long l5 = this.clientKey;
        Boolean bool = this.hasInsFlag;
        Double d5 = this.insAmount;
        String str = this.loanSubType;
        Double d6 = this.nextInterest;
        Double d7 = this.nextPayment;
        String str2 = this.subTypeGroup;
        Boolean bool2 = this.hasSmsScheme;
        Boolean bool3 = this.isLoanReverseAllowed;
        String str3 = this.linkAcctNo;
        Double d8 = this.restAmount;
        Double d9 = this.prePaymentCom;
        RePaymentFlagApi rePaymentFlagApi = this.repaymentFlag;
        Boolean bool4 = this.isReversible;
        Double d12 = this.loanDebt;
        String str4 = this.fileUrl;
        String str5 = this.isOnlineInstallment;
        String str6 = this.reversalStatus;
        String str7 = this.reversalStatusDictionaryKey;
        String str8 = this.reversalStatusDictionaryValue;
        return "BnplDetailApiEntity(loanKey=" + j + ", signedDate=" + l + ", firstDdDate=" + l2 + ", matureDate=" + l3 + ", linkAcctKey=" + l4 + ", initialPrincipal=" + d + ", remainingInterest=" + d2 + ", offsetIntSaved=" + d3 + ", interestRate=" + d4 + ", clientKey=" + l5 + ", hasInsFlag=" + bool + ", insAmount=" + d5 + ", loanSubType=" + str + ", nextInterest=" + d6 + ", nextPayment=" + d7 + ", subTypeGroup=" + str2 + ", hasSmsScheme=" + bool2 + ", isLoanReverseAllowed=" + bool3 + ", linkAcctNo=" + str3 + ", restAmount=" + d8 + ", prePaymentCom=" + d9 + ", repaymentFlag=" + rePaymentFlagApi + ", isReversible=" + bool4 + ", loanDebt=" + d12 + ", fileUrl=" + str4 + ", isOnlineInstallment=" + str5 + ", reversalStatus=" + str6 + ", reversalStatusDictionaryKey=" + str7 + ", reversalStatusDictionaryValue=" + str8 + ")";
    }
}
