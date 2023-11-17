package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.SymbolPriceHistoryApiModel */
public final class SymbolPriceHistoryApiModel {
    private final BigDecimal close;
    private final Date date;

    public SymbolPriceHistoryApiModel(Date date2, BigDecimal bigDecimal) {
        C41536l.m120489i(date2, "date");
        C41536l.m120489i(bigDecimal, "close");
        this.date = date2;
        this.close = bigDecimal;
    }

    public static /* synthetic */ SymbolPriceHistoryApiModel copy$default(SymbolPriceHistoryApiModel symbolPriceHistoryApiModel, Date date2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            date2 = symbolPriceHistoryApiModel.date;
        }
        if ((i & 2) != 0) {
            bigDecimal = symbolPriceHistoryApiModel.close;
        }
        return symbolPriceHistoryApiModel.copy(date2, bigDecimal);
    }

    public final Date component1() {
        return this.date;
    }

    public final BigDecimal component2() {
        return this.close;
    }

    public final SymbolPriceHistoryApiModel copy(Date date2, BigDecimal bigDecimal) {
        C41536l.m120489i(date2, "date");
        C41536l.m120489i(bigDecimal, "close");
        return new SymbolPriceHistoryApiModel(date2, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SymbolPriceHistoryApiModel)) {
            return false;
        }
        SymbolPriceHistoryApiModel symbolPriceHistoryApiModel = (SymbolPriceHistoryApiModel) obj;
        return C41536l.m120484d(this.date, symbolPriceHistoryApiModel.date) && C41536l.m120484d(this.close, symbolPriceHistoryApiModel.close);
    }

    public final BigDecimal getClose() {
        return this.close;
    }

    public final Date getDate() {
        return this.date;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.close.hashCode();
    }

    public String toString() {
        Date date2 = this.date;
        BigDecimal bigDecimal = this.close;
        return "SymbolPriceHistoryApiModel(date=" + date2 + ", close=" + bigDecimal + ")";
    }
}
