package h21;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p380ck.C10463g;
import p380ck.C10464h;

/* renamed from: h21.a */
public abstract class C36143a {

    /* renamed from: c */
    public static final C36147d f87331c = new C36147d((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f87332a;

    /* renamed from: b */
    private final String f87333b;

    /* renamed from: h21.a$a */
    public static final class C36144a extends C36143a {

        /* renamed from: d */
        private final String f87334d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C36144a(java.lang.String r4) {
            /*
                r3 = this;
                if (r4 != 0) goto L_0x0005
                java.lang.String r0 = "NO_INSURANCE"
                goto L_0x0006
            L_0x0005:
                r0 = r4
            L_0x0006:
                r1 = 0
                java.lang.String r2 = "choose_package"
                r3.<init>(r2, r0, r1)
                r3.f87334d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h21.C36143a.C36144a.<init>(java.lang.String):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36144a) && C41536l.m120484d(this.f87334d, ((C36144a) obj).f87334d);
        }

        public int hashCode() {
            String str = this.f87334d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f87334d;
            return "ChoosePackage(insuranceType=" + str + ")";
        }
    }

    /* renamed from: h21.a$b */
    public static final class C36145b extends C36143a {

        /* renamed from: d */
        public static final C36145b f87335d = new C36145b();

        private C36145b() {
            super("click_banner_from_more", (String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: h21.a$c */
    public static final class C36146c extends C36143a {

        /* renamed from: d */
        private final String f87336d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36146c(String str) {
            super("click_card_for_insurance", str, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "subProductCode");
            this.f87336d = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36146c) && C41536l.m120484d(this.f87336d, ((C36146c) obj).f87336d);
        }

        public int hashCode() {
            return this.f87336d.hashCode();
        }

        public String toString() {
            String str = this.f87336d;
            return "ClickCardForInsurance(subProductCode=" + str + ")";
        }
    }

    /* renamed from: h21.a$d */
    public static final class C36147d {
        private C36147d() {
        }

        public /* synthetic */ C36147d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: h21.a$e */
    public static final class C36148e extends C36143a {

        /* renamed from: d */
        public static final C36148e f87337d = new C36148e();

        private C36148e() {
            super("open_action_sheet", (String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C36143a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* renamed from: a */
    public String mo88897a() {
        return this.f87332a;
    }

    /* renamed from: b */
    public String mo88898b() {
        return this.f87333b;
    }

    /* renamed from: c */
    public final void mo88899c(C10463g gVar) {
        C41536l.m120489i(gVar, "analytics");
        gVar.mo27137H("Card Insurance", mo88897a(), mo88898b(), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    private C36143a(String str, String str2) {
        this.f87332a = str;
        this.f87333b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36143a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (DefaultConstructorMarker) null);
    }
}
