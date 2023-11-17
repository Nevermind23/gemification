package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DepositApiModel */
public final class DepositApiModel {
    private final long accountKey;
    private final String acctNo;
    private final Long agreeKey;
    private final Long applicationId;
    private final String attachmentUrl;
    private final BigDecimal availableAmount;
    private final BigDecimal bcBalance;
    private final String ccy;
    private final Long clientKey;
    private final BigDecimal currentBalance;
    private final String depositPdfUrl;
    private final String dictionaryKey;
    private final String isBreakable;
    private final long mainAccountKey;
    private final BigDecimal minAccrualBalance;
    private final String name;
    private final long nextWithdrawalDate;
    private final Long pfmAcctId;
    private final String prodType;
    private final List<String> productFunctions;
    private final Long productId;
    private final List<DepositSavingGoalApiModel> savingGoals;
    private final String subType;
    private final Long techAcctKey;

    public DepositApiModel(Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, long j, long j2, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str5, String str6, long j3, BigDecimal bigDecimal4, List<String> list, String str7, String str8, Long l5, Long l6, String str9, List<DepositSavingGoalApiModel> list2) {
        this.agreeKey = l;
        this.clientKey = l2;
        this.applicationId = l3;
        this.techAcctKey = l4;
        this.prodType = str;
        this.name = str2;
        this.ccy = str3;
        this.accountKey = j;
        this.mainAccountKey = j2;
        this.acctNo = str4;
        this.currentBalance = bigDecimal;
        this.bcBalance = bigDecimal2;
        this.availableAmount = bigDecimal3;
        this.subType = str5;
        this.dictionaryKey = str6;
        this.nextWithdrawalDate = j3;
        this.minAccrualBalance = bigDecimal4;
        this.productFunctions = list;
        this.depositPdfUrl = str7;
        this.attachmentUrl = str8;
        this.productId = l5;
        this.pfmAcctId = l6;
        this.isBreakable = str9;
        this.savingGoals = list2;
    }

    public static /* synthetic */ DepositApiModel copy$default(DepositApiModel depositApiModel, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, long j, long j2, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str5, String str6, long j3, BigDecimal bigDecimal4, List list, String str7, String str8, Long l5, Long l6, String str9, List list2, int i, Object obj) {
        DepositApiModel depositApiModel2 = depositApiModel;
        int i2 = i;
        return depositApiModel.copy((i2 & 1) != 0 ? depositApiModel2.agreeKey : l, (i2 & 2) != 0 ? depositApiModel2.clientKey : l2, (i2 & 4) != 0 ? depositApiModel2.applicationId : l3, (i2 & 8) != 0 ? depositApiModel2.techAcctKey : l4, (i2 & 16) != 0 ? depositApiModel2.prodType : str, (i2 & 32) != 0 ? depositApiModel2.name : str2, (i2 & 64) != 0 ? depositApiModel2.ccy : str3, (i2 & 128) != 0 ? depositApiModel2.accountKey : j, (i2 & C11398b.f33139r) != 0 ? depositApiModel2.mainAccountKey : j2, (i2 & C11398b.f33140s) != 0 ? depositApiModel2.acctNo : str4, (i2 & C11398b.f33141t) != 0 ? depositApiModel2.currentBalance : bigDecimal, (i2 & C11398b.f33142u) != 0 ? depositApiModel2.bcBalance : bigDecimal2, (i2 & C11398b.f33143v) != 0 ? depositApiModel2.availableAmount : bigDecimal3, (i2 & 8192) != 0 ? depositApiModel2.subType : str5, (i2 & 16384) != 0 ? depositApiModel2.dictionaryKey : str6, (i2 & 32768) != 0 ? depositApiModel2.nextWithdrawalDate : j3, (i2 & 65536) != 0 ? depositApiModel2.minAccrualBalance : bigDecimal4, (131072 & i2) != 0 ? depositApiModel2.productFunctions : list, (i2 & 262144) != 0 ? depositApiModel2.depositPdfUrl : str7, (i2 & 524288) != 0 ? depositApiModel2.attachmentUrl : str8, (i2 & 1048576) != 0 ? depositApiModel2.productId : l5, (i2 & 2097152) != 0 ? depositApiModel2.pfmAcctId : l6, (i2 & 4194304) != 0 ? depositApiModel2.isBreakable : str9, (i2 & 8388608) != 0 ? depositApiModel2.savingGoals : list2);
    }

    public final Long component1() {
        return this.agreeKey;
    }

    public final String component10() {
        return this.acctNo;
    }

    public final BigDecimal component11() {
        return this.currentBalance;
    }

    public final BigDecimal component12() {
        return this.bcBalance;
    }

    public final BigDecimal component13() {
        return this.availableAmount;
    }

    public final String component14() {
        return this.subType;
    }

    public final String component15() {
        return this.dictionaryKey;
    }

    public final long component16() {
        return this.nextWithdrawalDate;
    }

    public final BigDecimal component17() {
        return this.minAccrualBalance;
    }

    public final List<String> component18() {
        return this.productFunctions;
    }

    public final String component19() {
        return this.depositPdfUrl;
    }

    public final Long component2() {
        return this.clientKey;
    }

    public final String component20() {
        return this.attachmentUrl;
    }

    public final Long component21() {
        return this.productId;
    }

    public final Long component22() {
        return this.pfmAcctId;
    }

    public final String component23() {
        return this.isBreakable;
    }

    public final List<DepositSavingGoalApiModel> component24() {
        return this.savingGoals;
    }

    public final Long component3() {
        return this.applicationId;
    }

    public final Long component4() {
        return this.techAcctKey;
    }

    public final String component5() {
        return this.prodType;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.ccy;
    }

    public final long component8() {
        return this.accountKey;
    }

    public final long component9() {
        return this.mainAccountKey;
    }

    public final DepositApiModel copy(Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, long j, long j2, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str5, String str6, long j3, BigDecimal bigDecimal4, List<String> list, String str7, String str8, Long l5, Long l6, String str9, List<DepositSavingGoalApiModel> list2) {
        return new DepositApiModel(l, l2, l3, l4, str, str2, str3, j, j2, str4, bigDecimal, bigDecimal2, bigDecimal3, str5, str6, j3, bigDecimal4, list, str7, str8, l5, l6, str9, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositApiModel)) {
            return false;
        }
        DepositApiModel depositApiModel = (DepositApiModel) obj;
        return C41536l.m120484d(this.agreeKey, depositApiModel.agreeKey) && C41536l.m120484d(this.clientKey, depositApiModel.clientKey) && C41536l.m120484d(this.applicationId, depositApiModel.applicationId) && C41536l.m120484d(this.techAcctKey, depositApiModel.techAcctKey) && C41536l.m120484d(this.prodType, depositApiModel.prodType) && C41536l.m120484d(this.name, depositApiModel.name) && C41536l.m120484d(this.ccy, depositApiModel.ccy) && this.accountKey == depositApiModel.accountKey && this.mainAccountKey == depositApiModel.mainAccountKey && C41536l.m120484d(this.acctNo, depositApiModel.acctNo) && C41536l.m120484d(this.currentBalance, depositApiModel.currentBalance) && C41536l.m120484d(this.bcBalance, depositApiModel.bcBalance) && C41536l.m120484d(this.availableAmount, depositApiModel.availableAmount) && C41536l.m120484d(this.subType, depositApiModel.subType) && C41536l.m120484d(this.dictionaryKey, depositApiModel.dictionaryKey) && this.nextWithdrawalDate == depositApiModel.nextWithdrawalDate && C41536l.m120484d(this.minAccrualBalance, depositApiModel.minAccrualBalance) && C41536l.m120484d(this.productFunctions, depositApiModel.productFunctions) && C41536l.m120484d(this.depositPdfUrl, depositApiModel.depositPdfUrl) && C41536l.m120484d(this.attachmentUrl, depositApiModel.attachmentUrl) && C41536l.m120484d(this.productId, depositApiModel.productId) && C41536l.m120484d(this.pfmAcctId, depositApiModel.pfmAcctId) && C41536l.m120484d(this.isBreakable, depositApiModel.isBreakable) && C41536l.m120484d(this.savingGoals, depositApiModel.savingGoals);
    }

    public final long getAccountKey() {
        return this.accountKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final Long getAgreeKey() {
        return this.agreeKey;
    }

    public final Long getApplicationId() {
        return this.applicationId;
    }

    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final BigDecimal getBcBalance() {
        return this.bcBalance;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final BigDecimal getCurrentBalance() {
        return this.currentBalance;
    }

    public final String getDepositPdfUrl() {
        return this.depositPdfUrl;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final long getMainAccountKey() {
        return this.mainAccountKey;
    }

    public final BigDecimal getMinAccrualBalance() {
        return this.minAccrualBalance;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNextWithdrawalDate() {
        return this.nextWithdrawalDate;
    }

    public final Long getPfmAcctId() {
        return this.pfmAcctId;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final List<String> getProductFunctions() {
        return this.productFunctions;
    }

    public final Long getProductId() {
        return this.productId;
    }

    public final List<DepositSavingGoalApiModel> getSavingGoals() {
        return this.savingGoals;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final Long getTechAcctKey() {
        return this.techAcctKey;
    }

    public int hashCode() {
        Long l = this.agreeKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.clientKey;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.applicationId;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.techAcctKey;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.prodType;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ccy;
        int hashCode7 = (((((hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + C7397t.m28148a(this.accountKey)) * 31) + C7397t.m28148a(this.mainAccountKey)) * 31;
        String str4 = this.acctNo;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.currentBalance;
        int hashCode9 = (hashCode8 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.bcBalance;
        int hashCode10 = (hashCode9 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.availableAmount;
        int hashCode11 = (hashCode10 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str5 = this.subType;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dictionaryKey;
        int hashCode13 = (((hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31) + C7397t.m28148a(this.nextWithdrawalDate)) * 31;
        BigDecimal bigDecimal4 = this.minAccrualBalance;
        int hashCode14 = (hashCode13 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        List<String> list = this.productFunctions;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.depositPdfUrl;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.attachmentUrl;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l5 = this.productId;
        int hashCode18 = (hashCode17 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.pfmAcctId;
        int hashCode19 = (hashCode18 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str9 = this.isBreakable;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<DepositSavingGoalApiModel> list2 = this.savingGoals;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode20 + i;
    }

    public final String isBreakable() {
        return this.isBreakable;
    }

    public String toString() {
        Long l = this.agreeKey;
        Long l2 = this.clientKey;
        Long l3 = this.applicationId;
        Long l4 = this.techAcctKey;
        String str = this.prodType;
        String str2 = this.name;
        String str3 = this.ccy;
        long j = this.accountKey;
        long j2 = this.mainAccountKey;
        String str4 = this.acctNo;
        BigDecimal bigDecimal = this.currentBalance;
        BigDecimal bigDecimal2 = this.bcBalance;
        BigDecimal bigDecimal3 = this.availableAmount;
        String str5 = this.subType;
        BigDecimal bigDecimal4 = bigDecimal2;
        String str6 = this.dictionaryKey;
        long j3 = this.nextWithdrawalDate;
        BigDecimal bigDecimal5 = this.minAccrualBalance;
        List<String> list = this.productFunctions;
        String str7 = this.depositPdfUrl;
        String str8 = this.attachmentUrl;
        Long l5 = this.productId;
        Long l6 = this.pfmAcctId;
        String str9 = this.isBreakable;
        List<DepositSavingGoalApiModel> list2 = this.savingGoals;
        return "DepositApiModel(agreeKey=" + l + ", clientKey=" + l2 + ", applicationId=" + l3 + ", techAcctKey=" + l4 + ", prodType=" + str + ", name=" + str2 + ", ccy=" + str3 + ", accountKey=" + j + ", mainAccountKey=" + j2 + ", acctNo=" + str4 + ", currentBalance=" + bigDecimal + ", bcBalance=" + bigDecimal4 + ", availableAmount=" + bigDecimal3 + ", subType=" + str5 + ", dictionaryKey=" + str6 + ", nextWithdrawalDate=" + j3 + ", minAccrualBalance=" + bigDecimal5 + ", productFunctions=" + list + ", depositPdfUrl=" + str7 + ", attachmentUrl=" + str8 + ", productId=" + l5 + ", pfmAcctId=" + l6 + ", isBreakable=" + str9 + ", savingGoals=" + list2 + ")";
    }
}
