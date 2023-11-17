package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.CreditCardsLegacyWrapperMapper_Factory */
public final class CreditCardsLegacyWrapperMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.CreditCardsLegacyWrapperMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CreditCardsLegacyWrapperMapper_Factory INSTANCE = new CreditCardsLegacyWrapperMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static CreditCardsLegacyWrapperMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CreditCardsLegacyWrapperMapper newInstance() {
        return new CreditCardsLegacyWrapperMapper();
    }

    public CreditCardsLegacyWrapperMapper get() {
        return newInstance();
    }
}
