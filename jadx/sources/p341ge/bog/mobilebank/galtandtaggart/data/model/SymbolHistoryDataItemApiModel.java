package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.SymbolHistoryDataItemApiModel */
public final class SymbolHistoryDataItemApiModel {
    private final BigDecimal close;
    private final String date;
    private final BigDecimal high;
    private final BigDecimal low;
    private final BigDecimal open;
    private final long volume;

    public SymbolHistoryDataItemApiModel(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, long j) {
        C41536l.m120489i(str, "date");
        C41536l.m120489i(bigDecimal, "open");
        C41536l.m120489i(bigDecimal2, "high");
        C41536l.m120489i(bigDecimal3, "low");
        C41536l.m120489i(bigDecimal4, "close");
        this.date = str;
        this.open = bigDecimal;
        this.high = bigDecimal2;
        this.low = bigDecimal3;
        this.close = bigDecimal4;
        this.volume = j;
    }

    public static /* synthetic */ SymbolHistoryDataItemApiModel copy$default(SymbolHistoryDataItemApiModel symbolHistoryDataItemApiModel, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = symbolHistoryDataItemApiModel.date;
        }
        if ((i & 2) != 0) {
            bigDecimal = symbolHistoryDataItemApiModel.open;
        }
        BigDecimal bigDecimal5 = bigDecimal;
        if ((i & 4) != 0) {
            bigDecimal2 = symbolHistoryDataItemApiModel.high;
        }
        BigDecimal bigDecimal6 = bigDecimal2;
        if ((i & 8) != 0) {
            bigDecimal3 = symbolHistoryDataItemApiModel.low;
        }
        BigDecimal bigDecimal7 = bigDecimal3;
        if ((i & 16) != 0) {
            bigDecimal4 = symbolHistoryDataItemApiModel.close;
        }
        BigDecimal bigDecimal8 = bigDecimal4;
        if ((i & 32) != 0) {
            j = symbolHistoryDataItemApiModel.volume;
        }
        return symbolHistoryDataItemApiModel.copy(str, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, j);
    }

    public final String component1() {
        return this.date;
    }

    public final BigDecimal component2() {
        return this.open;
    }

    public final BigDecimal component3() {
        return this.high;
    }

    public final BigDecimal component4() {
        return this.low;
    }

    public final BigDecimal component5() {
        return this.close;
    }

    public final long component6() {
        return this.volume;
    }

    public final SymbolHistoryDataItemApiModel copy(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, long j) {
        C41536l.m120489i(str, "date");
        C41536l.m120489i(bigDecimal, "open");
        C41536l.m120489i(bigDecimal2, "high");
        C41536l.m120489i(bigDecimal3, "low");
        C41536l.m120489i(bigDecimal4, "close");
        return new SymbolHistoryDataItemApiModel(str, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SymbolHistoryDataItemApiModel)) {
            return false;
        }
        SymbolHistoryDataItemApiModel symbolHistoryDataItemApiModel = (SymbolHistoryDataItemApiModel) obj;
        return C41536l.m120484d(this.date, symbolHistoryDataItemApiModel.date) && C41536l.m120484d(this.open, symbolHistoryDataItemApiModel.open) && C41536l.m120484d(this.high, symbolHistoryDataItemApiModel.high) && C41536l.m120484d(this.low, symbolHistoryDataItemApiModel.low) && C41536l.m120484d(this.close, symbolHistoryDataItemApiModel.close) && this.volume == symbolHistoryDataItemApiModel.volume;
    }

    public final BigDecimal getClose() {
        return this.close;
    }

    public final String getDate() {
        return this.date;
    }

    public final BigDecimal getHigh() {
        return this.high;
    }

    public final BigDecimal getLow() {
        return this.low;
    }

    public final BigDecimal getOpen() {
        return this.open;
    }

    public final long getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return (((((((((this.date.hashCode() * 31) + this.open.hashCode()) * 31) + this.high.hashCode()) * 31) + this.low.hashCode()) * 31) + this.close.hashCode()) * 31) + C7397t.m28148a(this.volume);
    }

    public String toString() {
        String str = this.date;
        BigDecimal bigDecimal = this.open;
        BigDecimal bigDecimal2 = this.high;
        BigDecimal bigDecimal3 = this.low;
        BigDecimal bigDecimal4 = this.close;
        long j = this.volume;
        return "SymbolHistoryDataItemApiModel(date=" + str + ", open=" + bigDecimal + ", high=" + bigDecimal2 + ", low=" + bigDecimal3 + ", close=" + bigDecimal4 + ", volume=" + j + ")";
    }
}
