package ke0;

import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.model.CashDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioClientApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioClientItemApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioHistoryItemApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioHistorySummeryApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioOverviewApiModel;
import xe0.C29746d;
import xe0.C29748f;
import xe0.C29751i;
import xe0.C29753k;

/* renamed from: ke0.e */
public final class C25717e {

    /* renamed from: a */
    private final SimpleDateFormat f65484a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");

    /* renamed from: a */
    public final List mo64285a(PortfolioClientApiModel portfolioClientApiModel) {
        C41536l.m120489i(portfolioClientApiModel, "portfolioClientApiModel");
        List<PortfolioClientItemApiModel> equityPositions = portfolioClientApiModel.getEquityPositions();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(equityPositions, 10));
        for (PortfolioClientItemApiModel portfolioClientItemApiModel : equityPositions) {
            String symbol = portfolioClientItemApiModel.getSymbol();
            String securityName = portfolioClientItemApiModel.getSecurityName();
            String ccy = portfolioClientItemApiModel.getCcy();
            String P = C32343x.m95408P(portfolioClientItemApiModel.getMarketValue(), portfolioClientItemApiModel.getCcy());
            BigDecimal openQty = portfolioClientItemApiModel.getOpenQty();
            BigDecimal unrealizedDayPL = portfolioClientItemApiModel.getUnrealizedDayPL();
            if (unrealizedDayPL == null) {
                unrealizedDayPL = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal = unrealizedDayPL;
            C41536l.m120488h(bigDecimal, "it.unrealizedDayPL ?: BigDecimal.ZERO");
            BigDecimal unrealizedDayPLPercent = portfolioClientItemApiModel.getUnrealizedDayPLPercent();
            if (unrealizedDayPLPercent == null) {
                unrealizedDayPLPercent = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal2 = unrealizedDayPLPercent;
            C41536l.m120488h(bigDecimal2, "it.unrealizedDayPLPercent ?: BigDecimal.ZERO");
            BigDecimal unrealizedPL = portfolioClientItemApiModel.getUnrealizedPL();
            if (unrealizedPL == null) {
                unrealizedPL = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal3 = unrealizedPL;
            C41536l.m120488h(bigDecimal3, "it.unrealizedPL ?: BigDecimal.ZERO");
            BigDecimal unrealizedPLPercent = portfolioClientItemApiModel.getUnrealizedPLPercent();
            if (unrealizedPLPercent == null) {
                unrealizedPLPercent = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal4 = unrealizedPLPercent;
            C41536l.m120488h(bigDecimal4, "it.unrealizedPLPercent ?: BigDecimal.ZERO");
            arrayList.add(new C29748f(symbol, securityName, ccy, P, openQty, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, portfolioClientItemApiModel.getImage()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo64286b(PortfolioHistorySummeryApiModel portfolioHistorySummeryApiModel) {
        Date date;
        C41536l.m120489i(portfolioHistorySummeryApiModel, "portfolioHistorySummeryApiModel");
        List<PortfolioHistoryItemApiModel> performance = portfolioHistorySummeryApiModel.getPerformance();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(performance, 10));
        for (PortfolioHistoryItemApiModel portfolioHistoryItemApiModel : performance) {
            try {
                date = this.f65484a.parse(portfolioHistoryItemApiModel.getDate());
            } catch (Exception unused) {
                date = new Date();
            }
            if (date == null) {
                date = new Date();
            }
            String bigDecimal = portfolioHistoryItemApiModel.getEquity().toString();
            C41536l.m120488h(bigDecimal, "it.equity.toString()");
            arrayList.add(new C29753k(date, bigDecimal));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C29746d mo64287c(CashDataApiModel cashDataApiModel) {
        C41536l.m120489i(cashDataApiModel, "cashDataApiModel");
        BigDecimal cashSettlementTotalAmount = cashDataApiModel.getCash().getCashSettlementTotalAmount();
        if (cashSettlementTotalAmount == null) {
            cashSettlementTotalAmount = BigDecimal.valueOf(0);
            C41536l.m120488h(cashSettlementTotalAmount, "valueOf(this.toLong())");
        }
        BigDecimal add = cashSettlementTotalAmount.add(cashDataApiModel.getPayments().getBuyingPower().getPendingDepositsAmountAvailable());
        C41536l.m120488h(add, "this.add(other)");
        BigDecimal cashAvailableForWithdrawal = cashDataApiModel.getCash().getCashAvailableForWithdrawal();
        BigDecimal cashAvailableForTrade = cashDataApiModel.getCash().getCashAvailableForTrade();
        BigDecimal pendingWithdrawalsAmount = cashDataApiModel.getCash().getPendingWithdrawalsAmount();
        if (pendingWithdrawalsAmount == null) {
            pendingWithdrawalsAmount = new BigDecimal(0);
        }
        BigDecimal bigDecimal = pendingWithdrawalsAmount;
        BigDecimal accruedCommission = cashDataApiModel.getCash().getAccruedCommission();
        if (accruedCommission == null) {
            accruedCommission = new BigDecimal(0);
        }
        BigDecimal abs = accruedCommission.abs();
        C41536l.m120488h(abs, "cash.accruedCommission ?: BigDecimal(0)).abs()");
        return new C29746d(add, cashAvailableForWithdrawal, cashAvailableForTrade, bigDecimal, abs);
    }

    /* renamed from: d */
    public final C29751i mo64288d(PortfolioOverviewApiModel portfolioOverviewApiModel) {
        double d;
        double d2;
        boolean z;
        BigDecimal bigDecimal;
        C41536l.m120489i(portfolioOverviewApiModel, "portfolioOverview");
        Double equityValue = portfolioOverviewApiModel.getEquityValue();
        if (equityValue != null) {
            d = equityValue.doubleValue();
        } else {
            d = 0.0d;
        }
        Double previousDayEquityValue = portfolioOverviewApiModel.getPreviousDayEquityValue();
        if (previousDayEquityValue != null) {
            d2 = previousDayEquityValue.doubleValue();
        } else {
            d2 = 0.0d;
        }
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(d - d2));
        if (d2 == Utils.DOUBLE_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bigDecimal = new BigDecimal(0);
        } else {
            bigDecimal = C25721i.m80955a(new BigDecimal(String.valueOf(d)), new BigDecimal(String.valueOf(d2)));
        }
        BigDecimal bigDecimal4 = bigDecimal;
        BigDecimal totalUnrealizedPL = portfolioOverviewApiModel.getTotalUnrealizedPL();
        if (totalUnrealizedPL == null) {
            totalUnrealizedPL = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal5 = totalUnrealizedPL;
        C41536l.m120488h(bigDecimal5, "totalUnrealizedPL ?: BigDecimal.ZERO");
        BigDecimal totalUnrealizedPLPercent = portfolioOverviewApiModel.getTotalUnrealizedPLPercent();
        if (totalUnrealizedPLPercent == null) {
            totalUnrealizedPLPercent = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal6 = totalUnrealizedPLPercent;
        C41536l.m120488h(bigDecimal6, "totalUnrealizedPLPercent ?: BigDecimal.ZERO");
        BigDecimal cashAvailableForTrade = portfolioOverviewApiModel.getCashAvailableForTrade();
        if (cashAvailableForTrade == null) {
            cashAvailableForTrade = new BigDecimal(0);
        }
        BigDecimal bigDecimal7 = cashAvailableForTrade;
        String regDate = portfolioOverviewApiModel.getRegDate();
        String dwAccountNo = portfolioOverviewApiModel.getDwAccountNo();
        if (dwAccountNo == null) {
            dwAccountNo = "";
        }
        return new C29751i(bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, regDate, dwAccountNo);
    }

    /* renamed from: e */
    public final BigDecimal mo64289e(PortfolioClientApiModel portfolioClientApiModel) {
        C41536l.m120489i(portfolioClientApiModel, "portfolioClientApiModel");
        BigDecimal equityValue = portfolioClientApiModel.getEquityValue();
        if (equityValue != null) {
            return equityValue;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        C41536l.m120488h(bigDecimal, "ZERO");
        return bigDecimal;
    }
}
