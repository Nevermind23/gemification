package p342j$.util.function;

import java.util.function.ToIntFunction;
import p342j$.util.function.ToIntFunction;

/* renamed from: j$.util.function.z0 */
public final /* synthetic */ class C9498z0 implements ToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ ToIntFunction f26143a;

    private /* synthetic */ C9498z0(ToIntFunction toIntFunction) {
        this.f26143a = toIntFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ ToIntFunction m34854a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof ToIntFunction.VivifiedWrapper ? ((ToIntFunction.VivifiedWrapper) toIntFunction).f26087a : new C9498z0(toIntFunction);
    }

    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.f26143a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToIntFunction toIntFunction = this.f26143a;
        if (obj instanceof C9498z0) {
            obj = ((C9498z0) obj).f26143a;
        }
        return toIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26143a.hashCode();
    }
}
