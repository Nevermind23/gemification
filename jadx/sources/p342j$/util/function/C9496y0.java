package p342j$.util.function;

import java.util.function.ToDoubleFunction;
import p342j$.util.function.ToDoubleFunction;

/* renamed from: j$.util.function.y0 */
public final /* synthetic */ class C9496y0 implements ToDoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ ToDoubleFunction f26141a;

    private /* synthetic */ C9496y0(ToDoubleFunction toDoubleFunction) {
        this.f26141a = toDoubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ ToDoubleFunction m34852a(ToDoubleFunction toDoubleFunction) {
        if (toDoubleFunction == null) {
            return null;
        }
        return toDoubleFunction instanceof ToDoubleFunction.VivifiedWrapper ? ((ToDoubleFunction.VivifiedWrapper) toDoubleFunction).f26086a : new C9496y0(toDoubleFunction);
    }

    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.f26141a.applyAsDouble(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToDoubleFunction toDoubleFunction = this.f26141a;
        if (obj instanceof C9496y0) {
            obj = ((C9496y0) obj).f26141a;
        }
        return toDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26141a.hashCode();
    }
}
