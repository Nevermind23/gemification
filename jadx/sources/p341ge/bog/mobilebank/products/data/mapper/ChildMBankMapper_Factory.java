package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.ChildMBankMapper_Factory */
public final class ChildMBankMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.ChildMBankMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ChildMBankMapper_Factory INSTANCE = new ChildMBankMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static ChildMBankMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChildMBankMapper newInstance() {
        return new ChildMBankMapper();
    }

    public ChildMBankMapper get() {
        return newInstance();
    }
}
