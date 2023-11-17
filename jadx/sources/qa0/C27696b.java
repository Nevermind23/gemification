package qa0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka0.C25694c;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel;

/* renamed from: qa0.b */
public final class C27696b {
    /* renamed from: a */
    public final DepositPurposeUiModel mo67233a(C25694c cVar) {
        C41536l.m120489i(cVar, "depositPurpose");
        return new DepositPurposeUiModel(cVar.mo64207d(), cVar.mo64206c(), cVar.mo64208e(), cVar.mo64210f(), cVar.mo64205b(), cVar.mo64211g(), cVar.mo64204a());
    }

    /* renamed from: b */
    public final List mo67234b(List list) {
        C41536l.m120489i(list, "purposes");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo67233a((C25694c) it.next()));
        }
        return arrayList;
    }
}
