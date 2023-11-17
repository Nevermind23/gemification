package p341ge.bog.mobilebank.cleanarch.contactus.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.contactus.data.model.SoloBankerInfoApiEntity */
public final class SoloBankerInfoApiEntity {
    private final String address;
    private final String addressEn;
    private final String bankerContactKey;
    private final String bankerContactValue;
    private final String bankerSloganKey;
    private final String bankerSloganValue;
    private final String bankerTitleKey;
    private final String bankerTitleValue;
    private final String bankerType;
    private final String email;
    private final String facsimileId;
    private final String firstName;
    private final String firstNameEn;
    private final String lastName;
    private final String lastNameEn;
    private final String phone;
    private final String userName;
    private final String userPhoto;
    private final String workPhone;

    public SoloBankerInfoApiEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        this.userName = str;
        this.lastName = str2;
        this.firstName = str3;
        this.lastNameEn = str4;
        this.firstNameEn = str5;
        this.address = str6;
        this.addressEn = str7;
        this.phone = str8;
        this.workPhone = str9;
        this.email = str10;
        this.facsimileId = str11;
        this.userPhoto = str12;
        this.bankerType = str13;
        this.bankerContactKey = str14;
        this.bankerContactValue = str15;
        this.bankerSloganKey = str16;
        this.bankerSloganValue = str17;
        this.bankerTitleKey = str18;
        this.bankerTitleValue = str19;
    }

    public static /* synthetic */ SoloBankerInfoApiEntity copy$default(SoloBankerInfoApiEntity soloBankerInfoApiEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, Object obj) {
        SoloBankerInfoApiEntity soloBankerInfoApiEntity2 = soloBankerInfoApiEntity;
        int i2 = i;
        return soloBankerInfoApiEntity.copy((i2 & 1) != 0 ? soloBankerInfoApiEntity2.userName : str, (i2 & 2) != 0 ? soloBankerInfoApiEntity2.lastName : str2, (i2 & 4) != 0 ? soloBankerInfoApiEntity2.firstName : str3, (i2 & 8) != 0 ? soloBankerInfoApiEntity2.lastNameEn : str4, (i2 & 16) != 0 ? soloBankerInfoApiEntity2.firstNameEn : str5, (i2 & 32) != 0 ? soloBankerInfoApiEntity2.address : str6, (i2 & 64) != 0 ? soloBankerInfoApiEntity2.addressEn : str7, (i2 & 128) != 0 ? soloBankerInfoApiEntity2.phone : str8, (i2 & C11398b.f33139r) != 0 ? soloBankerInfoApiEntity2.workPhone : str9, (i2 & C11398b.f33140s) != 0 ? soloBankerInfoApiEntity2.email : str10, (i2 & C11398b.f33141t) != 0 ? soloBankerInfoApiEntity2.facsimileId : str11, (i2 & C11398b.f33142u) != 0 ? soloBankerInfoApiEntity2.userPhoto : str12, (i2 & C11398b.f33143v) != 0 ? soloBankerInfoApiEntity2.bankerType : str13, (i2 & 8192) != 0 ? soloBankerInfoApiEntity2.bankerContactKey : str14, (i2 & 16384) != 0 ? soloBankerInfoApiEntity2.bankerContactValue : str15, (i2 & 32768) != 0 ? soloBankerInfoApiEntity2.bankerSloganKey : str16, (i2 & 65536) != 0 ? soloBankerInfoApiEntity2.bankerSloganValue : str17, (i2 & 131072) != 0 ? soloBankerInfoApiEntity2.bankerTitleKey : str18, (i2 & 262144) != 0 ? soloBankerInfoApiEntity2.bankerTitleValue : str19);
    }

    public final String component1() {
        return this.userName;
    }

    public final String component10() {
        return this.email;
    }

    public final String component11() {
        return this.facsimileId;
    }

    public final String component12() {
        return this.userPhoto;
    }

    public final String component13() {
        return this.bankerType;
    }

    public final String component14() {
        return this.bankerContactKey;
    }

    public final String component15() {
        return this.bankerContactValue;
    }

    public final String component16() {
        return this.bankerSloganKey;
    }

    public final String component17() {
        return this.bankerSloganValue;
    }

    public final String component18() {
        return this.bankerTitleKey;
    }

    public final String component19() {
        return this.bankerTitleValue;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastNameEn;
    }

    public final String component5() {
        return this.firstNameEn;
    }

    public final String component6() {
        return this.address;
    }

    public final String component7() {
        return this.addressEn;
    }

    public final String component8() {
        return this.phone;
    }

    public final String component9() {
        return this.workPhone;
    }

    public final SoloBankerInfoApiEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        return new SoloBankerInfoApiEntity(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoloBankerInfoApiEntity)) {
            return false;
        }
        SoloBankerInfoApiEntity soloBankerInfoApiEntity = (SoloBankerInfoApiEntity) obj;
        return C41536l.m120484d(this.userName, soloBankerInfoApiEntity.userName) && C41536l.m120484d(this.lastName, soloBankerInfoApiEntity.lastName) && C41536l.m120484d(this.firstName, soloBankerInfoApiEntity.firstName) && C41536l.m120484d(this.lastNameEn, soloBankerInfoApiEntity.lastNameEn) && C41536l.m120484d(this.firstNameEn, soloBankerInfoApiEntity.firstNameEn) && C41536l.m120484d(this.address, soloBankerInfoApiEntity.address) && C41536l.m120484d(this.addressEn, soloBankerInfoApiEntity.addressEn) && C41536l.m120484d(this.phone, soloBankerInfoApiEntity.phone) && C41536l.m120484d(this.workPhone, soloBankerInfoApiEntity.workPhone) && C41536l.m120484d(this.email, soloBankerInfoApiEntity.email) && C41536l.m120484d(this.facsimileId, soloBankerInfoApiEntity.facsimileId) && C41536l.m120484d(this.userPhoto, soloBankerInfoApiEntity.userPhoto) && C41536l.m120484d(this.bankerType, soloBankerInfoApiEntity.bankerType) && C41536l.m120484d(this.bankerContactKey, soloBankerInfoApiEntity.bankerContactKey) && C41536l.m120484d(this.bankerContactValue, soloBankerInfoApiEntity.bankerContactValue) && C41536l.m120484d(this.bankerSloganKey, soloBankerInfoApiEntity.bankerSloganKey) && C41536l.m120484d(this.bankerSloganValue, soloBankerInfoApiEntity.bankerSloganValue) && C41536l.m120484d(this.bankerTitleKey, soloBankerInfoApiEntity.bankerTitleKey) && C41536l.m120484d(this.bankerTitleValue, soloBankerInfoApiEntity.bankerTitleValue);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAddressEn() {
        return this.addressEn;
    }

    public final String getBankerContactKey() {
        return this.bankerContactKey;
    }

    public final String getBankerContactValue() {
        return this.bankerContactValue;
    }

    public final String getBankerSloganKey() {
        return this.bankerSloganKey;
    }

    public final String getBankerSloganValue() {
        return this.bankerSloganValue;
    }

    public final String getBankerTitleKey() {
        return this.bankerTitleKey;
    }

    public final String getBankerTitleValue() {
        return this.bankerTitleValue;
    }

    public final String getBankerType() {
        return this.bankerType;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFacsimileId() {
        return this.facsimileId;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFirstNameEn() {
        return this.firstNameEn;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLastNameEn() {
        return this.lastNameEn;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserPhoto() {
        return this.userPhoto;
    }

    public final String getWorkPhone() {
        return this.workPhone;
    }

    public int hashCode() {
        String str = this.userName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastNameEn;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstNameEn;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.address;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressEn;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.phone;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.workPhone;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.email;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.facsimileId;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.userPhoto;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.bankerType;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.bankerContactKey;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.bankerContactValue;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.bankerSloganKey;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.bankerSloganValue;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.bankerTitleKey;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.bankerTitleValue;
        if (str19 != null) {
            i = str19.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        String str = this.userName;
        String str2 = this.lastName;
        String str3 = this.firstName;
        String str4 = this.lastNameEn;
        String str5 = this.firstNameEn;
        String str6 = this.address;
        String str7 = this.addressEn;
        String str8 = this.phone;
        String str9 = this.workPhone;
        String str10 = this.email;
        String str11 = this.facsimileId;
        String str12 = this.userPhoto;
        String str13 = this.bankerType;
        String str14 = this.bankerContactKey;
        String str15 = this.bankerContactValue;
        String str16 = this.bankerSloganKey;
        String str17 = this.bankerSloganValue;
        String str18 = this.bankerTitleKey;
        String str19 = this.bankerTitleValue;
        return "SoloBankerInfoApiEntity(userName=" + str + ", lastName=" + str2 + ", firstName=" + str3 + ", lastNameEn=" + str4 + ", firstNameEn=" + str5 + ", address=" + str6 + ", addressEn=" + str7 + ", phone=" + str8 + ", workPhone=" + str9 + ", email=" + str10 + ", facsimileId=" + str11 + ", userPhoto=" + str12 + ", bankerType=" + str13 + ", bankerContactKey=" + str14 + ", bankerContactValue=" + str15 + ", bankerSloganKey=" + str16 + ", bankerSloganValue=" + str17 + ", bankerTitleKey=" + str18 + ", bankerTitleValue=" + str19 + ")";
    }
}
