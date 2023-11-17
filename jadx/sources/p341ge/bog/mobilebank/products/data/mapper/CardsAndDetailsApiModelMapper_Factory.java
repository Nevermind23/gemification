package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.CardsAndDetailsApiModelMapper_Factory */
public final class CardsAndDetailsApiModelMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.CardsAndDetailsApiModelMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CardsAndDetailsApiModelMapper_Factory INSTANCE = new CardsAndDetailsApiModelMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static CardsAndDetailsApiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CardsAndDetailsApiModelMapper newInstance() {
        return new CardsAndDetailsApiModelMapper();
    }

    public CardsAndDetailsApiModelMapper get() {
        return newInstance();
    }
}
