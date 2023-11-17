package p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTTransactionApiModel */
public final class GTTransactionApiModel {
    private final String accountAmount;
    private final String accountBalance;
    private final String accountType;
    private final BigDecimal amountCash;
    private final String comment;
    private final String cumQty;
    private final GTDividendApiModel dividend;
    private final GTDividendTaxApiModel dividendTax;
    private final String dnb;
    private final String execType;
    private final String feeBase;
    private final String feeExchange;
    private final String feeSec;
    private final String feeTaf;
    private final String feeXtraShares;
    private final String fillPx;
    private final Double fillQty;
    private final String finTranID;
    private final String finTranTypeID;
    private final GTInstrumentApiModel instrument;
    private final String lastPx;
    private final String lastShares;
    private final String leavesQty;
    private final GTMergerAcquisitionApiModel mergerAcquisition;
    private final String ordRejCode;
    private final String ordRejDctKey;
    private final String ordRejReason;
    private final Integer ordStatus;
    private final String ordType;
    private final String orderID;
    private final String orderNo;
    private final String orderQty;
    private final String positionDelta;
    private final String sendCommissionToInteliclear;
    private final String side;
    private final String systemAmount;
    private final String tranAmount;
    private final String tranSource;
    private final String tranWhen;
    private final String wlpAmount;
    private final String wplFinTranTypeID;

    public GTTransactionApiModel(String str, String str2, String str3, String str4, GTDividendApiModel gTDividendApiModel, GTDividendTaxApiModel gTDividendTaxApiModel, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Double d, String str12, String str13, GTMergerAcquisitionApiModel gTMergerAcquisitionApiModel, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, GTInstrumentApiModel gTInstrumentApiModel, String str22, String str23, Integer num, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, BigDecimal bigDecimal) {
        this.accountAmount = str;
        this.accountBalance = str2;
        this.accountType = str3;
        this.comment = str4;
        this.dividend = gTDividendApiModel;
        this.dividendTax = gTDividendTaxApiModel;
        this.dnb = str5;
        this.finTranID = str6;
        this.finTranTypeID = str7;
        this.feeSec = str8;
        this.feeTaf = str9;
        this.feeXtraShares = str10;
        this.feeExchange = str11;
        this.fillQty = d;
        this.fillPx = str12;
        this.orderID = str13;
        this.mergerAcquisition = gTMergerAcquisitionApiModel;
        this.positionDelta = str14;
        this.sendCommissionToInteliclear = str15;
        this.systemAmount = str16;
        this.tranAmount = str17;
        this.tranSource = str18;
        this.tranWhen = str19;
        this.wlpAmount = str20;
        this.orderNo = str21;
        this.instrument = gTInstrumentApiModel;
        this.wplFinTranTypeID = str22;
        this.execType = str23;
        this.ordStatus = num;
        this.ordType = str24;
        this.ordRejReason = str25;
        this.ordRejCode = str26;
        this.ordRejDctKey = str27;
        this.side = str28;
        this.lastShares = str29;
        this.lastPx = str30;
        this.cumQty = str31;
        this.leavesQty = str32;
        this.orderQty = str33;
        this.feeBase = str34;
        this.amountCash = bigDecimal;
    }

    public static /* synthetic */ GTTransactionApiModel copy$default(GTTransactionApiModel gTTransactionApiModel, String str, String str2, String str3, String str4, GTDividendApiModel gTDividendApiModel, GTDividendTaxApiModel gTDividendTaxApiModel, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Double d, String str12, String str13, GTMergerAcquisitionApiModel gTMergerAcquisitionApiModel, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, GTInstrumentApiModel gTInstrumentApiModel, String str22, String str23, Integer num, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, BigDecimal bigDecimal, int i, int i2, Object obj) {
        GTTransactionApiModel gTTransactionApiModel2 = gTTransactionApiModel;
        int i3 = i;
        int i4 = i2;
        return gTTransactionApiModel.copy((i3 & 1) != 0 ? gTTransactionApiModel2.accountAmount : str, (i3 & 2) != 0 ? gTTransactionApiModel2.accountBalance : str2, (i3 & 4) != 0 ? gTTransactionApiModel2.accountType : str3, (i3 & 8) != 0 ? gTTransactionApiModel2.comment : str4, (i3 & 16) != 0 ? gTTransactionApiModel2.dividend : gTDividendApiModel, (i3 & 32) != 0 ? gTTransactionApiModel2.dividendTax : gTDividendTaxApiModel, (i3 & 64) != 0 ? gTTransactionApiModel2.dnb : str5, (i3 & 128) != 0 ? gTTransactionApiModel2.finTranID : str6, (i3 & C11398b.f33139r) != 0 ? gTTransactionApiModel2.finTranTypeID : str7, (i3 & C11398b.f33140s) != 0 ? gTTransactionApiModel2.feeSec : str8, (i3 & C11398b.f33141t) != 0 ? gTTransactionApiModel2.feeTaf : str9, (i3 & C11398b.f33142u) != 0 ? gTTransactionApiModel2.feeXtraShares : str10, (i3 & C11398b.f33143v) != 0 ? gTTransactionApiModel2.feeExchange : str11, (i3 & 8192) != 0 ? gTTransactionApiModel2.fillQty : d, (i3 & 16384) != 0 ? gTTransactionApiModel2.fillPx : str12, (i3 & 32768) != 0 ? gTTransactionApiModel2.orderID : str13, (i3 & 65536) != 0 ? gTTransactionApiModel2.mergerAcquisition : gTMergerAcquisitionApiModel, (i3 & 131072) != 0 ? gTTransactionApiModel2.positionDelta : str14, (i3 & 262144) != 0 ? gTTransactionApiModel2.sendCommissionToInteliclear : str15, (i3 & 524288) != 0 ? gTTransactionApiModel2.systemAmount : str16, (i3 & 1048576) != 0 ? gTTransactionApiModel2.tranAmount : str17, (i3 & 2097152) != 0 ? gTTransactionApiModel2.tranSource : str18, (i3 & 4194304) != 0 ? gTTransactionApiModel2.tranWhen : str19, (i3 & 8388608) != 0 ? gTTransactionApiModel2.wlpAmount : str20, (i3 & 16777216) != 0 ? gTTransactionApiModel2.orderNo : str21, (i3 & 33554432) != 0 ? gTTransactionApiModel2.instrument : gTInstrumentApiModel, (i3 & 67108864) != 0 ? gTTransactionApiModel2.wplFinTranTypeID : str22, (i3 & 134217728) != 0 ? gTTransactionApiModel2.execType : str23, (i3 & 268435456) != 0 ? gTTransactionApiModel2.ordStatus : num, (i3 & 536870912) != 0 ? gTTransactionApiModel2.ordType : str24, (i3 & 1073741824) != 0 ? gTTransactionApiModel2.ordRejReason : str25, (i3 & Integer.MIN_VALUE) != 0 ? gTTransactionApiModel2.ordRejCode : str26, (i4 & 1) != 0 ? gTTransactionApiModel2.ordRejDctKey : str27, (i4 & 2) != 0 ? gTTransactionApiModel2.side : str28, (i4 & 4) != 0 ? gTTransactionApiModel2.lastShares : str29, (i4 & 8) != 0 ? gTTransactionApiModel2.lastPx : str30, (i4 & 16) != 0 ? gTTransactionApiModel2.cumQty : str31, (i4 & 32) != 0 ? gTTransactionApiModel2.leavesQty : str32, (i4 & 64) != 0 ? gTTransactionApiModel2.orderQty : str33, (i4 & 128) != 0 ? gTTransactionApiModel2.feeBase : str34, (i4 & C11398b.f33139r) != 0 ? gTTransactionApiModel2.amountCash : bigDecimal);
    }

    public final String component1() {
        return this.accountAmount;
    }

    public final String component10() {
        return this.feeSec;
    }

    public final String component11() {
        return this.feeTaf;
    }

    public final String component12() {
        return this.feeXtraShares;
    }

    public final String component13() {
        return this.feeExchange;
    }

    public final Double component14() {
        return this.fillQty;
    }

    public final String component15() {
        return this.fillPx;
    }

    public final String component16() {
        return this.orderID;
    }

    public final GTMergerAcquisitionApiModel component17() {
        return this.mergerAcquisition;
    }

    public final String component18() {
        return this.positionDelta;
    }

    public final String component19() {
        return this.sendCommissionToInteliclear;
    }

    public final String component2() {
        return this.accountBalance;
    }

    public final String component20() {
        return this.systemAmount;
    }

    public final String component21() {
        return this.tranAmount;
    }

    public final String component22() {
        return this.tranSource;
    }

    public final String component23() {
        return this.tranWhen;
    }

    public final String component24() {
        return this.wlpAmount;
    }

    public final String component25() {
        return this.orderNo;
    }

    public final GTInstrumentApiModel component26() {
        return this.instrument;
    }

    public final String component27() {
        return this.wplFinTranTypeID;
    }

    public final String component28() {
        return this.execType;
    }

    public final Integer component29() {
        return this.ordStatus;
    }

    public final String component3() {
        return this.accountType;
    }

    public final String component30() {
        return this.ordType;
    }

    public final String component31() {
        return this.ordRejReason;
    }

    public final String component32() {
        return this.ordRejCode;
    }

    public final String component33() {
        return this.ordRejDctKey;
    }

    public final String component34() {
        return this.side;
    }

    public final String component35() {
        return this.lastShares;
    }

    public final String component36() {
        return this.lastPx;
    }

    public final String component37() {
        return this.cumQty;
    }

    public final String component38() {
        return this.leavesQty;
    }

    public final String component39() {
        return this.orderQty;
    }

    public final String component4() {
        return this.comment;
    }

    public final String component40() {
        return this.feeBase;
    }

    public final BigDecimal component41() {
        return this.amountCash;
    }

    public final GTDividendApiModel component5() {
        return this.dividend;
    }

    public final GTDividendTaxApiModel component6() {
        return this.dividendTax;
    }

    public final String component7() {
        return this.dnb;
    }

    public final String component8() {
        return this.finTranID;
    }

    public final String component9() {
        return this.finTranTypeID;
    }

    public final GTTransactionApiModel copy(String str, String str2, String str3, String str4, GTDividendApiModel gTDividendApiModel, GTDividendTaxApiModel gTDividendTaxApiModel, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Double d, String str12, String str13, GTMergerAcquisitionApiModel gTMergerAcquisitionApiModel, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, GTInstrumentApiModel gTInstrumentApiModel, String str22, String str23, Integer num, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, BigDecimal bigDecimal) {
        return new GTTransactionApiModel(str, str2, str3, str4, gTDividendApiModel, gTDividendTaxApiModel, str5, str6, str7, str8, str9, str10, str11, d, str12, str13, gTMergerAcquisitionApiModel, str14, str15, str16, str17, str18, str19, str20, str21, gTInstrumentApiModel, str22, str23, num, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTTransactionApiModel)) {
            return false;
        }
        GTTransactionApiModel gTTransactionApiModel = (GTTransactionApiModel) obj;
        return C41536l.m120484d(this.accountAmount, gTTransactionApiModel.accountAmount) && C41536l.m120484d(this.accountBalance, gTTransactionApiModel.accountBalance) && C41536l.m120484d(this.accountType, gTTransactionApiModel.accountType) && C41536l.m120484d(this.comment, gTTransactionApiModel.comment) && C41536l.m120484d(this.dividend, gTTransactionApiModel.dividend) && C41536l.m120484d(this.dividendTax, gTTransactionApiModel.dividendTax) && C41536l.m120484d(this.dnb, gTTransactionApiModel.dnb) && C41536l.m120484d(this.finTranID, gTTransactionApiModel.finTranID) && C41536l.m120484d(this.finTranTypeID, gTTransactionApiModel.finTranTypeID) && C41536l.m120484d(this.feeSec, gTTransactionApiModel.feeSec) && C41536l.m120484d(this.feeTaf, gTTransactionApiModel.feeTaf) && C41536l.m120484d(this.feeXtraShares, gTTransactionApiModel.feeXtraShares) && C41536l.m120484d(this.feeExchange, gTTransactionApiModel.feeExchange) && C41536l.m120484d(this.fillQty, gTTransactionApiModel.fillQty) && C41536l.m120484d(this.fillPx, gTTransactionApiModel.fillPx) && C41536l.m120484d(this.orderID, gTTransactionApiModel.orderID) && C41536l.m120484d(this.mergerAcquisition, gTTransactionApiModel.mergerAcquisition) && C41536l.m120484d(this.positionDelta, gTTransactionApiModel.positionDelta) && C41536l.m120484d(this.sendCommissionToInteliclear, gTTransactionApiModel.sendCommissionToInteliclear) && C41536l.m120484d(this.systemAmount, gTTransactionApiModel.systemAmount) && C41536l.m120484d(this.tranAmount, gTTransactionApiModel.tranAmount) && C41536l.m120484d(this.tranSource, gTTransactionApiModel.tranSource) && C41536l.m120484d(this.tranWhen, gTTransactionApiModel.tranWhen) && C41536l.m120484d(this.wlpAmount, gTTransactionApiModel.wlpAmount) && C41536l.m120484d(this.orderNo, gTTransactionApiModel.orderNo) && C41536l.m120484d(this.instrument, gTTransactionApiModel.instrument) && C41536l.m120484d(this.wplFinTranTypeID, gTTransactionApiModel.wplFinTranTypeID) && C41536l.m120484d(this.execType, gTTransactionApiModel.execType) && C41536l.m120484d(this.ordStatus, gTTransactionApiModel.ordStatus) && C41536l.m120484d(this.ordType, gTTransactionApiModel.ordType) && C41536l.m120484d(this.ordRejReason, gTTransactionApiModel.ordRejReason) && C41536l.m120484d(this.ordRejCode, gTTransactionApiModel.ordRejCode) && C41536l.m120484d(this.ordRejDctKey, gTTransactionApiModel.ordRejDctKey) && C41536l.m120484d(this.side, gTTransactionApiModel.side) && C41536l.m120484d(this.lastShares, gTTransactionApiModel.lastShares) && C41536l.m120484d(this.lastPx, gTTransactionApiModel.lastPx) && C41536l.m120484d(this.cumQty, gTTransactionApiModel.cumQty) && C41536l.m120484d(this.leavesQty, gTTransactionApiModel.leavesQty) && C41536l.m120484d(this.orderQty, gTTransactionApiModel.orderQty) && C41536l.m120484d(this.feeBase, gTTransactionApiModel.feeBase) && C41536l.m120484d(this.amountCash, gTTransactionApiModel.amountCash);
    }

    public final String getAccountAmount() {
        return this.accountAmount;
    }

    public final String getAccountBalance() {
        return this.accountBalance;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final BigDecimal getAmountCash() {
        return this.amountCash;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCumQty() {
        return this.cumQty;
    }

    public final GTDividendApiModel getDividend() {
        return this.dividend;
    }

    public final GTDividendTaxApiModel getDividendTax() {
        return this.dividendTax;
    }

    public final String getDnb() {
        return this.dnb;
    }

    public final String getExecType() {
        return this.execType;
    }

    public final String getFeeBase() {
        return this.feeBase;
    }

    public final String getFeeExchange() {
        return this.feeExchange;
    }

    public final String getFeeSec() {
        return this.feeSec;
    }

    public final String getFeeTaf() {
        return this.feeTaf;
    }

    public final String getFeeXtraShares() {
        return this.feeXtraShares;
    }

    public final String getFillPx() {
        return this.fillPx;
    }

    public final Double getFillQty() {
        return this.fillQty;
    }

    public final String getFinTranID() {
        return this.finTranID;
    }

    public final String getFinTranTypeID() {
        return this.finTranTypeID;
    }

    public final GTInstrumentApiModel getInstrument() {
        return this.instrument;
    }

    public final String getLastPx() {
        return this.lastPx;
    }

    public final String getLastShares() {
        return this.lastShares;
    }

    public final String getLeavesQty() {
        return this.leavesQty;
    }

    public final GTMergerAcquisitionApiModel getMergerAcquisition() {
        return this.mergerAcquisition;
    }

    public final String getOrdRejCode() {
        return this.ordRejCode;
    }

    public final String getOrdRejDctKey() {
        return this.ordRejDctKey;
    }

    public final String getOrdRejReason() {
        return this.ordRejReason;
    }

    public final Integer getOrdStatus() {
        return this.ordStatus;
    }

    public final String getOrdType() {
        return this.ordType;
    }

    public final String getOrderID() {
        return this.orderID;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final String getOrderQty() {
        return this.orderQty;
    }

    public final String getPositionDelta() {
        return this.positionDelta;
    }

    public final String getSendCommissionToInteliclear() {
        return this.sendCommissionToInteliclear;
    }

    public final String getSide() {
        return this.side;
    }

    public final String getSystemAmount() {
        return this.systemAmount;
    }

    public final String getTranAmount() {
        return this.tranAmount;
    }

    public final String getTranSource() {
        return this.tranSource;
    }

    public final String getTranWhen() {
        return this.tranWhen;
    }

    public final String getWlpAmount() {
        return this.wlpAmount;
    }

    public final String getWplFinTranTypeID() {
        return this.wplFinTranTypeID;
    }

    public int hashCode() {
        String str = this.accountAmount;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountBalance;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.comment;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GTDividendApiModel gTDividendApiModel = this.dividend;
        int hashCode5 = (hashCode4 + (gTDividendApiModel == null ? 0 : gTDividendApiModel.hashCode())) * 31;
        GTDividendTaxApiModel gTDividendTaxApiModel = this.dividendTax;
        int hashCode6 = (hashCode5 + (gTDividendTaxApiModel == null ? 0 : gTDividendTaxApiModel.hashCode())) * 31;
        String str5 = this.dnb;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.finTranID;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.finTranTypeID;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.feeSec;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.feeTaf;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.feeXtraShares;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.feeExchange;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Double d = this.fillQty;
        int hashCode14 = (hashCode13 + (d == null ? 0 : d.hashCode())) * 31;
        String str12 = this.fillPx;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.orderID;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        GTMergerAcquisitionApiModel gTMergerAcquisitionApiModel = this.mergerAcquisition;
        int hashCode17 = (hashCode16 + (gTMergerAcquisitionApiModel == null ? 0 : gTMergerAcquisitionApiModel.hashCode())) * 31;
        String str14 = this.positionDelta;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.sendCommissionToInteliclear;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.systemAmount;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.tranAmount;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.tranSource;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.tranWhen;
        int hashCode23 = (hashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.wlpAmount;
        int hashCode24 = (hashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.orderNo;
        int hashCode25 = (hashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        GTInstrumentApiModel gTInstrumentApiModel = this.instrument;
        int hashCode26 = (hashCode25 + (gTInstrumentApiModel == null ? 0 : gTInstrumentApiModel.hashCode())) * 31;
        String str22 = this.wplFinTranTypeID;
        int hashCode27 = (hashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.execType;
        int hashCode28 = (hashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Integer num = this.ordStatus;
        int hashCode29 = (hashCode28 + (num == null ? 0 : num.hashCode())) * 31;
        String str24 = this.ordType;
        int hashCode30 = (hashCode29 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.ordRejReason;
        int hashCode31 = (hashCode30 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.ordRejCode;
        int hashCode32 = (hashCode31 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.ordRejDctKey;
        int hashCode33 = (hashCode32 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.side;
        int hashCode34 = (hashCode33 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.lastShares;
        int hashCode35 = (hashCode34 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.lastPx;
        int hashCode36 = (hashCode35 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.cumQty;
        int hashCode37 = (hashCode36 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.leavesQty;
        int hashCode38 = (hashCode37 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.orderQty;
        int hashCode39 = (hashCode38 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.feeBase;
        int hashCode40 = (hashCode39 + (str34 == null ? 0 : str34.hashCode())) * 31;
        BigDecimal bigDecimal = this.amountCash;
        if (bigDecimal != null) {
            i = bigDecimal.hashCode();
        }
        return hashCode40 + i;
    }

    public String toString() {
        String str = this.accountAmount;
        String str2 = this.accountBalance;
        String str3 = this.accountType;
        String str4 = this.comment;
        GTDividendApiModel gTDividendApiModel = this.dividend;
        GTDividendTaxApiModel gTDividendTaxApiModel = this.dividendTax;
        String str5 = this.dnb;
        String str6 = this.finTranID;
        String str7 = this.finTranTypeID;
        String str8 = this.feeSec;
        String str9 = this.feeTaf;
        String str10 = this.feeXtraShares;
        String str11 = this.feeExchange;
        Double d = this.fillQty;
        String str12 = this.fillPx;
        String str13 = this.orderID;
        GTMergerAcquisitionApiModel gTMergerAcquisitionApiModel = this.mergerAcquisition;
        String str14 = this.positionDelta;
        String str15 = this.sendCommissionToInteliclear;
        String str16 = this.systemAmount;
        String str17 = this.tranAmount;
        String str18 = this.tranSource;
        String str19 = this.tranWhen;
        String str20 = this.wlpAmount;
        String str21 = this.orderNo;
        GTInstrumentApiModel gTInstrumentApiModel = this.instrument;
        String str22 = this.wplFinTranTypeID;
        String str23 = this.execType;
        Integer num = this.ordStatus;
        String str24 = this.ordType;
        String str25 = this.ordRejReason;
        String str26 = this.ordRejCode;
        String str27 = this.ordRejDctKey;
        String str28 = this.side;
        String str29 = this.lastShares;
        String str30 = this.lastPx;
        String str31 = this.cumQty;
        String str32 = this.leavesQty;
        String str33 = this.orderQty;
        String str34 = this.feeBase;
        BigDecimal bigDecimal = this.amountCash;
        return "GTTransactionApiModel(accountAmount=" + str + ", accountBalance=" + str2 + ", accountType=" + str3 + ", comment=" + str4 + ", dividend=" + gTDividendApiModel + ", dividendTax=" + gTDividendTaxApiModel + ", dnb=" + str5 + ", finTranID=" + str6 + ", finTranTypeID=" + str7 + ", feeSec=" + str8 + ", feeTaf=" + str9 + ", feeXtraShares=" + str10 + ", feeExchange=" + str11 + ", fillQty=" + d + ", fillPx=" + str12 + ", orderID=" + str13 + ", mergerAcquisition=" + gTMergerAcquisitionApiModel + ", positionDelta=" + str14 + ", sendCommissionToInteliclear=" + str15 + ", systemAmount=" + str16 + ", tranAmount=" + str17 + ", tranSource=" + str18 + ", tranWhen=" + str19 + ", wlpAmount=" + str20 + ", orderNo=" + str21 + ", instrument=" + gTInstrumentApiModel + ", wplFinTranTypeID=" + str22 + ", execType=" + str23 + ", ordStatus=" + num + ", ordType=" + str24 + ", ordRejReason=" + str25 + ", ordRejCode=" + str26 + ", ordRejDctKey=" + str27 + ", side=" + str28 + ", lastShares=" + str29 + ", lastPx=" + str30 + ", cumQty=" + str31 + ", leavesQty=" + str32 + ", orderQty=" + str33 + ", feeBase=" + str34 + ", amountCash=" + bigDecimal + ")";
    }
}
