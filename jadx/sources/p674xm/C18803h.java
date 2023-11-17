package p674xm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

/* renamed from: xm.h */
public enum C18803h {
    NEW(ProductType.PRODUCT_STATUS_NEW),
    RECOVER("RECOVER");
    

    /* renamed from: e */
    public static final C18804a f52544e = null;

    /* renamed from: d */
    private final String f52548d;

    /* renamed from: xm.h$a */
    public static final class C18804a {
        private C18804a() {
        }

        public /* synthetic */ C18804a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18803h mo46644a(String str) {
            C41536l.m120489i(str, "lookupValue");
            C18803h hVar = C18803h.RECOVER;
            if (C41536l.m120484d(str, hVar.mo46643b())) {
                return hVar;
            }
            return C18803h.NEW;
        }
    }

    static {
        f52544e = new C18804a((DefaultConstructorMarker) null);
    }

    private C18803h(String str) {
        this.f52548d = str;
    }

    /* renamed from: b */
    public final String mo46643b() {
        return this.f52548d;
    }
}
