package p341ge.bog.mobilebank.loanactivation.data.entity.loandecision;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loanactivation.data.entity.loandecision.ProviderInfoApiModel */
public final class ProviderInfoApiModel {
    private final Double insIncomeRate;
    private final String insIncomeRateCcy;
    private final String insIncomeRateType;
    private final Double insLifeRate;
    private final String insLifeRateCcy;
    private final String insLifeRateType;
    private final String providerId;
    private final String providerName;
    private final String providerNameEn;

    public ProviderInfoApiModel(Double d, String str, String str2, Double d2, String str3, String str4, String str5, String str6, String str7) {
        this.insIncomeRate = d;
        this.insIncomeRateCcy = str;
        this.insIncomeRateType = str2;
        this.insLifeRate = d2;
        this.insLifeRateCcy = str3;
        this.insLifeRateType = str4;
        this.providerId = str5;
        this.providerName = str6;
        this.providerNameEn = str7;
    }

    public static /* synthetic */ ProviderInfoApiModel copy$default(ProviderInfoApiModel providerInfoApiModel, Double d, String str, String str2, Double d2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        ProviderInfoApiModel providerInfoApiModel2 = providerInfoApiModel;
        int i2 = i;
        return providerInfoApiModel.copy((i2 & 1) != 0 ? providerInfoApiModel2.insIncomeRate : d, (i2 & 2) != 0 ? providerInfoApiModel2.insIncomeRateCcy : str, (i2 & 4) != 0 ? providerInfoApiModel2.insIncomeRateType : str2, (i2 & 8) != 0 ? providerInfoApiModel2.insLifeRate : d2, (i2 & 16) != 0 ? providerInfoApiModel2.insLifeRateCcy : str3, (i2 & 32) != 0 ? providerInfoApiModel2.insLifeRateType : str4, (i2 & 64) != 0 ? providerInfoApiModel2.providerId : str5, (i2 & 128) != 0 ? providerInfoApiModel2.providerName : str6, (i2 & C11398b.f33139r) != 0 ? providerInfoApiModel2.providerNameEn : str7);
    }

    public final Double component1() {
        return this.insIncomeRate;
    }

    public final String component2() {
        return this.insIncomeRateCcy;
    }

    public final String component3() {
        return this.insIncomeRateType;
    }

    public final Double component4() {
        return this.insLifeRate;
    }

    public final String component5() {
        return this.insLifeRateCcy;
    }

    public final String component6() {
        return this.insLifeRateType;
    }

    public final String component7() {
        return this.providerId;
    }

    public final String component8() {
        return this.providerName;
    }

    public final String component9() {
        return this.providerNameEn;
    }

    public final ProviderInfoApiModel copy(Double d, String str, String str2, Double d2, String str3, String str4, String str5, String str6, String str7) {
        return new ProviderInfoApiModel(d, str, str2, d2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderInfoApiModel)) {
            return false;
        }
        ProviderInfoApiModel providerInfoApiModel = (ProviderInfoApiModel) obj;
        return C41536l.m120484d(this.insIncomeRate, providerInfoApiModel.insIncomeRate) && C41536l.m120484d(this.insIncomeRateCcy, providerInfoApiModel.insIncomeRateCcy) && C41536l.m120484d(this.insIncomeRateType, providerInfoApiModel.insIncomeRateType) && C41536l.m120484d(this.insLifeRate, providerInfoApiModel.insLifeRate) && C41536l.m120484d(this.insLifeRateCcy, providerInfoApiModel.insLifeRateCcy) && C41536l.m120484d(this.insLifeRateType, providerInfoApiModel.insLifeRateType) && C41536l.m120484d(this.providerId, providerInfoApiModel.providerId) && C41536l.m120484d(this.providerName, providerInfoApiModel.providerName) && C41536l.m120484d(this.providerNameEn, providerInfoApiModel.providerNameEn);
    }

    public final Double getInsIncomeRate() {
        return this.insIncomeRate;
    }

    public final String getInsIncomeRateCcy() {
        return this.insIncomeRateCcy;
    }

    public final String getInsIncomeRateType() {
        return this.insIncomeRateType;
    }

    public final Double getInsLifeRate() {
        return this.insLifeRate;
    }

    public final String getInsLifeRateCcy() {
        return this.insLifeRateCcy;
    }

    public final String getInsLifeRateType() {
        return this.insLifeRateType;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getProviderNameEn() {
        return this.providerNameEn;
    }

    public int hashCode() {
        Double d = this.insIncomeRate;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.insIncomeRateCcy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.insIncomeRateType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.insLifeRate;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.insLifeRateCcy;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.insLifeRateType;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.providerId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.providerName;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.providerNameEn;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        Double d = this.insIncomeRate;
        String str = this.insIncomeRateCcy;
        String str2 = this.insIncomeRateType;
        Double d2 = this.insLifeRate;
        String str3 = this.insLifeRateCcy;
        String str4 = this.insLifeRateType;
        String str5 = this.providerId;
        String str6 = this.providerName;
        String str7 = this.providerNameEn;
        return "ProviderInfoApiModel(insIncomeRate=" + d + ", insIncomeRateCcy=" + str + ", insIncomeRateType=" + str2 + ", insLifeRate=" + d2 + ", insLifeRateCcy=" + str3 + ", insLifeRateType=" + str4 + ", providerId=" + str5 + ", providerName=" + str6 + ", providerNameEn=" + str7 + ")";
    }
}
