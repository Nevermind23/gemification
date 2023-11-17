package pb0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka0.C25693b;
import ka0.C25696e;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositFeatureUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;

/* renamed from: pb0.a */
public final class C27493a {
    /* renamed from: a */
    public final DepositFeatureUiModel mo66805a(C25693b bVar) {
        C41536l.m120489i(bVar, "feature");
        return new DepositFeatureUiModel(bVar.mo64199b(), bVar.mo64200c(), bVar.mo64198a());
    }

    /* renamed from: b */
    public final DepositTypeDetailsUiModel mo66806b(C25696e eVar) {
        C41536l.m120489i(eVar, "depositDetails");
        return new DepositTypeDetailsUiModel(eVar.mo64235t(), eVar.mo64221g(), eVar.mo64222h(), eVar.mo64228m(), eVar.mo64227l(), eVar.mo64215b(), eVar.mo64217d(), eVar.mo64230o(), eVar.mo64232q(), eVar.mo64234s(), eVar.mo64233r(), eVar.mo64216c(), eVar.mo64226k(), eVar.mo64220f(), eVar.mo64218e(), eVar.mo64231p(), eVar.mo64229n(), eVar.mo64225j(), mo66808d(eVar.mo64214a()), mo66808d(eVar.mo64224i()));
    }

    /* renamed from: c */
    public final List mo66807c(List list) {
        C41536l.m120489i(list, "depositTypes");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo66806b((C25696e) it.next()));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo66808d(List list) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo66805a((C25693b) it.next()));
        }
        return arrayList;
    }
}
