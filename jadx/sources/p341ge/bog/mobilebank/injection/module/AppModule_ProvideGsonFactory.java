package p341ge.bog.mobilebank.injection.module;

import com.google.gson.Gson;
import ge1.C41084a;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.injection.module.AppModule_ProvideGsonFactory */
public final class AppModule_ProvideGsonFactory implements C41084a {
    private final AppModule module;

    public AppModule_ProvideGsonFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideGsonFactory create(AppModule appModule) {
        return new AppModule_ProvideGsonFactory(appModule);
    }

    public static Gson provideGson(AppModule appModule) {
        return (Gson) C18329d.m62677d(appModule.provideGson());
    }

    public Gson get() {
        return provideGson(this.module);
    }
}
