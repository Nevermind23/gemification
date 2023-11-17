package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.InterestRateEntity */
public final class InterestRateEntity {
    private final double effectiveInterestRate;
    private final Boolean hasSpreadRate;
    private final double interestRate;
    private final Double possibleProfit;
    private final Double spreadRate;

    public InterestRateEntity(double d, double d2, Double d3, Double d4, Boolean bool) {
        this.interestRate = d;
        this.effectiveInterestRate = d2;
        this.possibleProfit = d3;
        this.spreadRate = d4;
        this.hasSpreadRate = bool;
    }

    public static /* synthetic */ InterestRateEntity copy$default(InterestRateEntity interestRateEntity, double d, double d2, Double d3, Double d4, Boolean bool, int i, Object obj) {
        InterestRateEntity interestRateEntity2 = interestRateEntity;
        return interestRateEntity.copy((i & 1) != 0 ? interestRateEntity2.interestRate : d, (i & 2) != 0 ? interestRateEntity2.effectiveInterestRate : d2, (i & 4) != 0 ? interestRateEntity2.possibleProfit : d3, (i & 8) != 0 ? interestRateEntity2.spreadRate : d4, (i & 16) != 0 ? interestRateEntity2.hasSpreadRate : bool);
    }

    public final double component1() {
        return this.interestRate;
    }

    public final double component2() {
        return this.effectiveInterestRate;
    }

    public final Double component3() {
        return this.possibleProfit;
    }

    public final Double component4() {
        return this.spreadRate;
    }

    public final Boolean component5() {
        return this.hasSpreadRate;
    }

    public final InterestRateEntity copy(double d, double d2, Double d3, Double d4, Boolean bool) {
        return new InterestRateEntity(d, d2, d3, d4, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestRateEntity)) {
            return false;
        }
        InterestRateEntity interestRateEntity = (InterestRateEntity) obj;
        return Double.compare(this.interestRate, interestRateEntity.interestRate) == 0 && Double.compare(this.effectiveInterestRate, interestRateEntity.effectiveInterestRate) == 0 && C41536l.m120484d(this.possibleProfit, interestRateEntity.possibleProfit) && C41536l.m120484d(this.spreadRate, interestRateEntity.spreadRate) && C41536l.m120484d(this.hasSpreadRate, interestRateEntity.hasSpreadRate);
    }

    public final double getEffectiveInterestRate() {
        return this.effectiveInterestRate;
    }

    public final Boolean getHasSpreadRate() {
        return this.hasSpreadRate;
    }

    public final double getInterestRate() {
        return this.interestRate;
    }

    public final Double getPossibleProfit() {
        return this.possibleProfit;
    }

    public final Double getSpreadRate() {
        return this.spreadRate;
    }

    public int hashCode() {
        int a = ((Double.doubleToLongBits(this.interestRate) * 31) + Double.doubleToLongBits(this.effectiveInterestRate)) * 31;
        Double d = this.possibleProfit;
        int i = 0;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.spreadRate;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.hasSpreadRate;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        double d = this.interestRate;
        double d2 = this.effectiveInterestRate;
        Double d3 = this.possibleProfit;
        Double d4 = this.spreadRate;
        Boolean bool = this.hasSpreadRate;
        return "InterestRateEntity(interestRate=" + d + ", effectiveInterestRate=" + d2 + ", possibleProfit=" + d3 + ", spreadRate=" + d4 + ", hasSpreadRate=" + bool + ")";
    }
}
