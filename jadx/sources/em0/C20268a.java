package em0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: em0.a */
public abstract class C20268a {

    /* renamed from: a */
    private final C20274f f55173a;

    /* renamed from: em0.a$a */
    public static final class C20269a extends C20268a {

        /* renamed from: b */
        private final boolean f55174b;

        public C20269a(boolean z) {
            super(C20274f.COMPARE_BUTTON_UI_STATE, (DefaultConstructorMarker) null);
            this.f55174b = z;
        }

        /* renamed from: b */
        public final boolean mo48740b() {
            return this.f55174b;
        }
    }

    /* renamed from: em0.a$b */
    public static final class C20270b extends C20268a {

        /* renamed from: b */
        public static final C20270b f55175b = new C20270b();

        private C20270b() {
            super(C20274f.ERROR_UI_STATE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: em0.a$c */
    public static final class C20271c extends C20268a {

        /* renamed from: b */
        private final boolean f55176b;

        public C20271c(boolean z) {
            super(C20274f.HEADER_UI_STATE, (DefaultConstructorMarker) null);
            this.f55176b = z;
        }

        /* renamed from: b */
        public final boolean mo48741b() {
            return this.f55176b;
        }
    }

    /* renamed from: em0.a$d */
    public static final class C20272d extends C20268a {

        /* renamed from: b */
        public static final C20272d f55177b = new C20272d();

        private C20272d() {
            super(C20274f.LOADING_UI_STATE, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: em0.a$e */
    public static final class C20273e extends C20268a {

        /* renamed from: b */
        private final String f55178b;

        /* renamed from: c */
        private final String f55179c;

        /* renamed from: d */
        private final String f55180d;

        /* renamed from: e */
        private final double f55181e;

        /* renamed from: f */
        private final String f55182f;

        /* renamed from: g */
        private final List f55183g;

        /* renamed from: h */
        private final String f55184h;

        /* renamed from: i */
        private final String f55185i;

        /* renamed from: j */
        private final String f55186j;

        /* renamed from: k */
        private final Double f55187k;

        /* renamed from: l */
        private final Double f55188l;

        /* renamed from: m */
        private final boolean f55189m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20273e(String str, String str2, String str3, double d, String str4, List list, String str5, String str6, String str7, Double d2, Double d3, boolean z) {
            super(C20274f.PROVIDERS_UI_STATE, (DefaultConstructorMarker) null);
            C41536l.m120489i(list, "additionalCoverage");
            this.f55178b = str;
            this.f55179c = str2;
            this.f55180d = str3;
            this.f55181e = d;
            this.f55182f = str4;
            this.f55183g = list;
            this.f55184h = str5;
            this.f55185i = str6;
            this.f55186j = str7;
            this.f55187k = d2;
            this.f55188l = d3;
            this.f55189m = z;
        }

        /* renamed from: b */
        public final List mo48742b() {
            return this.f55183g;
        }

        /* renamed from: c */
        public final String mo48743c() {
            return this.f55185i;
        }

        /* renamed from: d */
        public final String mo48744d() {
            return this.f55179c;
        }

        /* renamed from: e */
        public final Double mo48745e() {
            return this.f55187k;
        }

        /* renamed from: f */
        public final Double mo48746f() {
            return this.f55188l;
        }

        /* renamed from: g */
        public final double mo48747g() {
            return this.f55181e;
        }

        /* renamed from: h */
        public final String mo48748h() {
            return this.f55182f;
        }

        /* renamed from: i */
        public final String mo48749i() {
            return this.f55184h;
        }

        /* renamed from: j */
        public final String mo48750j() {
            return this.f55178b;
        }

        /* renamed from: k */
        public final String mo48751k() {
            return this.f55180d;
        }

        /* renamed from: l */
        public final String mo48752l() {
            return this.f55186j;
        }

        /* renamed from: m */
        public final boolean mo48753m() {
            return this.f55189m;
        }
    }

    /* renamed from: em0.a$f */
    public enum C20274f {
        HEADER_UI_STATE,
        PROVIDERS_UI_STATE,
        COMPARE_BUTTON_UI_STATE,
        LOADING_UI_STATE,
        ERROR_UI_STATE
    }

    public /* synthetic */ C20268a(C20274f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    /* renamed from: a */
    public final int mo48739a() {
        return this.f55173a.ordinal();
    }

    private C20268a(C20274f fVar) {
        this.f55173a = fVar;
    }
}
