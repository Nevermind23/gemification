package p910ur;

import ed1.C40762x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.contactus.data.model.SoloBankerInfoApiEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p921vr.C29155a;
import p932wr.C29566a;
import p932wr.C29567b;
import ue1.C43075l;

/* renamed from: ur.c */
public final class C28928c implements C29567b {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C28929a f73782c = new C28929a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C29566a f73783d;

    /* renamed from: a */
    private final IRetrofitService f73784a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C29155a f73785b;

    /* renamed from: ur.c$a */
    private static final class C28929a {
        private C28929a() {
        }

        public /* synthetic */ C28929a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ur.c$b */
    static final class C28930b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28928c f73786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28930b(C28928c cVar) {
            super(1);
            this.f73786d = cVar;
        }

        /* renamed from: a */
        public final C29566a invoke(SoloBankerInfoApiEntity soloBankerInfoApiEntity) {
            C41536l.m120489i(soloBankerInfoApiEntity, "it");
            return this.f73786d.f73785b.mo69004a(soloBankerInfoApiEntity);
        }
    }

    /* renamed from: ur.c$c */
    static final class C28931c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C28931c f73787d = new C28931c();

        C28931c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo68684a(C29566a aVar) {
            C28929a unused = C28928c.f73782c;
            C28928c.f73783d = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68684a((C29566a) obj);
            return C41238w.f97225a;
        }
    }

    public C28928c(IRetrofitService iRetrofitService, C29155a aVar) {
        C41536l.m120489i(iRetrofitService, "api");
        C41536l.m120489i(aVar, "soloBankerInfoMapper");
        this.f73784a = iRetrofitService;
        this.f73785b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C29566a m88568g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29566a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m88569h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo68682a(String str) {
        C40762x xVar;
        C41536l.m120489i(str, "customerId");
        C29566a aVar = f73783d;
        if (aVar != null) {
            xVar = C40762x.m118162z(aVar);
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        C40762x<BankApiResponse<SoloBankerInfoApiEntity>> soloBankerInfo = this.f73784a.getSoloBankerInfo("CLIENTS_GET_BANKER_INFO", str);
        C41536l.m120488h(soloBankerInfo, "api.getSoloBankerInfo(\n … customerId\n            )");
        C40762x m = C19273c.m64722h(soloBankerInfo).mo95062A(new C28926a(new C28930b(this))).mo95084m(new C28927b(C28931c.f73787d));
        C41536l.m120488h(m, "run {\n            api.ge…nkerInfo = it }\n        }");
        return m;
    }
}
