package p341ge.bog.mobilebank.injection.module;

import ge1.C41084a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RetrofitGoogleClient;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.injection.module.RetrofitGoogleApiModule_ProvideRetrofitGoogleClientFactory */
public final class RetrofitGoogleApiModule_ProvideRetrofitGoogleClientFactory implements C41084a {
    private final RetrofitGoogleApiModule module;
    private final C41084a preferencesApiManagerProvider;

    public RetrofitGoogleApiModule_ProvideRetrofitGoogleClientFactory(RetrofitGoogleApiModule retrofitGoogleApiModule, C41084a aVar) {
        this.module = retrofitGoogleApiModule;
        this.preferencesApiManagerProvider = aVar;
    }

    public static RetrofitGoogleApiModule_ProvideRetrofitGoogleClientFactory create(RetrofitGoogleApiModule retrofitGoogleApiModule, C41084a aVar) {
        return new RetrofitGoogleApiModule_ProvideRetrofitGoogleClientFactory(retrofitGoogleApiModule, aVar);
    }

    public static RetrofitGoogleClient provideRetrofitGoogleClient(RetrofitGoogleApiModule retrofitGoogleApiModule, PreferencesApiManager preferencesApiManager) {
        return (RetrofitGoogleClient) C18329d.m62677d(retrofitGoogleApiModule.provideRetrofitGoogleClient(preferencesApiManager));
    }

    public RetrofitGoogleClient get() {
        return provideRetrofitGoogleClient(this.module, (PreferencesApiManager) this.preferencesApiManagerProvider.get());
    }
}
