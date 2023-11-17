package p341ge.bog.mobilebank.loanoffers.data.entity.securedloans;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.loanoffers.data.entity.securedloans.ExternalLoanPropertyEntity */
public final class ExternalLoanPropertyEntity {
    private final String address;
    private final String cadastralCode;
    private final String countryId;
    private final String countryName;
    private final String firstName;

    /* renamed from: id */
    private final long f80140id;
    private final String lastName;
    private final String name;
    private final String organizationName;
    private final String ownerType;
    private final String privateNumber;
    private final long propertyId;
    private final String taxId;
    private final Long updateDate;

    public ExternalLoanPropertyEntity(long j, long j2, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        String str12 = str6;
        String str13 = str10;
        String str14 = str11;
        C41536l.m120489i(str, "cadastralCode");
        C41536l.m120489i(str12, "address");
        C41536l.m120489i(str13, "firstName");
        C41536l.m120489i(str14, "lastName");
        this.f80140id = j;
        this.propertyId = j2;
        this.cadastralCode = str;
        this.privateNumber = str2;
        this.name = str3;
        this.ownerType = str4;
        this.updateDate = l;
        this.organizationName = str5;
        this.address = str12;
        this.taxId = str7;
        this.countryId = str8;
        this.countryName = str9;
        this.firstName = str13;
        this.lastName = str14;
    }

    public static /* synthetic */ ExternalLoanPropertyEntity copy$default(ExternalLoanPropertyEntity externalLoanPropertyEntity, long j, long j2, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        ExternalLoanPropertyEntity externalLoanPropertyEntity2 = externalLoanPropertyEntity;
        int i2 = i;
        return externalLoanPropertyEntity.copy((i2 & 1) != 0 ? externalLoanPropertyEntity2.f80140id : j, (i2 & 2) != 0 ? externalLoanPropertyEntity2.propertyId : j2, (i2 & 4) != 0 ? externalLoanPropertyEntity2.cadastralCode : str, (i2 & 8) != 0 ? externalLoanPropertyEntity2.privateNumber : str2, (i2 & 16) != 0 ? externalLoanPropertyEntity2.name : str3, (i2 & 32) != 0 ? externalLoanPropertyEntity2.ownerType : str4, (i2 & 64) != 0 ? externalLoanPropertyEntity2.updateDate : l, (i2 & 128) != 0 ? externalLoanPropertyEntity2.organizationName : str5, (i2 & C11398b.f33139r) != 0 ? externalLoanPropertyEntity2.address : str6, (i2 & C11398b.f33140s) != 0 ? externalLoanPropertyEntity2.taxId : str7, (i2 & C11398b.f33141t) != 0 ? externalLoanPropertyEntity2.countryId : str8, (i2 & C11398b.f33142u) != 0 ? externalLoanPropertyEntity2.countryName : str9, (i2 & C11398b.f33143v) != 0 ? externalLoanPropertyEntity2.firstName : str10, (i2 & 8192) != 0 ? externalLoanPropertyEntity2.lastName : str11);
    }

    public final long component1() {
        return this.f80140id;
    }

    public final String component10() {
        return this.taxId;
    }

    public final String component11() {
        return this.countryId;
    }

    public final String component12() {
        return this.countryName;
    }

    public final String component13() {
        return this.firstName;
    }

    public final String component14() {
        return this.lastName;
    }

    public final long component2() {
        return this.propertyId;
    }

    public final String component3() {
        return this.cadastralCode;
    }

    public final String component4() {
        return this.privateNumber;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.ownerType;
    }

    public final Long component7() {
        return this.updateDate;
    }

    public final String component8() {
        return this.organizationName;
    }

    public final String component9() {
        return this.address;
    }

    public final ExternalLoanPropertyEntity copy(long j, long j2, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        long j3 = j;
        C41536l.m120489i(str, "cadastralCode");
        C41536l.m120489i(str6, "address");
        C41536l.m120489i(str10, "firstName");
        C41536l.m120489i(str11, "lastName");
        return new ExternalLoanPropertyEntity(j, j2, str, str2, str3, str4, l, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalLoanPropertyEntity)) {
            return false;
        }
        ExternalLoanPropertyEntity externalLoanPropertyEntity = (ExternalLoanPropertyEntity) obj;
        return this.f80140id == externalLoanPropertyEntity.f80140id && this.propertyId == externalLoanPropertyEntity.propertyId && C41536l.m120484d(this.cadastralCode, externalLoanPropertyEntity.cadastralCode) && C41536l.m120484d(this.privateNumber, externalLoanPropertyEntity.privateNumber) && C41536l.m120484d(this.name, externalLoanPropertyEntity.name) && C41536l.m120484d(this.ownerType, externalLoanPropertyEntity.ownerType) && C41536l.m120484d(this.updateDate, externalLoanPropertyEntity.updateDate) && C41536l.m120484d(this.organizationName, externalLoanPropertyEntity.organizationName) && C41536l.m120484d(this.address, externalLoanPropertyEntity.address) && C41536l.m120484d(this.taxId, externalLoanPropertyEntity.taxId) && C41536l.m120484d(this.countryId, externalLoanPropertyEntity.countryId) && C41536l.m120484d(this.countryName, externalLoanPropertyEntity.countryName) && C41536l.m120484d(this.firstName, externalLoanPropertyEntity.firstName) && C41536l.m120484d(this.lastName, externalLoanPropertyEntity.lastName);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCadastralCode() {
        return this.cadastralCode;
    }

    public final String getCountryId() {
        return this.countryId;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final long getId() {
        return this.f80140id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrganizationName() {
        return this.organizationName;
    }

    public final String getOwnerType() {
        return this.ownerType;
    }

    public final String getPrivateNumber() {
        return this.privateNumber;
    }

    public final long getPropertyId() {
        return this.propertyId;
    }

    public final String getTaxId() {
        return this.taxId;
    }

    public final Long getUpdateDate() {
        return this.updateDate;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f80140id) * 31) + C7397t.m28148a(this.propertyId)) * 31) + this.cadastralCode.hashCode()) * 31;
        String str = this.privateNumber;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownerType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.updateDate;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.organizationName;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.address.hashCode()) * 31;
        String str5 = this.taxId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.countryId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.countryName;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((((hashCode7 + i) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode();
    }

    public String toString() {
        long j = this.f80140id;
        long j2 = this.propertyId;
        String str = this.cadastralCode;
        String str2 = this.privateNumber;
        String str3 = this.name;
        String str4 = this.ownerType;
        Long l = this.updateDate;
        String str5 = this.organizationName;
        String str6 = this.address;
        String str7 = this.taxId;
        String str8 = this.countryId;
        String str9 = this.countryName;
        String str10 = this.firstName;
        String str11 = this.lastName;
        return "ExternalLoanPropertyEntity(id=" + j + ", propertyId=" + j2 + ", cadastralCode=" + str + ", privateNumber=" + str2 + ", name=" + str3 + ", ownerType=" + str4 + ", updateDate=" + l + ", organizationName=" + str5 + ", address=" + str6 + ", taxId=" + str7 + ", countryId=" + str8 + ", countryName=" + str9 + ", firstName=" + str10 + ", lastName=" + str11 + ")";
    }
}
