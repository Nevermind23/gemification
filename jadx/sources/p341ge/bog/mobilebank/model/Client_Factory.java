package p341ge.bog.mobilebank.model;

import android.content.Context;
import ge1.C41084a;
import m50.C26146d;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p748eu.C20292b;
import z90.C30268c;

/* renamed from: ge.bog.mobilebank.model.Client_Factory */
public final class Client_Factory implements C41084a {
    private final C41084a cardsUIModelDataMapperProvider;
    private final C41084a contextProvider;
    private final C41084a getAppSettingByNameUseCaseProvider;
    private final C41084a preferencesApiManagerProvider;
    private final C41084a refreshStoProvider;

    public Client_Factory(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5) {
        this.preferencesApiManagerProvider = aVar;
        this.contextProvider = aVar2;
        this.refreshStoProvider = aVar3;
        this.getAppSettingByNameUseCaseProvider = aVar4;
        this.cardsUIModelDataMapperProvider = aVar5;
    }

    public static Client_Factory create(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5) {
        return new Client_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static Client newInstance(PreferencesApiManager preferencesApiManager, Context context) {
        return new Client(preferencesApiManager, context);
    }

    public Client get() {
        Client newInstance = newInstance((PreferencesApiManager) this.preferencesApiManagerProvider.get(), (Context) this.contextProvider.get());
        Client_MembersInjector.injectRefreshSto(newInstance, (C30268c) this.refreshStoProvider.get());
        Client_MembersInjector.injectGetAppSettingByNameUseCase(newInstance, (C20292b) this.getAppSettingByNameUseCaseProvider.get());
        Client_MembersInjector.injectCardsUIModelDataMapper(newInstance, (C26146d) this.cardsUIModelDataMapperProvider.get());
        return newInstance;
    }
}
