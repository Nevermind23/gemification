package p342j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p342j$.util.function.Function;
import p342j$.util.function.ToDoubleFunction;
import p342j$.util.function.ToIntFunction;
import p342j$.util.function.ToLongFunction;

/* renamed from: j$.util.c */
public final /* synthetic */ class C9385c implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f25964a;

    /* renamed from: b */
    public final /* synthetic */ Object f25965b;

    public /* synthetic */ C9385c(Object obj, int i) {
        this.f25964a = i;
        this.f25965b = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f25964a) {
            case 0:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.f25965b;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 1:
                ToIntFunction toIntFunction = (ToIntFunction) this.f25965b;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 2:
                ToLongFunction toLongFunction = (ToLongFunction) this.f25965b;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
            default:
                Function function = (Function) this.f25965b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
        }
    }
}
