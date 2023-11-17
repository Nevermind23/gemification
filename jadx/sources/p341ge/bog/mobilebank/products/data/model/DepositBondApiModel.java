package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DepositBondApiModel */
public final class DepositBondApiModel {
    private final Long acctKey;
    private final String ccy;
    private final BigDecimal cdAmount;
    private final Long cdGroupId;
    private final String cdType;
    private final String cdTypeDictionaryKey;
    private final List<DepositBondDetailsApiModel> cdsDetails;
    private final Long clientKey;
    private final String currencyCode;
    private final String dataSource;
    private final String dictionaryKey;
    private final BigDecimal discount;
    private final BigDecimal interestAccrued;
    private final BigDecimal interestRate;
    private final Long issueDate;
    private final String issuer;
    private final BigDecimal marketValue;
    private final BigDecimal marketValueBase;
    private final Long maturityDate;
    private final BigDecimal nominalValue;
    private final BigDecimal principalValueTotal;
    private final String prodType;

    public DepositBondApiModel(Long l, Long l2, String str, Long l3, Long l4, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str4, String str5, String str6, String str7, String str8, Long l5, List<DepositBondDetailsApiModel> list) {
        this.clientKey = l;
        this.cdGroupId = l2;
        this.cdType = str;
        this.issueDate = l3;
        this.maturityDate = l4;
        this.interestRate = bigDecimal;
        this.nominalValue = bigDecimal2;
        this.currencyCode = str2;
        this.prodType = str3;
        this.discount = bigDecimal3;
        this.interestAccrued = bigDecimal4;
        this.marketValue = bigDecimal5;
        this.principalValueTotal = bigDecimal6;
        this.marketValueBase = bigDecimal7;
        this.cdAmount = bigDecimal8;
        this.issuer = str4;
        this.dataSource = str5;
        this.ccy = str6;
        this.dictionaryKey = str7;
        this.cdTypeDictionaryKey = str8;
        this.acctKey = l5;
        this.cdsDetails = list;
    }

    public static /* synthetic */ DepositBondApiModel copy$default(DepositBondApiModel depositBondApiModel, Long l, Long l2, String str, Long l3, Long l4, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str4, String str5, String str6, String str7, String str8, Long l5, List list, int i, Object obj) {
        DepositBondApiModel depositBondApiModel2 = depositBondApiModel;
        int i2 = i;
        return depositBondApiModel.copy((i2 & 1) != 0 ? depositBondApiModel2.clientKey : l, (i2 & 2) != 0 ? depositBondApiModel2.cdGroupId : l2, (i2 & 4) != 0 ? depositBondApiModel2.cdType : str, (i2 & 8) != 0 ? depositBondApiModel2.issueDate : l3, (i2 & 16) != 0 ? depositBondApiModel2.maturityDate : l4, (i2 & 32) != 0 ? depositBondApiModel2.interestRate : bigDecimal, (i2 & 64) != 0 ? depositBondApiModel2.nominalValue : bigDecimal2, (i2 & 128) != 0 ? depositBondApiModel2.currencyCode : str2, (i2 & C11398b.f33139r) != 0 ? depositBondApiModel2.prodType : str3, (i2 & C11398b.f33140s) != 0 ? depositBondApiModel2.discount : bigDecimal3, (i2 & C11398b.f33141t) != 0 ? depositBondApiModel2.interestAccrued : bigDecimal4, (i2 & C11398b.f33142u) != 0 ? depositBondApiModel2.marketValue : bigDecimal5, (i2 & C11398b.f33143v) != 0 ? depositBondApiModel2.principalValueTotal : bigDecimal6, (i2 & 8192) != 0 ? depositBondApiModel2.marketValueBase : bigDecimal7, (i2 & 16384) != 0 ? depositBondApiModel2.cdAmount : bigDecimal8, (i2 & 32768) != 0 ? depositBondApiModel2.issuer : str4, (i2 & 65536) != 0 ? depositBondApiModel2.dataSource : str5, (i2 & 131072) != 0 ? depositBondApiModel2.ccy : str6, (i2 & 262144) != 0 ? depositBondApiModel2.dictionaryKey : str7, (i2 & 524288) != 0 ? depositBondApiModel2.cdTypeDictionaryKey : str8, (i2 & 1048576) != 0 ? depositBondApiModel2.acctKey : l5, (i2 & 2097152) != 0 ? depositBondApiModel2.cdsDetails : list);
    }

    public final Long component1() {
        return this.clientKey;
    }

    public final BigDecimal component10() {
        return this.discount;
    }

    public final BigDecimal component11() {
        return this.interestAccrued;
    }

    public final BigDecimal component12() {
        return this.marketValue;
    }

    public final BigDecimal component13() {
        return this.principalValueTotal;
    }

    public final BigDecimal component14() {
        return this.marketValueBase;
    }

    public final BigDecimal component15() {
        return this.cdAmount;
    }

    public final String component16() {
        return this.issuer;
    }

    public final String component17() {
        return this.dataSource;
    }

    public final String component18() {
        return this.ccy;
    }

    public final String component19() {
        return this.dictionaryKey;
    }

    public final Long component2() {
        return this.cdGroupId;
    }

    public final String component20() {
        return this.cdTypeDictionaryKey;
    }

    public final Long component21() {
        return this.acctKey;
    }

    public final List<DepositBondDetailsApiModel> component22() {
        return this.cdsDetails;
    }

    public final String component3() {
        return this.cdType;
    }

    public final Long component4() {
        return this.issueDate;
    }

    public final Long component5() {
        return this.maturityDate;
    }

    public final BigDecimal component6() {
        return this.interestRate;
    }

    public final BigDecimal component7() {
        return this.nominalValue;
    }

    public final String component8() {
        return this.currencyCode;
    }

    public final String component9() {
        return this.prodType;
    }

    public final DepositBondApiModel copy(Long l, Long l2, String str, Long l3, Long l4, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str4, String str5, String str6, String str7, String str8, Long l5, List<DepositBondDetailsApiModel> list) {
        return new DepositBondApiModel(l, l2, str, l3, l4, bigDecimal, bigDecimal2, str2, str3, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, str4, str5, str6, str7, str8, l5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositBondApiModel)) {
            return false;
        }
        DepositBondApiModel depositBondApiModel = (DepositBondApiModel) obj;
        return C41536l.m120484d(this.clientKey, depositBondApiModel.clientKey) && C41536l.m120484d(this.cdGroupId, depositBondApiModel.cdGroupId) && C41536l.m120484d(this.cdType, depositBondApiModel.cdType) && C41536l.m120484d(this.issueDate, depositBondApiModel.issueDate) && C41536l.m120484d(this.maturityDate, depositBondApiModel.maturityDate) && C41536l.m120484d(this.interestRate, depositBondApiModel.interestRate) && C41536l.m120484d(this.nominalValue, depositBondApiModel.nominalValue) && C41536l.m120484d(this.currencyCode, depositBondApiModel.currencyCode) && C41536l.m120484d(this.prodType, depositBondApiModel.prodType) && C41536l.m120484d(this.discount, depositBondApiModel.discount) && C41536l.m120484d(this.interestAccrued, depositBondApiModel.interestAccrued) && C41536l.m120484d(this.marketValue, depositBondApiModel.marketValue) && C41536l.m120484d(this.principalValueTotal, depositBondApiModel.principalValueTotal) && C41536l.m120484d(this.marketValueBase, depositBondApiModel.marketValueBase) && C41536l.m120484d(this.cdAmount, depositBondApiModel.cdAmount) && C41536l.m120484d(this.issuer, depositBondApiModel.issuer) && C41536l.m120484d(this.dataSource, depositBondApiModel.dataSource) && C41536l.m120484d(this.ccy, depositBondApiModel.ccy) && C41536l.m120484d(this.dictionaryKey, depositBondApiModel.dictionaryKey) && C41536l.m120484d(this.cdTypeDictionaryKey, depositBondApiModel.cdTypeDictionaryKey) && C41536l.m120484d(this.acctKey, depositBondApiModel.acctKey) && C41536l.m120484d(this.cdsDetails, depositBondApiModel.cdsDetails);
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final BigDecimal getCdAmount() {
        return this.cdAmount;
    }

    public final Long getCdGroupId() {
        return this.cdGroupId;
    }

    public final String getCdType() {
        return this.cdType;
    }

    public final String getCdTypeDictionaryKey() {
        return this.cdTypeDictionaryKey;
    }

    public final List<DepositBondDetailsApiModel> getCdsDetails() {
        return this.cdsDetails;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getDataSource() {
        return this.dataSource;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final BigDecimal getDiscount() {
        return this.discount;
    }

    public final BigDecimal getInterestAccrued() {
        return this.interestAccrued;
    }

    public final BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public final Long getIssueDate() {
        return this.issueDate;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final BigDecimal getMarketValue() {
        return this.marketValue;
    }

    public final BigDecimal getMarketValueBase() {
        return this.marketValueBase;
    }

    public final Long getMaturityDate() {
        return this.maturityDate;
    }

    public final BigDecimal getNominalValue() {
        return this.nominalValue;
    }

    public final BigDecimal getPrincipalValueTotal() {
        return this.principalValueTotal;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public int hashCode() {
        Long l = this.clientKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.cdGroupId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.cdType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.issueDate;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.maturityDate;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        BigDecimal bigDecimal = this.interestRate;
        int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.nominalValue;
        int hashCode7 = (hashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.currencyCode;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prodType;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.discount;
        int hashCode10 = (hashCode9 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.interestAccrued;
        int hashCode11 = (hashCode10 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.marketValue;
        int hashCode12 = (hashCode11 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.principalValueTotal;
        int hashCode13 = (hashCode12 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.marketValueBase;
        int hashCode14 = (hashCode13 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.cdAmount;
        int hashCode15 = (hashCode14 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        String str4 = this.issuer;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dataSource;
        int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ccy;
        int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dictionaryKey;
        int hashCode19 = (hashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cdTypeDictionaryKey;
        int hashCode20 = (hashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l5 = this.acctKey;
        int hashCode21 = (hashCode20 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List<DepositBondDetailsApiModel> list = this.cdsDetails;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode21 + i;
    }

    public String toString() {
        Long l = this.clientKey;
        Long l2 = this.cdGroupId;
        String str = this.cdType;
        Long l3 = this.issueDate;
        Long l4 = this.maturityDate;
        BigDecimal bigDecimal = this.interestRate;
        BigDecimal bigDecimal2 = this.nominalValue;
        String str2 = this.currencyCode;
        String str3 = this.prodType;
        BigDecimal bigDecimal3 = this.discount;
        BigDecimal bigDecimal4 = this.interestAccrued;
        BigDecimal bigDecimal5 = this.marketValue;
        BigDecimal bigDecimal6 = this.principalValueTotal;
        BigDecimal bigDecimal7 = this.marketValueBase;
        BigDecimal bigDecimal8 = this.cdAmount;
        String str4 = this.issuer;
        String str5 = this.dataSource;
        String str6 = this.ccy;
        String str7 = this.dictionaryKey;
        String str8 = this.cdTypeDictionaryKey;
        Long l5 = this.acctKey;
        List<DepositBondDetailsApiModel> list = this.cdsDetails;
        return "DepositBondApiModel(clientKey=" + l + ", cdGroupId=" + l2 + ", cdType=" + str + ", issueDate=" + l3 + ", maturityDate=" + l4 + ", interestRate=" + bigDecimal + ", nominalValue=" + bigDecimal2 + ", currencyCode=" + str2 + ", prodType=" + str3 + ", discount=" + bigDecimal3 + ", interestAccrued=" + bigDecimal4 + ", marketValue=" + bigDecimal5 + ", principalValueTotal=" + bigDecimal6 + ", marketValueBase=" + bigDecimal7 + ", cdAmount=" + bigDecimal8 + ", issuer=" + str4 + ", dataSource=" + str5 + ", ccy=" + str6 + ", dictionaryKey=" + str7 + ", cdTypeDictionaryKey=" + str8 + ", acctKey=" + l5 + ", cdsDetails=" + list + ")";
    }
}
