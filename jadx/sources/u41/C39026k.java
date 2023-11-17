package u41;

import ai1.C40321d;
import ai1.C40325g;
import ed1.C40734b;
import ed1.C40741h;
import ed1.C40744k;
import ed1.C40749p;
import ed1.C40762x;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import jd1.C41399f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p316xa.C8982a;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import ue1.C43075l;
import zh1.C43443b;
import zh1.C43444c;
import zh1.C43510v;
import zh1.C43511w;

/* renamed from: u41.k */
public final class C39026k extends C43444c.C43445a {

    /* renamed from: a */
    private final C40325g f93147a;

    /* renamed from: u41.k$a */
    private static final class C39027a implements C43444c {

        /* renamed from: a */
        private final C43444c f93148a;

        /* renamed from: b */
        private final boolean f93149b;

        /* renamed from: c */
        private final C41399f f93150c = new C39025j();

        /* renamed from: u41.k$a$a */
        static final class C39028a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C39028a f93151d = new C39028a();

            C39028a() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(BankApiResponse bankApiResponse) {
                C41536l.m120489i(bankApiResponse, "it");
                return bankApiResponse.getResult();
            }
        }

        /* renamed from: u41.k$a$b */
        static final class C39029b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C39029b f93152d = new C39029b();

            C39029b() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(BankApiResponse bankApiResponse) {
                C41536l.m120489i(bankApiResponse, "it");
                return bankApiResponse.getResult();
            }
        }

        /* renamed from: u41.k$a$c */
        static final class C39030c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C39030c f93153d = new C39030c();

            C39030c() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(BankApiResponse bankApiResponse) {
                C41536l.m120489i(bankApiResponse, "it");
                return bankApiResponse.getResult();
            }
        }

        /* renamed from: u41.k$a$d */
        static final class C39031d extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C39031d f93154d = new C39031d();

            C39031d() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(BankApiResponse bankApiResponse) {
                C41536l.m120489i(bankApiResponse, "it");
                return bankApiResponse.getResult();
            }
        }

        public C39027a(C43444c cVar, boolean z) {
            C41536l.m120489i(cVar, "wrapped");
            this.f93148a = cVar;
            this.f93149b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final Object m113940h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final Object m113941i(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final Object m113942j(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final Object m113943k(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return lVar.invoke(obj);
        }

        /* renamed from: l */
        private final C40741h m113944l(C40741h hVar) {
            C41536l.m120487g(hVar, "null cannot be cast to non-null type io.reactivex.Flowable<ge.bog.mobilebank.shared2.network.BankApiResponse<R of ge.bog.mobilebank.shared2.network.retrofit.calladapter.RbRxErrorHandlingCallAdapterFactory.RxCallAdapterWrapper>>");
            return hVar;
        }

        /* renamed from: m */
        private final C40744k m113945m(C40744k kVar) {
            C41536l.m120487g(kVar, "null cannot be cast to non-null type io.reactivex.Maybe<ge.bog.mobilebank.shared2.network.BankApiResponse<R of ge.bog.mobilebank.shared2.network.retrofit.calladapter.RbRxErrorHandlingCallAdapterFactory.RxCallAdapterWrapper>>");
            return kVar;
        }

        /* renamed from: n */
        private final C40749p m113946n(C40749p pVar) {
            C41536l.m120487g(pVar, "null cannot be cast to non-null type io.reactivex.Observable<ge.bog.mobilebank.shared2.network.BankApiResponse<R of ge.bog.mobilebank.shared2.network.retrofit.calladapter.RbRxErrorHandlingCallAdapterFactory.RxCallAdapterWrapper>>");
            return pVar;
        }

        /* renamed from: o */
        private final C40762x m113947o(C40762x xVar) {
            C41536l.m120487g(xVar, "null cannot be cast to non-null type io.reactivex.Single<ge.bog.mobilebank.shared2.network.BankApiResponse<R of ge.bog.mobilebank.shared2.network.retrofit.calladapter.RbRxErrorHandlingCallAdapterFactory.RxCallAdapterWrapper>>");
            return xVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m113948p(BankApiResponse bankApiResponse) {
            if (!C41536l.m120484d(bankApiResponse.getCode(), BankApiResponse.SUCCESSFUL_RESPONSE_CODE)) {
                C41536l.m120488h(bankApiResponse, "it");
                throw new ApiError(bankApiResponse);
            }
        }

        /* renamed from: a */
        public Type mo92683a() {
            Type a = this.f93148a.mo92683a();
            C41536l.m120488h(a, "wrapped.responseType()");
            return a;
        }

        /* renamed from: b */
        public Object mo92684b(C43443b bVar) {
            C41536l.m120489i(bVar, "call");
            Object b = this.f93148a.mo92684b(bVar);
            if (b instanceof C40762x) {
                C40762x m = m113947o((C40762x) b).mo95084m(this.f93150c);
                C41536l.m120488h(m, "result.cast().doOnSuccess(checkResponseCode)");
                if (this.f93149b) {
                    b = m.mo95092y();
                } else {
                    b = m.mo95062A(new C39021f(C39028a.f93151d));
                }
            } else if (b instanceof C40749p) {
                b = m113946n((C40749p) b).mo94978E(this.f93150c).mo95026k0(new C39022g(C39029b.f93152d));
            } else if (b instanceof C40741h) {
                b = m113944l((C40741h) b).mo94932m(this.f93150c).mo94939v(new C39023h(C39030c.f93153d));
            } else if (b instanceof C40744k) {
                b = m113945m((C40744k) b).mo94951j(this.f93150c).mo94956r(new C39024i(C39031d.f93154d));
            }
            C41536l.m120488h(b, "when (val result = wrapp…          }\n            }");
            return b;
        }
    }

    public C39026k(C40325g gVar) {
        C41536l.m120489i(gVar, "original");
        this.f93147a = gVar;
    }

    /* renamed from: d */
    private final boolean m113933d(Type type) {
        boolean d = C41536l.m120484d(type, C40741h.class);
        boolean d2 = C41536l.m120484d(type, C40762x.class);
        boolean d3 = C41536l.m120484d(type, C40744k.class);
        boolean d4 = C41536l.m120484d(type, C40734b.class);
        if (C41536l.m120484d(type, C40749p.class) || d || d2 || d3 || d4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C43444c mo92682a(Type type, Annotation[] annotationArr, C43511w wVar) {
        Type type2;
        C41536l.m120489i(type, "returnType");
        C41536l.m120489i(annotationArr, "annotations");
        C41536l.m120489i(wVar, "retrofit");
        Class c = C43444c.C43445a.m124641c(type);
        C41536l.m120488h(c, "rawType");
        if (!m113933d(c)) {
            return null;
        }
        boolean d = C41536l.m120484d(c, C40734b.class);
        Class<BankApiResponse> cls = BankApiResponse.class;
        if (d) {
            type2 = C8982a.getParameterized(C40762x.class, cls).getType();
        } else {
            Type b = C43444c.C43445a.m124640b(0, (ParameterizedType) type);
            Class c2 = C43444c.C43445a.m124641c(b);
            if (C41536l.m120484d(c2, cls) || C41536l.m120484d(c2, C43510v.class) || C41536l.m120484d(c2, C40321d.class)) {
                return null;
            }
            type2 = C8982a.getParameterized(c, C8982a.getParameterized(cls, b).getType()).getType();
        }
        C43444c a = this.f93147a.mo92682a(type2, annotationArr, wVar);
        if (a == null) {
            return null;
        }
        return new C39027a(a, d);
    }
}
