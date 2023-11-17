package p931wq;

import ed1.C40762x;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ContractEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p706ar.C19270b;
import p707as.C19273c;
import p871qu.C27865a;
import p964zq.C30393a;
import ue1.C43075l;

/* renamed from: wq.c */
public final class C29563c implements C19270b {

    /* renamed from: c */
    public static final C29564a f74676c = new C29564a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f74677a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C30393a f74678b;

    /* renamed from: wq.c$a */
    public static final class C29564a {
        private C29564a() {
        }

        public /* synthetic */ C29564a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wq.c$b */
    static final class C29565b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29563c f74679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29565b(C29563c cVar) {
            super(1);
            this.f74679d = cVar;
        }

        /* renamed from: a */
        public final C27865a invoke(ContractEntity contractEntity) {
            C41536l.m120489i(contractEntity, "it");
            return this.f74679d.f74678b.mo70745a(contractEntity);
        }
    }

    public C29563c(IRetrofitService iRetrofitService, C30393a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f74677a = iRetrofitService;
        this.f74678b = aVar;
    }

    /* renamed from: d */
    private final C40762x m89748d(C40762x xVar) {
        C40762x A = C19273c.m64722h(xVar).mo95062A(new C29562b(new C29565b(this)));
        C41536l.m120488h(A, "private fun mapToResult(… { mapper.transform(it) }");
        return A;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C27865a m89749e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27865a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo47494a(Map map) {
        C41536l.m120489i(map, "parameters");
        C40762x<BankApiResponse<ContractEntity>> contract = this.f74677a.getContract("COMMON_GET_CONTRACT", (Map<String, Object>) map);
        C41536l.m120488h(contract, "service.getContract(SERVICE_ID, parameters)");
        return m89748d(contract);
    }

    public C40762x getContract(String str) {
        C41536l.m120489i(str, "contractType");
        C40762x<BankApiResponse<ContractEntity>> contract = this.f74677a.getContract("COMMON_GET_CONTRACT", str);
        C41536l.m120488h(contract, "service.getContract(SERVICE_ID, contractType)");
        return m89748d(contract);
    }
}
