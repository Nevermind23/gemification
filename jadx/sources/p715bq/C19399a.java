package p715bq;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p734dq.C20048a;

/* renamed from: bq.a */
public final class C19399a implements C20048a {

    /* renamed from: a */
    private final IRetrofitService f53622a;

    public C19399a(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f53622a = iRetrofitService;
    }

    public C40762x bannerClicked(String str) {
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C40762x<BankApiResponse<Object>> bannerClicked = this.f53622a.bannerClicked(str);
        C41536l.m120488h(bannerClicked, "service.bannerClicked(serviceId)");
        return bannerClicked;
    }

    public C40762x removeBanner(String str) {
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C40762x<BankApiResponse<Object>> removeBanner = this.f53622a.removeBanner(str);
        C41536l.m120488h(removeBanner, "service.removeBanner(serviceId)");
        return removeBanner;
    }
}
