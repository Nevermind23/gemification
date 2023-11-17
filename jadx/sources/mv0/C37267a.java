package mv0;

import bv0.C31203c;
import g91.C32299e;
import iv0.C36550b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import lv0.C37167j;

/* renamed from: mv0.a */
public final class C37267a {
    /* renamed from: a */
    public final List mo90386a(List list) {
        boolean z;
        int i;
        C41536l.m120489i(list, "banks");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36550b bVar = (C36550b) it.next();
            String b = bVar.mo89334b();
            String a = bVar.mo89333a();
            Integer valueOf = Integer.valueOf(C32299e.m95163a(bVar.mo89333a()));
            if (valueOf.intValue() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            } else {
                i = C31203c.f77509h;
            }
            arrayList.add(new C37167j(b, a, i, bVar.mo89335c(), bVar.mo89336d()));
        }
        return arrayList;
    }
}
