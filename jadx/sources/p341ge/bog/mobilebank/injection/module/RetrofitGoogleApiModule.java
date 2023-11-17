package p341ge.bog.mobilebank.injection.module;

import p341ge.bog.mobilebank.rest.RetrofitGoogleApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RetrofitGoogleClient;

/* renamed from: ge.bog.mobilebank.injection.module.RetrofitGoogleApiModule */
public class RetrofitGoogleApiModule {
    /* access modifiers changed from: package-private */
    public RetrofitGoogleApi provideRetrofitGoogleApi(RetrofitGoogleClient retrofitGoogleClient) {
        return new RetrofitGoogleApi(retrofitGoogleClient);
    }

    /* access modifiers changed from: package-private */
    public RetrofitGoogleClient provideRetrofitGoogleClient(PreferencesApiManager preferencesApiManager) {
        return new RetrofitGoogleClient(preferencesApiManager);
    }
}
