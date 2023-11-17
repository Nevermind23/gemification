package p341ge.bog.mobilebank.rest.model;

import ge1.C41084a;
import i41.C36354b;
import k41.C36869a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;

/* renamed from: ge.bog.mobilebank.rest.model.RetrofitClient_Factory */
public final class RetrofitClient_Factory implements C41084a {
    private final C41084a deviceInfoProvider;
    private final C41084a environmentProvider;
    private final C41084a isInNightModeProvider;
    private final C41084a preferencesApiManagerProvider;

    public RetrofitClient_Factory(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4) {
        this.preferencesApiManagerProvider = aVar;
        this.deviceInfoProvider = aVar2;
        this.environmentProvider = aVar3;
        this.isInNightModeProvider = aVar4;
    }

    public static RetrofitClient_Factory create(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4) {
        return new RetrofitClient_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static RetrofitClient newInstance(PreferencesApiManager preferencesApiManager, C36869a aVar, TargetEnvironment targetEnvironment, C36354b bVar) {
        return new RetrofitClient(preferencesApiManager, aVar, targetEnvironment, bVar);
    }

    public RetrofitClient get() {
        return newInstance((PreferencesApiManager) this.preferencesApiManagerProvider.get(), (C36869a) this.deviceInfoProvider.get(), (TargetEnvironment) this.environmentProvider.get(), (C36354b) this.isInNightModeProvider.get());
    }
}
