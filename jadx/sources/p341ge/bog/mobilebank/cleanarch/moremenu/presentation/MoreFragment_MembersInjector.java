package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import ge1.C41084a;
import j41.C36728a;
import p341ge.bog.mobilebank.eventbus.EventBusWrapper;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.fragments.C35657p1;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p502lf.C16560a;
import p748eu.C20292b;
import p843nw.C26628j;
import p883rw.C28109a;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment_MembersInjector */
public final class MoreFragment_MembersInjector implements C16560a {
    private final C41084a authHelperProvider;
    private final C41084a eventBusWrapperProvider;
    private final C41084a getAccountsWithCardsUseCaseProvider;
    private final C41084a getAppSettingByNameUseCaseProvider;
    private final C41084a getAppSettingByNameUseCaseProvider2;
    private final C41084a getReferalBannerInfoUseCaseProvider;
    private final C41084a mBankApiManagerProvider;
    private final C41084a mBankApiProvider;
    private final C41084a mClientProvider;
    private final C41084a mPreferencesApiManagerProvider;

    public MoreFragment_MembersInjector(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6, C41084a aVar7, C41084a aVar8, C41084a aVar9, C41084a aVar10) {
        this.mBankApiProvider = aVar;
        this.mBankApiManagerProvider = aVar2;
        this.eventBusWrapperProvider = aVar3;
        this.mClientProvider = aVar4;
        this.mPreferencesApiManagerProvider = aVar5;
        this.getAccountsWithCardsUseCaseProvider = aVar6;
        this.getAppSettingByNameUseCaseProvider = aVar7;
        this.getReferalBannerInfoUseCaseProvider = aVar8;
        this.getAppSettingByNameUseCaseProvider2 = aVar9;
        this.authHelperProvider = aVar10;
    }

    public static C16560a create(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6, C41084a aVar7, C41084a aVar8, C41084a aVar9, C41084a aVar10) {
        return new MoreFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static void injectAuthHelper(MoreFragment moreFragment, C36728a aVar) {
        moreFragment.authHelper = aVar;
    }

    public static void injectGetAppSettingByNameUseCase(MoreFragment moreFragment, C20292b bVar) {
        moreFragment.getAppSettingByNameUseCase = bVar;
    }

    public static void injectGetReferalBannerInfoUseCase(MoreFragment moreFragment, C28109a aVar) {
        moreFragment.getReferalBannerInfoUseCase = aVar;
    }

    public void injectMembers(MoreFragment moreFragment) {
        C35657p1.m105891d(moreFragment, (BankApi) this.mBankApiProvider.get());
        C35657p1.m105892e(moreFragment, (RootBankApiManager) this.mBankApiManagerProvider.get());
        C35657p1.m105888a(moreFragment, (EventBusWrapper) this.eventBusWrapperProvider.get());
        C35657p1.m105893f(moreFragment, (Client) this.mClientProvider.get());
        C35657p1.m105894g(moreFragment, (PreferencesApiManager) this.mPreferencesApiManagerProvider.get());
        C35657p1.m105889b(moreFragment, (C26628j) this.getAccountsWithCardsUseCaseProvider.get());
        C35657p1.m105890c(moreFragment, (C20292b) this.getAppSettingByNameUseCaseProvider.get());
        injectGetReferalBannerInfoUseCase(moreFragment, (C28109a) this.getReferalBannerInfoUseCaseProvider.get());
        injectGetAppSettingByNameUseCase(moreFragment, (C20292b) this.getAppSettingByNameUseCaseProvider2.get());
        injectAuthHelper(moreFragment, (C36728a) this.authHelperProvider.get());
    }
}
