package du0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import yt0.C40065f;

/* renamed from: du0.b */
public final class C31607b {
    /* renamed from: a */
    public final List mo72021a(List list) {
        C41536l.m120489i(list, "welcomeNewsItems");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C31606a(((C40065f) it.next()).mo93998a()));
        }
        return arrayList;
    }
}
