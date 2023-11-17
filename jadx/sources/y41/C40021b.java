package y41;

import c51.C31275a;
import ed1.C40762x;
import k41.C36869a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import n41.C37350a;
import p341ge.bog.mobilebank.shared2.serverstatus.data.network.model.ServerStatusApiModel;
import ue1.C43075l;
import x41.C39788f;
import z41.C40147a;

/* renamed from: y41.b */
public final class C40021b implements C39788f {

    /* renamed from: a */
    private final C40147a f95020a;

    /* renamed from: b */
    private final C36869a f95021b;

    /* renamed from: c */
    private final C37350a f95022c;

    /* renamed from: y41.b$a */
    static final class C40022a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C40022a f95023d = new C40022a();

        C40022a() {
            super(1);
        }

        /* renamed from: a */
        public final C31275a invoke(ServerStatusApiModel serverStatusApiModel) {
            C41536l.m120489i(serverStatusApiModel, "it");
            return new C31275a(serverStatusApiModel.getServerStatus(), serverStatusApiModel.getServerStatusDesc(), serverStatusApiModel.getMustUpdateClient(), serverStatusApiModel.getMustUpdateClientDesc(), serverStatusApiModel.getServerTime());
        }
    }

    public C40021b(C40147a aVar, C36869a aVar2, C37350a aVar3) {
        C41536l.m120489i(aVar, "serverStatusService");
        C41536l.m120489i(aVar2, "deviceInfo");
        C41536l.m120489i(aVar3, "languageStore");
        this.f95020a = aVar;
        this.f95021b = aVar2;
        this.f95022c = aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C31275a m115966b(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31275a) lVar.invoke(obj);
    }

    public C40762x getStatus() {
        C40762x A = this.f95020a.mo94089a(this.f95022c.getLanguage().mo90433b(), this.f95021b.mo89793a()).mo95062A(new C40020a(C40022a.f95023d));
        C41536l.m120488h(A, "serverStatusService.getS…e\n            )\n        }");
        return A;
    }
}
