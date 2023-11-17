package p341ge.bog.mobilebank.loanactivation.data.entity.loandecision;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loanactivation.data.entity.loandecision.LimitLoanDecisionApiModel */
public final class LimitLoanDecisionApiModel {
    private final DecisionDetailsApiModel details;
    private final List<Double> loanAmounts;
    private final List<ParamInfoApiModel> paramInfo;
    private final List<ProviderInfoApiModel> providerInfo;
    private final List<RefinanceInfoApiModel> refinanceInfo;
    private final Integer responseCode;
    private final List<ScheduleInfoApiModel> scheduleInfo;
    private final SummaryApiModel summary;

    public LimitLoanDecisionApiModel(DecisionDetailsApiModel decisionDetailsApiModel, SummaryApiModel summaryApiModel, List<Double> list, List<RefinanceInfoApiModel> list2, List<ParamInfoApiModel> list3, List<ScheduleInfoApiModel> list4, List<ProviderInfoApiModel> list5, Integer num) {
        C41536l.m120489i(decisionDetailsApiModel, "details");
        C41536l.m120489i(summaryApiModel, "summary");
        this.details = decisionDetailsApiModel;
        this.summary = summaryApiModel;
        this.loanAmounts = list;
        this.refinanceInfo = list2;
        this.paramInfo = list3;
        this.scheduleInfo = list4;
        this.providerInfo = list5;
        this.responseCode = num;
    }

    public static /* synthetic */ LimitLoanDecisionApiModel copy$default(LimitLoanDecisionApiModel limitLoanDecisionApiModel, DecisionDetailsApiModel decisionDetailsApiModel, SummaryApiModel summaryApiModel, List list, List list2, List list3, List list4, List list5, Integer num, int i, Object obj) {
        LimitLoanDecisionApiModel limitLoanDecisionApiModel2 = limitLoanDecisionApiModel;
        int i2 = i;
        return limitLoanDecisionApiModel.copy((i2 & 1) != 0 ? limitLoanDecisionApiModel2.details : decisionDetailsApiModel, (i2 & 2) != 0 ? limitLoanDecisionApiModel2.summary : summaryApiModel, (i2 & 4) != 0 ? limitLoanDecisionApiModel2.loanAmounts : list, (i2 & 8) != 0 ? limitLoanDecisionApiModel2.refinanceInfo : list2, (i2 & 16) != 0 ? limitLoanDecisionApiModel2.paramInfo : list3, (i2 & 32) != 0 ? limitLoanDecisionApiModel2.scheduleInfo : list4, (i2 & 64) != 0 ? limitLoanDecisionApiModel2.providerInfo : list5, (i2 & 128) != 0 ? limitLoanDecisionApiModel2.responseCode : num);
    }

    public final DecisionDetailsApiModel component1() {
        return this.details;
    }

    public final SummaryApiModel component2() {
        return this.summary;
    }

    public final List<Double> component3() {
        return this.loanAmounts;
    }

    public final List<RefinanceInfoApiModel> component4() {
        return this.refinanceInfo;
    }

    public final List<ParamInfoApiModel> component5() {
        return this.paramInfo;
    }

    public final List<ScheduleInfoApiModel> component6() {
        return this.scheduleInfo;
    }

    public final List<ProviderInfoApiModel> component7() {
        return this.providerInfo;
    }

    public final Integer component8() {
        return this.responseCode;
    }

    public final LimitLoanDecisionApiModel copy(DecisionDetailsApiModel decisionDetailsApiModel, SummaryApiModel summaryApiModel, List<Double> list, List<RefinanceInfoApiModel> list2, List<ParamInfoApiModel> list3, List<ScheduleInfoApiModel> list4, List<ProviderInfoApiModel> list5, Integer num) {
        C41536l.m120489i(decisionDetailsApiModel, "details");
        C41536l.m120489i(summaryApiModel, "summary");
        return new LimitLoanDecisionApiModel(decisionDetailsApiModel, summaryApiModel, list, list2, list3, list4, list5, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitLoanDecisionApiModel)) {
            return false;
        }
        LimitLoanDecisionApiModel limitLoanDecisionApiModel = (LimitLoanDecisionApiModel) obj;
        return C41536l.m120484d(this.details, limitLoanDecisionApiModel.details) && C41536l.m120484d(this.summary, limitLoanDecisionApiModel.summary) && C41536l.m120484d(this.loanAmounts, limitLoanDecisionApiModel.loanAmounts) && C41536l.m120484d(this.refinanceInfo, limitLoanDecisionApiModel.refinanceInfo) && C41536l.m120484d(this.paramInfo, limitLoanDecisionApiModel.paramInfo) && C41536l.m120484d(this.scheduleInfo, limitLoanDecisionApiModel.scheduleInfo) && C41536l.m120484d(this.providerInfo, limitLoanDecisionApiModel.providerInfo) && C41536l.m120484d(this.responseCode, limitLoanDecisionApiModel.responseCode);
    }

    public final DecisionDetailsApiModel getDetails() {
        return this.details;
    }

    public final List<Double> getLoanAmounts() {
        return this.loanAmounts;
    }

    public final List<ParamInfoApiModel> getParamInfo() {
        return this.paramInfo;
    }

    public final List<ProviderInfoApiModel> getProviderInfo() {
        return this.providerInfo;
    }

    public final List<RefinanceInfoApiModel> getRefinanceInfo() {
        return this.refinanceInfo;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public final List<ScheduleInfoApiModel> getScheduleInfo() {
        return this.scheduleInfo;
    }

    public final SummaryApiModel getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = ((this.details.hashCode() * 31) + this.summary.hashCode()) * 31;
        List<Double> list = this.loanAmounts;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<RefinanceInfoApiModel> list2 = this.refinanceInfo;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ParamInfoApiModel> list3 = this.paramInfo;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ScheduleInfoApiModel> list4 = this.scheduleInfo;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<ProviderInfoApiModel> list5 = this.providerInfo;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num = this.responseCode;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        DecisionDetailsApiModel decisionDetailsApiModel = this.details;
        SummaryApiModel summaryApiModel = this.summary;
        List<Double> list = this.loanAmounts;
        List<RefinanceInfoApiModel> list2 = this.refinanceInfo;
        List<ParamInfoApiModel> list3 = this.paramInfo;
        List<ScheduleInfoApiModel> list4 = this.scheduleInfo;
        List<ProviderInfoApiModel> list5 = this.providerInfo;
        Integer num = this.responseCode;
        return "LimitLoanDecisionApiModel(details=" + decisionDetailsApiModel + ", summary=" + summaryApiModel + ", loanAmounts=" + list + ", refinanceInfo=" + list2 + ", paramInfo=" + list3 + ", scheduleInfo=" + list4 + ", providerInfo=" + list5 + ", responseCode=" + num + ")";
    }
}
