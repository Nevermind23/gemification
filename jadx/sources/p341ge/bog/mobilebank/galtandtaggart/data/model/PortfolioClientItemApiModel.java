package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.PortfolioClientItemApiModel */
public final class PortfolioClientItemApiModel {
    private final String ccy;
    private final String image;
    private final BigDecimal marketValue;
    private final BigDecimal mktPrice;
    private final BigDecimal openQty;
    private final BigDecimal priorClose;
    private final String securityName;
    private final String symbol;
    private final String symbolType;
    private final BigDecimal unrealizedDayPL;
    private final BigDecimal unrealizedDayPLPercent;
    private final BigDecimal unrealizedPL;
    private final BigDecimal unrealizedPLPercent;

    public PortfolioClientItemApiModel(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str5) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(str3, "securityName");
        C41536l.m120489i(bigDecimal, "mktPrice");
        C41536l.m120489i(bigDecimal2, "priorClose");
        C41536l.m120489i(str4, "ccy");
        C41536l.m120489i(bigDecimal3, "openQty");
        C41536l.m120489i(bigDecimal4, "marketValue");
        C41536l.m120489i(bigDecimal5, "unrealizedPL");
        this.symbol = str;
        this.symbolType = str2;
        this.securityName = str3;
        this.mktPrice = bigDecimal;
        this.priorClose = bigDecimal2;
        this.ccy = str4;
        this.openQty = bigDecimal3;
        this.marketValue = bigDecimal4;
        this.unrealizedPL = bigDecimal5;
        this.unrealizedPLPercent = bigDecimal6;
        this.unrealizedDayPL = bigDecimal7;
        this.unrealizedDayPLPercent = bigDecimal8;
        this.image = str5;
    }

    public static /* synthetic */ PortfolioClientItemApiModel copy$default(PortfolioClientItemApiModel portfolioClientItemApiModel, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str5, int i, Object obj) {
        PortfolioClientItemApiModel portfolioClientItemApiModel2 = portfolioClientItemApiModel;
        int i2 = i;
        return portfolioClientItemApiModel.copy((i2 & 1) != 0 ? portfolioClientItemApiModel2.symbol : str, (i2 & 2) != 0 ? portfolioClientItemApiModel2.symbolType : str2, (i2 & 4) != 0 ? portfolioClientItemApiModel2.securityName : str3, (i2 & 8) != 0 ? portfolioClientItemApiModel2.mktPrice : bigDecimal, (i2 & 16) != 0 ? portfolioClientItemApiModel2.priorClose : bigDecimal2, (i2 & 32) != 0 ? portfolioClientItemApiModel2.ccy : str4, (i2 & 64) != 0 ? portfolioClientItemApiModel2.openQty : bigDecimal3, (i2 & 128) != 0 ? portfolioClientItemApiModel2.marketValue : bigDecimal4, (i2 & C11398b.f33139r) != 0 ? portfolioClientItemApiModel2.unrealizedPL : bigDecimal5, (i2 & C11398b.f33140s) != 0 ? portfolioClientItemApiModel2.unrealizedPLPercent : bigDecimal6, (i2 & C11398b.f33141t) != 0 ? portfolioClientItemApiModel2.unrealizedDayPL : bigDecimal7, (i2 & C11398b.f33142u) != 0 ? portfolioClientItemApiModel2.unrealizedDayPLPercent : bigDecimal8, (i2 & C11398b.f33143v) != 0 ? portfolioClientItemApiModel2.image : str5);
    }

    public final String component1() {
        return this.symbol;
    }

    public final BigDecimal component10() {
        return this.unrealizedPLPercent;
    }

    public final BigDecimal component11() {
        return this.unrealizedDayPL;
    }

    public final BigDecimal component12() {
        return this.unrealizedDayPLPercent;
    }

    public final String component13() {
        return this.image;
    }

    public final String component2() {
        return this.symbolType;
    }

    public final String component3() {
        return this.securityName;
    }

    public final BigDecimal component4() {
        return this.mktPrice;
    }

    public final BigDecimal component5() {
        return this.priorClose;
    }

    public final String component6() {
        return this.ccy;
    }

    public final BigDecimal component7() {
        return this.openQty;
    }

    public final BigDecimal component8() {
        return this.marketValue;
    }

    public final BigDecimal component9() {
        return this.unrealizedPL;
    }

    public final PortfolioClientItemApiModel copy(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str5) {
        String str6 = str;
        C41536l.m120489i(str6, "symbol");
        String str7 = str3;
        C41536l.m120489i(str7, "securityName");
        BigDecimal bigDecimal9 = bigDecimal;
        C41536l.m120489i(bigDecimal9, "mktPrice");
        BigDecimal bigDecimal10 = bigDecimal2;
        C41536l.m120489i(bigDecimal10, "priorClose");
        String str8 = str4;
        C41536l.m120489i(str8, "ccy");
        BigDecimal bigDecimal11 = bigDecimal3;
        C41536l.m120489i(bigDecimal11, "openQty");
        BigDecimal bigDecimal12 = bigDecimal4;
        C41536l.m120489i(bigDecimal12, "marketValue");
        BigDecimal bigDecimal13 = bigDecimal5;
        C41536l.m120489i(bigDecimal13, "unrealizedPL");
        return new PortfolioClientItemApiModel(str6, str2, str7, bigDecimal9, bigDecimal10, str8, bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal6, bigDecimal7, bigDecimal8, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortfolioClientItemApiModel)) {
            return false;
        }
        PortfolioClientItemApiModel portfolioClientItemApiModel = (PortfolioClientItemApiModel) obj;
        return C41536l.m120484d(this.symbol, portfolioClientItemApiModel.symbol) && C41536l.m120484d(this.symbolType, portfolioClientItemApiModel.symbolType) && C41536l.m120484d(this.securityName, portfolioClientItemApiModel.securityName) && C41536l.m120484d(this.mktPrice, portfolioClientItemApiModel.mktPrice) && C41536l.m120484d(this.priorClose, portfolioClientItemApiModel.priorClose) && C41536l.m120484d(this.ccy, portfolioClientItemApiModel.ccy) && C41536l.m120484d(this.openQty, portfolioClientItemApiModel.openQty) && C41536l.m120484d(this.marketValue, portfolioClientItemApiModel.marketValue) && C41536l.m120484d(this.unrealizedPL, portfolioClientItemApiModel.unrealizedPL) && C41536l.m120484d(this.unrealizedPLPercent, portfolioClientItemApiModel.unrealizedPLPercent) && C41536l.m120484d(this.unrealizedDayPL, portfolioClientItemApiModel.unrealizedDayPL) && C41536l.m120484d(this.unrealizedDayPLPercent, portfolioClientItemApiModel.unrealizedDayPLPercent) && C41536l.m120484d(this.image, portfolioClientItemApiModel.image);
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getImage() {
        return this.image;
    }

    public final BigDecimal getMarketValue() {
        return this.marketValue;
    }

    public final BigDecimal getMktPrice() {
        return this.mktPrice;
    }

    public final BigDecimal getOpenQty() {
        return this.openQty;
    }

    public final BigDecimal getPriorClose() {
        return this.priorClose;
    }

    public final String getSecurityName() {
        return this.securityName;
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

    public final BigDecimal getUnrealizedPLPercent() {
        return this.unrealizedPLPercent;
    }

    public int hashCode() {
        int hashCode = this.symbol.hashCode() * 31;
        String str = this.symbolType;
        int i = 0;
        int hashCode2 = (((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.securityName.hashCode()) * 31) + this.mktPrice.hashCode()) * 31) + this.priorClose.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.openQty.hashCode()) * 31) + this.marketValue.hashCode()) * 31) + this.unrealizedPL.hashCode()) * 31;
        BigDecimal bigDecimal = this.unrealizedPLPercent;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.unrealizedDayPL;
        int hashCode4 = (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.unrealizedDayPLPercent;
        int hashCode5 = (hashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str2 = this.image;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.symbol;
        String str2 = this.symbolType;
        String str3 = this.securityName;
        BigDecimal bigDecimal = this.mktPrice;
        BigDecimal bigDecimal2 = this.priorClose;
        String str4 = this.ccy;
        BigDecimal bigDecimal3 = this.openQty;
        BigDecimal bigDecimal4 = this.marketValue;
        BigDecimal bigDecimal5 = this.unrealizedPL;
        BigDecimal bigDecimal6 = this.unrealizedPLPercent;
        BigDecimal bigDecimal7 = this.unrealizedDayPL;
        BigDecimal bigDecimal8 = this.unrealizedDayPLPercent;
        String str5 = this.image;
        return "PortfolioClientItemApiModel(symbol=" + str + ", symbolType=" + str2 + ", securityName=" + str3 + ", mktPrice=" + bigDecimal + ", priorClose=" + bigDecimal2 + ", ccy=" + str4 + ", openQty=" + bigDecimal3 + ", marketValue=" + bigDecimal4 + ", unrealizedPL=" + bigDecimal5 + ", unrealizedPLPercent=" + bigDecimal6 + ", unrealizedDayPL=" + bigDecimal7 + ", unrealizedDayPLPercent=" + bigDecimal8 + ", image=" + str5 + ")";
    }
}
