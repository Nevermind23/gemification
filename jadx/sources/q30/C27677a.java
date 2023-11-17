package q30;

import g91.C32289b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p891su.C28261a;
import r30.C27895b;

/* renamed from: q30.a */
public final class C27677a {
    /* renamed from: a */
    public final List mo67213a(List list) {
        C41536l.m120489i(list, "contactList");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo67214b((C28261a) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C27895b mo67214b(C28261a aVar) {
        C41536l.m120489i(aVar, "contact");
        long m = aVar.mo67857m();
        String b = C32289b0.m95090b(aVar.mo67860p(), true);
        String i = aVar.mo67853i();
        if (i == null) {
            i = "";
        }
        return new C27895b(m, b, i, aVar.mo67858n(), aVar.mo67861q(), aVar.mo67850g(), false, aVar.mo67866u(), aVar.mo67863s(), aVar.mo67849f(), false, 1088, (DefaultConstructorMarker) null);
    }
}
