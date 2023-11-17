package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.InvestmentProfileInfoApiModel */
public final class InvestmentProfileInfoApiModel {
    private final Integer annualIncome;

    public InvestmentProfileInfoApiModel(Integer num) {
        this.annualIncome = num;
    }

    public static /* synthetic */ InvestmentProfileInfoApiModel copy$default(InvestmentProfileInfoApiModel investmentProfileInfoApiModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = investmentProfileInfoApiModel.annualIncome;
        }
        return investmentProfileInfoApiModel.copy(num);
    }

    public final Integer component1() {
        return this.annualIncome;
    }

    public final InvestmentProfileInfoApiModel copy(Integer num) {
        return new InvestmentProfileInfoApiModel(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestmentProfileInfoApiModel) && C41536l.m120484d(this.annualIncome, ((InvestmentProfileInfoApiModel) obj).annualIncome);
    }

    public final Integer getAnnualIncome() {
        return this.annualIncome;
    }

    public int hashCode() {
        Integer num = this.annualIncome;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.annualIncome;
        return "InvestmentProfileInfoApiModel(annualIncome=" + num + ")";
    }
}
