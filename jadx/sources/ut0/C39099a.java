package ut0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;
import yt0.C40065f;

/* renamed from: ut0.a */
public final class C39099a {
    /* renamed from: a */
    public final List mo92770a(List list) {
        C41536l.m120489i(list, "lookups");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LookupEntity lookupEntity = (LookupEntity) it.next();
            arrayList.add(new C40065f(lookupEntity.getDictionaryKey(), lookupEntity.getOrderNumber()));
        }
        return arrayList;
    }
}
