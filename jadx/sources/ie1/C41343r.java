package ie1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.r */
abstract class C41343r extends C41341q {
    /* renamed from: u */
    public static int m119925u(Iterable iterable, int i) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    /* renamed from: v */
    public static final Integer m119926v(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: w */
    public static List m119927w(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            boolean unused = C41352v.m119965z(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
