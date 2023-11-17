package p342j$.util.function;

import java.util.function.ObjLongConsumer;

/* renamed from: j$.util.function.p0 */
public final /* synthetic */ class C9478p0 implements ObjLongConsumer {

    /* renamed from: a */
    public final /* synthetic */ C9480q0 f26123a;

    private /* synthetic */ C9478p0(C9480q0 q0Var) {
        this.f26123a = q0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjLongConsumer m34835a(C9480q0 q0Var) {
        if (q0Var == null) {
            return null;
        }
        return q0Var instanceof C9476o0 ? ((C9476o0) q0Var).f26121a : new C9478p0(q0Var);
    }

    public final /* synthetic */ void accept(Object obj, long j) {
        this.f26123a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9480q0 q0Var = this.f26123a;
        if (obj instanceof C9478p0) {
            obj = ((C9478p0) obj).f26123a;
        }
        return q0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26123a.hashCode();
    }
}
