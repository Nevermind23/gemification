package p341ge.bog.mobilebank.googlepay.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.googlepay.data.entity.UserAddressEntity */
public final class UserAddressEntity {
    private final String address1;
    private final String administrativeArea;
    private final String countryCode;
    private final String locality;
    private final String name;
    private final String phoneNumber;
    private final String postalCode;

    public UserAddressEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.address1 = str;
        this.administrativeArea = str2;
        this.countryCode = str3;
        this.locality = str4;
        this.name = str5;
        this.phoneNumber = str6;
        this.postalCode = str7;
    }

    public static /* synthetic */ UserAddressEntity copy$default(UserAddressEntity userAddressEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userAddressEntity.address1;
        }
        if ((i & 2) != 0) {
            str2 = userAddressEntity.administrativeArea;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = userAddressEntity.countryCode;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = userAddressEntity.locality;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = userAddressEntity.name;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = userAddressEntity.phoneNumber;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = userAddressEntity.postalCode;
        }
        return userAddressEntity.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.address1;
    }

    public final String component2() {
        return this.administrativeArea;
    }

    public final String component3() {
        return this.countryCode;
    }

    public final String component4() {
        return this.locality;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.phoneNumber;
    }

    public final String component7() {
        return this.postalCode;
    }

    public final UserAddressEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new UserAddressEntity(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAddressEntity)) {
            return false;
        }
        UserAddressEntity userAddressEntity = (UserAddressEntity) obj;
        return C41536l.m120484d(this.address1, userAddressEntity.address1) && C41536l.m120484d(this.administrativeArea, userAddressEntity.administrativeArea) && C41536l.m120484d(this.countryCode, userAddressEntity.countryCode) && C41536l.m120484d(this.locality, userAddressEntity.locality) && C41536l.m120484d(this.name, userAddressEntity.name) && C41536l.m120484d(this.phoneNumber, userAddressEntity.phoneNumber) && C41536l.m120484d(this.postalCode, userAddressEntity.postalCode);
    }

    public final String getAddress1() {
        return this.address1;
    }

    public final String getAdministrativeArea() {
        return this.administrativeArea;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public int hashCode() {
        String str = this.address1;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.administrativeArea;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.locality;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phoneNumber;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.postalCode;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.address1;
        String str2 = this.administrativeArea;
        String str3 = this.countryCode;
        String str4 = this.locality;
        String str5 = this.name;
        String str6 = this.phoneNumber;
        String str7 = this.postalCode;
        return "UserAddressEntity(address1=" + str + ", administrativeArea=" + str2 + ", countryCode=" + str3 + ", locality=" + str4 + ", name=" + str5 + ", phoneNumber=" + str6 + ", postalCode=" + str7 + ")";
    }
}
