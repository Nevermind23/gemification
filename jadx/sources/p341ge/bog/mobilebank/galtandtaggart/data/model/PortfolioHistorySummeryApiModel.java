package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.PortfolioHistorySummeryApiModel */
public final class PortfolioHistorySummeryApiModel {
    private final List<PortfolioHistoryItemApiModel> performance;

    public PortfolioHistorySummeryApiModel(List<PortfolioHistoryItemApiModel> list) {
        C41536l.m120489i(list, "performance");
        this.performance = list;
    }

    public static /* synthetic */ PortfolioHistorySummeryApiModel copy$default(PortfolioHistorySummeryApiModel portfolioHistorySummeryApiModel, List<PortfolioHistoryItemApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = portfolioHistorySummeryApiModel.performance;
        }
        return portfolioHistorySummeryApiModel.copy(list);
    }

    public final List<PortfolioHistoryItemApiModel> component1() {
        return this.performance;
    }

    public final PortfolioHistorySummeryApiModel copy(List<PortfolioHistoryItemApiModel> list) {
        C41536l.m120489i(list, "performance");
        return new PortfolioHistorySummeryApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PortfolioHistorySummeryApiModel) && C41536l.m120484d(this.performance, ((PortfolioHistorySummeryApiModel) obj).performance);
    }

    public final List<PortfolioHistoryItemApiModel> getPerformance() {
        return this.performance;
    }

    public int hashCode() {
        return this.performance.hashCode();
    }

    public String toString() {
        List<PortfolioHistoryItemApiModel> list = this.performance;
        return "PortfolioHistorySummeryApiModel(performance=" + list + ")";
    }
}
