package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.OnboardingListOfValuesApiModel */
public final class OnboardingListOfValuesApiModel {
    private final FundingSourcesApiModel additionalInfo;
    private final EmploymentInfoApiModel employmentInfo;
    private final InvestorInfoApiModel investorInfo;

    public OnboardingListOfValuesApiModel(EmploymentInfoApiModel employmentInfoApiModel, FundingSourcesApiModel fundingSourcesApiModel, InvestorInfoApiModel investorInfoApiModel) {
        C41536l.m120489i(employmentInfoApiModel, "employmentInfo");
        C41536l.m120489i(fundingSourcesApiModel, "additionalInfo");
        C41536l.m120489i(investorInfoApiModel, "investorInfo");
        this.employmentInfo = employmentInfoApiModel;
        this.additionalInfo = fundingSourcesApiModel;
        this.investorInfo = investorInfoApiModel;
    }

    public static /* synthetic */ OnboardingListOfValuesApiModel copy$default(OnboardingListOfValuesApiModel onboardingListOfValuesApiModel, EmploymentInfoApiModel employmentInfoApiModel, FundingSourcesApiModel fundingSourcesApiModel, InvestorInfoApiModel investorInfoApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            employmentInfoApiModel = onboardingListOfValuesApiModel.employmentInfo;
        }
        if ((i & 2) != 0) {
            fundingSourcesApiModel = onboardingListOfValuesApiModel.additionalInfo;
        }
        if ((i & 4) != 0) {
            investorInfoApiModel = onboardingListOfValuesApiModel.investorInfo;
        }
        return onboardingListOfValuesApiModel.copy(employmentInfoApiModel, fundingSourcesApiModel, investorInfoApiModel);
    }

    public final EmploymentInfoApiModel component1() {
        return this.employmentInfo;
    }

    public final FundingSourcesApiModel component2() {
        return this.additionalInfo;
    }

    public final InvestorInfoApiModel component3() {
        return this.investorInfo;
    }

    public final OnboardingListOfValuesApiModel copy(EmploymentInfoApiModel employmentInfoApiModel, FundingSourcesApiModel fundingSourcesApiModel, InvestorInfoApiModel investorInfoApiModel) {
        C41536l.m120489i(employmentInfoApiModel, "employmentInfo");
        C41536l.m120489i(fundingSourcesApiModel, "additionalInfo");
        C41536l.m120489i(investorInfoApiModel, "investorInfo");
        return new OnboardingListOfValuesApiModel(employmentInfoApiModel, fundingSourcesApiModel, investorInfoApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingListOfValuesApiModel)) {
            return false;
        }
        OnboardingListOfValuesApiModel onboardingListOfValuesApiModel = (OnboardingListOfValuesApiModel) obj;
        return C41536l.m120484d(this.employmentInfo, onboardingListOfValuesApiModel.employmentInfo) && C41536l.m120484d(this.additionalInfo, onboardingListOfValuesApiModel.additionalInfo) && C41536l.m120484d(this.investorInfo, onboardingListOfValuesApiModel.investorInfo);
    }

    public final FundingSourcesApiModel getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final EmploymentInfoApiModel getEmploymentInfo() {
        return this.employmentInfo;
    }

    public final InvestorInfoApiModel getInvestorInfo() {
        return this.investorInfo;
    }

    public int hashCode() {
        return (((this.employmentInfo.hashCode() * 31) + this.additionalInfo.hashCode()) * 31) + this.investorInfo.hashCode();
    }

    public String toString() {
        EmploymentInfoApiModel employmentInfoApiModel = this.employmentInfo;
        FundingSourcesApiModel fundingSourcesApiModel = this.additionalInfo;
        InvestorInfoApiModel investorInfoApiModel = this.investorInfo;
        return "OnboardingListOfValuesApiModel(employmentInfo=" + employmentInfoApiModel + ", additionalInfo=" + fundingSourcesApiModel + ", investorInfo=" + investorInfoApiModel + ")";
    }
}
