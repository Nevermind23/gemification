package p342j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.b0 */
public final /* synthetic */ class C9450b0 {

    /* renamed from: a */
    public final /* synthetic */ LongPredicate f26097a;

    private /* synthetic */ C9450b0(LongPredicate longPredicate) {
        this.f26097a = longPredicate;
    }

    /* renamed from: a */
    public static /* synthetic */ C9450b0 m34805a(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new C9450b0(longPredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9450b0) {
            obj = ((C9450b0) obj).f26097a;
        }
        return this.f26097a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26097a.hashCode();
    }
}
