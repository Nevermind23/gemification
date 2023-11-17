package p341ge.bog.mobilebank.injection.module;

import android.app.Application;
import ge1.C41084a;
import iu0.C36546y;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.injection.module.AppModule_ProvideAppFactory */
public final class AppModule_ProvideAppFactory implements C41084a {
    private final C41084a applicationProvider;
    private final AppModule module;

    public AppModule_ProvideAppFactory(AppModule appModule, C41084a aVar) {
        this.module = appModule;
        this.applicationProvider = aVar;
    }

    public static AppModule_ProvideAppFactory create(AppModule appModule, C41084a aVar) {
        return new AppModule_ProvideAppFactory(appModule, aVar);
    }

    public static C36546y provideApp(AppModule appModule, Application application) {
        return (C36546y) C18329d.m62677d(appModule.provideApp(application));
    }

    public C36546y get() {
        return provideApp(this.module, (Application) this.applicationProvider.get());
    }
}
