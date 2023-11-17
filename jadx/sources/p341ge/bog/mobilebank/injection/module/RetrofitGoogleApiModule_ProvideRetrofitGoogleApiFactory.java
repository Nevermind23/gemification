package p341ge.bog.mobilebank.injection.module;

import ge1.C41084a;
import p341ge.bog.mobilebank.rest.RetrofitGoogleApi;
import p341ge.bog.mobilebank.rest.model.RetrofitGoogleClient;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.injection.module.RetrofitGoogleApiModule_ProvideRetrofitGoogleApiFactory */
public final class RetrofitGoogleApiModule_ProvideRetrofitGoogleApiFactory implements C41084a {
    private final RetrofitGoogleApiModule module;
    private final C41084a retrofitClientProvider;

    public RetrofitGoogleApiModule_ProvideRetrofitGoogleApiFactory(RetrofitGoogleApiModule retrofitGoogleApiModule, C41084a aVar) {
        this.module = retrofitGoogleApiModule;
        this.retrofitClientProvider = aVar;
    }

    public static RetrofitGoogleApiModule_ProvideRetrofitGoogleApiFactory create(RetrofitGoogleApiModule retrofitGoogleApiModule, C41084a aVar) {
        return new RetrofitGoogleApiModule_ProvideRetrofitGoogleApiFactory(retrofitGoogleApiModule, aVar);
    }

    public static RetrofitGoogleApi provideRetrofitGoogleApi(RetrofitGoogleApiModule retrofitGoogleApiModule, RetrofitGoogleClient retrofitGoogleClient) {
        return (RetrofitGoogleApi) C18329d.m62677d(retrofitGoogleApiModule.provideRetrofitGoogleApi(retrofitGoogleClient));
    }

    public RetrofitGoogleApi get() {
        return provideRetrofitGoogleApi(this.module, (RetrofitGoogleClient) this.retrofitClientProvider.get());
    }
}
