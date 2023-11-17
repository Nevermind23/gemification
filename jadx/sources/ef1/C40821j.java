package ef1;

import if1.C41365a;
import if1.C41366b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlinx.coroutines.internal.C41592e0;
import kotlinx.coroutines.internal.C41627z;
import me1.C41748d;
import me1.C41752f;
import me1.C41758g;
import oe1.C41857h;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ef1.j */
abstract /* synthetic */ class C40821j {
    /* renamed from: a */
    public static final C40845o1 m118315a(C40814h0 h0Var, C41752f fVar, C40822j0 j0Var, C43079p pVar) {
        C40777a aVar;
        C41752f d = C40786c0.m118261d(h0Var, fVar);
        if (j0Var.mo95172c()) {
            aVar = new C40880x1(d, pVar);
        } else {
            aVar = new C40812g2(d, true);
        }
        aVar.mo95129N0(j0Var, aVar, pVar);
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C40845o1 m118316b(C40814h0 h0Var, C41752f fVar, C40822j0 j0Var, C43079p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C41758g.f98029d;
        }
        if ((i & 2) != 0) {
            j0Var = C40822j0.DEFAULT;
        }
        return C40813h.m118299a(h0Var, fVar, j0Var, pVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static final Object m118317c(C41752f fVar, C43079p pVar, Continuation continuation) {
        Object obj;
        C41752f b = continuation.mo94380b();
        C41752f e = C40786c0.m118262e(b, fVar);
        C40859r1.m118444g(e);
        if (e == b) {
            C41627z zVar = new C41627z(e, continuation);
            obj = C41366b.m120054b(zVar, zVar, pVar);
        } else {
            C41748d.C41750b bVar = C41748d.f98026f3;
            if (C41536l.m120484d(e.mo23736c(bVar), b.mo23736c(bVar))) {
                C40842n2 n2Var = new C40842n2(e, continuation);
                Object c = C41592e0.m120649c(e, (Object) null);
                try {
                    Object b2 = C41366b.m120054b(n2Var, n2Var, pVar);
                    C41592e0.m120647a(e, c);
                    obj = b2;
                } catch (Throwable th) {
                    C41592e0.m120647a(e, c);
                    throw th;
                }
            } else {
                C40858r0 r0Var = new C40858r0(e, continuation);
                C41365a.m120052d(pVar, r0Var, r0Var, (C43075l) null, 4, (Object) null);
                obj = r0Var.mo95223O0();
            }
        }
        if (obj == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        return obj;
    }
}
