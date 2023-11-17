package ke1;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import kotlin.jvm.internal.C41536l;
import p342j$.util.Comparator;
import p342j$.util.function.Function;
import p342j$.util.function.ToDoubleFunction;
import p342j$.util.function.ToIntFunction;
import p342j$.util.function.ToLongFunction;

/* renamed from: ke1.h */
final class C41510h implements Comparator, p342j$.util.Comparator {

    /* renamed from: d */
    public static final C41510h f97679d = new C41510h();

    private C41510h() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        C41536l.m120489i(comparable, "a");
        C41536l.m120489i(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator reversed() {
        return C41509g.f97678d;
    }

    public /* synthetic */ Comparator thenComparing(Function function) {
        return thenComparing(Function.VivifiedWrapper.convert(function));
    }

    public /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return thenComparingDouble(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction));
    }

    public /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return thenComparingInt(ToIntFunction.VivifiedWrapper.convert(toIntFunction));
    }

    public /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return thenComparingLong(ToLongFunction.VivifiedWrapper.convert(toLongFunction));
    }

    public /* synthetic */ Comparator thenComparing(java.util.function.Function function, Comparator comparator) {
        return thenComparing(Function.VivifiedWrapper.convert(function), comparator);
    }

    public /* synthetic */ Comparator thenComparingDouble(p342j$.util.function.ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    public /* synthetic */ java.util.Comparator thenComparingInt(p342j$.util.function.ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    public /* synthetic */ java.util.Comparator thenComparingLong(p342j$.util.function.ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing((java.util.Comparator) this, comparator);
    }

    public /* synthetic */ java.util.Comparator thenComparing(p342j$.util.function.Function function) {
        return Comparator.CC.$default$thenComparing((java.util.Comparator) this, function);
    }

    public /* synthetic */ java.util.Comparator thenComparing(p342j$.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }
}
