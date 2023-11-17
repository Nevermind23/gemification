package p857pq;

import fd0.C20463a;
import he1.C41224m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloDropdownValuesUiModel;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;

/* renamed from: pq.b */
public final class C27604b {
    /* renamed from: a */
    public final BecomeSoloDropdownValuesUiModel mo66974a(List list) {
        C41536l.m120489i(list, "lookupData");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20463a aVar = (C20463a) it.next();
            arrayList.add(new LookupUiModel(aVar.mo49002b(), aVar.mo49003c(), aVar.mo49001a(), aVar.mo49004d()));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList) {
            if (C41536l.m120484d(((LookupUiModel) next).mo52392b(), "BECOME_SOLO_APPLICATION_INCOME_RANGE")) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        C41224m mVar = new C41224m(arrayList2, arrayList3);
        return new BecomeSoloDropdownValuesUiModel((List) mVar.mo95678e(), (List) mVar.mo95680f());
    }
}
