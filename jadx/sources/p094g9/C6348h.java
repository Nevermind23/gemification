package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.h */
final class C6348h extends C6285b0.C6297e {

    /* renamed from: a */
    private final String f19470a;

    /* renamed from: b */
    private final String f19471b;

    /* renamed from: c */
    private final long f19472c;

    /* renamed from: d */
    private final Long f19473d;

    /* renamed from: e */
    private final boolean f19474e;

    /* renamed from: f */
    private final C6285b0.C6297e.C6298a f19475f;

    /* renamed from: g */
    private final C6285b0.C6297e.C6326f f19476g;

    /* renamed from: h */
    private final C6285b0.C6297e.C6324e f19477h;

    /* renamed from: i */
    private final C6285b0.C6297e.C6302c f19478i;

    /* renamed from: j */
    private final C6331c0 f19479j;

    /* renamed from: k */
    private final int f19480k;

    /* renamed from: g9.h$b */
    static final class C6350b extends C6285b0.C6297e.C6301b {

        /* renamed from: a */
        private String f19481a;

        /* renamed from: b */
        private String f19482b;

        /* renamed from: c */
        private Long f19483c;

        /* renamed from: d */
        private Long f19484d;

        /* renamed from: e */
        private Boolean f19485e;

        /* renamed from: f */
        private C6285b0.C6297e.C6298a f19486f;

        /* renamed from: g */
        private C6285b0.C6297e.C6326f f19487g;

        /* renamed from: h */
        private C6285b0.C6297e.C6324e f19488h;

        /* renamed from: i */
        private C6285b0.C6297e.C6302c f19489i;

        /* renamed from: j */
        private C6331c0 f19490j;

        /* renamed from: k */
        private Integer f19491k;

        /* renamed from: a */
        public C6285b0.C6297e mo20029a() {
            String str = "";
            if (this.f19481a == null) {
                str = str + " generator";
            }
            if (this.f19482b == null) {
                str = str + " identifier";
            }
            if (this.f19483c == null) {
                str = str + " startedAt";
            }
            if (this.f19485e == null) {
                str = str + " crashed";
            }
            if (this.f19486f == null) {
                str = str + " app";
            }
            if (this.f19491k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C6348h(this.f19481a, this.f19482b, this.f19483c.longValue(), this.f19484d, this.f19485e.booleanValue(), this.f19486f, this.f19487g, this.f19488h, this.f19489i, this.f19490j, this.f19491k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6301b mo20030b(C6285b0.C6297e.C6298a aVar) {
            if (aVar != null) {
                this.f19486f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6301b mo20031c(boolean z) {
            this.f19485e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6301b mo20032d(C6285b0.C6297e.C6302c cVar) {
            this.f19489i = cVar;
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6301b mo20033e(Long l) {
            this.f19484d = l;
            return this;
        }

        /* renamed from: f */
        public C6285b0.C6297e.C6301b mo20034f(C6331c0 c0Var) {
            this.f19490j = c0Var;
            return this;
        }

        /* renamed from: g */
        public C6285b0.C6297e.C6301b mo20035g(String str) {
            if (str != null) {
                this.f19481a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        /* renamed from: h */
        public C6285b0.C6297e.C6301b mo20036h(int i) {
            this.f19491k = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public C6285b0.C6297e.C6301b mo20037i(String str) {
            if (str != null) {
                this.f19482b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: k */
        public C6285b0.C6297e.C6301b mo20039k(C6285b0.C6297e.C6324e eVar) {
            this.f19488h = eVar;
            return this;
        }

        /* renamed from: l */
        public C6285b0.C6297e.C6301b mo20040l(long j) {
            this.f19483c = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public C6285b0.C6297e.C6301b mo20041m(C6285b0.C6297e.C6326f fVar) {
            this.f19487g = fVar;
            return this;
        }

        C6350b() {
        }

        private C6350b(C6285b0.C6297e eVar) {
            this.f19481a = eVar.mo20004f();
            this.f19482b = eVar.mo20006h();
            this.f19483c = Long.valueOf(eVar.mo20009k());
            this.f19484d = eVar.mo20002d();
            this.f19485e = Boolean.valueOf(eVar.mo20011m());
            this.f19486f = eVar.mo20000b();
            this.f19487g = eVar.mo20010l();
            this.f19488h = eVar.mo20008j();
            this.f19489i = eVar.mo20001c();
            this.f19490j = eVar.mo20003e();
            this.f19491k = Integer.valueOf(eVar.mo20005g());
        }
    }

    /* renamed from: b */
    public C6285b0.C6297e.C6298a mo20000b() {
        return this.f19475f;
    }

    /* renamed from: c */
    public C6285b0.C6297e.C6302c mo20001c() {
        return this.f19478i;
    }

    /* renamed from: d */
    public Long mo20002d() {
        return this.f19473d;
    }

    /* renamed from: e */
    public C6331c0 mo20003e() {
        return this.f19479j;
    }

    public boolean equals(Object obj) {
        Long l;
        C6285b0.C6297e.C6326f fVar;
        C6285b0.C6297e.C6324e eVar;
        C6285b0.C6297e.C6302c cVar;
        C6331c0 c0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e)) {
            return false;
        }
        C6285b0.C6297e eVar2 = (C6285b0.C6297e) obj;
        if (!this.f19470a.equals(eVar2.mo20004f()) || !this.f19471b.equals(eVar2.mo20006h()) || this.f19472c != eVar2.mo20009k() || ((l = this.f19473d) != null ? !l.equals(eVar2.mo20002d()) : eVar2.mo20002d() != null) || this.f19474e != eVar2.mo20011m() || !this.f19475f.equals(eVar2.mo20000b()) || ((fVar = this.f19476g) != null ? !fVar.equals(eVar2.mo20010l()) : eVar2.mo20010l() != null) || ((eVar = this.f19477h) != null ? !eVar.equals(eVar2.mo20008j()) : eVar2.mo20008j() != null) || ((cVar = this.f19478i) != null ? !cVar.equals(eVar2.mo20001c()) : eVar2.mo20001c() != null) || ((c0Var = this.f19479j) != null ? !c0Var.equals(eVar2.mo20003e()) : eVar2.mo20003e() != null) || this.f19480k != eVar2.mo20005g()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo20004f() {
        return this.f19470a;
    }

    /* renamed from: g */
    public int mo20005g() {
        return this.f19480k;
    }

    /* renamed from: h */
    public String mo20006h() {
        return this.f19471b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j = this.f19472c;
        int hashCode = (((((this.f19470a.hashCode() ^ 1000003) * 1000003) ^ this.f19471b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f19473d;
        int i6 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i7 = (hashCode ^ i) * 1000003;
        if (this.f19474e) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int hashCode2 = (((i7 ^ i2) * 1000003) ^ this.f19475f.hashCode()) * 1000003;
        C6285b0.C6297e.C6326f fVar = this.f19476g;
        if (fVar == null) {
            i3 = 0;
        } else {
            i3 = fVar.hashCode();
        }
        int i8 = (hashCode2 ^ i3) * 1000003;
        C6285b0.C6297e.C6324e eVar = this.f19477h;
        if (eVar == null) {
            i4 = 0;
        } else {
            i4 = eVar.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        C6285b0.C6297e.C6302c cVar = this.f19478i;
        if (cVar == null) {
            i5 = 0;
        } else {
            i5 = cVar.hashCode();
        }
        int i12 = (i9 ^ i5) * 1000003;
        C6331c0 c0Var = this.f19479j;
        if (c0Var != null) {
            i6 = c0Var.hashCode();
        }
        return ((i12 ^ i6) * 1000003) ^ this.f19480k;
    }

    /* renamed from: j */
    public C6285b0.C6297e.C6324e mo20008j() {
        return this.f19477h;
    }

    /* renamed from: k */
    public long mo20009k() {
        return this.f19472c;
    }

    /* renamed from: l */
    public C6285b0.C6297e.C6326f mo20010l() {
        return this.f19476g;
    }

    /* renamed from: m */
    public boolean mo20011m() {
        return this.f19474e;
    }

    /* renamed from: n */
    public C6285b0.C6297e.C6301b mo20012n() {
        return new C6350b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f19470a + ", identifier=" + this.f19471b + ", startedAt=" + this.f19472c + ", endedAt=" + this.f19473d + ", crashed=" + this.f19474e + ", app=" + this.f19475f + ", user=" + this.f19476g + ", os=" + this.f19477h + ", device=" + this.f19478i + ", events=" + this.f19479j + ", generatorType=" + this.f19480k + "}";
    }

    private C6348h(String str, String str2, long j, Long l, boolean z, C6285b0.C6297e.C6298a aVar, C6285b0.C6297e.C6326f fVar, C6285b0.C6297e.C6324e eVar, C6285b0.C6297e.C6302c cVar, C6331c0 c0Var, int i) {
        this.f19470a = str;
        this.f19471b = str2;
        this.f19472c = j;
        this.f19473d = l;
        this.f19474e = z;
        this.f19475f = aVar;
        this.f19476g = fVar;
        this.f19477h = eVar;
        this.f19478i = cVar;
        this.f19479j = c0Var;
        this.f19480k = i;
    }
}
