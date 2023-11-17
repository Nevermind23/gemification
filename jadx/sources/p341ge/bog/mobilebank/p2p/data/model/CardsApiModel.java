package p341ge.bog.mobilebank.p2p.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.p2p.data.model.CardsApiModel */
public final class CardsApiModel {
    private final String acctDesc;
    @C8664c(alternate = {"AcctKey"}, value = "acctKey")
    private final long acctKey;
    @C8664c(alternate = {"AcctNo"}, value = "acctNo")
    private final String acctNo;
    private final double availableAmountBaseCcy;
    private final String cardClass;
    private final String cardClassCode;
    private final long cardId;
    private final ExternalFileEntity cardImage;
    private final String cardName;
    private final ExternalFileEntity cardSmallImage;
    private final String cardType;
    private final String ccy;
    private final long clientKey;
    private final String defaultAcc;
    private final long expDate;
    private final String isDefault;
    private final String lastFour;
    private final String nameDictionaryKey;
    private final String nameDictionaryValue;
    private final String pan2;
    private final String productCode;
    private final String subProductCode;

    public CardsApiModel(long j, String str, String str2, String str3, String str4, String str5, long j2, String str6, long j3, long j4, String str7, String str8, String str9, String str10, double d, String str11, String str12, String str13, String str14, String str15, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        String str24 = str9;
        String str25 = str11;
        ExternalFileEntity externalFileEntity3 = externalFileEntity;
        ExternalFileEntity externalFileEntity4 = externalFileEntity2;
        C41536l.m120489i(str16, "cardClass");
        C41536l.m120489i(str17, "cardClassCode");
        C41536l.m120489i(str18, "cardType");
        C41536l.m120489i(str19, "productCode");
        C41536l.m120489i(str20, "subProductCode");
        C41536l.m120489i(str21, "lastFour");
        C41536l.m120489i(str22, "acctNo");
        C41536l.m120489i(str23, "ccy");
        C41536l.m120489i(str24, "pan2");
        C41536l.m120489i(str25, "isDefault");
        C41536l.m120489i(externalFileEntity3, "cardImage");
        C41536l.m120489i(externalFileEntity4, "cardSmallImage");
        this.cardId = j;
        this.cardClass = str16;
        this.cardClassCode = str17;
        this.cardType = str18;
        this.productCode = str19;
        this.subProductCode = str20;
        this.clientKey = j2;
        this.lastFour = str21;
        this.expDate = j3;
        this.acctKey = j4;
        this.acctNo = str22;
        this.ccy = str23;
        this.pan2 = str24;
        this.cardName = str10;
        this.availableAmountBaseCcy = d;
        this.isDefault = str25;
        this.nameDictionaryKey = str12;
        this.nameDictionaryValue = str13;
        this.acctDesc = str14;
        this.defaultAcc = str15;
        this.cardImage = externalFileEntity3;
        this.cardSmallImage = externalFileEntity4;
    }

    public static /* synthetic */ CardsApiModel copy$default(CardsApiModel cardsApiModel, long j, String str, String str2, String str3, String str4, String str5, long j2, String str6, long j3, long j4, String str7, String str8, String str9, String str10, double d, String str11, String str12, String str13, String str14, String str15, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2, int i, Object obj) {
        CardsApiModel cardsApiModel2 = cardsApiModel;
        int i2 = i;
        return cardsApiModel.copy((i2 & 1) != 0 ? cardsApiModel2.cardId : j, (i2 & 2) != 0 ? cardsApiModel2.cardClass : str, (i2 & 4) != 0 ? cardsApiModel2.cardClassCode : str2, (i2 & 8) != 0 ? cardsApiModel2.cardType : str3, (i2 & 16) != 0 ? cardsApiModel2.productCode : str4, (i2 & 32) != 0 ? cardsApiModel2.subProductCode : str5, (i2 & 64) != 0 ? cardsApiModel2.clientKey : j2, (i2 & 128) != 0 ? cardsApiModel2.lastFour : str6, (i2 & C11398b.f33139r) != 0 ? cardsApiModel2.expDate : j3, (i2 & C11398b.f33140s) != 0 ? cardsApiModel2.acctKey : j4, (i2 & C11398b.f33141t) != 0 ? cardsApiModel2.acctNo : str7, (i2 & C11398b.f33142u) != 0 ? cardsApiModel2.ccy : str8, (i2 & C11398b.f33143v) != 0 ? cardsApiModel2.pan2 : str9, (i2 & 8192) != 0 ? cardsApiModel2.cardName : str10, (i2 & 16384) != 0 ? cardsApiModel2.availableAmountBaseCcy : d, (i2 & 32768) != 0 ? cardsApiModel2.isDefault : str11, (65536 & i2) != 0 ? cardsApiModel2.nameDictionaryKey : str12, (i2 & 131072) != 0 ? cardsApiModel2.nameDictionaryValue : str13, (i2 & 262144) != 0 ? cardsApiModel2.acctDesc : str14, (i2 & 524288) != 0 ? cardsApiModel2.defaultAcc : str15, (i2 & 1048576) != 0 ? cardsApiModel2.cardImage : externalFileEntity, (i2 & 2097152) != 0 ? cardsApiModel2.cardSmallImage : externalFileEntity2);
    }

    public final long component1() {
        return this.cardId;
    }

    public final long component10() {
        return this.acctKey;
    }

    public final String component11() {
        return this.acctNo;
    }

    public final String component12() {
        return this.ccy;
    }

    public final String component13() {
        return this.pan2;
    }

    public final String component14() {
        return this.cardName;
    }

    public final double component15() {
        return this.availableAmountBaseCcy;
    }

    public final String component16() {
        return this.isDefault;
    }

    public final String component17() {
        return this.nameDictionaryKey;
    }

    public final String component18() {
        return this.nameDictionaryValue;
    }

    public final String component19() {
        return this.acctDesc;
    }

    public final String component2() {
        return this.cardClass;
    }

    public final String component20() {
        return this.defaultAcc;
    }

    public final ExternalFileEntity component21() {
        return this.cardImage;
    }

    public final ExternalFileEntity component22() {
        return this.cardSmallImage;
    }

    public final String component3() {
        return this.cardClassCode;
    }

    public final String component4() {
        return this.cardType;
    }

    public final String component5() {
        return this.productCode;
    }

    public final String component6() {
        return this.subProductCode;
    }

    public final long component7() {
        return this.clientKey;
    }

    public final String component8() {
        return this.lastFour;
    }

    public final long component9() {
        return this.expDate;
    }

    public final CardsApiModel copy(long j, String str, String str2, String str3, String str4, String str5, long j2, String str6, long j3, long j4, String str7, String str8, String str9, String str10, double d, String str11, String str12, String str13, String str14, String str15, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2) {
        long j5 = j;
        C41536l.m120489i(str, "cardClass");
        C41536l.m120489i(str2, "cardClassCode");
        C41536l.m120489i(str3, "cardType");
        C41536l.m120489i(str4, "productCode");
        C41536l.m120489i(str5, "subProductCode");
        C41536l.m120489i(str6, "lastFour");
        C41536l.m120489i(str7, "acctNo");
        C41536l.m120489i(str8, "ccy");
        C41536l.m120489i(str9, "pan2");
        C41536l.m120489i(str11, "isDefault");
        C41536l.m120489i(externalFileEntity, "cardImage");
        C41536l.m120489i(externalFileEntity2, "cardSmallImage");
        return new CardsApiModel(j, str, str2, str3, str4, str5, j2, str6, j3, j4, str7, str8, str9, str10, d, str11, str12, str13, str14, str15, externalFileEntity, externalFileEntity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardsApiModel)) {
            return false;
        }
        CardsApiModel cardsApiModel = (CardsApiModel) obj;
        return this.cardId == cardsApiModel.cardId && C41536l.m120484d(this.cardClass, cardsApiModel.cardClass) && C41536l.m120484d(this.cardClassCode, cardsApiModel.cardClassCode) && C41536l.m120484d(this.cardType, cardsApiModel.cardType) && C41536l.m120484d(this.productCode, cardsApiModel.productCode) && C41536l.m120484d(this.subProductCode, cardsApiModel.subProductCode) && this.clientKey == cardsApiModel.clientKey && C41536l.m120484d(this.lastFour, cardsApiModel.lastFour) && this.expDate == cardsApiModel.expDate && this.acctKey == cardsApiModel.acctKey && C41536l.m120484d(this.acctNo, cardsApiModel.acctNo) && C41536l.m120484d(this.ccy, cardsApiModel.ccy) && C41536l.m120484d(this.pan2, cardsApiModel.pan2) && C41536l.m120484d(this.cardName, cardsApiModel.cardName) && Double.compare(this.availableAmountBaseCcy, cardsApiModel.availableAmountBaseCcy) == 0 && C41536l.m120484d(this.isDefault, cardsApiModel.isDefault) && C41536l.m120484d(this.nameDictionaryKey, cardsApiModel.nameDictionaryKey) && C41536l.m120484d(this.nameDictionaryValue, cardsApiModel.nameDictionaryValue) && C41536l.m120484d(this.acctDesc, cardsApiModel.acctDesc) && C41536l.m120484d(this.defaultAcc, cardsApiModel.defaultAcc) && C41536l.m120484d(this.cardImage, cardsApiModel.cardImage) && C41536l.m120484d(this.cardSmallImage, cardsApiModel.cardSmallImage);
    }

    public final String getAcctDesc() {
        return this.acctDesc;
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final double getAvailableAmountBaseCcy() {
        return this.availableAmountBaseCcy;
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final String getCardClassCode() {
        return this.cardClassCode;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final ExternalFileEntity getCardImage() {
        return this.cardImage;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final ExternalFileEntity getCardSmallImage() {
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

    public final String getDefaultAcc() {
        return this.defaultAcc;
    }

    public final long getExpDate() {
        return this.expDate;
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

    public final String getPan2() {
        return this.pan2;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        int a = ((((((((((((((((((((((((C7397t.m28148a(this.cardId) * 31) + this.cardClass.hashCode()) * 31) + this.cardClassCode.hashCode()) * 31) + this.cardType.hashCode()) * 31) + this.productCode.hashCode()) * 31) + this.subProductCode.hashCode()) * 31) + C7397t.m28148a(this.clientKey)) * 31) + this.lastFour.hashCode()) * 31) + C7397t.m28148a(this.expDate)) * 31) + C7397t.m28148a(this.acctKey)) * 31) + this.acctNo.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.pan2.hashCode()) * 31;
        String str = this.cardName;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.availableAmountBaseCcy)) * 31) + this.isDefault.hashCode()) * 31;
        String str2 = this.nameDictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameDictionaryValue;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acctDesc;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.defaultAcc;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((hashCode4 + i) * 31) + this.cardImage.hashCode()) * 31) + this.cardSmallImage.hashCode();
    }

    public final String isDefault() {
        return this.isDefault;
    }

    public String toString() {
        long j = this.cardId;
        String str = this.cardClass;
        String str2 = this.cardClassCode;
        String str3 = this.cardType;
        String str4 = this.productCode;
        String str5 = this.subProductCode;
        long j2 = this.clientKey;
        String str6 = this.lastFour;
        long j3 = this.expDate;
        long j4 = this.acctKey;
        String str7 = this.acctNo;
        String str8 = this.ccy;
        String str9 = this.pan2;
        String str10 = this.cardName;
        long j5 = j4;
        double d = this.availableAmountBaseCcy;
        String str11 = this.isDefault;
        String str12 = this.nameDictionaryKey;
        String str13 = this.nameDictionaryValue;
        String str14 = this.acctDesc;
        String str15 = this.defaultAcc;
        ExternalFileEntity externalFileEntity = this.cardImage;
        ExternalFileEntity externalFileEntity2 = this.cardSmallImage;
        return "CardsApiModel(cardId=" + j + ", cardClass=" + str + ", cardClassCode=" + str2 + ", cardType=" + str3 + ", productCode=" + str4 + ", subProductCode=" + str5 + ", clientKey=" + j2 + ", lastFour=" + str6 + ", expDate=" + j3 + ", acctKey=" + j5 + ", acctNo=" + str7 + ", ccy=" + str8 + ", pan2=" + str9 + ", cardName=" + str10 + ", availableAmountBaseCcy=" + d + ", isDefault=" + str11 + ", nameDictionaryKey=" + str12 + ", nameDictionaryValue=" + str13 + ", acctDesc=" + str14 + ", defaultAcc=" + str15 + ", cardImage=" + externalFileEntity + ", cardSmallImage=" + externalFileEntity2 + ")";
    }
}
