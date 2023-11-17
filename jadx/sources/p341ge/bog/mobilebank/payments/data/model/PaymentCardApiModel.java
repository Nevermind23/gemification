package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.PaymentCardApiModel */
public final class PaymentCardApiModel {
    private final Long acctKey;
    private final BigDecimal availableAmount;
    private final BigDecimal availableAmountBaseCcy;
    private final String cardClass;
    private final String cardData;
    private final long cardId;
    private final CardImageApiModel cardImage;
    private final String cardName;
    private final String cardNameDictionaryKey;
    private final CardImageApiModel cardSmallImage;
    private final String cardType;
    private final String ccy;
    private final Long clientKey;
    private final long expDate;
    private final String extMerchantId;
    private final String groupCode;
    private final YesNoApiEntity isDefault;
    private final String isHidden;
    private final String isLocalCard;
    private final String lastFour;
    private final String mainCur;
    private final String pan2;
    private final String paymentCardType;
    private final String productCode;
    private final String subProductCode;

    public PaymentCardApiModel(long j, String str, String str2, String str3, String str4, Long l, String str5, long j2, String str6, Long l2, String str7, String str8, String str9, BigDecimal bigDecimal, BigDecimal bigDecimal2, YesNoApiEntity yesNoApiEntity, String str10, String str11, String str12, String str13, String str14, String str15, String str16, CardImageApiModel cardImageApiModel, CardImageApiModel cardImageApiModel2) {
        C41536l.m120489i(str5, "lastFour");
        this.cardId = j;
        this.cardClass = str;
        this.cardType = str2;
        this.productCode = str3;
        this.subProductCode = str4;
        this.clientKey = l;
        this.lastFour = str5;
        this.expDate = j2;
        this.mainCur = str6;
        this.acctKey = l2;
        this.ccy = str7;
        this.pan2 = str8;
        this.cardName = str9;
        this.availableAmount = bigDecimal;
        this.availableAmountBaseCcy = bigDecimal2;
        this.isDefault = yesNoApiEntity;
        this.isHidden = str10;
        this.groupCode = str11;
        this.cardNameDictionaryKey = str12;
        this.extMerchantId = str13;
        this.isLocalCard = str14;
        this.cardData = str15;
        this.paymentCardType = str16;
        this.cardImage = cardImageApiModel;
        this.cardSmallImage = cardImageApiModel2;
    }

    public static /* synthetic */ PaymentCardApiModel copy$default(PaymentCardApiModel paymentCardApiModel, long j, String str, String str2, String str3, String str4, Long l, String str5, long j2, String str6, Long l2, String str7, String str8, String str9, BigDecimal bigDecimal, BigDecimal bigDecimal2, YesNoApiEntity yesNoApiEntity, String str10, String str11, String str12, String str13, String str14, String str15, String str16, CardImageApiModel cardImageApiModel, CardImageApiModel cardImageApiModel2, int i, Object obj) {
        PaymentCardApiModel paymentCardApiModel2 = paymentCardApiModel;
        int i2 = i;
        return paymentCardApiModel.copy((i2 & 1) != 0 ? paymentCardApiModel2.cardId : j, (i2 & 2) != 0 ? paymentCardApiModel2.cardClass : str, (i2 & 4) != 0 ? paymentCardApiModel2.cardType : str2, (i2 & 8) != 0 ? paymentCardApiModel2.productCode : str3, (i2 & 16) != 0 ? paymentCardApiModel2.subProductCode : str4, (i2 & 32) != 0 ? paymentCardApiModel2.clientKey : l, (i2 & 64) != 0 ? paymentCardApiModel2.lastFour : str5, (i2 & 128) != 0 ? paymentCardApiModel2.expDate : j2, (i2 & C11398b.f33139r) != 0 ? paymentCardApiModel2.mainCur : str6, (i2 & C11398b.f33140s) != 0 ? paymentCardApiModel2.acctKey : l2, (i2 & C11398b.f33141t) != 0 ? paymentCardApiModel2.ccy : str7, (i2 & C11398b.f33142u) != 0 ? paymentCardApiModel2.pan2 : str8, (i2 & C11398b.f33143v) != 0 ? paymentCardApiModel2.cardName : str9, (i2 & 8192) != 0 ? paymentCardApiModel2.availableAmount : bigDecimal, (i2 & 16384) != 0 ? paymentCardApiModel2.availableAmountBaseCcy : bigDecimal2, (i2 & 32768) != 0 ? paymentCardApiModel2.isDefault : yesNoApiEntity, (i2 & 65536) != 0 ? paymentCardApiModel2.isHidden : str10, (i2 & 131072) != 0 ? paymentCardApiModel2.groupCode : str11, (i2 & 262144) != 0 ? paymentCardApiModel2.cardNameDictionaryKey : str12, (i2 & 524288) != 0 ? paymentCardApiModel2.extMerchantId : str13, (i2 & 1048576) != 0 ? paymentCardApiModel2.isLocalCard : str14, (i2 & 2097152) != 0 ? paymentCardApiModel2.cardData : str15, (i2 & 4194304) != 0 ? paymentCardApiModel2.paymentCardType : str16, (i2 & 8388608) != 0 ? paymentCardApiModel2.cardImage : cardImageApiModel, (i2 & 16777216) != 0 ? paymentCardApiModel2.cardSmallImage : cardImageApiModel2);
    }

    public final long component1() {
        return this.cardId;
    }

    public final Long component10() {
        return this.acctKey;
    }

    public final String component11() {
        return this.ccy;
    }

    public final String component12() {
        return this.pan2;
    }

    public final String component13() {
        return this.cardName;
    }

    public final BigDecimal component14() {
        return this.availableAmount;
    }

    public final BigDecimal component15() {
        return this.availableAmountBaseCcy;
    }

    public final YesNoApiEntity component16() {
        return this.isDefault;
    }

    public final String component17() {
        return this.isHidden;
    }

    public final String component18() {
        return this.groupCode;
    }

    public final String component19() {
        return this.cardNameDictionaryKey;
    }

    public final String component2() {
        return this.cardClass;
    }

    public final String component20() {
        return this.extMerchantId;
    }

    public final String component21() {
        return this.isLocalCard;
    }

    public final String component22() {
        return this.cardData;
    }

    public final String component23() {
        return this.paymentCardType;
    }

    public final CardImageApiModel component24() {
        return this.cardImage;
    }

    public final CardImageApiModel component25() {
        return this.cardSmallImage;
    }

    public final String component3() {
        return this.cardType;
    }

    public final String component4() {
        return this.productCode;
    }

    public final String component5() {
        return this.subProductCode;
    }

    public final Long component6() {
        return this.clientKey;
    }

    public final String component7() {
        return this.lastFour;
    }

    public final long component8() {
        return this.expDate;
    }

    public final String component9() {
        return this.mainCur;
    }

    public final PaymentCardApiModel copy(long j, String str, String str2, String str3, String str4, Long l, String str5, long j2, String str6, Long l2, String str7, String str8, String str9, BigDecimal bigDecimal, BigDecimal bigDecimal2, YesNoApiEntity yesNoApiEntity, String str10, String str11, String str12, String str13, String str14, String str15, String str16, CardImageApiModel cardImageApiModel, CardImageApiModel cardImageApiModel2) {
        long j3 = j;
        C41536l.m120489i(str5, "lastFour");
        return new PaymentCardApiModel(j, str, str2, str3, str4, l, str5, j2, str6, l2, str7, str8, str9, bigDecimal, bigDecimal2, yesNoApiEntity, str10, str11, str12, str13, str14, str15, str16, cardImageApiModel, cardImageApiModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCardApiModel)) {
            return false;
        }
        PaymentCardApiModel paymentCardApiModel = (PaymentCardApiModel) obj;
        return this.cardId == paymentCardApiModel.cardId && C41536l.m120484d(this.cardClass, paymentCardApiModel.cardClass) && C41536l.m120484d(this.cardType, paymentCardApiModel.cardType) && C41536l.m120484d(this.productCode, paymentCardApiModel.productCode) && C41536l.m120484d(this.subProductCode, paymentCardApiModel.subProductCode) && C41536l.m120484d(this.clientKey, paymentCardApiModel.clientKey) && C41536l.m120484d(this.lastFour, paymentCardApiModel.lastFour) && this.expDate == paymentCardApiModel.expDate && C41536l.m120484d(this.mainCur, paymentCardApiModel.mainCur) && C41536l.m120484d(this.acctKey, paymentCardApiModel.acctKey) && C41536l.m120484d(this.ccy, paymentCardApiModel.ccy) && C41536l.m120484d(this.pan2, paymentCardApiModel.pan2) && C41536l.m120484d(this.cardName, paymentCardApiModel.cardName) && C41536l.m120484d(this.availableAmount, paymentCardApiModel.availableAmount) && C41536l.m120484d(this.availableAmountBaseCcy, paymentCardApiModel.availableAmountBaseCcy) && this.isDefault == paymentCardApiModel.isDefault && C41536l.m120484d(this.isHidden, paymentCardApiModel.isHidden) && C41536l.m120484d(this.groupCode, paymentCardApiModel.groupCode) && C41536l.m120484d(this.cardNameDictionaryKey, paymentCardApiModel.cardNameDictionaryKey) && C41536l.m120484d(this.extMerchantId, paymentCardApiModel.extMerchantId) && C41536l.m120484d(this.isLocalCard, paymentCardApiModel.isLocalCard) && C41536l.m120484d(this.cardData, paymentCardApiModel.cardData) && C41536l.m120484d(this.paymentCardType, paymentCardApiModel.paymentCardType) && C41536l.m120484d(this.cardImage, paymentCardApiModel.cardImage) && C41536l.m120484d(this.cardSmallImage, paymentCardApiModel.cardSmallImage);
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final BigDecimal getAvailableAmountBaseCcy() {
        return this.availableAmountBaseCcy;
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final String getCardData() {
        return this.cardData;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final CardImageApiModel getCardImage() {
        return this.cardImage;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardNameDictionaryKey() {
        return this.cardNameDictionaryKey;
    }

    public final CardImageApiModel getCardSmallImage() {
        return this.cardSmallImage;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final long getExpDate() {
        return this.expDate;
    }

    public final String getExtMerchantId() {
        return this.extMerchantId;
    }

    public final String getGroupCode() {
        return this.groupCode;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getMainCur() {
        return this.mainCur;
    }

    public final String getPan2() {
        return this.pan2;
    }

    public final String getPaymentCardType() {
        return this.paymentCardType;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.cardId) * 31;
        String str = this.cardClass;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subProductCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.clientKey;
        int hashCode5 = (((((hashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.lastFour.hashCode()) * 31) + C7397t.m28148a(this.expDate)) * 31;
        String str5 = this.mainCur;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.acctKey;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str6 = this.ccy;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pan2;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cardName;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal = this.availableAmount;
        int hashCode11 = (hashCode10 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.availableAmountBaseCcy;
        int hashCode12 = (hashCode11 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.isDefault;
        int hashCode13 = (hashCode12 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str9 = this.isHidden;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.groupCode;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cardNameDictionaryKey;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.extMerchantId;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.isLocalCard;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cardData;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.paymentCardType;
        int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        CardImageApiModel cardImageApiModel = this.cardImage;
        int hashCode21 = (hashCode20 + (cardImageApiModel == null ? 0 : cardImageApiModel.hashCode())) * 31;
        CardImageApiModel cardImageApiModel2 = this.cardSmallImage;
        if (cardImageApiModel2 != null) {
            i = cardImageApiModel2.hashCode();
        }
        return hashCode21 + i;
    }

    public final YesNoApiEntity isDefault() {
        return this.isDefault;
    }

    public final String isHidden() {
        return this.isHidden;
    }

    public final String isLocalCard() {
        return this.isLocalCard;
    }

    public String toString() {
        long j = this.cardId;
        String str = this.cardClass;
        String str2 = this.cardType;
        String str3 = this.productCode;
        String str4 = this.subProductCode;
        Long l = this.clientKey;
        String str5 = this.lastFour;
        long j2 = this.expDate;
        String str6 = this.mainCur;
        Long l2 = this.acctKey;
        String str7 = this.ccy;
        String str8 = this.pan2;
        String str9 = this.cardName;
        BigDecimal bigDecimal = this.availableAmount;
        BigDecimal bigDecimal2 = this.availableAmountBaseCcy;
        YesNoApiEntity yesNoApiEntity = this.isDefault;
        String str10 = this.isHidden;
        String str11 = this.groupCode;
        String str12 = this.cardNameDictionaryKey;
        String str13 = this.extMerchantId;
        String str14 = this.isLocalCard;
        String str15 = this.cardData;
        String str16 = this.paymentCardType;
        CardImageApiModel cardImageApiModel = this.cardImage;
        CardImageApiModel cardImageApiModel2 = this.cardSmallImage;
        return "PaymentCardApiModel(cardId=" + j + ", cardClass=" + str + ", cardType=" + str2 + ", productCode=" + str3 + ", subProductCode=" + str4 + ", clientKey=" + l + ", lastFour=" + str5 + ", expDate=" + j2 + ", mainCur=" + str6 + ", acctKey=" + l2 + ", ccy=" + str7 + ", pan2=" + str8 + ", cardName=" + str9 + ", availableAmount=" + bigDecimal + ", availableAmountBaseCcy=" + bigDecimal2 + ", isDefault=" + yesNoApiEntity + ", isHidden=" + str10 + ", groupCode=" + str11 + ", cardNameDictionaryKey=" + str12 + ", extMerchantId=" + str13 + ", isLocalCard=" + str14 + ", cardData=" + str15 + ", paymentCardType=" + str16 + ", cardImage=" + cardImageApiModel + ", cardSmallImage=" + cardImageApiModel2 + ")";
    }
}
