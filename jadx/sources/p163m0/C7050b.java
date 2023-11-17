package p163m0;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1630r0;
import kotlin.jvm.internal.C41536l;

/* renamed from: m0.b */
public final class C7050b implements C1620q0.C1624b {

    /* renamed from: a */
    private final C7054f[] f20988a;

    public C7050b(C7054f... fVarArr) {
        C41536l.m120489i(fVarArr, "initializers");
        this.f20988a = fVarArr;
    }

    /* renamed from: a */
    public C1613n0 mo4803a(Class cls, C7047a aVar) {
        C41536l.m120489i(cls, "modelClass");
        C41536l.m120489i(aVar, "extras");
        C1613n0 n0Var = null;
        for (C7054f fVar : this.f20988a) {
            if (C41536l.m120484d(fVar.mo21275a(), cls)) {
                Object invoke = fVar.mo21276b().invoke(aVar);
                if (invoke instanceof C1613n0) {
                    n0Var = (C1613n0) invoke;
                } else {
                    n0Var = null;
                }
            }
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }

    /* renamed from: b */
    public /* synthetic */ C1613n0 mo4804b(Class cls) {
        return C1630r0.m5684a(this, cls);
    }
}
