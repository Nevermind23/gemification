package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.c */
public interface C24525c {

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.c$a */
    public static final class C24526a implements C24525c {

        /* renamed from: a */
        public static final C24526a f63240a = new C24526a();

        private C24526a() {
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.c$b */
    public static final class C24527b implements C24525c {

        /* renamed from: a */
        private final String f63241a;

        /* renamed from: b */
        private final String f63242b;

        public C24527b(String str, String str2) {
            C41536l.m120489i(str2, "policyNo");
            this.f63241a = str;
            this.f63242b = str2;
        }

        /* renamed from: a */
        public final String mo62652a() {
            return this.f63242b;
        }

        /* renamed from: b */
        public final String mo62653b() {
            return this.f63241a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.c$c */
    public static final class C24528c implements C24525c {

        /* renamed from: a */
        private final String f63243a;

        /* renamed from: b */
        private final String f63244b;

        public C24528c(String str, String str2) {
            C41536l.m120489i(str, "policyUrl");
            C41536l.m120489i(str2, "policyNo");
            this.f63243a = str;
            this.f63244b = str2;
        }

        /* renamed from: a */
        public final String mo62654a() {
            return this.f63244b;
        }

        /* renamed from: b */
        public final String mo62655b() {
            return this.f63243a;
        }
    }
}
