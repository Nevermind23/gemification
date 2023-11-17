package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.AddressApiModel */
public final class AddressApiModel {
    private final String city;
    private final String country;
    private final String postalCode;
    private final String street1;
    private final String street2;

    public AddressApiModel(String str, String str2, String str3, String str4, String str5) {
        this.country = str;
        this.city = str2;
        this.postalCode = str3;
        this.street1 = str4;
        this.street2 = str5;
    }

    public static /* synthetic */ AddressApiModel copy$default(AddressApiModel addressApiModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressApiModel.country;
        }
        if ((i & 2) != 0) {
            str2 = addressApiModel.city;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = addressApiModel.postalCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = addressApiModel.street1;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = addressApiModel.street2;
        }
        return addressApiModel.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.country;
    }

    public final String component2() {
        return this.city;
    }

    public final String component3() {
        return this.postalCode;
    }

    public final String component4() {
        return this.street1;
    }

    public final String component5() {
        return this.street2;
    }

    public final AddressApiModel copy(String str, String str2, String str3, String str4, String str5) {
        return new AddressApiModel(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressApiModel)) {
            return false;
        }
        AddressApiModel addressApiModel = (AddressApiModel) obj;
        return C41536l.m120484d(this.country, addressApiModel.country) && C41536l.m120484d(this.city, addressApiModel.city) && C41536l.m120484d(this.postalCode, addressApiModel.postalCode) && C41536l.m120484d(this.street1, addressApiModel.street1) && C41536l.m120484d(this.street2, addressApiModel.street2);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getStreet1() {
        return this.street1;
    }

    public final String getStreet2() {
        return this.street2;
    }

    public int hashCode() {
        String str = this.country;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postalCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.street1;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.street2;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.country;
        String str2 = this.city;
        String str3 = this.postalCode;
        String str4 = this.street1;
        String str5 = this.street2;
        return "AddressApiModel(country=" + str + ", city=" + str2 + ", postalCode=" + str3 + ", street1=" + str4 + ", street2=" + str5 + ")";
    }
}
