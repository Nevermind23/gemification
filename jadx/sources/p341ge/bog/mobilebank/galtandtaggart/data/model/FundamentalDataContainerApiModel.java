package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.FundamentalDataContainerApiModel */
public final class FundamentalDataContainerApiModel {
    private final BigDecimal close;
    private final BigDecimal closePrior;
    private final String description;
    private final String descriptionChinese;
    private final String exchange;
    private final Boolean exchangeNickelSpread;
    private final BigDecimal exchangeThresholdOverride;
    private final FundamentalDataApiModel fundamentalDataModel;
    private final BigDecimal houseThresholdOverride;

    /* renamed from: id */
    private final String f61130id;
    private final String image;
    private final Boolean longOnly;
    private final String name;
    private final BigDecimal orderSizeMax;
    private final BigDecimal orderSizeMin;
    private final BigDecimal orderSizeStep;
    private final String reutersPrimaryRic;
    private final String sector;
    private final String status;
    private final String symbol;
    private final String type;
    private final String url;

    public FundamentalDataContainerApiModel(FundamentalDataApiModel fundamentalDataApiModel, String str, String str2, String str3, String str4, String str5, Boolean bool, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool2, BigDecimal bigDecimal4, String str6, String str7, String str8, String str9, String str10, String str11, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str12) {
        this.fundamentalDataModel = fundamentalDataApiModel;
        this.symbol = str;
        this.reutersPrimaryRic = str2;
        this.name = str3;
        this.description = str4;
        this.sector = str5;
        this.longOnly = bool;
        this.orderSizeMax = bigDecimal;
        this.orderSizeMin = bigDecimal2;
        this.orderSizeStep = bigDecimal3;
        this.exchangeNickelSpread = bool2;
        this.close = bigDecimal4;
        this.descriptionChinese = str6;
        this.f61130id = str7;
        this.type = str8;
        this.exchange = str9;
        this.url = str10;
        this.status = str11;
        this.exchangeThresholdOverride = bigDecimal5;
        this.houseThresholdOverride = bigDecimal6;
        this.closePrior = bigDecimal7;
        this.image = str12;
    }

    public static /* synthetic */ FundamentalDataContainerApiModel copy$default(FundamentalDataContainerApiModel fundamentalDataContainerApiModel, FundamentalDataApiModel fundamentalDataApiModel, String str, String str2, String str3, String str4, String str5, Boolean bool, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool2, BigDecimal bigDecimal4, String str6, String str7, String str8, String str9, String str10, String str11, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str12, int i, Object obj) {
        FundamentalDataContainerApiModel fundamentalDataContainerApiModel2 = fundamentalDataContainerApiModel;
        int i2 = i;
        return fundamentalDataContainerApiModel.copy((i2 & 1) != 0 ? fundamentalDataContainerApiModel2.fundamentalDataModel : fundamentalDataApiModel, (i2 & 2) != 0 ? fundamentalDataContainerApiModel2.symbol : str, (i2 & 4) != 0 ? fundamentalDataContainerApiModel2.reutersPrimaryRic : str2, (i2 & 8) != 0 ? fundamentalDataContainerApiModel2.name : str3, (i2 & 16) != 0 ? fundamentalDataContainerApiModel2.description : str4, (i2 & 32) != 0 ? fundamentalDataContainerApiModel2.sector : str5, (i2 & 64) != 0 ? fundamentalDataContainerApiModel2.longOnly : bool, (i2 & 128) != 0 ? fundamentalDataContainerApiModel2.orderSizeMax : bigDecimal, (i2 & C11398b.f33139r) != 0 ? fundamentalDataContainerApiModel2.orderSizeMin : bigDecimal2, (i2 & C11398b.f33140s) != 0 ? fundamentalDataContainerApiModel2.orderSizeStep : bigDecimal3, (i2 & C11398b.f33141t) != 0 ? fundamentalDataContainerApiModel2.exchangeNickelSpread : bool2, (i2 & C11398b.f33142u) != 0 ? fundamentalDataContainerApiModel2.close : bigDecimal4, (i2 & C11398b.f33143v) != 0 ? fundamentalDataContainerApiModel2.descriptionChinese : str6, (i2 & 8192) != 0 ? fundamentalDataContainerApiModel2.f61130id : str7, (i2 & 16384) != 0 ? fundamentalDataContainerApiModel2.type : str8, (i2 & 32768) != 0 ? fundamentalDataContainerApiModel2.exchange : str9, (i2 & 65536) != 0 ? fundamentalDataContainerApiModel2.url : str10, (i2 & 131072) != 0 ? fundamentalDataContainerApiModel2.status : str11, (i2 & 262144) != 0 ? fundamentalDataContainerApiModel2.exchangeThresholdOverride : bigDecimal5, (i2 & 524288) != 0 ? fundamentalDataContainerApiModel2.houseThresholdOverride : bigDecimal6, (i2 & 1048576) != 0 ? fundamentalDataContainerApiModel2.closePrior : bigDecimal7, (i2 & 2097152) != 0 ? fundamentalDataContainerApiModel2.image : str12);
    }

    public final FundamentalDataApiModel component1() {
        return this.fundamentalDataModel;
    }

    public final BigDecimal component10() {
        return this.orderSizeStep;
    }

    public final Boolean component11() {
        return this.exchangeNickelSpread;
    }

    public final BigDecimal component12() {
        return this.close;
    }

    public final String component13() {
        return this.descriptionChinese;
    }

    public final String component14() {
        return this.f61130id;
    }

    public final String component15() {
        return this.type;
    }

    public final String component16() {
        return this.exchange;
    }

    public final String component17() {
        return this.url;
    }

    public final String component18() {
        return this.status;
    }

    public final BigDecimal component19() {
        return this.exchangeThresholdOverride;
    }

    public final String component2() {
        return this.symbol;
    }

    public final BigDecimal component20() {
        return this.houseThresholdOverride;
    }

    public final BigDecimal component21() {
        return this.closePrior;
    }

    public final String component22() {
        return this.image;
    }

    public final String component3() {
        return this.reutersPrimaryRic;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.sector;
    }

    public final Boolean component7() {
        return this.longOnly;
    }

    public final BigDecimal component8() {
        return this.orderSizeMax;
    }

    public final BigDecimal component9() {
        return this.orderSizeMin;
    }

    public final FundamentalDataContainerApiModel copy(FundamentalDataApiModel fundamentalDataApiModel, String str, String str2, String str3, String str4, String str5, Boolean bool, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool2, BigDecimal bigDecimal4, String str6, String str7, String str8, String str9, String str10, String str11, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str12) {
        return new FundamentalDataContainerApiModel(fundamentalDataApiModel, str, str2, str3, str4, str5, bool, bigDecimal, bigDecimal2, bigDecimal3, bool2, bigDecimal4, str6, str7, str8, str9, str10, str11, bigDecimal5, bigDecimal6, bigDecimal7, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundamentalDataContainerApiModel)) {
            return false;
        }
        FundamentalDataContainerApiModel fundamentalDataContainerApiModel = (FundamentalDataContainerApiModel) obj;
        return C41536l.m120484d(this.fundamentalDataModel, fundamentalDataContainerApiModel.fundamentalDataModel) && C41536l.m120484d(this.symbol, fundamentalDataContainerApiModel.symbol) && C41536l.m120484d(this.reutersPrimaryRic, fundamentalDataContainerApiModel.reutersPrimaryRic) && C41536l.m120484d(this.name, fundamentalDataContainerApiModel.name) && C41536l.m120484d(this.description, fundamentalDataContainerApiModel.description) && C41536l.m120484d(this.sector, fundamentalDataContainerApiModel.sector) && C41536l.m120484d(this.longOnly, fundamentalDataContainerApiModel.longOnly) && C41536l.m120484d(this.orderSizeMax, fundamentalDataContainerApiModel.orderSizeMax) && C41536l.m120484d(this.orderSizeMin, fundamentalDataContainerApiModel.orderSizeMin) && C41536l.m120484d(this.orderSizeStep, fundamentalDataContainerApiModel.orderSizeStep) && C41536l.m120484d(this.exchangeNickelSpread, fundamentalDataContainerApiModel.exchangeNickelSpread) && C41536l.m120484d(this.close, fundamentalDataContainerApiModel.close) && C41536l.m120484d(this.descriptionChinese, fundamentalDataContainerApiModel.descriptionChinese) && C41536l.m120484d(this.f61130id, fundamentalDataContainerApiModel.f61130id) && C41536l.m120484d(this.type, fundamentalDataContainerApiModel.type) && C41536l.m120484d(this.exchange, fundamentalDataContainerApiModel.exchange) && C41536l.m120484d(this.url, fundamentalDataContainerApiModel.url) && C41536l.m120484d(this.status, fundamentalDataContainerApiModel.status) && C41536l.m120484d(this.exchangeThresholdOverride, fundamentalDataContainerApiModel.exchangeThresholdOverride) && C41536l.m120484d(this.houseThresholdOverride, fundamentalDataContainerApiModel.houseThresholdOverride) && C41536l.m120484d(this.closePrior, fundamentalDataContainerApiModel.closePrior) && C41536l.m120484d(this.image, fundamentalDataContainerApiModel.image);
    }

    public final BigDecimal getClose() {
        return this.close;
    }

    public final BigDecimal getClosePrior() {
        return this.closePrior;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionChinese() {
        return this.descriptionChinese;
    }

    public final String getExchange() {
        return this.exchange;
    }

    public final Boolean getExchangeNickelSpread() {
        return this.exchangeNickelSpread;
    }

    public final BigDecimal getExchangeThresholdOverride() {
        return this.exchangeThresholdOverride;
    }

    public final FundamentalDataApiModel getFundamentalDataModel() {
        return this.fundamentalDataModel;
    }

    public final BigDecimal getHouseThresholdOverride() {
        return this.houseThresholdOverride;
    }

    public final String getId() {
        return this.f61130id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Boolean getLongOnly() {
        return this.longOnly;
    }

    public final String getName() {
        return this.name;
    }

    public final BigDecimal getOrderSizeMax() {
        return this.orderSizeMax;
    }

    public final BigDecimal getOrderSizeMin() {
        return this.orderSizeMin;
    }

    public final BigDecimal getOrderSizeStep() {
        return this.orderSizeStep;
    }

    public final String getReutersPrimaryRic() {
        return this.reutersPrimaryRic;
    }

    public final String getSector() {
        return this.sector;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        FundamentalDataApiModel fundamentalDataApiModel = this.fundamentalDataModel;
        int i = 0;
        int hashCode = (fundamentalDataApiModel == null ? 0 : fundamentalDataApiModel.hashCode()) * 31;
        String str = this.symbol;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reutersPrimaryRic;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sector;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.longOnly;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal = this.orderSizeMax;
        int hashCode8 = (hashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.orderSizeMin;
        int hashCode9 = (hashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.orderSizeStep;
        int hashCode10 = (hashCode9 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Boolean bool2 = this.exchangeNickelSpread;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.close;
        int hashCode12 = (hashCode11 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str6 = this.descriptionChinese;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f61130id;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.type;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.exchange;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.url;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.status;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.exchangeThresholdOverride;
        int hashCode19 = (hashCode18 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.houseThresholdOverride;
        int hashCode20 = (hashCode19 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.closePrior;
        int hashCode21 = (hashCode20 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str12 = this.image;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode21 + i;
    }

    public String toString() {
        FundamentalDataApiModel fundamentalDataApiModel = this.fundamentalDataModel;
        String str = this.symbol;
        String str2 = this.reutersPrimaryRic;
        String str3 = this.name;
        String str4 = this.description;
        String str5 = this.sector;
        Boolean bool = this.longOnly;
        BigDecimal bigDecimal = this.orderSizeMax;
        BigDecimal bigDecimal2 = this.orderSizeMin;
        BigDecimal bigDecimal3 = this.orderSizeStep;
        Boolean bool2 = this.exchangeNickelSpread;
        BigDecimal bigDecimal4 = this.close;
        String str6 = this.descriptionChinese;
        String str7 = this.f61130id;
        String str8 = this.type;
        String str9 = this.exchange;
        String str10 = this.url;
        String str11 = this.status;
        BigDecimal bigDecimal5 = this.exchangeThresholdOverride;
        BigDecimal bigDecimal6 = this.houseThresholdOverride;
        BigDecimal bigDecimal7 = this.closePrior;
        String str12 = this.image;
        return "FundamentalDataContainerApiModel(fundamentalDataModel=" + fundamentalDataApiModel + ", symbol=" + str + ", reutersPrimaryRic=" + str2 + ", name=" + str3 + ", description=" + str4 + ", sector=" + str5 + ", longOnly=" + bool + ", orderSizeMax=" + bigDecimal + ", orderSizeMin=" + bigDecimal2 + ", orderSizeStep=" + bigDecimal3 + ", exchangeNickelSpread=" + bool2 + ", close=" + bigDecimal4 + ", descriptionChinese=" + str6 + ", id=" + str7 + ", type=" + str8 + ", exchange=" + str9 + ", url=" + str10 + ", status=" + str11 + ", exchangeThresholdOverride=" + bigDecimal5 + ", houseThresholdOverride=" + bigDecimal6 + ", closePrior=" + bigDecimal7 + ", image=" + str12 + ")";
    }
}
