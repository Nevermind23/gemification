package p342j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.Z */
public final /* synthetic */ class C9446Z implements LongFunction {

    /* renamed from: a */
    public final /* synthetic */ C9448a0 f26094a;

    private /* synthetic */ C9446Z(C9448a0 a0Var) {
        this.f26094a = a0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ LongFunction m34802a(C9448a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        return a0Var instanceof C9445Y ? ((C9445Y) a0Var).f26093a : new C9446Z(a0Var);
    }

    public final /* synthetic */ Object apply(long j) {
        return this.f26094a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9448a0 a0Var = this.f26094a;
        if (obj instanceof C9446Z) {
            obj = ((C9446Z) obj).f26094a;
        }
        return a0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26094a.hashCode();
    }
}
