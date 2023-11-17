package p341ge.bog.mobilebank.insurance.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.data.model.PolicyApiModel */
public final class PolicyApiModel {
    private final String carNumber;
    private final long carOwnerBirthDate;
    private final String carOwnerFirstName;
    private final String carOwnerLastName;
    private final String carOwnerPin;
    private final long clientKey;
    private final YesNoApiEntity directDebitStatus;
    private final long docKey;
    private final BigDecimal insLimit;
    private final String insLimitCcy;
    private final BigDecimal insPremium;
    private final String insPremiumCcy;
    private final boolean isOwnersCar;
    private final String payPeriod;
    private final String paymentPeriodName;
    private final long policyCreateDate;
    private final long policyEndDate;
    private final Long policyFileId;
    private final String policyNo;
    private final String policyPdfUrl;
    private final long policyStartDate;
    private final String productName;
    private final String productType;
    private final String providerId;
    private final String providerLogoUrl;
    private final String providerName;
    private final String providerPhone;

    public PolicyApiModel(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, long j3, long j4, long j5, String str6, Long l, String str7, String str8, String str9, long j6, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, String str15, String str16, boolean z) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        YesNoApiEntity yesNoApiEntity2 = yesNoApiEntity;
        String str25 = str11;
        String str26 = str12;
        String str27 = str14;
        String str28 = str15;
        C41536l.m120489i(str17, "providerId");
        C41536l.m120489i(str18, "productType");
        C41536l.m120489i(str19, "policyNo");
        C41536l.m120489i(str20, "payPeriod");
        C41536l.m120489i(str21, "carOwnerFirstName");
        C41536l.m120489i(str22, "carOwnerLastName");
        C41536l.m120489i(str23, "carOwnerPin");
        C41536l.m120489i(str24, "carNumber");
        C41536l.m120489i(yesNoApiEntity2, "directDebitStatus");
        C41536l.m120489i(str25, "productName");
        C41536l.m120489i(str26, "providerName");
        C41536l.m120489i(str27, "providerPhone");
        C41536l.m120489i(str28, "policyPdfUrl");
        C41536l.m120489i(str16, "paymentPeriodName");
        this.docKey = j;
        this.clientKey = j2;
        this.providerId = str17;
        this.productType = str18;
        this.policyNo = str19;
        this.insLimit = bigDecimal;
        this.insLimitCcy = str4;
        this.insPremium = bigDecimal2;
        this.insPremiumCcy = str5;
        this.policyCreateDate = j3;
        this.policyStartDate = j4;
        this.policyEndDate = j5;
        this.payPeriod = str20;
        this.policyFileId = l;
        this.carOwnerFirstName = str21;
        this.carOwnerLastName = str22;
        this.carOwnerPin = str23;
        this.carOwnerBirthDate = j6;
        this.carNumber = str24;
        this.directDebitStatus = yesNoApiEntity2;
        this.productName = str25;
        this.providerName = str26;
        this.providerLogoUrl = str13;
        this.providerPhone = str27;
        this.policyPdfUrl = str28;
        this.paymentPeriodName = str16;
        this.isOwnersCar = z;
    }

    public static /* synthetic */ PolicyApiModel copy$default(PolicyApiModel policyApiModel, long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, long j3, long j4, long j5, String str6, Long l, String str7, String str8, String str9, long j6, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, int i, Object obj) {
        PolicyApiModel policyApiModel2 = policyApiModel;
        int i2 = i;
        return policyApiModel.copy((i2 & 1) != 0 ? policyApiModel2.docKey : j, (i2 & 2) != 0 ? policyApiModel2.clientKey : j2, (i2 & 4) != 0 ? policyApiModel2.providerId : str, (i2 & 8) != 0 ? policyApiModel2.productType : str2, (i2 & 16) != 0 ? policyApiModel2.policyNo : str3, (i2 & 32) != 0 ? policyApiModel2.insLimit : bigDecimal, (i2 & 64) != 0 ? policyApiModel2.insLimitCcy : str4, (i2 & 128) != 0 ? policyApiModel2.insPremium : bigDecimal2, (i2 & C11398b.f33139r) != 0 ? policyApiModel2.insPremiumCcy : str5, (i2 & C11398b.f33140s) != 0 ? policyApiModel2.policyCreateDate : j3, (i2 & C11398b.f33141t) != 0 ? policyApiModel2.policyStartDate : j4, (i2 & C11398b.f33142u) != 0 ? policyApiModel2.policyEndDate : j5, (i2 & C11398b.f33143v) != 0 ? policyApiModel2.payPeriod : str6, (i2 & 8192) != 0 ? policyApiModel2.policyFileId : l, (i2 & 16384) != 0 ? policyApiModel2.carOwnerFirstName : str7, (i2 & 32768) != 0 ? policyApiModel2.carOwnerLastName : str8, (i2 & 65536) != 0 ? policyApiModel2.carOwnerPin : str9, (i2 & 131072) != 0 ? policyApiModel2.carOwnerBirthDate : j6, (i2 & 262144) != 0 ? policyApiModel2.carNumber : str10, (524288 & i2) != 0 ? policyApiModel2.directDebitStatus : yesNoApiEntity, (i2 & 1048576) != 0 ? policyApiModel2.productName : str11, (i2 & 2097152) != 0 ? policyApiModel2.providerName : str12, (i2 & 4194304) != 0 ? policyApiModel2.providerLogoUrl : str13, (i2 & 8388608) != 0 ? policyApiModel2.providerPhone : str14, (i2 & 16777216) != 0 ? policyApiModel2.policyPdfUrl : str15, (i2 & 33554432) != 0 ? policyApiModel2.paymentPeriodName : str16, (i2 & 67108864) != 0 ? policyApiModel2.isOwnersCar : z);
    }

    public final long component1() {
        return this.docKey;
    }

    public final long component10() {
        return this.policyCreateDate;
    }

    public final long component11() {
        return this.policyStartDate;
    }

    public final long component12() {
        return this.policyEndDate;
    }

    public final String component13() {
        return this.payPeriod;
    }

    public final Long component14() {
        return this.policyFileId;
    }

    public final String component15() {
        return this.carOwnerFirstName;
    }

    public final String component16() {
        return this.carOwnerLastName;
    }

    public final String component17() {
        return this.carOwnerPin;
    }

    public final long component18() {
        return this.carOwnerBirthDate;
    }

    public final String component19() {
        return this.carNumber;
    }

    public final long component2() {
        return this.clientKey;
    }

    public final YesNoApiEntity component20() {
        return this.directDebitStatus;
    }

    public final String component21() {
        return this.productName;
    }

    public final String component22() {
        return this.providerName;
    }

    public final String component23() {
        return this.providerLogoUrl;
    }

    public final String component24() {
        return this.providerPhone;
    }

    public final String component25() {
        return this.policyPdfUrl;
    }

    public final String component26() {
        return this.paymentPeriodName;
    }

    public final boolean component27() {
        return this.isOwnersCar;
    }

    public final String component3() {
        return this.providerId;
    }

    public final String component4() {
        return this.productType;
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

    public final PolicyApiModel copy(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, long j3, long j4, long j5, String str6, Long l, String str7, String str8, String str9, long j6, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, String str15, String str16, boolean z) {
        long j7 = j;
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(str2, "productType");
        C41536l.m120489i(str3, "policyNo");
        C41536l.m120489i(str6, "payPeriod");
        C41536l.m120489i(str7, "carOwnerFirstName");
        C41536l.m120489i(str8, "carOwnerLastName");
        C41536l.m120489i(str9, "carOwnerPin");
        C41536l.m120489i(str10, "carNumber");
        C41536l.m120489i(yesNoApiEntity, "directDebitStatus");
        C41536l.m120489i(str11, "productName");
        C41536l.m120489i(str12, "providerName");
        C41536l.m120489i(str14, "providerPhone");
        C41536l.m120489i(str15, "policyPdfUrl");
        C41536l.m120489i(str16, "paymentPeriodName");
        return new PolicyApiModel(j, j2, str, str2, str3, bigDecimal, str4, bigDecimal2, str5, j3, j4, j5, str6, l, str7, str8, str9, j6, str10, yesNoApiEntity, str11, str12, str13, str14, str15, str16, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyApiModel)) {
            return false;
        }
        PolicyApiModel policyApiModel = (PolicyApiModel) obj;
        return this.docKey == policyApiModel.docKey && this.clientKey == policyApiModel.clientKey && C41536l.m120484d(this.providerId, policyApiModel.providerId) && C41536l.m120484d(this.productType, policyApiModel.productType) && C41536l.m120484d(this.policyNo, policyApiModel.policyNo) && C41536l.m120484d(this.insLimit, policyApiModel.insLimit) && C41536l.m120484d(this.insLimitCcy, policyApiModel.insLimitCcy) && C41536l.m120484d(this.insPremium, policyApiModel.insPremium) && C41536l.m120484d(this.insPremiumCcy, policyApiModel.insPremiumCcy) && this.policyCreateDate == policyApiModel.policyCreateDate && this.policyStartDate == policyApiModel.policyStartDate && this.policyEndDate == policyApiModel.policyEndDate && C41536l.m120484d(this.payPeriod, policyApiModel.payPeriod) && C41536l.m120484d(this.policyFileId, policyApiModel.policyFileId) && C41536l.m120484d(this.carOwnerFirstName, policyApiModel.carOwnerFirstName) && C41536l.m120484d(this.carOwnerLastName, policyApiModel.carOwnerLastName) && C41536l.m120484d(this.carOwnerPin, policyApiModel.carOwnerPin) && this.carOwnerBirthDate == policyApiModel.carOwnerBirthDate && C41536l.m120484d(this.carNumber, policyApiModel.carNumber) && this.directDebitStatus == policyApiModel.directDebitStatus && C41536l.m120484d(this.productName, policyApiModel.productName) && C41536l.m120484d(this.providerName, policyApiModel.providerName) && C41536l.m120484d(this.providerLogoUrl, policyApiModel.providerLogoUrl) && C41536l.m120484d(this.providerPhone, policyApiModel.providerPhone) && C41536l.m120484d(this.policyPdfUrl, policyApiModel.policyPdfUrl) && C41536l.m120484d(this.paymentPeriodName, policyApiModel.paymentPeriodName) && this.isOwnersCar == policyApiModel.isOwnersCar;
    }

    public final String getCarNumber() {
        return this.carNumber;
    }

    public final long getCarOwnerBirthDate() {
        return this.carOwnerBirthDate;
    }

    public final String getCarOwnerFirstName() {
        return this.carOwnerFirstName;
    }

    public final String getCarOwnerLastName() {
        return this.carOwnerLastName;
    }

    public final String getCarOwnerPin() {
        return this.carOwnerPin;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final YesNoApiEntity getDirectDebitStatus() {
        return this.directDebitStatus;
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

    public final String getPayPeriod() {
        return this.payPeriod;
    }

    public final String getPaymentPeriodName() {
        return this.paymentPeriodName;
    }

    public final long getPolicyCreateDate() {
        return this.policyCreateDate;
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

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductType() {
        return this.productType;
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
        int a = ((((((((C7397t.m28148a(this.docKey) * 31) + C7397t.m28148a(this.clientKey)) * 31) + this.providerId.hashCode()) * 31) + this.productType.hashCode()) * 31) + this.policyNo.hashCode()) * 31;
        BigDecimal bigDecimal = this.insLimit;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.insLimitCcy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.insPremium;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.insPremiumCcy;
        int hashCode4 = (((((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + C7397t.m28148a(this.policyCreateDate)) * 31) + C7397t.m28148a(this.policyStartDate)) * 31) + C7397t.m28148a(this.policyEndDate)) * 31) + this.payPeriod.hashCode()) * 31;
        Long l = this.policyFileId;
        int hashCode5 = (((((((((((((((((hashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.carOwnerFirstName.hashCode()) * 31) + this.carOwnerLastName.hashCode()) * 31) + this.carOwnerPin.hashCode()) * 31) + C7397t.m28148a(this.carOwnerBirthDate)) * 31) + this.carNumber.hashCode()) * 31) + this.directDebitStatus.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.providerName.hashCode()) * 31;
        String str3 = this.providerLogoUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int hashCode6 = (((((((hashCode5 + i) * 31) + this.providerPhone.hashCode()) * 31) + this.policyPdfUrl.hashCode()) * 31) + this.paymentPeriodName.hashCode()) * 31;
        boolean z = this.isOwnersCar;
        if (z) {
            z = true;
        }
        return hashCode6 + (z ? 1 : 0);
    }

    public final boolean isOwnersCar() {
        return this.isOwnersCar;
    }

    public String toString() {
        long j = this.docKey;
        long j2 = this.clientKey;
        String str = this.providerId;
        String str2 = this.productType;
        String str3 = this.policyNo;
        BigDecimal bigDecimal = this.insLimit;
        String str4 = this.insLimitCcy;
        BigDecimal bigDecimal2 = this.insPremium;
        String str5 = this.insPremiumCcy;
        long j3 = this.policyCreateDate;
        long j4 = this.policyStartDate;
        long j5 = this.policyEndDate;
        String str6 = this.payPeriod;
        Long l = this.policyFileId;
        String str7 = this.carOwnerFirstName;
        String str8 = this.carOwnerLastName;
        String str9 = str6;
        String str10 = this.carOwnerPin;
        long j6 = this.carOwnerBirthDate;
        String str11 = this.carNumber;
        YesNoApiEntity yesNoApiEntity = this.directDebitStatus;
        String str12 = this.productName;
        String str13 = this.providerName;
        String str14 = this.providerLogoUrl;
        String str15 = this.providerPhone;
        String str16 = this.policyPdfUrl;
        String str17 = this.paymentPeriodName;
        boolean z = this.isOwnersCar;
        return "PolicyApiModel(docKey=" + j + ", clientKey=" + j2 + ", providerId=" + str + ", productType=" + str2 + ", policyNo=" + str3 + ", insLimit=" + bigDecimal + ", insLimitCcy=" + str4 + ", insPremium=" + bigDecimal2 + ", insPremiumCcy=" + str5 + ", policyCreateDate=" + j3 + ", policyStartDate=" + j4 + ", policyEndDate=" + j5 + ", payPeriod=" + str9 + ", policyFileId=" + l + ", carOwnerFirstName=" + str7 + ", carOwnerLastName=" + str8 + ", carOwnerPin=" + str10 + ", carOwnerBirthDate=" + j6 + ", carNumber=" + str11 + ", directDebitStatus=" + yesNoApiEntity + ", productName=" + str12 + ", providerName=" + str13 + ", providerLogoUrl=" + str14 + ", providerPhone=" + str15 + ", policyPdfUrl=" + str16 + ", paymentPeriodName=" + str17 + ", isOwnersCar=" + z + ")";
    }
}
