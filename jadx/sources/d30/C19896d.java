package d30;

import a30.C19159d;
import d30.C19892c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: d30.d */
public final class C19896d {
    /* renamed from: a */
    public final C19892c.C19893a mo48255a(C19159d dVar) {
        C41536l.m120489i(dVar, "addressee");
        return new C19892c.C19893a(dVar);
    }

    /* renamed from: b */
    public final List mo48256b(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "addressees");
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(mo48255a((C19159d) it.next()));
        }
        return arrayList2;
    }
}
