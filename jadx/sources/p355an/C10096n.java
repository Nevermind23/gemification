package p355an;

import fd0.C20463a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel;
import p674xm.C18805i;
import p855oy.C27094a;

/* renamed from: an.n */
public final class C10096n {

    /* renamed from: a */
    private final C27094a f27866a;

    public C10096n(C27094a aVar) {
        C41536l.m120489i(aVar, "lookupUiMapper");
        this.f27866a = aVar;
    }

    /* renamed from: a */
    public final List mo26571a(List list) {
        C41536l.m120489i(list, "lookups");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20463a aVar = (C20463a) it.next();
            arrayList.add(new DebitCardReceiveTypeUiModel(C18805i.f52549d.mo46645a(aVar.mo49003c()), aVar.mo49001a(), this.f27866a.mo66387a(aVar)));
        }
        return arrayList;
    }
}
