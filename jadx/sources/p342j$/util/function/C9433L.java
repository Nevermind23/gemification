package p342j$.util.function;

import java.util.function.IntToDoubleFunction;

/* renamed from: j$.util.function.L */
public final /* synthetic */ class C9433L {

    /* renamed from: a */
    public final /* synthetic */ IntToDoubleFunction f26080a;

    private /* synthetic */ C9433L(IntToDoubleFunction intToDoubleFunction) {
        this.f26080a = intToDoubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9433L m34789a(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return new C9433L(intToDoubleFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9433L) {
            obj = ((C9433L) obj).f26080a;
        }
        return this.f26080a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26080a.hashCode();
    }
}
