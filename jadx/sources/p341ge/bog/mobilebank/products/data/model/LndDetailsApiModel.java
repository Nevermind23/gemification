package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LndDetailsApiModel */
public final class LndDetailsApiModel {
    private final long clientKey;
    private final String fileUrl;
    private final Long firstDdDate;
    private final BigDecimal initialPrincipal;
    private final BigDecimal insAmount;
    private final String insFlag;
    private final BigDecimal interestRate;
    private final String isLoanReverseAllowed;
    private final String isOnlineInstallment;
    private final String isReversible;
    private final Long linkAcctKey;
    private final String linkAcctNo;
    private final BigDecimal loanDebt;
    private final Long loanKey;
    private final String loanSubType;
    private final Long matureDate;
    private final String nextFloatingRate;
    private final BigDecimal nextInterest;
    private final String nextLoanIntTypeDictionaryKey;
    private final String nextLoanIntTypeDictionaryValue;
    private final String nextLoanIntTypeName;
    private final Long nextLoanRateChangeDate;
    private final Float nextMinIntRate;
    private final BigDecimal nextPayment;
    private final Float nextSpreadRate;
    private final BigDecimal offsetIntSaved;
    private final BigDecimal prePaymentCom;
    private final BigDecimal remainingInterest;
    private final String repaymentFlag;
    private final BigDecimal restAmount;
    private final String reversalStatus;
    private final String reversalStatusDictionaryKey;
    private final String reversalStatusDictionaryValue;
    private final Long signedDate;
    private final String smsScheme;
    private final String subTypeGroup;

    public LndDetailsApiModel(Long l, Long l2, Long l3, Long l4, Long l5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, long j, String str, BigDecimal bigDecimal5, String str2, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str3, String str4, String str5, String str6, BigDecimal bigDecimal8, BigDecimal bigDecimal9, String str7, String str8, BigDecimal bigDecimal10, String str9, String str10, String str11, String str12, String str13, String str14, Long l6, Float f, Float f2, String str15, String str16, String str17) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str7;
        String str24 = str8;
        String str25 = str10;
        C41536l.m120489i(str18, "insFlag");
        C41536l.m120489i(str19, "loanSubType");
        C41536l.m120489i(str20, "subTypeGroup");
        C41536l.m120489i(str21, "smsScheme");
        C41536l.m120489i(str22, "isLoanReverseAllowed");
        C41536l.m120489i(str23, "repaymentFlag");
        C41536l.m120489i(str24, "isReversible");
        C41536l.m120489i(str25, "isOnlineInstallment");
        this.loanKey = l;
        this.signedDate = l2;
        this.firstDdDate = l3;
        this.matureDate = l4;
        this.linkAcctKey = l5;
        this.initialPrincipal = bigDecimal;
        this.remainingInterest = bigDecimal2;
        this.offsetIntSaved = bigDecimal3;
        this.interestRate = bigDecimal4;
        this.clientKey = j;
        this.insFlag = str18;
        this.insAmount = bigDecimal5;
        this.loanSubType = str19;
        this.nextInterest = bigDecimal6;
        this.nextPayment = bigDecimal7;
        this.subTypeGroup = str20;
        this.smsScheme = str21;
        this.isLoanReverseAllowed = str22;
        this.linkAcctNo = str6;
        this.restAmount = bigDecimal8;
        this.prePaymentCom = bigDecimal9;
        this.repaymentFlag = str23;
        this.isReversible = str24;
        this.loanDebt = bigDecimal10;
        this.fileUrl = str9;
        this.isOnlineInstallment = str25;
        this.reversalStatus = str11;
        this.reversalStatusDictionaryKey = str12;
        this.reversalStatusDictionaryValue = str13;
        this.nextFloatingRate = str14;
        this.nextLoanRateChangeDate = l6;
        this.nextSpreadRate = f;
        this.nextMinIntRate = f2;
        this.nextLoanIntTypeName = str15;
        this.nextLoanIntTypeDictionaryKey = str16;
        this.nextLoanIntTypeDictionaryValue = str17;
    }

    public static /* synthetic */ LndDetailsApiModel copy$default(LndDetailsApiModel lndDetailsApiModel, Long l, Long l2, Long l3, Long l4, Long l5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, long j, String str, BigDecimal bigDecimal5, String str2, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str3, String str4, String str5, String str6, BigDecimal bigDecimal8, BigDecimal bigDecimal9, String str7, String str8, BigDecimal bigDecimal10, String str9, String str10, String str11, String str12, String str13, String str14, Long l6, Float f, Float f2, String str15, String str16, String str17, int i, int i2, Object obj) {
        LndDetailsApiModel lndDetailsApiModel2 = lndDetailsApiModel;
        int i3 = i;
        return lndDetailsApiModel.copy((i3 & 1) != 0 ? lndDetailsApiModel2.loanKey : l, (i3 & 2) != 0 ? lndDetailsApiModel2.signedDate : l2, (i3 & 4) != 0 ? lndDetailsApiModel2.firstDdDate : l3, (i3 & 8) != 0 ? lndDetailsApiModel2.matureDate : l4, (i3 & 16) != 0 ? lndDetailsApiModel2.linkAcctKey : l5, (i3 & 32) != 0 ? lndDetailsApiModel2.initialPrincipal : bigDecimal, (i3 & 64) != 0 ? lndDetailsApiModel2.remainingInterest : bigDecimal2, (i3 & 128) != 0 ? lndDetailsApiModel2.offsetIntSaved : bigDecimal3, (i3 & C11398b.f33139r) != 0 ? lndDetailsApiModel2.interestRate : bigDecimal4, (i3 & C11398b.f33140s) != 0 ? lndDetailsApiModel2.clientKey : j, (i3 & C11398b.f33141t) != 0 ? lndDetailsApiModel2.insFlag : str, (i3 & C11398b.f33142u) != 0 ? lndDetailsApiModel2.insAmount : bigDecimal5, (i3 & C11398b.f33143v) != 0 ? lndDetailsApiModel2.loanSubType : str2, (i3 & 8192) != 0 ? lndDetailsApiModel2.nextInterest : bigDecimal6, (i3 & 16384) != 0 ? lndDetailsApiModel2.nextPayment : bigDecimal7, (i3 & 32768) != 0 ? lndDetailsApiModel2.subTypeGroup : str3, (i3 & 65536) != 0 ? lndDetailsApiModel2.smsScheme : str4, (i3 & 131072) != 0 ? lndDetailsApiModel2.isLoanReverseAllowed : str5, (i3 & 262144) != 0 ? lndDetailsApiModel2.linkAcctNo : str6, (i3 & 524288) != 0 ? lndDetailsApiModel2.restAmount : bigDecimal8, (i3 & 1048576) != 0 ? lndDetailsApiModel2.prePaymentCom : bigDecimal9, (i3 & 2097152) != 0 ? lndDetailsApiModel2.repaymentFlag : str7, (i3 & 4194304) != 0 ? lndDetailsApiModel2.isReversible : str8, (i3 & 8388608) != 0 ? lndDetailsApiModel2.loanDebt : bigDecimal10, (i3 & 16777216) != 0 ? lndDetailsApiModel2.fileUrl : str9, (i3 & 33554432) != 0 ? lndDetailsApiModel2.isOnlineInstallment : str10, (i3 & 67108864) != 0 ? lndDetailsApiModel2.reversalStatus : str11, (i3 & 134217728) != 0 ? lndDetailsApiModel2.reversalStatusDictionaryKey : str12, (i3 & 268435456) != 0 ? lndDetailsApiModel2.reversalStatusDictionaryValue : str13, (i3 & 536870912) != 0 ? lndDetailsApiModel2.nextFloatingRate : str14, (i3 & 1073741824) != 0 ? lndDetailsApiModel2.nextLoanRateChangeDate : l6, (i3 & Integer.MIN_VALUE) != 0 ? lndDetailsApiModel2.nextSpreadRate : f, (i2 & 1) != 0 ? lndDetailsApiModel2.nextMinIntRate : f2, (i2 & 2) != 0 ? lndDetailsApiModel2.nextLoanIntTypeName : str15, (i2 & 4) != 0 ? lndDetailsApiModel2.nextLoanIntTypeDictionaryKey : str16, (i2 & 8) != 0 ? lndDetailsApiModel2.nextLoanIntTypeDictionaryValue : str17);
    }

    public final Long component1() {
        return this.loanKey;
    }

    public final long component10() {
        return this.clientKey;
    }

    public final String component11() {
        return this.insFlag;
    }

    public final BigDecimal component12() {
        return this.insAmount;
    }

    public final String component13() {
        return this.loanSubType;
    }

    public final BigDecimal component14() {
        return this.nextInterest;
    }

    public final BigDecimal component15() {
        return this.nextPayment;
    }

    public final String component16() {
        return this.subTypeGroup;
    }

    public final String component17() {
        return this.smsScheme;
    }

    public final String component18() {
        return this.isLoanReverseAllowed;
    }

    public final String component19() {
        return this.linkAcctNo;
    }

    public final Long component2() {
        return this.signedDate;
    }

    public final BigDecimal component20() {
        return this.restAmount;
    }

    public final BigDecimal component21() {
        return this.prePaymentCom;
    }

    public final String component22() {
        return this.repaymentFlag;
    }

    public final String component23() {
        return this.isReversible;
    }

    public final BigDecimal component24() {
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

    public final String component30() {
        return this.nextFloatingRate;
    }

    public final Long component31() {
        return this.nextLoanRateChangeDate;
    }

    public final Float component32() {
        return this.nextSpreadRate;
    }

    public final Float component33() {
        return this.nextMinIntRate;
    }

    public final String component34() {
        return this.nextLoanIntTypeName;
    }

    public final String component35() {
        return this.nextLoanIntTypeDictionaryKey;
    }

    public final String component36() {
        return this.nextLoanIntTypeDictionaryValue;
    }

    public final Long component4() {
        return this.matureDate;
    }

    public final Long component5() {
        return this.linkAcctKey;
    }

    public final BigDecimal component6() {
        return this.initialPrincipal;
    }

    public final BigDecimal component7() {
        return this.remainingInterest;
    }

    public final BigDecimal component8() {
        return this.offsetIntSaved;
    }

    public final BigDecimal component9() {
        return this.interestRate;
    }

    public final LndDetailsApiModel copy(Long l, Long l2, Long l3, Long l4, Long l5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, long j, String str, BigDecimal bigDecimal5, String str2, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str3, String str4, String str5, String str6, BigDecimal bigDecimal8, BigDecimal bigDecimal9, String str7, String str8, BigDecimal bigDecimal10, String str9, String str10, String str11, String str12, String str13, String str14, Long l6, Float f, Float f2, String str15, String str16, String str17) {
        Long l7 = l;
        C41536l.m120489i(str, "insFlag");
        C41536l.m120489i(str2, "loanSubType");
        C41536l.m120489i(str3, "subTypeGroup");
        C41536l.m120489i(str4, "smsScheme");
        C41536l.m120489i(str5, "isLoanReverseAllowed");
        C41536l.m120489i(str7, "repaymentFlag");
        C41536l.m120489i(str8, "isReversible");
        C41536l.m120489i(str10, "isOnlineInstallment");
        return new LndDetailsApiModel(l, l2, l3, l4, l5, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, j, str, bigDecimal5, str2, bigDecimal6, bigDecimal7, str3, str4, str5, str6, bigDecimal8, bigDecimal9, str7, str8, bigDecimal10, str9, str10, str11, str12, str13, str14, l6, f, f2, str15, str16, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LndDetailsApiModel)) {
            return false;
        }
        LndDetailsApiModel lndDetailsApiModel = (LndDetailsApiModel) obj;
        return C41536l.m120484d(this.loanKey, lndDetailsApiModel.loanKey) && C41536l.m120484d(this.signedDate, lndDetailsApiModel.signedDate) && C41536l.m120484d(this.firstDdDate, lndDetailsApiModel.firstDdDate) && C41536l.m120484d(this.matureDate, lndDetailsApiModel.matureDate) && C41536l.m120484d(this.linkAcctKey, lndDetailsApiModel.linkAcctKey) && C41536l.m120484d(this.initialPrincipal, lndDetailsApiModel.initialPrincipal) && C41536l.m120484d(this.remainingInterest, lndDetailsApiModel.remainingInterest) && C41536l.m120484d(this.offsetIntSaved, lndDetailsApiModel.offsetIntSaved) && C41536l.m120484d(this.interestRate, lndDetailsApiModel.interestRate) && this.clientKey == lndDetailsApiModel.clientKey && C41536l.m120484d(this.insFlag, lndDetailsApiModel.insFlag) && C41536l.m120484d(this.insAmount, lndDetailsApiModel.insAmount) && C41536l.m120484d(this.loanSubType, lndDetailsApiModel.loanSubType) && C41536l.m120484d(this.nextInterest, lndDetailsApiModel.nextInterest) && C41536l.m120484d(this.nextPayment, lndDetailsApiModel.nextPayment) && C41536l.m120484d(this.subTypeGroup, lndDetailsApiModel.subTypeGroup) && C41536l.m120484d(this.smsScheme, lndDetailsApiModel.smsScheme) && C41536l.m120484d(this.isLoanReverseAllowed, lndDetailsApiModel.isLoanReverseAllowed) && C41536l.m120484d(this.linkAcctNo, lndDetailsApiModel.linkAcctNo) && C41536l.m120484d(this.restAmount, lndDetailsApiModel.restAmount) && C41536l.m120484d(this.prePaymentCom, lndDetailsApiModel.prePaymentCom) && C41536l.m120484d(this.repaymentFlag, lndDetailsApiModel.repaymentFlag) && C41536l.m120484d(this.isReversible, lndDetailsApiModel.isReversible) && C41536l.m120484d(this.loanDebt, lndDetailsApiModel.loanDebt) && C41536l.m120484d(this.fileUrl, lndDetailsApiModel.fileUrl) && C41536l.m120484d(this.isOnlineInstallment, lndDetailsApiModel.isOnlineInstallment) && C41536l.m120484d(this.reversalStatus, lndDetailsApiModel.reversalStatus) && C41536l.m120484d(this.reversalStatusDictionaryKey, lndDetailsApiModel.reversalStatusDictionaryKey) && C41536l.m120484d(this.reversalStatusDictionaryValue, lndDetailsApiModel.reversalStatusDictionaryValue) && C41536l.m120484d(this.nextFloatingRate, lndDetailsApiModel.nextFloatingRate) && C41536l.m120484d(this.nextLoanRateChangeDate, lndDetailsApiModel.nextLoanRateChangeDate) && C41536l.m120484d(this.nextSpreadRate, lndDetailsApiModel.nextSpreadRate) && C41536l.m120484d(this.nextMinIntRate, lndDetailsApiModel.nextMinIntRate) && C41536l.m120484d(this.nextLoanIntTypeName, lndDetailsApiModel.nextLoanIntTypeName) && C41536l.m120484d(this.nextLoanIntTypeDictionaryKey, lndDetailsApiModel.nextLoanIntTypeDictionaryKey) && C41536l.m120484d(this.nextLoanIntTypeDictionaryValue, lndDetailsApiModel.nextLoanIntTypeDictionaryValue);
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final Long getFirstDdDate() {
        return this.firstDdDate;
    }

    public final BigDecimal getInitialPrincipal() {
        return this.initialPrincipal;
    }

    public final BigDecimal getInsAmount() {
        return this.insAmount;
    }

    public final String getInsFlag() {
        return this.insFlag;
    }

    public final BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public final Long getLinkAcctKey() {
        return this.linkAcctKey;
    }

    public final String getLinkAcctNo() {
        return this.linkAcctNo;
    }

    public final BigDecimal getLoanDebt() {
        return this.loanDebt;
    }

    public final Long getLoanKey() {
        return this.loanKey;
    }

    public final String getLoanSubType() {
        return this.loanSubType;
    }

    public final Long getMatureDate() {
        return this.matureDate;
    }

    public final String getNextFloatingRate() {
        return this.nextFloatingRate;
    }

    public final BigDecimal getNextInterest() {
        return this.nextInterest;
    }

    public final String getNextLoanIntTypeDictionaryKey() {
        return this.nextLoanIntTypeDictionaryKey;
    }

    public final String getNextLoanIntTypeDictionaryValue() {
        return this.nextLoanIntTypeDictionaryValue;
    }

    public final String getNextLoanIntTypeName() {
        return this.nextLoanIntTypeName;
    }

    public final Long getNextLoanRateChangeDate() {
        return this.nextLoanRateChangeDate;
    }

    public final Float getNextMinIntRate() {
        return this.nextMinIntRate;
    }

    public final BigDecimal getNextPayment() {
        return this.nextPayment;
    }

    public final Float getNextSpreadRate() {
        return this.nextSpreadRate;
    }

    public final BigDecimal getOffsetIntSaved() {
        return this.offsetIntSaved;
    }

    public final BigDecimal getPrePaymentCom() {
        return this.prePaymentCom;
    }

    public final BigDecimal getRemainingInterest() {
        return this.remainingInterest;
    }

    public final String getRepaymentFlag() {
        return this.repaymentFlag;
    }

    public final BigDecimal getRestAmount() {
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

    public final String getSmsScheme() {
        return this.smsScheme;
    }

    public final String getSubTypeGroup() {
        return this.subTypeGroup;
    }

    public int hashCode() {
        Long l = this.loanKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.signedDate;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.firstDdDate;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.matureDate;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.linkAcctKey;
        int hashCode5 = (hashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        BigDecimal bigDecimal = this.initialPrincipal;
        int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.remainingInterest;
        int hashCode7 = (hashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.offsetIntSaved;
        int hashCode8 = (hashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.interestRate;
        int hashCode9 = (((((hashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31) + C7397t.m28148a(this.clientKey)) * 31) + this.insFlag.hashCode()) * 31;
        BigDecimal bigDecimal5 = this.insAmount;
        int hashCode10 = (((hashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31) + this.loanSubType.hashCode()) * 31;
        BigDecimal bigDecimal6 = this.nextInterest;
        int hashCode11 = (hashCode10 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.nextPayment;
        int hashCode12 = (((((((hashCode11 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31) + this.subTypeGroup.hashCode()) * 31) + this.smsScheme.hashCode()) * 31) + this.isLoanReverseAllowed.hashCode()) * 31;
        String str = this.linkAcctNo;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.restAmount;
        int hashCode14 = (hashCode13 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.prePaymentCom;
        int hashCode15 = (((((hashCode14 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31) + this.repaymentFlag.hashCode()) * 31) + this.isReversible.hashCode()) * 31;
        BigDecimal bigDecimal10 = this.loanDebt;
        int hashCode16 = (hashCode15 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        String str2 = this.fileUrl;
        int hashCode17 = (((hashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.isOnlineInstallment.hashCode()) * 31;
        String str3 = this.reversalStatus;
        int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reversalStatusDictionaryKey;
        int hashCode19 = (hashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.reversalStatusDictionaryValue;
        int hashCode20 = (hashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nextFloatingRate;
        int hashCode21 = (hashCode20 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l6 = this.nextLoanRateChangeDate;
        int hashCode22 = (hashCode21 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Float f = this.nextSpreadRate;
        int hashCode23 = (hashCode22 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.nextMinIntRate;
        int hashCode24 = (hashCode23 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str7 = this.nextLoanIntTypeName;
        int hashCode25 = (hashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.nextLoanIntTypeDictionaryKey;
        int hashCode26 = (hashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.nextLoanIntTypeDictionaryValue;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode26 + i;
    }

    public final String isLoanReverseAllowed() {
        return this.isLoanReverseAllowed;
    }

    public final String isOnlineInstallment() {
        return this.isOnlineInstallment;
    }

    public final String isReversible() {
        return this.isReversible;
    }

    public String toString() {
        Long l = this.loanKey;
        Long l2 = this.signedDate;
        Long l3 = this.firstDdDate;
        Long l4 = this.matureDate;
        Long l5 = this.linkAcctKey;
        BigDecimal bigDecimal = this.initialPrincipal;
        BigDecimal bigDecimal2 = this.remainingInterest;
        BigDecimal bigDecimal3 = this.offsetIntSaved;
        BigDecimal bigDecimal4 = this.interestRate;
        long j = this.clientKey;
        String str = this.insFlag;
        BigDecimal bigDecimal5 = this.insAmount;
        String str2 = this.loanSubType;
        BigDecimal bigDecimal6 = this.nextInterest;
        BigDecimal bigDecimal7 = this.nextPayment;
        String str3 = this.subTypeGroup;
        String str4 = this.smsScheme;
        String str5 = this.isLoanReverseAllowed;
        String str6 = this.linkAcctNo;
        BigDecimal bigDecimal8 = this.restAmount;
        BigDecimal bigDecimal9 = this.prePaymentCom;
        String str7 = this.repaymentFlag;
        String str8 = this.isReversible;
        BigDecimal bigDecimal10 = this.loanDebt;
        String str9 = this.fileUrl;
        String str10 = this.isOnlineInstallment;
        String str11 = this.reversalStatus;
        String str12 = this.reversalStatusDictionaryKey;
        String str13 = this.reversalStatusDictionaryValue;
        String str14 = this.nextFloatingRate;
        Long l6 = this.nextLoanRateChangeDate;
        Float f = this.nextSpreadRate;
        Float f2 = this.nextMinIntRate;
        String str15 = this.nextLoanIntTypeName;
        String str16 = this.nextLoanIntTypeDictionaryKey;
        String str17 = this.nextLoanIntTypeDictionaryValue;
        return "LndDetailsApiModel(loanKey=" + l + ", signedDate=" + l2 + ", firstDdDate=" + l3 + ", matureDate=" + l4 + ", linkAcctKey=" + l5 + ", initialPrincipal=" + bigDecimal + ", remainingInterest=" + bigDecimal2 + ", offsetIntSaved=" + bigDecimal3 + ", interestRate=" + bigDecimal4 + ", clientKey=" + j + ", insFlag=" + str + ", insAmount=" + bigDecimal5 + ", loanSubType=" + str2 + ", nextInterest=" + bigDecimal6 + ", nextPayment=" + bigDecimal7 + ", subTypeGroup=" + str3 + ", smsScheme=" + str4 + ", isLoanReverseAllowed=" + str5 + ", linkAcctNo=" + str6 + ", restAmount=" + bigDecimal8 + ", prePaymentCom=" + bigDecimal9 + ", repaymentFlag=" + str7 + ", isReversible=" + str8 + ", loanDebt=" + bigDecimal10 + ", fileUrl=" + str9 + ", isOnlineInstallment=" + str10 + ", reversalStatus=" + str11 + ", reversalStatusDictionaryKey=" + str12 + ", reversalStatusDictionaryValue=" + str13 + ", nextFloatingRate=" + str14 + ", nextLoanRateChangeDate=" + l6 + ", nextSpreadRate=" + f + ", nextMinIntRate=" + f2 + ", nextLoanIntTypeName=" + str15 + ", nextLoanIntTypeDictionaryKey=" + str16 + ", nextLoanIntTypeDictionaryValue=" + str17 + ")";
    }
}
