package p342j$.util.function;

import java.util.function.Supplier;

/* renamed from: j$.util.function.w0 */
public final /* synthetic */ class C9492w0 implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C9494x0 f26136a;

    private /* synthetic */ C9492w0(C9494x0 x0Var) {
        this.f26136a = x0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ Supplier m34848a(C9494x0 x0Var) {
        if (x0Var == null) {
            return null;
        }
        return x0Var instanceof C9490v0 ? ((C9490v0) x0Var).f26135a : new C9492w0(x0Var);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9494x0 x0Var = this.f26136a;
        if (obj instanceof C9492w0) {
            obj = ((C9492w0) obj).f26136a;
        }
        return x0Var.equals(obj);
    }

    public final /* synthetic */ Object get() {
        return this.f26136a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26136a.hashCode();
    }
}
