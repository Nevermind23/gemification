package p341ge.bog.mobilebank.injection.module;

import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.RetrofitApi;

/* renamed from: ge.bog.mobilebank.injection.module.BankApiModule */
public abstract class BankApiModule {
    /* access modifiers changed from: package-private */
    public abstract BankApi provideBankApi(RetrofitApi retrofitApi);
}
