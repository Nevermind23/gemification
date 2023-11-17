package p886rz;

import ed1.C40734b;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p907tz.C28532a;

/* renamed from: rz.a */
public final class C28114a implements C28532a {

    /* renamed from: a */
    private final IRetrofitService f71462a;

    public C28114a(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f71462a = iRetrofitService;
    }

    /* renamed from: a */
    public C40734b mo67648a(long j, String str) {
        C41536l.m120489i(str, "mailAddress");
        C40762x<BankApiResponse<Object>> creditInfoRegisterUser = this.f71462a.creditInfoRegisterUser(BankApi.CREDIT_INFO_REGISTER_USER, Long.valueOf(j), str);
        C41536l.m120488h(creditInfoRegisterUser, "service.creditInfoRegist…    mailAddress\n        )");
        return C19273c.m64720f(creditInfoRegisterUser);
    }
}
