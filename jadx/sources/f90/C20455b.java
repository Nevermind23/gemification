package f90;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel;
import u80.C28610a;

/* renamed from: f90.b */
public final class C20455b {
    /* renamed from: a */
    public final OrganizationUiModel mo48973a(C28610a aVar) {
        C41536l.m120489i(aVar, "organization");
        return new OrganizationUiModel(aVar.mo68328g(), aVar.mo68329h(), aVar.mo68331i(), aVar.mo68321a(), aVar.mo68322b(), aVar.mo68325e(), aVar.mo68327f(), aVar.mo68323c(), aVar.mo68324d());
    }

    /* renamed from: b */
    public final List mo48974b(List list) {
        C41536l.m120489i(list, "organizations");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo48973a((C28610a) it.next()));
        }
        return arrayList;
    }
}
