package p341ge.bog.mobilebank.injection.module;

import ge1.C41084a;
import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.injection.module.BankApiManagerModule_ProvideBankApiManagerFactory */
public final class BankApiManagerModule_ProvideBankApiManagerFactory implements C41084a {
    private final C41084a bankApiProvider;
    private final C41084a clientProvider;
    private final C41084a eventBusProvider;
    private final BankApiManagerModule module;

    public BankApiManagerModule_ProvideBankApiManagerFactory(BankApiManagerModule bankApiManagerModule, C41084a aVar, C41084a aVar2, C41084a aVar3) {
        this.module = bankApiManagerModule;
        this.eventBusProvider = aVar;
        this.bankApiProvider = aVar2;
        this.clientProvider = aVar3;
    }

    public static BankApiManagerModule_ProvideBankApiManagerFactory create(BankApiManagerModule bankApiManagerModule, C41084a aVar, C41084a aVar2, C41084a aVar3) {
        return new BankApiManagerModule_ProvideBankApiManagerFactory(bankApiManagerModule, aVar, aVar2, aVar3);
    }

    public static RootBankApiManager provideBankApiManager(BankApiManagerModule bankApiManagerModule, C41438c cVar, BankApi bankApi, Client client) {
        return (RootBankApiManager) C18329d.m62677d(bankApiManagerModule.provideBankApiManager(cVar, bankApi, client));
    }

    public RootBankApiManager get() {
        return provideBankApiManager(this.module, (C41438c) this.eventBusProvider.get(), (BankApi) this.bankApiProvider.get(), (Client) this.clientProvider.get());
    }
}
