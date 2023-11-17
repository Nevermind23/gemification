package p341ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity.ProviderInfoEntity */
public final class ProviderInfoEntity {
    private final Double insIncomeRate;
    private final String insIncomeRateCcy;
    private final String insIncomeRateType;
    private final Double insLifeRate;
    private final String insLifeRateCcy;
    private final String insLifeRateType;
    private final String providerId;
    private final String providerName;
    private final String providerNameEn;

    public ProviderInfoEntity(Double d, String str, String str2, Double d2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str5, "providerId");
        C41536l.m120489i(str6, "providerName");
        C41536l.m120489i(str7, "providerNameEn");
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

    public static /* synthetic */ ProviderInfoEntity copy$default(ProviderInfoEntity providerInfoEntity, Double d, String str, String str2, Double d2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        ProviderInfoEntity providerInfoEntity2 = providerInfoEntity;
        int i2 = i;
        return providerInfoEntity.copy((i2 & 1) != 0 ? providerInfoEntity2.insIncomeRate : d, (i2 & 2) != 0 ? providerInfoEntity2.insIncomeRateCcy : str, (i2 & 4) != 0 ? providerInfoEntity2.insIncomeRateType : str2, (i2 & 8) != 0 ? providerInfoEntity2.insLifeRate : d2, (i2 & 16) != 0 ? providerInfoEntity2.insLifeRateCcy : str3, (i2 & 32) != 0 ? providerInfoEntity2.insLifeRateType : str4, (i2 & 64) != 0 ? providerInfoEntity2.providerId : str5, (i2 & 128) != 0 ? providerInfoEntity2.providerName : str6, (i2 & C11398b.f33139r) != 0 ? providerInfoEntity2.providerNameEn : str7);
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

    public final ProviderInfoEntity copy(Double d, String str, String str2, Double d2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str5;
        C41536l.m120489i(str8, "providerId");
        String str9 = str6;
        C41536l.m120489i(str9, "providerName");
        String str10 = str7;
        C41536l.m120489i(str10, "providerNameEn");
        return new ProviderInfoEntity(d, str, str2, d2, str3, str4, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderInfoEntity)) {
            return false;
        }
        ProviderInfoEntity providerInfoEntity = (ProviderInfoEntity) obj;
        return C41536l.m120484d(this.insIncomeRate, providerInfoEntity.insIncomeRate) && C41536l.m120484d(this.insIncomeRateCcy, providerInfoEntity.insIncomeRateCcy) && C41536l.m120484d(this.insIncomeRateType, providerInfoEntity.insIncomeRateType) && C41536l.m120484d(this.insLifeRate, providerInfoEntity.insLifeRate) && C41536l.m120484d(this.insLifeRateCcy, providerInfoEntity.insLifeRateCcy) && C41536l.m120484d(this.insLifeRateType, providerInfoEntity.insLifeRateType) && C41536l.m120484d(this.providerId, providerInfoEntity.providerId) && C41536l.m120484d(this.providerName, providerInfoEntity.providerName) && C41536l.m120484d(this.providerNameEn, providerInfoEntity.providerNameEn);
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
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((((hashCode5 + i) * 31) + this.providerId.hashCode()) * 31) + this.providerName.hashCode()) * 31) + this.providerNameEn.hashCode();
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
        return "ProviderInfoEntity(insIncomeRate=" + d + ", insIncomeRateCcy=" + str + ", insIncomeRateType=" + str2 + ", insLifeRate=" + d2 + ", insLifeRateCcy=" + str3 + ", insLifeRateType=" + str4 + ", providerId=" + str5 + ", providerName=" + str6 + ", providerNameEn=" + str7 + ")";
    }
}
