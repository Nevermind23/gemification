package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.SubTypeApiModel */
public final class SubTypeApiModel {

    /* renamed from: id */
    private final String f61136id;
    private final boolean isDefault;
    private final String name;

    public SubTypeApiModel(String str, String str2, boolean z) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "name");
        this.f61136id = str;
        this.name = str2;
        this.isDefault = z;
    }

    public static /* synthetic */ SubTypeApiModel copy$default(SubTypeApiModel subTypeApiModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subTypeApiModel.f61136id;
        }
        if ((i & 2) != 0) {
            str2 = subTypeApiModel.name;
        }
        if ((i & 4) != 0) {
            z = subTypeApiModel.isDefault;
        }
        return subTypeApiModel.copy(str, str2, z);
    }

    public final String component1() {
        return this.f61136id;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.isDefault;
    }

    public final SubTypeApiModel copy(String str, String str2, boolean z) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "name");
        return new SubTypeApiModel(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubTypeApiModel)) {
            return false;
        }
        SubTypeApiModel subTypeApiModel = (SubTypeApiModel) obj;
        return C41536l.m120484d(this.f61136id, subTypeApiModel.f61136id) && C41536l.m120484d(this.name, subTypeApiModel.name) && this.isDefault == subTypeApiModel.isDefault;
    }

    public final String getId() {
        return this.f61136id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = ((this.f61136id.hashCode() * 31) + this.name.hashCode()) * 31;
        boolean z = this.isDefault;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        String str = this.f61136id;
        String str2 = this.name;
        boolean z = this.isDefault;
        return "SubTypeApiModel(id=" + str + ", name=" + str2 + ", isDefault=" + z + ")";
    }
}
