package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.i */
final class C6351i extends C6285b0.C6297e.C6298a {

    /* renamed from: a */
    private final String f19492a;

    /* renamed from: b */
    private final String f19493b;

    /* renamed from: c */
    private final String f19494c;

    /* renamed from: d */
    private final String f19495d;

    /* renamed from: e */
    private final String f19496e;

    /* renamed from: f */
    private final String f19497f;

    /* renamed from: g9.i$b */
    static final class C6353b extends C6285b0.C6297e.C6298a.C6299a {

        /* renamed from: a */
        private String f19498a;

        /* renamed from: b */
        private String f19499b;

        /* renamed from: c */
        private String f19500c;

        /* renamed from: d */
        private String f19501d;

        /* renamed from: e */
        private String f19502e;

        /* renamed from: f */
        private String f19503f;

        C6353b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6298a mo20022a() {
            String str = "";
            if (this.f19498a == null) {
                str = str + " identifier";
            }
            if (this.f19499b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C6351i(this.f19498a, this.f19499b, this.f19500c, (C6285b0.C6297e.C6298a.C6300b) null, this.f19501d, this.f19502e, this.f19503f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6298a.C6299a mo20023b(String str) {
            this.f19502e = str;
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6298a.C6299a mo20024c(String str) {
            this.f19503f = str;
            return this;
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6298a.C6299a mo20025d(String str) {
            this.f19500c = str;
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6298a.C6299a mo20026e(String str) {
            if (str != null) {
                this.f19498a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: f */
        public C6285b0.C6297e.C6298a.C6299a mo20027f(String str) {
            this.f19501d = str;
            return this;
        }

        /* renamed from: g */
        public C6285b0.C6297e.C6298a.C6299a mo20028g(String str) {
            if (str != null) {
                this.f19499b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    /* renamed from: b */
    public String mo20015b() {
        return this.f19496e;
    }

    /* renamed from: c */
    public String mo20016c() {
        return this.f19497f;
    }

    /* renamed from: d */
    public String mo20017d() {
        return this.f19494c;
    }

    /* renamed from: e */
    public String mo20018e() {
        return this.f19492a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6298a)) {
            return false;
        }
        C6285b0.C6297e.C6298a aVar = (C6285b0.C6297e.C6298a) obj;
        if (this.f19492a.equals(aVar.mo20018e()) && this.f19493b.equals(aVar.mo20021h()) && ((str = this.f19494c) != null ? str.equals(aVar.mo20017d()) : aVar.mo20017d() == null)) {
            aVar.mo20020g();
            String str2 = this.f19495d;
            if (str2 != null ? str2.equals(aVar.mo20019f()) : aVar.mo20019f() == null) {
                String str3 = this.f19496e;
                if (str3 != null ? str3.equals(aVar.mo20015b()) : aVar.mo20015b() == null) {
                    String str4 = this.f19497f;
                    if (str4 == null) {
                        if (aVar.mo20016c() == null) {
                            return true;
                        }
                    } else if (str4.equals(aVar.mo20016c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo20019f() {
        return this.f19495d;
    }

    /* renamed from: g */
    public C6285b0.C6297e.C6298a.C6300b mo20020g() {
        return null;
    }

    /* renamed from: h */
    public String mo20021h() {
        return this.f19493b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((this.f19492a.hashCode() ^ 1000003) * 1000003) ^ this.f19493b.hashCode()) * 1000003;
        String str = this.f19494c;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (((hashCode ^ i) * 1000003) ^ 0) * 1000003;
        String str2 = this.f19495d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        String str3 = this.f19496e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        String str4 = this.f19497f;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i7 ^ i4;
    }

    public String toString() {
        return "Application{identifier=" + this.f19492a + ", version=" + this.f19493b + ", displayVersion=" + this.f19494c + ", organization=" + null + ", installationUuid=" + this.f19495d + ", developmentPlatform=" + this.f19496e + ", developmentPlatformVersion=" + this.f19497f + "}";
    }

    private C6351i(String str, String str2, String str3, C6285b0.C6297e.C6298a.C6300b bVar, String str4, String str5, String str6) {
        this.f19492a = str;
        this.f19493b = str2;
        this.f19494c = str3;
        this.f19495d = str4;
        this.f19496e = str5;
        this.f19497f = str6;
    }
}
