package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.PortfolioOverviewApiModel */
public final class PortfolioOverviewApiModel {
    private final BigDecimal bodEquityValue;
    private final BigDecimal cashAvailableForTrade;
    private final BigDecimal equityValue;
    private final String regDate;

    public PortfolioOverviewApiModel(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str) {
        C41536l.m120489i(str, "regDate");
        this.equityValue = bigDecimal;
        this.bodEquityValue = bigDecimal2;
        this.cashAvailableForTrade = bigDecimal3;
        this.regDate = str;
    }

    public static /* synthetic */ PortfolioOverviewApiModel copy$default(PortfolioOverviewApiModel portfolioOverviewApiModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = portfolioOverviewApiModel.equityValue;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = portfolioOverviewApiModel.bodEquityValue;
        }
        if ((i & 4) != 0) {
            bigDecimal3 = portfolioOverviewApiModel.cashAvailableForTrade;
        }
        if ((i & 8) != 0) {
            str = portfolioOverviewApiModel.regDate;
        }
        return portfolioOverviewApiModel.copy(bigDecimal, bigDecimal2, bigDecimal3, str);
    }

    public final BigDecimal component1() {
        return this.equityValue;
    }

    public final BigDecimal component2() {
        return this.bodEquityValue;
    }

    public final BigDecimal component3() {
        return this.cashAvailableForTrade;
    }

    public final String component4() {
        return this.regDate;
    }

    public final PortfolioOverviewApiModel copy(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str) {
        C41536l.m120489i(str, "regDate");
        return new PortfolioOverviewApiModel(bigDecimal, bigDecimal2, bigDecimal3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortfolioOverviewApiModel)) {
            return false;
        }
        PortfolioOverviewApiModel portfolioOverviewApiModel = (PortfolioOverviewApiModel) obj;
        return C41536l.m120484d(this.equityValue, portfolioOverviewApiModel.equityValue) && C41536l.m120484d(this.bodEquityValue, portfolioOverviewApiModel.bodEquityValue) && C41536l.m120484d(this.cashAvailableForTrade, portfolioOverviewApiModel.cashAvailableForTrade) && C41536l.m120484d(this.regDate, portfolioOverviewApiModel.regDate);
    }

    public final BigDecimal getBodEquityValue() {
        return this.bodEquityValue;
    }

    public final BigDecimal getCashAvailableForTrade() {
        return this.cashAvailableForTrade;
    }

    public final BigDecimal getEquityValue() {
        return this.equityValue;
    }

    public final String getRegDate() {
        return this.regDate;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.equityValue;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.bodEquityValue;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.cashAvailableForTrade;
        if (bigDecimal3 != null) {
            i = bigDecimal3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.regDate.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.equityValue;
        BigDecimal bigDecimal2 = this.bodEquityValue;
        BigDecimal bigDecimal3 = this.cashAvailableForTrade;
        String str = this.regDate;
        return "PortfolioOverviewApiModel(equityValue=" + bigDecimal + ", bodEquityValue=" + bigDecimal2 + ", cashAvailableForTrade=" + bigDecimal3 + ", regDate=" + str + ")";
    }
}
