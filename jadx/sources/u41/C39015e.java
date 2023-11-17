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
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p316xa.C8982a;
import p341ge.bog.mobilebank.shared2.network.models.BffApiResponse;
import ue1.C43075l;
import zh1.C43443b;
import zh1.C43444c;
import zh1.C43510v;
import zh1.C43511w;

/* renamed from: u41.e */
public final class C39015e extends C43444c.C43445a {

    /* renamed from: a */
    private final C40325g f93136a;

    /* renamed from: u41.e$a */
    private static final class C39016a implements C43444c {

        /* renamed from: a */
        private final C43444c f93137a;

        /* renamed from: b */
        private final boolean f93138b;

        /* renamed from: u41.e$a$a */
        static final class C39017a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C39017a f93139d = new C39017a();

            C39017a() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(BffApiResponse bffApiResponse) {
                C41536l.m120489i(bffApiResponse, "it");
                return bffApiResponse.getResult();
            }
        }

        /* renamed from: u41.e$a$b */
        static final class C39018b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C39018b f93140d = new C39018b();

            C39018b() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(BffApiResponse bffApiResponse) {
                C41536l.m120489i(bffApiResponse, "it");
                return bffApiResponse.getResult();
            }
        }

        /* renamed from: u41.e$a$c */
        static final class C39019c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C39019c f93141d = new C39019c();

            C39019c() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(BffApiResponse bffApiResponse) {
                C41536l.m120489i(bffApiResponse, "it");
                return bffApiResponse.getResult();
            }
        }

        /* renamed from: u41.e$a$d */
        static final class C39020d extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C39020d f93142d = new C39020d();

            C39020d() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(BffApiResponse bffApiResponse) {
                C41536l.m120489i(bffApiResponse, "it");
                return bffApiResponse.getResult();
            }
        }

        public C39016a(C43444c cVar, boolean z) {
            C41536l.m120489i(cVar, "wrapped");
            this.f93137a = cVar;
            this.f93138b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final Object m113919g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final Object m113920h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final Object m113921i(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final Object m113922j(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return lVar.invoke(obj);
        }

        /* renamed from: k */
        private final C40741h m113923k(C40741h hVar) {
            C41536l.m120487g(hVar, "null cannot be cast to non-null type io.reactivex.Flowable<ge.bog.mobilebank.shared2.network.models.BffApiResponse<R of ge.bog.mobilebank.shared2.network.retrofit.calladapter.BffRxResultHandlingCallAdapterFactory.RxCallAdapterWrapper>>");
            return hVar;
        }

        /* renamed from: l */
        private final C40744k m113924l(C40744k kVar) {
            C41536l.m120487g(kVar, "null cannot be cast to non-null type io.reactivex.Maybe<ge.bog.mobilebank.shared2.network.models.BffApiResponse<R of ge.bog.mobilebank.shared2.network.retrofit.calladapter.BffRxResultHandlingCallAdapterFactory.RxCallAdapterWrapper>>");
            return kVar;
        }

        /* renamed from: m */
        private final C40749p m113925m(C40749p pVar) {
            C41536l.m120487g(pVar, "null cannot be cast to non-null type io.reactivex.Observable<ge.bog.mobilebank.shared2.network.models.BffApiResponse<R of ge.bog.mobilebank.shared2.network.retrofit.calladapter.BffRxResultHandlingCallAdapterFactory.RxCallAdapterWrapper>>");
            return pVar;
        }

        /* renamed from: n */
        private final C40762x m113926n(C40762x xVar) {
            C41536l.m120487g(xVar, "null cannot be cast to non-null type io.reactivex.Single<ge.bog.mobilebank.shared2.network.models.BffApiResponse<R of ge.bog.mobilebank.shared2.network.retrofit.calladapter.BffRxResultHandlingCallAdapterFactory.RxCallAdapterWrapper>>");
            return xVar;
        }

        /* renamed from: a */
        public Type mo92683a() {
            Type a = this.f93137a.mo92683a();
            C41536l.m120488h(a, "wrapped.responseType()");
            return a;
        }

        /* renamed from: b */
        public Object mo92684b(C43443b bVar) {
            C41536l.m120489i(bVar, "call");
            Object b = this.f93137a.mo92684b(bVar);
            if (b instanceof C40762x) {
                C40762x n = m113926n((C40762x) b);
                if (this.f93138b) {
                    b = n.mo95092y();
                } else {
                    b = n.mo95062A(new C39011a(C39017a.f93139d));
                }
            } else if (b instanceof C40749p) {
                b = m113925m((C40749p) b).mo95026k0(new C39012b(C39018b.f93140d));
            } else if (b instanceof C40741h) {
                b = m113923k((C40741h) b).mo94939v(new C39013c(C39019c.f93141d));
            } else if (b instanceof C40744k) {
                b = m113924l((C40744k) b).mo94956r(new C39014d(C39020d.f93142d));
            }
            C41536l.m120488h(b, "when (val result = wrapp…          }\n            }");
            return b;
        }
    }

    public C39015e(C40325g gVar) {
        C41536l.m120489i(gVar, "original");
        this.f93136a = gVar;
    }

    /* renamed from: d */
    private final boolean m113913d(Type type) {
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
        if (!m113913d(c)) {
            return null;
        }
        boolean d = C41536l.m120484d(c, C40734b.class);
        Class<BffApiResponse> cls = BffApiResponse.class;
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
        C43444c a = this.f93136a.mo92682a(type2, annotationArr, wVar);
        if (a == null) {
            return null;
        }
        return new C39016a(a, d);
    }
}
