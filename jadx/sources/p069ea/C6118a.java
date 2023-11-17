package p069ea;

import p276u9.C8652c;

/* renamed from: ea.a */
public final class C6118a {

    /* renamed from: p */
    private static final C6118a f19008p = new C6119a().mo19665a();

    /* renamed from: a */
    private final long f19009a;

    /* renamed from: b */
    private final String f19010b;

    /* renamed from: c */
    private final String f19011c;

    /* renamed from: d */
    private final C6121c f19012d;

    /* renamed from: e */
    private final C6122d f19013e;

    /* renamed from: f */
    private final String f19014f;

    /* renamed from: g */
    private final String f19015g;

    /* renamed from: h */
    private final int f19016h;

    /* renamed from: i */
    private final int f19017i;

    /* renamed from: j */
    private final String f19018j;

    /* renamed from: k */
    private final long f19019k;

    /* renamed from: l */
    private final C6120b f19020l;

    /* renamed from: m */
    private final String f19021m;

    /* renamed from: n */
    private final long f19022n;

    /* renamed from: o */
    private final String f19023o;

    /* renamed from: ea.a$a */
    public static final class C6119a {

        /* renamed from: a */
        private long f19024a = 0;

        /* renamed from: b */
        private String f19025b = "";

        /* renamed from: c */
        private String f19026c = "";

        /* renamed from: d */
        private C6121c f19027d = C6121c.UNKNOWN;

        /* renamed from: e */
        private C6122d f19028e = C6122d.UNKNOWN_OS;

        /* renamed from: f */
        private String f19029f = "";

        /* renamed from: g */
        private String f19030g = "";

        /* renamed from: h */
        private int f19031h = 0;

        /* renamed from: i */
        private int f19032i = 0;

        /* renamed from: j */
        private String f19033j = "";

        /* renamed from: k */
        private long f19034k = 0;

        /* renamed from: l */
        private C6120b f19035l = C6120b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f19036m = "";

        /* renamed from: n */
        private long f19037n = 0;

        /* renamed from: o */
        private String f19038o = "";

        C6119a() {
        }

        /* renamed from: a */
        public C6118a mo19665a() {
            return new C6118a(this.f19024a, this.f19025b, this.f19026c, this.f19027d, this.f19028e, this.f19029f, this.f19030g, this.f19031h, this.f19032i, this.f19033j, this.f19034k, this.f19035l, this.f19036m, this.f19037n, this.f19038o);
        }

        /* renamed from: b */
        public C6119a mo19666b(String str) {
            this.f19036m = str;
            return this;
        }

        /* renamed from: c */
        public C6119a mo19667c(String str) {
            this.f19030g = str;
            return this;
        }

        /* renamed from: d */
        public C6119a mo19668d(String str) {
            this.f19038o = str;
            return this;
        }

        /* renamed from: e */
        public C6119a mo19669e(C6120b bVar) {
            this.f19035l = bVar;
            return this;
        }

        /* renamed from: f */
        public C6119a mo19670f(String str) {
            this.f19026c = str;
            return this;
        }

        /* renamed from: g */
        public C6119a mo19671g(String str) {
            this.f19025b = str;
            return this;
        }

        /* renamed from: h */
        public C6119a mo19672h(C6121c cVar) {
            this.f19027d = cVar;
            return this;
        }

        /* renamed from: i */
        public C6119a mo19673i(String str) {
            this.f19029f = str;
            return this;
        }

        /* renamed from: j */
        public C6119a mo19674j(long j) {
            this.f19024a = j;
            return this;
        }

        /* renamed from: k */
        public C6119a mo19675k(C6122d dVar) {
            this.f19028e = dVar;
            return this;
        }

        /* renamed from: l */
        public C6119a mo19676l(String str) {
            this.f19033j = str;
            return this;
        }

        /* renamed from: m */
        public C6119a mo19677m(int i) {
            this.f19032i = i;
            return this;
        }
    }

    /* renamed from: ea.a$b */
    public enum C6120b implements C8652c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: d */
        private final int f19043d;

        private C6120b(int i) {
            this.f19043d = i;
        }

        /* renamed from: i */
        public int mo19678i() {
            return this.f19043d;
        }
    }

    /* renamed from: ea.a$c */
    public enum C6121c implements C8652c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: d */
        private final int f19049d;

        private C6121c(int i) {
            this.f19049d = i;
        }

        /* renamed from: i */
        public int mo19678i() {
            return this.f19049d;
        }
    }

    /* renamed from: ea.a$d */
    public enum C6122d implements C8652c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: d */
        private final int f19055d;

        private C6122d(int i) {
            this.f19055d = i;
        }

        /* renamed from: i */
        public int mo19678i() {
            return this.f19055d;
        }
    }

    C6118a(long j, String str, String str2, C6121c cVar, C6122d dVar, String str3, String str4, int i, int i2, String str5, long j2, C6120b bVar, String str6, long j3, String str7) {
        this.f19009a = j;
        this.f19010b = str;
        this.f19011c = str2;
        this.f19012d = cVar;
        this.f19013e = dVar;
        this.f19014f = str3;
        this.f19015g = str4;
        this.f19016h = i;
        this.f19017i = i2;
        this.f19018j = str5;
        this.f19019k = j2;
        this.f19020l = bVar;
        this.f19021m = str6;
        this.f19022n = j3;
        this.f19023o = str7;
    }

    /* renamed from: p */
    public static C6119a m24461p() {
        return new C6119a();
    }

    /* renamed from: a */
    public String mo19650a() {
        return this.f19021m;
    }

    /* renamed from: b */
    public long mo19651b() {
        return this.f19019k;
    }

    /* renamed from: c */
    public long mo19652c() {
        return this.f19022n;
    }

    /* renamed from: d */
    public String mo19653d() {
        return this.f19015g;
    }

    /* renamed from: e */
    public String mo19654e() {
        return this.f19023o;
    }

    /* renamed from: f */
    public C6120b mo19655f() {
        return this.f19020l;
    }

    /* renamed from: g */
    public String mo19656g() {
        return this.f19011c;
    }

    /* renamed from: h */
    public String mo19657h() {
        return this.f19010b;
    }

    /* renamed from: i */
    public C6121c mo19658i() {
        return this.f19012d;
    }

    /* renamed from: j */
    public String mo19659j() {
        return this.f19014f;
    }

    /* renamed from: k */
    public int mo19660k() {
        return this.f19016h;
    }

    /* renamed from: l */
    public long mo19661l() {
        return this.f19009a;
    }

    /* renamed from: m */
    public C6122d mo19662m() {
        return this.f19013e;
    }

    /* renamed from: n */
    public String mo19663n() {
        return this.f19018j;
    }

    /* renamed from: o */
    public int mo19664o() {
        return this.f19017i;
    }
}
