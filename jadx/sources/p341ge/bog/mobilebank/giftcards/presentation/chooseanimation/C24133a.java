package p341ge.bog.mobilebank.giftcards.presentation.chooseanimation;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.a */
public interface C24133a {

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.a$a */
    public static final class C24134a implements C24133a {

        /* renamed from: a */
        public static final C24134a f62528a = new C24134a();

        private C24134a() {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.a$b */
    public static final class C24135b implements C24133a {

        /* renamed from: a */
        public static final C24135b f62529a = new C24135b();

        private C24135b() {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.a$c */
    public static final class C24136c implements C24133a {

        /* renamed from: a */
        public static final C24136c f62530a = new C24136c();

        private C24136c() {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.a$d */
    public static final class C24137d implements C24133a {

        /* renamed from: a */
        public static final C24137d f62531a = new C24137d();

        private C24137d() {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.a$e */
    public static final class C24138e implements C24133a {

        /* renamed from: a */
        private final Throwable f62532a;

        public C24138e(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f62532a = th;
        }

        /* renamed from: a */
        public final Throwable mo61717a() {
            return this.f62532a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24138e) && C41536l.m120484d(this.f62532a, ((C24138e) obj).f62532a);
        }

        public int hashCode() {
            return this.f62532a.hashCode();
        }

        public String toString() {
            Throwable th = this.f62532a;
            return "ShowErrorMessage(error=" + th + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.a$f */
    public static final class C24139f implements C24133a {

        /* renamed from: a */
        public static final C24139f f62533a = new C24139f();

        private C24139f() {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.a$g */
    public static final class C24140g implements C24133a {

        /* renamed from: a */
        private final List f62534a;

        public C24140g(List list) {
            C41536l.m120489i(list, "listOfStores");
            this.f62534a = list;
        }

        /* renamed from: a */
        public final List mo61721a() {
            return this.f62534a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24140g) && C41536l.m120484d(this.f62534a, ((C24140g) obj).f62534a);
        }

        public int hashCode() {
            return this.f62534a.hashCode();
        }

        public String toString() {
            List list = this.f62534a;
            return "StoresActionSheet(listOfStores=" + list + ")";
        }
    }
}
