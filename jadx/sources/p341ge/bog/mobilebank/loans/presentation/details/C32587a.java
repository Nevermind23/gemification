package p341ge.bog.mobilebank.loans.presentation.details;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37129d;

/* renamed from: ge.bog.mobilebank.loans.presentation.details.a */
public abstract class C32587a {

    /* renamed from: a */
    private final String f80244a;

    /* renamed from: b */
    private final int f80245b;

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.a$a */
    public static final class C32588a extends C32587a {

        /* renamed from: c */
        private final String f80246c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32588a(String str) {
            super(str, C37129d.f89410j, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "titleKey");
            this.f80246c = str;
        }

        /* renamed from: b */
        public String mo74082b() {
            return this.f80246c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32588a) && C41536l.m120484d(this.f80246c, ((C32588a) obj).f80246c);
        }

        public int hashCode() {
            return this.f80246c.hashCode();
        }

        public String toString() {
            String str = this.f80246c;
            return "CancelInstallment(titleKey=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.a$b */
    public static final class C32589b extends C32587a {

        /* renamed from: c */
        private final String f80247c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32589b(String str) {
            super(str, C37129d.icons_48_deposit_cash_deposit_outline, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "titleKey");
            this.f80247c = str;
        }

        /* renamed from: b */
        public String mo74082b() {
            return this.f80247c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32589b) && C41536l.m120484d(this.f80247c, ((C32589b) obj).f80247c);
        }

        public int hashCode() {
            return this.f80247c.hashCode();
        }

        public String toString() {
            String str = this.f80247c;
            return "FullPrepayment(titleKey=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.a$c */
    public static final class C32590c extends C32587a {

        /* renamed from: c */
        private final String f80248c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32590c(String str) {
            super(str, C37129d.icons_48_deposit_cash_deposit_outline, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "titleKey");
            this.f80248c = str;
        }

        /* renamed from: b */
        public String mo74082b() {
            return this.f80248c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32590c) && C41536l.m120484d(this.f80248c, ((C32590c) obj).f80248c);
        }

        public int hashCode() {
            return this.f80248c.hashCode();
        }

        public String toString() {
            String str = this.f80248c;
            return "LoanPayment(titleKey=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.a$d */
    public static final class C32591d extends C32587a {

        /* renamed from: c */
        private final String f80249c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32591d(String str) {
            super(str, C37129d.f89407d, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "titleKey");
            this.f80249c = str;
        }

        /* renamed from: b */
        public String mo74082b() {
            return this.f80249c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32591d) && C41536l.m120484d(this.f80249c, ((C32591d) obj).f80249c);
        }

        public int hashCode() {
            return this.f80249c.hashCode();
        }

        public String toString() {
            String str = this.f80249c;
            return "PartPrepayment(titleKey=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.a$e */
    public static final class C32592e extends C32587a {

        /* renamed from: c */
        private final String f80250c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32592e(String str) {
            super(str, C37129d.icons_48_deposit_cash_deposit_outline, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "titleKey");
            this.f80250c = str;
        }

        /* renamed from: b */
        public String mo74082b() {
            return this.f80250c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32592e) && C41536l.m120484d(this.f80250c, ((C32592e) obj).f80250c);
        }

        public int hashCode() {
            return this.f80250c.hashCode();
        }

        public String toString() {
            String str = this.f80250c;
            return "PawnLoanPayment(titleKey=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.a$f */
    public static final class C32593f extends C32587a {

        /* renamed from: c */
        private final String f80251c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32593f(String str) {
            super(str, C37129d.f89411k, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "titleKey");
            this.f80251c = str;
        }

        /* renamed from: b */
        public String mo74082b() {
            return this.f80251c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32593f) && C41536l.m120484d(this.f80251c, ((C32593f) obj).f80251c);
        }

        public int hashCode() {
            return this.f80251c.hashCode();
        }

        public String toString() {
            String str = this.f80251c;
            return "Status(titleKey=" + str + ")";
        }
    }

    public /* synthetic */ C32587a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* renamed from: a */
    public final int mo74081a() {
        return this.f80245b;
    }

    /* renamed from: b */
    public abstract String mo74082b();

    private C32587a(String str, int i) {
        this.f80244a = str;
        this.f80245b = i;
    }
}
