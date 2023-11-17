package ef1;

import he1.C41238w;
import kotlin.coroutines.Continuation;
import me1.C41748d;
import me1.C41752f;
import oe1.C41857h;

/* renamed from: ef1.p0 */
public abstract class C40850p0 {
    /* renamed from: a */
    public static final Object m118424a(long j, Continuation continuation) {
        if (j <= 0) {
            return C41238w.f97225a;
        }
        C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
        oVar.mo95193C();
        if (j < Long.MAX_VALUE) {
            m118425b(oVar.mo94380b()).mo95161e(j, oVar);
        }
        Object x = oVar.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        if (x == C41793d.m121157c()) {
            return x;
        }
        return C41238w.f97225a;
    }

    /* renamed from: b */
    public static final C40844o0 m118425b(C41752f fVar) {
        C41752f.C41755b c = fVar.mo23736c(C41748d.f98026f3);
        C40844o0 o0Var = c instanceof C40844o0 ? (C40844o0) c : null;
        return o0Var == null ? C40840n0.m118357a() : o0Var;
    }
}
