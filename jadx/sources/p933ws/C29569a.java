package p933ws;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.AnalysisApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.AnalysisChildrenApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.AnalysisIncomeAndExpensesApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.PFMDataApiEntity;
import p903tv.C28517a;
import p903tv.C28518b;
import p903tv.C28519c;

/* renamed from: ws.a */
public final class C29569a {
    /* renamed from: a */
    private final List m89763a(List list) {
        List list2;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnalysisChildrenApiEntity analysisChildrenApiEntity = (AnalysisChildrenApiEntity) it.next();
            List<AnalysisChildrenApiEntity> children = analysisChildrenApiEntity.getChildren();
            if (children != null) {
                list2 = m89763a(children);
            } else {
                list2 = null;
            }
            arrayList.add(new C28518b(list2, analysisChildrenApiEntity.getColor(), analysisChildrenApiEntity.getId(), analysisChildrenApiEntity.getTitleKey(), analysisChildrenApiEntity.getValue()));
        }
        return arrayList;
    }

    /* renamed from: c */
    private final C28517a m89764c(PFMDataApiEntity pFMDataApiEntity) {
        return new C28517a(m89765d(pFMDataApiEntity.getExpenses()), m89765d(pFMDataApiEntity.getIncomes()));
    }

    /* renamed from: d */
    private final C28519c m89765d(AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity) {
        return new C28519c(m89763a(analysisIncomeAndExpensesApiEntity.getChildren()), analysisIncomeAndExpensesApiEntity.getValue());
    }

    /* renamed from: b */
    public final C28517a mo69416b(AnalysisApiEntity analysisApiEntity) {
        C41536l.m120489i(analysisApiEntity, "analysisEntity");
        return m89764c(analysisApiEntity.getPfmData());
    }
}
