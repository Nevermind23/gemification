package p825ly;

import i20.C25106f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import su0.C38536a;

/* renamed from: ly.a */
public abstract class C26096a {
    /* renamed from: a */
    public abstract C25106f mo65014a(C38536a aVar);

    /* renamed from: b */
    public final List mo65015b(List list) {
        C41536l.m120489i(list, "nboOffers");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25106f a = mo65014a((C38536a) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
