package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.b */
final class C6282b extends C6285b0 {

    /* renamed from: b */
    private final String f19414b;

    /* renamed from: c */
    private final String f19415c;

    /* renamed from: d */
    private final int f19416d;

    /* renamed from: e */
    private final String f19417e;

    /* renamed from: f */
    private final String f19418f;

    /* renamed from: g */
    private final String f19419g;

    /* renamed from: h */
    private final C6285b0.C6297e f19420h;

    /* renamed from: i */
    private final C6285b0.C6293d f19421i;

    /* renamed from: j */
    private final C6285b0.C6286a f19422j;

    /* renamed from: g9.b$b */
    static final class C6284b extends C6285b0.C6290b {

        /* renamed from: a */
        private String f19423a;

        /* renamed from: b */
        private String f19424b;

        /* renamed from: c */
        private Integer f19425c;

        /* renamed from: d */
        private String f19426d;

        /* renamed from: e */
        private String f19427e;

        /* renamed from: f */
        private String f19428f;

        /* renamed from: g */
        private C6285b0.C6297e f19429g;

        /* renamed from: h */
        private C6285b0.C6293d f19430h;

        /* renamed from: i */
        private C6285b0.C6286a f19431i;

        /* renamed from: a */
        public C6285b0 mo19945a() {
            String str = "";
            if (this.f19423a == null) {
                str = str + " sdkVersion";
            }
            if (this.f19424b == null) {
                str = str + " gmpAppId";
            }
            if (this.f19425c == null) {
                str = str + " platform";
            }
            if (this.f19426d == null) {
                str = str + " installationUuid";
            }
            if (this.f19427e == null) {
                str = str + " buildVersion";
            }
            if (this.f19428f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C6282b(this.f19423a, this.f19424b, this.f19425c.intValue(), this.f19426d, this.f19427e, this.f19428f, this.f19429g, this.f19430h, this.f19431i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6290b mo19946b(C6285b0.C6286a aVar) {
            this.f19431i = aVar;
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6290b mo19947c(String str) {
            if (str != null) {
                this.f19427e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: d */
        public C6285b0.C6290b mo19948d(String str) {
            if (str != null) {
                this.f19428f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        /* renamed from: e */
        public C6285b0.C6290b mo19949e(String str) {
            if (str != null) {
                this.f19424b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        /* renamed from: f */
        public C6285b0.C6290b mo19950f(String str) {
            if (str != null) {
                this.f19426d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        /* renamed from: g */
        public C6285b0.C6290b mo19951g(C6285b0.C6293d dVar) {
            this.f19430h = dVar;
            return this;
        }

        /* renamed from: h */
        public C6285b0.C6290b mo19952h(int i) {
            this.f19425c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public C6285b0.C6290b mo19953i(String str) {
            if (str != null) {
                this.f19423a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        /* renamed from: j */
        public C6285b0.C6290b mo19954j(C6285b0.C6297e eVar) {
            this.f19429g = eVar;
            return this;
        }

        C6284b() {
        }

        private C6284b(C6285b0 b0Var) {
            this.f19423a = b0Var.mo19941j();
            this.f19424b = b0Var.mo19936f();
            this.f19425c = Integer.valueOf(b0Var.mo19940i());
            this.f19426d = b0Var.mo19937g();
            this.f19427e = b0Var.mo19933d();
            this.f19428f = b0Var.mo19934e();
            this.f19429g = b0Var.mo19942k();
            this.f19430h = b0Var.mo19938h();
            this.f19431i = b0Var.mo19932c();
        }
    }

    /* renamed from: c */
    public C6285b0.C6286a mo19932c() {
        return this.f19422j;
    }

    /* renamed from: d */
    public String mo19933d() {
        return this.f19418f;
    }

    /* renamed from: e */
    public String mo19934e() {
        return this.f19419g;
    }

    public boolean equals(Object obj) {
        C6285b0.C6297e eVar;
        C6285b0.C6293d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0)) {
            return false;
        }
        C6285b0 b0Var = (C6285b0) obj;
        if (this.f19414b.equals(b0Var.mo19941j()) && this.f19415c.equals(b0Var.mo19936f()) && this.f19416d == b0Var.mo19940i() && this.f19417e.equals(b0Var.mo19937g()) && this.f19418f.equals(b0Var.mo19933d()) && this.f19419g.equals(b0Var.mo19934e()) && ((eVar = this.f19420h) != null ? eVar.equals(b0Var.mo19942k()) : b0Var.mo19942k() == null) && ((dVar = this.f19421i) != null ? dVar.equals(b0Var.mo19938h()) : b0Var.mo19938h() == null)) {
            C6285b0.C6286a aVar = this.f19422j;
            if (aVar == null) {
                if (b0Var.mo19932c() == null) {
                    return true;
                }
            } else if (aVar.equals(b0Var.mo19932c())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo19936f() {
        return this.f19415c;
    }

    /* renamed from: g */
    public String mo19937g() {
        return this.f19417e;
    }

    /* renamed from: h */
    public C6285b0.C6293d mo19938h() {
        return this.f19421i;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = (((((((((((this.f19414b.hashCode() ^ 1000003) * 1000003) ^ this.f19415c.hashCode()) * 1000003) ^ this.f19416d) * 1000003) ^ this.f19417e.hashCode()) * 1000003) ^ this.f19418f.hashCode()) * 1000003) ^ this.f19419g.hashCode()) * 1000003;
        C6285b0.C6297e eVar = this.f19420h;
        int i3 = 0;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        C6285b0.C6293d dVar = this.f19421i;
        if (dVar == null) {
            i2 = 0;
        } else {
            i2 = dVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        C6285b0.C6286a aVar = this.f19422j;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return i5 ^ i3;
    }

    /* renamed from: i */
    public int mo19940i() {
        return this.f19416d;
    }

    /* renamed from: j */
    public String mo19941j() {
        return this.f19414b;
    }

    /* renamed from: k */
    public C6285b0.C6297e mo19942k() {
        return this.f19420h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C6285b0.C6290b mo19943l() {
        return new C6284b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f19414b + ", gmpAppId=" + this.f19415c + ", platform=" + this.f19416d + ", installationUuid=" + this.f19417e + ", buildVersion=" + this.f19418f + ", displayVersion=" + this.f19419g + ", session=" + this.f19420h + ", ndkPayload=" + this.f19421i + ", appExitInfo=" + this.f19422j + "}";
    }

    private C6282b(String str, String str2, int i, String str3, String str4, String str5, C6285b0.C6297e eVar, C6285b0.C6293d dVar, C6285b0.C6286a aVar) {
        this.f19414b = str;
        this.f19415c = str2;
        this.f19416d = i;
        this.f19417e = str3;
        this.f19418f = str4;
        this.f19419g = str5;
        this.f19420h = eVar;
        this.f19421i = dVar;
        this.f19422j = aVar;
    }
}
