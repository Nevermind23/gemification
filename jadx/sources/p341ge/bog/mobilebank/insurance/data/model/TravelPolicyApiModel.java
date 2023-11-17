package p341ge.bog.mobilebank.insurance.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.data.model.TravelPolicyApiModel */
public final class TravelPolicyApiModel {
    private final YesNoApiEntity addCoverage;
    private final long clientKey;
    private final List<ContactInformationApiModel> contactInformation;
    private final long docKey;
    private final BigDecimal insLimit;
    private final String insLimitCcy;
    private final BigDecimal insPremium;
    private final String insPremiumCcy;
    private final String insuredFirstName;
    private final String insuredFirstNameEn;
    private final String insuredLastName;
    private final String insuredLastNameEn;
    private final String insuredPin;
    private final long policyEndDate;
    private final Long policyFileId;
    private final String policyNo;
    private final String policyPdfUrl;
    private final long policyStartDate;
    private final String prodType;
    private final String productName;
    private final String providerId;
    private final String providerLogoUrl;
    private final String providerName;
    private final String providerPhone;

    public TravelPolicyApiModel(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, long j3, long j4, Long l, String str6, String str7, String str8, String str9, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, String str15, List<ContactInformationApiModel> list) {
        String str16 = str;
        String str17 = str3;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        String str23 = str11;
        String str24 = str12;
        String str25 = str13;
        String str26 = str14;
        String str27 = str15;
        List<ContactInformationApiModel> list2 = list;
        C41536l.m120489i(str16, "providerId");
        C41536l.m120489i(str17, "policyNo");
        C41536l.m120489i(str18, "insuredFirstName");
        C41536l.m120489i(str19, "insuredLastName");
        C41536l.m120489i(str20, "insuredFirstNameEn");
        C41536l.m120489i(str21, "insuredLastNameEn");
        C41536l.m120489i(str22, "insuredPin");
        C41536l.m120489i(str23, "productName");
        C41536l.m120489i(str24, "providerName");
        C41536l.m120489i(str25, "providerLogoUrl");
        C41536l.m120489i(str26, "providerPhone");
        C41536l.m120489i(str27, "policyPdfUrl");
        C41536l.m120489i(list2, "contactInformation");
        this.docKey = j;
        this.clientKey = j2;
        this.providerId = str16;
        this.prodType = str2;
        this.policyNo = str17;
        this.insLimit = bigDecimal;
        this.insLimitCcy = str4;
        this.insPremium = bigDecimal2;
        this.insPremiumCcy = str5;
        this.policyStartDate = j3;
        this.policyEndDate = j4;
        this.policyFileId = l;
        this.insuredFirstName = str18;
        this.insuredLastName = str19;
        this.insuredFirstNameEn = str20;
        this.insuredLastNameEn = str21;
        this.insuredPin = str22;
        this.addCoverage = yesNoApiEntity;
        this.productName = str23;
        this.providerName = str24;
        this.providerLogoUrl = str25;
        this.providerPhone = str26;
        this.policyPdfUrl = str27;
        this.contactInformation = list2;
    }

    public static /* synthetic */ TravelPolicyApiModel copy$default(TravelPolicyApiModel travelPolicyApiModel, long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, long j3, long j4, Long l, String str6, String str7, String str8, String str9, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, String str15, List list, int i, Object obj) {
        TravelPolicyApiModel travelPolicyApiModel2 = travelPolicyApiModel;
        int i2 = i;
        return travelPolicyApiModel.copy((i2 & 1) != 0 ? travelPolicyApiModel2.docKey : j, (i2 & 2) != 0 ? travelPolicyApiModel2.clientKey : j2, (i2 & 4) != 0 ? travelPolicyApiModel2.providerId : str, (i2 & 8) != 0 ? travelPolicyApiModel2.prodType : str2, (i2 & 16) != 0 ? travelPolicyApiModel2.policyNo : str3, (i2 & 32) != 0 ? travelPolicyApiModel2.insLimit : bigDecimal, (i2 & 64) != 0 ? travelPolicyApiModel2.insLimitCcy : str4, (i2 & 128) != 0 ? travelPolicyApiModel2.insPremium : bigDecimal2, (i2 & C11398b.f33139r) != 0 ? travelPolicyApiModel2.insPremiumCcy : str5, (i2 & C11398b.f33140s) != 0 ? travelPolicyApiModel2.policyStartDate : j3, (i2 & C11398b.f33141t) != 0 ? travelPolicyApiModel2.policyEndDate : j4, (i2 & C11398b.f33142u) != 0 ? travelPolicyApiModel2.policyFileId : l, (i2 & C11398b.f33143v) != 0 ? travelPolicyApiModel2.insuredFirstName : str6, (i2 & 8192) != 0 ? travelPolicyApiModel2.insuredLastName : str7, (i2 & 16384) != 0 ? travelPolicyApiModel2.insuredFirstNameEn : str8, (i2 & 32768) != 0 ? travelPolicyApiModel2.insuredLastNameEn : str9, (i2 & 65536) != 0 ? travelPolicyApiModel2.insuredPin : str10, (i2 & 131072) != 0 ? travelPolicyApiModel2.addCoverage : yesNoApiEntity, (i2 & 262144) != 0 ? travelPolicyApiModel2.productName : str11, (i2 & 524288) != 0 ? travelPolicyApiModel2.providerName : str12, (i2 & 1048576) != 0 ? travelPolicyApiModel2.providerLogoUrl : str13, (i2 & 2097152) != 0 ? travelPolicyApiModel2.providerPhone : str14, (i2 & 4194304) != 0 ? travelPolicyApiModel2.policyPdfUrl : str15, (i2 & 8388608) != 0 ? travelPolicyApiModel2.contactInformation : list);
    }

    public final long component1() {
        return this.docKey;
    }

    public final long component10() {
        return this.policyStartDate;
    }

    public final long component11() {
        return this.policyEndDate;
    }

    public final Long component12() {
        return this.policyFileId;
    }

    public final String component13() {
        return this.insuredFirstName;
    }

    public final String component14() {
        return this.insuredLastName;
    }

    public final String component15() {
        return this.insuredFirstNameEn;
    }

    public final String component16() {
        return this.insuredLastNameEn;
    }

    public final String component17() {
        return this.insuredPin;
    }

    public final YesNoApiEntity component18() {
        return this.addCoverage;
    }

    public final String component19() {
        return this.productName;
    }

    public final long component2() {
        return this.clientKey;
    }

    public final String component20() {
        return this.providerName;
    }

    public final String component21() {
        return this.providerLogoUrl;
    }

    public final String component22() {
        return this.providerPhone;
    }

    public final String component23() {
        return this.policyPdfUrl;
    }

    public final List<ContactInformationApiModel> component24() {
        return this.contactInformation;
    }

    public final String component3() {
        return this.providerId;
    }

    public final String component4() {
        return this.prodType;
    }

    public final String component5() {
        return this.policyNo;
    }

    public final BigDecimal component6() {
        return this.insLimit;
    }

    public final String component7() {
        return this.insLimitCcy;
    }

    public final BigDecimal component8() {
        return this.insPremium;
    }

    public final String component9() {
        return this.insPremiumCcy;
    }

    public final TravelPolicyApiModel copy(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, long j3, long j4, Long l, String str6, String str7, String str8, String str9, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, String str15, List<ContactInformationApiModel> list) {
        long j5 = j;
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(str3, "policyNo");
        C41536l.m120489i(str6, "insuredFirstName");
        C41536l.m120489i(str7, "insuredLastName");
        C41536l.m120489i(str8, "insuredFirstNameEn");
        C41536l.m120489i(str9, "insuredLastNameEn");
        C41536l.m120489i(str10, "insuredPin");
        C41536l.m120489i(str11, "productName");
        C41536l.m120489i(str12, "providerName");
        C41536l.m120489i(str13, "providerLogoUrl");
        C41536l.m120489i(str14, "providerPhone");
        C41536l.m120489i(str15, "policyPdfUrl");
        C41536l.m120489i(list, "contactInformation");
        return new TravelPolicyApiModel(j, j2, str, str2, str3, bigDecimal, str4, bigDecimal2, str5, j3, j4, l, str6, str7, str8, str9, str10, yesNoApiEntity, str11, str12, str13, str14, str15, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelPolicyApiModel)) {
            return false;
        }
        TravelPolicyApiModel travelPolicyApiModel = (TravelPolicyApiModel) obj;
        return this.docKey == travelPolicyApiModel.docKey && this.clientKey == travelPolicyApiModel.clientKey && C41536l.m120484d(this.providerId, travelPolicyApiModel.providerId) && C41536l.m120484d(this.prodType, travelPolicyApiModel.prodType) && C41536l.m120484d(this.policyNo, travelPolicyApiModel.policyNo) && C41536l.m120484d(this.insLimit, travelPolicyApiModel.insLimit) && C41536l.m120484d(this.insLimitCcy, travelPolicyApiModel.insLimitCcy) && C41536l.m120484d(this.insPremium, travelPolicyApiModel.insPremium) && C41536l.m120484d(this.insPremiumCcy, travelPolicyApiModel.insPremiumCcy) && this.policyStartDate == travelPolicyApiModel.policyStartDate && this.policyEndDate == travelPolicyApiModel.policyEndDate && C41536l.m120484d(this.policyFileId, travelPolicyApiModel.policyFileId) && C41536l.m120484d(this.insuredFirstName, travelPolicyApiModel.insuredFirstName) && C41536l.m120484d(this.insuredLastName, travelPolicyApiModel.insuredLastName) && C41536l.m120484d(this.insuredFirstNameEn, travelPolicyApiModel.insuredFirstNameEn) && C41536l.m120484d(this.insuredLastNameEn, travelPolicyApiModel.insuredLastNameEn) && C41536l.m120484d(this.insuredPin, travelPolicyApiModel.insuredPin) && this.addCoverage == travelPolicyApiModel.addCoverage && C41536l.m120484d(this.productName, travelPolicyApiModel.productName) && C41536l.m120484d(this.providerName, travelPolicyApiModel.providerName) && C41536l.m120484d(this.providerLogoUrl, travelPolicyApiModel.providerLogoUrl) && C41536l.m120484d(this.providerPhone, travelPolicyApiModel.providerPhone) && C41536l.m120484d(this.policyPdfUrl, travelPolicyApiModel.policyPdfUrl) && C41536l.m120484d(this.contactInformation, travelPolicyApiModel.contactInformation);
    }

    public final YesNoApiEntity getAddCoverage() {
        return this.addCoverage;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final List<ContactInformationApiModel> getContactInformation() {
        return this.contactInformation;
    }

    public final long getDocKey() {
        return this.docKey;
    }

    public final BigDecimal getInsLimit() {
        return this.insLimit;
    }

    public final String getInsLimitCcy() {
        return this.insLimitCcy;
    }

    public final BigDecimal getInsPremium() {
        return this.insPremium;
    }

    public final String getInsPremiumCcy() {
        return this.insPremiumCcy;
    }

    public final String getInsuredFirstName() {
        return this.insuredFirstName;
    }

    public final String getInsuredFirstNameEn() {
        return this.insuredFirstNameEn;
    }

    public final String getInsuredLastName() {
        return this.insuredLastName;
    }

    public final String getInsuredLastNameEn() {
        return this.insuredLastNameEn;
    }

    public final String getInsuredPin() {
        return this.insuredPin;
    }

    public final long getPolicyEndDate() {
        return this.policyEndDate;
    }

    public final Long getPolicyFileId() {
        return this.policyFileId;
    }

    public final String getPolicyNo() {
        return this.policyNo;
    }

    public final String getPolicyPdfUrl() {
        return this.policyPdfUrl;
    }

    public final long getPolicyStartDate() {
        return this.policyStartDate;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final String getProviderLogoUrl() {
        return this.providerLogoUrl;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getProviderPhone() {
        return this.providerPhone;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.docKey) * 31) + C7397t.m28148a(this.clientKey)) * 31) + this.providerId.hashCode()) * 31;
        String str = this.prodType;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.policyNo.hashCode()) * 31;
        BigDecimal bigDecimal = this.insLimit;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.insLimitCcy;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.insPremium;
        int hashCode4 = (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str3 = this.insPremiumCcy;
        int hashCode5 = (((((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + C7397t.m28148a(this.policyStartDate)) * 31) + C7397t.m28148a(this.policyEndDate)) * 31;
        Long l = this.policyFileId;
        int hashCode6 = (((((((((((hashCode5 + (l == null ? 0 : l.hashCode())) * 31) + this.insuredFirstName.hashCode()) * 31) + this.insuredLastName.hashCode()) * 31) + this.insuredFirstNameEn.hashCode()) * 31) + this.insuredLastNameEn.hashCode()) * 31) + this.insuredPin.hashCode()) * 31;
        YesNoApiEntity yesNoApiEntity = this.addCoverage;
        if (yesNoApiEntity != null) {
            i = yesNoApiEntity.hashCode();
        }
        return ((((((((((((hashCode6 + i) * 31) + this.productName.hashCode()) * 31) + this.providerName.hashCode()) * 31) + this.providerLogoUrl.hashCode()) * 31) + this.providerPhone.hashCode()) * 31) + this.policyPdfUrl.hashCode()) * 31) + this.contactInformation.hashCode();
    }

    public String toString() {
        long j = this.docKey;
        long j2 = this.clientKey;
        String str = this.providerId;
        String str2 = this.prodType;
        String str3 = this.policyNo;
        BigDecimal bigDecimal = this.insLimit;
        String str4 = this.insLimitCcy;
        BigDecimal bigDecimal2 = this.insPremium;
        String str5 = this.insPremiumCcy;
        long j3 = this.policyStartDate;
        long j4 = this.policyEndDate;
        Long l = this.policyFileId;
        String str6 = this.insuredFirstName;
        String str7 = this.insuredLastName;
        String str8 = this.insuredFirstNameEn;
        String str9 = this.insuredLastNameEn;
        String str10 = this.insuredPin;
        YesNoApiEntity yesNoApiEntity = this.addCoverage;
        String str11 = this.productName;
        String str12 = this.providerName;
        String str13 = this.providerLogoUrl;
        String str14 = this.providerPhone;
        String str15 = this.policyPdfUrl;
        List<ContactInformationApiModel> list = this.contactInformation;
        return "TravelPolicyApiModel(docKey=" + j + ", clientKey=" + j2 + ", providerId=" + str + ", prodType=" + str2 + ", policyNo=" + str3 + ", insLimit=" + bigDecimal + ", insLimitCcy=" + str4 + ", insPremium=" + bigDecimal2 + ", insPremiumCcy=" + str5 + ", policyStartDate=" + j3 + ", policyEndDate=" + j4 + ", policyFileId=" + l + ", insuredFirstName=" + str6 + ", insuredLastName=" + str7 + ", insuredFirstNameEn=" + str8 + ", insuredLastNameEn=" + str9 + ", insuredPin=" + str10 + ", addCoverage=" + yesNoApiEntity + ", productName=" + str11 + ", providerName=" + str12 + ", providerLogoUrl=" + str13 + ", providerPhone=" + str14 + ", policyPdfUrl=" + str15 + ", contactInformation=" + list + ")";
    }
}
