package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardEntity */
public final class DebitCardEntity {
    private final String advantagesKey;
    private final String appType;
    private final List<String> cardAdditionalParams;
    private final List<CardBenefitsEntity> cardBenefits;
    private final String cardDetailsKey;
    private final String cardLimitCheck;
    private final String cardNameKey;
    private final String cardNameValue;
    private final String cardPriceKey;
    private final String cardPriceValue;
    private final CardSmallImageEntity cardSmallImage;
    private final List<CardSubTypeEntity> cardSubTypes;
    private final List<ScoolCardOwnerEntity> clientChildren;
    private final List<DebitCardPayrollInfoEntity> clientPayrollInfo;
    private final YesNoApiEntity conciergeFlag;
    private final CsFlag csFlag;
    private final String customDesignFlag;
    private final String defaultCard;
    private final String designId;
    private final String detailsUrl;
    private final String digitalCardFlag;
    private final String digitalCardPriceKey;
    private final String digitalCardPriceValue;
    private final String expDateKey;
    private final String isCreditCard;
    private final YesNoApiEntity isStudentCard;
    private final long linkId;
    private final String minAmountKey;
    private final String objectUrl;
    private final String plcClass;
    private final YesNoApiEntity plcSchoolFlag;
    private final String plcType;
    private final String prodGroup;
    private final String product;
    private final String regionId;
    private final String subProductCode;
    private final DebitCardTextContainerEntity texts;
    private final String typeName;
    private final String useClientNickname;

    public DebitCardEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, DebitCardTextContainerEntity debitCardTextContainerEntity, List<CardSubTypeEntity> list, CsFlag csFlag2, List<DebitCardPayrollInfoEntity> list2, String str22, YesNoApiEntity yesNoApiEntity2, List<ScoolCardOwnerEntity> list3, String str23, CardSmallImageEntity cardSmallImageEntity, String str24, String str25, String str26, YesNoApiEntity yesNoApiEntity3, String str27, List<String> list4, List<CardBenefitsEntity> list5) {
        String str28 = str;
        String str29 = str2;
        String str30 = str3;
        String str31 = str4;
        String str32 = str5;
        String str33 = str6;
        String str34 = str7;
        String str35 = str8;
        String str36 = str9;
        YesNoApiEntity yesNoApiEntity4 = yesNoApiEntity;
        String str37 = str16;
        DebitCardTextContainerEntity debitCardTextContainerEntity2 = debitCardTextContainerEntity;
        List<CardBenefitsEntity> list6 = list5;
        C41536l.m120489i(str28, "plcClass");
        C41536l.m120489i(str29, "plcType");
        C41536l.m120489i(str30, "typeName");
        C41536l.m120489i(str31, "isCreditCard");
        C41536l.m120489i(str32, "appType");
        C41536l.m120489i(str33, "prodGroup");
        C41536l.m120489i(str34, "product");
        C41536l.m120489i(str35, "customDesignFlag");
        C41536l.m120489i(str36, "subProductCode");
        C41536l.m120489i(yesNoApiEntity4, "isStudentCard");
        C41536l.m120489i(str37, "useClientNickname");
        C41536l.m120489i(debitCardTextContainerEntity2, "texts");
        C41536l.m120489i(list6, "cardBenefits");
        this.plcClass = str28;
        this.plcType = str29;
        this.typeName = str30;
        this.isCreditCard = str31;
        this.appType = str32;
        this.prodGroup = str33;
        this.product = str34;
        this.linkId = j;
        this.customDesignFlag = str35;
        this.subProductCode = str36;
        this.objectUrl = str10;
        this.isStudentCard = yesNoApiEntity4;
        this.cardNameKey = str11;
        this.advantagesKey = str12;
        this.cardDetailsKey = str13;
        this.cardPriceKey = str14;
        this.expDateKey = str15;
        this.useClientNickname = str37;
        this.minAmountKey = str17;
        this.digitalCardFlag = str18;
        this.digitalCardPriceKey = str19;
        this.digitalCardPriceValue = str20;
        this.cardPriceValue = str21;
        this.texts = debitCardTextContainerEntity2;
        this.cardSubTypes = list;
        this.csFlag = csFlag2;
        this.clientPayrollInfo = list2;
        this.cardNameValue = str22;
        this.plcSchoolFlag = yesNoApiEntity2;
        this.clientChildren = list3;
        this.cardLimitCheck = str23;
        this.cardSmallImage = cardSmallImageEntity;
        this.defaultCard = str24;
        this.regionId = str25;
        this.detailsUrl = str26;
        this.conciergeFlag = yesNoApiEntity3;
        this.designId = str27;
        this.cardAdditionalParams = list4;
        this.cardBenefits = list6;
    }

    public static /* synthetic */ DebitCardEntity copy$default(DebitCardEntity debitCardEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, DebitCardTextContainerEntity debitCardTextContainerEntity, List list, CsFlag csFlag2, List list2, String str22, YesNoApiEntity yesNoApiEntity2, List list3, String str23, CardSmallImageEntity cardSmallImageEntity, String str24, String str25, String str26, YesNoApiEntity yesNoApiEntity3, String str27, List list4, List list5, int i, int i2, Object obj) {
        DebitCardEntity debitCardEntity2 = debitCardEntity;
        int i3 = i;
        return debitCardEntity.copy((i3 & 1) != 0 ? debitCardEntity2.plcClass : str, (i3 & 2) != 0 ? debitCardEntity2.plcType : str2, (i3 & 4) != 0 ? debitCardEntity2.typeName : str3, (i3 & 8) != 0 ? debitCardEntity2.isCreditCard : str4, (i3 & 16) != 0 ? debitCardEntity2.appType : str5, (i3 & 32) != 0 ? debitCardEntity2.prodGroup : str6, (i3 & 64) != 0 ? debitCardEntity2.product : str7, (i3 & 128) != 0 ? debitCardEntity2.linkId : j, (i3 & C11398b.f33139r) != 0 ? debitCardEntity2.customDesignFlag : str8, (i3 & C11398b.f33140s) != 0 ? debitCardEntity2.subProductCode : str9, (i3 & C11398b.f33141t) != 0 ? debitCardEntity2.objectUrl : str10, (i3 & C11398b.f33142u) != 0 ? debitCardEntity2.isStudentCard : yesNoApiEntity, (i3 & C11398b.f33143v) != 0 ? debitCardEntity2.cardNameKey : str11, (i3 & 8192) != 0 ? debitCardEntity2.advantagesKey : str12, (i3 & 16384) != 0 ? debitCardEntity2.cardDetailsKey : str13, (i3 & 32768) != 0 ? debitCardEntity2.cardPriceKey : str14, (i3 & 65536) != 0 ? debitCardEntity2.expDateKey : str15, (i3 & 131072) != 0 ? debitCardEntity2.useClientNickname : str16, (i3 & 262144) != 0 ? debitCardEntity2.minAmountKey : str17, (i3 & 524288) != 0 ? debitCardEntity2.digitalCardFlag : str18, (i3 & 1048576) != 0 ? debitCardEntity2.digitalCardPriceKey : str19, (i3 & 2097152) != 0 ? debitCardEntity2.digitalCardPriceValue : str20, (i3 & 4194304) != 0 ? debitCardEntity2.cardPriceValue : str21, (i3 & 8388608) != 0 ? debitCardEntity2.texts : debitCardTextContainerEntity, (i3 & 16777216) != 0 ? debitCardEntity2.cardSubTypes : list, (i3 & 33554432) != 0 ? debitCardEntity2.csFlag : csFlag2, (i3 & 67108864) != 0 ? debitCardEntity2.clientPayrollInfo : list2, (i3 & 134217728) != 0 ? debitCardEntity2.cardNameValue : str22, (i3 & 268435456) != 0 ? debitCardEntity2.plcSchoolFlag : yesNoApiEntity2, (i3 & 536870912) != 0 ? debitCardEntity2.clientChildren : list3, (i3 & 1073741824) != 0 ? debitCardEntity2.cardLimitCheck : str23, (i3 & Integer.MIN_VALUE) != 0 ? debitCardEntity2.cardSmallImage : cardSmallImageEntity, (i2 & 1) != 0 ? debitCardEntity2.defaultCard : str24, (i2 & 2) != 0 ? debitCardEntity2.regionId : str25, (i2 & 4) != 0 ? debitCardEntity2.detailsUrl : str26, (i2 & 8) != 0 ? debitCardEntity2.conciergeFlag : yesNoApiEntity3, (i2 & 16) != 0 ? debitCardEntity2.designId : str27, (i2 & 32) != 0 ? debitCardEntity2.cardAdditionalParams : list4, (i2 & 64) != 0 ? debitCardEntity2.cardBenefits : list5);
    }

    public final String component1() {
        return this.plcClass;
    }

    public final String component10() {
        return this.subProductCode;
    }

    public final String component11() {
        return this.objectUrl;
    }

    public final YesNoApiEntity component12() {
        return this.isStudentCard;
    }

    public final String component13() {
        return this.cardNameKey;
    }

    public final String component14() {
        return this.advantagesKey;
    }

    public final String component15() {
        return this.cardDetailsKey;
    }

    public final String component16() {
        return this.cardPriceKey;
    }

    public final String component17() {
        return this.expDateKey;
    }

    public final String component18() {
        return this.useClientNickname;
    }

    public final String component19() {
        return this.minAmountKey;
    }

    public final String component2() {
        return this.plcType;
    }

    public final String component20() {
        return this.digitalCardFlag;
    }

    public final String component21() {
        return this.digitalCardPriceKey;
    }

    public final String component22() {
        return this.digitalCardPriceValue;
    }

    public final String component23() {
        return this.cardPriceValue;
    }

    public final DebitCardTextContainerEntity component24() {
        return this.texts;
    }

    public final List<CardSubTypeEntity> component25() {
        return this.cardSubTypes;
    }

    public final CsFlag component26() {
        return this.csFlag;
    }

    public final List<DebitCardPayrollInfoEntity> component27() {
        return this.clientPayrollInfo;
    }

    public final String component28() {
        return this.cardNameValue;
    }

    public final YesNoApiEntity component29() {
        return this.plcSchoolFlag;
    }

    public final String component3() {
        return this.typeName;
    }

    public final List<ScoolCardOwnerEntity> component30() {
        return this.clientChildren;
    }

    public final String component31() {
        return this.cardLimitCheck;
    }

    public final CardSmallImageEntity component32() {
        return this.cardSmallImage;
    }

    public final String component33() {
        return this.defaultCard;
    }

    public final String component34() {
        return this.regionId;
    }

    public final String component35() {
        return this.detailsUrl;
    }

    public final YesNoApiEntity component36() {
        return this.conciergeFlag;
    }

    public final String component37() {
        return this.designId;
    }

    public final List<String> component38() {
        return this.cardAdditionalParams;
    }

    public final List<CardBenefitsEntity> component39() {
        return this.cardBenefits;
    }

    public final String component4() {
        return this.isCreditCard;
    }

    public final String component5() {
        return this.appType;
    }

    public final String component6() {
        return this.prodGroup;
    }

    public final String component7() {
        return this.product;
    }

    public final long component8() {
        return this.linkId;
    }

    public final String component9() {
        return this.customDesignFlag;
    }

    public final DebitCardEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, DebitCardTextContainerEntity debitCardTextContainerEntity, List<CardSubTypeEntity> list, CsFlag csFlag2, List<DebitCardPayrollInfoEntity> list2, String str22, YesNoApiEntity yesNoApiEntity2, List<ScoolCardOwnerEntity> list3, String str23, CardSmallImageEntity cardSmallImageEntity, String str24, String str25, String str26, YesNoApiEntity yesNoApiEntity3, String str27, List<String> list4, List<CardBenefitsEntity> list5) {
        String str28 = str;
        C41536l.m120489i(str28, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C41536l.m120489i(str3, "typeName");
        C41536l.m120489i(str4, "isCreditCard");
        C41536l.m120489i(str5, "appType");
        C41536l.m120489i(str6, "prodGroup");
        C41536l.m120489i(str7, "product");
        C41536l.m120489i(str8, "customDesignFlag");
        C41536l.m120489i(str9, "subProductCode");
        C41536l.m120489i(yesNoApiEntity, "isStudentCard");
        C41536l.m120489i(str16, "useClientNickname");
        C41536l.m120489i(debitCardTextContainerEntity, "texts");
        C41536l.m120489i(list5, "cardBenefits");
        return new DebitCardEntity(str28, str2, str3, str4, str5, str6, str7, j, str8, str9, str10, yesNoApiEntity, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, debitCardTextContainerEntity, list, csFlag2, list2, str22, yesNoApiEntity2, list3, str23, cardSmallImageEntity, str24, str25, str26, yesNoApiEntity3, str27, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardEntity)) {
            return false;
        }
        DebitCardEntity debitCardEntity = (DebitCardEntity) obj;
        return C41536l.m120484d(this.plcClass, debitCardEntity.plcClass) && C41536l.m120484d(this.plcType, debitCardEntity.plcType) && C41536l.m120484d(this.typeName, debitCardEntity.typeName) && C41536l.m120484d(this.isCreditCard, debitCardEntity.isCreditCard) && C41536l.m120484d(this.appType, debitCardEntity.appType) && C41536l.m120484d(this.prodGroup, debitCardEntity.prodGroup) && C41536l.m120484d(this.product, debitCardEntity.product) && this.linkId == debitCardEntity.linkId && C41536l.m120484d(this.customDesignFlag, debitCardEntity.customDesignFlag) && C41536l.m120484d(this.subProductCode, debitCardEntity.subProductCode) && C41536l.m120484d(this.objectUrl, debitCardEntity.objectUrl) && this.isStudentCard == debitCardEntity.isStudentCard && C41536l.m120484d(this.cardNameKey, debitCardEntity.cardNameKey) && C41536l.m120484d(this.advantagesKey, debitCardEntity.advantagesKey) && C41536l.m120484d(this.cardDetailsKey, debitCardEntity.cardDetailsKey) && C41536l.m120484d(this.cardPriceKey, debitCardEntity.cardPriceKey) && C41536l.m120484d(this.expDateKey, debitCardEntity.expDateKey) && C41536l.m120484d(this.useClientNickname, debitCardEntity.useClientNickname) && C41536l.m120484d(this.minAmountKey, debitCardEntity.minAmountKey) && C41536l.m120484d(this.digitalCardFlag, debitCardEntity.digitalCardFlag) && C41536l.m120484d(this.digitalCardPriceKey, debitCardEntity.digitalCardPriceKey) && C41536l.m120484d(this.digitalCardPriceValue, debitCardEntity.digitalCardPriceValue) && C41536l.m120484d(this.cardPriceValue, debitCardEntity.cardPriceValue) && C41536l.m120484d(this.texts, debitCardEntity.texts) && C41536l.m120484d(this.cardSubTypes, debitCardEntity.cardSubTypes) && this.csFlag == debitCardEntity.csFlag && C41536l.m120484d(this.clientPayrollInfo, debitCardEntity.clientPayrollInfo) && C41536l.m120484d(this.cardNameValue, debitCardEntity.cardNameValue) && this.plcSchoolFlag == debitCardEntity.plcSchoolFlag && C41536l.m120484d(this.clientChildren, debitCardEntity.clientChildren) && C41536l.m120484d(this.cardLimitCheck, debitCardEntity.cardLimitCheck) && C41536l.m120484d(this.cardSmallImage, debitCardEntity.cardSmallImage) && C41536l.m120484d(this.defaultCard, debitCardEntity.defaultCard) && C41536l.m120484d(this.regionId, debitCardEntity.regionId) && C41536l.m120484d(this.detailsUrl, debitCardEntity.detailsUrl) && this.conciergeFlag == debitCardEntity.conciergeFlag && C41536l.m120484d(this.designId, debitCardEntity.designId) && C41536l.m120484d(this.cardAdditionalParams, debitCardEntity.cardAdditionalParams) && C41536l.m120484d(this.cardBenefits, debitCardEntity.cardBenefits);
    }

    public final String getAdvantagesKey() {
        return this.advantagesKey;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final List<String> getCardAdditionalParams() {
        return this.cardAdditionalParams;
    }

    public final List<CardBenefitsEntity> getCardBenefits() {
        return this.cardBenefits;
    }

    public final String getCardDetailsKey() {
        return this.cardDetailsKey;
    }

    public final String getCardLimitCheck() {
        return this.cardLimitCheck;
    }

    public final String getCardNameKey() {
        return this.cardNameKey;
    }

    public final String getCardNameValue() {
        return this.cardNameValue;
    }

    public final String getCardPriceKey() {
        return this.cardPriceKey;
    }

    public final String getCardPriceValue() {
        return this.cardPriceValue;
    }

    public final CardSmallImageEntity getCardSmallImage() {
        return this.cardSmallImage;
    }

    public final List<CardSubTypeEntity> getCardSubTypes() {
        return this.cardSubTypes;
    }

    public final List<ScoolCardOwnerEntity> getClientChildren() {
        return this.clientChildren;
    }

    public final List<DebitCardPayrollInfoEntity> getClientPayrollInfo() {
        return this.clientPayrollInfo;
    }

    public final YesNoApiEntity getConciergeFlag() {
        return this.conciergeFlag;
    }

    public final CsFlag getCsFlag() {
        return this.csFlag;
    }

    public final String getCustomDesignFlag() {
        return this.customDesignFlag;
    }

    public final String getDefaultCard() {
        return this.defaultCard;
    }

    public final String getDesignId() {
        return this.designId;
    }

    public final String getDetailsUrl() {
        return this.detailsUrl;
    }

    public final String getDigitalCardFlag() {
        return this.digitalCardFlag;
    }

    public final String getDigitalCardPriceKey() {
        return this.digitalCardPriceKey;
    }

    public final String getDigitalCardPriceValue() {
        return this.digitalCardPriceValue;
    }

    public final String getExpDateKey() {
        return this.expDateKey;
    }

    public final long getLinkId() {
        return this.linkId;
    }

    public final String getMinAmountKey() {
        return this.minAmountKey;
    }

    public final String getObjectUrl() {
        return this.objectUrl;
    }

    public final String getPlcClass() {
        return this.plcClass;
    }

    public final YesNoApiEntity getPlcSchoolFlag() {
        return this.plcSchoolFlag;
    }

    public final String getPlcType() {
        return this.plcType;
    }

    public final String getProdGroup() {
        return this.prodGroup;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getRegionId() {
        return this.regionId;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public final DebitCardTextContainerEntity getTexts() {
        return this.texts;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final String getUseClientNickname() {
        return this.useClientNickname;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.plcClass.hashCode() * 31) + this.plcType.hashCode()) * 31) + this.typeName.hashCode()) * 31) + this.isCreditCard.hashCode()) * 31) + this.appType.hashCode()) * 31) + this.prodGroup.hashCode()) * 31) + this.product.hashCode()) * 31) + C7397t.m28148a(this.linkId)) * 31) + this.customDesignFlag.hashCode()) * 31) + this.subProductCode.hashCode()) * 31;
        String str = this.objectUrl;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.isStudentCard.hashCode()) * 31;
        String str2 = this.cardNameKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.advantagesKey;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardDetailsKey;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardPriceKey;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.expDateKey;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.useClientNickname.hashCode()) * 31;
        String str7 = this.minAmountKey;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.digitalCardFlag;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.digitalCardPriceKey;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.digitalCardPriceValue;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cardPriceValue;
        int hashCode12 = (((hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.texts.hashCode()) * 31;
        List<CardSubTypeEntity> list = this.cardSubTypes;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        CsFlag csFlag2 = this.csFlag;
        int hashCode14 = (hashCode13 + (csFlag2 == null ? 0 : csFlag2.hashCode())) * 31;
        List<DebitCardPayrollInfoEntity> list2 = this.clientPayrollInfo;
        int hashCode15 = (hashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str12 = this.cardNameValue;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.plcSchoolFlag;
        int hashCode17 = (hashCode16 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        List<ScoolCardOwnerEntity> list3 = this.clientChildren;
        int hashCode18 = (hashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str13 = this.cardLimitCheck;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        CardSmallImageEntity cardSmallImageEntity = this.cardSmallImage;
        int hashCode20 = (hashCode19 + (cardSmallImageEntity == null ? 0 : cardSmallImageEntity.hashCode())) * 31;
        String str14 = this.defaultCard;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.regionId;
        int hashCode22 = (hashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.detailsUrl;
        int hashCode23 = (hashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.conciergeFlag;
        int hashCode24 = (hashCode23 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        String str17 = this.designId;
        int hashCode25 = (hashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31;
        List<String> list4 = this.cardAdditionalParams;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return ((hashCode25 + i) * 31) + this.cardBenefits.hashCode();
    }

    public final String isCreditCard() {
        return this.isCreditCard;
    }

    public final YesNoApiEntity isStudentCard() {
        return this.isStudentCard;
    }

    public String toString() {
        String str = this.plcClass;
        String str2 = this.plcType;
        String str3 = this.typeName;
        String str4 = this.isCreditCard;
        String str5 = this.appType;
        String str6 = this.prodGroup;
        String str7 = this.product;
        long j = this.linkId;
        String str8 = this.customDesignFlag;
        String str9 = this.subProductCode;
        String str10 = this.objectUrl;
        YesNoApiEntity yesNoApiEntity = this.isStudentCard;
        String str11 = this.cardNameKey;
        String str12 = this.advantagesKey;
        String str13 = this.cardDetailsKey;
        String str14 = this.cardPriceKey;
        String str15 = this.expDateKey;
        String str16 = this.useClientNickname;
        String str17 = this.minAmountKey;
        String str18 = this.digitalCardFlag;
        String str19 = this.digitalCardPriceKey;
        String str20 = this.digitalCardPriceValue;
        String str21 = this.cardPriceValue;
        DebitCardTextContainerEntity debitCardTextContainerEntity = this.texts;
        List<CardSubTypeEntity> list = this.cardSubTypes;
        CsFlag csFlag2 = this.csFlag;
        List<DebitCardPayrollInfoEntity> list2 = this.clientPayrollInfo;
        String str22 = this.cardNameValue;
        YesNoApiEntity yesNoApiEntity2 = this.plcSchoolFlag;
        List<ScoolCardOwnerEntity> list3 = this.clientChildren;
        String str23 = this.cardLimitCheck;
        CardSmallImageEntity cardSmallImageEntity = this.cardSmallImage;
        String str24 = this.defaultCard;
        String str25 = this.regionId;
        String str26 = this.detailsUrl;
        YesNoApiEntity yesNoApiEntity3 = this.conciergeFlag;
        String str27 = this.designId;
        List<String> list4 = this.cardAdditionalParams;
        List<CardBenefitsEntity> list5 = this.cardBenefits;
        return "DebitCardEntity(plcClass=" + str + ", plcType=" + str2 + ", typeName=" + str3 + ", isCreditCard=" + str4 + ", appType=" + str5 + ", prodGroup=" + str6 + ", product=" + str7 + ", linkId=" + j + ", customDesignFlag=" + str8 + ", subProductCode=" + str9 + ", objectUrl=" + str10 + ", isStudentCard=" + yesNoApiEntity + ", cardNameKey=" + str11 + ", advantagesKey=" + str12 + ", cardDetailsKey=" + str13 + ", cardPriceKey=" + str14 + ", expDateKey=" + str15 + ", useClientNickname=" + str16 + ", minAmountKey=" + str17 + ", digitalCardFlag=" + str18 + ", digitalCardPriceKey=" + str19 + ", digitalCardPriceValue=" + str20 + ", cardPriceValue=" + str21 + ", texts=" + debitCardTextContainerEntity + ", cardSubTypes=" + list + ", csFlag=" + csFlag2 + ", clientPayrollInfo=" + list2 + ", cardNameValue=" + str22 + ", plcSchoolFlag=" + yesNoApiEntity2 + ", clientChildren=" + list3 + ", cardLimitCheck=" + str23 + ", cardSmallImage=" + cardSmallImageEntity + ", defaultCard=" + str24 + ", regionId=" + str25 + ", detailsUrl=" + str26 + ", conciergeFlag=" + yesNoApiEntity3 + ", designId=" + str27 + ", cardAdditionalParams=" + list4 + ", cardBenefits=" + list5 + ")";
    }
}
