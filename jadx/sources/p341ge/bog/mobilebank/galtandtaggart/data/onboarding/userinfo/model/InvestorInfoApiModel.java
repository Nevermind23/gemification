package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.InvestorInfoApiModel */
public final class InvestorInfoApiModel {
    private final Integer annualIncomeValue;

    public InvestorInfoApiModel(Integer num) {
        this.annualIncomeValue = num;
    }

    public static /* synthetic */ InvestorInfoApiModel copy$default(InvestorInfoApiModel investorInfoApiModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = investorInfoApiModel.annualIncomeValue;
        }
        return investorInfoApiModel.copy(num);
    }

    public final Integer component1() {
        return this.annualIncomeValue;
    }

    public final InvestorInfoApiModel copy(Integer num) {
        return new InvestorInfoApiModel(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestorInfoApiModel) && C41536l.m120484d(this.annualIncomeValue, ((InvestorInfoApiModel) obj).annualIncomeValue);
    }

    public final Integer getAnnualIncomeValue() {
        return this.annualIncomeValue;
    }

    public int hashCode() {
        Integer num = this.annualIncomeValue;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.annualIncomeValue;
        return "InvestorInfoApiModel(annualIncomeValue=" + num + ")";
    }
}
