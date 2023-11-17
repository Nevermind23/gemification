package p818lr;

import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity.LimitLoanDecisionEntity;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity.ProviderInfoEntity;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.LimitLoanRefinanceInfo;
import p341ge.bog.mobilebank.model.offers.LoanDecisionParameter;
import p341ge.bog.mobilebank.model.offers.ScheduleInfo;
import p341ge.bog.mobilebank.model.offers.Summary;
import p828mr.C26258b;
import p828mr.C26259c;
import p828mr.C26263g;
import p828mr.C26264h;
import ue1.C43075l;

/* renamed from: lr.a */
public final class C26059a {

    /* renamed from: lr.a$a */
    static final class C26060a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26060a f66166d = new C26060a();

        C26060a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo64976a(double d) {
            return Boolean.valueOf(d == Utils.DOUBLE_EPSILON);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo64976a(((Number) obj).doubleValue());
        }
    }

    /* renamed from: a */
    private final C26258b m81722a(Double d, String str, String str2) {
        if (C32343x.m95491u0(d, C26060a.f66166d)) {
            return null;
        }
        C41536l.m120486f(d);
        double doubleValue = d.doubleValue();
        C26264h.C26265a aVar = C26264h.f66590e;
        if (str2 == null) {
            return null;
        }
        return new C26258b(doubleValue, str, aVar.mo65422a(str2));
    }

    /* renamed from: b */
    public final C26259c mo64974b(LimitLoanDecisionEntity limitLoanDecisionEntity) {
        ArrayList arrayList;
        C41536l.m120489i(limitLoanDecisionEntity, "entity");
        LimitLoanDecisionDetails details = limitLoanDecisionEntity.getDetails();
        Summary summary = limitLoanDecisionEntity.getSummary();
        List<BigDecimal> loanAmounts = limitLoanDecisionEntity.getLoanAmounts();
        if (loanAmounts == null) {
            loanAmounts = C41341q.m119907j();
        }
        List<BigDecimal> list = loanAmounts;
        List<LimitLoanRefinanceInfo> refinanceInfo = limitLoanDecisionEntity.getRefinanceInfo();
        if (refinanceInfo == null) {
            refinanceInfo = C41341q.m119907j();
        }
        List<LimitLoanRefinanceInfo> list2 = refinanceInfo;
        List<LoanDecisionParameter> paramInfo = limitLoanDecisionEntity.getParamInfo();
        if (paramInfo == null) {
            paramInfo = C41341q.m119907j();
        }
        List<LoanDecisionParameter> list3 = paramInfo;
        List<ScheduleInfo> scheduleInfo = limitLoanDecisionEntity.getScheduleInfo();
        if (scheduleInfo == null) {
            scheduleInfo = C41341q.m119907j();
        }
        List<ScheduleInfo> list4 = scheduleInfo;
        int responseCode = limitLoanDecisionEntity.getResponseCode();
        List<ProviderInfoEntity> providerInfo = limitLoanDecisionEntity.getProviderInfo();
        if (providerInfo != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(providerInfo, 10));
            for (ProviderInfoEntity c : providerInfo) {
                arrayList2.add(mo64975c(c));
            }
            arrayList = arrayList2;
        } else {
            arrayList = C41341q.m119907j();
        }
        return new C26259c(details, summary, list, list2, list3, list4, responseCode, arrayList);
    }

    /* renamed from: c */
    public final C26263g mo64975c(ProviderInfoEntity providerInfoEntity) {
        C41536l.m120489i(providerInfoEntity, "info");
        return new C26263g(m81722a(providerInfoEntity.getInsIncomeRate(), providerInfoEntity.getInsIncomeRateCcy(), providerInfoEntity.getInsIncomeRateType()), m81722a(providerInfoEntity.getInsLifeRate(), providerInfoEntity.getInsLifeRateCcy(), providerInfoEntity.getInsLifeRateType()), providerInfoEntity.getProviderId(), providerInfoEntity.getProviderName(), providerInfoEntity.getProviderNameEn(), providerInfoEntity.getInsIncomeRate(), providerInfoEntity.getInsIncomeRateCcy(), providerInfoEntity.getInsIncomeRateType(), providerInfoEntity.getInsLifeRate(), providerInfoEntity.getInsLifeRateCcy(), providerInfoEntity.getInsLifeRateType());
    }
}
