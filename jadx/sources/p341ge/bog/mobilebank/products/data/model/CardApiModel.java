package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CardApiModel */
public final class CardApiModel {
    private final long acctKey;
    private final String attachmentFileBase64;
    private final String cardClass;
    private final String cardClassCode;
    private final CardExternalFileApiModel cardExternalFile;
    private final String cardForTypeDictionaryKey;
    private final String cardForTypeDictionaryValue;
    private final String cardHolder;
    private final long cardId;
    private final Object cardInsSecEntity;
    private final String cardName;
    private final long cardOwnerClientKey;
    private final String cardPan;
    private final String cardPdfUrl;
    private final String cardType;
    private final long clientKey;
    private final YesNoApiModel closeCard;
    private final String dailyLimitType;
    private final String description;
    private final long expDate;
    private final CardExternalFileApiModel externalFile;
    private final YesNoApiEntity googlePay;

    /* renamed from: id */
    private final long f82303id;
    private final YesNoApiModel isCardExpiring;
    private final YesNoApiModel isCardInactive;
    private final YesNoApiModel isDefault;
    private final YesNoApiModel isDigitalCard;
    private final YesNoApiModel isHidden;
    private final boolean isPrimary;
    private final YesNoApiModel isScoolcard;
    private final String lastFour;
    private final String nameDictionaryKey;
    private final String nameDictionaryValue;
    private final YesNoApiEntity orderExpiredCard;
    private final YesNoApiModel orderRecoverCard;
    private final String paymentNetwork;
    private final String productCode;
    private final String productGroup;
    private final long productId;
    private final String status;
    private final String subProductCode;
    private final String subProductGroup;
    private final long subProductId;
    private final String vcPlasticStatus;

    public CardApiModel(long j, YesNoApiModel yesNoApiModel, long j2, long j3, long j4, String str, String str2, long j5, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j6, String str11, String str12, String str13, String str14, YesNoApiModel yesNoApiModel2, long j7, long j8, YesNoApiModel yesNoApiModel3, YesNoApiModel yesNoApiModel4, YesNoApiModel yesNoApiModel5, YesNoApiModel yesNoApiModel6, String str15, String str16, String str17, Object obj, boolean z, String str18, String str19, YesNoApiModel yesNoApiModel7, CardExternalFileApiModel cardExternalFileApiModel, String str20, CardExternalFileApiModel cardExternalFileApiModel2, YesNoApiModel yesNoApiModel8, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, String str21, String str22) {
        String str23 = str;
        String str24 = str4;
        String str25 = str5;
        String str26 = str6;
        String str27 = str8;
        String str28 = str10;
        String str29 = str11;
        String str30 = str14;
        YesNoApiModel yesNoApiModel9 = yesNoApiModel3;
        YesNoApiModel yesNoApiModel10 = yesNoApiModel4;
        YesNoApiModel yesNoApiModel11 = yesNoApiModel5;
        YesNoApiModel yesNoApiModel12 = yesNoApiModel6;
        String str31 = str18;
        C41536l.m120489i(str23, "cardClass");
        C41536l.m120489i(str24, "cardType");
        C41536l.m120489i(str25, "productCode");
        C41536l.m120489i(str26, "subProductCode");
        C41536l.m120489i(str27, "status");
        C41536l.m120489i(str28, "cardHolder");
        C41536l.m120489i(str29, "cardPan");
        C41536l.m120489i(str30, "productGroup");
        C41536l.m120489i(yesNoApiModel9, "isDefault");
        C41536l.m120489i(yesNoApiModel10, "isHidden");
        C41536l.m120489i(yesNoApiModel11, "isCardExpiring");
        C41536l.m120489i(yesNoApiModel12, "isCardInactive");
        C41536l.m120489i(str31, "description");
        C41536l.m120489i(str19, "paymentNetwork");
        C41536l.m120489i(yesNoApiEntity2, "googlePay");
        this.f82303id = j;
        this.closeCard = yesNoApiModel;
        this.cardId = j2;
        this.acctKey = j3;
        this.clientKey = j4;
        this.cardClass = str23;
        this.cardClassCode = str2;
        this.cardOwnerClientKey = j5;
        this.cardName = str3;
        this.cardType = str24;
        this.productCode = str25;
        this.subProductCode = str26;
        this.subProductGroup = str7;
        this.status = str27;
        this.lastFour = str9;
        this.cardHolder = str28;
        this.expDate = j6;
        this.cardPan = str29;
        this.cardForTypeDictionaryKey = str12;
        this.cardForTypeDictionaryValue = str13;
        this.productGroup = str30;
        this.isDigitalCard = yesNoApiModel2;
        this.productId = j7;
        this.subProductId = j8;
        this.isDefault = yesNoApiModel9;
        this.isHidden = yesNoApiModel10;
        this.isCardExpiring = yesNoApiModel11;
        this.isCardInactive = yesNoApiModel12;
        this.attachmentFileBase64 = str15;
        this.nameDictionaryKey = str16;
        this.nameDictionaryValue = str17;
        this.cardInsSecEntity = obj;
        this.isPrimary = z;
        this.description = str31;
        this.paymentNetwork = str19;
        this.isScoolcard = yesNoApiModel7;
        this.externalFile = cardExternalFileApiModel;
        this.cardPdfUrl = str20;
        this.cardExternalFile = cardExternalFileApiModel2;
        this.orderRecoverCard = yesNoApiModel8;
        this.orderExpiredCard = yesNoApiEntity;
        this.googlePay = yesNoApiEntity2;
        this.dailyLimitType = str21;
        this.vcPlasticStatus = str22;
    }

    public static /* synthetic */ CardApiModel copy$default(CardApiModel cardApiModel, long j, YesNoApiModel yesNoApiModel, long j2, long j3, long j4, String str, String str2, long j5, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j6, String str11, String str12, String str13, String str14, YesNoApiModel yesNoApiModel2, long j7, long j8, YesNoApiModel yesNoApiModel3, YesNoApiModel yesNoApiModel4, YesNoApiModel yesNoApiModel5, YesNoApiModel yesNoApiModel6, String str15, String str16, String str17, Object obj, boolean z, String str18, String str19, YesNoApiModel yesNoApiModel7, CardExternalFileApiModel cardExternalFileApiModel, String str20, CardExternalFileApiModel cardExternalFileApiModel2, YesNoApiModel yesNoApiModel8, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, String str21, String str22, int i, int i2, Object obj2) {
        CardApiModel cardApiModel2 = cardApiModel;
        int i3 = i;
        int i4 = i2;
        long j9 = (i3 & 1) != 0 ? cardApiModel2.f82303id : j;
        YesNoApiModel yesNoApiModel9 = (i3 & 2) != 0 ? cardApiModel2.closeCard : yesNoApiModel;
        long j12 = (i3 & 4) != 0 ? cardApiModel2.cardId : j2;
        long j13 = (i3 & 8) != 0 ? cardApiModel2.acctKey : j3;
        long j14 = (i3 & 16) != 0 ? cardApiModel2.clientKey : j4;
        String str23 = (i3 & 32) != 0 ? cardApiModel2.cardClass : str;
        String str24 = (i3 & 64) != 0 ? cardApiModel2.cardClassCode : str2;
        long j15 = (i3 & 128) != 0 ? cardApiModel2.cardOwnerClientKey : j5;
        String str25 = (i3 & C11398b.f33139r) != 0 ? cardApiModel2.cardName : str3;
        return cardApiModel.copy(j9, yesNoApiModel9, j12, j13, j14, str23, str24, j15, str25, (i3 & C11398b.f33140s) != 0 ? cardApiModel2.cardType : str4, (i3 & C11398b.f33141t) != 0 ? cardApiModel2.productCode : str5, (i3 & C11398b.f33142u) != 0 ? cardApiModel2.subProductCode : str6, (i3 & C11398b.f33143v) != 0 ? cardApiModel2.subProductGroup : str7, (i3 & 8192) != 0 ? cardApiModel2.status : str8, (i3 & 16384) != 0 ? cardApiModel2.lastFour : str9, (i3 & 32768) != 0 ? cardApiModel2.cardHolder : str10, (i3 & 65536) != 0 ? cardApiModel2.expDate : j6, (i3 & 131072) != 0 ? cardApiModel2.cardPan : str11, (262144 & i3) != 0 ? cardApiModel2.cardForTypeDictionaryKey : str12, (i3 & 524288) != 0 ? cardApiModel2.cardForTypeDictionaryValue : str13, (i3 & 1048576) != 0 ? cardApiModel2.productGroup : str14, (i3 & 2097152) != 0 ? cardApiModel2.isDigitalCard : yesNoApiModel2, (i3 & 4194304) != 0 ? cardApiModel2.productId : j7, (i3 & 8388608) != 0 ? cardApiModel2.subProductId : j8, (i3 & 16777216) != 0 ? cardApiModel2.isDefault : yesNoApiModel3, (33554432 & i3) != 0 ? cardApiModel2.isHidden : yesNoApiModel4, (i3 & 67108864) != 0 ? cardApiModel2.isCardExpiring : yesNoApiModel5, (i3 & 134217728) != 0 ? cardApiModel2.isCardInactive : yesNoApiModel6, (i3 & 268435456) != 0 ? cardApiModel2.attachmentFileBase64 : str15, (i3 & 536870912) != 0 ? cardApiModel2.nameDictionaryKey : str16, (i3 & 1073741824) != 0 ? cardApiModel2.nameDictionaryValue : str17, (i3 & Integer.MIN_VALUE) != 0 ? cardApiModel2.cardInsSecEntity : obj, (i4 & 1) != 0 ? cardApiModel2.isPrimary : z, (i4 & 2) != 0 ? cardApiModel2.description : str18, (i4 & 4) != 0 ? cardApiModel2.paymentNetwork : str19, (i4 & 8) != 0 ? cardApiModel2.isScoolcard : yesNoApiModel7, (i4 & 16) != 0 ? cardApiModel2.externalFile : cardExternalFileApiModel, (i4 & 32) != 0 ? cardApiModel2.cardPdfUrl : str20, (i4 & 64) != 0 ? cardApiModel2.cardExternalFile : cardExternalFileApiModel2, (i4 & 128) != 0 ? cardApiModel2.orderRecoverCard : yesNoApiModel8, (i4 & C11398b.f33139r) != 0 ? cardApiModel2.orderExpiredCard : yesNoApiEntity, (i4 & C11398b.f33140s) != 0 ? cardApiModel2.googlePay : yesNoApiEntity2, (i4 & C11398b.f33141t) != 0 ? cardApiModel2.dailyLimitType : str21, (i4 & C11398b.f33142u) != 0 ? cardApiModel2.vcPlasticStatus : str22);
    }

    public final long component1() {
        return this.f82303id;
    }

    public final String component10() {
        return this.cardType;
    }

    public final String component11() {
        return this.productCode;
    }

    public final String component12() {
        return this.subProductCode;
    }

    public final String component13() {
        return this.subProductGroup;
    }

    public final String component14() {
        return this.status;
    }

    public final String component15() {
        return this.lastFour;
    }

    public final String component16() {
        return this.cardHolder;
    }

    public final long component17() {
        return this.expDate;
    }

    public final String component18() {
        return this.cardPan;
    }

    public final String component19() {
        return this.cardForTypeDictionaryKey;
    }

    public final YesNoApiModel component2() {
        return this.closeCard;
    }

    public final String component20() {
        return this.cardForTypeDictionaryValue;
    }

    public final String component21() {
        return this.productGroup;
    }

    public final YesNoApiModel component22() {
        return this.isDigitalCard;
    }

    public final long component23() {
        return this.productId;
    }

    public final long component24() {
        return this.subProductId;
    }

    public final YesNoApiModel component25() {
        return this.isDefault;
    }

    public final YesNoApiModel component26() {
        return this.isHidden;
    }

    public final YesNoApiModel component27() {
        return this.isCardExpiring;
    }

    public final YesNoApiModel component28() {
        return this.isCardInactive;
    }

    public final String component29() {
        return this.attachmentFileBase64;
    }

    public final long component3() {
        return this.cardId;
    }

    public final String component30() {
        return this.nameDictionaryKey;
    }

    public final String component31() {
        return this.nameDictionaryValue;
    }

    public final Object component32() {
        return this.cardInsSecEntity;
    }

    public final boolean component33() {
        return this.isPrimary;
    }

    public final String component34() {
        return this.description;
    }

    public final String component35() {
        return this.paymentNetwork;
    }

    public final YesNoApiModel component36() {
        return this.isScoolcard;
    }

    public final CardExternalFileApiModel component37() {
        return this.externalFile;
    }

    public final String component38() {
        return this.cardPdfUrl;
    }

    public final CardExternalFileApiModel component39() {
        return this.cardExternalFile;
    }

    public final long component4() {
        return this.acctKey;
    }

    public final YesNoApiModel component40() {
        return this.orderRecoverCard;
    }

    public final YesNoApiEntity component41() {
        return this.orderExpiredCard;
    }

    public final YesNoApiEntity component42() {
        return this.googlePay;
    }

    public final String component43() {
        return this.dailyLimitType;
    }

    public final String component44() {
        return this.vcPlasticStatus;
    }

    public final long component5() {
        return this.clientKey;
    }

    public final String component6() {
        return this.cardClass;
    }

    public final String component7() {
        return this.cardClassCode;
    }

    public final long component8() {
        return this.cardOwnerClientKey;
    }

    public final String component9() {
        return this.cardName;
    }

    public final CardApiModel copy(long j, YesNoApiModel yesNoApiModel, long j2, long j3, long j4, String str, String str2, long j5, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j6, String str11, String str12, String str13, String str14, YesNoApiModel yesNoApiModel2, long j7, long j8, YesNoApiModel yesNoApiModel3, YesNoApiModel yesNoApiModel4, YesNoApiModel yesNoApiModel5, YesNoApiModel yesNoApiModel6, String str15, String str16, String str17, Object obj, boolean z, String str18, String str19, YesNoApiModel yesNoApiModel7, CardExternalFileApiModel cardExternalFileApiModel, String str20, CardExternalFileApiModel cardExternalFileApiModel2, YesNoApiModel yesNoApiModel8, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, String str21, String str22) {
        long j9 = j;
        C41536l.m120489i(str, "cardClass");
        C41536l.m120489i(str4, "cardType");
        C41536l.m120489i(str5, "productCode");
        C41536l.m120489i(str6, "subProductCode");
        C41536l.m120489i(str8, "status");
        C41536l.m120489i(str10, "cardHolder");
        C41536l.m120489i(str11, "cardPan");
        C41536l.m120489i(str14, "productGroup");
        C41536l.m120489i(yesNoApiModel3, "isDefault");
        C41536l.m120489i(yesNoApiModel4, "isHidden");
        C41536l.m120489i(yesNoApiModel5, "isCardExpiring");
        C41536l.m120489i(yesNoApiModel6, "isCardInactive");
        C41536l.m120489i(str18, "description");
        C41536l.m120489i(str19, "paymentNetwork");
        C41536l.m120489i(yesNoApiEntity2, "googlePay");
        return new CardApiModel(j, yesNoApiModel, j2, j3, j4, str, str2, j5, str3, str4, str5, str6, str7, str8, str9, str10, j6, str11, str12, str13, str14, yesNoApiModel2, j7, j8, yesNoApiModel3, yesNoApiModel4, yesNoApiModel5, yesNoApiModel6, str15, str16, str17, obj, z, str18, str19, yesNoApiModel7, cardExternalFileApiModel, str20, cardExternalFileApiModel2, yesNoApiModel8, yesNoApiEntity, yesNoApiEntity2, str21, str22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardApiModel)) {
            return false;
        }
        CardApiModel cardApiModel = (CardApiModel) obj;
        return this.f82303id == cardApiModel.f82303id && this.closeCard == cardApiModel.closeCard && this.cardId == cardApiModel.cardId && this.acctKey == cardApiModel.acctKey && this.clientKey == cardApiModel.clientKey && C41536l.m120484d(this.cardClass, cardApiModel.cardClass) && C41536l.m120484d(this.cardClassCode, cardApiModel.cardClassCode) && this.cardOwnerClientKey == cardApiModel.cardOwnerClientKey && C41536l.m120484d(this.cardName, cardApiModel.cardName) && C41536l.m120484d(this.cardType, cardApiModel.cardType) && C41536l.m120484d(this.productCode, cardApiModel.productCode) && C41536l.m120484d(this.subProductCode, cardApiModel.subProductCode) && C41536l.m120484d(this.subProductGroup, cardApiModel.subProductGroup) && C41536l.m120484d(this.status, cardApiModel.status) && C41536l.m120484d(this.lastFour, cardApiModel.lastFour) && C41536l.m120484d(this.cardHolder, cardApiModel.cardHolder) && this.expDate == cardApiModel.expDate && C41536l.m120484d(this.cardPan, cardApiModel.cardPan) && C41536l.m120484d(this.cardForTypeDictionaryKey, cardApiModel.cardForTypeDictionaryKey) && C41536l.m120484d(this.cardForTypeDictionaryValue, cardApiModel.cardForTypeDictionaryValue) && C41536l.m120484d(this.productGroup, cardApiModel.productGroup) && this.isDigitalCard == cardApiModel.isDigitalCard && this.productId == cardApiModel.productId && this.subProductId == cardApiModel.subProductId && this.isDefault == cardApiModel.isDefault && this.isHidden == cardApiModel.isHidden && this.isCardExpiring == cardApiModel.isCardExpiring && this.isCardInactive == cardApiModel.isCardInactive && C41536l.m120484d(this.attachmentFileBase64, cardApiModel.attachmentFileBase64) && C41536l.m120484d(this.nameDictionaryKey, cardApiModel.nameDictionaryKey) && C41536l.m120484d(this.nameDictionaryValue, cardApiModel.nameDictionaryValue) && C41536l.m120484d(this.cardInsSecEntity, cardApiModel.cardInsSecEntity) && this.isPrimary == cardApiModel.isPrimary && C41536l.m120484d(this.description, cardApiModel.description) && C41536l.m120484d(this.paymentNetwork, cardApiModel.paymentNetwork) && this.isScoolcard == cardApiModel.isScoolcard && C41536l.m120484d(this.externalFile, cardApiModel.externalFile) && C41536l.m120484d(this.cardPdfUrl, cardApiModel.cardPdfUrl) && C41536l.m120484d(this.cardExternalFile, cardApiModel.cardExternalFile) && this.orderRecoverCard == cardApiModel.orderRecoverCard && this.orderExpiredCard == cardApiModel.orderExpiredCard && this.googlePay == cardApiModel.googlePay && C41536l.m120484d(this.dailyLimitType, cardApiModel.dailyLimitType) && C41536l.m120484d(this.vcPlasticStatus, cardApiModel.vcPlasticStatus);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final String getCardClassCode() {
        return this.cardClassCode;
    }

    public final CardExternalFileApiModel getCardExternalFile() {
        return this.cardExternalFile;
    }

    public final String getCardForTypeDictionaryKey() {
        return this.cardForTypeDictionaryKey;
    }

    public final String getCardForTypeDictionaryValue() {
        return this.cardForTypeDictionaryValue;
    }

    public final String getCardHolder() {
        return this.cardHolder;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final Object getCardInsSecEntity() {
        return this.cardInsSecEntity;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final long getCardOwnerClientKey() {
        return this.cardOwnerClientKey;
    }

    public final String getCardPan() {
        return this.cardPan;
    }

    public final String getCardPdfUrl() {
        return this.cardPdfUrl;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final YesNoApiModel getCloseCard() {
        return this.closeCard;
    }

    public final String getDailyLimitType() {
        return this.dailyLimitType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getExpDate() {
        return this.expDate;
    }

    public final CardExternalFileApiModel getExternalFile() {
        return this.externalFile;
    }

    public final YesNoApiEntity getGooglePay() {
        return this.googlePay;
    }

    public final long getId() {
        return this.f82303id;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getNameDictionaryKey() {
        return this.nameDictionaryKey;
    }

    public final String getNameDictionaryValue() {
        return this.nameDictionaryValue;
    }

    public final YesNoApiEntity getOrderExpiredCard() {
        return this.orderExpiredCard;
    }

    public final YesNoApiModel getOrderRecoverCard() {
        return this.orderRecoverCard;
    }

    public final String getPaymentNetwork() {
        return this.paymentNetwork;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductGroup() {
        return this.productGroup;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public final String getSubProductGroup() {
        return this.subProductGroup;
    }

    public final long getSubProductId() {
        return this.subProductId;
    }

    public final String getVcPlasticStatus() {
        return this.vcPlasticStatus;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f82303id) * 31;
        YesNoApiModel yesNoApiModel = this.closeCard;
        int i = 0;
        int hashCode = (((((((((a + (yesNoApiModel == null ? 0 : yesNoApiModel.hashCode())) * 31) + C7397t.m28148a(this.cardId)) * 31) + C7397t.m28148a(this.acctKey)) * 31) + C7397t.m28148a(this.clientKey)) * 31) + this.cardClass.hashCode()) * 31;
        String str = this.cardClassCode;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.cardOwnerClientKey)) * 31;
        String str2 = this.cardName;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.cardType.hashCode()) * 31) + this.productCode.hashCode()) * 31) + this.subProductCode.hashCode()) * 31;
        String str3 = this.subProductGroup;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.status.hashCode()) * 31;
        String str4 = this.lastFour;
        int hashCode5 = (((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.cardHolder.hashCode()) * 31) + C7397t.m28148a(this.expDate)) * 31) + this.cardPan.hashCode()) * 31;
        String str5 = this.cardForTypeDictionaryKey;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardForTypeDictionaryValue;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.productGroup.hashCode()) * 31;
        YesNoApiModel yesNoApiModel2 = this.isDigitalCard;
        int hashCode8 = (((((((((((((hashCode7 + (yesNoApiModel2 == null ? 0 : yesNoApiModel2.hashCode())) * 31) + C7397t.m28148a(this.productId)) * 31) + C7397t.m28148a(this.subProductId)) * 31) + this.isDefault.hashCode()) * 31) + this.isHidden.hashCode()) * 31) + this.isCardExpiring.hashCode()) * 31) + this.isCardInactive.hashCode()) * 31;
        String str7 = this.attachmentFileBase64;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.nameDictionaryKey;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.nameDictionaryValue;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Object obj = this.cardInsSecEntity;
        int hashCode12 = (hashCode11 + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z = this.isPrimary;
        if (z) {
            z = true;
        }
        int hashCode13 = (((((hashCode12 + (z ? 1 : 0)) * 31) + this.description.hashCode()) * 31) + this.paymentNetwork.hashCode()) * 31;
        YesNoApiModel yesNoApiModel3 = this.isScoolcard;
        int hashCode14 = (hashCode13 + (yesNoApiModel3 == null ? 0 : yesNoApiModel3.hashCode())) * 31;
        CardExternalFileApiModel cardExternalFileApiModel = this.externalFile;
        int hashCode15 = (hashCode14 + (cardExternalFileApiModel == null ? 0 : cardExternalFileApiModel.hashCode())) * 31;
        String str10 = this.cardPdfUrl;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        CardExternalFileApiModel cardExternalFileApiModel2 = this.cardExternalFile;
        int hashCode17 = (hashCode16 + (cardExternalFileApiModel2 == null ? 0 : cardExternalFileApiModel2.hashCode())) * 31;
        YesNoApiModel yesNoApiModel4 = this.orderRecoverCard;
        int hashCode18 = (hashCode17 + (yesNoApiModel4 == null ? 0 : yesNoApiModel4.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.orderExpiredCard;
        int hashCode19 = (((hashCode18 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31) + this.googlePay.hashCode()) * 31;
        String str11 = this.dailyLimitType;
        int hashCode20 = (hashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.vcPlasticStatus;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode20 + i;
    }

    public final YesNoApiModel isCardExpiring() {
        return this.isCardExpiring;
    }

    public final YesNoApiModel isCardInactive() {
        return this.isCardInactive;
    }

    public final YesNoApiModel isDefault() {
        return this.isDefault;
    }

    public final YesNoApiModel isDigitalCard() {
        return this.isDigitalCard;
    }

    public final YesNoApiModel isHidden() {
        return this.isHidden;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public final YesNoApiModel isScoolcard() {
        return this.isScoolcard;
    }

    public String toString() {
        long j = this.f82303id;
        YesNoApiModel yesNoApiModel = this.closeCard;
        long j2 = this.cardId;
        long j3 = this.acctKey;
        long j4 = this.clientKey;
        String str = this.cardClass;
        String str2 = this.cardClassCode;
        long j5 = this.cardOwnerClientKey;
        String str3 = this.cardName;
        String str4 = this.cardType;
        String str5 = this.productCode;
        String str6 = this.subProductCode;
        String str7 = this.subProductGroup;
        String str8 = this.status;
        String str9 = this.lastFour;
        String str10 = str3;
        String str11 = this.cardHolder;
        long j6 = this.expDate;
        String str12 = this.cardPan;
        String str13 = this.cardForTypeDictionaryKey;
        String str14 = this.cardForTypeDictionaryValue;
        String str15 = this.productGroup;
        String str16 = str12;
        YesNoApiModel yesNoApiModel2 = this.isDigitalCard;
        long j7 = this.productId;
        long j8 = this.subProductId;
        YesNoApiModel yesNoApiModel3 = this.isDefault;
        YesNoApiModel yesNoApiModel4 = this.isHidden;
        YesNoApiModel yesNoApiModel5 = this.isCardExpiring;
        YesNoApiModel yesNoApiModel6 = this.isCardInactive;
        String str17 = this.attachmentFileBase64;
        String str18 = this.nameDictionaryKey;
        String str19 = this.nameDictionaryValue;
        Object obj = this.cardInsSecEntity;
        boolean z = this.isPrimary;
        String str20 = this.description;
        String str21 = this.paymentNetwork;
        YesNoApiModel yesNoApiModel7 = this.isScoolcard;
        CardExternalFileApiModel cardExternalFileApiModel = this.externalFile;
        String str22 = this.cardPdfUrl;
        CardExternalFileApiModel cardExternalFileApiModel2 = this.cardExternalFile;
        YesNoApiModel yesNoApiModel8 = this.orderRecoverCard;
        YesNoApiEntity yesNoApiEntity = this.orderExpiredCard;
        YesNoApiEntity yesNoApiEntity2 = this.googlePay;
        String str23 = this.dailyLimitType;
        String str24 = this.vcPlasticStatus;
        return "CardApiModel(id=" + j + ", closeCard=" + yesNoApiModel + ", cardId=" + j2 + ", acctKey=" + j3 + ", clientKey=" + j4 + ", cardClass=" + str + ", cardClassCode=" + str2 + ", cardOwnerClientKey=" + j5 + ", cardName=" + str10 + ", cardType=" + str4 + ", productCode=" + str5 + ", subProductCode=" + str6 + ", subProductGroup=" + str7 + ", status=" + str8 + ", lastFour=" + str9 + ", cardHolder=" + str11 + ", expDate=" + j6 + ", cardPan=" + str16 + ", cardForTypeDictionaryKey=" + str13 + ", cardForTypeDictionaryValue=" + str14 + ", productGroup=" + str15 + ", isDigitalCard=" + yesNoApiModel2 + ", productId=" + j7 + ", subProductId=" + j8 + ", isDefault=" + yesNoApiModel3 + ", isHidden=" + yesNoApiModel4 + ", isCardExpiring=" + yesNoApiModel5 + ", isCardInactive=" + yesNoApiModel6 + ", attachmentFileBase64=" + str17 + ", nameDictionaryKey=" + str18 + ", nameDictionaryValue=" + str19 + ", cardInsSecEntity=" + obj + ", isPrimary=" + z + ", description=" + str20 + ", paymentNetwork=" + str21 + ", isScoolcard=" + yesNoApiModel7 + ", externalFile=" + cardExternalFileApiModel + ", cardPdfUrl=" + str22 + ", cardExternalFile=" + cardExternalFileApiModel2 + ", orderRecoverCard=" + yesNoApiModel8 + ", orderExpiredCard=" + yesNoApiEntity + ", googlePay=" + yesNoApiEntity2 + ", dailyLimitType=" + str23 + ", vcPlasticStatus=" + str24 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardApiModel(long r57, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r59, long r60, long r62, long r64, java.lang.String r66, java.lang.String r67, long r68, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, long r78, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r84, long r85, long r87, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r89, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r90, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r91, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r92, java.lang.String r93, java.lang.String r94, java.lang.String r95, java.lang.Object r96, boolean r97, java.lang.String r98, java.lang.String r99, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r100, p341ge.bog.mobilebank.products.data.model.CardExternalFileApiModel r101, java.lang.String r102, p341ge.bog.mobilebank.products.data.model.CardExternalFileApiModel r103, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r104, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r105, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r106, java.lang.String r107, java.lang.String r108, int r109, int r110, kotlin.jvm.internal.DefaultConstructorMarker r111) {
        /*
            r56 = this;
            r0 = r109
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r59
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0012
            r17 = r2
            goto L_0x0014
        L_0x0012:
            r17 = r70
        L_0x0014:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x001b
            r21 = r2
            goto L_0x001d
        L_0x001b:
            r21 = r74
        L_0x001d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0024
            r23 = r2
            goto L_0x0026
        L_0x0024:
            r23 = r76
        L_0x0026:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002e
            r28 = r2
            goto L_0x0030
        L_0x002e:
            r28 = r81
        L_0x0030:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0038
            r29 = r2
            goto L_0x003a
        L_0x0038:
            r29 = r82
        L_0x003a:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0042
            r31 = r2
            goto L_0x0044
        L_0x0042:
            r31 = r84
        L_0x0044:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004c
            r40 = r2
            goto L_0x004e
        L_0x004c:
            r40 = r93
        L_0x004e:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0056
            r41 = r2
            goto L_0x0058
        L_0x0056:
            r41 = r94
        L_0x0058:
            r1 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0060
            r42 = r2
            goto L_0x0062
        L_0x0060:
            r42 = r95
        L_0x0062:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x006a
            r43 = r2
            goto L_0x006c
        L_0x006a:
            r43 = r96
        L_0x006c:
            r3 = r56
            r4 = r57
            r7 = r60
            r9 = r62
            r11 = r64
            r13 = r66
            r14 = r67
            r15 = r68
            r18 = r71
            r19 = r72
            r20 = r73
            r22 = r75
            r24 = r77
            r25 = r78
            r27 = r80
            r30 = r83
            r32 = r85
            r34 = r87
            r36 = r89
            r37 = r90
            r38 = r91
            r39 = r92
            r44 = r97
            r45 = r98
            r46 = r99
            r47 = r100
            r48 = r101
            r49 = r102
            r50 = r103
            r51 = r104
            r52 = r105
            r53 = r106
            r54 = r107
            r55 = r108
            r3.<init>(r4, r6, r7, r9, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r34, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.data.model.CardApiModel.<init>(long, ge.bog.mobilebank.products.data.model.YesNoApiModel, long, long, long, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.products.data.model.YesNoApiModel, long, long, ge.bog.mobilebank.products.data.model.YesNoApiModel, ge.bog.mobilebank.products.data.model.YesNoApiModel, ge.bog.mobilebank.products.data.model.YesNoApiModel, ge.bog.mobilebank.products.data.model.YesNoApiModel, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, boolean, java.lang.String, java.lang.String, ge.bog.mobilebank.products.data.model.YesNoApiModel, ge.bog.mobilebank.products.data.model.CardExternalFileApiModel, java.lang.String, ge.bog.mobilebank.products.data.model.CardExternalFileApiModel, ge.bog.mobilebank.products.data.model.YesNoApiModel, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
