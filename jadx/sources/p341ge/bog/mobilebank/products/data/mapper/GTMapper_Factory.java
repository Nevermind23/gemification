package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.GTMapper_Factory */
public final class GTMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.GTMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GTMapper_Factory INSTANCE = new GTMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static GTMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GTMapper newInstance() {
        return new GTMapper();
    }

    public GTMapper get() {
        return newInstance();
    }
}
