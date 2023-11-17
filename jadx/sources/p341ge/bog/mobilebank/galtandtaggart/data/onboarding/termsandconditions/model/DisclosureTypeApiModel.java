package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.termsandconditions.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.termsandconditions.model.DisclosureTypeApiModel */
public final class DisclosureTypeApiModel {
    private final String link;
    private final String name;
    private final String type;

    public DisclosureTypeApiModel(String str, String str2, String str3) {
        C41536l.m120489i(str, "type");
        C41536l.m120489i(str2, "name");
        C41536l.m120489i(str3, "link");
        this.type = str;
        this.name = str2;
        this.link = str3;
    }

    public static /* synthetic */ DisclosureTypeApiModel copy$default(DisclosureTypeApiModel disclosureTypeApiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disclosureTypeApiModel.type;
        }
        if ((i & 2) != 0) {
            str2 = disclosureTypeApiModel.name;
        }
        if ((i & 4) != 0) {
            str3 = disclosureTypeApiModel.link;
        }
        return disclosureTypeApiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.link;
    }

    public final DisclosureTypeApiModel copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "type");
        C41536l.m120489i(str2, "name");
        C41536l.m120489i(str3, "link");
        return new DisclosureTypeApiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclosureTypeApiModel)) {
            return false;
        }
        DisclosureTypeApiModel disclosureTypeApiModel = (DisclosureTypeApiModel) obj;
        return C41536l.m120484d(this.type, disclosureTypeApiModel.type) && C41536l.m120484d(this.name, disclosureTypeApiModel.name) && C41536l.m120484d(this.link, disclosureTypeApiModel.link);
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + this.link.hashCode();
    }

    public String toString() {
        String str = this.type;
        String str2 = this.name;
        String str3 = this.link;
        return "DisclosureTypeApiModel(type=" + str + ", name=" + str2 + ", link=" + str3 + ")";
    }
}
