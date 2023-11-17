package p342j$.util.function;

import java.util.function.ObjIntConsumer;

/* renamed from: j$.util.function.m0 */
public final /* synthetic */ class C9472m0 implements ObjIntConsumer {

    /* renamed from: a */
    public final /* synthetic */ C9474n0 f26119a;

    private /* synthetic */ C9472m0(C9474n0 n0Var) {
        this.f26119a = n0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjIntConsumer m34830a(C9474n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        return n0Var instanceof C9470l0 ? ((C9470l0) n0Var).f26117a : new C9472m0(n0Var);
    }

    public final /* synthetic */ void accept(Object obj, int i) {
        this.f26119a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9474n0 n0Var = this.f26119a;
        if (obj instanceof C9472m0) {
            obj = ((C9472m0) obj).f26119a;
        }
        return n0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26119a.hashCode();
    }
}
