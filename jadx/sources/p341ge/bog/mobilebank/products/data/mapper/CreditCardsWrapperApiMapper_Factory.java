package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.CreditCardsWrapperApiMapper_Factory */
public final class CreditCardsWrapperApiMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.CreditCardsWrapperApiMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CreditCardsWrapperApiMapper_Factory INSTANCE = new CreditCardsWrapperApiMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static CreditCardsWrapperApiMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CreditCardsWrapperApiMapper newInstance() {
        return new CreditCardsWrapperApiMapper();
    }

    public CreditCardsWrapperApiMapper get() {
        return newInstance();
    }
}
