package nd0;

import ed1.C40749p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26191f;
import pd0.C27503h;
import ue1.C43075l;

/* renamed from: nd0.c */
public abstract class C26453c {

    /* renamed from: nd0.c$a */
    static final class C26454a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f67029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26454a(C43075l lVar) {
            super(1);
            this.f67029d = lVar;
        }

        /* renamed from: a */
        public final C26191f invoke(C27503h.C27511f fVar) {
            C26191f aVar;
            C41536l.m120489i(fVar, "it");
            if (C41536l.m120484d(fVar, C27503h.C27511f.C27513b.f70405a)) {
                return C26191f.C26193b.f66398a;
            }
            if (fVar instanceof C27503h.C27511f.C27514c) {
                aVar = new C26191f.C26194c(this.f67029d.invoke(((C27503h.C27511f.C27514c) fVar).mo66825a()));
            } else if (fVar instanceof C27503h.C27511f.C27512a) {
                aVar = new C26191f.C26192a(((C27503h.C27511f.C27512a) fVar).mo66821a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return aVar;
        }
    }

    /* renamed from: nd0.c$b */
    static final class C26455b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26455b f67030d = new C26455b();

        C26455b() {
            super(1);
        }

        /* renamed from: a */
        public final C26191f invoke(C27503h.C27511f fVar) {
            C26191f aVar;
            C41536l.m120489i(fVar, "it");
            if (C41536l.m120484d(fVar, C27503h.C27511f.C27513b.f70405a)) {
                return C26191f.C26193b.f66398a;
            }
            if (fVar instanceof C27503h.C27511f.C27514c) {
                aVar = new C26191f.C26194c(((C27503h.C27511f.C27514c) fVar).mo66825a());
            } else if (fVar instanceof C27503h.C27511f.C27512a) {
                aVar = new C26191f.C26192a(((C27503h.C27511f.C27512a) fVar).mo66821a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return aVar;
        }
    }

    /* renamed from: c */
    public static final C40749p m82745c(C40749p pVar, C43075l lVar) {
        C41536l.m120489i(pVar, "<this>");
        C41536l.m120489i(lVar, "transformer");
        C40749p k0 = pVar.mo95026k0(new C26451a(new C26454a(lVar)));
        C41536l.m120488h(k0, "mapAsyncResult");
        return k0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C26191f m82746d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26191f) lVar.invoke(obj);
    }

    /* renamed from: e */
    public static final C40749p m82747e(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        C40749p k0 = pVar.mo95026k0(new C26452b(C26455b.f67030d));
        C41536l.m120488h(k0, "map {\n    when (it) {\n  …ror(it.throwable)\n    }\n}");
        return k0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C26191f m82748f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26191f) lVar.invoke(obj);
    }
}
