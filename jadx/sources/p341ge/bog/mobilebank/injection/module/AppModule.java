package p341ge.bog.mobilebank.injection.module;

import android.app.Application;
import com.google.gson.Gson;
import iu0.C36546y;

/* renamed from: ge.bog.mobilebank.injection.module.AppModule */
public class AppModule {
    /* access modifiers changed from: package-private */
    public C36546y provideApp(Application application) {
        return (C36546y) application;
    }

    /* access modifiers changed from: package-private */
    public Gson provideGson() {
        return new Gson();
    }
}
