package p341ge.bog.mobilebank.insurance.presentation;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ml0.C26252e;
import ml0.C26254g;

/* renamed from: ge.bog.mobilebank.insurance.presentation.b */
public abstract class C24476b {

    /* renamed from: a */
    private final String f63166a;

    /* renamed from: b */
    private final String f63167b;

    /* renamed from: c */
    private final String f63168c;

    /* renamed from: d */
    private final boolean f63169d;

    /* renamed from: ge.bog.mobilebank.insurance.presentation.b$a */
    public static final class C24477a extends C24476b {

        /* renamed from: e */
        private final String f63170e;

        /* renamed from: f */
        private final String f63171f;

        /* renamed from: g */
        private final String f63172g;

        /* renamed from: h */
        private final C26252e f63173h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24477a(String str, String str2, String str3, C26252e eVar) {
            super(str, str2, str3, false, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "providerId");
            C41536l.m120489i(str2, "providerName");
            C41536l.m120489i(str3, "providerLogoUrl");
            C41536l.m120489i(eVar, "policy");
            this.f63170e = str;
            this.f63171f = str2;
            this.f63172g = str3;
            this.f63173h = eVar;
        }

        /* renamed from: a */
        public String mo62463a() {
            return this.f63170e;
        }

        /* renamed from: b */
        public String mo62464b() {
            return this.f63172g;
        }

        /* renamed from: c */
        public String mo62465c() {
            return this.f63171f;
        }

        /* renamed from: e */
        public final C26252e mo62467e() {
            return this.f63173h;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.b$b */
    public static final class C24478b extends C24476b {

        /* renamed from: e */
        private final String f63174e;

        /* renamed from: f */
        private final String f63175f;

        /* renamed from: g */
        private final String f63176g;

        /* renamed from: h */
        private final boolean f63177h;

        /* renamed from: i */
        private final C26254g f63178i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24478b(String str, String str2, String str3, boolean z, C26254g gVar) {
            super(str, str2, str3, z, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "providerId");
            C41536l.m120489i(str2, "providerName");
            C41536l.m120489i(str3, "providerLogoUrl");
            C41536l.m120489i(gVar, "policy");
            this.f63174e = str;
            this.f63175f = str2;
            this.f63176g = str3;
            this.f63177h = z;
            this.f63178i = gVar;
        }

        /* renamed from: a */
        public String mo62463a() {
            return this.f63174e;
        }

        /* renamed from: b */
        public String mo62464b() {
            return this.f63176g;
        }

        /* renamed from: c */
        public String mo62465c() {
            return this.f63175f;
        }

        /* renamed from: d */
        public boolean mo62466d() {
            return this.f63177h;
        }

        /* renamed from: e */
        public final C26254g mo62468e() {
            return this.f63178i;
        }
    }

    public /* synthetic */ C24476b(String str, String str2, String str3, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z);
    }

    /* renamed from: a */
    public abstract String mo62463a();

    /* renamed from: b */
    public abstract String mo62464b();

    /* renamed from: c */
    public abstract String mo62465c();

    /* renamed from: d */
    public boolean mo62466d() {
        return this.f63169d;
    }

    private C24476b(String str, String str2, String str3, boolean z) {
        this.f63166a = str;
        this.f63167b = str2;
        this.f63168c = str3;
        this.f63169d = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24476b(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (DefaultConstructorMarker) null);
    }
}
