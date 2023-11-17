package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import ge1.C41084a;
import j51.C36738j;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel;
import p341ge.bog.mobilebank.model.Client;
import p523mm.C16740f;
import p742dy.C20108a;
import p748eu.C20292b;
import zc0.C30288a;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel_ViewModel_Factory */
public final class MoreViewModel_ViewModel_Factory implements C41084a {
    private final C41084a checkKycStatusUseCaseProvider;
    private final C41084a clientProvider;
    private final C41084a getAppSettingByNameUseCaseProvider;
    private final C41084a getClientCountryInfoProvider;
    private final C41084a getDictionaryPopulatedObservableProvider;
    private final C41084a getUserInfoObservableUseCaseProvider;

    public MoreViewModel_ViewModel_Factory(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6) {
        this.checkKycStatusUseCaseProvider = aVar;
        this.getAppSettingByNameUseCaseProvider = aVar2;
        this.getClientCountryInfoProvider = aVar3;
        this.getUserInfoObservableUseCaseProvider = aVar4;
        this.getDictionaryPopulatedObservableProvider = aVar5;
        this.clientProvider = aVar6;
    }

    public static MoreViewModel_ViewModel_Factory create(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6) {
        return new MoreViewModel_ViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static MoreViewModel.ViewModel newInstance(C20108a aVar, C20292b bVar, C16740f fVar, C36738j jVar, C30288a aVar2, Client client) {
        return new MoreViewModel.ViewModel(aVar, bVar, fVar, jVar, aVar2, client);
    }

    public MoreViewModel.ViewModel get() {
        return newInstance((C20108a) this.checkKycStatusUseCaseProvider.get(), (C20292b) this.getAppSettingByNameUseCaseProvider.get(), (C16740f) this.getClientCountryInfoProvider.get(), (C36738j) this.getUserInfoObservableUseCaseProvider.get(), (C30288a) this.getDictionaryPopulatedObservableProvider.get(), (Client) this.clientProvider.get());
    }
}
