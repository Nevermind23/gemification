package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.k */
final class C6355k extends C6285b0.C6297e.C6302c {

    /* renamed from: a */
    private final int f19504a;

    /* renamed from: b */
    private final String f19505b;

    /* renamed from: c */
    private final int f19506c;

    /* renamed from: d */
    private final long f19507d;

    /* renamed from: e */
    private final long f19508e;

    /* renamed from: f */
    private final boolean f19509f;

    /* renamed from: g */
    private final int f19510g;

    /* renamed from: h */
    private final String f19511h;

    /* renamed from: i */
    private final String f19512i;

    /* renamed from: g9.k$b */
    static final class C6357b extends C6285b0.C6297e.C6302c.C6303a {

        /* renamed from: a */
        private Integer f19513a;

        /* renamed from: b */
        private String f19514b;

        /* renamed from: c */
        private Integer f19515c;

        /* renamed from: d */
        private Long f19516d;

        /* renamed from: e */
        private Long f19517e;

        /* renamed from: f */
        private Boolean f19518f;

        /* renamed from: g */
        private Integer f19519g;

        /* renamed from: h */
        private String f19520h;

        /* renamed from: i */
        private String f19521i;

        C6357b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6302c mo20051a() {
            String str = "";
            if (this.f19513a == null) {
                str = str + " arch";
            }
            if (this.f19514b == null) {
                str = str + " model";
            }
            if (this.f19515c == null) {
                str = str + " cores";
            }
            if (this.f19516d == null) {
                str = str + " ram";
            }
            if (this.f19517e == null) {
                str = str + " diskSpace";
            }
            if (this.f19518f == null) {
                str = str + " simulator";
            }
            if (this.f19519g == null) {
                str = str + " state";
            }
            if (this.f19520h == null) {
                str = str + " manufacturer";
            }
            if (this.f19521i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C6355k(this.f19513a.intValue(), this.f19514b, this.f19515c.intValue(), this.f19516d.longValue(), this.f19517e.longValue(), this.f19518f.booleanValue(), this.f19519g.intValue(), this.f19520h, this.f19521i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6302c.C6303a mo20052b(int i) {
            this.f19513a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6302c.C6303a mo20053c(int i) {
            this.f19515c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6302c.C6303a mo20054d(long j) {
            this.f19517e = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6302c.C6303a mo20055e(String str) {
            if (str != null) {
                this.f19520h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        /* renamed from: f */
        public C6285b0.C6297e.C6302c.C6303a mo20056f(String str) {
            if (str != null) {
                this.f19514b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        /* renamed from: g */
        public C6285b0.C6297e.C6302c.C6303a mo20057g(String str) {
            if (str != null) {
                this.f19521i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        /* renamed from: h */
        public C6285b0.C6297e.C6302c.C6303a mo20058h(long j) {
            this.f19516d = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public C6285b0.C6297e.C6302c.C6303a mo20059i(boolean z) {
            this.f19518f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public C6285b0.C6297e.C6302c.C6303a mo20060j(int i) {
            this.f19519g = Integer.valueOf(i);
            return this;
        }
    }

    /* renamed from: b */
    public int mo20042b() {
        return this.f19504a;
    }

    /* renamed from: c */
    public int mo20043c() {
        return this.f19506c;
    }

    /* renamed from: d */
    public long mo20044d() {
        return this.f19508e;
    }

    /* renamed from: e */
    public String mo20045e() {
        return this.f19511h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6302c)) {
            return false;
        }
        C6285b0.C6297e.C6302c cVar = (C6285b0.C6297e.C6302c) obj;
        if (this.f19504a == cVar.mo20042b() && this.f19505b.equals(cVar.mo20046f()) && this.f19506c == cVar.mo20043c() && this.f19507d == cVar.mo20048h() && this.f19508e == cVar.mo20044d() && this.f19509f == cVar.mo20050j() && this.f19510g == cVar.mo20049i() && this.f19511h.equals(cVar.mo20045e()) && this.f19512i.equals(cVar.mo20047g())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo20046f() {
        return this.f19505b;
    }

    /* renamed from: g */
    public String mo20047g() {
        return this.f19512i;
    }

    /* renamed from: h */
    public long mo20048h() {
        return this.f19507d;
    }

    public int hashCode() {
        int i;
        long j = this.f19507d;
        long j2 = this.f19508e;
        int hashCode = (((((((((this.f19504a ^ 1000003) * 1000003) ^ this.f19505b.hashCode()) * 1000003) ^ this.f19506c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f19509f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f19510g) * 1000003) ^ this.f19511h.hashCode()) * 1000003) ^ this.f19512i.hashCode();
    }

    /* renamed from: i */
    public int mo20049i() {
        return this.f19510g;
    }

    /* renamed from: j */
    public boolean mo20050j() {
        return this.f19509f;
    }

    public String toString() {
        return "Device{arch=" + this.f19504a + ", model=" + this.f19505b + ", cores=" + this.f19506c + ", ram=" + this.f19507d + ", diskSpace=" + this.f19508e + ", simulator=" + this.f19509f + ", state=" + this.f19510g + ", manufacturer=" + this.f19511h + ", modelClass=" + this.f19512i + "}";
    }

    private C6355k(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f19504a = i;
        this.f19505b = str;
        this.f19506c = i2;
        this.f19507d = j;
        this.f19508e = j2;
        this.f19509f = z;
        this.f19510g = i3;
        this.f19511h = str2;
        this.f19512i = str3;
    }
}
