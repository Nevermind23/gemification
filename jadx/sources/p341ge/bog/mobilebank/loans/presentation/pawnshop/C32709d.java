package p341ge.bog.mobilebank.loans.presentation.pawnshop;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loans.presentation.model.PaymentResultData;

/* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.d */
public interface C32709d {

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.d$a */
    public static final class C32710a implements C32709d {

        /* renamed from: a */
        private final Throwable f80501a;

        public C32710a(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f80501a = th;
        }

        /* renamed from: a */
        public final Throwable mo74391a() {
            return this.f80501a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.d$b */
    public static final class C32711b implements C32709d {

        /* renamed from: a */
        private final PaymentResultData f80502a;

        public C32711b(PaymentResultData paymentResultData) {
            C41536l.m120489i(paymentResultData, "paymentResultData");
            this.f80502a = paymentResultData;
        }

        /* renamed from: a */
        public final PaymentResultData mo74392a() {
            return this.f80502a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.pawnshop.d$c */
    public static final class C32712c implements C32709d {

        /* renamed from: a */
        public static final C32712c f80503a = new C32712c();

        private C32712c() {
        }
    }
}
