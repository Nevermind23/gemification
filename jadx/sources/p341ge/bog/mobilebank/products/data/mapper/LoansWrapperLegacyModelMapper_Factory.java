package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.LoansWrapperLegacyModelMapper_Factory */
public final class LoansWrapperLegacyModelMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.LoansWrapperLegacyModelMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final LoansWrapperLegacyModelMapper_Factory INSTANCE = new LoansWrapperLegacyModelMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static LoansWrapperLegacyModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LoansWrapperLegacyModelMapper newInstance() {
        return new LoansWrapperLegacyModelMapper();
    }

    public LoansWrapperLegacyModelMapper get() {
        return newInstance();
    }
}
