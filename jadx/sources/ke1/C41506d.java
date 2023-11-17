package ke1;

import java.util.Comparator;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: ke1.d */
abstract class C41506d {
    /* renamed from: c */
    public static Comparator m120404c(C43075l... lVarArr) {
        boolean z;
        C41536l.m120489i(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C41505c(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final int m120405d(C43075l[] lVarArr, Object obj, Object obj2) {
        C41536l.m120489i(lVarArr, "$selectors");
        return m120407f(obj, obj2, lVarArr);
    }

    /* renamed from: e */
    public static int m120406e(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: f */
    private static final int m120407f(Object obj, Object obj2, C43075l[] lVarArr) {
        for (C43075l lVar : lVarArr) {
            int e = m120406e((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (e != 0) {
                return e;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static Comparator m120408g() {
        C41509g gVar = C41509g.f97678d;
        C41536l.m120487g(gVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return gVar;
    }

    /* renamed from: h */
    public static Comparator m120409h(Comparator comparator) {
        C41536l.m120489i(comparator, "comparator");
        return new C41504b(comparator);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final int m120410i(Comparator comparator, Object obj, Object obj2) {
        C41536l.m120489i(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    /* renamed from: j */
    public static Comparator m120411j() {
        C41510h hVar = C41510h.f97679d;
        C41536l.m120487g(hVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return hVar;
    }
}
