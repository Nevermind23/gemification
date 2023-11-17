package p341ge.bog.mobilebank.injection.module;

import p341ge.bog.mobilebank.rest.RetrofitApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import zh1.C43511w;

/* renamed from: ge.bog.mobilebank.injection.module.RetrofitApiModule */
public class RetrofitApiModule {
    /* access modifiers changed from: package-private */
    public RetrofitApi provideRetrofitApi(IRetrofitService iRetrofitService, C43511w wVar) {
        return new RetrofitApi(iRetrofitService, (IRetrofitService) wVar.mo102220b(IRetrofitService.class));
    }

    /* access modifiers changed from: package-private */
    public IRetrofitService provideRetrofitService(C43511w wVar) {
        return (IRetrofitService) wVar.mo102220b(IRetrofitService.class);
    }
}
