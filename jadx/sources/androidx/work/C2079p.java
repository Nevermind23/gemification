package androidx.work;

import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

/* renamed from: androidx.work.p */
public interface C2079p {

    /* renamed from: a */
    public static final C2081b.C2084c f6230a = new C2081b.C2084c();

    /* renamed from: b */
    public static final C2081b.C2083b f6231b = new C2081b.C2083b();

    /* renamed from: androidx.work.p$b */
    public static abstract class C2081b {

        /* renamed from: androidx.work.p$b$a */
        public static final class C2082a extends C2081b {

            /* renamed from: a */
            private final Throwable f6232a;

            public C2082a(Throwable th) {
                this.f6232a = th;
            }

            /* renamed from: a */
            public Throwable mo6973a() {
                return this.f6232a;
            }

            public String toString() {
                return "FAILURE (" + this.f6232a.getMessage() + ")";
            }
        }

        /* renamed from: androidx.work.p$b$b */
        public static final class C2083b extends C2081b {
            public String toString() {
                return ProductType.PRODUCT_STATUS_IN_PROGRESS;
            }

            private C2083b() {
            }
        }

        /* renamed from: androidx.work.p$b$c */
        public static final class C2084c extends C2081b {
            public String toString() {
                return "SUCCESS";
            }

            private C2084c() {
            }
        }

        C2081b() {
        }
    }
}
