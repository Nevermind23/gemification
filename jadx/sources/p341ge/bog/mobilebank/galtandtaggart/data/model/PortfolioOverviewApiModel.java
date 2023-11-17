package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.PortfolioOverviewApiModel */
public final class PortfolioOverviewApiModel {
    private final BigDecimal bodCashAvailableForTrade;
    private final Double bodEquityValue;
    private final BigDecimal cashAvailableForTrade;
    private final String dwAccountNo;
    private final Double equityValue;
    private final Double previousDayEquityValue;
    private final String regDate;
    private final BigDecimal totalUnrealizedPL;
    private final BigDecimal totalUnrealizedPLPercent;

    public PortfolioOverviewApiModel(Double d, Double d2, BigDecimal bigDecimal, String str, String str2, BigDecimal bigDecimal2, Double d3, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        C41536l.m120489i(str, "regDate");
        this.equityValue = d;
        this.bodEquityValue = d2;
        this.cashAvailableForTrade = bigDecimal;
        this.regDate = str;
        this.dwAccountNo = str2;
        this.bodCashAvailableForTrade = bigDecimal2;
        this.previousDayEquityValue = d3;
        this.totalUnrealizedPL = bigDecimal3;
        this.totalUnrealizedPLPercent = bigDecimal4;
    }

    public static /* synthetic */ PortfolioOverviewApiModel copy$default(PortfolioOverviewApiModel portfolioOverviewApiModel, Double d, Double d2, BigDecimal bigDecimal, String str, String str2, BigDecimal bigDecimal2, Double d3, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i, Object obj) {
        PortfolioOverviewApiModel portfolioOverviewApiModel2 = portfolioOverviewApiModel;
        int i2 = i;
        return portfolioOverviewApiModel.copy((i2 & 1) != 0 ? portfolioOverviewApiModel2.equityValue : d, (i2 & 2) != 0 ? portfolioOverviewApiModel2.bodEquityValue : d2, (i2 & 4) != 0 ? portfolioOverviewApiModel2.cashAvailableForTrade : bigDecimal, (i2 & 8) != 0 ? portfolioOverviewApiModel2.regDate : str, (i2 & 16) != 0 ? portfolioOverviewApiModel2.dwAccountNo : str2, (i2 & 32) != 0 ? portfolioOverviewApiModel2.bodCashAvailableForTrade : bigDecimal2, (i2 & 64) != 0 ? portfolioOverviewApiModel2.previousDayEquityValue : d3, (i2 & 128) != 0 ? portfolioOverviewApiModel2.totalUnrealizedPL : bigDecimal3, (i2 & C11398b.f33139r) != 0 ? portfolioOverviewApiModel2.totalUnrealizedPLPercent : bigDecimal4);
    }

    public final Double component1() {
        return this.equityValue;
    }

    public final Double component2() {
        return this.bodEquityValue;
    }

    public final BigDecimal component3() {
        return this.cashAvailableForTrade;
    }

    public final String component4() {
        return this.regDate;
    }

    public final String component5() {
        return this.dwAccountNo;
    }

    public final BigDecimal component6() {
        return this.bodCashAvailableForTrade;
    }

    public final Double component7() {
        return this.previousDayEquityValue;
    }

    public final BigDecimal component8() {
        return this.totalUnrealizedPL;
    }

    public final BigDecimal component9() {
        return this.totalUnrealizedPLPercent;
    }

    public final PortfolioOverviewApiModel copy(Double d, Double d2, BigDecimal bigDecimal, String str, String str2, BigDecimal bigDecimal2, Double d3, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        C41536l.m120489i(str, "regDate");
        return new PortfolioOverviewApiModel(d, d2, bigDecimal, str, str2, bigDecimal2, d3, bigDecimal3, bigDecimal4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortfolioOverviewApiModel)) {
            return false;
        }
        PortfolioOverviewApiModel portfolioOverviewApiModel = (PortfolioOverviewApiModel) obj;
        return C41536l.m120484d(this.equityValue, portfolioOverviewApiModel.equityValue) && C41536l.m120484d(this.bodEquityValue, portfolioOverviewApiModel.bodEquityValue) && C41536l.m120484d(this.cashAvailableForTrade, portfolioOverviewApiModel.cashAvailableForTrade) && C41536l.m120484d(this.regDate, portfolioOverviewApiModel.regDate) && C41536l.m120484d(this.dwAccountNo, portfolioOverviewApiModel.dwAccountNo) && C41536l.m120484d(this.bodCashAvailableForTrade, portfolioOverviewApiModel.bodCashAvailableForTrade) && C41536l.m120484d(this.previousDayEquityValue, portfolioOverviewApiModel.previousDayEquityValue) && C41536l.m120484d(this.totalUnrealizedPL, portfolioOverviewApiModel.totalUnrealizedPL) && C41536l.m120484d(this.totalUnrealizedPLPercent, portfolioOverviewApiModel.totalUnrealizedPLPercent);
    }

    public final BigDecimal getBodCashAvailableForTrade() {
        return this.bodCashAvailableForTrade;
    }

    public final Double getBodEquityValue() {
        return this.bodEquityValue;
    }

    public final BigDecimal getCashAvailableForTrade() {
        return this.cashAvailableForTrade;
    }

    public final String getDwAccountNo() {
        return this.dwAccountNo;
    }

    public final Double getEquityValue() {
        return this.equityValue;
    }

    public final Double getPreviousDayEquityValue() {
        return this.previousDayEquityValue;
    }

    public final String getRegDate() {
        return this.regDate;
    }

    public final BigDecimal getTotalUnrealizedPL() {
        return this.totalUnrealizedPL;
    }

    public final BigDecimal getTotalUnrealizedPLPercent() {
        return this.totalUnrealizedPLPercent;
    }

    public int hashCode() {
        Double d = this.equityValue;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.bodEquityValue;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        BigDecimal bigDecimal = this.cashAvailableForTrade;
        int hashCode3 = (((hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.regDate.hashCode()) * 31;
        String str = this.dwAccountNo;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.bodCashAvailableForTrade;
        int hashCode5 = (hashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Double d3 = this.previousDayEquityValue;
        int hashCode6 = (hashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.totalUnrealizedPL;
        int hashCode7 = (hashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.totalUnrealizedPLPercent;
        if (bigDecimal4 != null) {
            i = bigDecimal4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        Double d = this.equityValue;
        Double d2 = this.bodEquityValue;
        BigDecimal bigDecimal = this.cashAvailableForTrade;
        String str = this.regDate;
        String str2 = this.dwAccountNo;
        BigDecimal bigDecimal2 = this.bodCashAvailableForTrade;
        Double d3 = this.previousDayEquityValue;
        BigDecimal bigDecimal3 = this.totalUnrealizedPL;
        BigDecimal bigDecimal4 = this.totalUnrealizedPLPercent;
        return "PortfolioOverviewApiModel(equityValue=" + d + ", bodEquityValue=" + d2 + ", cashAvailableForTrade=" + bigDecimal + ", regDate=" + str + ", dwAccountNo=" + str2 + ", bodCashAvailableForTrade=" + bigDecimal2 + ", previousDayEquityValue=" + d3 + ", totalUnrealizedPL=" + bigDecimal3 + ", totalUnrealizedPLPercent=" + bigDecimal4 + ")";
    }
}
