package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.PensionApiModelMapper_Factory */
public final class PensionApiModelMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.PensionApiModelMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final PensionApiModelMapper_Factory INSTANCE = new PensionApiModelMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static PensionApiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PensionApiModelMapper newInstance() {
        return new PensionApiModelMapper();
    }

    public PensionApiModelMapper get() {
        return newInstance();
    }
}
