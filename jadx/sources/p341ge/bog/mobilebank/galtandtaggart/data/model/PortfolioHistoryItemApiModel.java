package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.PortfolioHistoryItemApiModel */
public final class PortfolioHistoryItemApiModel {
    private final String date;
    private final BigDecimal equity;

    public PortfolioHistoryItemApiModel(String str, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "date");
        C41536l.m120489i(bigDecimal, "equity");
        this.date = str;
        this.equity = bigDecimal;
    }

    public static /* synthetic */ PortfolioHistoryItemApiModel copy$default(PortfolioHistoryItemApiModel portfolioHistoryItemApiModel, String str, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioHistoryItemApiModel.date;
        }
        if ((i & 2) != 0) {
            bigDecimal = portfolioHistoryItemApiModel.equity;
        }
        return portfolioHistoryItemApiModel.copy(str, bigDecimal);
    }

    public final String component1() {
        return this.date;
    }

    public final BigDecimal component2() {
        return this.equity;
    }

    public final PortfolioHistoryItemApiModel copy(String str, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "date");
        C41536l.m120489i(bigDecimal, "equity");
        return new PortfolioHistoryItemApiModel(str, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortfolioHistoryItemApiModel)) {
            return false;
        }
        PortfolioHistoryItemApiModel portfolioHistoryItemApiModel = (PortfolioHistoryItemApiModel) obj;
        return C41536l.m120484d(this.date, portfolioHistoryItemApiModel.date) && C41536l.m120484d(this.equity, portfolioHistoryItemApiModel.equity);
    }

    public final String getDate() {
        return this.date;
    }

    public final BigDecimal getEquity() {
        return this.equity;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.equity.hashCode();
    }

    public String toString() {
        String str = this.date;
        BigDecimal bigDecimal = this.equity;
        return "PortfolioHistoryItemApiModel(date=" + str + ", equity=" + bigDecimal + ")";
    }
}
