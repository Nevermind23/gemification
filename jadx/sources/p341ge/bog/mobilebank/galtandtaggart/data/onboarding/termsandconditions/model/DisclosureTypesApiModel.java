package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.termsandconditions.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.termsandconditions.model.DisclosureTypesApiModel */
public final class DisclosureTypesApiModel {
    private final String commissionsDisclosure;
    private final List<DisclosureTypeApiModel> types;

    public DisclosureTypesApiModel(List<DisclosureTypeApiModel> list, String str) {
        C41536l.m120489i(list, "types");
        C41536l.m120489i(str, "commissionsDisclosure");
        this.types = list;
        this.commissionsDisclosure = str;
    }

    public static /* synthetic */ DisclosureTypesApiModel copy$default(DisclosureTypesApiModel disclosureTypesApiModel, List<DisclosureTypeApiModel> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = disclosureTypesApiModel.types;
        }
        if ((i & 2) != 0) {
            str = disclosureTypesApiModel.commissionsDisclosure;
        }
        return disclosureTypesApiModel.copy(list, str);
    }

    public final List<DisclosureTypeApiModel> component1() {
        return this.types;
    }

    public final String component2() {
        return this.commissionsDisclosure;
    }

    public final DisclosureTypesApiModel copy(List<DisclosureTypeApiModel> list, String str) {
        C41536l.m120489i(list, "types");
        C41536l.m120489i(str, "commissionsDisclosure");
        return new DisclosureTypesApiModel(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclosureTypesApiModel)) {
            return false;
        }
        DisclosureTypesApiModel disclosureTypesApiModel = (DisclosureTypesApiModel) obj;
        return C41536l.m120484d(this.types, disclosureTypesApiModel.types) && C41536l.m120484d(this.commissionsDisclosure, disclosureTypesApiModel.commissionsDisclosure);
    }

    public final String getCommissionsDisclosure() {
        return this.commissionsDisclosure;
    }

    public final List<DisclosureTypeApiModel> getTypes() {
        return this.types;
    }

    public int hashCode() {
        return (this.types.hashCode() * 31) + this.commissionsDisclosure.hashCode();
    }

    public String toString() {
        List<DisclosureTypeApiModel> list = this.types;
        String str = this.commissionsDisclosure;
        return "DisclosureTypesApiModel(types=" + list + ", commissionsDisclosure=" + str + ")";
    }
}
