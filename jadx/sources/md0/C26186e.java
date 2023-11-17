package md0;

import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26191f;
import ue1.C43075l;

/* renamed from: md0.e */
public abstract class C26186e {

    /* renamed from: md0.e$a */
    static final class C26187a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26187a f66393d = new C26187a();

        C26187a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C26191f fVar) {
            C41536l.m120489i(fVar, "it");
            return Boolean.valueOf(!C41536l.m120484d(fVar, C26191f.C26193b.f66398a));
        }
    }

    /* renamed from: md0.e$b */
    static final class C26188b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26188b f66394d = new C26188b();

        C26188b() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C26191f fVar) {
            C41536l.m120489i(fVar, "it");
            if (fVar instanceof C26191f.C26192a) {
                return C40749p.m118028K(((C26191f.C26192a) fVar).mo65219a());
            }
            if (fVar instanceof C26191f.C26194c) {
                return C40749p.m118043h0(((C26191f.C26194c) fVar).mo65223a());
            }
            return C40749p.m118027J();
        }
    }

    /* renamed from: md0.e$c */
    static final class C26189c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26189c f66395d = new C26189c();

        C26189c() {
            super(1);
        }

        /* renamed from: a */
        public final C26191f invoke(Object obj) {
            C41536l.m120489i(obj, "it");
            return new C26191f.C26194c(obj);
        }
    }

    /* renamed from: md0.e$d */
    static final class C26190d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26190d f66396d = new C26190d();

        C26190d() {
            super(1);
        }

        /* renamed from: a */
        public final C26191f invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return new C26191f.C26192a(th);
        }
    }

    /* renamed from: e */
    public static final C40749p m81987e(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        C40749p Q = pVar.mo94990M(new C26182a(C26187a.f66393d)).mo94998Q(new C26183b(C26188b.f66394d));
        C41536l.m120488h(Q, "filter { it != AsyncResu…e.empty()\n        }\n    }");
        return Q;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m81988f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C40754t m81989g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: h */
    public static final C40762x m81990h(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        C40762x P = m81987e(pVar).mo94996P();
        C41536l.m120488h(P, "unwrap().firstOrError()");
        return P;
    }

    /* renamed from: i */
    public static final C40749p m81991i(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        C40749p t0 = pVar.mo95026k0(new C26184c(C26189c.f66395d)).mo95035t0(new C26185d(C26190d.f66396d));
        C41536l.m120488h(t0, "map<AsyncResult<T>> { As…{ AsyncResult.Error(it) }");
        return t0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C26191f m81992j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26191f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C26191f m81993k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26191f) lVar.invoke(obj);
    }
}
