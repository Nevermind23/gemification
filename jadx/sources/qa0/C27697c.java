package qa0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka0.C25701j;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel;

/* renamed from: qa0.c */
public final class C27697c {
    /* renamed from: a */
    public final WithdrawalTypeUiModel mo67235a(C25701j jVar) {
        C41536l.m120489i(jVar, "withdrawalType");
        return new WithdrawalTypeUiModel(jVar.mo64260d(), jVar.mo64257a(), jVar.mo64259c(), jVar.mo64258b());
    }

    /* renamed from: b */
    public final List mo67236b(List list) {
        C41536l.m120489i(list, "withdrawalTypes");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo67235a((C25701j) it.next()));
        }
        return arrayList;
    }
}
