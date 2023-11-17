package p341ge.bog.mobilebank.cleanarch.data.p764zk.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.zk.entity.UmtsCardApiEntity */
public final class UmtsCardApiEntity {
    private final String acctKey;
    private final String attachmentFileBase64;
    private final String cardClass;
    private final String cardForTypeDictionaryKey;
    private final String cardForTypeDictionaryValue;
    private final String cardHolder;
    private final String cardId;
    private final String cardInsSecEntity;
    private final String cardMask;
    private final String cardName;
    private final String cardPan;
    private final String cardType;
    private final String clientKey;
    private final String description;
    private final String encryptedPackage;
    private final Long expDate;

    /* renamed from: id */
    private final String f56460id;
    private final String isCardBlocked;
    private final String isCardExpiring;
    private final String isCardInactive;
    private final String isDefault;
    private final String isDigitalCard;
    private final String isHidden;
    private final String isPrimary;
    private final String lastFour;
    private final String nameDictionaryKey;
    private final String nameDictionaryValue;
    private final String paymentNetwork;
    private final String productCode;
    private final String productGroup;
    private final Long productId;
    private final String status;
    private final String subProductCode;
    private final String subProductGroup;
    private final String subProductId;

    public UmtsCardApiEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l, String str15, String str16, String str17, String str18, String str19, String str20, Long l2, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33) {
        this.encryptedPackage = str;
        this.f56460id = str2;
        this.cardId = str3;
        this.acctKey = str4;
        this.clientKey = str5;
        this.cardClass = str6;
        this.cardName = str7;
        this.cardType = str8;
        this.productCode = str9;
        this.subProductCode = str10;
        this.subProductGroup = str11;
        this.status = str12;
        this.lastFour = str13;
        this.cardHolder = str14;
        this.expDate = l;
        this.isCardBlocked = str15;
        this.cardPan = str16;
        this.cardForTypeDictionaryKey = str17;
        this.cardForTypeDictionaryValue = str18;
        this.productGroup = str19;
        this.isDigitalCard = str20;
        this.productId = l2;
        this.subProductId = str21;
        this.isDefault = str22;
        this.isHidden = str23;
        this.isCardExpiring = str24;
        this.isCardInactive = str25;
        this.cardMask = str26;
        this.attachmentFileBase64 = str27;
        this.nameDictionaryKey = str28;
        this.nameDictionaryValue = str29;
        this.cardInsSecEntity = str30;
        this.isPrimary = str31;
        this.description = str32;
        this.paymentNetwork = str33;
    }

    public static /* synthetic */ UmtsCardApiEntity copy$default(UmtsCardApiEntity umtsCardApiEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l, String str15, String str16, String str17, String str18, String str19, String str20, Long l2, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, int i, int i2, Object obj) {
        UmtsCardApiEntity umtsCardApiEntity2 = umtsCardApiEntity;
        int i3 = i;
        return umtsCardApiEntity.copy((i3 & 1) != 0 ? umtsCardApiEntity2.encryptedPackage : str, (i3 & 2) != 0 ? umtsCardApiEntity2.f56460id : str2, (i3 & 4) != 0 ? umtsCardApiEntity2.cardId : str3, (i3 & 8) != 0 ? umtsCardApiEntity2.acctKey : str4, (i3 & 16) != 0 ? umtsCardApiEntity2.clientKey : str5, (i3 & 32) != 0 ? umtsCardApiEntity2.cardClass : str6, (i3 & 64) != 0 ? umtsCardApiEntity2.cardName : str7, (i3 & 128) != 0 ? umtsCardApiEntity2.cardType : str8, (i3 & C11398b.f33139r) != 0 ? umtsCardApiEntity2.productCode : str9, (i3 & C11398b.f33140s) != 0 ? umtsCardApiEntity2.subProductCode : str10, (i3 & C11398b.f33141t) != 0 ? umtsCardApiEntity2.subProductGroup : str11, (i3 & C11398b.f33142u) != 0 ? umtsCardApiEntity2.status : str12, (i3 & C11398b.f33143v) != 0 ? umtsCardApiEntity2.lastFour : str13, (i3 & 8192) != 0 ? umtsCardApiEntity2.cardHolder : str14, (i3 & 16384) != 0 ? umtsCardApiEntity2.expDate : l, (i3 & 32768) != 0 ? umtsCardApiEntity2.isCardBlocked : str15, (i3 & 65536) != 0 ? umtsCardApiEntity2.cardPan : str16, (i3 & 131072) != 0 ? umtsCardApiEntity2.cardForTypeDictionaryKey : str17, (i3 & 262144) != 0 ? umtsCardApiEntity2.cardForTypeDictionaryValue : str18, (i3 & 524288) != 0 ? umtsCardApiEntity2.productGroup : str19, (i3 & 1048576) != 0 ? umtsCardApiEntity2.isDigitalCard : str20, (i3 & 2097152) != 0 ? umtsCardApiEntity2.productId : l2, (i3 & 4194304) != 0 ? umtsCardApiEntity2.subProductId : str21, (i3 & 8388608) != 0 ? umtsCardApiEntity2.isDefault : str22, (i3 & 16777216) != 0 ? umtsCardApiEntity2.isHidden : str23, (i3 & 33554432) != 0 ? umtsCardApiEntity2.isCardExpiring : str24, (i3 & 67108864) != 0 ? umtsCardApiEntity2.isCardInactive : str25, (i3 & 134217728) != 0 ? umtsCardApiEntity2.cardMask : str26, (i3 & 268435456) != 0 ? umtsCardApiEntity2.attachmentFileBase64 : str27, (i3 & 536870912) != 0 ? umtsCardApiEntity2.nameDictionaryKey : str28, (i3 & 1073741824) != 0 ? umtsCardApiEntity2.nameDictionaryValue : str29, (i3 & Integer.MIN_VALUE) != 0 ? umtsCardApiEntity2.cardInsSecEntity : str30, (i2 & 1) != 0 ? umtsCardApiEntity2.isPrimary : str31, (i2 & 2) != 0 ? umtsCardApiEntity2.description : str32, (i2 & 4) != 0 ? umtsCardApiEntity2.paymentNetwork : str33);
    }

    public final String component1() {
        return this.encryptedPackage;
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

    public final Long component15() {
        return this.expDate;
    }

    public final String component16() {
        return this.isCardBlocked;
    }

    public final String component17() {
        return this.cardPan;
    }

    public final String component18() {
        return this.cardForTypeDictionaryKey;
    }

    public final String component19() {
        return this.cardForTypeDictionaryValue;
    }

    public final String component2() {
        return this.f56460id;
    }

    public final String component20() {
        return this.productGroup;
    }

    public final String component21() {
        return this.isDigitalCard;
    }

    public final Long component22() {
        return this.productId;
    }

    public final String component23() {
        return this.subProductId;
    }

    public final String component24() {
        return this.isDefault;
    }

    public final String component25() {
        return this.isHidden;
    }

    public final String component26() {
        return this.isCardExpiring;
    }

    public final String component27() {
        return this.isCardInactive;
    }

    public final String component28() {
        return this.cardMask;
    }

    public final String component29() {
        return this.attachmentFileBase64;
    }

    public final String component3() {
        return this.cardId;
    }

    public final String component30() {
        return this.nameDictionaryKey;
    }

    public final String component31() {
        return this.nameDictionaryValue;
    }

    public final String component32() {
        return this.cardInsSecEntity;
    }

    public final String component33() {
        return this.isPrimary;
    }

    public final String component34() {
        return this.description;
    }

    public final String component35() {
        return this.paymentNetwork;
    }

    public final String component4() {
        return this.acctKey;
    }

    public final String component5() {
        return this.clientKey;
    }

    public final String component6() {
        return this.cardClass;
    }

    public final String component7() {
        return this.cardName;
    }

    public final String component8() {
        return this.cardType;
    }

    public final String component9() {
        return this.productCode;
    }

    public final UmtsCardApiEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l, String str15, String str16, String str17, String str18, String str19, String str20, Long l2, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33) {
        return new UmtsCardApiEntity(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, l, str15, str16, str17, str18, str19, str20, l2, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmtsCardApiEntity)) {
            return false;
        }
        UmtsCardApiEntity umtsCardApiEntity = (UmtsCardApiEntity) obj;
        return C41536l.m120484d(this.encryptedPackage, umtsCardApiEntity.encryptedPackage) && C41536l.m120484d(this.f56460id, umtsCardApiEntity.f56460id) && C41536l.m120484d(this.cardId, umtsCardApiEntity.cardId) && C41536l.m120484d(this.acctKey, umtsCardApiEntity.acctKey) && C41536l.m120484d(this.clientKey, umtsCardApiEntity.clientKey) && C41536l.m120484d(this.cardClass, umtsCardApiEntity.cardClass) && C41536l.m120484d(this.cardName, umtsCardApiEntity.cardName) && C41536l.m120484d(this.cardType, umtsCardApiEntity.cardType) && C41536l.m120484d(this.productCode, umtsCardApiEntity.productCode) && C41536l.m120484d(this.subProductCode, umtsCardApiEntity.subProductCode) && C41536l.m120484d(this.subProductGroup, umtsCardApiEntity.subProductGroup) && C41536l.m120484d(this.status, umtsCardApiEntity.status) && C41536l.m120484d(this.lastFour, umtsCardApiEntity.lastFour) && C41536l.m120484d(this.cardHolder, umtsCardApiEntity.cardHolder) && C41536l.m120484d(this.expDate, umtsCardApiEntity.expDate) && C41536l.m120484d(this.isCardBlocked, umtsCardApiEntity.isCardBlocked) && C41536l.m120484d(this.cardPan, umtsCardApiEntity.cardPan) && C41536l.m120484d(this.cardForTypeDictionaryKey, umtsCardApiEntity.cardForTypeDictionaryKey) && C41536l.m120484d(this.cardForTypeDictionaryValue, umtsCardApiEntity.cardForTypeDictionaryValue) && C41536l.m120484d(this.productGroup, umtsCardApiEntity.productGroup) && C41536l.m120484d(this.isDigitalCard, umtsCardApiEntity.isDigitalCard) && C41536l.m120484d(this.productId, umtsCardApiEntity.productId) && C41536l.m120484d(this.subProductId, umtsCardApiEntity.subProductId) && C41536l.m120484d(this.isDefault, umtsCardApiEntity.isDefault) && C41536l.m120484d(this.isHidden, umtsCardApiEntity.isHidden) && C41536l.m120484d(this.isCardExpiring, umtsCardApiEntity.isCardExpiring) && C41536l.m120484d(this.isCardInactive, umtsCardApiEntity.isCardInactive) && C41536l.m120484d(this.cardMask, umtsCardApiEntity.cardMask) && C41536l.m120484d(this.attachmentFileBase64, umtsCardApiEntity.attachmentFileBase64) && C41536l.m120484d(this.nameDictionaryKey, umtsCardApiEntity.nameDictionaryKey) && C41536l.m120484d(this.nameDictionaryValue, umtsCardApiEntity.nameDictionaryValue) && C41536l.m120484d(this.cardInsSecEntity, umtsCardApiEntity.cardInsSecEntity) && C41536l.m120484d(this.isPrimary, umtsCardApiEntity.isPrimary) && C41536l.m120484d(this.description, umtsCardApiEntity.description) && C41536l.m120484d(this.paymentNetwork, umtsCardApiEntity.paymentNetwork);
    }

    public final String getAcctKey() {
        return this.acctKey;
    }

    public final String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public final String getCardClass() {
        return this.cardClass;
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

    public final String getCardId() {
        return this.cardId;
    }

    public final String getCardInsSecEntity() {
        return this.cardInsSecEntity;
    }

    public final String getCardMask() {
        return this.cardMask;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardPan() {
        return this.cardPan;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEncryptedPackage() {
        return this.encryptedPackage;
    }

    public final Long getExpDate() {
        return this.expDate;
    }

    public final String getId() {
        return this.f56460id;
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

    public final String getPaymentNetwork() {
        return this.paymentNetwork;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductGroup() {
        return this.productGroup;
    }

    public final Long getProductId() {
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

    public final String getSubProductId() {
        return this.subProductId;
    }

    public int hashCode() {
        String str = this.encryptedPackage;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f56460id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acctKey;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.clientKey;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardClass;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cardType;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productCode;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.subProductCode;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.subProductGroup;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.status;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.lastFour;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cardHolder;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l = this.expDate;
        int hashCode15 = (hashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        String str15 = this.isCardBlocked;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.cardPan;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.cardForTypeDictionaryKey;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.cardForTypeDictionaryValue;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.productGroup;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.isDigitalCard;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Long l2 = this.productId;
        int hashCode22 = (hashCode21 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str21 = this.subProductId;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.isDefault;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.isHidden;
        int hashCode25 = (hashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.isCardExpiring;
        int hashCode26 = (hashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.isCardInactive;
        int hashCode27 = (hashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.cardMask;
        int hashCode28 = (hashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.attachmentFileBase64;
        int hashCode29 = (hashCode28 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.nameDictionaryKey;
        int hashCode30 = (hashCode29 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.nameDictionaryValue;
        int hashCode31 = (hashCode30 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.cardInsSecEntity;
        int hashCode32 = (hashCode31 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.isPrimary;
        int hashCode33 = (hashCode32 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.description;
        int hashCode34 = (hashCode33 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.paymentNetwork;
        if (str33 != null) {
            i = str33.hashCode();
        }
        return hashCode34 + i;
    }

    public final String isCardBlocked() {
        return this.isCardBlocked;
    }

    public final String isCardExpiring() {
        return this.isCardExpiring;
    }

    public final String isCardInactive() {
        return this.isCardInactive;
    }

    public final String isDefault() {
        return this.isDefault;
    }

    public final String isDigitalCard() {
        return this.isDigitalCard;
    }

    public final String isHidden() {
        return this.isHidden;
    }

    public final String isPrimary() {
        return this.isPrimary;
    }

    public String toString() {
        String str = this.encryptedPackage;
        String str2 = this.f56460id;
        String str3 = this.cardId;
        String str4 = this.acctKey;
        String str5 = this.clientKey;
        String str6 = this.cardClass;
        String str7 = this.cardName;
        String str8 = this.cardType;
        String str9 = this.productCode;
        String str10 = this.subProductCode;
        String str11 = this.subProductGroup;
        String str12 = this.status;
        String str13 = this.lastFour;
        String str14 = this.cardHolder;
        Long l = this.expDate;
        String str15 = this.isCardBlocked;
        String str16 = this.cardPan;
        String str17 = this.cardForTypeDictionaryKey;
        String str18 = this.cardForTypeDictionaryValue;
        String str19 = this.productGroup;
        String str20 = this.isDigitalCard;
        Long l2 = this.productId;
        String str21 = this.subProductId;
        String str22 = this.isDefault;
        String str23 = this.isHidden;
        String str24 = this.isCardExpiring;
        String str25 = this.isCardInactive;
        String str26 = this.cardMask;
        String str27 = this.attachmentFileBase64;
        String str28 = this.nameDictionaryKey;
        String str29 = this.nameDictionaryValue;
        String str30 = this.cardInsSecEntity;
        String str31 = this.isPrimary;
        String str32 = this.description;
        String str33 = this.paymentNetwork;
        return "UmtsCardApiEntity(encryptedPackage=" + str + ", id=" + str2 + ", cardId=" + str3 + ", acctKey=" + str4 + ", clientKey=" + str5 + ", cardClass=" + str6 + ", cardName=" + str7 + ", cardType=" + str8 + ", productCode=" + str9 + ", subProductCode=" + str10 + ", subProductGroup=" + str11 + ", status=" + str12 + ", lastFour=" + str13 + ", cardHolder=" + str14 + ", expDate=" + l + ", isCardBlocked=" + str15 + ", cardPan=" + str16 + ", cardForTypeDictionaryKey=" + str17 + ", cardForTypeDictionaryValue=" + str18 + ", productGroup=" + str19 + ", isDigitalCard=" + str20 + ", productId=" + l2 + ", subProductId=" + str21 + ", isDefault=" + str22 + ", isHidden=" + str23 + ", isCardExpiring=" + str24 + ", isCardInactive=" + str25 + ", cardMask=" + str26 + ", attachmentFileBase64=" + str27 + ", nameDictionaryKey=" + str28 + ", nameDictionaryValue=" + str29 + ", cardInsSecEntity=" + str30 + ", isPrimary=" + str31 + ", description=" + str32 + ", paymentNetwork=" + str33 + ")";
    }
}
