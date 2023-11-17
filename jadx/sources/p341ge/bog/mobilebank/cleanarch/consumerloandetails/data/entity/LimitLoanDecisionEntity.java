package p341ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.LimitLoanRefinanceInfo;
import p341ge.bog.mobilebank.model.offers.LoanDecisionParameter;
import p341ge.bog.mobilebank.model.offers.ScheduleInfo;
import p341ge.bog.mobilebank.model.offers.Summary;
import p798jr.C25481a;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity.LimitLoanDecisionEntity */
public final class LimitLoanDecisionEntity {
    private final LimitLoanDecisionDetails details;
    private final List<BigDecimal> loanAmounts;
    private final List<LoanDecisionParameter> paramInfo;
    private final List<ProviderInfoEntity> providerInfo;
    private final List<LimitLoanRefinanceInfo> refinanceInfo;
    private final int responseCode;
    private final List<ScheduleInfo> scheduleInfo;
    private final Summary summary;

    public LimitLoanDecisionEntity(LimitLoanDecisionDetails limitLoanDecisionDetails, Summary summary2, List<? extends BigDecimal> list, List<LimitLoanRefinanceInfo> list2, List<? extends LoanDecisionParameter> list3, List<? extends ScheduleInfo> list4, int i, List<ProviderInfoEntity> list5) {
        C41536l.m120489i(limitLoanDecisionDetails, "details");
        C41536l.m120489i(summary2, "summary");
        this.details = limitLoanDecisionDetails;
        this.summary = summary2;
        this.loanAmounts = list;
        this.refinanceInfo = list2;
        this.paramInfo = list3;
        this.scheduleInfo = list4;
        this.responseCode = i;
        this.providerInfo = list5;
    }

    public static /* synthetic */ LimitLoanDecisionEntity copy$default(LimitLoanDecisionEntity limitLoanDecisionEntity, LimitLoanDecisionDetails limitLoanDecisionDetails, Summary summary2, List list, List list2, List list3, List list4, int i, List list5, int i2, Object obj) {
        LimitLoanDecisionEntity limitLoanDecisionEntity2 = limitLoanDecisionEntity;
        int i3 = i2;
        return limitLoanDecisionEntity.copy((i3 & 1) != 0 ? limitLoanDecisionEntity2.details : limitLoanDecisionDetails, (i3 & 2) != 0 ? limitLoanDecisionEntity2.summary : summary2, (i3 & 4) != 0 ? limitLoanDecisionEntity2.loanAmounts : list, (i3 & 8) != 0 ? limitLoanDecisionEntity2.refinanceInfo : list2, (i3 & 16) != 0 ? limitLoanDecisionEntity2.paramInfo : list3, (i3 & 32) != 0 ? limitLoanDecisionEntity2.scheduleInfo : list4, (i3 & 64) != 0 ? limitLoanDecisionEntity2.responseCode : i, (i3 & 128) != 0 ? limitLoanDecisionEntity2.providerInfo : list5);
    }

    private final List<LoanDecisionParameter> getSafeParamInfo() {
        List<LoanDecisionParameter> list = this.paramInfo;
        return list == null ? C41341q.m119907j() : list;
    }

    public final LimitLoanDecisionDetails component1() {
        return this.details;
    }

    public final Summary component2() {
        return this.summary;
    }

    public final List<BigDecimal> component3() {
        return this.loanAmounts;
    }

    public final List<LimitLoanRefinanceInfo> component4() {
        return this.refinanceInfo;
    }

    public final List<LoanDecisionParameter> component5() {
        return this.paramInfo;
    }

    public final List<ScheduleInfo> component6() {
        return this.scheduleInfo;
    }

    public final int component7() {
        return this.responseCode;
    }

    public final List<ProviderInfoEntity> component8() {
        return this.providerInfo;
    }

    public final LimitLoanDecisionEntity copy(LimitLoanDecisionDetails limitLoanDecisionDetails, Summary summary2, List<? extends BigDecimal> list, List<LimitLoanRefinanceInfo> list2, List<? extends LoanDecisionParameter> list3, List<? extends ScheduleInfo> list4, int i, List<ProviderInfoEntity> list5) {
        C41536l.m120489i(limitLoanDecisionDetails, "details");
        C41536l.m120489i(summary2, "summary");
        return new LimitLoanDecisionEntity(limitLoanDecisionDetails, summary2, list, list2, list3, list4, i, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitLoanDecisionEntity)) {
            return false;
        }
        LimitLoanDecisionEntity limitLoanDecisionEntity = (LimitLoanDecisionEntity) obj;
        return C41536l.m120484d(this.details, limitLoanDecisionEntity.details) && C41536l.m120484d(this.summary, limitLoanDecisionEntity.summary) && C41536l.m120484d(this.loanAmounts, limitLoanDecisionEntity.loanAmounts) && C41536l.m120484d(this.refinanceInfo, limitLoanDecisionEntity.refinanceInfo) && C41536l.m120484d(this.paramInfo, limitLoanDecisionEntity.paramInfo) && C41536l.m120484d(this.scheduleInfo, limitLoanDecisionEntity.scheduleInfo) && this.responseCode == limitLoanDecisionEntity.responseCode && C41536l.m120484d(this.providerInfo, limitLoanDecisionEntity.providerInfo);
    }

    public final LimitLoanDecisionDetails getDetails() {
        return this.details;
    }

    public final boolean getHasNonStandardSchedule() {
        return C25481a.m80656a(getSafeParamInfo(), "B", PensionStatusResult.STATUS_INACTIVE);
    }

    public final List<BigDecimal> getLoanAmounts() {
        return this.loanAmounts;
    }

    public final List<LoanDecisionParameter> getParamInfo() {
        return this.paramInfo;
    }

    public final List<ProviderInfoEntity> getProviderInfo() {
        return this.providerInfo;
    }

    public final List<LimitLoanRefinanceInfo> getRefinanceInfo() {
        return this.refinanceInfo;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final List<ScheduleInfo> getScheduleInfo() {
        return this.scheduleInfo;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = ((this.details.hashCode() * 31) + this.summary.hashCode()) * 31;
        List<BigDecimal> list = this.loanAmounts;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<LimitLoanRefinanceInfo> list2 = this.refinanceInfo;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<LoanDecisionParameter> list3 = this.paramInfo;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ScheduleInfo> list4 = this.scheduleInfo;
        int hashCode5 = (((hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31) + this.responseCode) * 31;
        List<ProviderInfoEntity> list5 = this.providerInfo;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode5 + i;
    }

    public final boolean isAgroOrBusinessLoan() {
        return C25481a.m80656a(getSafeParamInfo(), "P");
    }

    public final boolean isCrifLoan() {
        return C25481a.m80656a(getSafeParamInfo(), "C", PensionStatusResult.STATUS_INACTIVE, "Y");
    }

    public final boolean isHalfCrif() {
        return C25481a.m80656a(getSafeParamInfo(), "B");
    }

    public String toString() {
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.details;
        Summary summary2 = this.summary;
        List<BigDecimal> list = this.loanAmounts;
        List<LimitLoanRefinanceInfo> list2 = this.refinanceInfo;
        List<LoanDecisionParameter> list3 = this.paramInfo;
        List<ScheduleInfo> list4 = this.scheduleInfo;
        int i = this.responseCode;
        List<ProviderInfoEntity> list5 = this.providerInfo;
        return "LimitLoanDecisionEntity(details=" + limitLoanDecisionDetails + ", summary=" + summary2 + ", loanAmounts=" + list + ", refinanceInfo=" + list2 + ", paramInfo=" + list3 + ", scheduleInfo=" + list4 + ", responseCode=" + i + ", providerInfo=" + list5 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LimitLoanDecisionEntity(LimitLoanDecisionDetails limitLoanDecisionDetails, Summary summary2, List list, List list2, List list3, List list4, int i, List list5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(limitLoanDecisionDetails, summary2, (i2 & 4) != 0 ? C41341q.m119907j() : list, (i2 & 8) != 0 ? C41341q.m119907j() : list2, (i2 & 16) != 0 ? C41341q.m119907j() : list3, (i2 & 32) != 0 ? C41341q.m119907j() : list4, i, list5);
    }
}
