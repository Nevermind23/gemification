package p341ge.bog.mobilebank.insurance.travelinsurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.data.model.PolicyUrlApiModel */
public final class PolicyUrlApiModel {
    private final String policyUrl;

    public PolicyUrlApiModel(String str) {
        this.policyUrl = str;
    }

    public static /* synthetic */ PolicyUrlApiModel copy$default(PolicyUrlApiModel policyUrlApiModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = policyUrlApiModel.policyUrl;
        }
        return policyUrlApiModel.copy(str);
    }

    public final String component1() {
        return this.policyUrl;
    }

    public final PolicyUrlApiModel copy(String str) {
        return new PolicyUrlApiModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PolicyUrlApiModel) && C41536l.m120484d(this.policyUrl, ((PolicyUrlApiModel) obj).policyUrl);
    }

    public final String getPolicyUrl() {
        return this.policyUrl;
    }

    public int hashCode() {
        String str = this.policyUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.policyUrl;
        return "PolicyUrlApiModel(policyUrl=" + str + ")";
    }
}
