package p341ge.bog.mobilebank.transportcard.domain.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import j71.C36752e;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.domain.model.Card */
public final class Card {
    private final long acctKey;
    private final double availableAmount;
    private final double availableAmountBaseCcy;
    private final String cardClass;
    private final String cardData;
    private final long cardId;
    private final C36752e cardImage;
    private final String cardName;
    private final String cardNameDictionaryKey;
    private final C36752e cardSmallImage;
    private final String cardType;
    private final String ccy;
    private final long clientKey;
    private final long expDate;
    private final String extMerchantId;
    private final boolean isDefault;
    private final boolean isHidden;
    private final String isLocalCard;
    private final String lastFour;
    private final String mainCur;
    private final String pan2;
    private final String paymentCardType;
    private final String productCode;
    private final String subProductCode;

    public Card(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, boolean z, boolean z2, String str10, String str11, String str12, String str13, String str14, C36752e eVar, C36752e eVar2) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        C36752e eVar3 = eVar;
        C36752e eVar4 = eVar2;
        C41536l.m120489i(str15, "cardClass");
        C41536l.m120489i(str16, "cardType");
        C41536l.m120489i(str17, "productCode");
        C41536l.m120489i(str18, "subProductCode");
        C41536l.m120489i(str19, "lastFour");
        C41536l.m120489i(str20, "mainCur");
        C41536l.m120489i(str21, "ccy");
        C41536l.m120489i(str22, "pan2");
        C41536l.m120489i(eVar3, "cardImage");
        C41536l.m120489i(eVar4, "cardSmallImage");
        this.cardId = j;
        this.cardClass = str15;
        this.cardType = str16;
        this.productCode = str17;
        this.subProductCode = str18;
        this.clientKey = j2;
        this.lastFour = str19;
        this.expDate = j3;
        this.mainCur = str20;
        this.acctKey = j4;
        this.ccy = str21;
        this.pan2 = str22;
        this.cardName = str9;
        this.availableAmount = d;
        this.availableAmountBaseCcy = d2;
        this.isDefault = z;
        this.isHidden = z2;
        this.cardNameDictionaryKey = str10;
        this.extMerchantId = str11;
        this.isLocalCard = str12;
        this.cardData = str13;
        this.paymentCardType = str14;
        this.cardImage = eVar3;
        this.cardSmallImage = eVar4;
    }

    public static /* synthetic */ Card copy$default(Card card, long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, boolean z, boolean z2, String str10, String str11, String str12, String str13, String str14, C36752e eVar, C36752e eVar2, int i, Object obj) {
        Card card2 = card;
        int i2 = i;
        return card.copy((i2 & 1) != 0 ? card2.cardId : j, (i2 & 2) != 0 ? card2.cardClass : str, (i2 & 4) != 0 ? card2.cardType : str2, (i2 & 8) != 0 ? card2.productCode : str3, (i2 & 16) != 0 ? card2.subProductCode : str4, (i2 & 32) != 0 ? card2.clientKey : j2, (i2 & 64) != 0 ? card2.lastFour : str5, (i2 & 128) != 0 ? card2.expDate : j3, (i2 & C11398b.f33139r) != 0 ? card2.mainCur : str6, (i2 & C11398b.f33140s) != 0 ? card2.acctKey : j4, (i2 & C11398b.f33141t) != 0 ? card2.ccy : str7, (i2 & C11398b.f33142u) != 0 ? card2.pan2 : str8, (i2 & C11398b.f33143v) != 0 ? card2.cardName : str9, (i2 & 8192) != 0 ? card2.availableAmount : d, (i2 & 16384) != 0 ? card2.availableAmountBaseCcy : d2, (i2 & 32768) != 0 ? card2.isDefault : z, (65536 & i2) != 0 ? card2.isHidden : z2, (i2 & 131072) != 0 ? card2.cardNameDictionaryKey : str10, (i2 & 262144) != 0 ? card2.extMerchantId : str11, (i2 & 524288) != 0 ? card2.isLocalCard : str12, (i2 & 1048576) != 0 ? card2.cardData : str13, (i2 & 2097152) != 0 ? card2.paymentCardType : str14, (i2 & 4194304) != 0 ? card2.cardImage : eVar, (i2 & 8388608) != 0 ? card2.cardSmallImage : eVar2);
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

    public final boolean component16() {
        return this.isDefault;
    }

    public final boolean component17() {
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

    public final C36752e component23() {
        return this.cardImage;
    }

    public final C36752e component24() {
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

    public final Card copy(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, boolean z, boolean z2, String str10, String str11, String str12, String str13, String str14, C36752e eVar, C36752e eVar2) {
        long j5 = j;
        C41536l.m120489i(str, "cardClass");
        C41536l.m120489i(str2, "cardType");
        C41536l.m120489i(str3, "productCode");
        C41536l.m120489i(str4, "subProductCode");
        C41536l.m120489i(str5, "lastFour");
        C41536l.m120489i(str6, "mainCur");
        C41536l.m120489i(str7, "ccy");
        C41536l.m120489i(str8, "pan2");
        C41536l.m120489i(eVar, "cardImage");
        C41536l.m120489i(eVar2, "cardSmallImage");
        return new Card(j, str, str2, str3, str4, j2, str5, j3, str6, j4, str7, str8, str9, d, d2, z, z2, str10, str11, str12, str13, str14, eVar, eVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return this.cardId == card.cardId && C41536l.m120484d(this.cardClass, card.cardClass) && C41536l.m120484d(this.cardType, card.cardType) && C41536l.m120484d(this.productCode, card.productCode) && C41536l.m120484d(this.subProductCode, card.subProductCode) && this.clientKey == card.clientKey && C41536l.m120484d(this.lastFour, card.lastFour) && this.expDate == card.expDate && C41536l.m120484d(this.mainCur, card.mainCur) && this.acctKey == card.acctKey && C41536l.m120484d(this.ccy, card.ccy) && C41536l.m120484d(this.pan2, card.pan2) && C41536l.m120484d(this.cardName, card.cardName) && Double.compare(this.availableAmount, card.availableAmount) == 0 && Double.compare(this.availableAmountBaseCcy, card.availableAmountBaseCcy) == 0 && this.isDefault == card.isDefault && this.isHidden == card.isHidden && C41536l.m120484d(this.cardNameDictionaryKey, card.cardNameDictionaryKey) && C41536l.m120484d(this.extMerchantId, card.extMerchantId) && C41536l.m120484d(this.isLocalCard, card.isLocalCard) && C41536l.m120484d(this.cardData, card.cardData) && C41536l.m120484d(this.paymentCardType, card.paymentCardType) && C41536l.m120484d(this.cardImage, card.cardImage) && C41536l.m120484d(this.cardSmallImage, card.cardSmallImage);
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

    public final C36752e getCardImage() {
        return this.cardImage;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardNameDictionaryKey() {
        return this.cardNameDictionaryKey;
    }

    public final C36752e getCardSmallImage() {
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
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.availableAmount)) * 31) + Double.doubleToLongBits(this.availableAmountBaseCcy)) * 31;
        boolean z = this.isDefault;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isHidden;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str2 = this.cardNameDictionaryKey;
        int hashCode2 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
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

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final boolean isHidden() {
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
        boolean z = this.isDefault;
        boolean z2 = this.isHidden;
        String str10 = this.cardNameDictionaryKey;
        String str11 = this.extMerchantId;
        String str12 = this.isLocalCard;
        String str13 = this.cardData;
        String str14 = this.paymentCardType;
        C36752e eVar = this.cardImage;
        C36752e eVar2 = this.cardSmallImage;
        return "Card(cardId=" + j + ", cardClass=" + str + ", cardType=" + str2 + ", productCode=" + str3 + ", subProductCode=" + str4 + ", clientKey=" + j2 + ", lastFour=" + str5 + ", expDate=" + j3 + ", mainCur=" + str6 + ", acctKey=" + j5 + ", ccy=" + str7 + ", pan2=" + str8 + ", cardName=" + str9 + ", availableAmount=" + d + ", availableAmountBaseCcy=" + d2 + ", isDefault=" + z + ", isHidden=" + z2 + ", cardNameDictionaryKey=" + str10 + ", extMerchantId=" + str11 + ", isLocalCard=" + str12 + ", cardData=" + str13 + ", paymentCardType=" + str14 + ", cardImage=" + eVar + ", cardSmallImage=" + eVar2 + ")";
    }
}
