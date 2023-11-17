package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.InvestorPortfileInfoPostApiModel */
public final class InvestorPortfileInfoPostApiModel {
    private final float annualIncome;

    public InvestorPortfileInfoPostApiModel(float f) {
        this.annualIncome = f;
    }

    public static /* synthetic */ InvestorPortfileInfoPostApiModel copy$default(InvestorPortfileInfoPostApiModel investorPortfileInfoPostApiModel, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = investorPortfileInfoPostApiModel.annualIncome;
        }
        return investorPortfileInfoPostApiModel.copy(f);
    }

    public final float component1() {
        return this.annualIncome;
    }

    public final InvestorPortfileInfoPostApiModel copy(float f) {
        return new InvestorPortfileInfoPostApiModel(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestorPortfileInfoPostApiModel) && Float.compare(this.annualIncome, ((InvestorPortfileInfoPostApiModel) obj).annualIncome) == 0;
    }

    public final float getAnnualIncome() {
        return this.annualIncome;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.annualIncome);
    }

    public String toString() {
        float f = this.annualIncome;
        return "InvestorPortfileInfoPostApiModel(annualIncome=" + f + ")";
    }
}
