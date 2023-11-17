package p341ge.bog.mobilebank.consumerloanapplication.data.lookup.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.lookup.entity.OrganizationEntity */
public final class OrganizationEntity {
    private final String abbreviation;
    private final String abbreviationEn;
    private final String address;
    private final String addressEn;
    private final String customerName;
    private final String customerNameEn;

    /* renamed from: id */
    private final Long f59636id;
    private final String statId;
    private final String taxId;

    public OrganizationEntity(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f59636id = l;
        this.statId = str;
        this.taxId = str2;
        this.abbreviation = str3;
        this.abbreviationEn = str4;
        this.customerName = str5;
        this.customerNameEn = str6;
        this.address = str7;
        this.addressEn = str8;
    }

    public static /* synthetic */ OrganizationEntity copy$default(OrganizationEntity organizationEntity, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        OrganizationEntity organizationEntity2 = organizationEntity;
        int i2 = i;
        return organizationEntity.copy((i2 & 1) != 0 ? organizationEntity2.f59636id : l, (i2 & 2) != 0 ? organizationEntity2.statId : str, (i2 & 4) != 0 ? organizationEntity2.taxId : str2, (i2 & 8) != 0 ? organizationEntity2.abbreviation : str3, (i2 & 16) != 0 ? organizationEntity2.abbreviationEn : str4, (i2 & 32) != 0 ? organizationEntity2.customerName : str5, (i2 & 64) != 0 ? organizationEntity2.customerNameEn : str6, (i2 & 128) != 0 ? organizationEntity2.address : str7, (i2 & C11398b.f33139r) != 0 ? organizationEntity2.addressEn : str8);
    }

    public final Long component1() {
        return this.f59636id;
    }

    public final String component2() {
        return this.statId;
    }

    public final String component3() {
        return this.taxId;
    }

    public final String component4() {
        return this.abbreviation;
    }

    public final String component5() {
        return this.abbreviationEn;
    }

    public final String component6() {
        return this.customerName;
    }

    public final String component7() {
        return this.customerNameEn;
    }

    public final String component8() {
        return this.address;
    }

    public final String component9() {
        return this.addressEn;
    }

    public final OrganizationEntity copy(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new OrganizationEntity(l, str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationEntity)) {
            return false;
        }
        OrganizationEntity organizationEntity = (OrganizationEntity) obj;
        return C41536l.m120484d(this.f59636id, organizationEntity.f59636id) && C41536l.m120484d(this.statId, organizationEntity.statId) && C41536l.m120484d(this.taxId, organizationEntity.taxId) && C41536l.m120484d(this.abbreviation, organizationEntity.abbreviation) && C41536l.m120484d(this.abbreviationEn, organizationEntity.abbreviationEn) && C41536l.m120484d(this.customerName, organizationEntity.customerName) && C41536l.m120484d(this.customerNameEn, organizationEntity.customerNameEn) && C41536l.m120484d(this.address, organizationEntity.address) && C41536l.m120484d(this.addressEn, organizationEntity.addressEn);
    }

    public final String getAbbreviation() {
        return this.abbreviation;
    }

    public final String getAbbreviationEn() {
        return this.abbreviationEn;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAddressEn() {
        return this.addressEn;
    }

    public final String getCustomerName() {
        return this.customerName;
    }

    public final String getCustomerNameEn() {
        return this.customerNameEn;
    }

    public final Long getId() {
        return this.f59636id;
    }

    public final String getStatId() {
        return this.statId;
    }

    public final String getTaxId() {
        return this.taxId;
    }

    public int hashCode() {
        Long l = this.f59636id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.statId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taxId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.abbreviation;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.abbreviationEn;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.customerName;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.customerNameEn;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.address;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressEn;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        Long l = this.f59636id;
        String str = this.statId;
        String str2 = this.taxId;
        String str3 = this.abbreviation;
        String str4 = this.abbreviationEn;
        String str5 = this.customerName;
        String str6 = this.customerNameEn;
        String str7 = this.address;
        String str8 = this.addressEn;
        return "OrganizationEntity(id=" + l + ", statId=" + str + ", taxId=" + str2 + ", abbreviation=" + str3 + ", abbreviationEn=" + str4 + ", customerName=" + str5 + ", customerNameEn=" + str6 + ", address=" + str7 + ", addressEn=" + str8 + ")";
    }
}
