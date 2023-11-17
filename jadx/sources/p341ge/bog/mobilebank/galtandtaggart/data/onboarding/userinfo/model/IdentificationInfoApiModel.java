package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.IdentificationInfoApiModel */
public final class IdentificationInfoApiModel {
    private final String citizenship;
    private final String value;

    public IdentificationInfoApiModel(String str, String str2) {
        this.citizenship = str;
        this.value = str2;
    }

    public static /* synthetic */ IdentificationInfoApiModel copy$default(IdentificationInfoApiModel identificationInfoApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identificationInfoApiModel.citizenship;
        }
        if ((i & 2) != 0) {
            str2 = identificationInfoApiModel.value;
        }
        return identificationInfoApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.citizenship;
    }

    public final String component2() {
        return this.value;
    }

    public final IdentificationInfoApiModel copy(String str, String str2) {
        return new IdentificationInfoApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentificationInfoApiModel)) {
            return false;
        }
        IdentificationInfoApiModel identificationInfoApiModel = (IdentificationInfoApiModel) obj;
        return C41536l.m120484d(this.citizenship, identificationInfoApiModel.citizenship) && C41536l.m120484d(this.value, identificationInfoApiModel.value);
    }

    public final String getCitizenship() {
        return this.citizenship;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.citizenship;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.citizenship;
        String str2 = this.value;
        return "IdentificationInfoApiModel(citizenship=" + str + ", value=" + str2 + ")";
    }
}
