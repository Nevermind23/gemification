package me1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import me1.C41748d;
import ue1.C43079p;

/* renamed from: me1.f */
public interface C41752f {

    /* renamed from: me1.f$a */
    public static final class C41753a {

        /* renamed from: me1.f$a$a */
        static final class C41754a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C41754a f98028d = new C41754a();

            C41754a() {
                super(2);
            }

            /* renamed from: a */
            public final C41752f invoke(C41752f fVar, C41755b bVar) {
                C41743c cVar;
                C41536l.m120489i(fVar, "acc");
                C41536l.m120489i(bVar, "element");
                C41752f q = fVar.mo23740q(bVar.getKey());
                C41758g gVar = C41758g.f98029d;
                if (q == gVar) {
                    return bVar;
                }
                C41748d.C41750b bVar2 = C41748d.f98026f3;
                C41748d dVar = (C41748d) q.mo23736c(bVar2);
                if (dVar == null) {
                    cVar = new C41743c(q, bVar);
                } else {
                    C41752f q2 = q.mo23740q(bVar2);
                    if (q2 == gVar) {
                        return new C41743c(bVar, dVar);
                    }
                    cVar = new C41743c(new C41743c(q2, bVar), dVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static C41752f m121037a(C41752f fVar, C41752f fVar2) {
            C41536l.m120489i(fVar2, "context");
            if (fVar2 == C41758g.f98029d) {
                return fVar;
            }
            return (C41752f) fVar2.mo23734U(fVar, C41754a.f98028d);
        }
    }

    /* renamed from: me1.f$b */
    public interface C41755b extends C41752f {

        /* renamed from: me1.f$b$a */
        public static final class C41756a {
            /* renamed from: a */
            public static Object m121040a(C41755b bVar, Object obj, C43079p pVar) {
                C41536l.m120489i(pVar, "operation");
                return pVar.invoke(obj, bVar);
            }

            /* renamed from: b */
            public static C41755b m121041b(C41755b bVar, C41757c cVar) {
                C41536l.m120489i(cVar, "key");
                if (!C41536l.m120484d(bVar.getKey(), cVar)) {
                    return null;
                }
                C41536l.m120487g(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static C41752f m121042c(C41755b bVar, C41757c cVar) {
                C41536l.m120489i(cVar, "key");
                if (C41536l.m120484d(bVar.getKey(), cVar)) {
                    return C41758g.f98029d;
                }
                return bVar;
            }

            /* renamed from: d */
            public static C41752f m121043d(C41755b bVar, C41752f fVar) {
                C41536l.m120489i(fVar, "context");
                return C41753a.m121037a(bVar, fVar);
            }
        }

        /* renamed from: c */
        C41755b mo23736c(C41757c cVar);

        C41757c getKey();
    }

    /* renamed from: me1.f$c */
    public interface C41757c {
    }

    /* renamed from: U */
    Object mo23734U(Object obj, C43079p pVar);

    /* renamed from: c */
    C41755b mo23736c(C41757c cVar);

    /* renamed from: q */
    C41752f mo23740q(C41757c cVar);

    /* renamed from: u */
    C41752f mo23741u(C41752f fVar);
}
