package me1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;

/* renamed from: me1.d */
public interface C41748d extends C41752f.C41755b {

    /* renamed from: f3 */
    public static final C41750b f98026f3 = C41750b.f98027d;

    /* renamed from: me1.d$a */
    public static final class C41749a {
        /* renamed from: a */
        public static C41752f.C41755b m121030a(C41748d dVar, C41752f.C41757c cVar) {
            C41536l.m120489i(cVar, "key");
            if (cVar instanceof C41742b) {
                C41742b bVar = (C41742b) cVar;
                if (!bVar.mo96529a(dVar.getKey())) {
                    return null;
                }
                C41752f.C41755b b = bVar.mo96530b(dVar);
                if (b instanceof C41752f.C41755b) {
                    return b;
                }
                return null;
            } else if (C41748d.f98026f3 != cVar) {
                return null;
            } else {
                C41536l.m120487g(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
        }

        /* renamed from: b */
        public static C41752f m121031b(C41748d dVar, C41752f.C41757c cVar) {
            C41536l.m120489i(cVar, "key");
            if (cVar instanceof C41742b) {
                C41742b bVar = (C41742b) cVar;
                if (!bVar.mo96529a(dVar.getKey()) || bVar.mo96530b(dVar) == null) {
                    return dVar;
                }
                return C41758g.f98029d;
            } else if (C41748d.f98026f3 == cVar) {
                return C41758g.f98029d;
            } else {
                return dVar;
            }
        }
    }

    /* renamed from: me1.d$b */
    public static final class C41750b implements C41752f.C41757c {

        /* renamed from: d */
        static final /* synthetic */ C41750b f98027d = new C41750b();

        private C41750b() {
        }
    }

    /* renamed from: d */
    void mo95146d(Continuation continuation);

    /* renamed from: f */
    Continuation mo95147f(Continuation continuation);
}
