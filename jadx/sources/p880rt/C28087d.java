package p880rt;

import ed1.C40762x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.servicecenter.entity.ServiceCenterEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p712ax.C19280a;
import p890st.C28260a;
import p970zw.C30412a;
import ue1.C43075l;

/* renamed from: rt.d */
public final class C28087d implements C19280a {

    /* renamed from: g */
    public static final C28088a f71437g = new C28088a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f71438d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28260a f71439e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C30412a f71440f;

    /* renamed from: rt.d$a */
    public static final class C28088a {
        private C28088a() {
        }

        public /* synthetic */ C28088a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: rt.d$b */
    static final class C28089b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28087d f71441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28089b(C28087d dVar) {
            super(1);
            this.f71441d = dVar;
        }

        /* renamed from: a */
        public final C30412a invoke(ServiceCenterEntity serviceCenterEntity) {
            C41536l.m120489i(serviceCenterEntity, "it");
            return this.f71441d.f71439e.mo67843a(serviceCenterEntity);
        }
    }

    /* renamed from: rt.d$c */
    static final class C28090c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28087d f71442d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28090c(C28087d dVar) {
            super(1);
            this.f71442d = dVar;
        }

        /* renamed from: a */
        public final void mo67626a(C30412a aVar) {
            this.f71442d.f71440f = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67626a((C30412a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: rt.d$d */
    static final class C28091d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28087d f71443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28091d(C28087d dVar) {
            super(1);
            this.f71443d = dVar;
        }

        /* renamed from: a */
        public final C30412a invoke(ServiceCenterEntity serviceCenterEntity) {
            C41536l.m120489i(serviceCenterEntity, "it");
            return this.f71443d.f71439e.mo67843a(serviceCenterEntity);
        }
    }

    public C28087d(IRetrofitService iRetrofitService, C28260a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f71438d = iRetrofitService;
        this.f71439e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final C30412a m86523e4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C30412a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public static final void m86524f4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public static final C30412a m86525g4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C30412a) lVar.invoke(obj);
    }

    /* renamed from: b */
    public C40762x mo47505b(String str) {
        C41536l.m120489i(str, "bankLine");
        C40762x<BankApiResponse<ServiceCenterEntity>> serviceCenters = this.f71438d.getServiceCenters("COMMON_GET_ALL_SC_ROUTES", str);
        C41536l.m120488h(serviceCenters, "service.getServiceCenter…_ALL_SC_ROUTES, bankLine)");
        C40762x A = C19273c.m64722h(serviceCenters).mo95062A(new C28086c(new C28091d(this)));
        C41536l.m120488h(A, "override fun getServiceC…per.transform(it) }\n    }");
        return A;
    }

    public void clean() {
        this.f71440f = null;
    }

    /* renamed from: r2 */
    public C40762x mo47506r2() {
        C30412a aVar = this.f71440f;
        if (aVar == null) {
            C40762x<BankApiResponse<ServiceCenterEntity>> serviceCenters = this.f71438d.getServiceCenters("COMMON_GET_ALL_SC_ROUTES", (String) null);
            C41536l.m120488h(serviceCenters, "service.getServiceCenter…_GET_ALL_SC_ROUTES, null)");
            C40762x m = C19273c.m64722h(serviceCenters).mo95062A(new C28084a(new C28089b(this))).mo95084m(new C28085b(new C28090c(this)));
            C41536l.m120488h(m, "override fun getServiceC…eCenters)\n        }\n    }");
            return m;
        }
        C40762x z = C40762x.m118162z(aVar);
        C41536l.m120488h(z, "{\n            Single.jus…serviceCenters)\n        }");
        return z;
    }
}
