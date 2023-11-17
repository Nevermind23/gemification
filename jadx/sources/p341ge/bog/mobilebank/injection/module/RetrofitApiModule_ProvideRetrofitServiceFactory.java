package p341ge.bog.mobilebank.injection.module;

import ge1.C41084a;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p640vf.C18329d;
import zh1.C43511w;

/* renamed from: ge.bog.mobilebank.injection.module.RetrofitApiModule_ProvideRetrofitServiceFactory */
public final class RetrofitApiModule_ProvideRetrofitServiceFactory implements C41084a {
    private final RetrofitApiModule module;
    private final C41084a retrofitProvider;

    public RetrofitApiModule_ProvideRetrofitServiceFactory(RetrofitApiModule retrofitApiModule, C41084a aVar) {
        this.module = retrofitApiModule;
        this.retrofitProvider = aVar;
    }

    public static RetrofitApiModule_ProvideRetrofitServiceFactory create(RetrofitApiModule retrofitApiModule, C41084a aVar) {
        return new RetrofitApiModule_ProvideRetrofitServiceFactory(retrofitApiModule, aVar);
    }

    public static IRetrofitService provideRetrofitService(RetrofitApiModule retrofitApiModule, C43511w wVar) {
        return (IRetrofitService) C18329d.m62677d(retrofitApiModule.provideRetrofitService(wVar));
    }

    public IRetrofitService get() {
        return provideRetrofitService(this.module, (C43511w) this.retrofitProvider.get());
    }
}
