package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.m */
final class C6361m extends C6285b0.C6297e.C6304d.C6305a {

    /* renamed from: a */
    private final C6285b0.C6297e.C6304d.C6305a.C6307b f19532a;

    /* renamed from: b */
    private final C6331c0 f19533b;

    /* renamed from: c */
    private final C6331c0 f19534c;

    /* renamed from: d */
    private final Boolean f19535d;

    /* renamed from: e */
    private final int f19536e;

    /* renamed from: g9.m$b */
    static final class C6363b extends C6285b0.C6297e.C6304d.C6305a.C6306a {

        /* renamed from: a */
        private C6285b0.C6297e.C6304d.C6305a.C6307b f19537a;

        /* renamed from: b */
        private C6331c0 f19538b;

        /* renamed from: c */
        private C6331c0 f19539c;

        /* renamed from: d */
        private Boolean f19540d;

        /* renamed from: e */
        private Integer f19541e;

        /* renamed from: a */
        public C6285b0.C6297e.C6304d.C6305a mo20073a() {
            String str = "";
            if (this.f19537a == null) {
                str = str + " execution";
            }
            if (this.f19541e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C6361m(this.f19537a, this.f19538b, this.f19539c, this.f19540d, this.f19541e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6305a.C6306a mo20074b(Boolean bool) {
            this.f19540d = bool;
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6304d.C6305a.C6306a mo20075c(C6331c0 c0Var) {
            this.f19538b = c0Var;
            return this;
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6304d.C6305a.C6306a mo20076d(C6285b0.C6297e.C6304d.C6305a.C6307b bVar) {
            if (bVar != null) {
                this.f19537a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6304d.C6305a.C6306a mo20077e(C6331c0 c0Var) {
            this.f19539c = c0Var;
            return this;
        }

        /* renamed from: f */
        public C6285b0.C6297e.C6304d.C6305a.C6306a mo20078f(int i) {
            this.f19541e = Integer.valueOf(i);
            return this;
        }

        C6363b() {
        }

        private C6363b(C6285b0.C6297e.C6304d.C6305a aVar) {
            this.f19537a = aVar.mo20069d();
            this.f19538b = aVar.mo20068c();
            this.f19539c = aVar.mo20070e();
            this.f19540d = aVar.mo20067b();
            this.f19541e = Integer.valueOf(aVar.mo20071f());
        }
    }

    /* renamed from: b */
    public Boolean mo20067b() {
        return this.f19535d;
    }

    /* renamed from: c */
    public C6331c0 mo20068c() {
        return this.f19533b;
    }

    /* renamed from: d */
    public C6285b0.C6297e.C6304d.C6305a.C6307b mo20069d() {
        return this.f19532a;
    }

    /* renamed from: e */
    public C6331c0 mo20070e() {
        return this.f19534c;
    }

    public boolean equals(Object obj) {
        C6331c0 c0Var;
        C6331c0 c0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6304d.C6305a)) {
            return false;
        }
        C6285b0.C6297e.C6304d.C6305a aVar = (C6285b0.C6297e.C6304d.C6305a) obj;
        if (!this.f19532a.equals(aVar.mo20069d()) || ((c0Var = this.f19533b) != null ? !c0Var.equals(aVar.mo20068c()) : aVar.mo20068c() != null) || ((c0Var2 = this.f19534c) != null ? !c0Var2.equals(aVar.mo20070e()) : aVar.mo20070e() != null) || ((bool = this.f19535d) != null ? !bool.equals(aVar.mo20067b()) : aVar.mo20067b() != null) || this.f19536e != aVar.mo20071f()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo20071f() {
        return this.f19536e;
    }

    /* renamed from: g */
    public C6285b0.C6297e.C6304d.C6305a.C6306a mo20072g() {
        return new C6363b(this);
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = (this.f19532a.hashCode() ^ 1000003) * 1000003;
        C6331c0 c0Var = this.f19533b;
        int i3 = 0;
        if (c0Var == null) {
            i = 0;
        } else {
            i = c0Var.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        C6331c0 c0Var2 = this.f19534c;
        if (c0Var2 == null) {
            i2 = 0;
        } else {
            i2 = c0Var2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Boolean bool = this.f19535d;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return ((i5 ^ i3) * 1000003) ^ this.f19536e;
    }

    public String toString() {
        return "Application{execution=" + this.f19532a + ", customAttributes=" + this.f19533b + ", internalKeys=" + this.f19534c + ", background=" + this.f19535d + ", uiOrientation=" + this.f19536e + "}";
    }

    private C6361m(C6285b0.C6297e.C6304d.C6305a.C6307b bVar, C6331c0 c0Var, C6331c0 c0Var2, Boolean bool, int i) {
        this.f19532a = bVar;
        this.f19533b = c0Var;
        this.f19534c = c0Var2;
        this.f19535d = bool;
        this.f19536e = i;
    }
}
