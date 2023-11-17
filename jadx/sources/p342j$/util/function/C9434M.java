package p342j$.util.function;

import java.util.function.IntToLongFunction;

/* renamed from: j$.util.function.M */
public final /* synthetic */ class C9434M implements C9436O {

    /* renamed from: a */
    public final /* synthetic */ IntToLongFunction f26081a;

    private /* synthetic */ C9434M(IntToLongFunction intToLongFunction) {
        this.f26081a = intToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9436O m34790a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof C9435N ? ((C9435N) intToLongFunction).f26082a : new C9434M(intToLongFunction);
    }

    public final /* synthetic */ long applyAsLong(int i) {
        return this.f26081a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9434M) {
            obj = ((C9434M) obj).f26081a;
        }
        return this.f26081a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26081a.hashCode();
    }
}
