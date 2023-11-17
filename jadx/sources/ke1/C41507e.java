package ke1;

import kotlin.jvm.internal.C41536l;

/* renamed from: ke1.e */
abstract class C41507e extends C41506d {
    /* renamed from: k */
    public static Comparable m120412k(Comparable comparable, Comparable comparable2) {
        C41536l.m120489i(comparable, "a");
        C41536l.m120489i(comparable2, "b");
        if (comparable.compareTo(comparable2) <= 0) {
            return comparable;
        }
        return comparable2;
    }
}
