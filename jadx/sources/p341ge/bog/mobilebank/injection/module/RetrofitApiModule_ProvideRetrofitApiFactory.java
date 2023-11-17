package p341ge.bog.mobilebank.injection.module;

import ge1.C41084a;
import p341ge.bog.mobilebank.rest.RetrofitApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p640vf.C18329d;
import zh1.C43511w;

/* renamed from: ge.bog.mobilebank.injection.module.RetrofitApiModule_ProvideRetrofitApiFactory */
public final class RetrofitApiModule_ProvideRetrofitApiFactory implements C41084a {
    private final C41084a mBankServiceProvider;
    private final RetrofitApiModule module;
    private final C41084a retrofitProvider;

    public RetrofitApiModule_ProvideRetrofitApiFactory(RetrofitApiModule retrofitApiModule, C41084a aVar, C41084a aVar2) {
        this.module = retrofitApiModule;
        this.mBankServiceProvider = aVar;
        this.retrofitProvider = aVar2;
    }

    public static RetrofitApiModule_ProvideRetrofitApiFactory create(RetrofitApiModule retrofitApiModule, C41084a aVar, C41084a aVar2) {
        return new RetrofitApiModule_ProvideRetrofitApiFactory(retrofitApiModule, aVar, aVar2);
    }

    public static RetrofitApi provideRetrofitApi(RetrofitApiModule retrofitApiModule, IRetrofitService iRetrofitService, C43511w wVar) {
        return (RetrofitApi) C18329d.m62677d(retrofitApiModule.provideRetrofitApi(iRetrofitService, wVar));
    }

    public RetrofitApi get() {
        return provideRetrofitApi(this.module, (IRetrofitService) this.mBankServiceProvider.get(), (C43511w) this.retrofitProvider.get());
    }
}
