package p341ge.bog.mobilebank.autoliabilityinsurance.domain.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.domain.model.SCARegisterPolicyParams */
public final class SCARegisterPolicyParams extends OtpParams {
    private final Long acctKey;
    private final int activateDirectDebit;
    private final String carNumber;
    private final Long carOwnerBirthDate;
    private final String carOwnerFirstname;
    private final String carOwnerLastname;
    private final String carOwnerPin;
    private final String carOwnerSex;
    private final String carOwnerType;
    private final String cardPan;
    private final String email;
    private final long endDate;
    private final String expDate;
    private final double limit;
    private final String limitCcy;
    private final String operationId;
    private final String operationReference;
    private final String payPeriod;
    private final String phone;
    private final double premium;
    private final String premiumCcy;
    private final String providerId;
    private final String scaAuthCode;
    private final String serviceId;
    private final long startDate;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SCARegisterPolicyParams(long j, long j2, String str, String str2, String str3, double d, String str4, double d2, String str5, String str6, String str7, String str8, String str9, Long l, String str10, String str11, String str12, String str13, String str14, Long l2, int i, String str15, String str16, String str17, String str18, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, str2, str3, d, str4, d2, str5, str6, str7, str8, str9, l, str10, str11, str12, str13, str14, l2, i, str15, (i2 & 4194304) != 0 ? null : str16, (i2 & 8388608) != 0 ? null : str17, (i2 & 16777216) != 0 ? null : str18);
    }

    public static /* synthetic */ SCARegisterPolicyParams copy$default(SCARegisterPolicyParams sCARegisterPolicyParams, long j, long j2, String str, String str2, String str3, double d, String str4, double d2, String str5, String str6, String str7, String str8, String str9, Long l, String str10, String str11, String str12, String str13, String str14, Long l2, int i, String str15, String str16, String str17, String str18, int i2, Object obj) {
        SCARegisterPolicyParams sCARegisterPolicyParams2 = sCARegisterPolicyParams;
        int i3 = i2;
        return sCARegisterPolicyParams.copy((i3 & 1) != 0 ? sCARegisterPolicyParams2.startDate : j, (i3 & 2) != 0 ? sCARegisterPolicyParams2.endDate : j2, (i3 & 4) != 0 ? sCARegisterPolicyParams2.email : str, (i3 & 8) != 0 ? sCARegisterPolicyParams2.phone : str2, (i3 & 16) != 0 ? sCARegisterPolicyParams2.providerId : str3, (i3 & 32) != 0 ? sCARegisterPolicyParams2.premium : d, (i3 & 64) != 0 ? sCARegisterPolicyParams2.premiumCcy : str4, (i3 & 128) != 0 ? sCARegisterPolicyParams2.limit : d2, (i3 & C11398b.f33139r) != 0 ? sCARegisterPolicyParams2.limitCcy : str5, (i3 & C11398b.f33140s) != 0 ? sCARegisterPolicyParams2.payPeriod : str6, (i3 & C11398b.f33141t) != 0 ? sCARegisterPolicyParams2.carNumber : str7, (i3 & C11398b.f33142u) != 0 ? sCARegisterPolicyParams2.carOwnerType : str8, (i3 & C11398b.f33143v) != 0 ? sCARegisterPolicyParams2.carOwnerPin : str9, (i3 & 8192) != 0 ? sCARegisterPolicyParams2.carOwnerBirthDate : l, (i3 & 16384) != 0 ? sCARegisterPolicyParams2.carOwnerFirstname : str10, (i3 & 32768) != 0 ? sCARegisterPolicyParams2.carOwnerLastname : str11, (i3 & 65536) != 0 ? sCARegisterPolicyParams2.carOwnerSex : str12, (i3 & 131072) != 0 ? sCARegisterPolicyParams2.cardPan : str13, (i3 & 262144) != 0 ? sCARegisterPolicyParams2.expDate : str14, (i3 & 524288) != 0 ? sCARegisterPolicyParams2.acctKey : l2, (i3 & 1048576) != 0 ? sCARegisterPolicyParams2.activateDirectDebit : i, (i3 & 2097152) != 0 ? sCARegisterPolicyParams2.serviceId : str15, (i3 & 4194304) != 0 ? sCARegisterPolicyParams2.operationId : str16, (i3 & 8388608) != 0 ? sCARegisterPolicyParams2.operationReference : str17, (i3 & 16777216) != 0 ? sCARegisterPolicyParams2.scaAuthCode : str18);
    }

    public final long component1() {
        return this.startDate;
    }

    public final String component10() {
        return this.payPeriod;
    }

    public final String component11() {
        return this.carNumber;
    }

    public final String component12() {
        return this.carOwnerType;
    }

    public final String component13() {
        return this.carOwnerPin;
    }

    public final Long component14() {
        return this.carOwnerBirthDate;
    }

    public final String component15() {
        return this.carOwnerFirstname;
    }

    public final String component16() {
        return this.carOwnerLastname;
    }

    public final String component17() {
        return this.carOwnerSex;
    }

    public final String component18() {
        return this.cardPan;
    }

    public final String component19() {
        return this.expDate;
    }

    public final long component2() {
        return this.endDate;
    }

    public final Long component20() {
        return this.acctKey;
    }

    public final int component21() {
        return this.activateDirectDebit;
    }

    public final String component22() {
        return this.serviceId;
    }

    public final String component23() {
        return this.operationId;
    }

    public final String component24() {
        return this.operationReference;
    }

    public final String component25() {
        return this.scaAuthCode;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.phone;
    }

    public final String component5() {
        return this.providerId;
    }

    public final double component6() {
        return this.premium;
    }

    public final String component7() {
        return this.premiumCcy;
    }

    public final double component8() {
        return this.limit;
    }

    public final String component9() {
        return this.limitCcy;
    }

    public final SCARegisterPolicyParams copy(long j, long j2, String str, String str2, String str3, double d, String str4, double d2, String str5, String str6, String str7, String str8, String str9, Long l, String str10, String str11, String str12, String str13, String str14, Long l2, int i, String str15, String str16, String str17, String str18) {
        long j3 = j;
        C41536l.m120489i(str2, "phone");
        C41536l.m120489i(str3, "providerId");
        C41536l.m120489i(str4, "premiumCcy");
        C41536l.m120489i(str5, "limitCcy");
        C41536l.m120489i(str6, "payPeriod");
        C41536l.m120489i(str7, "carNumber");
        C41536l.m120489i(str8, "carOwnerType");
        C41536l.m120489i(str15, IRetrofitService.SERVICE_ID);
        return new SCARegisterPolicyParams(j, j2, str, str2, str3, d, str4, d2, str5, str6, str7, str8, str9, l, str10, str11, str12, str13, str14, l2, i, str15, str16, str17, str18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SCARegisterPolicyParams)) {
            return false;
        }
        SCARegisterPolicyParams sCARegisterPolicyParams = (SCARegisterPolicyParams) obj;
        return this.startDate == sCARegisterPolicyParams.startDate && this.endDate == sCARegisterPolicyParams.endDate && C41536l.m120484d(this.email, sCARegisterPolicyParams.email) && C41536l.m120484d(this.phone, sCARegisterPolicyParams.phone) && C41536l.m120484d(this.providerId, sCARegisterPolicyParams.providerId) && Double.compare(this.premium, sCARegisterPolicyParams.premium) == 0 && C41536l.m120484d(this.premiumCcy, sCARegisterPolicyParams.premiumCcy) && Double.compare(this.limit, sCARegisterPolicyParams.limit) == 0 && C41536l.m120484d(this.limitCcy, sCARegisterPolicyParams.limitCcy) && C41536l.m120484d(this.payPeriod, sCARegisterPolicyParams.payPeriod) && C41536l.m120484d(this.carNumber, sCARegisterPolicyParams.carNumber) && C41536l.m120484d(this.carOwnerType, sCARegisterPolicyParams.carOwnerType) && C41536l.m120484d(this.carOwnerPin, sCARegisterPolicyParams.carOwnerPin) && C41536l.m120484d(this.carOwnerBirthDate, sCARegisterPolicyParams.carOwnerBirthDate) && C41536l.m120484d(this.carOwnerFirstname, sCARegisterPolicyParams.carOwnerFirstname) && C41536l.m120484d(this.carOwnerLastname, sCARegisterPolicyParams.carOwnerLastname) && C41536l.m120484d(this.carOwnerSex, sCARegisterPolicyParams.carOwnerSex) && C41536l.m120484d(this.cardPan, sCARegisterPolicyParams.cardPan) && C41536l.m120484d(this.expDate, sCARegisterPolicyParams.expDate) && C41536l.m120484d(this.acctKey, sCARegisterPolicyParams.acctKey) && this.activateDirectDebit == sCARegisterPolicyParams.activateDirectDebit && C41536l.m120484d(this.serviceId, sCARegisterPolicyParams.serviceId) && C41536l.m120484d(this.operationId, sCARegisterPolicyParams.operationId) && C41536l.m120484d(this.operationReference, sCARegisterPolicyParams.operationReference) && C41536l.m120484d(this.scaAuthCode, sCARegisterPolicyParams.scaAuthCode);
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final int getActivateDirectDebit() {
        return this.activateDirectDebit;
    }

    public final String getCarNumber() {
        return this.carNumber;
    }

    public final Long getCarOwnerBirthDate() {
        return this.carOwnerBirthDate;
    }

    public final String getCarOwnerFirstname() {
        return this.carOwnerFirstname;
    }

    public final String getCarOwnerLastname() {
        return this.carOwnerLastname;
    }

    public final String getCarOwnerPin() {
        return this.carOwnerPin;
    }

    public final String getCarOwnerSex() {
        return this.carOwnerSex;
    }

    public final String getCarOwnerType() {
        return this.carOwnerType;
    }

    public final String getCardPan() {
        return this.cardPan;
    }

    public final String getEmail() {
        return this.email;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final String getExpDate() {
        return this.expDate;
    }

    public final double getLimit() {
        return this.limit;
    }

    public final String getLimitCcy() {
        return this.limitCcy;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPayPeriod() {
        return this.payPeriod;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final double getPremium() {
        return this.premium;
    }

    public final String getPremiumCcy() {
        return this.premiumCcy;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.startDate) * 31) + C7397t.m28148a(this.endDate)) * 31;
        String str = this.email;
        int i = 0;
        int hashCode = (((((((((((((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.phone.hashCode()) * 31) + this.providerId.hashCode()) * 31) + Double.doubleToLongBits(this.premium)) * 31) + this.premiumCcy.hashCode()) * 31) + Double.doubleToLongBits(this.limit)) * 31) + this.limitCcy.hashCode()) * 31) + this.payPeriod.hashCode()) * 31) + this.carNumber.hashCode()) * 31) + this.carOwnerType.hashCode()) * 31;
        String str2 = this.carOwnerPin;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.carOwnerBirthDate;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.carOwnerFirstname;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.carOwnerLastname;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.carOwnerSex;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardPan;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.expDate;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.acctKey;
        int hashCode9 = (((((hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.activateDirectDebit) * 31) + this.serviceId.hashCode()) * 31;
        String str8 = this.operationId;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.operationReference;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.scaAuthCode;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        long j = this.startDate;
        long j2 = this.endDate;
        String str = this.email;
        String str2 = this.phone;
        String str3 = this.providerId;
        double d = this.premium;
        String str4 = this.premiumCcy;
        double d2 = this.limit;
        String str5 = this.limitCcy;
        String str6 = this.payPeriod;
        String str7 = this.carNumber;
        String str8 = this.carOwnerType;
        String str9 = this.carOwnerPin;
        Long l = this.carOwnerBirthDate;
        String str10 = this.carOwnerFirstname;
        String str11 = this.carOwnerLastname;
        String str12 = this.carOwnerSex;
        String str13 = this.cardPan;
        String str14 = this.expDate;
        Long l2 = this.acctKey;
        int i = this.activateDirectDebit;
        String str15 = this.serviceId;
        String str16 = this.operationId;
        String str17 = this.operationReference;
        String str18 = this.scaAuthCode;
        return "SCARegisterPolicyParams(startDate=" + j + ", endDate=" + j2 + ", email=" + str + ", phone=" + str2 + ", providerId=" + str3 + ", premium=" + d + ", premiumCcy=" + str4 + ", limit=" + d2 + ", limitCcy=" + str5 + ", payPeriod=" + str6 + ", carNumber=" + str7 + ", carOwnerType=" + str8 + ", carOwnerPin=" + str9 + ", carOwnerBirthDate=" + l + ", carOwnerFirstname=" + str10 + ", carOwnerLastname=" + str11 + ", carOwnerSex=" + str12 + ", cardPan=" + str13 + ", expDate=" + str14 + ", acctKey=" + l2 + ", activateDirectDebit=" + i + ", serviceId=" + str15 + ", operationId=" + str16 + ", operationReference=" + str17 + ", scaAuthCode=" + str18 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCARegisterPolicyParams(long j, long j2, String str, String str2, String str3, double d, String str4, double d2, String str5, String str6, String str7, String str8, String str9, Long l, String str10, String str11, String str12, String str13, String str14, Long l2, int i, String str15, String str16, String str17, String str18) {
        super(str15, str17, str18, (String) null, 8, (DefaultConstructorMarker) null);
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str15;
        C41536l.m120489i(str19, "phone");
        C41536l.m120489i(str20, "providerId");
        C41536l.m120489i(str21, "premiumCcy");
        C41536l.m120489i(str22, "limitCcy");
        C41536l.m120489i(str23, "payPeriod");
        C41536l.m120489i(str24, "carNumber");
        C41536l.m120489i(str25, "carOwnerType");
        C41536l.m120489i(str26, IRetrofitService.SERVICE_ID);
        this.startDate = j;
        this.endDate = j2;
        this.email = str;
        this.phone = str19;
        this.providerId = str20;
        this.premium = d;
        this.premiumCcy = str21;
        this.limit = d2;
        this.limitCcy = str22;
        this.payPeriod = str23;
        this.carNumber = str24;
        this.carOwnerType = str25;
        this.carOwnerPin = str9;
        this.carOwnerBirthDate = l;
        this.carOwnerFirstname = str10;
        this.carOwnerLastname = str11;
        this.carOwnerSex = str12;
        this.cardPan = str13;
        this.expDate = str14;
        this.acctKey = l2;
        this.activateDirectDebit = i;
        this.serviceId = str26;
        this.operationId = str16;
        this.operationReference = str17;
        this.scaAuthCode = str18;
    }
}
