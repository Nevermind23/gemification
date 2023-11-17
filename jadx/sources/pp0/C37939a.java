package pp0;

import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.DecisionDetailsApiModel;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.LimitLoanDecisionApiModel;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.ParamInfoApiModel;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.ProviderInfoApiModel;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.RefinanceInfoApiModel;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.ScheduleInfoApiModel;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.SummaryApiModel;
import ue1.C43075l;
import wp0.C39628a;
import wp0.C39630b;
import wp0.C39631c;
import wp0.C39632d;
import wp0.C39633e;
import wp0.C39634f;
import wp0.C39635g;
import wp0.C39637h;
import wp0.C39638i;
import wp0.C39639j;

/* renamed from: pp0.a */
public final class C37939a {

    /* renamed from: pp0.a$a */
    static final class C37940a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C37940a f91076d = new C37940a();

        C37940a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo91296a(double d) {
            return Boolean.valueOf(!(d == Utils.DOUBLE_EPSILON));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo91296a(((Number) obj).doubleValue());
        }
    }

    /* renamed from: a */
    private final C39630b m111502a(DecisionDetailsApiModel decisionDetailsApiModel) {
        return new C39630b(decisionDetailsApiModel.getCreditorIdentified(), C39628a.f94136d.mo93288a(decisionDetailsApiModel.getAccessType()), decisionDetailsApiModel.getComisAmount(), decisionDetailsApiModel.getComisMin(), decisionDetailsApiModel.getComisRate(), decisionDetailsApiModel.getConditionDays(), decisionDetailsApiModel.getConditionRate(), decisionDetailsApiModel.getDecisionNo(), decisionDetailsApiModel.getDecisionScheme(), decisionDetailsApiModel.getDownPayment(), decisionDetailsApiModel.getDrawAmount(), decisionDetailsApiModel.getDrawAmount2(), decisionDetailsApiModel.getFirstPayDate(), decisionDetailsApiModel.getForgiveFeeAmount(), decisionDetailsApiModel.getForgiveIntAmount(), decisionDetailsApiModel.getForgiveOdiAmount(), decisionDetailsApiModel.getFullPaymentAmount(), decisionDetailsApiModel.getGraceFlag(), decisionDetailsApiModel.getInsIncAmount(), decisionDetailsApiModel.getInsIncFlag(), decisionDetailsApiModel.getInsLifeAmount(), decisionDetailsApiModel.getKeepAmount(), decisionDetailsApiModel.getLastPaymentAmount(), decisionDetailsApiModel.getLoanAmount(), decisionDetailsApiModel.getMinLoanAmount(), decisionDetailsApiModel.getMaxLoanAmount(), decisionDetailsApiModel.getLoanCcy(), decisionDetailsApiModel.getLoanIrr(), decisionDetailsApiModel.getLoanIrr2(), decisionDetailsApiModel.getLoanIrr3(), decisionDetailsApiModel.getLoanIrr4(), decisionDetailsApiModel.getLoanMaturity(), decisionDetailsApiModel.getLoanRate(), decisionDetailsApiModel.getLoanTerm(), decisionDetailsApiModel.getMaxTerm(), decisionDetailsApiModel.getMinTerm(), decisionDetailsApiModel.getOperationType(), decisionDetailsApiModel.getPayDay(), decisionDetailsApiModel.getPaymentCount(), decisionDetailsApiModel.getPenaltyFee(), decisionDetailsApiModel.getPenaltyFeeValue(), decisionDetailsApiModel.getPenaltyInt(), decisionDetailsApiModel.getPenaltyOne(), decisionDetailsApiModel.getPenaltyPre(), decisionDetailsApiModel.getPenaltyPri(), decisionDetailsApiModel.getPmtAmount(), decisionDetailsApiModel.getRfncAmount(), decisionDetailsApiModel.getRqstDownPayment(), decisionDetailsApiModel.getTitleDictionaryKey(), decisionDetailsApiModel.getTitleDictionaryKeyValue(), decisionDetailsApiModel.getWithdrawalAmount());
    }

    /* renamed from: c */
    private final C39633e m111503c(ParamInfoApiModel paramInfoApiModel) {
        return new C39633e(paramInfoApiModel.getParameterCode(), paramInfoApiModel.getParameterValue());
    }

    /* renamed from: d */
    private final C39634f m111504d(ProviderInfoApiModel providerInfoApiModel) {
        String str;
        String str2;
        Double insLifeRate = providerInfoApiModel.getInsLifeRate();
        String insIncomeRateCcy = providerInfoApiModel.getInsIncomeRateCcy();
        String insIncomeRateType = providerInfoApiModel.getInsIncomeRateType();
        Double insLifeRate2 = providerInfoApiModel.getInsLifeRate();
        String insLifeRateCcy = providerInfoApiModel.getInsLifeRateCcy();
        String insLifeRateType = providerInfoApiModel.getInsLifeRateType();
        String providerId = providerInfoApiModel.getProviderId();
        if (providerId == null) {
            return null;
        }
        String providerName = providerInfoApiModel.getProviderName();
        if (providerName == null) {
            str = "";
        } else {
            str = providerName;
        }
        String providerNameEn = providerInfoApiModel.getProviderNameEn();
        if (providerNameEn == null) {
            str2 = "";
        } else {
            str2 = providerNameEn;
        }
        return new C39634f(m111508h(providerInfoApiModel.getInsIncomeRate(), providerInfoApiModel.getInsIncomeRateCcy(), providerInfoApiModel.getInsIncomeRateType()), m111508h(providerInfoApiModel.getInsLifeRate(), providerInfoApiModel.getInsLifeRateCcy(), providerInfoApiModel.getInsLifeRateType()), providerId, str, str2, insLifeRate, insIncomeRateCcy, insIncomeRateType, insLifeRate2, insLifeRateCcy, insLifeRateType);
    }

    /* renamed from: e */
    private final C39637h m111505e(RefinanceInfoApiModel refinanceInfoApiModel) {
        return new C39637h(refinanceInfoApiModel.getProductSource(), refinanceInfoApiModel.getDesireProductCreditor(), refinanceInfoApiModel.getProductClass(), refinanceInfoApiModel.getProductCreditorName(), refinanceInfoApiModel.getProductKey(), refinanceInfoApiModel.getProductDictionaryKey(), refinanceInfoApiModel.getProductCreditor(), refinanceInfoApiModel.getProductName(), refinanceInfoApiModel.isCreditorIdentified(), refinanceInfoApiModel.getProductInitAmt(), refinanceInfoApiModel.getProductAmount(), refinanceInfoApiModel.getDesireRefFlag(), refinanceInfoApiModel.getProductCode(), refinanceInfoApiModel.getProductPmt(), refinanceInfoApiModel.getProductRefFlag(), refinanceInfoApiModel.getProductCcy(), refinanceInfoApiModel.getProductSuggestedCreditor(), refinanceInfoApiModel.getProductType(), refinanceInfoApiModel.getProductNo());
    }

    /* renamed from: f */
    private final C39638i m111506f(ScheduleInfoApiModel scheduleInfoApiModel) {
        return new C39638i(scheduleInfoApiModel.getCcy(), scheduleInfoApiModel.getComAmount(), scheduleInfoApiModel.getInsAmount(), scheduleInfoApiModel.getIntAmount(), scheduleInfoApiModel.getOutAmount(), scheduleInfoApiModel.getPayDate(), scheduleInfoApiModel.getPriAmount(), scheduleInfoApiModel.getSumAmount());
    }

    /* renamed from: g */
    private final C39639j m111507g(SummaryApiModel summaryApiModel) {
        return new C39639j(summaryApiModel.getIntAmount(), summaryApiModel.getCcy(), summaryApiModel.getPriAmount(), summaryApiModel.getFullAmount());
    }

    /* renamed from: h */
    private final C39631c m111508h(Double d, String str, String str2) {
        if (!C32343x.m95479q0(d, C37940a.f91076d)) {
            return null;
        }
        C41536l.m120486f(d);
        double doubleValue = d.doubleValue();
        C39635g.C39636a aVar = C39635g.f94217d;
        if (str2 == null) {
            return null;
        }
        return new C39631c(doubleValue, str, aVar.mo93351a(str2));
    }

    /* renamed from: b */
    public final C39632d mo91295b(LimitLoanDecisionApiModel limitLoanDecisionApiModel) {
        List list;
        List list2;
        List list3;
        ArrayList arrayList;
        C41536l.m120489i(limitLoanDecisionApiModel, "entity");
        C39630b a = m111502a(limitLoanDecisionApiModel.getDetails());
        C39639j g = m111507g(limitLoanDecisionApiModel.getSummary());
        List<Double> loanAmounts = limitLoanDecisionApiModel.getLoanAmounts();
        if (loanAmounts == null) {
            loanAmounts = C41341q.m119907j();
        }
        List<Double> list4 = loanAmounts;
        List<RefinanceInfoApiModel> refinanceInfo = limitLoanDecisionApiModel.getRefinanceInfo();
        if (refinanceInfo != null) {
            list = new ArrayList(C41343r.m119925u(refinanceInfo, 10));
            for (RefinanceInfoApiModel e : refinanceInfo) {
                list.add(m111505e(e));
            }
        } else {
            list = C41341q.m119907j();
        }
        List<ParamInfoApiModel> paramInfo = limitLoanDecisionApiModel.getParamInfo();
        if (paramInfo != null) {
            list2 = new ArrayList(C41343r.m119925u(paramInfo, 10));
            for (ParamInfoApiModel c : paramInfo) {
                list2.add(m111503c(c));
            }
        } else {
            list2 = C41341q.m119907j();
        }
        List<ScheduleInfoApiModel> scheduleInfo = limitLoanDecisionApiModel.getScheduleInfo();
        if (scheduleInfo != null) {
            list3 = new ArrayList(C41343r.m119925u(scheduleInfo, 10));
            for (ScheduleInfoApiModel f : scheduleInfo) {
                list3.add(m111506f(f));
            }
        } else {
            list3 = C41341q.m119907j();
        }
        List<ProviderInfoApiModel> providerInfo = limitLoanDecisionApiModel.getProviderInfo();
        if (providerInfo != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ProviderInfoApiModel d : providerInfo) {
                C39634f d2 = m111504d(d);
                if (d2 != null) {
                    arrayList2.add(d2);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = C41341q.m119907j();
        }
        return new C39632d(a, g, list4, list, list2, list3, arrayList, limitLoanDecisionApiModel.getResponseCode());
    }
}
