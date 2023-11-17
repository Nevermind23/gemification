package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.RecoverCardEntity */
public final class RecoverCardEntity {
    private final long acctKey;
    private final String attachmentFileBase64;
    private final String cardClass;
    private final String cardClassCode;
    private final YesNoApiEntity cardCloseFlag;
    private final CardExternalFileEntity cardExternalFile;
    private final long cardForTypeDescKeyId;
    private final String cardHolder;
    private final long cardId;
    private final String cardMask;
    private final String cardName;
    private final String cardType;
    private final String ccy;
    private final long clientKey;
    private final Long expDate;
    private final YesNoApiEntity expFlag;
    private final CardExternalFileEntity externalFile;
    private final String fileId;

    /* renamed from: id */
    private final long f41309id;
    private final String insuranceCode;
    private final YesNoApiEntity isDigitalCard;
    private final String lastFour;
    private final long linkId;
    private final YesNoApiEntity mainCurrency;
    private final String nameDictionaryKey;
    private final String nameDictionaryValue;
    private final Long orgId;
    private final String pan2;
    private final String productCode;
    private final YesNoApiEntity recoveryFlag;
    private final String status;
    private final String subProductCode;
    private final String subProductGroup;

    public RecoverCardEntity(long j, long j2, long j3, long j4, long j5, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, YesNoApiEntity yesNoApiEntity, long j6, String str9, String str10, String str11, String str12, String str13, YesNoApiEntity yesNoApiEntity2, String str14, YesNoApiEntity yesNoApiEntity3, String str15, YesNoApiEntity yesNoApiEntity4, YesNoApiEntity yesNoApiEntity5, Long l2, String str16, String str17, CardExternalFileEntity cardExternalFileEntity, CardExternalFileEntity cardExternalFileEntity2, String str18) {
        String str19 = str;
        String str20 = str2;
        String str21 = str4;
        String str22 = str5;
        String str23 = str7;
        String str24 = str9;
        String str25 = str11;
        String str26 = str16;
        String str27 = str17;
        C41536l.m120489i(str19, "cardClass");
        C41536l.m120489i(str20, "cardType");
        C41536l.m120489i(str21, "productCode");
        C41536l.m120489i(str22, "subProductCode");
        C41536l.m120489i(str23, "lastFour");
        C41536l.m120489i(str24, "pan2");
        C41536l.m120489i(str25, "subProductGroup");
        C41536l.m120489i(str26, "nameDictionaryKey");
        C41536l.m120489i(str27, "nameDictionaryValue");
        this.f41309id = j;
        this.cardId = j2;
        this.acctKey = j3;
        this.clientKey = j4;
        this.cardForTypeDescKeyId = j5;
        this.cardClass = str19;
        this.cardType = str20;
        this.cardName = str3;
        this.productCode = str21;
        this.subProductCode = str22;
        this.cardHolder = str6;
        this.expDate = l;
        this.lastFour = str23;
        this.ccy = str8;
        this.mainCurrency = yesNoApiEntity;
        this.linkId = j6;
        this.pan2 = str24;
        this.insuranceCode = str10;
        this.subProductGroup = str25;
        this.status = str12;
        this.cardMask = str13;
        this.isDigitalCard = yesNoApiEntity2;
        this.cardClassCode = str14;
        this.cardCloseFlag = yesNoApiEntity3;
        this.fileId = str15;
        this.expFlag = yesNoApiEntity4;
        this.recoveryFlag = yesNoApiEntity5;
        this.orgId = l2;
        this.nameDictionaryKey = str26;
        this.nameDictionaryValue = str27;
        this.externalFile = cardExternalFileEntity;
        this.cardExternalFile = cardExternalFileEntity2;
        this.attachmentFileBase64 = str18;
    }

    public static /* synthetic */ RecoverCardEntity copy$default(RecoverCardEntity recoverCardEntity, long j, long j2, long j3, long j4, long j5, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, YesNoApiEntity yesNoApiEntity, long j6, String str9, String str10, String str11, String str12, String str13, YesNoApiEntity yesNoApiEntity2, String str14, YesNoApiEntity yesNoApiEntity3, String str15, YesNoApiEntity yesNoApiEntity4, YesNoApiEntity yesNoApiEntity5, Long l2, String str16, String str17, CardExternalFileEntity cardExternalFileEntity, CardExternalFileEntity cardExternalFileEntity2, String str18, int i, int i2, Object obj) {
        RecoverCardEntity recoverCardEntity2 = recoverCardEntity;
        int i3 = i;
        return recoverCardEntity.copy((i3 & 1) != 0 ? recoverCardEntity2.f41309id : j, (i3 & 2) != 0 ? recoverCardEntity2.cardId : j2, (i3 & 4) != 0 ? recoverCardEntity2.acctKey : j3, (i3 & 8) != 0 ? recoverCardEntity2.clientKey : j4, (i3 & 16) != 0 ? recoverCardEntity2.cardForTypeDescKeyId : j5, (i3 & 32) != 0 ? recoverCardEntity2.cardClass : str, (i3 & 64) != 0 ? recoverCardEntity2.cardType : str2, (i3 & 128) != 0 ? recoverCardEntity2.cardName : str3, (i3 & C11398b.f33139r) != 0 ? recoverCardEntity2.productCode : str4, (i3 & C11398b.f33140s) != 0 ? recoverCardEntity2.subProductCode : str5, (i3 & C11398b.f33141t) != 0 ? recoverCardEntity2.cardHolder : str6, (i3 & C11398b.f33142u) != 0 ? recoverCardEntity2.expDate : l, (i3 & C11398b.f33143v) != 0 ? recoverCardEntity2.lastFour : str7, (i3 & 8192) != 0 ? recoverCardEntity2.ccy : str8, (i3 & 16384) != 0 ? recoverCardEntity2.mainCurrency : yesNoApiEntity, (i3 & 32768) != 0 ? recoverCardEntity2.linkId : j6, (i3 & 65536) != 0 ? recoverCardEntity2.pan2 : str9, (131072 & i3) != 0 ? recoverCardEntity2.insuranceCode : str10, (i3 & 262144) != 0 ? recoverCardEntity2.subProductGroup : str11, (i3 & 524288) != 0 ? recoverCardEntity2.status : str12, (i3 & 1048576) != 0 ? recoverCardEntity2.cardMask : str13, (i3 & 2097152) != 0 ? recoverCardEntity2.isDigitalCard : yesNoApiEntity2, (i3 & 4194304) != 0 ? recoverCardEntity2.cardClassCode : str14, (i3 & 8388608) != 0 ? recoverCardEntity2.cardCloseFlag : yesNoApiEntity3, (i3 & 16777216) != 0 ? recoverCardEntity2.fileId : str15, (i3 & 33554432) != 0 ? recoverCardEntity2.expFlag : yesNoApiEntity4, (i3 & 67108864) != 0 ? recoverCardEntity2.recoveryFlag : yesNoApiEntity5, (i3 & 134217728) != 0 ? recoverCardEntity2.orgId : l2, (i3 & 268435456) != 0 ? recoverCardEntity2.nameDictionaryKey : str16, (i3 & 536870912) != 0 ? recoverCardEntity2.nameDictionaryValue : str17, (i3 & 1073741824) != 0 ? recoverCardEntity2.externalFile : cardExternalFileEntity, (i3 & Integer.MIN_VALUE) != 0 ? recoverCardEntity2.cardExternalFile : cardExternalFileEntity2, (i2 & 1) != 0 ? recoverCardEntity2.attachmentFileBase64 : str18);
    }

    public final long component1() {
        return this.f41309id;
    }

    public final String component10() {
        return this.subProductCode;
    }

    public final String component11() {
        return this.cardHolder;
    }

    public final Long component12() {
        return this.expDate;
    }

    public final String component13() {
        return this.lastFour;
    }

    public final String component14() {
        return this.ccy;
    }

    public final YesNoApiEntity component15() {
        return this.mainCurrency;
    }

    public final long component16() {
        return this.linkId;
    }

    public final String component17() {
        return this.pan2;
    }

    public final String component18() {
        return this.insuranceCode;
    }

    public final String component19() {
        return this.subProductGroup;
    }

    public final long component2() {
        return this.cardId;
    }

    public final String component20() {
        return this.status;
    }

    public final String component21() {
        return this.cardMask;
    }

    public final YesNoApiEntity component22() {
        return this.isDigitalCard;
    }

    public final String component23() {
        return this.cardClassCode;
    }

    public final YesNoApiEntity component24() {
        return this.cardCloseFlag;
    }

    public final String component25() {
        return this.fileId;
    }

    public final YesNoApiEntity component26() {
        return this.expFlag;
    }

    public final YesNoApiEntity component27() {
        return this.recoveryFlag;
    }

    public final Long component28() {
        return this.orgId;
    }

    public final String component29() {
        return this.nameDictionaryKey;
    }

    public final long component3() {
        return this.acctKey;
    }

    public final String component30() {
        return this.nameDictionaryValue;
    }

    public final CardExternalFileEntity component31() {
        return this.externalFile;
    }

    public final CardExternalFileEntity component32() {
        return this.cardExternalFile;
    }

    public final String component33() {
        return this.attachmentFileBase64;
    }

    public final long component4() {
        return this.clientKey;
    }

    public final long component5() {
        return this.cardForTypeDescKeyId;
    }

    public final String component6() {
        return this.cardClass;
    }

    public final String component7() {
        return this.cardType;
    }

    public final String component8() {
        return this.cardName;
    }

    public final String component9() {
        return this.productCode;
    }

    public final RecoverCardEntity copy(long j, long j2, long j3, long j4, long j5, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, YesNoApiEntity yesNoApiEntity, long j6, String str9, String str10, String str11, String str12, String str13, YesNoApiEntity yesNoApiEntity2, String str14, YesNoApiEntity yesNoApiEntity3, String str15, YesNoApiEntity yesNoApiEntity4, YesNoApiEntity yesNoApiEntity5, Long l2, String str16, String str17, CardExternalFileEntity cardExternalFileEntity, CardExternalFileEntity cardExternalFileEntity2, String str18) {
        long j7 = j;
        C41536l.m120489i(str, "cardClass");
        C41536l.m120489i(str2, "cardType");
        C41536l.m120489i(str4, "productCode");
        C41536l.m120489i(str5, "subProductCode");
        C41536l.m120489i(str7, "lastFour");
        C41536l.m120489i(str9, "pan2");
        C41536l.m120489i(str11, "subProductGroup");
        C41536l.m120489i(str16, "nameDictionaryKey");
        C41536l.m120489i(str17, "nameDictionaryValue");
        return new RecoverCardEntity(j, j2, j3, j4, j5, str, str2, str3, str4, str5, str6, l, str7, str8, yesNoApiEntity, j6, str9, str10, str11, str12, str13, yesNoApiEntity2, str14, yesNoApiEntity3, str15, yesNoApiEntity4, yesNoApiEntity5, l2, str16, str17, cardExternalFileEntity, cardExternalFileEntity2, str18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecoverCardEntity)) {
            return false;
        }
        RecoverCardEntity recoverCardEntity = (RecoverCardEntity) obj;
        return this.f41309id == recoverCardEntity.f41309id && this.cardId == recoverCardEntity.cardId && this.acctKey == recoverCardEntity.acctKey && this.clientKey == recoverCardEntity.clientKey && this.cardForTypeDescKeyId == recoverCardEntity.cardForTypeDescKeyId && C41536l.m120484d(this.cardClass, recoverCardEntity.cardClass) && C41536l.m120484d(this.cardType, recoverCardEntity.cardType) && C41536l.m120484d(this.cardName, recoverCardEntity.cardName) && C41536l.m120484d(this.productCode, recoverCardEntity.productCode) && C41536l.m120484d(this.subProductCode, recoverCardEntity.subProductCode) && C41536l.m120484d(this.cardHolder, recoverCardEntity.cardHolder) && C41536l.m120484d(this.expDate, recoverCardEntity.expDate) && C41536l.m120484d(this.lastFour, recoverCardEntity.lastFour) && C41536l.m120484d(this.ccy, recoverCardEntity.ccy) && this.mainCurrency == recoverCardEntity.mainCurrency && this.linkId == recoverCardEntity.linkId && C41536l.m120484d(this.pan2, recoverCardEntity.pan2) && C41536l.m120484d(this.insuranceCode, recoverCardEntity.insuranceCode) && C41536l.m120484d(this.subProductGroup, recoverCardEntity.subProductGroup) && C41536l.m120484d(this.status, recoverCardEntity.status) && C41536l.m120484d(this.cardMask, recoverCardEntity.cardMask) && this.isDigitalCard == recoverCardEntity.isDigitalCard && C41536l.m120484d(this.cardClassCode, recoverCardEntity.cardClassCode) && this.cardCloseFlag == recoverCardEntity.cardCloseFlag && C41536l.m120484d(this.fileId, recoverCardEntity.fileId) && this.expFlag == recoverCardEntity.expFlag && this.recoveryFlag == recoverCardEntity.recoveryFlag && C41536l.m120484d(this.orgId, recoverCardEntity.orgId) && C41536l.m120484d(this.nameDictionaryKey, recoverCardEntity.nameDictionaryKey) && C41536l.m120484d(this.nameDictionaryValue, recoverCardEntity.nameDictionaryValue) && C41536l.m120484d(this.externalFile, recoverCardEntity.externalFile) && C41536l.m120484d(this.cardExternalFile, recoverCardEntity.cardExternalFile) && C41536l.m120484d(this.attachmentFileBase64, recoverCardEntity.attachmentFileBase64);
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

    public final YesNoApiEntity getCardCloseFlag() {
        return this.cardCloseFlag;
    }

    public final CardExternalFileEntity getCardExternalFile() {
        return this.cardExternalFile;
    }

    public final long getCardForTypeDescKeyId() {
        return this.cardForTypeDescKeyId;
    }

    public final String getCardHolder() {
        return this.cardHolder;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getCardMask() {
        return this.cardMask;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final Long getExpDate() {
        return this.expDate;
    }

    public final YesNoApiEntity getExpFlag() {
        return this.expFlag;
    }

    public final CardExternalFileEntity getExternalFile() {
        return this.externalFile;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final long getId() {
        return this.f41309id;
    }

    public final String getInsuranceCode() {
        return this.insuranceCode;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final long getLinkId() {
        return this.linkId;
    }

    public final YesNoApiEntity getMainCurrency() {
        return this.mainCurrency;
    }

    public final String getNameDictionaryKey() {
        return this.nameDictionaryKey;
    }

    public final String getNameDictionaryValue() {
        return this.nameDictionaryValue;
    }

    public final Long getOrgId() {
        return this.orgId;
    }

    public final String getPan2() {
        return this.pan2;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final YesNoApiEntity getRecoveryFlag() {
        return this.recoveryFlag;
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

    public int hashCode() {
        int a = ((((((((((((C7397t.m28148a(this.f41309id) * 31) + C7397t.m28148a(this.cardId)) * 31) + C7397t.m28148a(this.acctKey)) * 31) + C7397t.m28148a(this.clientKey)) * 31) + C7397t.m28148a(this.cardForTypeDescKeyId)) * 31) + this.cardClass.hashCode()) * 31) + this.cardType.hashCode()) * 31;
        String str = this.cardName;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + this.productCode.hashCode()) * 31) + this.subProductCode.hashCode()) * 31;
        String str2 = this.cardHolder;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.expDate;
        int hashCode3 = (((hashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.lastFour.hashCode()) * 31;
        String str3 = this.ccy;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.mainCurrency;
        int hashCode5 = (((((hashCode4 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31) + C7397t.m28148a(this.linkId)) * 31) + this.pan2.hashCode()) * 31;
        String str4 = this.insuranceCode;
        int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.subProductGroup.hashCode()) * 31;
        String str5 = this.status;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardMask;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.isDigitalCard;
        int hashCode9 = (hashCode8 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        String str7 = this.cardClassCode;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity3 = this.cardCloseFlag;
        int hashCode11 = (hashCode10 + (yesNoApiEntity3 == null ? 0 : yesNoApiEntity3.hashCode())) * 31;
        String str8 = this.fileId;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity4 = this.expFlag;
        int hashCode13 = (hashCode12 + (yesNoApiEntity4 == null ? 0 : yesNoApiEntity4.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity5 = this.recoveryFlag;
        int hashCode14 = (hashCode13 + (yesNoApiEntity5 == null ? 0 : yesNoApiEntity5.hashCode())) * 31;
        Long l2 = this.orgId;
        int hashCode15 = (((((hashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.nameDictionaryKey.hashCode()) * 31) + this.nameDictionaryValue.hashCode()) * 31;
        CardExternalFileEntity cardExternalFileEntity = this.externalFile;
        int hashCode16 = (hashCode15 + (cardExternalFileEntity == null ? 0 : cardExternalFileEntity.hashCode())) * 31;
        CardExternalFileEntity cardExternalFileEntity2 = this.cardExternalFile;
        int hashCode17 = (hashCode16 + (cardExternalFileEntity2 == null ? 0 : cardExternalFileEntity2.hashCode())) * 31;
        String str9 = this.attachmentFileBase64;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode17 + i;
    }

    public final YesNoApiEntity isDigitalCard() {
        return this.isDigitalCard;
    }

    public String toString() {
        long j = this.f41309id;
        long j2 = this.cardId;
        long j3 = this.acctKey;
        long j4 = this.clientKey;
        long j5 = this.cardForTypeDescKeyId;
        String str = this.cardClass;
        String str2 = this.cardType;
        String str3 = this.cardName;
        String str4 = this.productCode;
        String str5 = this.subProductCode;
        String str6 = this.cardHolder;
        Long l = this.expDate;
        String str7 = this.lastFour;
        String str8 = this.ccy;
        String str9 = str4;
        YesNoApiEntity yesNoApiEntity = this.mainCurrency;
        long j6 = this.linkId;
        String str10 = this.pan2;
        String str11 = this.insuranceCode;
        String str12 = this.subProductGroup;
        String str13 = this.status;
        String str14 = this.cardMask;
        YesNoApiEntity yesNoApiEntity2 = this.isDigitalCard;
        String str15 = this.cardClassCode;
        YesNoApiEntity yesNoApiEntity3 = this.cardCloseFlag;
        String str16 = this.fileId;
        YesNoApiEntity yesNoApiEntity4 = this.expFlag;
        YesNoApiEntity yesNoApiEntity5 = this.recoveryFlag;
        Long l2 = this.orgId;
        String str17 = this.nameDictionaryKey;
        String str18 = this.nameDictionaryValue;
        CardExternalFileEntity cardExternalFileEntity = this.externalFile;
        CardExternalFileEntity cardExternalFileEntity2 = this.cardExternalFile;
        String str19 = this.attachmentFileBase64;
        return "RecoverCardEntity(id=" + j + ", cardId=" + j2 + ", acctKey=" + j3 + ", clientKey=" + j4 + ", cardForTypeDescKeyId=" + j5 + ", cardClass=" + str + ", cardType=" + str2 + ", cardName=" + str3 + ", productCode=" + str9 + ", subProductCode=" + str5 + ", cardHolder=" + str6 + ", expDate=" + l + ", lastFour=" + str7 + ", ccy=" + str8 + ", mainCurrency=" + yesNoApiEntity + ", linkId=" + j6 + ", pan2=" + str10 + ", insuranceCode=" + str11 + ", subProductGroup=" + str12 + ", status=" + str13 + ", cardMask=" + str14 + ", isDigitalCard=" + yesNoApiEntity2 + ", cardClassCode=" + str15 + ", cardCloseFlag=" + yesNoApiEntity3 + ", fileId=" + str16 + ", expFlag=" + yesNoApiEntity4 + ", recoveryFlag=" + yesNoApiEntity5 + ", orgId=" + l2 + ", nameDictionaryKey=" + str17 + ", nameDictionaryValue=" + str18 + ", externalFile=" + cardExternalFileEntity + ", cardExternalFile=" + cardExternalFileEntity2 + ", attachmentFileBase64=" + str19 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecoverCardEntity(long j, long j2, long j3, long j4, long j5, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, YesNoApiEntity yesNoApiEntity, long j6, String str9, String str10, String str11, String str12, String str13, YesNoApiEntity yesNoApiEntity2, String str14, YesNoApiEntity yesNoApiEntity3, String str15, YesNoApiEntity yesNoApiEntity4, YesNoApiEntity yesNoApiEntity5, Long l2, String str16, String str17, CardExternalFileEntity cardExternalFileEntity, CardExternalFileEntity cardExternalFileEntity2, String str18, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, str, str2, str3, str4, str5, str6, l, str7, str8, yesNoApiEntity, j6, str9, (i & 131072) != 0 ? null : str10, str11, str12, str13, yesNoApiEntity2, str14, yesNoApiEntity3, str15, yesNoApiEntity4, yesNoApiEntity5, l2, str16, str17, cardExternalFileEntity, cardExternalFileEntity2, str18);
    }
}
