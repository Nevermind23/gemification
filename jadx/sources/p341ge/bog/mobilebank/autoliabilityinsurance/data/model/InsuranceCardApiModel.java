package p341ge.bog.mobilebank.autoliabilityinsurance.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.data.model.InsuranceCardApiModel */
public final class InsuranceCardApiModel {
    private final long acctKey;
    private final double availableAmount;
    private final double availableAmountBaseCcy;
    private final String cardClass;
    private final String cardData;
    private final long cardId;
    private final InsuranceCardExternalFileApiModel cardImage;
    private final String cardName;
    private final InsuranceCardExternalFileApiModel cardSmallImage;
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

    public InsuranceCardApiModel(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, String str10, String str11, String str12, String str13, String str14, String str15, InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel, InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel2) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        String str24 = str10;
        String str25 = str11;
        InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel3 = insuranceCardExternalFileApiModel;
        InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel4 = insuranceCardExternalFileApiModel2;
        C41536l.m120489i(str16, "cardClass");
        C41536l.m120489i(str17, "cardType");
        C41536l.m120489i(str18, "productCode");
        C41536l.m120489i(str19, "subProductCode");
        C41536l.m120489i(str20, "lastFour");
        C41536l.m120489i(str21, "mainCur");
        C41536l.m120489i(str22, "ccy");
        C41536l.m120489i(str23, "pan2");
        C41536l.m120489i(str24, "isDefault");
        C41536l.m120489i(str25, "isHidden");
        C41536l.m120489i(insuranceCardExternalFileApiModel3, "cardImage");
        C41536l.m120489i(insuranceCardExternalFileApiModel4, "cardSmallImage");
        this.cardId = j;
        this.cardClass = str16;
        this.cardType = str17;
        this.productCode = str18;
        this.subProductCode = str19;
        this.clientKey = j2;
        this.lastFour = str20;
        this.expDate = j3;
        this.mainCur = str21;
        this.acctKey = j4;
        this.ccy = str22;
        this.pan2 = str23;
        this.cardName = str9;
        this.availableAmount = d;
        this.availableAmountBaseCcy = d2;
        this.isDefault = str24;
        this.isHidden = str25;
        this.extMerchantId = str12;
        this.isLocalCard = str13;
        this.cardData = str14;
        this.paymentCardType = str15;
        this.cardImage = insuranceCardExternalFileApiModel3;
        this.cardSmallImage = insuranceCardExternalFileApiModel4;
    }

    public static /* synthetic */ InsuranceCardApiModel copy$default(InsuranceCardApiModel insuranceCardApiModel, long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, String str10, String str11, String str12, String str13, String str14, String str15, InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel, InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel2, int i, Object obj) {
        InsuranceCardApiModel insuranceCardApiModel2 = insuranceCardApiModel;
        int i2 = i;
        return insuranceCardApiModel.copy((i2 & 1) != 0 ? insuranceCardApiModel2.cardId : j, (i2 & 2) != 0 ? insuranceCardApiModel2.cardClass : str, (i2 & 4) != 0 ? insuranceCardApiModel2.cardType : str2, (i2 & 8) != 0 ? insuranceCardApiModel2.productCode : str3, (i2 & 16) != 0 ? insuranceCardApiModel2.subProductCode : str4, (i2 & 32) != 0 ? insuranceCardApiModel2.clientKey : j2, (i2 & 64) != 0 ? insuranceCardApiModel2.lastFour : str5, (i2 & 128) != 0 ? insuranceCardApiModel2.expDate : j3, (i2 & C11398b.f33139r) != 0 ? insuranceCardApiModel2.mainCur : str6, (i2 & C11398b.f33140s) != 0 ? insuranceCardApiModel2.acctKey : j4, (i2 & C11398b.f33141t) != 0 ? insuranceCardApiModel2.ccy : str7, (i2 & C11398b.f33142u) != 0 ? insuranceCardApiModel2.pan2 : str8, (i2 & C11398b.f33143v) != 0 ? insuranceCardApiModel2.cardName : str9, (i2 & 8192) != 0 ? insuranceCardApiModel2.availableAmount : d, (i2 & 16384) != 0 ? insuranceCardApiModel2.availableAmountBaseCcy : d2, (i2 & 32768) != 0 ? insuranceCardApiModel2.isDefault : str10, (65536 & i2) != 0 ? insuranceCardApiModel2.isHidden : str11, (i2 & 131072) != 0 ? insuranceCardApiModel2.extMerchantId : str12, (i2 & 262144) != 0 ? insuranceCardApiModel2.isLocalCard : str13, (i2 & 524288) != 0 ? insuranceCardApiModel2.cardData : str14, (i2 & 1048576) != 0 ? insuranceCardApiModel2.paymentCardType : str15, (i2 & 2097152) != 0 ? insuranceCardApiModel2.cardImage : insuranceCardExternalFileApiModel, (i2 & 4194304) != 0 ? insuranceCardApiModel2.cardSmallImage : insuranceCardExternalFileApiModel2);
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
        return this.extMerchantId;
    }

    public final String component19() {
        return this.isLocalCard;
    }

    public final String component2() {
        return this.cardClass;
    }

    public final String component20() {
        return this.cardData;
    }

    public final String component21() {
        return this.paymentCardType;
    }

    public final InsuranceCardExternalFileApiModel component22() {
        return this.cardImage;
    }

    public final InsuranceCardExternalFileApiModel component23() {
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

    public final InsuranceCardApiModel copy(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, String str10, String str11, String str12, String str13, String str14, String str15, InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel, InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel2) {
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
        C41536l.m120489i(insuranceCardExternalFileApiModel, "cardImage");
        C41536l.m120489i(insuranceCardExternalFileApiModel2, "cardSmallImage");
        return new InsuranceCardApiModel(j, str, str2, str3, str4, j2, str5, j3, str6, j4, str7, str8, str9, d, d2, str10, str11, str12, str13, str14, str15, insuranceCardExternalFileApiModel, insuranceCardExternalFileApiModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceCardApiModel)) {
            return false;
        }
        InsuranceCardApiModel insuranceCardApiModel = (InsuranceCardApiModel) obj;
        return this.cardId == insuranceCardApiModel.cardId && C41536l.m120484d(this.cardClass, insuranceCardApiModel.cardClass) && C41536l.m120484d(this.cardType, insuranceCardApiModel.cardType) && C41536l.m120484d(this.productCode, insuranceCardApiModel.productCode) && C41536l.m120484d(this.subProductCode, insuranceCardApiModel.subProductCode) && this.clientKey == insuranceCardApiModel.clientKey && C41536l.m120484d(this.lastFour, insuranceCardApiModel.lastFour) && this.expDate == insuranceCardApiModel.expDate && C41536l.m120484d(this.mainCur, insuranceCardApiModel.mainCur) && this.acctKey == insuranceCardApiModel.acctKey && C41536l.m120484d(this.ccy, insuranceCardApiModel.ccy) && C41536l.m120484d(this.pan2, insuranceCardApiModel.pan2) && C41536l.m120484d(this.cardName, insuranceCardApiModel.cardName) && Double.compare(this.availableAmount, insuranceCardApiModel.availableAmount) == 0 && Double.compare(this.availableAmountBaseCcy, insuranceCardApiModel.availableAmountBaseCcy) == 0 && C41536l.m120484d(this.isDefault, insuranceCardApiModel.isDefault) && C41536l.m120484d(this.isHidden, insuranceCardApiModel.isHidden) && C41536l.m120484d(this.extMerchantId, insuranceCardApiModel.extMerchantId) && C41536l.m120484d(this.isLocalCard, insuranceCardApiModel.isLocalCard) && C41536l.m120484d(this.cardData, insuranceCardApiModel.cardData) && C41536l.m120484d(this.paymentCardType, insuranceCardApiModel.paymentCardType) && C41536l.m120484d(this.cardImage, insuranceCardApiModel.cardImage) && C41536l.m120484d(this.cardSmallImage, insuranceCardApiModel.cardSmallImage);
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

    public final InsuranceCardExternalFileApiModel getCardImage() {
        return this.cardImage;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final InsuranceCardExternalFileApiModel getCardSmallImage() {
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
        String str2 = this.extMerchantId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.isLocalCard;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardData;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentCardType;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((hashCode4 + i) * 31) + this.cardImage.hashCode()) * 31) + this.cardSmallImage.hashCode();
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
        String str12 = this.extMerchantId;
        String str13 = this.isLocalCard;
        String str14 = this.cardData;
        String str15 = this.paymentCardType;
        InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel = this.cardImage;
        InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel2 = this.cardSmallImage;
        return "InsuranceCardApiModel(cardId=" + j + ", cardClass=" + str + ", cardType=" + str2 + ", productCode=" + str3 + ", subProductCode=" + str4 + ", clientKey=" + j2 + ", lastFour=" + str5 + ", expDate=" + j3 + ", mainCur=" + str6 + ", acctKey=" + j5 + ", ccy=" + str7 + ", pan2=" + str8 + ", cardName=" + str9 + ", availableAmount=" + d + ", availableAmountBaseCcy=" + d2 + ", isDefault=" + str10 + ", isHidden=" + str11 + ", extMerchantId=" + str12 + ", isLocalCard=" + str13 + ", cardData=" + str14 + ", paymentCardType=" + str15 + ", cardImage=" + insuranceCardExternalFileApiModel + ", cardSmallImage=" + insuranceCardExternalFileApiModel2 + ")";
    }
}
