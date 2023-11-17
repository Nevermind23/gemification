package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.WatchListSymbolApiModel */
public final class WatchListSymbolApiModel {
    private final String image;
    private final BigDecimal marketValue;
    private final BigDecimal priorClose;
    private final String securityName;
    private final String symbol;
    private final String symbolType;

    public WatchListSymbolApiModel(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(str3, "securityName");
        C41536l.m120489i(bigDecimal, "marketValue");
        C41536l.m120489i(bigDecimal2, "priorClose");
        this.symbol = str;
        this.symbolType = str2;
        this.securityName = str3;
        this.marketValue = bigDecimal;
        this.priorClose = bigDecimal2;
        this.image = str4;
    }

    public static /* synthetic */ WatchListSymbolApiModel copy$default(WatchListSymbolApiModel watchListSymbolApiModel, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchListSymbolApiModel.symbol;
        }
        if ((i & 2) != 0) {
            str2 = watchListSymbolApiModel.symbolType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = watchListSymbolApiModel.securityName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            bigDecimal = watchListSymbolApiModel.marketValue;
        }
        BigDecimal bigDecimal3 = bigDecimal;
        if ((i & 16) != 0) {
            bigDecimal2 = watchListSymbolApiModel.priorClose;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        if ((i & 32) != 0) {
            str4 = watchListSymbolApiModel.image;
        }
        return watchListSymbolApiModel.copy(str, str5, str6, bigDecimal3, bigDecimal4, str4);
    }

    public final String component1() {
        return this.symbol;
    }

    public final String component2() {
        return this.symbolType;
    }

    public final String component3() {
        return this.securityName;
    }

    public final BigDecimal component4() {
        return this.marketValue;
    }

    public final BigDecimal component5() {
        return this.priorClose;
    }

    public final String component6() {
        return this.image;
    }

    public final WatchListSymbolApiModel copy(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(str3, "securityName");
        C41536l.m120489i(bigDecimal, "marketValue");
        C41536l.m120489i(bigDecimal2, "priorClose");
        return new WatchListSymbolApiModel(str, str2, str3, bigDecimal, bigDecimal2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchListSymbolApiModel)) {
            return false;
        }
        WatchListSymbolApiModel watchListSymbolApiModel = (WatchListSymbolApiModel) obj;
        return C41536l.m120484d(this.symbol, watchListSymbolApiModel.symbol) && C41536l.m120484d(this.symbolType, watchListSymbolApiModel.symbolType) && C41536l.m120484d(this.securityName, watchListSymbolApiModel.securityName) && C41536l.m120484d(this.marketValue, watchListSymbolApiModel.marketValue) && C41536l.m120484d(this.priorClose, watchListSymbolApiModel.priorClose) && C41536l.m120484d(this.image, watchListSymbolApiModel.image);
    }

    public final String getImage() {
        return this.image;
    }

    public final BigDecimal getMarketValue() {
        return this.marketValue;
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

    public int hashCode() {
        int hashCode = this.symbol.hashCode() * 31;
        String str = this.symbolType;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.securityName.hashCode()) * 31) + this.marketValue.hashCode()) * 31) + this.priorClose.hashCode()) * 31;
        String str2 = this.image;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.symbol;
        String str2 = this.symbolType;
        String str3 = this.securityName;
        BigDecimal bigDecimal = this.marketValue;
        BigDecimal bigDecimal2 = this.priorClose;
        String str4 = this.image;
        return "WatchListSymbolApiModel(symbol=" + str + ", symbolType=" + str2 + ", securityName=" + str3 + ", marketValue=" + bigDecimal + ", priorClose=" + bigDecimal2 + ", image=" + str4 + ")";
    }
}
