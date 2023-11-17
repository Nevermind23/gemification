package p341ge.bog.mobilebank.insurance.travelinsurance.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.data.model.TravelInsuranceProvidersApiModel */
public final class TravelInsuranceProvidersApiModel {
    private final List<AdditionalCoverageApiModel> additionalCoverage;
    private final Integer errorCode;
    private final String hashKey;
    private final Double insurancePremium;
    private final Double luggagePremium;
    private final Double premium;
    private final String premiumCcy;
    private final String productId;
    private final String providerId;
    private final String providerLogoURL;
    private final String providerName;
    private final String sessionId;

    public TravelInsuranceProvidersApiModel(List<AdditionalCoverageApiModel> list, Integer num, String str, Double d, String str2, String str3, String str4, String str5, String str6, String str7, Double d2, Double d3) {
        this.additionalCoverage = list;
        this.errorCode = num;
        this.hashKey = str;
        this.premium = d;
        this.premiumCcy = str2;
        this.productId = str3;
        this.providerLogoURL = str4;
        this.providerName = str5;
        this.sessionId = str6;
        this.providerId = str7;
        this.insurancePremium = d2;
        this.luggagePremium = d3;
    }

    public static /* synthetic */ TravelInsuranceProvidersApiModel copy$default(TravelInsuranceProvidersApiModel travelInsuranceProvidersApiModel, List list, Integer num, String str, Double d, String str2, String str3, String str4, String str5, String str6, String str7, Double d2, Double d3, int i, Object obj) {
        TravelInsuranceProvidersApiModel travelInsuranceProvidersApiModel2 = travelInsuranceProvidersApiModel;
        int i2 = i;
        return travelInsuranceProvidersApiModel.copy((i2 & 1) != 0 ? travelInsuranceProvidersApiModel2.additionalCoverage : list, (i2 & 2) != 0 ? travelInsuranceProvidersApiModel2.errorCode : num, (i2 & 4) != 0 ? travelInsuranceProvidersApiModel2.hashKey : str, (i2 & 8) != 0 ? travelInsuranceProvidersApiModel2.premium : d, (i2 & 16) != 0 ? travelInsuranceProvidersApiModel2.premiumCcy : str2, (i2 & 32) != 0 ? travelInsuranceProvidersApiModel2.productId : str3, (i2 & 64) != 0 ? travelInsuranceProvidersApiModel2.providerLogoURL : str4, (i2 & 128) != 0 ? travelInsuranceProvidersApiModel2.providerName : str5, (i2 & C11398b.f33139r) != 0 ? travelInsuranceProvidersApiModel2.sessionId : str6, (i2 & C11398b.f33140s) != 0 ? travelInsuranceProvidersApiModel2.providerId : str7, (i2 & C11398b.f33141t) != 0 ? travelInsuranceProvidersApiModel2.insurancePremium : d2, (i2 & C11398b.f33142u) != 0 ? travelInsuranceProvidersApiModel2.luggagePremium : d3);
    }

    public final List<AdditionalCoverageApiModel> component1() {
        return this.additionalCoverage;
    }

    public final String component10() {
        return this.providerId;
    }

    public final Double component11() {
        return this.insurancePremium;
    }

    public final Double component12() {
        return this.luggagePremium;
    }

    public final Integer component2() {
        return this.errorCode;
    }

    public final String component3() {
        return this.hashKey;
    }

    public final Double component4() {
        return this.premium;
    }

    public final String component5() {
        return this.premiumCcy;
    }

    public final String component6() {
        return this.productId;
    }

    public final String component7() {
        return this.providerLogoURL;
    }

    public final String component8() {
        return this.providerName;
    }

    public final String component9() {
        return this.sessionId;
    }

    public final TravelInsuranceProvidersApiModel copy(List<AdditionalCoverageApiModel> list, Integer num, String str, Double d, String str2, String str3, String str4, String str5, String str6, String str7, Double d2, Double d3) {
        return new TravelInsuranceProvidersApiModel(list, num, str, d, str2, str3, str4, str5, str6, str7, d2, d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelInsuranceProvidersApiModel)) {
            return false;
        }
        TravelInsuranceProvidersApiModel travelInsuranceProvidersApiModel = (TravelInsuranceProvidersApiModel) obj;
        return C41536l.m120484d(this.additionalCoverage, travelInsuranceProvidersApiModel.additionalCoverage) && C41536l.m120484d(this.errorCode, travelInsuranceProvidersApiModel.errorCode) && C41536l.m120484d(this.hashKey, travelInsuranceProvidersApiModel.hashKey) && C41536l.m120484d(this.premium, travelInsuranceProvidersApiModel.premium) && C41536l.m120484d(this.premiumCcy, travelInsuranceProvidersApiModel.premiumCcy) && C41536l.m120484d(this.productId, travelInsuranceProvidersApiModel.productId) && C41536l.m120484d(this.providerLogoURL, travelInsuranceProvidersApiModel.providerLogoURL) && C41536l.m120484d(this.providerName, travelInsuranceProvidersApiModel.providerName) && C41536l.m120484d(this.sessionId, travelInsuranceProvidersApiModel.sessionId) && C41536l.m120484d(this.providerId, travelInsuranceProvidersApiModel.providerId) && C41536l.m120484d(this.insurancePremium, travelInsuranceProvidersApiModel.insurancePremium) && C41536l.m120484d(this.luggagePremium, travelInsuranceProvidersApiModel.luggagePremium);
    }

    public final List<AdditionalCoverageApiModel> getAdditionalCoverage() {
        return this.additionalCoverage;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getHashKey() {
        return this.hashKey;
    }

    public final Double getInsurancePremium() {
        return this.insurancePremium;
    }

    public final Double getLuggagePremium() {
        return this.luggagePremium;
    }

    public final Double getPremium() {
        return this.premium;
    }

    public final String getPremiumCcy() {
        return this.premiumCcy;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final String getProviderLogoURL() {
        return this.providerLogoURL;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        List<AdditionalCoverageApiModel> list = this.additionalCoverage;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.errorCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.hashKey;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.premium;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.premiumCcy;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.providerLogoURL;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.providerName;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sessionId;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.providerId;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d2 = this.insurancePremium;
        int hashCode11 = (hashCode10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.luggagePremium;
        if (d3 != null) {
            i = d3.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        List<AdditionalCoverageApiModel> list = this.additionalCoverage;
        Integer num = this.errorCode;
        String str = this.hashKey;
        Double d = this.premium;
        String str2 = this.premiumCcy;
        String str3 = this.productId;
        String str4 = this.providerLogoURL;
        String str5 = this.providerName;
        String str6 = this.sessionId;
        String str7 = this.providerId;
        Double d2 = this.insurancePremium;
        Double d3 = this.luggagePremium;
        return "TravelInsuranceProvidersApiModel(additionalCoverage=" + list + ", errorCode=" + num + ", hashKey=" + str + ", premium=" + d + ", premiumCcy=" + str2 + ", productId=" + str3 + ", providerLogoURL=" + str4 + ", providerName=" + str5 + ", sessionId=" + str6 + ", providerId=" + str7 + ", insurancePremium=" + d2 + ", luggagePremium=" + d3 + ")";
    }
}
