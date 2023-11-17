package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.FundamentalDataApiModel */
public final class FundamentalDataApiModel {
    private final BigDecimal askPrice;
    private final BigDecimal bidPrice;
    private final String bookValuePerShare;
    private final String cashFlowPerShare;
    private final String companyName;
    private final BigDecimal cumulativeVolume;
    private final BigDecimal dividend;
    private final BigDecimal dividendYield;
    private final BigDecimal earningsPerShare;
    private final BigDecimal fiftyTwoWeekHighPrice;
    private final BigDecimal fiftyTwoWeekLowPrice;
    private final BigDecimal highPrice;
    private final String instrumentID;
    private final BigDecimal lowPrice;
    private final BigDecimal marketCap;
    private final BigDecimal openPrice;
    private final String operatingIncome;
    private final String pbRatio;
    private final BigDecimal peRatio;
    private final BigDecimal sharesOutstanding;
    private final String symbol;
    private final String timeLastUpdated;
    private final BigDecimal volumeMovingAverage10Day;
    private final BigDecimal volumeMovingAverage150Day;
    private final BigDecimal volumeMovingAverage200Day;
    private final BigDecimal volumeMovingAverage25Day;
    private final BigDecimal volumeMovingAverage50Day;

    public FundamentalDataApiModel(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, BigDecimal bigDecimal19) {
        this.instrumentID = str;
        this.symbol = str2;
        this.companyName = str3;
        this.openPrice = bigDecimal;
        this.bidPrice = bigDecimal2;
        this.askPrice = bigDecimal3;
        this.lowPrice = bigDecimal4;
        this.highPrice = bigDecimal5;
        this.fiftyTwoWeekLowPrice = bigDecimal6;
        this.fiftyTwoWeekHighPrice = bigDecimal7;
        this.cumulativeVolume = bigDecimal8;
        this.marketCap = bigDecimal9;
        this.peRatio = bigDecimal10;
        this.dividendYield = bigDecimal11;
        this.earningsPerShare = bigDecimal12;
        this.dividend = bigDecimal13;
        this.sharesOutstanding = bigDecimal14;
        this.timeLastUpdated = str4;
        this.bookValuePerShare = str5;
        this.cashFlowPerShare = str6;
        this.operatingIncome = str7;
        this.pbRatio = str8;
        this.volumeMovingAverage10Day = bigDecimal15;
        this.volumeMovingAverage25Day = bigDecimal16;
        this.volumeMovingAverage50Day = bigDecimal17;
        this.volumeMovingAverage150Day = bigDecimal18;
        this.volumeMovingAverage200Day = bigDecimal19;
    }

    public static /* synthetic */ FundamentalDataApiModel copy$default(FundamentalDataApiModel fundamentalDataApiModel, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, BigDecimal bigDecimal19, int i, Object obj) {
        FundamentalDataApiModel fundamentalDataApiModel2 = fundamentalDataApiModel;
        int i2 = i;
        return fundamentalDataApiModel.copy((i2 & 1) != 0 ? fundamentalDataApiModel2.instrumentID : str, (i2 & 2) != 0 ? fundamentalDataApiModel2.symbol : str2, (i2 & 4) != 0 ? fundamentalDataApiModel2.companyName : str3, (i2 & 8) != 0 ? fundamentalDataApiModel2.openPrice : bigDecimal, (i2 & 16) != 0 ? fundamentalDataApiModel2.bidPrice : bigDecimal2, (i2 & 32) != 0 ? fundamentalDataApiModel2.askPrice : bigDecimal3, (i2 & 64) != 0 ? fundamentalDataApiModel2.lowPrice : bigDecimal4, (i2 & 128) != 0 ? fundamentalDataApiModel2.highPrice : bigDecimal5, (i2 & C11398b.f33139r) != 0 ? fundamentalDataApiModel2.fiftyTwoWeekLowPrice : bigDecimal6, (i2 & C11398b.f33140s) != 0 ? fundamentalDataApiModel2.fiftyTwoWeekHighPrice : bigDecimal7, (i2 & C11398b.f33141t) != 0 ? fundamentalDataApiModel2.cumulativeVolume : bigDecimal8, (i2 & C11398b.f33142u) != 0 ? fundamentalDataApiModel2.marketCap : bigDecimal9, (i2 & C11398b.f33143v) != 0 ? fundamentalDataApiModel2.peRatio : bigDecimal10, (i2 & 8192) != 0 ? fundamentalDataApiModel2.dividendYield : bigDecimal11, (i2 & 16384) != 0 ? fundamentalDataApiModel2.earningsPerShare : bigDecimal12, (i2 & 32768) != 0 ? fundamentalDataApiModel2.dividend : bigDecimal13, (i2 & 65536) != 0 ? fundamentalDataApiModel2.sharesOutstanding : bigDecimal14, (i2 & 131072) != 0 ? fundamentalDataApiModel2.timeLastUpdated : str4, (i2 & 262144) != 0 ? fundamentalDataApiModel2.bookValuePerShare : str5, (i2 & 524288) != 0 ? fundamentalDataApiModel2.cashFlowPerShare : str6, (i2 & 1048576) != 0 ? fundamentalDataApiModel2.operatingIncome : str7, (i2 & 2097152) != 0 ? fundamentalDataApiModel2.pbRatio : str8, (i2 & 4194304) != 0 ? fundamentalDataApiModel2.volumeMovingAverage10Day : bigDecimal15, (i2 & 8388608) != 0 ? fundamentalDataApiModel2.volumeMovingAverage25Day : bigDecimal16, (i2 & 16777216) != 0 ? fundamentalDataApiModel2.volumeMovingAverage50Day : bigDecimal17, (i2 & 33554432) != 0 ? fundamentalDataApiModel2.volumeMovingAverage150Day : bigDecimal18, (i2 & 67108864) != 0 ? fundamentalDataApiModel2.volumeMovingAverage200Day : bigDecimal19);
    }

    public final String component1() {
        return this.instrumentID;
    }

    public final BigDecimal component10() {
        return this.fiftyTwoWeekHighPrice;
    }

    public final BigDecimal component11() {
        return this.cumulativeVolume;
    }

    public final BigDecimal component12() {
        return this.marketCap;
    }

    public final BigDecimal component13() {
        return this.peRatio;
    }

    public final BigDecimal component14() {
        return this.dividendYield;
    }

    public final BigDecimal component15() {
        return this.earningsPerShare;
    }

    public final BigDecimal component16() {
        return this.dividend;
    }

    public final BigDecimal component17() {
        return this.sharesOutstanding;
    }

    public final String component18() {
        return this.timeLastUpdated;
    }

    public final String component19() {
        return this.bookValuePerShare;
    }

    public final String component2() {
        return this.symbol;
    }

    public final String component20() {
        return this.cashFlowPerShare;
    }

    public final String component21() {
        return this.operatingIncome;
    }

    public final String component22() {
        return this.pbRatio;
    }

    public final BigDecimal component23() {
        return this.volumeMovingAverage10Day;
    }

    public final BigDecimal component24() {
        return this.volumeMovingAverage25Day;
    }

    public final BigDecimal component25() {
        return this.volumeMovingAverage50Day;
    }

    public final BigDecimal component26() {
        return this.volumeMovingAverage150Day;
    }

    public final BigDecimal component27() {
        return this.volumeMovingAverage200Day;
    }

    public final String component3() {
        return this.companyName;
    }

    public final BigDecimal component4() {
        return this.openPrice;
    }

    public final BigDecimal component5() {
        return this.bidPrice;
    }

    public final BigDecimal component6() {
        return this.askPrice;
    }

    public final BigDecimal component7() {
        return this.lowPrice;
    }

    public final BigDecimal component8() {
        return this.highPrice;
    }

    public final BigDecimal component9() {
        return this.fiftyTwoWeekLowPrice;
    }

    public final FundamentalDataApiModel copy(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal15, BigDecimal bigDecimal16, BigDecimal bigDecimal17, BigDecimal bigDecimal18, BigDecimal bigDecimal19) {
        return new FundamentalDataApiModel(str, str2, str3, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14, str4, str5, str6, str7, str8, bigDecimal15, bigDecimal16, bigDecimal17, bigDecimal18, bigDecimal19);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundamentalDataApiModel)) {
            return false;
        }
        FundamentalDataApiModel fundamentalDataApiModel = (FundamentalDataApiModel) obj;
        return C41536l.m120484d(this.instrumentID, fundamentalDataApiModel.instrumentID) && C41536l.m120484d(this.symbol, fundamentalDataApiModel.symbol) && C41536l.m120484d(this.companyName, fundamentalDataApiModel.companyName) && C41536l.m120484d(this.openPrice, fundamentalDataApiModel.openPrice) && C41536l.m120484d(this.bidPrice, fundamentalDataApiModel.bidPrice) && C41536l.m120484d(this.askPrice, fundamentalDataApiModel.askPrice) && C41536l.m120484d(this.lowPrice, fundamentalDataApiModel.lowPrice) && C41536l.m120484d(this.highPrice, fundamentalDataApiModel.highPrice) && C41536l.m120484d(this.fiftyTwoWeekLowPrice, fundamentalDataApiModel.fiftyTwoWeekLowPrice) && C41536l.m120484d(this.fiftyTwoWeekHighPrice, fundamentalDataApiModel.fiftyTwoWeekHighPrice) && C41536l.m120484d(this.cumulativeVolume, fundamentalDataApiModel.cumulativeVolume) && C41536l.m120484d(this.marketCap, fundamentalDataApiModel.marketCap) && C41536l.m120484d(this.peRatio, fundamentalDataApiModel.peRatio) && C41536l.m120484d(this.dividendYield, fundamentalDataApiModel.dividendYield) && C41536l.m120484d(this.earningsPerShare, fundamentalDataApiModel.earningsPerShare) && C41536l.m120484d(this.dividend, fundamentalDataApiModel.dividend) && C41536l.m120484d(this.sharesOutstanding, fundamentalDataApiModel.sharesOutstanding) && C41536l.m120484d(this.timeLastUpdated, fundamentalDataApiModel.timeLastUpdated) && C41536l.m120484d(this.bookValuePerShare, fundamentalDataApiModel.bookValuePerShare) && C41536l.m120484d(this.cashFlowPerShare, fundamentalDataApiModel.cashFlowPerShare) && C41536l.m120484d(this.operatingIncome, fundamentalDataApiModel.operatingIncome) && C41536l.m120484d(this.pbRatio, fundamentalDataApiModel.pbRatio) && C41536l.m120484d(this.volumeMovingAverage10Day, fundamentalDataApiModel.volumeMovingAverage10Day) && C41536l.m120484d(this.volumeMovingAverage25Day, fundamentalDataApiModel.volumeMovingAverage25Day) && C41536l.m120484d(this.volumeMovingAverage50Day, fundamentalDataApiModel.volumeMovingAverage50Day) && C41536l.m120484d(this.volumeMovingAverage150Day, fundamentalDataApiModel.volumeMovingAverage150Day) && C41536l.m120484d(this.volumeMovingAverage200Day, fundamentalDataApiModel.volumeMovingAverage200Day);
    }

    public final BigDecimal getAskPrice() {
        return this.askPrice;
    }

    public final BigDecimal getBidPrice() {
        return this.bidPrice;
    }

    public final String getBookValuePerShare() {
        return this.bookValuePerShare;
    }

    public final String getCashFlowPerShare() {
        return this.cashFlowPerShare;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final BigDecimal getCumulativeVolume() {
        return this.cumulativeVolume;
    }

    public final BigDecimal getDividend() {
        return this.dividend;
    }

    public final BigDecimal getDividendYield() {
        return this.dividendYield;
    }

    public final BigDecimal getEarningsPerShare() {
        return this.earningsPerShare;
    }

    public final BigDecimal getFiftyTwoWeekHighPrice() {
        return this.fiftyTwoWeekHighPrice;
    }

    public final BigDecimal getFiftyTwoWeekLowPrice() {
        return this.fiftyTwoWeekLowPrice;
    }

    public final BigDecimal getHighPrice() {
        return this.highPrice;
    }

    public final String getInstrumentID() {
        return this.instrumentID;
    }

    public final BigDecimal getLowPrice() {
        return this.lowPrice;
    }

    public final BigDecimal getMarketCap() {
        return this.marketCap;
    }

    public final BigDecimal getOpenPrice() {
        return this.openPrice;
    }

    public final String getOperatingIncome() {
        return this.operatingIncome;
    }

    public final String getPbRatio() {
        return this.pbRatio;
    }

    public final BigDecimal getPeRatio() {
        return this.peRatio;
    }

    public final BigDecimal getSharesOutstanding() {
        return this.sharesOutstanding;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getTimeLastUpdated() {
        return this.timeLastUpdated;
    }

    public final BigDecimal getVolumeMovingAverage10Day() {
        return this.volumeMovingAverage10Day;
    }

    public final BigDecimal getVolumeMovingAverage150Day() {
        return this.volumeMovingAverage150Day;
    }

    public final BigDecimal getVolumeMovingAverage200Day() {
        return this.volumeMovingAverage200Day;
    }

    public final BigDecimal getVolumeMovingAverage25Day() {
        return this.volumeMovingAverage25Day;
    }

    public final BigDecimal getVolumeMovingAverage50Day() {
        return this.volumeMovingAverage50Day;
    }

    public int hashCode() {
        String str = this.instrumentID;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.companyName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.openPrice;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.bidPrice;
        int hashCode5 = (hashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.askPrice;
        int hashCode6 = (hashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.lowPrice;
        int hashCode7 = (hashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.highPrice;
        int hashCode8 = (hashCode7 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.fiftyTwoWeekLowPrice;
        int hashCode9 = (hashCode8 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.fiftyTwoWeekHighPrice;
        int hashCode10 = (hashCode9 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.cumulativeVolume;
        int hashCode11 = (hashCode10 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.marketCap;
        int hashCode12 = (hashCode11 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.peRatio;
        int hashCode13 = (hashCode12 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.dividendYield;
        int hashCode14 = (hashCode13 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.earningsPerShare;
        int hashCode15 = (hashCode14 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.dividend;
        int hashCode16 = (hashCode15 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.sharesOutstanding;
        int hashCode17 = (hashCode16 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        String str4 = this.timeLastUpdated;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bookValuePerShare;
        int hashCode19 = (hashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cashFlowPerShare;
        int hashCode20 = (hashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.operatingIncome;
        int hashCode21 = (hashCode20 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pbRatio;
        int hashCode22 = (hashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.volumeMovingAverage10Day;
        int hashCode23 = (hashCode22 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.volumeMovingAverage25Day;
        int hashCode24 = (hashCode23 + (bigDecimal16 == null ? 0 : bigDecimal16.hashCode())) * 31;
        BigDecimal bigDecimal17 = this.volumeMovingAverage50Day;
        int hashCode25 = (hashCode24 + (bigDecimal17 == null ? 0 : bigDecimal17.hashCode())) * 31;
        BigDecimal bigDecimal18 = this.volumeMovingAverage150Day;
        int hashCode26 = (hashCode25 + (bigDecimal18 == null ? 0 : bigDecimal18.hashCode())) * 31;
        BigDecimal bigDecimal19 = this.volumeMovingAverage200Day;
        if (bigDecimal19 != null) {
            i = bigDecimal19.hashCode();
        }
        return hashCode26 + i;
    }

    public String toString() {
        String str = this.instrumentID;
        String str2 = this.symbol;
        String str3 = this.companyName;
        BigDecimal bigDecimal = this.openPrice;
        BigDecimal bigDecimal2 = this.bidPrice;
        BigDecimal bigDecimal3 = this.askPrice;
        BigDecimal bigDecimal4 = this.lowPrice;
        BigDecimal bigDecimal5 = this.highPrice;
        BigDecimal bigDecimal6 = this.fiftyTwoWeekLowPrice;
        BigDecimal bigDecimal7 = this.fiftyTwoWeekHighPrice;
        BigDecimal bigDecimal8 = this.cumulativeVolume;
        BigDecimal bigDecimal9 = this.marketCap;
        BigDecimal bigDecimal10 = this.peRatio;
        BigDecimal bigDecimal11 = this.dividendYield;
        BigDecimal bigDecimal12 = this.earningsPerShare;
        BigDecimal bigDecimal13 = this.dividend;
        BigDecimal bigDecimal14 = this.sharesOutstanding;
        String str4 = this.timeLastUpdated;
        String str5 = this.bookValuePerShare;
        String str6 = this.cashFlowPerShare;
        String str7 = this.operatingIncome;
        String str8 = this.pbRatio;
        BigDecimal bigDecimal15 = this.volumeMovingAverage10Day;
        BigDecimal bigDecimal16 = this.volumeMovingAverage25Day;
        BigDecimal bigDecimal17 = this.volumeMovingAverage50Day;
        BigDecimal bigDecimal18 = this.volumeMovingAverage150Day;
        BigDecimal bigDecimal19 = this.volumeMovingAverage200Day;
        return "FundamentalDataApiModel(instrumentID=" + str + ", symbol=" + str2 + ", companyName=" + str3 + ", openPrice=" + bigDecimal + ", bidPrice=" + bigDecimal2 + ", askPrice=" + bigDecimal3 + ", lowPrice=" + bigDecimal4 + ", highPrice=" + bigDecimal5 + ", fiftyTwoWeekLowPrice=" + bigDecimal6 + ", fiftyTwoWeekHighPrice=" + bigDecimal7 + ", cumulativeVolume=" + bigDecimal8 + ", marketCap=" + bigDecimal9 + ", peRatio=" + bigDecimal10 + ", dividendYield=" + bigDecimal11 + ", earningsPerShare=" + bigDecimal12 + ", dividend=" + bigDecimal13 + ", sharesOutstanding=" + bigDecimal14 + ", timeLastUpdated=" + str4 + ", bookValuePerShare=" + str5 + ", cashFlowPerShare=" + str6 + ", operatingIncome=" + str7 + ", pbRatio=" + str8 + ", volumeMovingAverage10Day=" + bigDecimal15 + ", volumeMovingAverage25Day=" + bigDecimal16 + ", volumeMovingAverage50Day=" + bigDecimal17 + ", volumeMovingAverage150Day=" + bigDecimal18 + ", volumeMovingAverage200Day=" + bigDecimal19 + ")";
    }
}
