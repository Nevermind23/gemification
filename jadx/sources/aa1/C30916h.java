package aa1;

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

/* renamed from: aa1.h */
public final class C30916h {

    /* renamed from: d */
    public static final C30923e f77038d = new C30923e((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C40776f f77039a;

    /* renamed from: b */
    private final C40765a f77040b;

    /* renamed from: c */
    private final C40749p f77041c;

    /* renamed from: aa1.h$a */
    static final class C30917a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C30917a f77042d = new C30917a();

        C30917a() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C30928g gVar, Object obj) {
            boolean z;
            C41536l.m120489i(gVar, "param");
            C41536l.m120489i(obj, "lastResult");
            if (C41536l.m120484d(obj, -1) || (obj instanceof C30924f.C30925a) || ((gVar.mo71149a() == C30929h.DROP && !(obj instanceof C30924f.C30926b)) || gVar.mo71149a() == C30929h.LATEST)) {
                z = true;
            } else {
                z = false;
            }
            return new C41224m(gVar.mo71150b(), Boolean.valueOf(z));
        }
    }

    /* renamed from: aa1.h$b */
    static final class C30918b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30918b f77043d = new C30918b();

        C30918b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            return Boolean.valueOf(((Boolean) mVar.mo95676b()).booleanValue());
        }
    }

    /* renamed from: aa1.h$c */
    static final class C30919c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30919c f77044d = new C30919c();

        C30919c() {
            super(1);
        }

        /* renamed from: a */
        public final C43064a invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            return (C43064a) mVar.mo95678e();
        }
    }

    /* renamed from: aa1.h$d */
    static final class C30920d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30920d f77045d = new C30920d();

        /* renamed from: aa1.h$d$a */
        static final class C30921a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C30921a f77046d = new C30921a();

            C30921a() {
                super(1);
            }

            /* renamed from: a */
            public final C30924f invoke(Object obj) {
                C41536l.m120489i(obj, "it");
                return new C30924f.C30927c(obj);
            }
        }

        /* renamed from: aa1.h$d$b */
        static final class C30922b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C30922b f77047d = new C30922b();

            C30922b() {
                super(1);
            }

            /* renamed from: a */
            public final C30924f invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C30924f.C30925a(th);
            }
        }

        C30920d() {
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C30924f m92168d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C30924f) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C30924f m92169e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C30924f) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C43064a aVar) {
            C41536l.m120489i(aVar, "sourceProvider");
            return ((C40749p) aVar.invoke()).mo95026k0(new C30930i(C30921a.f77046d)).mo95035t0(new C30931j(C30922b.f77047d)).mo94977D0(C30924f.C30926b.f77049a);
        }
    }

    /* renamed from: aa1.h$e */
    public static final class C30923e {
        private C30923e() {
        }

        public /* synthetic */ C30923e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: aa1.h$f */
    public static abstract class C30924f {

        /* renamed from: aa1.h$f$a */
        public static final class C30925a extends C30924f {

            /* renamed from: a */
            private final Throwable f77048a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C30925a(Throwable th) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(th, "throwable");
                this.f77048a = th;
            }

            /* renamed from: a */
            public final Throwable mo71141a() {
                return this.f77048a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C30925a) && C41536l.m120484d(this.f77048a, ((C30925a) obj).f77048a);
            }

            public int hashCode() {
                return this.f77048a.hashCode();
            }

            public String toString() {
                Throwable th = this.f77048a;
                return "Error(throwable=" + th + ")";
            }
        }

        /* renamed from: aa1.h$f$b */
        public static final class C30926b extends C30924f {

            /* renamed from: a */
            public static final C30926b f77049a = new C30926b();

            private C30926b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: aa1.h$f$c */
        public static final class C30927c extends C30924f {

            /* renamed from: a */
            private final Object f77050a;

            public C30927c(Object obj) {
                super((DefaultConstructorMarker) null);
                this.f77050a = obj;
            }

            /* renamed from: a */
            public final Object mo71145a() {
                return this.f77050a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C30927c) && C41536l.m120484d(this.f77050a, ((C30927c) obj).f77050a);
            }

            public int hashCode() {
                Object obj = this.f77050a;
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            }

            public String toString() {
                Object obj = this.f77050a;
                return "Success(data=" + obj + ")";
            }
        }

        private C30924f() {
        }

        public /* synthetic */ C30924f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: aa1.h$g */
    private static final class C30928g {

        /* renamed from: a */
        private final C43064a f77051a;

        /* renamed from: b */
        private final C30929h f77052b;

        public C30928g(C43064a aVar, C30929h hVar) {
            C41536l.m120489i(aVar, "sourceProvider");
            C41536l.m120489i(hVar, "refresh");
            this.f77051a = aVar;
            this.f77052b = hVar;
        }

        /* renamed from: a */
        public final C30929h mo71149a() {
            return this.f77052b;
        }

        /* renamed from: b */
        public final C43064a mo71150b() {
            return this.f77051a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30928g)) {
                return false;
            }
            C30928g gVar = (C30928g) obj;
            return C41536l.m120484d(this.f77051a, gVar.f77051a) && this.f77052b == gVar.f77052b;
        }

        public int hashCode() {
            return (this.f77051a.hashCode() * 31) + this.f77052b.hashCode();
        }

        public String toString() {
            C43064a aVar = this.f77051a;
            C30929h hVar = this.f77052b;
            return "Param(sourceProvider=" + aVar + ", refresh=" + hVar + ")";
        }
    }

    /* renamed from: aa1.h$h */
    public enum C30929h {
        LATEST,
        DROP,
        NO_REFRESH
    }

    public C30916h() {
        C40776f f1 = C40767b.m118210h1().mo95124f1();
        C41536l.m120488h(f1, "create<Param<T>>().toSerialized()");
        this.f77039a = f1;
        C40765a i1 = C40765a.m118199i1(-1);
        C41536l.m120488h(i1, "createDefault<Any>(EMPTY)");
        this.f77040b = i1;
        this.f77041c = i1.mo94990M(new C30910b()).mo95026k0(new C30911c());
        f1.mo95014Y0(i1, new C30912d(C30917a.f77042d)).mo94990M(new C30913e(C30918b.f77043d)).mo95026k0(new C30914f(C30919c.f77044d)).mo94989L0(new C30915g(C30920d.f77045d)).mo95043y().mo95016c(i1);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C41224m m92154h(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final boolean m92155i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C43064a m92156j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C43064a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C40754t m92157k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final boolean m92158m(Object obj) {
        C41536l.m120489i(obj, "it");
        return !C41536l.m120484d(obj, -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final C30924f m92159n(Object obj) {
        C41536l.m120489i(obj, "it");
        return (C30924f) obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final C40754t m92160p(C30916h hVar, C43064a aVar, C30929h hVar2) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(aVar, "$sourceProvider");
        C41536l.m120489i(hVar2, "$refresh");
        hVar.f77039a.onNext(new C30928g(aVar, hVar2));
        return hVar.f77041c;
    }

    /* renamed from: l */
    public final void mo71133l() {
        this.f77040b.onNext(-1);
    }

    /* renamed from: o */
    public final C40749p mo71134o(C30929h hVar, C43064a aVar) {
        C41536l.m120489i(hVar, "refresh");
        C41536l.m120489i(aVar, "sourceProvider");
        C40749p v = C40749p.m118055v(new C30909a(this, aVar, hVar));
        C41536l.m120488h(v, "defer {\n            requ…entryObservable\n        }");
        return v;
    }
}
