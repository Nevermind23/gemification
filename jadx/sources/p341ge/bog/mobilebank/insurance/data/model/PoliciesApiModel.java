package p341ge.bog.mobilebank.insurance.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.data.model.PoliciesApiModel */
public final class PoliciesApiModel {
    private final List<PolicyApiModel> policiesTpl;
    private final List<TravelPolicyApiModel> policiesTri;

    public PoliciesApiModel(List<PolicyApiModel> list, List<TravelPolicyApiModel> list2) {
        C41536l.m120489i(list, "policiesTpl");
        C41536l.m120489i(list2, "policiesTri");
        this.policiesTpl = list;
        this.policiesTri = list2;
    }

    public static /* synthetic */ PoliciesApiModel copy$default(PoliciesApiModel policiesApiModel, List<PolicyApiModel> list, List<TravelPolicyApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = policiesApiModel.policiesTpl;
        }
        if ((i & 2) != 0) {
            list2 = policiesApiModel.policiesTri;
        }
        return policiesApiModel.copy(list, list2);
    }

    public final List<PolicyApiModel> component1() {
        return this.policiesTpl;
    }

    public final List<TravelPolicyApiModel> component2() {
        return this.policiesTri;
    }

    public final PoliciesApiModel copy(List<PolicyApiModel> list, List<TravelPolicyApiModel> list2) {
        C41536l.m120489i(list, "policiesTpl");
        C41536l.m120489i(list2, "policiesTri");
        return new PoliciesApiModel(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoliciesApiModel)) {
            return false;
        }
        PoliciesApiModel policiesApiModel = (PoliciesApiModel) obj;
        return C41536l.m120484d(this.policiesTpl, policiesApiModel.policiesTpl) && C41536l.m120484d(this.policiesTri, policiesApiModel.policiesTri);
    }

    public final List<PolicyApiModel> getPoliciesTpl() {
        return this.policiesTpl;
    }

    public final List<TravelPolicyApiModel> getPoliciesTri() {
        return this.policiesTri;
    }

    public int hashCode() {
        return (this.policiesTpl.hashCode() * 31) + this.policiesTri.hashCode();
    }

    public String toString() {
        List<PolicyApiModel> list = this.policiesTpl;
        List<TravelPolicyApiModel> list2 = this.policiesTri;
        return "PoliciesApiModel(policiesTpl=" + list + ", policiesTri=" + list2 + ")";
    }
}
