package p355an;

import fd0.C20463a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardOrderTypeUiModel;
import p674xm.C18803h;

/* renamed from: an.l */
public final class C10094l {
    /* renamed from: a */
    public final List mo26569a(List list) {
        C41536l.m120489i(list, "lookups");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20463a aVar = (C20463a) it.next();
            arrayList.add(new DebitCardOrderTypeUiModel(C18803h.f52544e.mo46644a(aVar.mo49003c()), aVar.mo49001a(), aVar.mo49003c()));
        }
        return arrayList;
    }
}
