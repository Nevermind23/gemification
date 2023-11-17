package p341ge.bog.mobilebank.autoliabilityinsurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.data.model.LimitAmountApiModel */
public final class LimitAmountApiModel {
    private final Double firstMonthPremiumAmount;
    private final double limitAmount;
    private final double monthlyPremiumAmount;
    private final double premiumAmount;
    private final String premiumCcy;

    public LimitAmountApiModel(double d, double d2, String str, double d3, Double d4) {
        C41536l.m120489i(str, "premiumCcy");
        this.limitAmount = d;
        this.premiumAmount = d2;
        this.premiumCcy = str;
        this.monthlyPremiumAmount = d3;
        this.firstMonthPremiumAmount = d4;
    }

    public static /* synthetic */ LimitAmountApiModel copy$default(LimitAmountApiModel limitAmountApiModel, double d, double d2, String str, double d3, Double d4, int i, Object obj) {
        LimitAmountApiModel limitAmountApiModel2 = limitAmountApiModel;
        return limitAmountApiModel.copy((i & 1) != 0 ? limitAmountApiModel2.limitAmount : d, (i & 2) != 0 ? limitAmountApiModel2.premiumAmount : d2, (i & 4) != 0 ? limitAmountApiModel2.premiumCcy : str, (i & 8) != 0 ? limitAmountApiModel2.monthlyPremiumAmount : d3, (i & 16) != 0 ? limitAmountApiModel2.firstMonthPremiumAmount : d4);
    }

    public final double component1() {
        return this.limitAmount;
    }

    public final double component2() {
        return this.premiumAmount;
    }

    public final String component3() {
        return this.premiumCcy;
    }

    public final double component4() {
        return this.monthlyPremiumAmount;
    }

    public final Double component5() {
        return this.firstMonthPremiumAmount;
    }

    public final LimitAmountApiModel copy(double d, double d2, String str, double d3, Double d4) {
        C41536l.m120489i(str, "premiumCcy");
        return new LimitAmountApiModel(d, d2, str, d3, d4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitAmountApiModel)) {
            return false;
        }
        LimitAmountApiModel limitAmountApiModel = (LimitAmountApiModel) obj;
        return Double.compare(this.limitAmount, limitAmountApiModel.limitAmount) == 0 && Double.compare(this.premiumAmount, limitAmountApiModel.premiumAmount) == 0 && C41536l.m120484d(this.premiumCcy, limitAmountApiModel.premiumCcy) && Double.compare(this.monthlyPremiumAmount, limitAmountApiModel.monthlyPremiumAmount) == 0 && C41536l.m120484d(this.firstMonthPremiumAmount, limitAmountApiModel.firstMonthPremiumAmount);
    }

    public final Double getFirstMonthPremiumAmount() {
        return this.firstMonthPremiumAmount;
    }

    public final double getLimitAmount() {
        return this.limitAmount;
    }

    public final double getMonthlyPremiumAmount() {
        return this.monthlyPremiumAmount;
    }

    public final double getPremiumAmount() {
        return this.premiumAmount;
    }

    public final String getPremiumCcy() {
        return this.premiumCcy;
    }

    public int hashCode() {
        int a = ((((((Double.doubleToLongBits(this.limitAmount) * 31) + Double.doubleToLongBits(this.premiumAmount)) * 31) + this.premiumCcy.hashCode()) * 31) + Double.doubleToLongBits(this.monthlyPremiumAmount)) * 31;
        Double d = this.firstMonthPremiumAmount;
        return a + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        double d = this.limitAmount;
        double d2 = this.premiumAmount;
        String str = this.premiumCcy;
        double d3 = this.monthlyPremiumAmount;
        Double d4 = this.firstMonthPremiumAmount;
        return "LimitAmountApiModel(limitAmount=" + d + ", premiumAmount=" + d2 + ", premiumCcy=" + str + ", monthlyPremiumAmount=" + d3 + ", firstMonthPremiumAmount=" + d4 + ")";
    }
}
