package p341ge.bog.mobilebank.cardapplications.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.model.OrderCardParamsObject */
public final class OrderCardParamsObject extends OtpParams {
    private final String UTMCampaign;
    private final String UTMMedium;
    private final String UTMSource;
    private final String acctKey;
    private final String activationDepartment;
    private final String appType;
    private final String cardCloseFlag;
    private final String ccy;
    private final Long childClientKey;
    private final String createDigitalCard;
    private final String csAddress;
    private final String csDistrictId;
    private final String csFeeAmount;
    private final String csFeeCcy;
    private final String csFlag;
    private final String csOwnerBirthDate;
    private final String csOwnerFirstName;
    private final String csOwnerLastName;
    private final String csOwnerPhoneNumber;
    private final String dailyLimitType;
    private final String designCode;
    private final String insuranceType;
    private final String nameOnCard;
    private final String operationId;
    private final String operationReference;
    private final Long orgId;
    private final String ownerIsReceiver;
    private final String pinDeliveryPhone;
    private final String pinDeliveryType;
    private final String preContractText;
    private final String printDigitalCard;
    private final String product;
    private final String regType;
    private final String replaceCardId;
    private final String scaAuthCode;
    private final String serviceId;
    private final String tmxSessionId;
    private final int useNicknameOnCard;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderCardParamsObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Long l, Long l2, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, i, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, l, l2, str23, str24, str25, str26, str27, str28, str29, str30, str31, (i3 & 4) != 0 ? UserRestrictions.CARDS_APPLICATIONS_REGISTER : str32, (i3 & 8) != 0 ? null : str33, (i3 & 16) != 0 ? null : str34, (i3 & 32) != 0 ? null : str35);
    }

    public static /* synthetic */ OrderCardParamsObject copy$default(OrderCardParamsObject orderCardParamsObject, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Long l, Long l2, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, int i2, int i3, Object obj) {
        OrderCardParamsObject orderCardParamsObject2 = orderCardParamsObject;
        int i4 = i2;
        return orderCardParamsObject.copy((i4 & 1) != 0 ? orderCardParamsObject2.appType : str, (i4 & 2) != 0 ? orderCardParamsObject2.regType : str2, (i4 & 4) != 0 ? orderCardParamsObject2.product : str3, (i4 & 8) != 0 ? orderCardParamsObject2.nameOnCard : str4, (i4 & 16) != 0 ? orderCardParamsObject2.ccy : str5, (i4 & 32) != 0 ? orderCardParamsObject2.acctKey : str6, (i4 & 64) != 0 ? orderCardParamsObject2.activationDepartment : str7, (i4 & 128) != 0 ? orderCardParamsObject2.pinDeliveryType : str8, (i4 & C11398b.f33139r) != 0 ? orderCardParamsObject2.pinDeliveryPhone : str9, (i4 & C11398b.f33140s) != 0 ? orderCardParamsObject2.useNicknameOnCard : i, (i4 & C11398b.f33141t) != 0 ? orderCardParamsObject2.createDigitalCard : str10, (i4 & C11398b.f33142u) != 0 ? orderCardParamsObject2.cardCloseFlag : str11, (i4 & C11398b.f33143v) != 0 ? orderCardParamsObject2.replaceCardId : str12, (i4 & 8192) != 0 ? orderCardParamsObject2.csFlag : str13, (i4 & 16384) != 0 ? orderCardParamsObject2.csDistrictId : str14, (i4 & 32768) != 0 ? orderCardParamsObject2.csAddress : str15, (i4 & 65536) != 0 ? orderCardParamsObject2.ownerIsReceiver : str16, (i4 & 131072) != 0 ? orderCardParamsObject2.csOwnerFirstName : str17, (i4 & 262144) != 0 ? orderCardParamsObject2.csOwnerLastName : str18, (i4 & 524288) != 0 ? orderCardParamsObject2.csOwnerBirthDate : str19, (i4 & 1048576) != 0 ? orderCardParamsObject2.csOwnerPhoneNumber : str20, (i4 & 2097152) != 0 ? orderCardParamsObject2.csFeeAmount : str21, (i4 & 4194304) != 0 ? orderCardParamsObject2.csFeeCcy : str22, (i4 & 8388608) != 0 ? orderCardParamsObject2.orgId : l, (i4 & 16777216) != 0 ? orderCardParamsObject2.childClientKey : l2, (i4 & 33554432) != 0 ? orderCardParamsObject2.UTMMedium : str23, (i4 & 67108864) != 0 ? orderCardParamsObject2.UTMSource : str24, (i4 & 134217728) != 0 ? orderCardParamsObject2.UTMCampaign : str25, (i4 & 268435456) != 0 ? orderCardParamsObject2.insuranceType : str26, (i4 & 536870912) != 0 ? orderCardParamsObject2.dailyLimitType : str27, (i4 & 1073741824) != 0 ? orderCardParamsObject2.printDigitalCard : str28, (i4 & Integer.MIN_VALUE) != 0 ? orderCardParamsObject2.tmxSessionId : str29, (i3 & 1) != 0 ? orderCardParamsObject2.preContractText : str30, (i3 & 2) != 0 ? orderCardParamsObject2.designCode : str31, (i3 & 4) != 0 ? orderCardParamsObject2.serviceId : str32, (i3 & 8) != 0 ? orderCardParamsObject2.operationId : str33, (i3 & 16) != 0 ? orderCardParamsObject2.operationReference : str34, (i3 & 32) != 0 ? orderCardParamsObject2.scaAuthCode : str35);
    }

    public final String component1() {
        return this.appType;
    }

    public final int component10() {
        return this.useNicknameOnCard;
    }

    public final String component11() {
        return this.createDigitalCard;
    }

    public final String component12() {
        return this.cardCloseFlag;
    }

    public final String component13() {
        return this.replaceCardId;
    }

    public final String component14() {
        return this.csFlag;
    }

    public final String component15() {
        return this.csDistrictId;
    }

    public final String component16() {
        return this.csAddress;
    }

    public final String component17() {
        return this.ownerIsReceiver;
    }

    public final String component18() {
        return this.csOwnerFirstName;
    }

    public final String component19() {
        return this.csOwnerLastName;
    }

    public final String component2() {
        return this.regType;
    }

    public final String component20() {
        return this.csOwnerBirthDate;
    }

    public final String component21() {
        return this.csOwnerPhoneNumber;
    }

    public final String component22() {
        return this.csFeeAmount;
    }

    public final String component23() {
        return this.csFeeCcy;
    }

    public final Long component24() {
        return this.orgId;
    }

    public final Long component25() {
        return this.childClientKey;
    }

    public final String component26() {
        return this.UTMMedium;
    }

    public final String component27() {
        return this.UTMSource;
    }

    public final String component28() {
        return this.UTMCampaign;
    }

    public final String component29() {
        return this.insuranceType;
    }

    public final String component3() {
        return this.product;
    }

    public final String component30() {
        return this.dailyLimitType;
    }

    public final String component31() {
        return this.printDigitalCard;
    }

    public final String component32() {
        return this.tmxSessionId;
    }

    public final String component33() {
        return this.preContractText;
    }

    public final String component34() {
        return this.designCode;
    }

    public final String component35() {
        return this.serviceId;
    }

    public final String component36() {
        return this.operationId;
    }

    public final String component37() {
        return this.operationReference;
    }

    public final String component38() {
        return this.scaAuthCode;
    }

    public final String component4() {
        return this.nameOnCard;
    }

    public final String component5() {
        return this.ccy;
    }

    public final String component6() {
        return this.acctKey;
    }

    public final String component7() {
        return this.activationDepartment;
    }

    public final String component8() {
        return this.pinDeliveryType;
    }

    public final String component9() {
        return this.pinDeliveryPhone;
    }

    public final OrderCardParamsObject copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Long l, Long l2, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35) {
        String str36 = str;
        C41536l.m120489i(str36, "appType");
        C41536l.m120489i(str2, "regType");
        C41536l.m120489i(str3, "product");
        C41536l.m120489i(str4, "nameOnCard");
        C41536l.m120489i(str8, "pinDeliveryType");
        C41536l.m120489i(str10, "createDigitalCard");
        C41536l.m120489i(str11, "cardCloseFlag");
        C41536l.m120489i(str13, "csFlag");
        C41536l.m120489i(str16, "ownerIsReceiver");
        C41536l.m120489i(str32, IRetrofitService.SERVICE_ID);
        return new OrderCardParamsObject(str36, str2, str3, str4, str5, str6, str7, str8, str9, i, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, l, l2, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCardParamsObject)) {
            return false;
        }
        OrderCardParamsObject orderCardParamsObject = (OrderCardParamsObject) obj;
        return C41536l.m120484d(this.appType, orderCardParamsObject.appType) && C41536l.m120484d(this.regType, orderCardParamsObject.regType) && C41536l.m120484d(this.product, orderCardParamsObject.product) && C41536l.m120484d(this.nameOnCard, orderCardParamsObject.nameOnCard) && C41536l.m120484d(this.ccy, orderCardParamsObject.ccy) && C41536l.m120484d(this.acctKey, orderCardParamsObject.acctKey) && C41536l.m120484d(this.activationDepartment, orderCardParamsObject.activationDepartment) && C41536l.m120484d(this.pinDeliveryType, orderCardParamsObject.pinDeliveryType) && C41536l.m120484d(this.pinDeliveryPhone, orderCardParamsObject.pinDeliveryPhone) && this.useNicknameOnCard == orderCardParamsObject.useNicknameOnCard && C41536l.m120484d(this.createDigitalCard, orderCardParamsObject.createDigitalCard) && C41536l.m120484d(this.cardCloseFlag, orderCardParamsObject.cardCloseFlag) && C41536l.m120484d(this.replaceCardId, orderCardParamsObject.replaceCardId) && C41536l.m120484d(this.csFlag, orderCardParamsObject.csFlag) && C41536l.m120484d(this.csDistrictId, orderCardParamsObject.csDistrictId) && C41536l.m120484d(this.csAddress, orderCardParamsObject.csAddress) && C41536l.m120484d(this.ownerIsReceiver, orderCardParamsObject.ownerIsReceiver) && C41536l.m120484d(this.csOwnerFirstName, orderCardParamsObject.csOwnerFirstName) && C41536l.m120484d(this.csOwnerLastName, orderCardParamsObject.csOwnerLastName) && C41536l.m120484d(this.csOwnerBirthDate, orderCardParamsObject.csOwnerBirthDate) && C41536l.m120484d(this.csOwnerPhoneNumber, orderCardParamsObject.csOwnerPhoneNumber) && C41536l.m120484d(this.csFeeAmount, orderCardParamsObject.csFeeAmount) && C41536l.m120484d(this.csFeeCcy, orderCardParamsObject.csFeeCcy) && C41536l.m120484d(this.orgId, orderCardParamsObject.orgId) && C41536l.m120484d(this.childClientKey, orderCardParamsObject.childClientKey) && C41536l.m120484d(this.UTMMedium, orderCardParamsObject.UTMMedium) && C41536l.m120484d(this.UTMSource, orderCardParamsObject.UTMSource) && C41536l.m120484d(this.UTMCampaign, orderCardParamsObject.UTMCampaign) && C41536l.m120484d(this.insuranceType, orderCardParamsObject.insuranceType) && C41536l.m120484d(this.dailyLimitType, orderCardParamsObject.dailyLimitType) && C41536l.m120484d(this.printDigitalCard, orderCardParamsObject.printDigitalCard) && C41536l.m120484d(this.tmxSessionId, orderCardParamsObject.tmxSessionId) && C41536l.m120484d(this.preContractText, orderCardParamsObject.preContractText) && C41536l.m120484d(this.designCode, orderCardParamsObject.designCode) && C41536l.m120484d(this.serviceId, orderCardParamsObject.serviceId) && C41536l.m120484d(this.operationId, orderCardParamsObject.operationId) && C41536l.m120484d(this.operationReference, orderCardParamsObject.operationReference) && C41536l.m120484d(this.scaAuthCode, orderCardParamsObject.scaAuthCode);
    }

    public final String getAcctKey() {
        return this.acctKey;
    }

    public final String getActivationDepartment() {
        return this.activationDepartment;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final String getCardCloseFlag() {
        return this.cardCloseFlag;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getChildClientKey() {
        return this.childClientKey;
    }

    public final String getCreateDigitalCard() {
        return this.createDigitalCard;
    }

    public final String getCsAddress() {
        return this.csAddress;
    }

    public final String getCsDistrictId() {
        return this.csDistrictId;
    }

    public final String getCsFeeAmount() {
        return this.csFeeAmount;
    }

    public final String getCsFeeCcy() {
        return this.csFeeCcy;
    }

    public final String getCsFlag() {
        return this.csFlag;
    }

    public final String getCsOwnerBirthDate() {
        return this.csOwnerBirthDate;
    }

    public final String getCsOwnerFirstName() {
        return this.csOwnerFirstName;
    }

    public final String getCsOwnerLastName() {
        return this.csOwnerLastName;
    }

    public final String getCsOwnerPhoneNumber() {
        return this.csOwnerPhoneNumber;
    }

    public final String getDailyLimitType() {
        return this.dailyLimitType;
    }

    public final String getDesignCode() {
        return this.designCode;
    }

    public final String getInsuranceType() {
        return this.insuranceType;
    }

    public final String getNameOnCard() {
        return this.nameOnCard;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final Long getOrgId() {
        return this.orgId;
    }

    public final String getOwnerIsReceiver() {
        return this.ownerIsReceiver;
    }

    public final String getPinDeliveryPhone() {
        return this.pinDeliveryPhone;
    }

    public final String getPinDeliveryType() {
        return this.pinDeliveryType;
    }

    public final String getPreContractText() {
        return this.preContractText;
    }

    public final String getPrintDigitalCard() {
        return this.printDigitalCard;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getRegType() {
        return this.regType;
    }

    public final String getReplaceCardId() {
        return this.replaceCardId;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    public final String getUTMCampaign() {
        return this.UTMCampaign;
    }

    public final String getUTMMedium() {
        return this.UTMMedium;
    }

    public final String getUTMSource() {
        return this.UTMSource;
    }

    public final int getUseNicknameOnCard() {
        return this.useNicknameOnCard;
    }

    public int hashCode() {
        int hashCode = ((((((this.appType.hashCode() * 31) + this.regType.hashCode()) * 31) + this.product.hashCode()) * 31) + this.nameOnCard.hashCode()) * 31;
        String str = this.ccy;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acctKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.activationDepartment;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.pinDeliveryType.hashCode()) * 31;
        String str4 = this.pinDeliveryPhone;
        int hashCode5 = (((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.useNicknameOnCard) * 31) + this.createDigitalCard.hashCode()) * 31) + this.cardCloseFlag.hashCode()) * 31;
        String str5 = this.replaceCardId;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.csFlag.hashCode()) * 31;
        String str6 = this.csDistrictId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.csAddress;
        int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.ownerIsReceiver.hashCode()) * 31;
        String str8 = this.csOwnerFirstName;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.csOwnerLastName;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.csOwnerBirthDate;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.csOwnerPhoneNumber;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.csFeeAmount;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.csFeeCcy;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l = this.orgId;
        int hashCode15 = (hashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.childClientKey;
        int hashCode16 = (hashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str14 = this.UTMMedium;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.UTMSource;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.UTMCampaign;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.insuranceType;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.dailyLimitType;
        int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.printDigitalCard;
        int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.tmxSessionId;
        int hashCode23 = (hashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.preContractText;
        int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.designCode;
        int hashCode25 = (((hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31) + this.serviceId.hashCode()) * 31;
        String str23 = this.operationId;
        int hashCode26 = (hashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.operationReference;
        int hashCode27 = (hashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.scaAuthCode;
        if (str25 != null) {
            i = str25.hashCode();
        }
        return hashCode27 + i;
    }

    public String toString() {
        String str = this.appType;
        String str2 = this.regType;
        String str3 = this.product;
        String str4 = this.nameOnCard;
        String str5 = this.ccy;
        String str6 = this.acctKey;
        String str7 = this.activationDepartment;
        String str8 = this.pinDeliveryType;
        String str9 = this.pinDeliveryPhone;
        int i = this.useNicknameOnCard;
        String str10 = this.createDigitalCard;
        String str11 = this.cardCloseFlag;
        String str12 = this.replaceCardId;
        String str13 = this.csFlag;
        String str14 = this.csDistrictId;
        String str15 = this.csAddress;
        String str16 = this.ownerIsReceiver;
        String str17 = this.csOwnerFirstName;
        String str18 = this.csOwnerLastName;
        String str19 = this.csOwnerBirthDate;
        String str20 = this.csOwnerPhoneNumber;
        String str21 = this.csFeeAmount;
        String str22 = this.csFeeCcy;
        Long l = this.orgId;
        Long l2 = this.childClientKey;
        String str23 = this.UTMMedium;
        String str24 = this.UTMSource;
        String str25 = this.UTMCampaign;
        String str26 = this.insuranceType;
        String str27 = this.dailyLimitType;
        String str28 = this.printDigitalCard;
        String str29 = this.tmxSessionId;
        String str30 = this.preContractText;
        String str31 = this.designCode;
        String str32 = this.serviceId;
        String str33 = this.operationId;
        String str34 = this.operationReference;
        String str35 = this.scaAuthCode;
        return "OrderCardParamsObject(appType=" + str + ", regType=" + str2 + ", product=" + str3 + ", nameOnCard=" + str4 + ", ccy=" + str5 + ", acctKey=" + str6 + ", activationDepartment=" + str7 + ", pinDeliveryType=" + str8 + ", pinDeliveryPhone=" + str9 + ", useNicknameOnCard=" + i + ", createDigitalCard=" + str10 + ", cardCloseFlag=" + str11 + ", replaceCardId=" + str12 + ", csFlag=" + str13 + ", csDistrictId=" + str14 + ", csAddress=" + str15 + ", ownerIsReceiver=" + str16 + ", csOwnerFirstName=" + str17 + ", csOwnerLastName=" + str18 + ", csOwnerBirthDate=" + str19 + ", csOwnerPhoneNumber=" + str20 + ", csFeeAmount=" + str21 + ", csFeeCcy=" + str22 + ", orgId=" + l + ", childClientKey=" + l2 + ", UTMMedium=" + str23 + ", UTMSource=" + str24 + ", UTMCampaign=" + str25 + ", insuranceType=" + str26 + ", dailyLimitType=" + str27 + ", printDigitalCard=" + str28 + ", tmxSessionId=" + str29 + ", preContractText=" + str30 + ", designCode=" + str31 + ", serviceId=" + str32 + ", operationId=" + str33 + ", operationReference=" + str34 + ", scaAuthCode=" + str35 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OrderCardParamsObject(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.Long r39, java.lang.Long r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r23
            r6 = r26
            r7 = r27
            r8 = r29
            r9 = r32
            r10 = r50
            r11 = r51
            r12 = r52
            r13 = r53
            java.lang.String r14 = "appType"
            kotlin.jvm.internal.C41536l.m120489i(r1, r14)
            java.lang.String r14 = "regType"
            kotlin.jvm.internal.C41536l.m120489i(r2, r14)
            java.lang.String r14 = "product"
            kotlin.jvm.internal.C41536l.m120489i(r3, r14)
            java.lang.String r14 = "nameOnCard"
            kotlin.jvm.internal.C41536l.m120489i(r4, r14)
            java.lang.String r14 = "pinDeliveryType"
            kotlin.jvm.internal.C41536l.m120489i(r5, r14)
            java.lang.String r14 = "createDigitalCard"
            kotlin.jvm.internal.C41536l.m120489i(r6, r14)
            java.lang.String r14 = "cardCloseFlag"
            kotlin.jvm.internal.C41536l.m120489i(r7, r14)
            java.lang.String r14 = "csFlag"
            kotlin.jvm.internal.C41536l.m120489i(r8, r14)
            java.lang.String r14 = "ownerIsReceiver"
            kotlin.jvm.internal.C41536l.m120489i(r9, r14)
            java.lang.String r14 = "serviceId"
            kotlin.jvm.internal.C41536l.m120489i(r10, r14)
            r15.<init>(r10, r11, r12, r13)
            r0.appType = r1
            r0.regType = r2
            r0.product = r3
            r0.nameOnCard = r4
            r1 = r20
            r0.ccy = r1
            r1 = r21
            r0.acctKey = r1
            r1 = r22
            r0.activationDepartment = r1
            r0.pinDeliveryType = r5
            r1 = r24
            r0.pinDeliveryPhone = r1
            r1 = r25
            r0.useNicknameOnCard = r1
            r0.createDigitalCard = r6
            r0.cardCloseFlag = r7
            r1 = r28
            r0.replaceCardId = r1
            r0.csFlag = r8
            r1 = r30
            r0.csDistrictId = r1
            r1 = r31
            r0.csAddress = r1
            r0.ownerIsReceiver = r9
            r1 = r33
            r0.csOwnerFirstName = r1
            r1 = r34
            r0.csOwnerLastName = r1
            r1 = r35
            r0.csOwnerBirthDate = r1
            r1 = r36
            r0.csOwnerPhoneNumber = r1
            r1 = r37
            r0.csFeeAmount = r1
            r1 = r38
            r0.csFeeCcy = r1
            r1 = r39
            r0.orgId = r1
            r1 = r40
            r0.childClientKey = r1
            r1 = r41
            r0.UTMMedium = r1
            r1 = r42
            r0.UTMSource = r1
            r1 = r43
            r0.UTMCampaign = r1
            r1 = r44
            r0.insuranceType = r1
            r1 = r45
            r0.dailyLimitType = r1
            r1 = r46
            r0.printDigitalCard = r1
            r1 = r47
            r0.tmxSessionId = r1
            r1 = r48
            r0.preContractText = r1
            r1 = r49
            r0.designCode = r1
            r0.serviceId = r10
            r0.operationId = r11
            r0.operationReference = r12
            r0.scaAuthCode = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.data.model.OrderCardParamsObject.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
