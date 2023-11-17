package z20;

import a30.C19158c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import n20.C26359a;
import p783hv.C25071c;
import p891su.C28261a;
import w10.C29190a;

/* renamed from: z20.b */
public final class C30141b {
    /* renamed from: a */
    public final C19158c mo70493a(C25071c cVar) {
        C41536l.m120489i(cVar, "moneyRequestContact");
        C28261a a = cVar.mo63525a();
        long m = a.mo67857m();
        String b = C29190a.m89130b(a);
        String a2 = C26359a.m82388a(a);
        if (a2 == null) {
            a2 = "";
        }
        return new C19158c(m, b, a2, a.mo67858n(), C29190a.m89129a(a), cVar.mo63526b());
    }

    /* renamed from: b */
    public final List mo70494b(List list) {
        C41536l.m120489i(list, "contactList");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo70493a((C25071c) it.next()));
        }
        return arrayList;
    }
}
