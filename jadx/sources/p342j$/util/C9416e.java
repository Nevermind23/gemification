package p342j$.util;

import java.util.Collections;
import java.util.Comparator;

/* renamed from: j$.util.e */
enum C9416e implements Comparator, Comparator {
    ;

    private C9416e() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    public final Comparator reversed() {
        return Collections.reverseOrder();
    }
}
