package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.BondsWrapperApiModelMapper_Factory */
public final class BondsWrapperApiModelMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.BondsWrapperApiModelMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final BondsWrapperApiModelMapper_Factory INSTANCE = new BondsWrapperApiModelMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static BondsWrapperApiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BondsWrapperApiModelMapper newInstance() {
        return new BondsWrapperApiModelMapper();
    }

    public BondsWrapperApiModelMapper get() {
        return newInstance();
    }
}
