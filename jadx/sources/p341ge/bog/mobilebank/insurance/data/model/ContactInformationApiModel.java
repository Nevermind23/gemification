package p341ge.bog.mobilebank.insurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.data.model.ContactInformationApiModel */
public final class ContactInformationApiModel {
    private final String contactId;
    private final String contactIdDescription_EN;
    private final String contactIdDescription_GE;
    private final String contactUsage;
    private final String route;

    public ContactInformationApiModel(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str4, "contactUsage");
        C41536l.m120489i(str5, "route");
        this.contactId = str;
        this.contactIdDescription_EN = str2;
        this.contactIdDescription_GE = str3;
        this.contactUsage = str4;
        this.route = str5;
    }

    public static /* synthetic */ ContactInformationApiModel copy$default(ContactInformationApiModel contactInformationApiModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactInformationApiModel.contactId;
        }
        if ((i & 2) != 0) {
            str2 = contactInformationApiModel.contactIdDescription_EN;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = contactInformationApiModel.contactIdDescription_GE;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = contactInformationApiModel.contactUsage;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = contactInformationApiModel.route;
        }
        return contactInformationApiModel.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.contactId;
    }

    public final String component2() {
        return this.contactIdDescription_EN;
    }

    public final String component3() {
        return this.contactIdDescription_GE;
    }

    public final String component4() {
        return this.contactUsage;
    }

    public final String component5() {
        return this.route;
    }

    public final ContactInformationApiModel copy(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str4, "contactUsage");
        C41536l.m120489i(str5, "route");
        return new ContactInformationApiModel(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInformationApiModel)) {
            return false;
        }
        ContactInformationApiModel contactInformationApiModel = (ContactInformationApiModel) obj;
        return C41536l.m120484d(this.contactId, contactInformationApiModel.contactId) && C41536l.m120484d(this.contactIdDescription_EN, contactInformationApiModel.contactIdDescription_EN) && C41536l.m120484d(this.contactIdDescription_GE, contactInformationApiModel.contactIdDescription_GE) && C41536l.m120484d(this.contactUsage, contactInformationApiModel.contactUsage) && C41536l.m120484d(this.route, contactInformationApiModel.route);
    }

    public final String getContactId() {
        return this.contactId;
    }

    public final String getContactIdDescription_EN() {
        return this.contactIdDescription_EN;
    }

    public final String getContactIdDescription_GE() {
        return this.contactIdDescription_GE;
    }

    public final String getContactUsage() {
        return this.contactUsage;
    }

    public final String getRoute() {
        return this.route;
    }

    public int hashCode() {
        int hashCode = this.contactId.hashCode() * 31;
        String str = this.contactIdDescription_EN;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contactIdDescription_GE;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + this.contactUsage.hashCode()) * 31) + this.route.hashCode();
    }

    public String toString() {
        String str = this.contactId;
        String str2 = this.contactIdDescription_EN;
        String str3 = this.contactIdDescription_GE;
        String str4 = this.contactUsage;
        String str5 = this.route;
        return "ContactInformationApiModel(contactId=" + str + ", contactIdDescription_EN=" + str2 + ", contactIdDescription_GE=" + str3 + ", contactUsage=" + str4 + ", route=" + str5 + ")";
    }
}
