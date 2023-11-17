package p341ge.bog.mobilebank.products.data.mapper;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.model.PortfolioOverviewApiModel;
import xy0.C39950n;

/* renamed from: ge.bog.mobilebank.products.data.mapper.GTMapper */
public final class GTMapper {
    public final C39950n convert(PortfolioOverviewApiModel portfolioOverviewApiModel) {
        C41536l.m120489i(portfolioOverviewApiModel, "overView");
        BigDecimal equityValue = portfolioOverviewApiModel.getEquityValue();
        if (equityValue == null) {
            equityValue = BigDecimal.valueOf(0);
            C41536l.m120488h(equityValue, "valueOf(this.toLong())");
        }
        BigDecimal cashAvailableForTrade = portfolioOverviewApiModel.getCashAvailableForTrade();
        if (cashAvailableForTrade == null) {
            cashAvailableForTrade = BigDecimal.valueOf(0);
            C41536l.m120488h(cashAvailableForTrade, "valueOf(this.toLong())");
        }
        BigDecimal add = equityValue.add(cashAvailableForTrade);
        C41536l.m120488h(add, "this.add(other)");
        return new C39950n(add, "$");
    }
}
