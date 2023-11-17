package p355an;

import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CsDefaultDepartments;
import p537nm.C17096m;

/* renamed from: an.e */
public final class C10087e {
    /* renamed from: a */
    public final CsDefaultDepartments mo26546a(List list) {
        boolean z;
        C41536l.m120489i(list, "departments");
        ArrayList<C17096m> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C17096m) next).mo44403a() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C17096m mVar : arrayList) {
            Long valueOf = Long.valueOf(mVar.mo44404b());
            String a = mVar.mo44403a();
            C41536l.m120486f(a);
            arrayList2.add(C41233s.m119492a(valueOf, a));
        }
        return new CsDefaultDepartments(C41344r0.m119939u(arrayList2));
    }
}
