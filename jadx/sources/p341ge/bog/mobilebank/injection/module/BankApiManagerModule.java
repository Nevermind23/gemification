package p341ge.bog.mobilebank.injection.module;

import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.BankApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;

/* renamed from: ge.bog.mobilebank.injection.module.BankApiManagerModule */
public class BankApiManagerModule {
    /* access modifiers changed from: package-private */
    public RootBankApiManager provideBankApiManager(C41438c cVar, BankApi bankApi, Client client) {
        return new BankApiManager(cVar, bankApi, client);
    }
}
