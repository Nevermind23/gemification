package ai0;

import g91.C32303f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ai0.a */
public final class C19248a {
    /* renamed from: b */
    public static /* synthetic */ List m64691b(C19248a aVar, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = " " + C32303f.m95197h("GEL");
        }
        return aVar.mo47483a(list, str);
    }

    /* renamed from: a */
    public final List mo47483a(List list, String str) {
        ArrayList arrayList;
        C41536l.m120489i(str, "currency");
        if (list != null) {
            arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                double doubleValue = ((Number) it.next()).doubleValue();
                arrayList.add(doubleValue + str);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return C41341q.m119907j();
        }
        return arrayList;
    }
}
