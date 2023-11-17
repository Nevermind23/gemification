package ie1;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.y0 */
abstract class C41361y0 extends C41357x0 {
    /* renamed from: j */
    public static Set m120038j(Set set, Iterable iterable) {
        C41536l.m120489i(set, "<this>");
        C41536l.m120489i(iterable, "elements");
        Collection B = C41352v.m119957B(iterable);
        if (B.isEmpty()) {
            return C41358y.m119993D0(set);
        }
        if (B instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                if (!B.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(B);
        return linkedHashSet2;
    }

    /* renamed from: k */
    public static Set m120039k(Set set, Object obj) {
        C41536l.m120489i(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C41342q0.m119921f(set.size()));
        boolean z = false;
        for (Object next : set) {
            boolean z2 = true;
            if (!z && C41536l.m120484d(next, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: l */
    public static Set m120040l(Set set, Iterable iterable) {
        int i;
        C41536l.m120489i(set, "<this>");
        C41536l.m120489i(iterable, "elements");
        Integer v = C41343r.m119926v(iterable);
        if (v != null) {
            i = set.size() + v.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C41342q0.m119921f(i));
        linkedHashSet.addAll(set);
        boolean unused = C41352v.m119965z(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: m */
    public static Set m120041m(Set set, Object obj) {
        C41536l.m120489i(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C41342q0.m119921f(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
