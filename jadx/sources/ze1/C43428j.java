package ze1;

import kotlin.jvm.internal.C41536l;

/* renamed from: ze1.j */
abstract class C43428j {
    /* renamed from: a */
    public static final void m124582a(boolean z, Number number) {
        C41536l.m120489i(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    /* renamed from: b */
    public static C43414a m124583b(Comparable comparable, Comparable comparable2) {
        C41536l.m120489i(comparable, "<this>");
        C41536l.m120489i(comparable2, "that");
        return new C43416b(comparable, comparable2);
    }
}
