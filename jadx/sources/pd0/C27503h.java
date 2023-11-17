package pd0;

import de1.C40640a;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import ee1.C40776f;
import he1.C41224m;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: pd0.h */
public final class C27503h {

    /* renamed from: d */
    public static final C27510e f70394d = new C27510e((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C40776f f70395a;

    /* renamed from: b */
    private final C40749p f70396b;

    /* renamed from: c */
    private final C40776f f70397c;

    /* renamed from: pd0.h$a */
    static final class C27504a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C27504a f70398d = new C27504a();

        C27504a() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C27515g gVar, Object obj) {
            boolean z;
            C41536l.m120489i(gVar, "param");
            C41536l.m120489i(obj, "lastResult");
            if (C41536l.m120484d(obj, -1) || (obj instanceof C27511f.C27512a) || ((gVar.mo66829a() == C27516h.DROP && !(obj instanceof C27511f.C27513b)) || gVar.mo66829a() == C27516h.LATEST)) {
                z = true;
            } else {
                z = false;
            }
            return new C41224m(gVar.mo66830b(), Boolean.valueOf(z));
        }
    }

    /* renamed from: pd0.h$b */
    static final class C27505b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C27505b f70399d = new C27505b();

        C27505b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            return Boolean.valueOf(((Boolean) mVar.mo95676b()).booleanValue());
        }
    }

    /* renamed from: pd0.h$c */
    static final class C27506c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C27506c f70400d = new C27506c();

        C27506c() {
            super(1);
        }

        /* renamed from: a */
        public final C43064a invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            return (C43064a) mVar.mo95678e();
        }
    }

    /* renamed from: pd0.h$d */
    static final class C27507d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C27507d f70401d = new C27507d();

        /* renamed from: pd0.h$d$a */
        static final class C27508a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C27508a f70402d = new C27508a();

            C27508a() {
                super(1);
            }

            /* renamed from: a */
            public final C27511f invoke(Object obj) {
                C41536l.m120489i(obj, "it");
                return new C27511f.C27514c(obj);
            }
        }

        /* renamed from: pd0.h$d$b */
        static final class C27509b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C27509b f70403d = new C27509b();

            C27509b() {
                super(1);
            }

            /* renamed from: a */
            public final C27511f invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C27511f.C27512a(th);
            }
        }

        C27507d() {
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C27511f m85305d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C27511f) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C27511f m85306e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C27511f) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C43064a aVar) {
            C41536l.m120489i(aVar, "sourceProvider");
            return ((C40749p) aVar.invoke()).mo95026k0(new C27517i(C27508a.f70402d)).mo95035t0(new C27518j(C27509b.f70403d)).mo94977D0(C27511f.C27513b.f70405a);
        }
    }

    /* renamed from: pd0.h$e */
    public static final class C27510e {
        private C27510e() {
        }

        public /* synthetic */ C27510e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: pd0.h$f */
    public static abstract class C27511f {

        /* renamed from: pd0.h$f$a */
        public static final class C27512a extends C27511f {

            /* renamed from: a */
            private final Throwable f70404a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27512a(Throwable th) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(th, "throwable");
                this.f70404a = th;
            }

            /* renamed from: a */
            public final Throwable mo66821a() {
                return this.f70404a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27512a) && C41536l.m120484d(this.f70404a, ((C27512a) obj).f70404a);
            }

            public int hashCode() {
                return this.f70404a.hashCode();
            }

            public String toString() {
                Throwable th = this.f70404a;
                return "Error(throwable=" + th + ")";
            }
        }

        /* renamed from: pd0.h$f$b */
        public static final class C27513b extends C27511f {

            /* renamed from: a */
            public static final C27513b f70405a = new C27513b();

            private C27513b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pd0.h$f$c */
        public static final class C27514c extends C27511f {

            /* renamed from: a */
            private final Object f70406a;

            public C27514c(Object obj) {
                super((DefaultConstructorMarker) null);
                this.f70406a = obj;
            }

            /* renamed from: a */
            public final Object mo66825a() {
                return this.f70406a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27514c) && C41536l.m120484d(this.f70406a, ((C27514c) obj).f70406a);
            }

            public int hashCode() {
                Object obj = this.f70406a;
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            }

            public String toString() {
                Object obj = this.f70406a;
                return "Success(data=" + obj + ")";
            }
        }

        private C27511f() {
        }

        public /* synthetic */ C27511f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: pd0.h$g */
    private static final class C27515g {

        /* renamed from: a */
        private final C43064a f70407a;

        /* renamed from: b */
        private final C27516h f70408b;

        public C27515g(C43064a aVar, C27516h hVar) {
            C41536l.m120489i(aVar, "sourceProvider");
            C41536l.m120489i(hVar, "refresh");
            this.f70407a = aVar;
            this.f70408b = hVar;
        }

        /* renamed from: a */
        public final C27516h mo66829a() {
            return this.f70408b;
        }

        /* renamed from: b */
        public final C43064a mo66830b() {
            return this.f70407a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27515g)) {
                return false;
            }
            C27515g gVar = (C27515g) obj;
            return C41536l.m120484d(this.f70407a, gVar.f70407a) && this.f70408b == gVar.f70408b;
        }

        public int hashCode() {
            return (this.f70407a.hashCode() * 31) + this.f70408b.hashCode();
        }

        public String toString() {
            C43064a aVar = this.f70407a;
            C27516h hVar = this.f70408b;
            return "Param(sourceProvider=" + aVar + ", refresh=" + hVar + ")";
        }
    }

    /* renamed from: pd0.h$h */
    public enum C27516h {
        LATEST,
        DROP,
        NO_REFRESH
    }

    public C27503h() {
        C40776f f1 = C40765a.m118199i1(-1).mo95124f1();
        C41536l.m120488h(f1, "createDefault<Any>(EMPTY).toSerialized()");
        this.f70395a = f1;
        this.f70396b = f1.mo94990M(new C27497b()).mo95026k0(new C27498c()).mo95027o0(C40640a.m117457a());
        C40776f f12 = C40767b.m118210h1().mo95124f1();
        C41536l.m120488h(f12, "create<Param<T>>().toSerialized()");
        this.f70397c = f12;
        f12.mo95014Y0(f1, new C27499d(C27504a.f70398d)).mo94990M(new C27500e(C27505b.f70399d)).mo95026k0(new C27501f(C27506c.f70400d)).mo94989L0(new C27502g(C27507d.f70401d)).mo95043y().mo95016c(f1);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C41224m m85288h(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final boolean m85289i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C43064a m85290j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C43064a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C40754t m85291k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: p */
    public static /* synthetic */ C40749p m85292p(C27503h hVar, C27516h hVar2, C43064a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar2 = C27516h.NO_REFRESH;
        }
        return hVar.mo66813n(hVar2, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final C40754t m85293q(C27503h hVar, C43064a aVar, C27516h hVar2) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(aVar, "$sourceProvider");
        C41536l.m120489i(hVar2, "$refresh");
        C40749p pVar = hVar.f70396b;
        hVar.f70397c.onNext(new C27515g(aVar, hVar2));
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m85294r(Object obj) {
        C41536l.m120489i(obj, "it");
        return !C41536l.m120484d(obj, -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final C27511f m85295s(Object obj) {
        C41536l.m120489i(obj, "it");
        return (C27511f) obj;
    }

    /* renamed from: l */
    public final void mo66811l() {
        this.f70395a.onNext(-1);
    }

    /* renamed from: m */
    public final C40749p mo66812m() {
        C40749p pVar = this.f70396b;
        C41536l.m120488h(pVar, "observable");
        return pVar;
    }

    /* renamed from: n */
    public final C40749p mo66813n(C27516h hVar, C43064a aVar) {
        C41536l.m120489i(hVar, "refresh");
        C41536l.m120489i(aVar, "sourceProvider");
        C40749p v = C40749p.m118055v(new C27496a(this, aVar, hVar));
        C41536l.m120488h(v, "defer {\n            obse…)\n            }\n        }");
        return v;
    }

    /* renamed from: o */
    public final C40749p mo66814o(boolean z, C43064a aVar) {
        C27516h hVar;
        C41536l.m120489i(aVar, "sourceProvider");
        if (z) {
            hVar = C27516h.LATEST;
        } else {
            hVar = C27516h.NO_REFRESH;
        }
        return mo66813n(hVar, aVar);
    }
}
