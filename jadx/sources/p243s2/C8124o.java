package p243s2;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import ue1.C43075l;

/* renamed from: s2.o */
public interface C8124o {

    /* renamed from: s2.o$a */
    public static final class C8125a {

        /* renamed from: s2.o$a$a */
        public static final class C8126a implements C8134d {

            /* renamed from: a */
            final /* synthetic */ C43075l f23276a;

            C8126a(C43075l lVar) {
                this.f23276a = lVar;
            }

            /* renamed from: a */
            public Object mo23314a(C8124o oVar) {
                C41536l.m120490j(oVar, "reader");
                return this.f23276a.invoke(oVar);
            }
        }

        /* renamed from: s2.o$a$b */
        public static final class C8127b implements C8133c {

            /* renamed from: a */
            final /* synthetic */ C43075l f23277a;

            C8127b(C43075l lVar) {
                this.f23277a = lVar;
            }

            /* renamed from: a */
            public Object mo23315a(C8129b bVar) {
                C41536l.m120490j(bVar, "reader");
                return this.f23277a.invoke(bVar);
            }
        }

        /* renamed from: s2.o$a$c */
        public static final class C8128c implements C8134d {

            /* renamed from: a */
            final /* synthetic */ C43075l f23278a;

            C8128c(C43075l lVar) {
                this.f23278a = lVar;
            }

            /* renamed from: a */
            public Object mo23314a(C8124o oVar) {
                C41536l.m120490j(oVar, "reader");
                return this.f23278a.invoke(oVar);
            }
        }

        /* renamed from: a */
        public static Object m30703a(C8124o oVar, C7846k kVar, C43075l lVar) {
            C41536l.m120490j(kVar, "field");
            C41536l.m120490j(lVar, "block");
            return oVar.mo19022e(kVar, new C8126a(lVar));
        }

        /* renamed from: b */
        public static List m30704b(C8124o oVar, C7846k kVar, C43075l lVar) {
            C41536l.m120490j(kVar, "field");
            C41536l.m120490j(lVar, "block");
            return oVar.mo19020c(kVar, new C8127b(lVar));
        }

        /* renamed from: c */
        public static Object m30705c(C8124o oVar, C7846k kVar, C43075l lVar) {
            C41536l.m120490j(kVar, "field");
            C41536l.m120490j(lVar, "block");
            return oVar.mo19024g(kVar, new C8128c(lVar));
        }
    }

    /* renamed from: s2.o$b */
    public interface C8129b {

        /* renamed from: s2.o$b$a */
        public static final class C8130a {

            /* renamed from: s2.o$b$a$a */
            public static final class C8131a implements C8133c {

                /* renamed from: a */
                final /* synthetic */ C43075l f23279a;

                C8131a(C43075l lVar) {
                    this.f23279a = lVar;
                }

                /* renamed from: a */
                public Object mo23315a(C8129b bVar) {
                    C41536l.m120490j(bVar, "reader");
                    return this.f23279a.invoke(bVar);
                }
            }

            /* renamed from: s2.o$b$a$b */
            public static final class C8132b implements C8134d {

                /* renamed from: a */
                final /* synthetic */ C43075l f23280a;

                C8132b(C43075l lVar) {
                    this.f23280a = lVar;
                }

                /* renamed from: a */
                public Object mo23314a(C8124o oVar) {
                    C41536l.m120490j(oVar, "reader");
                    return this.f23280a.invoke(oVar);
                }
            }

            /* renamed from: a */
            public static List m30714a(C8129b bVar, C43075l lVar) {
                C41536l.m120490j(lVar, "block");
                return bVar.mo19035d(new C8131a(lVar));
            }

            /* renamed from: b */
            public static Object m30715b(C8129b bVar, C43075l lVar) {
                C41536l.m120490j(lVar, "block");
                return bVar.mo19032a(new C8132b(lVar));
            }
        }

        /* renamed from: a */
        Object mo19032a(C8134d dVar);

        /* renamed from: b */
        Object mo19033b(C43075l lVar);

        /* renamed from: c */
        List mo19034c(C43075l lVar);

        /* renamed from: d */
        List mo19035d(C8133c cVar);

        /* renamed from: e */
        String mo19036e();
    }

    /* renamed from: s2.o$c */
    public interface C8133c {
        /* renamed from: a */
        Object mo23315a(C8129b bVar);
    }

    /* renamed from: s2.o$d */
    public interface C8134d {
        /* renamed from: a */
        Object mo23314a(C8124o oVar);
    }

    /* renamed from: a */
    Integer mo19018a(C7846k kVar);

    /* renamed from: b */
    Object mo19019b(C7846k.C7848b bVar);

    /* renamed from: c */
    List mo19020c(C7846k kVar, C8133c cVar);

    /* renamed from: d */
    Object mo19021d(C7846k kVar, C43075l lVar);

    /* renamed from: e */
    Object mo19022e(C7846k kVar, C8134d dVar);

    /* renamed from: f */
    Object mo19023f(C7846k kVar, C43075l lVar);

    /* renamed from: g */
    Object mo19024g(C7846k kVar, C8134d dVar);

    /* renamed from: h */
    String mo19025h(C7846k kVar);

    /* renamed from: i */
    List mo19026i(C7846k kVar, C43075l lVar);

    /* renamed from: j */
    Boolean mo19027j(C7846k kVar);
}
