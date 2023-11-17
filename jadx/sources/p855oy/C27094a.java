package p855oy;

import fd0.C20463a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;

/* renamed from: oy.a */
public final class C27094a {
    /* renamed from: a */
    public final LookupUiModel mo66387a(C20463a aVar) {
        C41536l.m120489i(aVar, "lookup");
        return new LookupUiModel(aVar.mo49002b(), aVar.mo49003c(), aVar.mo49001a(), aVar.mo49004d());
    }

    /* renamed from: b */
    public final List mo66388b(List list) {
        C41536l.m120489i(list, "lookups");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo66387a((C20463a) it.next()));
        }
        return arrayList;
    }
}
