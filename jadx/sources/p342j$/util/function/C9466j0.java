package p342j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.util.function.j0 */
public final /* synthetic */ class C9466j0 implements ObjDoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ C9468k0 f26114a;

    private /* synthetic */ C9466j0(C9468k0 k0Var) {
        this.f26114a = k0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjDoubleConsumer m34825a(C9468k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        return k0Var instanceof C9464i0 ? ((C9464i0) k0Var).f26112a : new C9466j0(k0Var);
    }

    public final /* synthetic */ void accept(Object obj, double d) {
        this.f26114a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9468k0 k0Var = this.f26114a;
        if (obj instanceof C9466j0) {
            obj = ((C9466j0) obj).f26114a;
        }
        return k0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26114a.hashCode();
    }
}
