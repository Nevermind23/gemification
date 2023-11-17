package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.ClientPositionApiModel */
public final class ClientPositionApiModel {
    private final Double availableForTradingQty;
    private final BigDecimal avgPrice;
    private final String ccy;
    private final BigDecimal costBasis;
    private final String instrumentID;
    private final BigDecimal marketValue;
    private final BigDecimal mktPrice;
    private final double openQty;
    private final BigDecimal priorClose;
    private final String securityName;
    private final String side;
    private final String symbol;
    private final String symbolType;
    private final BigDecimal unrealizedDayPL;
    private final BigDecimal unrealizedDayPLPercent;
    private final BigDecimal unrealizedPL;

    public ClientPositionApiModel(String str, String str2, String str3, String str4, double d, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, String str6, BigDecimal bigDecimal3, Double d2, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8) {
        BigDecimal bigDecimal9 = bigDecimal2;
        BigDecimal bigDecimal10 = bigDecimal4;
        BigDecimal bigDecimal11 = bigDecimal6;
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(bigDecimal9, "marketValue");
        C41536l.m120489i(bigDecimal10, "avgPrice");
        C41536l.m120489i(bigDecimal11, "unrealizedPL");
        this.symbol = str;
        this.symbolType = str2;
        this.securityName = str3;
        this.instrumentID = str4;
        this.openQty = d;
        this.costBasis = bigDecimal;
        this.ccy = str5;
        this.marketValue = bigDecimal9;
        this.side = str6;
        this.priorClose = bigDecimal3;
        this.availableForTradingQty = d2;
        this.avgPrice = bigDecimal10;
        this.mktPrice = bigDecimal5;
        this.unrealizedPL = bigDecimal11;
        this.unrealizedDayPLPercent = bigDecimal7;
        this.unrealizedDayPL = bigDecimal8;
    }

    public static /* synthetic */ ClientPositionApiModel copy$default(ClientPositionApiModel clientPositionApiModel, String str, String str2, String str3, String str4, double d, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, String str6, BigDecimal bigDecimal3, Double d2, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, int i, Object obj) {
        ClientPositionApiModel clientPositionApiModel2 = clientPositionApiModel;
        int i2 = i;
        return clientPositionApiModel.copy((i2 & 1) != 0 ? clientPositionApiModel2.symbol : str, (i2 & 2) != 0 ? clientPositionApiModel2.symbolType : str2, (i2 & 4) != 0 ? clientPositionApiModel2.securityName : str3, (i2 & 8) != 0 ? clientPositionApiModel2.instrumentID : str4, (i2 & 16) != 0 ? clientPositionApiModel2.openQty : d, (i2 & 32) != 0 ? clientPositionApiModel2.costBasis : bigDecimal, (i2 & 64) != 0 ? clientPositionApiModel2.ccy : str5, (i2 & 128) != 0 ? clientPositionApiModel2.marketValue : bigDecimal2, (i2 & C11398b.f33139r) != 0 ? clientPositionApiModel2.side : str6, (i2 & C11398b.f33140s) != 0 ? clientPositionApiModel2.priorClose : bigDecimal3, (i2 & C11398b.f33141t) != 0 ? clientPositionApiModel2.availableForTradingQty : d2, (i2 & C11398b.f33142u) != 0 ? clientPositionApiModel2.avgPrice : bigDecimal4, (i2 & C11398b.f33143v) != 0 ? clientPositionApiModel2.mktPrice : bigDecimal5, (i2 & 8192) != 0 ? clientPositionApiModel2.unrealizedPL : bigDecimal6, (i2 & 16384) != 0 ? clientPositionApiModel2.unrealizedDayPLPercent : bigDecimal7, (i2 & 32768) != 0 ? clientPositionApiModel2.unrealizedDayPL : bigDecimal8);
    }

    public final String component1() {
        return this.symbol;
    }

    public final BigDecimal component10() {
        return this.priorClose;
    }

    public final Double component11() {
        return this.availableForTradingQty;
    }

    public final BigDecimal component12() {
        return this.avgPrice;
    }

    public final BigDecimal component13() {
        return this.mktPrice;
    }

    public final BigDecimal component14() {
        return this.unrealizedPL;
    }

    public final BigDecimal component15() {
        return this.unrealizedDayPLPercent;
    }

    public final BigDecimal component16() {
        return this.unrealizedDayPL;
    }

    public final String component2() {
        return this.symbolType;
    }

    public final String component3() {
        return this.securityName;
    }

    public final String component4() {
        return this.instrumentID;
    }

    public final double component5() {
        return this.openQty;
    }

    public final BigDecimal component6() {
        return this.costBasis;
    }

    public final String component7() {
        return this.ccy;
    }

    public final BigDecimal component8() {
        return this.marketValue;
    }

    public final String component9() {
        return this.side;
    }

    public final ClientPositionApiModel copy(String str, String str2, String str3, String str4, double d, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, String str6, BigDecimal bigDecimal3, Double d2, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8) {
        String str7 = str;
        C41536l.m120489i(str7, "symbol");
        C41536l.m120489i(bigDecimal2, "marketValue");
        C41536l.m120489i(bigDecimal4, "avgPrice");
        C41536l.m120489i(bigDecimal6, "unrealizedPL");
        return new ClientPositionApiModel(str7, str2, str3, str4, d, bigDecimal, str5, bigDecimal2, str6, bigDecimal3, d2, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientPositionApiModel)) {
            return false;
        }
        ClientPositionApiModel clientPositionApiModel = (ClientPositionApiModel) obj;
        return C41536l.m120484d(this.symbol, clientPositionApiModel.symbol) && C41536l.m120484d(this.symbolType, clientPositionApiModel.symbolType) && C41536l.m120484d(this.securityName, clientPositionApiModel.securityName) && C41536l.m120484d(this.instrumentID, clientPositionApiModel.instrumentID) && Double.compare(this.openQty, clientPositionApiModel.openQty) == 0 && C41536l.m120484d(this.costBasis, clientPositionApiModel.costBasis) && C41536l.m120484d(this.ccy, clientPositionApiModel.ccy) && C41536l.m120484d(this.marketValue, clientPositionApiModel.marketValue) && C41536l.m120484d(this.side, clientPositionApiModel.side) && C41536l.m120484d(this.priorClose, clientPositionApiModel.priorClose) && C41536l.m120484d(this.availableForTradingQty, clientPositionApiModel.availableForTradingQty) && C41536l.m120484d(this.avgPrice, clientPositionApiModel.avgPrice) && C41536l.m120484d(this.mktPrice, clientPositionApiModel.mktPrice) && C41536l.m120484d(this.unrealizedPL, clientPositionApiModel.unrealizedPL) && C41536l.m120484d(this.unrealizedDayPLPercent, clientPositionApiModel.unrealizedDayPLPercent) && C41536l.m120484d(this.unrealizedDayPL, clientPositionApiModel.unrealizedDayPL);
    }

    public final Double getAvailableForTradingQty() {
        return this.availableForTradingQty;
    }

    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final BigDecimal getCostBasis() {
        return this.costBasis;
    }

    public final String getInstrumentID() {
        return this.instrumentID;
    }

    public final BigDecimal getMarketValue() {
        return this.marketValue;
    }

    public final BigDecimal getMktPrice() {
        return this.mktPrice;
    }

    public final double getOpenQty() {
        return this.openQty;
    }

    public final BigDecimal getPriorClose() {
        return this.priorClose;
    }

    public final String getSecurityName() {
        return this.securityName;
    }

    public final String getSide() {
        return this.side;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getSymbolType() {
        return this.symbolType;
    }

    public final BigDecimal getUnrealizedDayPL() {
        return this.unrealizedDayPL;
    }

    public final BigDecimal getUnrealizedDayPLPercent() {
        return this.unrealizedDayPLPercent;
    }

    public final BigDecimal getUnrealizedPL() {
        return this.unrealizedPL;
    }

    public int hashCode() {
        int hashCode = this.symbol.hashCode() * 31;
        String str = this.symbolType;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.securityName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.instrumentID;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.doubleToLongBits(this.openQty)) * 31;
        BigDecimal bigDecimal = this.costBasis;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str4 = this.ccy;
        int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.marketValue.hashCode()) * 31;
        String str5 = this.side;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.priorClose;
        int hashCode8 = (hashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Double d = this.availableForTradingQty;
        int hashCode9 = (((hashCode8 + (d == null ? 0 : d.hashCode())) * 31) + this.avgPrice.hashCode()) * 31;
        BigDecimal bigDecimal3 = this.mktPrice;
        int hashCode10 = (((hashCode9 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31) + this.unrealizedPL.hashCode()) * 31;
        BigDecimal bigDecimal4 = this.unrealizedDayPLPercent;
        int hashCode11 = (hashCode10 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.unrealizedDayPL;
        if (bigDecimal5 != null) {
            i = bigDecimal5.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        String str = this.symbol;
        String str2 = this.symbolType;
        String str3 = this.securityName;
        String str4 = this.instrumentID;
        double d = this.openQty;
        BigDecimal bigDecimal = this.costBasis;
        String str5 = this.ccy;
        BigDecimal bigDecimal2 = this.marketValue;
        String str6 = this.side;
        BigDecimal bigDecimal3 = this.priorClose;
        Double d2 = this.availableForTradingQty;
        BigDecimal bigDecimal4 = this.avgPrice;
        BigDecimal bigDecimal5 = this.mktPrice;
        BigDecimal bigDecimal6 = this.unrealizedPL;
        BigDecimal bigDecimal7 = this.unrealizedDayPLPercent;
        BigDecimal bigDecimal8 = this.unrealizedDayPL;
        return "ClientPositionApiModel(symbol=" + str + ", symbolType=" + str2 + ", securityName=" + str3 + ", instrumentID=" + str4 + ", openQty=" + d + ", costBasis=" + bigDecimal + ", ccy=" + str5 + ", marketValue=" + bigDecimal2 + ", side=" + str6 + ", priorClose=" + bigDecimal3 + ", availableForTradingQty=" + d2 + ", avgPrice=" + bigDecimal4 + ", mktPrice=" + bigDecimal5 + ", unrealizedPL=" + bigDecimal6 + ", unrealizedDayPLPercent=" + bigDecimal7 + ", unrealizedDayPL=" + bigDecimal8 + ")";
    }
}
