package aa1;

import aa1.C30916h;
import ed1.C40749p;
import ed1.C40754t;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: aa1.m */
public abstract class C30934m {

    /* renamed from: aa1.m$a */
    static final class C30935a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30935a f77061d = new C30935a();

        C30935a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C30916h.C30924f fVar) {
            C41536l.m120489i(fVar, "it");
            return Boolean.valueOf(!C41536l.m120484d(fVar, C30916h.C30924f.C30926b.f77049a));
        }
    }

    /* renamed from: aa1.m$b */
    static final class C30936b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30936b f77062d = new C30936b();

        C30936b() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C30916h.C30924f fVar) {
            C41536l.m120489i(fVar, "it");
            if (fVar instanceof C30916h.C30924f.C30925a) {
                return C40749p.m118028K(((C30916h.C30924f.C30925a) fVar).mo71141a());
            }
            if (fVar instanceof C30916h.C30924f.C30927c) {
                return C40749p.m118043h0(((C30916h.C30924f.C30927c) fVar).mo71145a());
            }
            return C40749p.m118027J();
        }
    }

    /* renamed from: c */
    public static final C40749p m92180c(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        C40749p Q = pVar.mo94990M(new C30932k(C30935a.f77061d)).mo94998Q(new C30933l(C30936b.f77062d));
        C41536l.m120488h(Q, "filter { it != RxStore.E…e.empty()\n        }\n    }");
        return Q;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m92181d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40754t m92182e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }
}
