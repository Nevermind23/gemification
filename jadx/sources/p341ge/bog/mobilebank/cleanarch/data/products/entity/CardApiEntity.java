package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.CardApiEntity */
public final class CardApiEntity {
    private final long acctKey;
    private final String attachmentFileBase64;
    private final String cardClass;
    private final String cardClassCode;
    private final CardExternalFileEntity cardExternalFile;
    private final String cardForTypeDictionaryKey;
    private final String cardForTypeDictionaryValue;
    private final String cardHolder;
    private final long cardId;
    private final Object cardInsSecEntity;
    private final String cardName;
    private final String cardPan;
    private final String cardPdfUrl;
    private final String cardType;
    private final long clientKey;
    private final YesNoApiEntity closeCard;
    private final String dailyLimitType;
    private final String description;
    private final long expDate;
    private final CardExternalFileEntity externalFile;
    private final YesNoApiEntity googlePay;

    /* renamed from: id */
    private final long f56456id;
    private final YesNoApiEntity isCardExpiring;
    private final YesNoApiEntity isCardInactive;
    private final YesNoApiEntity isDefault;
    private final YesNoApiEntity isDigitalCard;
    private final YesNoApiEntity isHidden;
    private final boolean isPrimary;
    private final YesNoApiEntity isScoolcard;
    private final String lastFour;
    private final String nameDictionaryKey;
    private final String nameDictionaryValue;
    private final YesNoApiEntity orderRecoverCard;
    private final String paymentNetwork;
    private final String productCode;
    private final String productGroup;
    private final long productId;
    private final String status;
    private final String subProductCode;
    private final String subProductGroup;
    private final long subProductId;

    public CardApiEntity(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j5, String str11, String str12, String str13, String str14, YesNoApiEntity yesNoApiEntity, long j6, long j7, YesNoApiEntity yesNoApiEntity2, YesNoApiEntity yesNoApiEntity3, YesNoApiEntity yesNoApiEntity4, YesNoApiEntity yesNoApiEntity5, String str15, String str16, String str17, Object obj, boolean z, String str18, String str19, String str20, YesNoApiEntity yesNoApiEntity6, YesNoApiEntity yesNoApiEntity7, CardExternalFileEntity cardExternalFileEntity, CardExternalFileEntity cardExternalFileEntity2, String str21, YesNoApiEntity yesNoApiEntity8, YesNoApiEntity yesNoApiEntity9) {
        String str22 = str;
        String str23 = str3;
        String str24 = str5;
        String str25 = str6;
        String str26 = str8;
        String str27 = str10;
        String str28 = str11;
        String str29 = str14;
        YesNoApiEntity yesNoApiEntity10 = yesNoApiEntity2;
        YesNoApiEntity yesNoApiEntity11 = yesNoApiEntity3;
        YesNoApiEntity yesNoApiEntity12 = yesNoApiEntity4;
        YesNoApiEntity yesNoApiEntity13 = yesNoApiEntity5;
        String str30 = str18;
        C41536l.m120489i(str22, "cardClass");
        C41536l.m120489i(str23, "cardType");
        C41536l.m120489i(str24, "productCode");
        C41536l.m120489i(str25, "subProductCode");
        C41536l.m120489i(str26, "status");
        C41536l.m120489i(str27, "cardHolder");
        C41536l.m120489i(str28, "cardPan");
        C41536l.m120489i(str29, "productGroup");
        C41536l.m120489i(yesNoApiEntity10, "isDefault");
        C41536l.m120489i(yesNoApiEntity11, "isHidden");
        C41536l.m120489i(yesNoApiEntity12, "isCardExpiring");
        C41536l.m120489i(yesNoApiEntity13, "isCardInactive");
        C41536l.m120489i(str30, "description");
        C41536l.m120489i(str19, "paymentNetwork");
        C41536l.m120489i(str21, "cardClassCode");
        C41536l.m120489i(yesNoApiEntity9, "googlePay");
        this.f56456id = j;
        this.cardId = j2;
        this.acctKey = j3;
        this.clientKey = j4;
        this.cardClass = str22;
        this.cardName = str2;
        this.cardType = str23;
        this.dailyLimitType = str4;
        this.productCode = str24;
        this.subProductCode = str25;
        this.subProductGroup = str7;
        this.status = str26;
        this.lastFour = str9;
        this.cardHolder = str27;
        this.expDate = j5;
        this.cardPan = str28;
        this.cardForTypeDictionaryKey = str12;
        this.cardForTypeDictionaryValue = str13;
        this.productGroup = str29;
        this.isDigitalCard = yesNoApiEntity;
        this.productId = j6;
        this.subProductId = j7;
        this.isDefault = yesNoApiEntity10;
        this.isHidden = yesNoApiEntity11;
        this.isCardExpiring = yesNoApiEntity12;
        this.isCardInactive = yesNoApiEntity13;
        this.attachmentFileBase64 = str15;
        this.nameDictionaryKey = str16;
        this.nameDictionaryValue = str17;
        this.cardInsSecEntity = obj;
        this.isPrimary = z;
        this.description = str30;
        this.paymentNetwork = str19;
        this.cardPdfUrl = str20;
        this.isScoolcard = yesNoApiEntity6;
        this.closeCard = yesNoApiEntity7;
        this.externalFile = cardExternalFileEntity;
        this.cardExternalFile = cardExternalFileEntity2;
        this.cardClassCode = str21;
        this.orderRecoverCard = yesNoApiEntity8;
        this.googlePay = yesNoApiEntity9;
    }

    public static /* synthetic */ CardApiEntity copy$default(CardApiEntity cardApiEntity, long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j5, String str11, String str12, String str13, String str14, YesNoApiEntity yesNoApiEntity, long j6, long j7, YesNoApiEntity yesNoApiEntity2, YesNoApiEntity yesNoApiEntity3, YesNoApiEntity yesNoApiEntity4, YesNoApiEntity yesNoApiEntity5, String str15, String str16, String str17, Object obj, boolean z, String str18, String str19, String str20, YesNoApiEntity yesNoApiEntity6, YesNoApiEntity yesNoApiEntity7, CardExternalFileEntity cardExternalFileEntity, CardExternalFileEntity cardExternalFileEntity2, String str21, YesNoApiEntity yesNoApiEntity8, YesNoApiEntity yesNoApiEntity9, int i, int i2, Object obj2) {
        CardApiEntity cardApiEntity2 = cardApiEntity;
        int i3 = i;
        int i4 = i2;
        long j8 = (i3 & 1) != 0 ? cardApiEntity2.f56456id : j;
        long j9 = (i3 & 2) != 0 ? cardApiEntity2.cardId : j2;
        long j12 = (i3 & 4) != 0 ? cardApiEntity2.acctKey : j3;
        long j13 = (i3 & 8) != 0 ? cardApiEntity2.clientKey : j4;
        String str22 = (i3 & 16) != 0 ? cardApiEntity2.cardClass : str;
        String str23 = (i3 & 32) != 0 ? cardApiEntity2.cardName : str2;
        String str24 = (i3 & 64) != 0 ? cardApiEntity2.cardType : str3;
        String str25 = (i3 & 128) != 0 ? cardApiEntity2.dailyLimitType : str4;
        return cardApiEntity.copy(j8, j9, j12, j13, str22, str23, str24, str25, (i3 & C11398b.f33139r) != 0 ? cardApiEntity2.productCode : str5, (i3 & C11398b.f33140s) != 0 ? cardApiEntity2.subProductCode : str6, (i3 & C11398b.f33141t) != 0 ? cardApiEntity2.subProductGroup : str7, (i3 & C11398b.f33142u) != 0 ? cardApiEntity2.status : str8, (i3 & C11398b.f33143v) != 0 ? cardApiEntity2.lastFour : str9, (i3 & 8192) != 0 ? cardApiEntity2.cardHolder : str10, (i3 & 16384) != 0 ? cardApiEntity2.expDate : j5, (i3 & 32768) != 0 ? cardApiEntity2.cardPan : str11, (65536 & i3) != 0 ? cardApiEntity2.cardForTypeDictionaryKey : str12, (i3 & 131072) != 0 ? cardApiEntity2.cardForTypeDictionaryValue : str13, (i3 & 262144) != 0 ? cardApiEntity2.productGroup : str14, (i3 & 524288) != 0 ? cardApiEntity2.isDigitalCard : yesNoApiEntity, (i3 & 1048576) != 0 ? cardApiEntity2.productId : j6, (i3 & 2097152) != 0 ? cardApiEntity2.subProductId : j7, (i3 & 4194304) != 0 ? cardApiEntity2.isDefault : yesNoApiEntity2, (8388608 & i3) != 0 ? cardApiEntity2.isHidden : yesNoApiEntity3, (i3 & 16777216) != 0 ? cardApiEntity2.isCardExpiring : yesNoApiEntity4, (i3 & 33554432) != 0 ? cardApiEntity2.isCardInactive : yesNoApiEntity5, (i3 & 67108864) != 0 ? cardApiEntity2.attachmentFileBase64 : str15, (i3 & 134217728) != 0 ? cardApiEntity2.nameDictionaryKey : str16, (i3 & 268435456) != 0 ? cardApiEntity2.nameDictionaryValue : str17, (i3 & 536870912) != 0 ? cardApiEntity2.cardInsSecEntity : obj, (i3 & 1073741824) != 0 ? cardApiEntity2.isPrimary : z, (i3 & Integer.MIN_VALUE) != 0 ? cardApiEntity2.description : str18, (i4 & 1) != 0 ? cardApiEntity2.paymentNetwork : str19, (i4 & 2) != 0 ? cardApiEntity2.cardPdfUrl : str20, (i4 & 4) != 0 ? cardApiEntity2.isScoolcard : yesNoApiEntity6, (i4 & 8) != 0 ? cardApiEntity2.closeCard : yesNoApiEntity7, (i4 & 16) != 0 ? cardApiEntity2.externalFile : cardExternalFileEntity, (i4 & 32) != 0 ? cardApiEntity2.cardExternalFile : cardExternalFileEntity2, (i4 & 64) != 0 ? cardApiEntity2.cardClassCode : str21, (i4 & 128) != 0 ? cardApiEntity2.orderRecoverCard : yesNoApiEntity8, (i4 & C11398b.f33139r) != 0 ? cardApiEntity2.googlePay : yesNoApiEntity9);
    }

    public final long component1() {
        return this.f56456id;
    }

    public final String component10() {
        return this.subProductCode;
    }

    public final String component11() {
        return this.subProductGroup;
    }

    public final String component12() {
        return this.status;
    }

    public final String component13() {
        return this.lastFour;
    }

    public final String component14() {
        return this.cardHolder;
    }

    public final long component15() {
        return this.expDate;
    }

    public final String component16() {
        return this.cardPan;
    }

    public final String component17() {
        return this.cardForTypeDictionaryKey;
    }

    public final String component18() {
        return this.cardForTypeDictionaryValue;
    }

    public final String component19() {
        return this.productGroup;
    }

    public final long component2() {
        return this.cardId;
    }

    public final YesNoApiEntity component20() {
        return this.isDigitalCard;
    }

    public final long component21() {
        return this.productId;
    }

    public final long component22() {
        return this.subProductId;
    }

    public final YesNoApiEntity component23() {
        return this.isDefault;
    }

    public final YesNoApiEntity component24() {
        return this.isHidden;
    }

    public final YesNoApiEntity component25() {
        return this.isCardExpiring;
    }

    public final YesNoApiEntity component26() {
        return this.isCardInactive;
    }

    public final String component27() {
        return this.attachmentFileBase64;
    }

    public final String component28() {
        return this.nameDictionaryKey;
    }

    public final String component29() {
        return this.nameDictionaryValue;
    }

    public final long component3() {
        return this.acctKey;
    }

    public final Object component30() {
        return this.cardInsSecEntity;
    }

    public final boolean component31() {
        return this.isPrimary;
    }

    public final String component32() {
        return this.description;
    }

    public final String component33() {
        return this.paymentNetwork;
    }

    public final String component34() {
        return this.cardPdfUrl;
    }

    public final YesNoApiEntity component35() {
        return this.isScoolcard;
    }

    public final YesNoApiEntity component36() {
        return this.closeCard;
    }

    public final CardExternalFileEntity component37() {
        return this.externalFile;
    }

    public final CardExternalFileEntity component38() {
        return this.cardExternalFile;
    }

    public final String component39() {
        return this.cardClassCode;
    }

    public final long component4() {
        return this.clientKey;
    }

    public final YesNoApiEntity component40() {
        return this.orderRecoverCard;
    }

    public final YesNoApiEntity component41() {
        return this.googlePay;
    }

    public final String component5() {
        return this.cardClass;
    }

    public final String component6() {
        return this.cardName;
    }

    public final String component7() {
        return this.cardType;
    }

    public final String component8() {
        return this.dailyLimitType;
    }

    public final String component9() {
        return this.productCode;
    }

    public final CardApiEntity copy(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j5, String str11, String str12, String str13, String str14, YesNoApiEntity yesNoApiEntity, long j6, long j7, YesNoApiEntity yesNoApiEntity2, YesNoApiEntity yesNoApiEntity3, YesNoApiEntity yesNoApiEntity4, YesNoApiEntity yesNoApiEntity5, String str15, String str16, String str17, Object obj, boolean z, String str18, String str19, String str20, YesNoApiEntity yesNoApiEntity6, YesNoApiEntity yesNoApiEntity7, CardExternalFileEntity cardExternalFileEntity, CardExternalFileEntity cardExternalFileEntity2, String str21, YesNoApiEntity yesNoApiEntity8, YesNoApiEntity yesNoApiEntity9) {
        long j8 = j;
        C41536l.m120489i(str, "cardClass");
        C41536l.m120489i(str3, "cardType");
        C41536l.m120489i(str5, "productCode");
        C41536l.m120489i(str6, "subProductCode");
        C41536l.m120489i(str8, "status");
        C41536l.m120489i(str10, "cardHolder");
        C41536l.m120489i(str11, "cardPan");
        C41536l.m120489i(str14, "productGroup");
        C41536l.m120489i(yesNoApiEntity2, "isDefault");
        C41536l.m120489i(yesNoApiEntity3, "isHidden");
        C41536l.m120489i(yesNoApiEntity4, "isCardExpiring");
        C41536l.m120489i(yesNoApiEntity5, "isCardInactive");
        C41536l.m120489i(str18, "description");
        C41536l.m120489i(str19, "paymentNetwork");
        C41536l.m120489i(str21, "cardClassCode");
        C41536l.m120489i(yesNoApiEntity9, "googlePay");
        return new CardApiEntity(j, j2, j3, j4, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, j5, str11, str12, str13, str14, yesNoApiEntity, j6, j7, yesNoApiEntity2, yesNoApiEntity3, yesNoApiEntity4, yesNoApiEntity5, str15, str16, str17, obj, z, str18, str19, str20, yesNoApiEntity6, yesNoApiEntity7, cardExternalFileEntity, cardExternalFileEntity2, str21, yesNoApiEntity8, yesNoApiEntity9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardApiEntity)) {
            return false;
        }
        CardApiEntity cardApiEntity = (CardApiEntity) obj;
        return this.f56456id == cardApiEntity.f56456id && this.cardId == cardApiEntity.cardId && this.acctKey == cardApiEntity.acctKey && this.clientKey == cardApiEntity.clientKey && C41536l.m120484d(this.cardClass, cardApiEntity.cardClass) && C41536l.m120484d(this.cardName, cardApiEntity.cardName) && C41536l.m120484d(this.cardType, cardApiEntity.cardType) && C41536l.m120484d(this.dailyLimitType, cardApiEntity.dailyLimitType) && C41536l.m120484d(this.productCode, cardApiEntity.productCode) && C41536l.m120484d(this.subProductCode, cardApiEntity.subProductCode) && C41536l.m120484d(this.subProductGroup, cardApiEntity.subProductGroup) && C41536l.m120484d(this.status, cardApiEntity.status) && C41536l.m120484d(this.lastFour, cardApiEntity.lastFour) && C41536l.m120484d(this.cardHolder, cardApiEntity.cardHolder) && this.expDate == cardApiEntity.expDate && C41536l.m120484d(this.cardPan, cardApiEntity.cardPan) && C41536l.m120484d(this.cardForTypeDictionaryKey, cardApiEntity.cardForTypeDictionaryKey) && C41536l.m120484d(this.cardForTypeDictionaryValue, cardApiEntity.cardForTypeDictionaryValue) && C41536l.m120484d(this.productGroup, cardApiEntity.productGroup) && this.isDigitalCard == cardApiEntity.isDigitalCard && this.productId == cardApiEntity.productId && this.subProductId == cardApiEntity.subProductId && this.isDefault == cardApiEntity.isDefault && this.isHidden == cardApiEntity.isHidden && this.isCardExpiring == cardApiEntity.isCardExpiring && this.isCardInactive == cardApiEntity.isCardInactive && C41536l.m120484d(this.attachmentFileBase64, cardApiEntity.attachmentFileBase64) && C41536l.m120484d(this.nameDictionaryKey, cardApiEntity.nameDictionaryKey) && C41536l.m120484d(this.nameDictionaryValue, cardApiEntity.nameDictionaryValue) && C41536l.m120484d(this.cardInsSecEntity, cardApiEntity.cardInsSecEntity) && this.isPrimary == cardApiEntity.isPrimary && C41536l.m120484d(this.description, cardApiEntity.description) && C41536l.m120484d(this.paymentNetwork, cardApiEntity.paymentNetwork) && C41536l.m120484d(this.cardPdfUrl, cardApiEntity.cardPdfUrl) && this.isScoolcard == cardApiEntity.isScoolcard && this.closeCard == cardApiEntity.closeCard && C41536l.m120484d(this.externalFile, cardApiEntity.externalFile) && C41536l.m120484d(this.cardExternalFile, cardApiEntity.cardExternalFile) && C41536l.m120484d(this.cardClassCode, cardApiEntity.cardClassCode) && this.orderRecoverCard == cardApiEntity.orderRecoverCard && this.googlePay == cardApiEntity.googlePay;
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

    public final CardExternalFileEntity getCardExternalFile() {
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

    public final YesNoApiEntity getCloseCard() {
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

    public final CardExternalFileEntity getExternalFile() {
        return this.externalFile;
    }

    public final YesNoApiEntity getGooglePay() {
        return this.googlePay;
    }

    public final long getId() {
        return this.f56456id;
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

    public final YesNoApiEntity getOrderRecoverCard() {
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

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f56456id) * 31) + C7397t.m28148a(this.cardId)) * 31) + C7397t.m28148a(this.acctKey)) * 31) + C7397t.m28148a(this.clientKey)) * 31) + this.cardClass.hashCode()) * 31;
        String str = this.cardName;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.cardType.hashCode()) * 31;
        String str2 = this.dailyLimitType;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.productCode.hashCode()) * 31) + this.subProductCode.hashCode()) * 31;
        String str3 = this.subProductGroup;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.status.hashCode()) * 31;
        String str4 = this.lastFour;
        int hashCode4 = (((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.cardHolder.hashCode()) * 31) + C7397t.m28148a(this.expDate)) * 31) + this.cardPan.hashCode()) * 31;
        String str5 = this.cardForTypeDictionaryKey;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardForTypeDictionaryValue;
        int hashCode6 = (((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.productGroup.hashCode()) * 31;
        YesNoApiEntity yesNoApiEntity = this.isDigitalCard;
        int hashCode7 = (((((((((((((hashCode6 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31) + C7397t.m28148a(this.productId)) * 31) + C7397t.m28148a(this.subProductId)) * 31) + this.isDefault.hashCode()) * 31) + this.isHidden.hashCode()) * 31) + this.isCardExpiring.hashCode()) * 31) + this.isCardInactive.hashCode()) * 31;
        String str7 = this.attachmentFileBase64;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.nameDictionaryKey;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.nameDictionaryValue;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Object obj = this.cardInsSecEntity;
        int hashCode11 = (hashCode10 + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z = this.isPrimary;
        if (z) {
            z = true;
        }
        int hashCode12 = (((((hashCode11 + (z ? 1 : 0)) * 31) + this.description.hashCode()) * 31) + this.paymentNetwork.hashCode()) * 31;
        String str10 = this.cardPdfUrl;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.isScoolcard;
        int hashCode14 = (hashCode13 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity3 = this.closeCard;
        int hashCode15 = (hashCode14 + (yesNoApiEntity3 == null ? 0 : yesNoApiEntity3.hashCode())) * 31;
        CardExternalFileEntity cardExternalFileEntity = this.externalFile;
        int hashCode16 = (hashCode15 + (cardExternalFileEntity == null ? 0 : cardExternalFileEntity.hashCode())) * 31;
        CardExternalFileEntity cardExternalFileEntity2 = this.cardExternalFile;
        int hashCode17 = (((hashCode16 + (cardExternalFileEntity2 == null ? 0 : cardExternalFileEntity2.hashCode())) * 31) + this.cardClassCode.hashCode()) * 31;
        YesNoApiEntity yesNoApiEntity4 = this.orderRecoverCard;
        if (yesNoApiEntity4 != null) {
            i = yesNoApiEntity4.hashCode();
        }
        return ((hashCode17 + i) * 31) + this.googlePay.hashCode();
    }

    public final YesNoApiEntity isCardExpiring() {
        return this.isCardExpiring;
    }

    public final YesNoApiEntity isCardInactive() {
        return this.isCardInactive;
    }

    public final YesNoApiEntity isDefault() {
        return this.isDefault;
    }

    public final YesNoApiEntity isDigitalCard() {
        return this.isDigitalCard;
    }

    public final YesNoApiEntity isHidden() {
        return this.isHidden;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public final YesNoApiEntity isScoolcard() {
        return this.isScoolcard;
    }

    public String toString() {
        long j = this.f56456id;
        long j2 = this.cardId;
        long j3 = this.acctKey;
        long j4 = this.clientKey;
        String str = this.cardClass;
        String str2 = this.cardName;
        String str3 = this.cardType;
        String str4 = this.dailyLimitType;
        String str5 = this.productCode;
        String str6 = this.subProductCode;
        String str7 = this.subProductGroup;
        String str8 = this.status;
        String str9 = this.lastFour;
        String str10 = str6;
        String str11 = this.cardHolder;
        long j5 = this.expDate;
        String str12 = this.cardPan;
        String str13 = this.cardForTypeDictionaryKey;
        String str14 = this.cardForTypeDictionaryValue;
        String str15 = this.productGroup;
        String str16 = str12;
        YesNoApiEntity yesNoApiEntity = this.isDigitalCard;
        long j6 = this.productId;
        long j7 = this.subProductId;
        YesNoApiEntity yesNoApiEntity2 = this.isDefault;
        YesNoApiEntity yesNoApiEntity3 = this.isHidden;
        YesNoApiEntity yesNoApiEntity4 = this.isCardExpiring;
        YesNoApiEntity yesNoApiEntity5 = this.isCardInactive;
        String str17 = this.attachmentFileBase64;
        String str18 = this.nameDictionaryKey;
        String str19 = this.nameDictionaryValue;
        Object obj = this.cardInsSecEntity;
        boolean z = this.isPrimary;
        String str20 = this.description;
        String str21 = this.paymentNetwork;
        String str22 = this.cardPdfUrl;
        YesNoApiEntity yesNoApiEntity6 = this.isScoolcard;
        YesNoApiEntity yesNoApiEntity7 = this.closeCard;
        CardExternalFileEntity cardExternalFileEntity = this.externalFile;
        CardExternalFileEntity cardExternalFileEntity2 = this.cardExternalFile;
        String str23 = this.cardClassCode;
        YesNoApiEntity yesNoApiEntity8 = this.orderRecoverCard;
        YesNoApiEntity yesNoApiEntity9 = this.googlePay;
        return "CardApiEntity(id=" + j + ", cardId=" + j2 + ", acctKey=" + j3 + ", clientKey=" + j4 + ", cardClass=" + str + ", cardName=" + str2 + ", cardType=" + str3 + ", dailyLimitType=" + str4 + ", productCode=" + str5 + ", subProductCode=" + str10 + ", subProductGroup=" + str7 + ", status=" + str8 + ", lastFour=" + str9 + ", cardHolder=" + str11 + ", expDate=" + j5 + ", cardPan=" + str16 + ", cardForTypeDictionaryKey=" + str13 + ", cardForTypeDictionaryValue=" + str14 + ", productGroup=" + str15 + ", isDigitalCard=" + yesNoApiEntity + ", productId=" + j6 + ", subProductId=" + j7 + ", isDefault=" + yesNoApiEntity2 + ", isHidden=" + yesNoApiEntity3 + ", isCardExpiring=" + yesNoApiEntity4 + ", isCardInactive=" + yesNoApiEntity5 + ", attachmentFileBase64=" + str17 + ", nameDictionaryKey=" + str18 + ", nameDictionaryValue=" + str19 + ", cardInsSecEntity=" + obj + ", isPrimary=" + z + ", description=" + str20 + ", paymentNetwork=" + str21 + ", cardPdfUrl=" + str22 + ", isScoolcard=" + yesNoApiEntity6 + ", closeCard=" + yesNoApiEntity7 + ", externalFile=" + cardExternalFileEntity + ", cardExternalFile=" + cardExternalFileEntity2 + ", cardClassCode=" + str23 + ", orderRecoverCard=" + yesNoApiEntity8 + ", googlePay=" + yesNoApiEntity9 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardApiEntity(long r53, long r55, long r57, long r59, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, long r71, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r77, long r78, long r80, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r82, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r83, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r84, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, java.lang.Object r89, boolean r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r94, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r95, p341ge.bog.mobilebank.cleanarch.data.products.entity.CardExternalFileEntity r96, p341ge.bog.mobilebank.cleanarch.data.products.entity.CardExternalFileEntity r97, java.lang.String r98, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r99, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r100, int r101, int r102, kotlin.jvm.internal.DefaultConstructorMarker r103) {
        /*
            r52 = this;
            r0 = r101
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r13 = r2
            goto L_0x000b
        L_0x0009:
            r13 = r62
        L_0x000b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0012
            r18 = r2
            goto L_0x0014
        L_0x0012:
            r18 = r67
        L_0x0014:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x001b
            r20 = r2
            goto L_0x001d
        L_0x001b:
            r20 = r69
        L_0x001d:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0025
            r25 = r2
            goto L_0x0027
        L_0x0025:
            r25 = r74
        L_0x0027:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002f
            r26 = r2
            goto L_0x0031
        L_0x002f:
            r26 = r75
        L_0x0031:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0039
            r28 = r2
            goto L_0x003b
        L_0x0039:
            r28 = r77
        L_0x003b:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0043
            r37 = r2
            goto L_0x0045
        L_0x0043:
            r37 = r86
        L_0x0045:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004d
            r38 = r2
            goto L_0x004f
        L_0x004d:
            r38 = r87
        L_0x004f:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0057
            r39 = r2
            goto L_0x0059
        L_0x0057:
            r39 = r88
        L_0x0059:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0061
            r40 = r2
            goto L_0x0063
        L_0x0061:
            r40 = r89
        L_0x0063:
            r3 = r52
            r4 = r53
            r6 = r55
            r8 = r57
            r10 = r59
            r12 = r61
            r14 = r63
            r15 = r64
            r16 = r65
            r17 = r66
            r19 = r68
            r21 = r70
            r22 = r71
            r24 = r73
            r27 = r76
            r29 = r78
            r31 = r80
            r33 = r82
            r34 = r83
            r35 = r84
            r36 = r85
            r41 = r90
            r42 = r91
            r43 = r92
            r44 = r93
            r45 = r94
            r46 = r95
            r47 = r96
            r48 = r97
            r49 = r98
            r50 = r99
            r51 = r100
            r3.<init>(r4, r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.products.entity.CardApiEntity.<init>(long, long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, long, long, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, boolean, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, ge.bog.mobilebank.cleanarch.data.products.entity.CardExternalFileEntity, ge.bog.mobilebank.cleanarch.data.products.entity.CardExternalFileEntity, java.lang.String, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
