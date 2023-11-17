package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.DepositTypeDetailsEntity */
public final class DepositTypeDetailsEntity {
    private final List<DepositFeatureEntity> advantages;
    private final String advantagesKey;
    private final String commissionAmountKey;
    private final String conditionsKey;
    private final long depositMaxEndDate;
    private final long depositMinEndDate;
    private final String dictionaryKey;
    private final List<DepositFeatureEntity> disAdvantages;
    private final String effectiveRate;
    private final String hasCampaign;
    private final Boolean hasInterestAccount;
    private final Boolean hasPrimaryAccount;
    private final String maxIntRate;
    private final String minAmountKey;
    private final String minIntRate;
    private final String minMaxTermsKey;
    private final BigDecimal preContractIrrMaxAmount;
    private final BigDecimal preContractIrrMinAmount;
    private final String prodType;
    private final String value;

    public DepositTypeDetailsEntity(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6, String str7, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str8, String str9, long j, long j2, String str10, String str11, String str12, List<DepositFeatureEntity> list, List<DepositFeatureEntity> list2) {
        BigDecimal bigDecimal3 = bigDecimal2;
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(bigDecimal, "preContractIrrMinAmount");
        C41536l.m120489i(bigDecimal3, "preContractIrrMaxAmount");
        this.prodType = str;
        this.value = str2;
        this.dictionaryKey = str3;
        this.hasPrimaryAccount = bool;
        this.hasInterestAccount = bool2;
        this.advantagesKey = str4;
        this.conditionsKey = str5;
        this.minAmountKey = str6;
        this.minMaxTermsKey = str7;
        this.preContractIrrMinAmount = bigDecimal;
        this.preContractIrrMaxAmount = bigDecimal3;
        this.commissionAmountKey = str8;
        this.hasCampaign = str9;
        this.depositMinEndDate = j;
        this.depositMaxEndDate = j2;
        this.minIntRate = str10;
        this.maxIntRate = str11;
        this.effectiveRate = str12;
        this.advantages = list;
        this.disAdvantages = list2;
    }

    public static /* synthetic */ DepositTypeDetailsEntity copy$default(DepositTypeDetailsEntity depositTypeDetailsEntity, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6, String str7, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str8, String str9, long j, long j2, String str10, String str11, String str12, List list, List list2, int i, Object obj) {
        DepositTypeDetailsEntity depositTypeDetailsEntity2 = depositTypeDetailsEntity;
        int i2 = i;
        return depositTypeDetailsEntity.copy((i2 & 1) != 0 ? depositTypeDetailsEntity2.prodType : str, (i2 & 2) != 0 ? depositTypeDetailsEntity2.value : str2, (i2 & 4) != 0 ? depositTypeDetailsEntity2.dictionaryKey : str3, (i2 & 8) != 0 ? depositTypeDetailsEntity2.hasPrimaryAccount : bool, (i2 & 16) != 0 ? depositTypeDetailsEntity2.hasInterestAccount : bool2, (i2 & 32) != 0 ? depositTypeDetailsEntity2.advantagesKey : str4, (i2 & 64) != 0 ? depositTypeDetailsEntity2.conditionsKey : str5, (i2 & 128) != 0 ? depositTypeDetailsEntity2.minAmountKey : str6, (i2 & C11398b.f33139r) != 0 ? depositTypeDetailsEntity2.minMaxTermsKey : str7, (i2 & C11398b.f33140s) != 0 ? depositTypeDetailsEntity2.preContractIrrMinAmount : bigDecimal, (i2 & C11398b.f33141t) != 0 ? depositTypeDetailsEntity2.preContractIrrMaxAmount : bigDecimal2, (i2 & C11398b.f33142u) != 0 ? depositTypeDetailsEntity2.commissionAmountKey : str8, (i2 & C11398b.f33143v) != 0 ? depositTypeDetailsEntity2.hasCampaign : str9, (i2 & 8192) != 0 ? depositTypeDetailsEntity2.depositMinEndDate : j, (i2 & 16384) != 0 ? depositTypeDetailsEntity2.depositMaxEndDate : j2, (i2 & 32768) != 0 ? depositTypeDetailsEntity2.minIntRate : str10, (65536 & i2) != 0 ? depositTypeDetailsEntity2.maxIntRate : str11, (i2 & 131072) != 0 ? depositTypeDetailsEntity2.effectiveRate : str12, (i2 & 262144) != 0 ? depositTypeDetailsEntity2.advantages : list, (i2 & 524288) != 0 ? depositTypeDetailsEntity2.disAdvantages : list2);
    }

    public final String component1() {
        return this.prodType;
    }

    public final BigDecimal component10() {
        return this.preContractIrrMinAmount;
    }

    public final BigDecimal component11() {
        return this.preContractIrrMaxAmount;
    }

    public final String component12() {
        return this.commissionAmountKey;
    }

    public final String component13() {
        return this.hasCampaign;
    }

    public final long component14() {
        return this.depositMinEndDate;
    }

    public final long component15() {
        return this.depositMaxEndDate;
    }

    public final String component16() {
        return this.minIntRate;
    }

    public final String component17() {
        return this.maxIntRate;
    }

    public final String component18() {
        return this.effectiveRate;
    }

    public final List<DepositFeatureEntity> component19() {
        return this.advantages;
    }

    public final String component2() {
        return this.value;
    }

    public final List<DepositFeatureEntity> component20() {
        return this.disAdvantages;
    }

    public final String component3() {
        return this.dictionaryKey;
    }

    public final Boolean component4() {
        return this.hasPrimaryAccount;
    }

    public final Boolean component5() {
        return this.hasInterestAccount;
    }

    public final String component6() {
        return this.advantagesKey;
    }

    public final String component7() {
        return this.conditionsKey;
    }

    public final String component8() {
        return this.minAmountKey;
    }

    public final String component9() {
        return this.minMaxTermsKey;
    }

    public final DepositTypeDetailsEntity copy(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6, String str7, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str8, String str9, long j, long j2, String str10, String str11, String str12, List<DepositFeatureEntity> list, List<DepositFeatureEntity> list2) {
        String str13 = str;
        C41536l.m120489i(str13, "prodType");
        C41536l.m120489i(bigDecimal, "preContractIrrMinAmount");
        C41536l.m120489i(bigDecimal2, "preContractIrrMaxAmount");
        return new DepositTypeDetailsEntity(str13, str2, str3, bool, bool2, str4, str5, str6, str7, bigDecimal, bigDecimal2, str8, str9, j, j2, str10, str11, str12, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositTypeDetailsEntity)) {
            return false;
        }
        DepositTypeDetailsEntity depositTypeDetailsEntity = (DepositTypeDetailsEntity) obj;
        return C41536l.m120484d(this.prodType, depositTypeDetailsEntity.prodType) && C41536l.m120484d(this.value, depositTypeDetailsEntity.value) && C41536l.m120484d(this.dictionaryKey, depositTypeDetailsEntity.dictionaryKey) && C41536l.m120484d(this.hasPrimaryAccount, depositTypeDetailsEntity.hasPrimaryAccount) && C41536l.m120484d(this.hasInterestAccount, depositTypeDetailsEntity.hasInterestAccount) && C41536l.m120484d(this.advantagesKey, depositTypeDetailsEntity.advantagesKey) && C41536l.m120484d(this.conditionsKey, depositTypeDetailsEntity.conditionsKey) && C41536l.m120484d(this.minAmountKey, depositTypeDetailsEntity.minAmountKey) && C41536l.m120484d(this.minMaxTermsKey, depositTypeDetailsEntity.minMaxTermsKey) && C41536l.m120484d(this.preContractIrrMinAmount, depositTypeDetailsEntity.preContractIrrMinAmount) && C41536l.m120484d(this.preContractIrrMaxAmount, depositTypeDetailsEntity.preContractIrrMaxAmount) && C41536l.m120484d(this.commissionAmountKey, depositTypeDetailsEntity.commissionAmountKey) && C41536l.m120484d(this.hasCampaign, depositTypeDetailsEntity.hasCampaign) && this.depositMinEndDate == depositTypeDetailsEntity.depositMinEndDate && this.depositMaxEndDate == depositTypeDetailsEntity.depositMaxEndDate && C41536l.m120484d(this.minIntRate, depositTypeDetailsEntity.minIntRate) && C41536l.m120484d(this.maxIntRate, depositTypeDetailsEntity.maxIntRate) && C41536l.m120484d(this.effectiveRate, depositTypeDetailsEntity.effectiveRate) && C41536l.m120484d(this.advantages, depositTypeDetailsEntity.advantages) && C41536l.m120484d(this.disAdvantages, depositTypeDetailsEntity.disAdvantages);
    }

    public final List<DepositFeatureEntity> getAdvantages() {
        return this.advantages;
    }

    public final String getAdvantagesKey() {
        return this.advantagesKey;
    }

    public final String getCommissionAmountKey() {
        return this.commissionAmountKey;
    }

    public final String getConditionsKey() {
        return this.conditionsKey;
    }

    public final long getDepositMaxEndDate() {
        return this.depositMaxEndDate;
    }

    public final long getDepositMinEndDate() {
        return this.depositMinEndDate;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final List<DepositFeatureEntity> getDisAdvantages() {
        return this.disAdvantages;
    }

    public final String getEffectiveRate() {
        return this.effectiveRate;
    }

    public final String getHasCampaign() {
        return this.hasCampaign;
    }

    public final Boolean getHasInterestAccount() {
        return this.hasInterestAccount;
    }

    public final Boolean getHasPrimaryAccount() {
        return this.hasPrimaryAccount;
    }

    public final String getMaxIntRate() {
        return this.maxIntRate;
    }

    public final String getMinAmountKey() {
        return this.minAmountKey;
    }

    public final String getMinIntRate() {
        return this.minIntRate;
    }

    public final String getMinMaxTermsKey() {
        return this.minMaxTermsKey;
    }

    public final BigDecimal getPreContractIrrMaxAmount() {
        return this.preContractIrrMaxAmount;
    }

    public final BigDecimal getPreContractIrrMinAmount() {
        return this.preContractIrrMinAmount;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.prodType.hashCode() * 31;
        String str = this.value;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dictionaryKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasPrimaryAccount;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasInterestAccount;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.advantagesKey;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.conditionsKey;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minAmountKey;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.minMaxTermsKey;
        int hashCode9 = (((((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.preContractIrrMinAmount.hashCode()) * 31) + this.preContractIrrMaxAmount.hashCode()) * 31;
        String str7 = this.commissionAmountKey;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.hasCampaign;
        int hashCode11 = (((((hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31) + C7397t.m28148a(this.depositMinEndDate)) * 31) + C7397t.m28148a(this.depositMaxEndDate)) * 31;
        String str9 = this.minIntRate;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.maxIntRate;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.effectiveRate;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<DepositFeatureEntity> list = this.advantages;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        List<DepositFeatureEntity> list2 = this.disAdvantages;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode15 + i;
    }

    public String toString() {
        String str = this.prodType;
        String str2 = this.value;
        String str3 = this.dictionaryKey;
        Boolean bool = this.hasPrimaryAccount;
        Boolean bool2 = this.hasInterestAccount;
        String str4 = this.advantagesKey;
        String str5 = this.conditionsKey;
        String str6 = this.minAmountKey;
        String str7 = this.minMaxTermsKey;
        BigDecimal bigDecimal = this.preContractIrrMinAmount;
        BigDecimal bigDecimal2 = this.preContractIrrMaxAmount;
        String str8 = this.commissionAmountKey;
        String str9 = this.hasCampaign;
        long j = this.depositMinEndDate;
        long j2 = this.depositMaxEndDate;
        String str10 = this.minIntRate;
        String str11 = this.maxIntRate;
        String str12 = this.effectiveRate;
        List<DepositFeatureEntity> list = this.advantages;
        List<DepositFeatureEntity> list2 = this.disAdvantages;
        return "DepositTypeDetailsEntity(prodType=" + str + ", value=" + str2 + ", dictionaryKey=" + str3 + ", hasPrimaryAccount=" + bool + ", hasInterestAccount=" + bool2 + ", advantagesKey=" + str4 + ", conditionsKey=" + str5 + ", minAmountKey=" + str6 + ", minMaxTermsKey=" + str7 + ", preContractIrrMinAmount=" + bigDecimal + ", preContractIrrMaxAmount=" + bigDecimal2 + ", commissionAmountKey=" + str8 + ", hasCampaign=" + str9 + ", depositMinEndDate=" + j + ", depositMaxEndDate=" + j2 + ", minIntRate=" + str10 + ", maxIntRate=" + str11 + ", effectiveRate=" + str12 + ", advantages=" + list + ", disAdvantages=" + list2 + ")";
    }
}
