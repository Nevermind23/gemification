package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.ContractApiModelMapper_Factory */
public final class ContractApiModelMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.ContractApiModelMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ContractApiModelMapper_Factory INSTANCE = new ContractApiModelMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static ContractApiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ContractApiModelMapper newInstance() {
        return new ContractApiModelMapper();
    }

    public ContractApiModelMapper get() {
        return newInstance();
    }
}
