package p341ge.bog.mobilebank.products.data.mapper;

import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.mapper.ProductTypeApiModelMapper_Factory */
public final class ProductTypeApiModelMapper_Factory implements C41084a {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.ProductTypeApiModelMapper_Factory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ProductTypeApiModelMapper_Factory INSTANCE = new ProductTypeApiModelMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static ProductTypeApiModelMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProductTypeApiModelMapper newInstance() {
        return new ProductTypeApiModelMapper();
    }

    public ProductTypeApiModelMapper get() {
        return newInstance();
    }
}
