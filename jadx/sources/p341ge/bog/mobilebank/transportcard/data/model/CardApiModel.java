package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.CardApiModel */
public final class CardApiModel {
    private final long acctKey;
    private final double availableAmount;
    private final double availableAmountBaseCcy;
    private final String cardClass;
    private final String cardData;
    private final long cardId;
    private final CardExternalFileApiModel cardImage;
    private final String cardName;
    private final String cardNameDictionaryKey;
    private final CardExternalFileApiModel cardSmallImage;
    private final String cardType;
    private final String ccy;
    private final long clientKey;
    private final long expDate;
    private final String extMerchantId;
    private final String isDefault;
    private final String isHidden;
    private final String isLocalCard;
    private final String lastFour;
    private final String mainCur;
    private final String pan2;
    private final String paymentCardType;
    private final String productCode;
    private final String subProductCode;

    public CardApiModel(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, CardExternalFileApiModel cardExternalFileApiModel, CardExternalFileApiModel cardExternalFileApiModel2) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        String str25 = str10;
        String str26 = str11;
        CardExternalFileApiModel cardExternalFileApiModel3 = cardExternalFileApiModel;
        CardExternalFileApiModel cardExternalFileApiModel4 = cardExternalFileApiModel2;
        C41536l.m120489i(str17, "cardClass");
        C41536l.m120489i(str18, "cardType");
        C41536l.m120489i(str19, "productCode");
        C41536l.m120489i(str20, "subProductCode");
        C41536l.m120489i(str21, "lastFour");
        C41536l.m120489i(str22, "mainCur");
        C41536l.m120489i(str23, "ccy");
        C41536l.m120489i(str24, "pan2");
        C41536l.m120489i(str25, "isDefault");
        C41536l.m120489i(str26, "isHidden");
        C41536l.m120489i(cardExternalFileApiModel3, "cardImage");
        C41536l.m120489i(cardExternalFileApiModel4, "cardSmallImage");
        this.cardId = j;
        this.cardClass = str17;
        this.cardType = str18;
        this.productCode = str19;
        this.subProductCode = str20;
        this.clientKey = j2;
        this.lastFour = str21;
        this.expDate = j3;
        this.mainCur = str22;
        this.acctKey = j4;
        this.ccy = str23;
        this.pan2 = str24;
        this.cardName = str9;
        this.availableAmount = d;
        this.availableAmountBaseCcy = d2;
        this.isDefault = str25;
        this.isHidden = str26;
        this.cardNameDictionaryKey = str12;
        this.extMerchantId = str13;
        this.isLocalCard = str14;
        this.cardData = str15;
        this.paymentCardType = str16;
        this.cardImage = cardExternalFileApiModel3;
        this.cardSmallImage = cardExternalFileApiModel4;
    }

    public static /* synthetic */ CardApiModel copy$default(CardApiModel cardApiModel, long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, CardExternalFileApiModel cardExternalFileApiModel, CardExternalFileApiModel cardExternalFileApiModel2, int i, Object obj) {
        CardApiModel cardApiModel2 = cardApiModel;
        int i2 = i;
        return cardApiModel.copy((i2 & 1) != 0 ? cardApiModel2.cardId : j, (i2 & 2) != 0 ? cardApiModel2.cardClass : str, (i2 & 4) != 0 ? cardApiModel2.cardType : str2, (i2 & 8) != 0 ? cardApiModel2.productCode : str3, (i2 & 16) != 0 ? cardApiModel2.subProductCode : str4, (i2 & 32) != 0 ? cardApiModel2.clientKey : j2, (i2 & 64) != 0 ? cardApiModel2.lastFour : str5, (i2 & 128) != 0 ? cardApiModel2.expDate : j3, (i2 & C11398b.f33139r) != 0 ? cardApiModel2.mainCur : str6, (i2 & C11398b.f33140s) != 0 ? cardApiModel2.acctKey : j4, (i2 & C11398b.f33141t) != 0 ? cardApiModel2.ccy : str7, (i2 & C11398b.f33142u) != 0 ? cardApiModel2.pan2 : str8, (i2 & C11398b.f33143v) != 0 ? cardApiModel2.cardName : str9, (i2 & 8192) != 0 ? cardApiModel2.availableAmount : d, (i2 & 16384) != 0 ? cardApiModel2.availableAmountBaseCcy : d2, (i2 & 32768) != 0 ? cardApiModel2.isDefault : str10, (65536 & i2) != 0 ? cardApiModel2.isHidden : str11, (i2 & 131072) != 0 ? cardApiModel2.cardNameDictionaryKey : str12, (i2 & 262144) != 0 ? cardApiModel2.extMerchantId : str13, (i2 & 524288) != 0 ? cardApiModel2.isLocalCard : str14, (i2 & 1048576) != 0 ? cardApiModel2.cardData : str15, (i2 & 2097152) != 0 ? cardApiModel2.paymentCardType : str16, (i2 & 4194304) != 0 ? cardApiModel2.cardImage : cardExternalFileApiModel, (i2 & 8388608) != 0 ? cardApiModel2.cardSmallImage : cardExternalFileApiModel2);
    }

    public final long component1() {
        return this.cardId;
    }

    public final long component10() {
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

    public final double component14() {
        return this.availableAmount;
    }

    public final double component15() {
        return this.availableAmountBaseCcy;
    }

    public final String component16() {
        return this.isDefault;
    }

    public final String component17() {
        return this.isHidden;
    }

    public final String component18() {
        return this.cardNameDictionaryKey;
    }

    public final String component19() {
        return this.extMerchantId;
    }

    public final String component2() {
        return this.cardClass;
    }

    public final String component20() {
        return this.isLocalCard;
    }

    public final String component21() {
        return this.cardData;
    }

    public final String component22() {
        return this.paymentCardType;
    }

    public final CardExternalFileApiModel component23() {
        return this.cardImage;
    }

    public final CardExternalFileApiModel component24() {
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

    public final long component6() {
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

    public final CardApiModel copy(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, CardExternalFileApiModel cardExternalFileApiModel, CardExternalFileApiModel cardExternalFileApiModel2) {
        long j5 = j;
        C41536l.m120489i(str, "cardClass");
        C41536l.m120489i(str2, "cardType");
        C41536l.m120489i(str3, "productCode");
        C41536l.m120489i(str4, "subProductCode");
        C41536l.m120489i(str5, "lastFour");
        C41536l.m120489i(str6, "mainCur");
        C41536l.m120489i(str7, "ccy");
        C41536l.m120489i(str8, "pan2");
        C41536l.m120489i(str10, "isDefault");
        C41536l.m120489i(str11, "isHidden");
        C41536l.m120489i(cardExternalFileApiModel, "cardImage");
        C41536l.m120489i(cardExternalFileApiModel2, "cardSmallImage");
        return new CardApiModel(j, str, str2, str3, str4, j2, str5, j3, str6, j4, str7, str8, str9, d, d2, str10, str11, str12, str13, str14, str15, str16, cardExternalFileApiModel, cardExternalFileApiModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardApiModel)) {
            return false;
        }
        CardApiModel cardApiModel = (CardApiModel) obj;
        return this.cardId == cardApiModel.cardId && C41536l.m120484d(this.cardClass, cardApiModel.cardClass) && C41536l.m120484d(this.cardType, cardApiModel.cardType) && C41536l.m120484d(this.productCode, cardApiModel.productCode) && C41536l.m120484d(this.subProductCode, cardApiModel.subProductCode) && this.clientKey == cardApiModel.clientKey && C41536l.m120484d(this.lastFour, cardApiModel.lastFour) && this.expDate == cardApiModel.expDate && C41536l.m120484d(this.mainCur, cardApiModel.mainCur) && this.acctKey == cardApiModel.acctKey && C41536l.m120484d(this.ccy, cardApiModel.ccy) && C41536l.m120484d(this.pan2, cardApiModel.pan2) && C41536l.m120484d(this.cardName, cardApiModel.cardName) && Double.compare(this.availableAmount, cardApiModel.availableAmount) == 0 && Double.compare(this.availableAmountBaseCcy, cardApiModel.availableAmountBaseCcy) == 0 && C41536l.m120484d(this.isDefault, cardApiModel.isDefault) && C41536l.m120484d(this.isHidden, cardApiModel.isHidden) && C41536l.m120484d(this.cardNameDictionaryKey, cardApiModel.cardNameDictionaryKey) && C41536l.m120484d(this.extMerchantId, cardApiModel.extMerchantId) && C41536l.m120484d(this.isLocalCard, cardApiModel.isLocalCard) && C41536l.m120484d(this.cardData, cardApiModel.cardData) && C41536l.m120484d(this.paymentCardType, cardApiModel.paymentCardType) && C41536l.m120484d(this.cardImage, cardApiModel.cardImage) && C41536l.m120484d(this.cardSmallImage, cardApiModel.cardSmallImage);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final double getAvailableAmount() {
        return this.availableAmount;
    }

    public final double getAvailableAmountBaseCcy() {
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

    public final CardExternalFileApiModel getCardImage() {
        return this.cardImage;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardNameDictionaryKey() {
        return this.cardNameDictionaryKey;
    }

    public final CardExternalFileApiModel getCardSmallImage() {
        return this.cardSmallImage;
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

    public final long getExpDate() {
        return this.expDate;
    }

    public final String getExtMerchantId() {
        return this.extMerchantId;
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
        int a = ((((((((((((((((((((((C7397t.m28148a(this.cardId) * 31) + this.cardClass.hashCode()) * 31) + this.cardType.hashCode()) * 31) + this.productCode.hashCode()) * 31) + this.subProductCode.hashCode()) * 31) + C7397t.m28148a(this.clientKey)) * 31) + this.lastFour.hashCode()) * 31) + C7397t.m28148a(this.expDate)) * 31) + this.mainCur.hashCode()) * 31) + C7397t.m28148a(this.acctKey)) * 31) + this.ccy.hashCode()) * 31) + this.pan2.hashCode()) * 31;
        String str = this.cardName;
        int i = 0;
        int hashCode = (((((((((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.availableAmount)) * 31) + Double.doubleToLongBits(this.availableAmountBaseCcy)) * 31) + this.isDefault.hashCode()) * 31) + this.isHidden.hashCode()) * 31;
        String str2 = this.cardNameDictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extMerchantId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.isLocalCard;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardData;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentCardType;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((((hashCode5 + i) * 31) + this.cardImage.hashCode()) * 31) + this.cardSmallImage.hashCode();
    }

    public final String isDefault() {
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
        long j2 = this.clientKey;
        String str5 = this.lastFour;
        long j3 = this.expDate;
        String str6 = this.mainCur;
        long j4 = this.acctKey;
        String str7 = this.ccy;
        String str8 = this.pan2;
        String str9 = this.cardName;
        long j5 = j4;
        double d = this.availableAmount;
        double d2 = this.availableAmountBaseCcy;
        String str10 = this.isDefault;
        String str11 = this.isHidden;
        String str12 = this.cardNameDictionaryKey;
        String str13 = this.extMerchantId;
        String str14 = this.isLocalCard;
        String str15 = this.cardData;
        String str16 = this.paymentCardType;
        CardExternalFileApiModel cardExternalFileApiModel = this.cardImage;
        CardExternalFileApiModel cardExternalFileApiModel2 = this.cardSmallImage;
        return "CardApiModel(cardId=" + j + ", cardClass=" + str + ", cardType=" + str2 + ", productCode=" + str3 + ", subProductCode=" + str4 + ", clientKey=" + j2 + ", lastFour=" + str5 + ", expDate=" + j3 + ", mainCur=" + str6 + ", acctKey=" + j5 + ", ccy=" + str7 + ", pan2=" + str8 + ", cardName=" + str9 + ", availableAmount=" + d + ", availableAmountBaseCcy=" + d2 + ", isDefault=" + str10 + ", isHidden=" + str11 + ", cardNameDictionaryKey=" + str12 + ", extMerchantId=" + str13 + ", isLocalCard=" + str14 + ", cardData=" + str15 + ", paymentCardType=" + str16 + ", cardImage=" + cardExternalFileApiModel + ", cardSmallImage=" + cardExternalFileApiModel2 + ")";
    }
}
