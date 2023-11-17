package p341ge.bog.mobilebank.model;

import ge1.C41084a;
import m50.C26146d;
import p502lf.C16560a;
import p748eu.C20292b;
import z90.C30268c;

/* renamed from: ge.bog.mobilebank.model.Client_MembersInjector */
public final class Client_MembersInjector implements C16560a {
    private final C41084a cardsUIModelDataMapperProvider;
    private final C41084a getAppSettingByNameUseCaseProvider;
    private final C41084a refreshStoProvider;

    public Client_MembersInjector(C41084a aVar, C41084a aVar2, C41084a aVar3) {
        this.refreshStoProvider = aVar;
        this.getAppSettingByNameUseCaseProvider = aVar2;
        this.cardsUIModelDataMapperProvider = aVar3;
    }

    public static C16560a create(C41084a aVar, C41084a aVar2, C41084a aVar3) {
        return new Client_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectCardsUIModelDataMapper(Client client, C26146d dVar) {
        client.cardsUIModelDataMapper = dVar;
    }

    public static void injectGetAppSettingByNameUseCase(Client client, C20292b bVar) {
        client.getAppSettingByNameUseCase = bVar;
    }

    public static void injectRefreshSto(Client client, C30268c cVar) {
        client.refreshSto = cVar;
    }

    public void injectMembers(Client client) {
        injectRefreshSto(client, (C30268c) this.refreshStoProvider.get());
        injectGetAppSettingByNameUseCase(client, (C20292b) this.getAppSettingByNameUseCaseProvider.get());
        injectCardsUIModelDataMapper(client, (C26146d) this.cardsUIModelDataMapperProvider.get());
    }
}
