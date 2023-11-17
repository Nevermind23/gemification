package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.AccountsApiModelMapper_Factory */
public final class AccountsApiModelMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.AccountsApiModelMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final AccountsApiModelMapper_Factory INSTANCE = new AccountsApiModelMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static AccountsApiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AccountsApiModelMapper newInstance() {
        return new AccountsApiModelMapper();
    }

    public AccountsApiModelMapper get() {
        return newInstance();
    }
}
