package p788iq;

import cf1.C40407d;
import ed1.C40734b;
import ed1.C40762x;
import g91.C32359z0;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p716br.C19400a;
import p817lq.C26057b;
import p827mq.C26256a;
import p861pu.C27621a;
import ue1.C43075l;

/* renamed from: iq.b */
public final class C25247b implements C26256a {

    /* renamed from: a */
    private final IRetrofitService f64838a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C27621a f64839b;

    /* renamed from: iq.b$a */
    static final class C25248a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25247b f64840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25248a(C25247b bVar) {
            super(1);
            this.f64840d = bVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f64840d.f64839b.mo66995b(list);
        }
    }

    public C25247b(IRetrofitService iRetrofitService, C27621a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f64838a = iRetrofitService;
        this.f64839b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final List m80341e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo63763a() {
        C40762x<BankApiResponse<List<LookupEntity>>> lookup = this.f64838a.lookup(BankApi.COMMON_GET_LOOKUP_DATA, "BECOME_SOLO_APPLICATION_INCOME_RANGE,BECOME_SOLO_APPLICATION_FEE_PAYMENT_PERIOD");
        C41536l.m120488h(lookup, "service.lookup(\n        …PAYMENT_PERIOD\"\n        )");
        C40762x A = C19273c.m64722h(lookup).mo95062A(new C25246a(new C25248a(this)));
        C41536l.m120488h(A, "override fun getDropdown… { mapper.transform(it) }");
        return A;
    }

    /* renamed from: b */
    public C40734b mo63764b(C26057b bVar) {
        ServiceCenterUiModel serviceCenterUiModel;
        C41536l.m120489i(bVar, "params");
        List f = bVar.mo64969g().mo49709f();
        if (f == null || (serviceCenterUiModel = (ServiceCenterUiModel) C41358y.m120009Y(f)) == null) {
            serviceCenterUiModel = bVar.mo64969g();
        }
        IRetrofitService iRetrofitService = this.f64838a;
        String a = bVar.mo64962a();
        String d = bVar.mo64965d();
        String i = bVar.mo64972i();
        C19400a aVar = C19400a.f53623a;
        String f2 = aVar.mo47628f(bVar.mo64966e());
        String f3 = aVar.mo47628f(bVar.mo64968f());
        String e = serviceCenterUiModel.mo49707e();
        String b = serviceCenterUiModel.mo49704b();
        String name = bVar.mo64970h().name();
        Long c = bVar.mo64964c();
        byte[] bytes = bVar.mo64963b().getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        C40762x<BankApiResponse<Object>> sendSoloApplication = iRetrofitService.sendSoloApplication(BankApi.APPLICATIONS_CREATE_SOLO_APPLICATION, a, d, i, f2, f3, e, b, name, c, C32359z0.m95597y(bytes));
        C41536l.m120488h(sendSoloApplication, "service.sendSoloApplicat….toByteArray())\n        )");
        return C19273c.m64720f(sendSoloApplication);
    }
}
