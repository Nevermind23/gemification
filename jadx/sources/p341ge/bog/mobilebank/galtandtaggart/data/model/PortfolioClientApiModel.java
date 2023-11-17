package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.PortfolioClientApiModel */
public final class PortfolioClientApiModel {
    private final List<PortfolioClientItemApiModel> equityPositions;
    private final BigDecimal equityValue;

    public PortfolioClientApiModel(BigDecimal bigDecimal, List<PortfolioClientItemApiModel> list) {
        C41536l.m120489i(list, "equityPositions");
        this.equityValue = bigDecimal;
        this.equityPositions = list;
    }

    public static /* synthetic */ PortfolioClientApiModel copy$default(PortfolioClientApiModel portfolioClientApiModel, BigDecimal bigDecimal, List<PortfolioClientItemApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = portfolioClientApiModel.equityValue;
        }
        if ((i & 2) != 0) {
            list = portfolioClientApiModel.equityPositions;
        }
        return portfolioClientApiModel.copy(bigDecimal, list);
    }

    public final BigDecimal component1() {
        return this.equityValue;
    }

    public final List<PortfolioClientItemApiModel> component2() {
        return this.equityPositions;
    }

    public final PortfolioClientApiModel copy(BigDecimal bigDecimal, List<PortfolioClientItemApiModel> list) {
        C41536l.m120489i(list, "equityPositions");
        return new PortfolioClientApiModel(bigDecimal, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortfolioClientApiModel)) {
            return false;
        }
        PortfolioClientApiModel portfolioClientApiModel = (PortfolioClientApiModel) obj;
        return C41536l.m120484d(this.equityValue, portfolioClientApiModel.equityValue) && C41536l.m120484d(this.equityPositions, portfolioClientApiModel.equityPositions);
    }

    public final List<PortfolioClientItemApiModel> getEquityPositions() {
        return this.equityPositions;
    }

    public final BigDecimal getEquityValue() {
        return this.equityValue;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.equityValue;
        return ((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.equityPositions.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.equityValue;
        List<PortfolioClientItemApiModel> list = this.equityPositions;
        return "PortfolioClientApiModel(equityValue=" + bigDecimal + ", equityPositions=" + list + ")";
    }
}
