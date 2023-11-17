package ie1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.u */
abstract class C41349u extends C41347t {
    /* renamed from: x */
    public static void m119945x(List list) {
        C41536l.m120489i(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: y */
    public static void m119946y(List list, Comparator comparator) {
        C41536l.m120489i(list, "<this>");
        C41536l.m120489i(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
