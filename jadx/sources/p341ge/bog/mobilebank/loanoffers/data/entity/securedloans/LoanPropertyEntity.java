package p341ge.bog.mobilebank.loanoffers.data.entity.securedloans;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.storage.p385db.C11767h;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.loanoffers.data.entity.securedloans.LoanPropertyEntity */
public final class LoanPropertyEntity {
    private final String address;
    private final String cadastralCode;
    private final String dictionaryKey;
    private final String dictionaryValue;

    /* renamed from: id */
    private final long f80141id;
    private final String latitude;
    private final String longitude;
    private final String parcelFunction;
    private final long propertyArea;
    private final String propertyType;
    private final long reference;
    private final String registrationNumber;
    private final String sectorName;
    private final long updateDate;
    private final String zone;
    private final String zoneName;

    public LoanPropertyEntity(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j3, String str8, String str9, String str10, long j4, String str11, String str12) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        C41536l.m120489i(str13, "cadastralCode");
        C41536l.m120489i(str14, "propertyType");
        C41536l.m120489i(str15, "registrationNumber");
        C41536l.m120489i(str16, "parcelFunction");
        C41536l.m120489i(str17, "address");
        C41536l.m120489i(str18, C11767h.C11768a.f34132b);
        C41536l.m120489i(str19, C11767h.C11768a.f34133c);
        C41536l.m120489i(str20, "zone");
        C41536l.m120489i(str21, "zoneName");
        this.f80141id = j;
        this.reference = j2;
        this.cadastralCode = str13;
        this.propertyType = str14;
        this.registrationNumber = str15;
        this.parcelFunction = str16;
        this.address = str17;
        this.latitude = str18;
        this.longitude = str19;
        this.updateDate = j3;
        this.zone = str20;
        this.zoneName = str21;
        this.sectorName = str10;
        this.propertyArea = j4;
        this.dictionaryKey = str11;
        this.dictionaryValue = str12;
    }

    public static /* synthetic */ LoanPropertyEntity copy$default(LoanPropertyEntity loanPropertyEntity, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j3, String str8, String str9, String str10, long j4, String str11, String str12, int i, Object obj) {
        LoanPropertyEntity loanPropertyEntity2 = loanPropertyEntity;
        int i2 = i;
        return loanPropertyEntity.copy((i2 & 1) != 0 ? loanPropertyEntity2.f80141id : j, (i2 & 2) != 0 ? loanPropertyEntity2.reference : j2, (i2 & 4) != 0 ? loanPropertyEntity2.cadastralCode : str, (i2 & 8) != 0 ? loanPropertyEntity2.propertyType : str2, (i2 & 16) != 0 ? loanPropertyEntity2.registrationNumber : str3, (i2 & 32) != 0 ? loanPropertyEntity2.parcelFunction : str4, (i2 & 64) != 0 ? loanPropertyEntity2.address : str5, (i2 & 128) != 0 ? loanPropertyEntity2.latitude : str6, (i2 & C11398b.f33139r) != 0 ? loanPropertyEntity2.longitude : str7, (i2 & C11398b.f33140s) != 0 ? loanPropertyEntity2.updateDate : j3, (i2 & C11398b.f33141t) != 0 ? loanPropertyEntity2.zone : str8, (i2 & C11398b.f33142u) != 0 ? loanPropertyEntity2.zoneName : str9, (i2 & C11398b.f33143v) != 0 ? loanPropertyEntity2.sectorName : str10, (i2 & 8192) != 0 ? loanPropertyEntity2.propertyArea : j4, (i2 & 16384) != 0 ? loanPropertyEntity2.dictionaryKey : str11, (i2 & 32768) != 0 ? loanPropertyEntity2.dictionaryValue : str12);
    }

    public final long component1() {
        return this.f80141id;
    }

    public final long component10() {
        return this.updateDate;
    }

    public final String component11() {
        return this.zone;
    }

    public final String component12() {
        return this.zoneName;
    }

    public final String component13() {
        return this.sectorName;
    }

    public final long component14() {
        return this.propertyArea;
    }

    public final String component15() {
        return this.dictionaryKey;
    }

    public final String component16() {
        return this.dictionaryValue;
    }

    public final long component2() {
        return this.reference;
    }

    public final String component3() {
        return this.cadastralCode;
    }

    public final String component4() {
        return this.propertyType;
    }

    public final String component5() {
        return this.registrationNumber;
    }

    public final String component6() {
        return this.parcelFunction;
    }

    public final String component7() {
        return this.address;
    }

    public final String component8() {
        return this.latitude;
    }

    public final String component9() {
        return this.longitude;
    }

    public final LoanPropertyEntity copy(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j3, String str8, String str9, String str10, long j4, String str11, String str12) {
        long j5 = j;
        C41536l.m120489i(str, "cadastralCode");
        C41536l.m120489i(str2, "propertyType");
        C41536l.m120489i(str3, "registrationNumber");
        C41536l.m120489i(str4, "parcelFunction");
        C41536l.m120489i(str5, "address");
        C41536l.m120489i(str6, C11767h.C11768a.f34132b);
        C41536l.m120489i(str7, C11767h.C11768a.f34133c);
        C41536l.m120489i(str8, "zone");
        C41536l.m120489i(str9, "zoneName");
        return new LoanPropertyEntity(j, j2, str, str2, str3, str4, str5, str6, str7, j3, str8, str9, str10, j4, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanPropertyEntity)) {
            return false;
        }
        LoanPropertyEntity loanPropertyEntity = (LoanPropertyEntity) obj;
        return this.f80141id == loanPropertyEntity.f80141id && this.reference == loanPropertyEntity.reference && C41536l.m120484d(this.cadastralCode, loanPropertyEntity.cadastralCode) && C41536l.m120484d(this.propertyType, loanPropertyEntity.propertyType) && C41536l.m120484d(this.registrationNumber, loanPropertyEntity.registrationNumber) && C41536l.m120484d(this.parcelFunction, loanPropertyEntity.parcelFunction) && C41536l.m120484d(this.address, loanPropertyEntity.address) && C41536l.m120484d(this.latitude, loanPropertyEntity.latitude) && C41536l.m120484d(this.longitude, loanPropertyEntity.longitude) && this.updateDate == loanPropertyEntity.updateDate && C41536l.m120484d(this.zone, loanPropertyEntity.zone) && C41536l.m120484d(this.zoneName, loanPropertyEntity.zoneName) && C41536l.m120484d(this.sectorName, loanPropertyEntity.sectorName) && this.propertyArea == loanPropertyEntity.propertyArea && C41536l.m120484d(this.dictionaryKey, loanPropertyEntity.dictionaryKey) && C41536l.m120484d(this.dictionaryValue, loanPropertyEntity.dictionaryValue);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCadastralCode() {
        return this.cadastralCode;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public final long getId() {
        return this.f80141id;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getParcelFunction() {
        return this.parcelFunction;
    }

    public final long getPropertyArea() {
        return this.propertyArea;
    }

    public final String getPropertyType() {
        return this.propertyType;
    }

    public final long getReference() {
        return this.reference;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public final String getSectorName() {
        return this.sectorName;
    }

    public final long getUpdateDate() {
        return this.updateDate;
    }

    public final String getZone() {
        return this.zone;
    }

    public final String getZoneName() {
        return this.zoneName;
    }

    public int hashCode() {
        int a = ((((((((((((((((((((((C7397t.m28148a(this.f80141id) * 31) + C7397t.m28148a(this.reference)) * 31) + this.cadastralCode.hashCode()) * 31) + this.propertyType.hashCode()) * 31) + this.registrationNumber.hashCode()) * 31) + this.parcelFunction.hashCode()) * 31) + this.address.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.longitude.hashCode()) * 31) + C7397t.m28148a(this.updateDate)) * 31) + this.zone.hashCode()) * 31) + this.zoneName.hashCode()) * 31;
        String str = this.sectorName;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.propertyArea)) * 31;
        String str2 = this.dictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dictionaryValue;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.f80141id;
        long j2 = this.reference;
        String str = this.cadastralCode;
        String str2 = this.propertyType;
        String str3 = this.registrationNumber;
        String str4 = this.parcelFunction;
        String str5 = this.address;
        String str6 = this.latitude;
        String str7 = this.longitude;
        long j3 = this.updateDate;
        String str8 = this.zone;
        String str9 = this.zoneName;
        String str10 = str8;
        String str11 = this.sectorName;
        long j4 = this.propertyArea;
        String str12 = this.dictionaryKey;
        String str13 = this.dictionaryValue;
        return "LoanPropertyEntity(id=" + j + ", reference=" + j2 + ", cadastralCode=" + str + ", propertyType=" + str2 + ", registrationNumber=" + str3 + ", parcelFunction=" + str4 + ", address=" + str5 + ", latitude=" + str6 + ", longitude=" + str7 + ", updateDate=" + j3 + ", zone=" + str10 + ", zoneName=" + str9 + ", sectorName=" + str11 + ", propertyArea=" + j4 + ", dictionaryKey=" + str12 + ", dictionaryValue=" + str13 + ")";
    }
}
