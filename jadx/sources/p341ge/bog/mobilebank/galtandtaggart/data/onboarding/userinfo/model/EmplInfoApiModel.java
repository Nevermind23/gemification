package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.EmplInfoApiModel */
public final class EmplInfoApiModel {
    private final String company;
    private final String position;
    private final String status;

    public EmplInfoApiModel(String str, String str2, String str3) {
        this.company = str;
        this.position = str2;
        this.status = str3;
    }

    public static /* synthetic */ EmplInfoApiModel copy$default(EmplInfoApiModel emplInfoApiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emplInfoApiModel.company;
        }
        if ((i & 2) != 0) {
            str2 = emplInfoApiModel.position;
        }
        if ((i & 4) != 0) {
            str3 = emplInfoApiModel.status;
        }
        return emplInfoApiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.company;
    }

    public final String component2() {
        return this.position;
    }

    public final String component3() {
        return this.status;
    }

    public final EmplInfoApiModel copy(String str, String str2, String str3) {
        return new EmplInfoApiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmplInfoApiModel)) {
            return false;
        }
        EmplInfoApiModel emplInfoApiModel = (EmplInfoApiModel) obj;
        return C41536l.m120484d(this.company, emplInfoApiModel.company) && C41536l.m120484d(this.position, emplInfoApiModel.position) && C41536l.m120484d(this.status, emplInfoApiModel.status);
    }

    public final String getCompany() {
        return this.company;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.company;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.position;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.company;
        String str2 = this.position;
        String str3 = this.status;
        return "EmplInfoApiModel(company=" + str + ", position=" + str2 + ", status=" + str3 + ")";
    }
}
