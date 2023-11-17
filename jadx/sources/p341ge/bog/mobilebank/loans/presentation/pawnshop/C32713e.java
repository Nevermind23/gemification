package p341ge.bog.mobilebank.loans.presentation.pawnshop;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.e */
public interface C32713e {

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.e$a */
    public static final class C32714a implements C32713e {

        /* renamed from: a */
        private final BigDecimal f80504a;

        /* renamed from: b */
        private final String f80505b;

        public C32714a(BigDecimal bigDecimal, String str) {
            C41536l.m120489i(bigDecimal, "fullAmount");
            C41536l.m120489i(str, "ccy");
            this.f80504a = bigDecimal;
            this.f80505b = str;
        }

        /* renamed from: a */
        public final String mo74393a() {
            return this.f80505b;
        }

        /* renamed from: b */
        public final BigDecimal mo74394b() {
            return this.f80504a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.e$b */
    public static final class C32715b implements C32713e {

        /* renamed from: a */
        public static final C32715b f80506a = new C32715b();

        private C32715b() {
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.e$c */
    public static final class C32716c implements C32713e {

        /* renamed from: a */
        public static final C32716c f80507a = new C32716c();

        private C32716c() {
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.e$d */
    public static final class C32717d implements C32713e {

        /* renamed from: a */
        private final boolean f80508a;

        public C32717d(boolean z) {
            this.f80508a = z;
        }

        /* renamed from: a */
        public final boolean mo74395a() {
            return this.f80508a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.e$e */
    public static final class C32718e implements C32713e {

        /* renamed from: a */
        public static final C32718e f80509a = new C32718e();

        private C32718e() {
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.e$f */
    public static final class C32719f implements C32713e {

        /* renamed from: a */
        public static final C32719f f80510a = new C32719f();

        private C32719f() {
        }
    }
}
