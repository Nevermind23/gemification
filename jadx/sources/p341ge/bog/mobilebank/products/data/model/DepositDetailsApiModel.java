package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DepositDetailsApiModel */
public final class DepositDetailsApiModel {
    private final Long accountKey;
    private final String agrPurpose;
    private final Long agrPurposeId;
    private final Long agreeKey;
    private final String agreeNo;
    private final BigDecimal casAmount;
    private final String ccy;
    private final Long clientKey;
    private final Long closeDate;
    private final BigDecimal currentBalance;
    private final String depositType;
    private final String dictionaryKey;
    private final BigDecimal intAccrued;
    private final BigDecimal interestRate;
    private final Long maturityDate;
    private final String name;
    private final String periodTypeNameDctKey;
    private final BigDecimal pfmAcctBalance;
    private final String prodType;
    private final String purposeDictionaryKey;
    private final String showCasAmount;
    private final Long startDate;
    private final String status;
    private final BigDecimal totalBalance;

    public DepositDetailsApiModel(Long l, String str, Long l2, Long l3, BigDecimal bigDecimal, Long l4, String str2, String str3, String str4, Long l5, String str5, String str6, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l6, BigDecimal bigDecimal4, String str7, BigDecimal bigDecimal5, String str8, String str9, String str10, Long l7, String str11, BigDecimal bigDecimal6) {
        this.agreeKey = l;
        this.prodType = str;
        this.maturityDate = l2;
        this.startDate = l3;
        this.intAccrued = bigDecimal;
        this.clientKey = l4;
        this.status = str2;
        this.ccy = str3;
        this.name = str4;
        this.closeDate = l5;
        this.depositType = str5;
        this.agreeNo = str6;
        this.interestRate = bigDecimal2;
        this.currentBalance = bigDecimal3;
        this.accountKey = l6;
        this.totalBalance = bigDecimal4;
        this.dictionaryKey = str7;
        this.casAmount = bigDecimal5;
        this.showCasAmount = str8;
        this.agrPurpose = str9;
        this.purposeDictionaryKey = str10;
        this.agrPurposeId = l7;
        this.periodTypeNameDctKey = str11;
        this.pfmAcctBalance = bigDecimal6;
    }

    public static /* synthetic */ DepositDetailsApiModel copy$default(DepositDetailsApiModel depositDetailsApiModel, Long l, String str, Long l2, Long l3, BigDecimal bigDecimal, Long l4, String str2, String str3, String str4, Long l5, String str5, String str6, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l6, BigDecimal bigDecimal4, String str7, BigDecimal bigDecimal5, String str8, String str9, String str10, Long l7, String str11, BigDecimal bigDecimal6, int i, Object obj) {
        DepositDetailsApiModel depositDetailsApiModel2 = depositDetailsApiModel;
        int i2 = i;
        return depositDetailsApiModel.copy((i2 & 1) != 0 ? depositDetailsApiModel2.agreeKey : l, (i2 & 2) != 0 ? depositDetailsApiModel2.prodType : str, (i2 & 4) != 0 ? depositDetailsApiModel2.maturityDate : l2, (i2 & 8) != 0 ? depositDetailsApiModel2.startDate : l3, (i2 & 16) != 0 ? depositDetailsApiModel2.intAccrued : bigDecimal, (i2 & 32) != 0 ? depositDetailsApiModel2.clientKey : l4, (i2 & 64) != 0 ? depositDetailsApiModel2.status : str2, (i2 & 128) != 0 ? depositDetailsApiModel2.ccy : str3, (i2 & C11398b.f33139r) != 0 ? depositDetailsApiModel2.name : str4, (i2 & C11398b.f33140s) != 0 ? depositDetailsApiModel2.closeDate : l5, (i2 & C11398b.f33141t) != 0 ? depositDetailsApiModel2.depositType : str5, (i2 & C11398b.f33142u) != 0 ? depositDetailsApiModel2.agreeNo : str6, (i2 & C11398b.f33143v) != 0 ? depositDetailsApiModel2.interestRate : bigDecimal2, (i2 & 8192) != 0 ? depositDetailsApiModel2.currentBalance : bigDecimal3, (i2 & 16384) != 0 ? depositDetailsApiModel2.accountKey : l6, (i2 & 32768) != 0 ? depositDetailsApiModel2.totalBalance : bigDecimal4, (i2 & 65536) != 0 ? depositDetailsApiModel2.dictionaryKey : str7, (i2 & 131072) != 0 ? depositDetailsApiModel2.casAmount : bigDecimal5, (i2 & 262144) != 0 ? depositDetailsApiModel2.showCasAmount : str8, (i2 & 524288) != 0 ? depositDetailsApiModel2.agrPurpose : str9, (i2 & 1048576) != 0 ? depositDetailsApiModel2.purposeDictionaryKey : str10, (i2 & 2097152) != 0 ? depositDetailsApiModel2.agrPurposeId : l7, (i2 & 4194304) != 0 ? depositDetailsApiModel2.periodTypeNameDctKey : str11, (i2 & 8388608) != 0 ? depositDetailsApiModel2.pfmAcctBalance : bigDecimal6);
    }

    public final Long component1() {
        return this.agreeKey;
    }

    public final Long component10() {
        return this.closeDate;
    }

    public final String component11() {
        return this.depositType;
    }

    public final String component12() {
        return this.agreeNo;
    }

    public final BigDecimal component13() {
        return this.interestRate;
    }

    public final BigDecimal component14() {
        return this.currentBalance;
    }

    public final Long component15() {
        return this.accountKey;
    }

    public final BigDecimal component16() {
        return this.totalBalance;
    }

    public final String component17() {
        return this.dictionaryKey;
    }

    public final BigDecimal component18() {
        return this.casAmount;
    }

    public final String component19() {
        return this.showCasAmount;
    }

    public final String component2() {
        return this.prodType;
    }

    public final String component20() {
        return this.agrPurpose;
    }

    public final String component21() {
        return this.purposeDictionaryKey;
    }

    public final Long component22() {
        return this.agrPurposeId;
    }

    public final String component23() {
        return this.periodTypeNameDctKey;
    }

    public final BigDecimal component24() {
        return this.pfmAcctBalance;
    }

    public final Long component3() {
        return this.maturityDate;
    }

    public final Long component4() {
        return this.startDate;
    }

    public final BigDecimal component5() {
        return this.intAccrued;
    }

    public final Long component6() {
        return this.clientKey;
    }

    public final String component7() {
        return this.status;
    }

    public final String component8() {
        return this.ccy;
    }

    public final String component9() {
        return this.name;
    }

    public final DepositDetailsApiModel copy(Long l, String str, Long l2, Long l3, BigDecimal bigDecimal, Long l4, String str2, String str3, String str4, Long l5, String str5, String str6, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l6, BigDecimal bigDecimal4, String str7, BigDecimal bigDecimal5, String str8, String str9, String str10, Long l7, String str11, BigDecimal bigDecimal6) {
        return new DepositDetailsApiModel(l, str, l2, l3, bigDecimal, l4, str2, str3, str4, l5, str5, str6, bigDecimal2, bigDecimal3, l6, bigDecimal4, str7, bigDecimal5, str8, str9, str10, l7, str11, bigDecimal6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositDetailsApiModel)) {
            return false;
        }
        DepositDetailsApiModel depositDetailsApiModel = (DepositDetailsApiModel) obj;
        return C41536l.m120484d(this.agreeKey, depositDetailsApiModel.agreeKey) && C41536l.m120484d(this.prodType, depositDetailsApiModel.prodType) && C41536l.m120484d(this.maturityDate, depositDetailsApiModel.maturityDate) && C41536l.m120484d(this.startDate, depositDetailsApiModel.startDate) && C41536l.m120484d(this.intAccrued, depositDetailsApiModel.intAccrued) && C41536l.m120484d(this.clientKey, depositDetailsApiModel.clientKey) && C41536l.m120484d(this.status, depositDetailsApiModel.status) && C41536l.m120484d(this.ccy, depositDetailsApiModel.ccy) && C41536l.m120484d(this.name, depositDetailsApiModel.name) && C41536l.m120484d(this.closeDate, depositDetailsApiModel.closeDate) && C41536l.m120484d(this.depositType, depositDetailsApiModel.depositType) && C41536l.m120484d(this.agreeNo, depositDetailsApiModel.agreeNo) && C41536l.m120484d(this.interestRate, depositDetailsApiModel.interestRate) && C41536l.m120484d(this.currentBalance, depositDetailsApiModel.currentBalance) && C41536l.m120484d(this.accountKey, depositDetailsApiModel.accountKey) && C41536l.m120484d(this.totalBalance, depositDetailsApiModel.totalBalance) && C41536l.m120484d(this.dictionaryKey, depositDetailsApiModel.dictionaryKey) && C41536l.m120484d(this.casAmount, depositDetailsApiModel.casAmount) && C41536l.m120484d(this.showCasAmount, depositDetailsApiModel.showCasAmount) && C41536l.m120484d(this.agrPurpose, depositDetailsApiModel.agrPurpose) && C41536l.m120484d(this.purposeDictionaryKey, depositDetailsApiModel.purposeDictionaryKey) && C41536l.m120484d(this.agrPurposeId, depositDetailsApiModel.agrPurposeId) && C41536l.m120484d(this.periodTypeNameDctKey, depositDetailsApiModel.periodTypeNameDctKey) && C41536l.m120484d(this.pfmAcctBalance, depositDetailsApiModel.pfmAcctBalance);
    }

    public final Long getAccountKey() {
        return this.accountKey;
    }

    public final String getAgrPurpose() {
        return this.agrPurpose;
    }

    public final Long getAgrPurposeId() {
        return this.agrPurposeId;
    }

    public final Long getAgreeKey() {
        return this.agreeKey;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final BigDecimal getCasAmount() {
        return this.casAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final Long getCloseDate() {
        return this.closeDate;
    }

    public final BigDecimal getCurrentBalance() {
        return this.currentBalance;
    }

    public final String getDepositType() {
        return this.depositType;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final BigDecimal getIntAccrued() {
        return this.intAccrued;
    }

    public final BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public final Long getMaturityDate() {
        return this.maturityDate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPeriodTypeNameDctKey() {
        return this.periodTypeNameDctKey;
    }

    public final BigDecimal getPfmAcctBalance() {
        return this.pfmAcctBalance;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final String getPurposeDictionaryKey() {
        return this.purposeDictionaryKey;
    }

    public final String getShowCasAmount() {
        return this.showCasAmount;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        Long l = this.agreeKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.prodType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.maturityDate;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.startDate;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        BigDecimal bigDecimal = this.intAccrued;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l4 = this.clientKey;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.status;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ccy;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l5 = this.closeDate;
        int hashCode10 = (hashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str5 = this.depositType;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agreeNo;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.interestRate;
        int hashCode13 = (hashCode12 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.currentBalance;
        int hashCode14 = (hashCode13 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Long l6 = this.accountKey;
        int hashCode15 = (hashCode14 + (l6 == null ? 0 : l6.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.totalBalance;
        int hashCode16 = (hashCode15 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str7 = this.dictionaryKey;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.casAmount;
        int hashCode18 = (hashCode17 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str8 = this.showCasAmount;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.agrPurpose;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.purposeDictionaryKey;
        int hashCode21 = (hashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l7 = this.agrPurposeId;
        int hashCode22 = (hashCode21 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str11 = this.periodTypeNameDctKey;
        int hashCode23 = (hashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.pfmAcctBalance;
        if (bigDecimal6 != null) {
            i = bigDecimal6.hashCode();
        }
        return hashCode23 + i;
    }

    public String toString() {
        Long l = this.agreeKey;
        String str = this.prodType;
        Long l2 = this.maturityDate;
        Long l3 = this.startDate;
        BigDecimal bigDecimal = this.intAccrued;
        Long l4 = this.clientKey;
        String str2 = this.status;
        String str3 = this.ccy;
        String str4 = this.name;
        Long l5 = this.closeDate;
        String str5 = this.depositType;
        String str6 = this.agreeNo;
        BigDecimal bigDecimal2 = this.interestRate;
        BigDecimal bigDecimal3 = this.currentBalance;
        Long l6 = this.accountKey;
        BigDecimal bigDecimal4 = this.totalBalance;
        String str7 = this.dictionaryKey;
        BigDecimal bigDecimal5 = this.casAmount;
        String str8 = this.showCasAmount;
        String str9 = this.agrPurpose;
        String str10 = this.purposeDictionaryKey;
        Long l7 = this.agrPurposeId;
        String str11 = this.periodTypeNameDctKey;
        BigDecimal bigDecimal6 = this.pfmAcctBalance;
        return "DepositDetailsApiModel(agreeKey=" + l + ", prodType=" + str + ", maturityDate=" + l2 + ", startDate=" + l3 + ", intAccrued=" + bigDecimal + ", clientKey=" + l4 + ", status=" + str2 + ", ccy=" + str3 + ", name=" + str4 + ", closeDate=" + l5 + ", depositType=" + str5 + ", agreeNo=" + str6 + ", interestRate=" + bigDecimal2 + ", currentBalance=" + bigDecimal3 + ", accountKey=" + l6 + ", totalBalance=" + bigDecimal4 + ", dictionaryKey=" + str7 + ", casAmount=" + bigDecimal5 + ", showCasAmount=" + str8 + ", agrPurpose=" + str9 + ", purposeDictionaryKey=" + str10 + ", agrPurposeId=" + l7 + ", periodTypeNameDctKey=" + str11 + ", pfmAcctBalance=" + bigDecimal6 + ")";
    }
}
