package p355an;

import fd0.C20463a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRecipientTypeUiModel;
import p674xm.C18807j;
import p855oy.C27094a;

/* renamed from: an.o */
public final class C10097o {

    /* renamed from: a */
    private final C27094a f27867a;

    public C10097o(C27094a aVar) {
        C41536l.m120489i(aVar, "lookupUiMapper");
        this.f27867a = aVar;
    }

    /* renamed from: a */
    public final List mo26572a(List list) {
        C41536l.m120489i(list, "lookups");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20463a aVar = (C20463a) it.next();
            arrayList.add(new DebitCardRecipientTypeUiModel(C18807j.f52553d.mo46646a(aVar.mo49003c()), aVar.mo49001a(), this.f27867a.mo66387a(aVar)));
        }
        return arrayList;
    }
}
