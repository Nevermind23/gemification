package yg1;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import bh1.C40385a;
import bh1.C40386b;
import kotlin.jvm.internal.C41536l;
import nh1.C41806a;
import ph1.C42203a;
import te1.C42994a;

/* renamed from: yg1.c */
public abstract class C43402c {
    /* renamed from: a */
    public static final C1620q0 m124507a(C42203a aVar, C43401b bVar) {
        C41536l.m120489i(aVar, "$this$createViewModelProvider");
        C41536l.m120489i(bVar, "viewModelParameters");
        return new C1620q0(bVar.mo102082f(), m124509c(aVar, bVar));
    }

    /* renamed from: b */
    public static final C1613n0 m124508b(C1620q0 q0Var, C43401b bVar, C41806a aVar, Class cls) {
        C41536l.m120489i(q0Var, "$this$get");
        C41536l.m120489i(bVar, "viewModelParameters");
        C41536l.m120489i(cls, "javaClass");
        if (bVar.mo102080d() != null) {
            C1613n0 b = q0Var.mo4937b(String.valueOf(aVar), cls);
            C41536l.m120488h(b, "get(qualifier.toString(), javaClass)");
            return b;
        }
        C1613n0 a = q0Var.mo4936a(cls);
        C41536l.m120488h(a, "get(javaClass)");
        return a;
    }

    /* renamed from: c */
    private static final C1620q0.C1624b m124509c(C42203a aVar, C43401b bVar) {
        if (bVar.mo102081e() != null) {
            return new C40386b(aVar, bVar);
        }
        return new C40385a(aVar, bVar);
    }

    /* renamed from: d */
    public static final C1613n0 m124510d(C1620q0 q0Var, C43401b bVar) {
        C41536l.m120489i(q0Var, "$this$resolveInstance");
        C41536l.m120489i(bVar, "viewModelParameters");
        return m124508b(q0Var, bVar, bVar.mo102080d(), C42994a.m123348a(bVar.mo102077a()));
    }
}
