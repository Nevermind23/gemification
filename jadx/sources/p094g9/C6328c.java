package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.c */
final class C6328c extends C6285b0.C6286a {

    /* renamed from: a */
    private final int f19433a;

    /* renamed from: b */
    private final String f19434b;

    /* renamed from: c */
    private final int f19435c;

    /* renamed from: d */
    private final int f19436d;

    /* renamed from: e */
    private final long f19437e;

    /* renamed from: f */
    private final long f19438f;

    /* renamed from: g */
    private final long f19439g;

    /* renamed from: h */
    private final String f19440h;

    /* renamed from: i */
    private final C6331c0 f19441i;

    /* renamed from: g9.c$b */
    static final class C6330b extends C6285b0.C6286a.C6289b {

        /* renamed from: a */
        private Integer f19442a;

        /* renamed from: b */
        private String f19443b;

        /* renamed from: c */
        private Integer f19444c;

        /* renamed from: d */
        private Integer f19445d;

        /* renamed from: e */
        private Long f19446e;

        /* renamed from: f */
        private Long f19447f;

        /* renamed from: g */
        private Long f19448g;

        /* renamed from: h */
        private String f19449h;

        /* renamed from: i */
        private C6331c0 f19450i;

        C6330b() {
        }

        /* renamed from: a */
        public C6285b0.C6286a mo19975a() {
            String str = "";
            if (this.f19442a == null) {
                str = str + " pid";
            }
            if (this.f19443b == null) {
                str = str + " processName";
            }
            if (this.f19444c == null) {
                str = str + " reasonCode";
            }
            if (this.f19445d == null) {
                str = str + " importance";
            }
            if (this.f19446e == null) {
                str = str + " pss";
            }
            if (this.f19447f == null) {
                str = str + " rss";
            }
            if (this.f19448g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C6328c(this.f19442a.intValue(), this.f19443b, this.f19444c.intValue(), this.f19445d.intValue(), this.f19446e.longValue(), this.f19447f.longValue(), this.f19448g.longValue(), this.f19449h, this.f19450i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6286a.C6289b mo19976b(C6331c0 c0Var) {
            this.f19450i = c0Var;
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6286a.C6289b mo19977c(int i) {
            this.f19445d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C6285b0.C6286a.C6289b mo19978d(int i) {
            this.f19442a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6286a.C6289b mo19979e(String str) {
            if (str != null) {
                this.f19443b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        /* renamed from: f */
        public C6285b0.C6286a.C6289b mo19980f(long j) {
            this.f19446e = Long.valueOf(j);
            return this;
        }

        /* renamed from: g */
        public C6285b0.C6286a.C6289b mo19981g(int i) {
            this.f19444c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public C6285b0.C6286a.C6289b mo19982h(long j) {
            this.f19447f = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public C6285b0.C6286a.C6289b mo19983i(long j) {
            this.f19448g = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C6285b0.C6286a.C6289b mo19984j(String str) {
            this.f19449h = str;
            return this;
        }
    }

    /* renamed from: b */
    public C6331c0 mo19959b() {
        return this.f19441i;
    }

    /* renamed from: c */
    public int mo19960c() {
        return this.f19436d;
    }

    /* renamed from: d */
    public int mo19961d() {
        return this.f19433a;
    }

    /* renamed from: e */
    public String mo19962e() {
        return this.f19434b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6286a)) {
            return false;
        }
        C6285b0.C6286a aVar = (C6285b0.C6286a) obj;
        if (this.f19433a == aVar.mo19961d() && this.f19434b.equals(aVar.mo19962e()) && this.f19435c == aVar.mo19964g() && this.f19436d == aVar.mo19960c() && this.f19437e == aVar.mo19963f() && this.f19438f == aVar.mo19965h() && this.f19439g == aVar.mo19966i() && ((str = this.f19440h) != null ? str.equals(aVar.mo19967j()) : aVar.mo19967j() == null)) {
            C6331c0 c0Var = this.f19441i;
            if (c0Var == null) {
                if (aVar.mo19959b() == null) {
                    return true;
                }
            } else if (c0Var.equals(aVar.mo19959b())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo19963f() {
        return this.f19437e;
    }

    /* renamed from: g */
    public int mo19964g() {
        return this.f19435c;
    }

    /* renamed from: h */
    public long mo19965h() {
        return this.f19438f;
    }

    public int hashCode() {
        int i;
        long j = this.f19437e;
        long j2 = this.f19438f;
        long j3 = this.f19439g;
        int hashCode = (((((((((((((this.f19433a ^ 1000003) * 1000003) ^ this.f19434b.hashCode()) * 1000003) ^ this.f19435c) * 1000003) ^ this.f19436d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f19440h;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C6331c0 c0Var = this.f19441i;
        if (c0Var != null) {
            i2 = c0Var.hashCode();
        }
        return i3 ^ i2;
    }

    /* renamed from: i */
    public long mo19966i() {
        return this.f19439g;
    }

    /* renamed from: j */
    public String mo19967j() {
        return this.f19440h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f19433a + ", processName=" + this.f19434b + ", reasonCode=" + this.f19435c + ", importance=" + this.f19436d + ", pss=" + this.f19437e + ", rss=" + this.f19438f + ", timestamp=" + this.f19439g + ", traceFile=" + this.f19440h + ", buildIdMappingForArch=" + this.f19441i + "}";
    }

    private C6328c(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, C6331c0 c0Var) {
        this.f19433a = i;
        this.f19434b = str;
        this.f19435c = i2;
        this.f19436d = i3;
        this.f19437e = j;
        this.f19438f = j2;
        this.f19439g = j3;
        this.f19440h = str2;
        this.f19441i = c0Var;
    }
}
