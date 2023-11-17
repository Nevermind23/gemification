package p342j$.util.function;

import java.util.function.Supplier;

/* renamed from: j$.util.function.v0 */
public final /* synthetic */ class C9490v0 implements C9494x0 {

    /* renamed from: a */
    public final /* synthetic */ Supplier f26135a;

    private /* synthetic */ C9490v0(Supplier supplier) {
        this.f26135a = supplier;
    }

    /* renamed from: a */
    public static /* synthetic */ C9494x0 m34847a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof C9492w0 ? ((C9492w0) supplier).f26136a : new C9490v0(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9490v0) {
            obj = ((C9490v0) obj).f26135a;
        }
        return this.f26135a.equals(obj);
    }

    public final /* synthetic */ Object get() {
        return this.f26135a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26135a.hashCode();
    }
}
