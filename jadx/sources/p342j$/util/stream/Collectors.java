package p342j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: j$.util.stream.Collectors */
public final class Collectors {

    /* renamed from: a */
    static final Set f26178a;

    static {
        C9669j jVar = C9669j.CONCURRENT;
        C9669j jVar2 = C9669j.UNORDERED;
        C9669j jVar3 = C9669j.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(jVar, jVar2, jVar3));
        Collections.unmodifiableSet(EnumSet.of(jVar, jVar2));
        f26178a = Collections.unmodifiableSet(EnumSet.of(jVar3));
        Collections.unmodifiableSet(EnumSet.of(jVar2, jVar3));
        Collections.emptySet();
    }

    /* renamed from: a */
    static void m34923a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C9689n(new C9566L0(11), new C9566L0(12), new C9684m(0), f26178a);
    }
}
