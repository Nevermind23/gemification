package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.BasicInfoApiModel */
public final class BasicInfoApiModel {
    private final String emailAddress;
    private final String firstName;
    private final String lastName;
    private final String phone;

    public BasicInfoApiModel(String str, String str2, String str3, String str4) {
        this.firstName = str;
        this.lastName = str2;
        this.phone = str3;
        this.emailAddress = str4;
    }

    public static /* synthetic */ BasicInfoApiModel copy$default(BasicInfoApiModel basicInfoApiModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basicInfoApiModel.firstName;
        }
        if ((i & 2) != 0) {
            str2 = basicInfoApiModel.lastName;
        }
        if ((i & 4) != 0) {
            str3 = basicInfoApiModel.phone;
        }
        if ((i & 8) != 0) {
            str4 = basicInfoApiModel.emailAddress;
        }
        return basicInfoApiModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.phone;
    }

    public final String component4() {
        return this.emailAddress;
    }

    public final BasicInfoApiModel copy(String str, String str2, String str3, String str4) {
        return new BasicInfoApiModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicInfoApiModel)) {
            return false;
        }
        BasicInfoApiModel basicInfoApiModel = (BasicInfoApiModel) obj;
        return C41536l.m120484d(this.firstName, basicInfoApiModel.firstName) && C41536l.m120484d(this.lastName, basicInfoApiModel.lastName) && C41536l.m120484d(this.phone, basicInfoApiModel.phone) && C41536l.m120484d(this.emailAddress, basicInfoApiModel.emailAddress);
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        String str = this.firstName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.emailAddress;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.phone;
        String str4 = this.emailAddress;
        return "BasicInfoApiModel(firstName=" + str + ", lastName=" + str2 + ", phone=" + str3 + ", emailAddress=" + str4 + ")";
    }
}
