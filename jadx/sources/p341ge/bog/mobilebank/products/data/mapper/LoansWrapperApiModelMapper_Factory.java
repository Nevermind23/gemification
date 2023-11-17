package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.LoansWrapperApiModelMapper_Factory */
public final class LoansWrapperApiModelMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.LoansWrapperApiModelMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final LoansWrapperApiModelMapper_Factory INSTANCE = new LoansWrapperApiModelMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static LoansWrapperApiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LoansWrapperApiModelMapper newInstance() {
        return new LoansWrapperApiModelMapper();
    }

    public LoansWrapperApiModelMapper get() {
        return newInstance();
    }
}
