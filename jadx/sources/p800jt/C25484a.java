package p800jt;

import ed1.C40734b;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p833mw.C26309a;

/* renamed from: jt.a */
public final class C25484a implements C26309a {

    /* renamed from: a */
    private final IRetrofitService f65149a;

    public C25484a(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f65149a = iRetrofitService;
    }

    /* renamed from: a */
    public C40734b mo64044a(long j, String str, boolean z, String str2, String str3) {
        String str4;
        C41536l.m120489i(str, "responseKey");
        C41536l.m120489i(str2, "otp");
        C41536l.m120489i(str3, "otpRequestId");
        IRetrofitService iRetrofitService = this.f65149a;
        if (z) {
            str4 = BankApi.APPLICATIONS_RBS_PROCESS_RBS_RESPONSE;
        } else {
            str4 = BankApi.APPLICATIONS_RBS_REJECT_RESPONSE;
        }
        C40762x<BankApiResponse<Object>> confirmPendingProduct = iRetrofitService.confirmPendingProduct(str4, Long.valueOf(j), str, str2, str3);
        C41536l.m120488h(confirmPendingProduct, "service.confirmPendingPr…p, otpRequestId\n        )");
        return C19273c.m64720f(confirmPendingProduct);
    }

    /* renamed from: b */
    public C40762x mo64045b(long j) {
        C40762x<BankApiResponse<String>> pendingProductContract = this.f65149a.getPendingProductContract(BankApi.APPLICATIONS_RBS_GET_RESPONSE_HTML, j);
        C41536l.m120488h(pendingProductContract, "service.getPendingProduc…ONSE_HTML, responseDetId)");
        return C19273c.m64722h(pendingProductContract);
    }
}
