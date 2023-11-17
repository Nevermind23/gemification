package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.StatementsMapper_Factory */
public final class StatementsMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.StatementsMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final StatementsMapper_Factory INSTANCE = new StatementsMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static StatementsMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StatementsMapper newInstance() {
        return new StatementsMapper();
    }

    public StatementsMapper get() {
        return newInstance();
    }
}
