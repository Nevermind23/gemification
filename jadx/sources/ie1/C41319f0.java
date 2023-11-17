package ie1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41548x;

/* renamed from: ie1.f0 */
abstract class C41319f0 {
    /* renamed from: a */
    public static Map m119699a(C41315d0 d0Var) {
        boolean z;
        C41536l.m120489i(d0Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b = d0Var.mo35462b();
        while (b.hasNext()) {
            Object a = d0Var.mo35461a(b.next());
            Object obj = linkedHashMap.get(a);
            if (obj != null || linkedHashMap.containsKey(a)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                obj = new C41548x();
            }
            C41548x xVar = (C41548x) obj;
            xVar.f97715d++;
            linkedHashMap.put(a, xVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C41536l.m120487g(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            C41527d0.m120458e(entry).setValue(Integer.valueOf(((C41548x) entry.getValue()).f97715d));
        }
        return C41527d0.m120457d(linkedHashMap);
    }
}
