package yr0;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p380ck.C10463g;
import p380ck.C10464h;

/* renamed from: yr0.a */
public abstract class C40047a {

    /* renamed from: c */
    public static final C40048a f95175c = new C40048a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f95176a;

    /* renamed from: b */
    private final String f95177b;

    /* renamed from: yr0.a$a */
    public static final class C40048a {
        private C40048a() {
        }

        public /* synthetic */ C40048a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: yr0.a$b */
    public static final class C40049b extends C40047a {

        /* renamed from: d */
        public static final C40049b f95178d = new C40049b();

        private C40049b() {
            super("edit_name", (String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: yr0.a$c */
    public static final class C40050c extends C40047a {

        /* renamed from: d */
        public static final C40050c f95179d = new C40050c();

        private C40050c() {
            super("click", "history", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: yr0.a$d */
    public static final class C40051d extends C40047a {

        /* renamed from: d */
        public static final C40051d f95180d = new C40051d();

        private C40051d() {
            super("click", "loan_fullpayment", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: yr0.a$e */
    public static final class C40052e extends C40047a {

        /* renamed from: d */
        public static final C40052e f95181d = new C40052e();

        private C40052e() {
            super("click", "loan_prepayment", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: yr0.a$f */
    public static final class C40053f extends C40047a {

        /* renamed from: d */
        public static final C40053f f95182d = new C40053f();

        private C40053f() {
            super("click", "loan_prepayment", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: yr0.a$g */
    public static final class C40054g extends C40047a {

        /* renamed from: d */
        public static final C40054g f95183d = new C40054g();

        private C40054g() {
            super("click", "view_agreement", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: yr0.a$h */
    public static final class C40055h extends C40047a {

        /* renamed from: d */
        public static final C40055h f95184d = new C40055h();

        private C40055h() {
            super("click", "schedule", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: yr0.a$i */
    public static final class C40056i extends C40047a {

        /* renamed from: d */
        public static final C40056i f95185d = new C40056i();

        private C40056i() {
            super("installment_reversal", (String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C40047a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* renamed from: a */
    public String mo93922a() {
        return this.f95176a;
    }

    /* renamed from: b */
    public String mo93923b() {
        return this.f95177b;
    }

    /* renamed from: c */
    public final void mo93924c(C10463g gVar) {
        C41536l.m120489i(gVar, "analytics");
        gVar.mo27137H("loans", mo93922a(), mo93923b(), (Bundle) null, C10464h.C10465a.FIREBASE);
    }

    private C40047a(String str, String str2) {
        this.f95176a = str;
        this.f95177b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40047a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (DefaultConstructorMarker) null);
    }
}
