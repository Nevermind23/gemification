package p342j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.d0 */
public final /* synthetic */ class C9454d0 {

    /* renamed from: a */
    public final /* synthetic */ LongToIntFunction f26102a;

    private /* synthetic */ C9454d0(LongToIntFunction longToIntFunction) {
        this.f26102a = longToIntFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9454d0 m34810a(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return new C9454d0(longToIntFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9454d0) {
            obj = ((C9454d0) obj).f26102a;
        }
        return this.f26102a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26102a.hashCode();
    }
}
