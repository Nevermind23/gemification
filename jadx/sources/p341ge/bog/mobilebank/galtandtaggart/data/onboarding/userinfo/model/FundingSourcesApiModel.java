package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.FundingSourcesApiModel */
public final class FundingSourcesApiModel {
    private final List<SubTypeApiModel> fundingSourcesLOV;
    private final String fundingSourcesValue;

    public FundingSourcesApiModel(String str, List<SubTypeApiModel> list) {
        C41536l.m120489i(list, "fundingSourcesLOV");
        this.fundingSourcesValue = str;
        this.fundingSourcesLOV = list;
    }

    public static /* synthetic */ FundingSourcesApiModel copy$default(FundingSourcesApiModel fundingSourcesApiModel, String str, List<SubTypeApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingSourcesApiModel.fundingSourcesValue;
        }
        if ((i & 2) != 0) {
            list = fundingSourcesApiModel.fundingSourcesLOV;
        }
        return fundingSourcesApiModel.copy(str, list);
    }

    public final String component1() {
        return this.fundingSourcesValue;
    }

    public final List<SubTypeApiModel> component2() {
        return this.fundingSourcesLOV;
    }

    public final FundingSourcesApiModel copy(String str, List<SubTypeApiModel> list) {
        C41536l.m120489i(list, "fundingSourcesLOV");
        return new FundingSourcesApiModel(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingSourcesApiModel)) {
            return false;
        }
        FundingSourcesApiModel fundingSourcesApiModel = (FundingSourcesApiModel) obj;
        return C41536l.m120484d(this.fundingSourcesValue, fundingSourcesApiModel.fundingSourcesValue) && C41536l.m120484d(this.fundingSourcesLOV, fundingSourcesApiModel.fundingSourcesLOV);
    }

    public final List<SubTypeApiModel> getFundingSourcesLOV() {
        return this.fundingSourcesLOV;
    }

    public final String getFundingSourcesValue() {
        return this.fundingSourcesValue;
    }

    public int hashCode() {
        String str = this.fundingSourcesValue;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.fundingSourcesLOV.hashCode();
    }

    public String toString() {
        String str = this.fundingSourcesValue;
        List<SubTypeApiModel> list = this.fundingSourcesLOV;
        return "FundingSourcesApiModel(fundingSourcesValue=" + str + ", fundingSourcesLOV=" + list + ")";
    }
}
