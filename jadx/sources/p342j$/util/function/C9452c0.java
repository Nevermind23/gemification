package p342j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.c0 */
public final /* synthetic */ class C9452c0 {

    /* renamed from: a */
    public final /* synthetic */ LongToDoubleFunction f26100a;

    private /* synthetic */ C9452c0(LongToDoubleFunction longToDoubleFunction) {
        this.f26100a = longToDoubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9452c0 m34807a(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return new C9452c0(longToDoubleFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9452c0) {
            obj = ((C9452c0) obj).f26100a;
        }
        return this.f26100a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26100a.hashCode();
    }
}
