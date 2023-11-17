package p341ge.bog.mobilebank.giftcards.presentation.purchase;

import hc1.C41145d;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.a */
public interface C24350a {

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.a$a */
    public static final class C24351a implements C24350a {

        /* renamed from: a */
        public static final C24351a f62900a = new C24351a();

        private C24351a() {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.a$b */
    public static final class C24352b implements C24350a {

        /* renamed from: a */
        public static final C24352b f62901a = new C24352b();

        private C24352b() {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.a$c */
    public static final class C24353c implements C24350a {

        /* renamed from: a */
        private final Long f62902a;

        public C24353c(Long l) {
            this.f62902a = l;
        }

        /* renamed from: a */
        public final Long mo62055a() {
            return this.f62902a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.a$d */
    public static final class C24354d implements C24350a {

        /* renamed from: a */
        private final String f62903a;

        /* renamed from: b */
        private final C41145d f62904b;

        public C24354d(String str, C41145d dVar) {
            C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
            C41536l.m120489i(dVar, "scaParams");
            this.f62903a = str;
            this.f62904b = dVar;
        }

        /* renamed from: a */
        public final C41145d mo62056a() {
            return this.f62904b;
        }

        /* renamed from: b */
        public final String mo62057b() {
            return this.f62903a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.a$e */
    public static final class C24355e implements C24350a {

        /* renamed from: a */
        public static final C24355e f62905a = new C24355e();

        private C24355e() {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.a$f */
    public static final class C24356f implements C24350a {

        /* renamed from: a */
        public static final C24356f f62906a = new C24356f();

        private C24356f() {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.a$g */
    public static final class C24357g implements C24350a {

        /* renamed from: a */
        private final String f62907a;

        public C24357g(String str) {
            C41536l.m120489i(str, "phoneNumber");
            this.f62907a = str;
        }

        /* renamed from: a */
        public final String mo62058a() {
            return this.f62907a;
        }
    }
}
