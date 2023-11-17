package p341ge.bog.mobilebank.injection.module;

import p341ge.bog.mobilebank.rest.GoogleApi;
import p341ge.bog.mobilebank.rest.RetrofitGoogleApi;

/* renamed from: ge.bog.mobilebank.injection.module.GoogleApiModule */
public abstract class GoogleApiModule {
    /* access modifiers changed from: package-private */
    public abstract GoogleApi provideGoogleApi(RetrofitGoogleApi retrofitGoogleApi);
}
