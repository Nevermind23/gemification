package p341ge.bog.mobilebank.autoliabilityinsurance.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.data.model.PoliciesApiModel */
public final class PoliciesApiModel {
    private final List<PolicyApiModel> policiesTpl;

    public PoliciesApiModel(List<PolicyApiModel> list) {
        C41536l.m120489i(list, "policiesTpl");
        this.policiesTpl = list;
    }

    public static /* synthetic */ PoliciesApiModel copy$default(PoliciesApiModel policiesApiModel, List<PolicyApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = policiesApiModel.policiesTpl;
        }
        return policiesApiModel.copy(list);
    }

    public final List<PolicyApiModel> component1() {
        return this.policiesTpl;
    }

    public final PoliciesApiModel copy(List<PolicyApiModel> list) {
        C41536l.m120489i(list, "policiesTpl");
        return new PoliciesApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoliciesApiModel) && C41536l.m120484d(this.policiesTpl, ((PoliciesApiModel) obj).policiesTpl);
    }

    public final List<PolicyApiModel> getPoliciesTpl() {
        return this.policiesTpl;
    }

    public int hashCode() {
        return this.policiesTpl.hashCode();
    }

    public String toString() {
        List<PolicyApiModel> list = this.policiesTpl;
        return "PoliciesApiModel(policiesTpl=" + list + ")";
    }
}
