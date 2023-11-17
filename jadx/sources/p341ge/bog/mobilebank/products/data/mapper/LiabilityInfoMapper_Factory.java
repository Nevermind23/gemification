package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.LiabilityInfoMapper_Factory */
public final class LiabilityInfoMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.LiabilityInfoMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final LiabilityInfoMapper_Factory INSTANCE = new LiabilityInfoMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static LiabilityInfoMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LiabilityInfoMapper newInstance() {
        return new LiabilityInfoMapper();
    }

    public LiabilityInfoMapper get() {
        return newInstance();
    }
}
