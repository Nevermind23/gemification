package p759fv;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p380ck.C10463g;
import p380ck.C10464h;

/* renamed from: fv.a */
public abstract class C20559a {

    /* renamed from: e */
    public static final C20561b f55592e = new C20561b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f55593a;

    /* renamed from: b */
    private final String f55594b;

    /* renamed from: c */
    private final String f55595c;

    /* renamed from: d */
    private final C10464h.C10465a f55596d;

    /* renamed from: fv.a$a */
    public static final class C20560a extends C20559a {

        /* renamed from: f */
        public static final C20560a f55597f = new C20560a();

        private C20560a() {
            super("travel_insurance", "new_insurance_download_policy_click", (String) null, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$b */
    public static final class C20561b {
        private C20561b() {
        }

        public /* synthetic */ C20561b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: fv.a$c */
    public static final class C20562c extends C20559a {

        /* renamed from: f */
        private final String f55598f;

        public C20562c(String str) {
            super("travel_insurance", "conversion_travel_insurance", str, C10464h.C10465a.FACEBOOKANDFIREBASE, (DefaultConstructorMarker) null);
            this.f55598f = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C20562c) && C41536l.m120484d(this.f55598f, ((C20562c) obj).f55598f);
        }

        public int hashCode() {
            String str = this.f55598f;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f55598f;
            return "ConversionTravelInsuranceEvent(productId=" + str + ")";
        }
    }

    /* renamed from: fv.a$d */
    public static final class C20563d extends C20559a {

        /* renamed from: f */
        public static final C20563d f55599f = new C20563d();

        private C20563d() {
            super("travel_insurance", "insurance_travel_input_page_next_button_click ", (String) null, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$e */
    public static final class C20564e extends C20559a {

        /* renamed from: f */
        public static final C20564e f55600f = new C20564e();

        private C20564e() {
            super("mtpl_insurance", "insurance_mtpl_card_click", (String) null, C10464h.C10465a.FACEBOOKANDFIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$f */
    public static final class C20565f extends C20559a {

        /* renamed from: f */
        public static final C20565f f55601f = new C20565f();

        private C20565f() {
            super("insurance", "mtpl_insurance_open", (String) null, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$g */
    public static final class C20566g extends C20559a {

        /* renamed from: f */
        public static final C20566g f55602f = new C20566g();

        private C20566g() {
            super("insurance", "travel_insurance_open", (String) null, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$h */
    public static final class C20567h extends C20559a {

        /* renamed from: f */
        public static final C20567h f55603f = new C20567h();

        private C20567h() {
            super("travel_insurance", "insurance_travel_card_click", (String) null, C10464h.C10465a.FACEBOOKANDFIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$i */
    public static final class C20568i extends C20559a {

        /* renamed from: f */
        public static final C20568i f55604f = new C20568i();

        private C20568i() {
            super("insurance", "insurance_click_more_menu", (String) null, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$j */
    public static final class C20569j extends C20559a {

        /* renamed from: f */
        public static final C20569j f55605f = new C20569j();

        private C20569j() {
            super("active_insurance", "active_mtpl_insurance_download_policy_click", (String) null, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$k */
    public static final class C20570k extends C20559a {

        /* renamed from: f */
        private final boolean f55606f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C20570k(boolean r7) {
            /*
                r6 = this;
                java.lang.String r1 = "insurance"
                if (r7 == 0) goto L_0x0007
                java.lang.String r0 = "insurance_click_more_menu_offers_and_applications"
                goto L_0x0009
            L_0x0007:
                java.lang.String r0 = "insurance_click_new_product_menu"
            L_0x0009:
                r2 = r0
                r3 = 0
                ck.h$a r4 = p380ck.C10464h.C10465a.FIREBASE
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f55606f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p759fv.C20559a.C20570k.<init>(boolean):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C20570k) && this.f55606f == ((C20570k) obj).f55606f;
        }

        public int hashCode() {
            boolean z = this.f55606f;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f55606f;
            return "NewProductActionSheetEvent(openedFromOffersPage=" + z + ")";
        }
    }

    /* renamed from: fv.a$l */
    public static final class C20571l extends C20559a {

        /* renamed from: f */
        private final String f55607f;

        public C20571l(String str) {
            super("travel_insurance", "insurance_travel_choosed_provider_click", str, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
            this.f55607f = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C20571l) && C41536l.m120484d(this.f55607f, ((C20571l) obj).f55607f);
        }

        public int hashCode() {
            String str = this.f55607f;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f55607f;
            return "ProviderClickedEvent(productId=" + str + ")";
        }
    }

    /* renamed from: fv.a$m */
    public static final class C20572m extends C20559a {

        /* renamed from: f */
        public static final C20572m f55608f = new C20572m();

        private C20572m() {
            super("travel_insurance", "insurance_travel_buy_click", (String) null, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$n */
    public static final class C20573n extends C20559a {

        /* renamed from: f */
        public static final C20573n f55609f = new C20573n();

        private C20573n() {
            super("active_insurance", "active_travel_insurance_download_policy_click", (String) null, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: fv.a$o */
    public static final class C20574o extends C20559a {

        /* renamed from: f */
        public static final C20574o f55610f = new C20574o();

        private C20574o() {
            super("travel_insurance", "insurance_travel_intro_page_next_button_click ", (String) null, C10464h.C10465a.FIREBASE, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C20559a(String str, String str2, String str3, C10464h.C10465a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, aVar);
    }

    /* renamed from: a */
    public final void mo49091a(C10463g gVar) {
        C41536l.m120489i(gVar, "analytics");
        gVar.mo27137H(this.f55593a, this.f55594b, this.f55595c, (Bundle) null, this.f55596d);
    }

    private C20559a(String str, String str2, String str3, C10464h.C10465a aVar) {
        this.f55593a = str;
        this.f55594b = str2;
        this.f55595c = str3;
        this.f55596d = aVar;
    }
}
