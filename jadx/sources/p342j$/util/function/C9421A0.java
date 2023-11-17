package p342j$.util.function;

import java.util.function.ToLongFunction;
import p342j$.util.function.ToLongFunction;

/* renamed from: j$.util.function.A0 */
public final /* synthetic */ class C9421A0 implements ToLongFunction {

    /* renamed from: a */
    public final /* synthetic */ ToLongFunction f26067a;

    private /* synthetic */ C9421A0(ToLongFunction toLongFunction) {
        this.f26067a = toLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ ToLongFunction m34768a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof ToLongFunction.VivifiedWrapper ? ((ToLongFunction.VivifiedWrapper) toLongFunction).f26088a : new C9421A0(toLongFunction);
    }

    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.f26067a.applyAsLong(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToLongFunction toLongFunction = this.f26067a;
        if (obj instanceof C9421A0) {
            obj = ((C9421A0) obj).f26067a;
        }
        return toLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26067a.hashCode();
    }
}
