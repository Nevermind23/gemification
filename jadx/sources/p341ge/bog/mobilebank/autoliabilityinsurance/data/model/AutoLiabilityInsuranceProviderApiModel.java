package p341ge.bog.mobilebank.autoliabilityinsurance.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.data.model.AutoLiabilityInsuranceProviderApiModel */
public final class AutoLiabilityInsuranceProviderApiModel {
    private final List<LimitAmountApiModel> limitAmounts;
    private final Double monthlyPayment;
    private final String providerId;
    private final String providerLogoUrl;
    private final String providerName;

    public AutoLiabilityInsuranceProviderApiModel(String str, String str2, String str3, Double d, List<LimitAmountApiModel> list) {
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(list, "limitAmounts");
        this.providerId = str;
        this.providerName = str2;
        this.providerLogoUrl = str3;
        this.monthlyPayment = d;
        this.limitAmounts = list;
    }

    public static /* synthetic */ AutoLiabilityInsuranceProviderApiModel copy$default(AutoLiabilityInsuranceProviderApiModel autoLiabilityInsuranceProviderApiModel, String str, String str2, String str3, Double d, List<LimitAmountApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoLiabilityInsuranceProviderApiModel.providerId;
        }
        if ((i & 2) != 0) {
            str2 = autoLiabilityInsuranceProviderApiModel.providerName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = autoLiabilityInsuranceProviderApiModel.providerLogoUrl;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            d = autoLiabilityInsuranceProviderApiModel.monthlyPayment;
        }
        Double d2 = d;
        if ((i & 16) != 0) {
            list = autoLiabilityInsuranceProviderApiModel.limitAmounts;
        }
        return autoLiabilityInsuranceProviderApiModel.copy(str, str4, str5, d2, list);
    }

    public final String component1() {
        return this.providerId;
    }

    public final String component2() {
        return this.providerName;
    }

    public final String component3() {
        return this.providerLogoUrl;
    }

    public final Double component4() {
        return this.monthlyPayment;
    }

    public final List<LimitAmountApiModel> component5() {
        return this.limitAmounts;
    }

    public final AutoLiabilityInsuranceProviderApiModel copy(String str, String str2, String str3, Double d, List<LimitAmountApiModel> list) {
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(list, "limitAmounts");
        return new AutoLiabilityInsuranceProviderApiModel(str, str2, str3, d, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoLiabilityInsuranceProviderApiModel)) {
            return false;
        }
        AutoLiabilityInsuranceProviderApiModel autoLiabilityInsuranceProviderApiModel = (AutoLiabilityInsuranceProviderApiModel) obj;
        return C41536l.m120484d(this.providerId, autoLiabilityInsuranceProviderApiModel.providerId) && C41536l.m120484d(this.providerName, autoLiabilityInsuranceProviderApiModel.providerName) && C41536l.m120484d(this.providerLogoUrl, autoLiabilityInsuranceProviderApiModel.providerLogoUrl) && C41536l.m120484d(this.monthlyPayment, autoLiabilityInsuranceProviderApiModel.monthlyPayment) && C41536l.m120484d(this.limitAmounts, autoLiabilityInsuranceProviderApiModel.limitAmounts);
    }

    public final List<LimitAmountApiModel> getLimitAmounts() {
        return this.limitAmounts;
    }

    public final Double getMonthlyPayment() {
        return this.monthlyPayment;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final String getProviderLogoUrl() {
        return this.providerLogoUrl;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public int hashCode() {
        int hashCode = this.providerId.hashCode() * 31;
        String str = this.providerName;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.providerLogoUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.monthlyPayment;
        if (d != null) {
            i = d.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.limitAmounts.hashCode();
    }

    public String toString() {
        String str = this.providerId;
        String str2 = this.providerName;
        String str3 = this.providerLogoUrl;
        Double d = this.monthlyPayment;
        List<LimitAmountApiModel> list = this.limitAmounts;
        return "AutoLiabilityInsuranceProviderApiModel(providerId=" + str + ", providerName=" + str2 + ", providerLogoUrl=" + str3 + ", monthlyPayment=" + d + ", limitAmounts=" + list + ")";
    }
}
