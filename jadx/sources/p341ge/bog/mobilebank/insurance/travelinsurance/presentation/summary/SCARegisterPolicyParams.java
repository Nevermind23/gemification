package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.SCARegisterPolicyParams */
public final class SCARegisterPolicyParams extends OtpParams {
    private final Long acctKey;
    private final String clientKey;
    private final String coverage;
    private final Long customerId;
    private final String email;
    private final Long endDate;
    private final String hashKey;
    private final Long insuredBirthDate;
    private final String insuredFirstName;
    private final String insuredFirstNameInt;
    private final String insuredLastName;
    private final String insuredLastNameInt;
    private final String insuredPin;
    private final String limit;
    private final String limitCcy;
    private final String operationId;
    private final String operationReference;
    private final String otherPerson;
    private final String phone;
    private final String premium;
    private final String premiumCcy;
    private final String productId;
    private final String providerId;
    private final String scaAuthCode;
    private final String serviceId;
    private final String sessionKey;
    private final Long startDate;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SCARegisterPolicyParams(String str, Long l, String str2, String str3, Long l2, Long l3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Long l4, Long l5, String str19, String str20, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, str2, str3, l2, l3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, l4, l5, str19, (i & 16777216) != 0 ? null : str20, (i & 33554432) != 0 ? null : str21, (i & 67108864) != 0 ? null : str22);
    }

    public static /* synthetic */ SCARegisterPolicyParams copy$default(SCARegisterPolicyParams sCARegisterPolicyParams, String str, Long l, String str2, String str3, Long l2, Long l3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Long l4, Long l5, String str19, String str20, String str21, String str22, int i, Object obj) {
        SCARegisterPolicyParams sCARegisterPolicyParams2 = sCARegisterPolicyParams;
        int i2 = i;
        return sCARegisterPolicyParams.copy((i2 & 1) != 0 ? sCARegisterPolicyParams2.clientKey : str, (i2 & 2) != 0 ? sCARegisterPolicyParams2.customerId : l, (i2 & 4) != 0 ? sCARegisterPolicyParams2.email : str2, (i2 & 8) != 0 ? sCARegisterPolicyParams2.phone : str3, (i2 & 16) != 0 ? sCARegisterPolicyParams2.startDate : l2, (i2 & 32) != 0 ? sCARegisterPolicyParams2.endDate : l3, (i2 & 64) != 0 ? sCARegisterPolicyParams2.limit : str4, (i2 & 128) != 0 ? sCARegisterPolicyParams2.limitCcy : str5, (i2 & C11398b.f33139r) != 0 ? sCARegisterPolicyParams2.coverage : str6, (i2 & C11398b.f33140s) != 0 ? sCARegisterPolicyParams2.productId : str7, (i2 & C11398b.f33141t) != 0 ? sCARegisterPolicyParams2.providerId : str8, (i2 & C11398b.f33142u) != 0 ? sCARegisterPolicyParams2.premium : str9, (i2 & C11398b.f33143v) != 0 ? sCARegisterPolicyParams2.premiumCcy : str10, (i2 & 8192) != 0 ? sCARegisterPolicyParams2.hashKey : str11, (i2 & 16384) != 0 ? sCARegisterPolicyParams2.sessionKey : str12, (i2 & 32768) != 0 ? sCARegisterPolicyParams2.otherPerson : str13, (i2 & 65536) != 0 ? sCARegisterPolicyParams2.insuredFirstName : str14, (i2 & 131072) != 0 ? sCARegisterPolicyParams2.insuredLastName : str15, (i2 & 262144) != 0 ? sCARegisterPolicyParams2.insuredFirstNameInt : str16, (i2 & 524288) != 0 ? sCARegisterPolicyParams2.insuredLastNameInt : str17, (i2 & 1048576) != 0 ? sCARegisterPolicyParams2.insuredPin : str18, (i2 & 2097152) != 0 ? sCARegisterPolicyParams2.insuredBirthDate : l4, (i2 & 4194304) != 0 ? sCARegisterPolicyParams2.acctKey : l5, (i2 & 8388608) != 0 ? sCARegisterPolicyParams2.serviceId : str19, (i2 & 16777216) != 0 ? sCARegisterPolicyParams2.operationId : str20, (i2 & 33554432) != 0 ? sCARegisterPolicyParams2.operationReference : str21, (i2 & 67108864) != 0 ? sCARegisterPolicyParams2.scaAuthCode : str22);
    }

    public final String component1() {
        return this.clientKey;
    }

    public final String component10() {
        return this.productId;
    }

    public final String component11() {
        return this.providerId;
    }

    public final String component12() {
        return this.premium;
    }

    public final String component13() {
        return this.premiumCcy;
    }

    public final String component14() {
        return this.hashKey;
    }

    public final String component15() {
        return this.sessionKey;
    }

    public final String component16() {
        return this.otherPerson;
    }

    public final String component17() {
        return this.insuredFirstName;
    }

    public final String component18() {
        return this.insuredLastName;
    }

    public final String component19() {
        return this.insuredFirstNameInt;
    }

    public final Long component2() {
        return this.customerId;
    }

    public final String component20() {
        return this.insuredLastNameInt;
    }

    public final String component21() {
        return this.insuredPin;
    }

    public final Long component22() {
        return this.insuredBirthDate;
    }

    public final Long component23() {
        return this.acctKey;
    }

    public final String component24() {
        return this.serviceId;
    }

    public final String component25() {
        return this.operationId;
    }

    public final String component26() {
        return this.operationReference;
    }

    public final String component27() {
        return this.scaAuthCode;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.phone;
    }

    public final Long component5() {
        return this.startDate;
    }

    public final Long component6() {
        return this.endDate;
    }

    public final String component7() {
        return this.limit;
    }

    public final String component8() {
        return this.limitCcy;
    }

    public final String component9() {
        return this.coverage;
    }

    public final SCARegisterPolicyParams copy(String str, Long l, String str2, String str3, Long l2, Long l3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Long l4, Long l5, String str19, String str20, String str21, String str22) {
        String str23 = str;
        C41536l.m120489i(str19, IRetrofitService.SERVICE_ID);
        return new SCARegisterPolicyParams(str, l, str2, str3, l2, l3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, l4, l5, str19, str20, str21, str22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SCARegisterPolicyParams)) {
            return false;
        }
        SCARegisterPolicyParams sCARegisterPolicyParams = (SCARegisterPolicyParams) obj;
        return C41536l.m120484d(this.clientKey, sCARegisterPolicyParams.clientKey) && C41536l.m120484d(this.customerId, sCARegisterPolicyParams.customerId) && C41536l.m120484d(this.email, sCARegisterPolicyParams.email) && C41536l.m120484d(this.phone, sCARegisterPolicyParams.phone) && C41536l.m120484d(this.startDate, sCARegisterPolicyParams.startDate) && C41536l.m120484d(this.endDate, sCARegisterPolicyParams.endDate) && C41536l.m120484d(this.limit, sCARegisterPolicyParams.limit) && C41536l.m120484d(this.limitCcy, sCARegisterPolicyParams.limitCcy) && C41536l.m120484d(this.coverage, sCARegisterPolicyParams.coverage) && C41536l.m120484d(this.productId, sCARegisterPolicyParams.productId) && C41536l.m120484d(this.providerId, sCARegisterPolicyParams.providerId) && C41536l.m120484d(this.premium, sCARegisterPolicyParams.premium) && C41536l.m120484d(this.premiumCcy, sCARegisterPolicyParams.premiumCcy) && C41536l.m120484d(this.hashKey, sCARegisterPolicyParams.hashKey) && C41536l.m120484d(this.sessionKey, sCARegisterPolicyParams.sessionKey) && C41536l.m120484d(this.otherPerson, sCARegisterPolicyParams.otherPerson) && C41536l.m120484d(this.insuredFirstName, sCARegisterPolicyParams.insuredFirstName) && C41536l.m120484d(this.insuredLastName, sCARegisterPolicyParams.insuredLastName) && C41536l.m120484d(this.insuredFirstNameInt, sCARegisterPolicyParams.insuredFirstNameInt) && C41536l.m120484d(this.insuredLastNameInt, sCARegisterPolicyParams.insuredLastNameInt) && C41536l.m120484d(this.insuredPin, sCARegisterPolicyParams.insuredPin) && C41536l.m120484d(this.insuredBirthDate, sCARegisterPolicyParams.insuredBirthDate) && C41536l.m120484d(this.acctKey, sCARegisterPolicyParams.acctKey) && C41536l.m120484d(this.serviceId, sCARegisterPolicyParams.serviceId) && C41536l.m120484d(this.operationId, sCARegisterPolicyParams.operationId) && C41536l.m120484d(this.operationReference, sCARegisterPolicyParams.operationReference) && C41536l.m120484d(this.scaAuthCode, sCARegisterPolicyParams.scaAuthCode);
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getCoverage() {
        return this.coverage;
    }

    public final Long getCustomerId() {
        return this.customerId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getHashKey() {
        return this.hashKey;
    }

    public final Long getInsuredBirthDate() {
        return this.insuredBirthDate;
    }

    public final String getInsuredFirstName() {
        return this.insuredFirstName;
    }

    public final String getInsuredFirstNameInt() {
        return this.insuredFirstNameInt;
    }

    public final String getInsuredLastName() {
        return this.insuredLastName;
    }

    public final String getInsuredLastNameInt() {
        return this.insuredLastNameInt;
    }

    public final String getInsuredPin() {
        return this.insuredPin;
    }

    public final String getLimit() {
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

    public final String getOtherPerson() {
        return this.otherPerson;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPremium() {
        return this.premium;
    }

    public final String getPremiumCcy() {
        return this.premiumCcy;
    }

    public final String getProductId() {
        return this.productId;
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

    public final String getSessionKey() {
        return this.sessionKey;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        String str = this.clientKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.customerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.email;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.startDate;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endDate;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str4 = this.limit;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.limitCcy;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.coverage;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productId;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.providerId;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.premium;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.premiumCcy;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.hashKey;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sessionKey;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.otherPerson;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.insuredFirstName;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.insuredLastName;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.insuredFirstNameInt;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.insuredLastNameInt;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.insuredPin;
        int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Long l4 = this.insuredBirthDate;
        int hashCode22 = (hashCode21 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.acctKey;
        int hashCode23 = (((hashCode22 + (l5 == null ? 0 : l5.hashCode())) * 31) + this.serviceId.hashCode()) * 31;
        String str19 = this.operationId;
        int hashCode24 = (hashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.operationReference;
        int hashCode25 = (hashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.scaAuthCode;
        if (str21 != null) {
            i = str21.hashCode();
        }
        return hashCode25 + i;
    }

    public String toString() {
        String str = this.clientKey;
        Long l = this.customerId;
        String str2 = this.email;
        String str3 = this.phone;
        Long l2 = this.startDate;
        Long l3 = this.endDate;
        String str4 = this.limit;
        String str5 = this.limitCcy;
        String str6 = this.coverage;
        String str7 = this.productId;
        String str8 = this.providerId;
        String str9 = this.premium;
        String str10 = this.premiumCcy;
        String str11 = this.hashKey;
        String str12 = this.sessionKey;
        String str13 = this.otherPerson;
        String str14 = this.insuredFirstName;
        String str15 = this.insuredLastName;
        String str16 = this.insuredFirstNameInt;
        String str17 = this.insuredLastNameInt;
        String str18 = this.insuredPin;
        Long l4 = this.insuredBirthDate;
        Long l5 = this.acctKey;
        String str19 = this.serviceId;
        String str20 = this.operationId;
        String str21 = this.operationReference;
        String str22 = this.scaAuthCode;
        return "SCARegisterPolicyParams(clientKey=" + str + ", customerId=" + l + ", email=" + str2 + ", phone=" + str3 + ", startDate=" + l2 + ", endDate=" + l3 + ", limit=" + str4 + ", limitCcy=" + str5 + ", coverage=" + str6 + ", productId=" + str7 + ", providerId=" + str8 + ", premium=" + str9 + ", premiumCcy=" + str10 + ", hashKey=" + str11 + ", sessionKey=" + str12 + ", otherPerson=" + str13 + ", insuredFirstName=" + str14 + ", insuredLastName=" + str15 + ", insuredFirstNameInt=" + str16 + ", insuredLastNameInt=" + str17 + ", insuredPin=" + str18 + ", insuredBirthDate=" + l4 + ", acctKey=" + l5 + ", serviceId=" + str19 + ", operationId=" + str20 + ", operationReference=" + str21 + ", scaAuthCode=" + str22 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCARegisterPolicyParams(String str, Long l, String str2, String str3, Long l2, Long l3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Long l4, Long l5, String str19, String str20, String str21, String str22) {
        super(str19, str21, str22, (String) null, 8, (DefaultConstructorMarker) null);
        String str23 = str19;
        C41536l.m120489i(str23, IRetrofitService.SERVICE_ID);
        this.clientKey = str;
        this.customerId = l;
        this.email = str2;
        this.phone = str3;
        this.startDate = l2;
        this.endDate = l3;
        this.limit = str4;
        this.limitCcy = str5;
        this.coverage = str6;
        this.productId = str7;
        this.providerId = str8;
        this.premium = str9;
        this.premiumCcy = str10;
        this.hashKey = str11;
        this.sessionKey = str12;
        this.otherPerson = str13;
        this.insuredFirstName = str14;
        this.insuredLastName = str15;
        this.insuredFirstNameInt = str16;
        this.insuredLastNameInt = str17;
        this.insuredPin = str18;
        this.insuredBirthDate = l4;
        this.acctKey = l5;
        this.serviceId = str23;
        this.operationId = str20;
        this.operationReference = str21;
        this.scaAuthCode = str22;
    }
}
