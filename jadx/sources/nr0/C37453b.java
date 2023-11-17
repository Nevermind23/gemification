package nr0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loans.data.model.LoanPaymentEntity;
import p341ge.bog.mobilebank.loans.data.model.LoanPaymentParamsEntity;
import p341ge.bog.mobilebank.loans.data.model.OfferedPlanTypesEntity;
import tr0.C38783d;
import tr0.C38784e;
import tr0.C38789j;

/* renamed from: nr0.b */
public final class C37453b {
    /* renamed from: b */
    private final C38784e m110343b(LoanPaymentParamsEntity loanPaymentParamsEntity) {
        return new C38784e(loanPaymentParamsEntity.getParameterName(), loanPaymentParamsEntity.getParameterValue(), loanPaymentParamsEntity.getParamDictionaryKey(), loanPaymentParamsEntity.getOrderNumber(), loanPaymentParamsEntity.isAmount(), loanPaymentParamsEntity.isHighLighted(), loanPaymentParamsEntity.isWarning());
    }

    /* renamed from: c */
    private final C38789j m110344c(OfferedPlanTypesEntity offeredPlanTypesEntity) {
        return new C38789j(offeredPlanTypesEntity.getPlanTypeDictionaryKey(), offeredPlanTypesEntity.getPlanType(), offeredPlanTypesEntity.getPlanTypeDictionaryKeyValue(), offeredPlanTypesEntity.getPlanTypeDescDictionaryKey(), offeredPlanTypesEntity.getPlanTypeDescDictionaryKeyValue());
    }

    /* renamed from: d */
    private final List m110345d(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m110343b((LoanPaymentParamsEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: e */
    private final List m110346e(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m110344c((OfferedPlanTypesEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C38783d mo90585a(LoanPaymentEntity loanPaymentEntity) {
        C41536l.m120489i(loanPaymentEntity, "loanPaymentEntity");
        return new C38783d(loanPaymentEntity.getFullAmount(), loanPaymentEntity.getLoanCCY(), m110345d(loanPaymentEntity.getLoanParamsList()), m110346e(loanPaymentEntity.getOfferedPlanTypes()));
    }
}
