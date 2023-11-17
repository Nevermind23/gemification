package p202p0;

import kotlin.jvm.internal.C41536l;

/* renamed from: p0.w */
public final class C7602w {

    /* renamed from: a */
    private final boolean f22168a;

    /* renamed from: b */
    private final boolean f22169b;

    /* renamed from: c */
    private final int f22170c;

    /* renamed from: d */
    private final boolean f22171d;

    /* renamed from: e */
    private final boolean f22172e;

    /* renamed from: f */
    private final int f22173f;

    /* renamed from: g */
    private final int f22174g;

    /* renamed from: h */
    private final int f22175h;

    /* renamed from: i */
    private final int f22176i;

    /* renamed from: j */
    private String f22177j;

    /* renamed from: p0.w$a */
    public static final class C7603a {

        /* renamed from: a */
        private boolean f22178a;

        /* renamed from: b */
        private boolean f22179b;

        /* renamed from: c */
        private int f22180c = -1;

        /* renamed from: d */
        private String f22181d;

        /* renamed from: e */
        private boolean f22182e;

        /* renamed from: f */
        private boolean f22183f;

        /* renamed from: g */
        private int f22184g = -1;

        /* renamed from: h */
        private int f22185h = -1;

        /* renamed from: i */
        private int f22186i = -1;

        /* renamed from: j */
        private int f22187j = -1;

        /* renamed from: i */
        public static /* synthetic */ C7603a m28913i(C7603a aVar, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return aVar.mo22262g(i, z, z2);
        }

        /* renamed from: a */
        public final C7602w mo22256a() {
            String str = this.f22181d;
            if (str != null) {
                return new C7602w(this.f22178a, this.f22179b, str, this.f22182e, this.f22183f, this.f22184g, this.f22185h, this.f22186i, this.f22187j);
            }
            return new C7602w(this.f22178a, this.f22179b, this.f22180c, this.f22182e, this.f22183f, this.f22184g, this.f22185h, this.f22186i, this.f22187j);
        }

        /* renamed from: b */
        public final C7603a mo22257b(int i) {
            this.f22184g = i;
            return this;
        }

        /* renamed from: c */
        public final C7603a mo22258c(int i) {
            this.f22185h = i;
            return this;
        }

        /* renamed from: d */
        public final C7603a mo22259d(boolean z) {
            this.f22178a = z;
            return this;
        }

        /* renamed from: e */
        public final C7603a mo22260e(int i) {
            this.f22186i = i;
            return this;
        }

        /* renamed from: f */
        public final C7603a mo22261f(int i) {
            this.f22187j = i;
            return this;
        }

        /* renamed from: g */
        public final C7603a mo22262g(int i, boolean z, boolean z2) {
            this.f22180c = i;
            this.f22181d = null;
            this.f22182e = z;
            this.f22183f = z2;
            return this;
        }

        /* renamed from: h */
        public final C7603a mo22263h(String str, boolean z, boolean z2) {
            this.f22181d = str;
            this.f22180c = -1;
            this.f22182e = z;
            this.f22183f = z2;
            return this;
        }

        /* renamed from: j */
        public final C7603a mo22264j(boolean z) {
            this.f22179b = z;
            return this;
        }
    }

    public C7602w(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.f22168a = z;
        this.f22169b = z2;
        this.f22170c = i;
        this.f22171d = z3;
        this.f22172e = z4;
        this.f22173f = i2;
        this.f22174g = i3;
        this.f22175h = i4;
        this.f22176i = i5;
    }

    /* renamed from: a */
    public final int mo22245a() {
        return this.f22173f;
    }

    /* renamed from: b */
    public final int mo22246b() {
        return this.f22174g;
    }

    /* renamed from: c */
    public final int mo22247c() {
        return this.f22175h;
    }

    /* renamed from: d */
    public final int mo22248d() {
        return this.f22176i;
    }

    /* renamed from: e */
    public final int mo22249e() {
        return this.f22170c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C41536l.m120484d(C7602w.class, obj.getClass())) {
            return false;
        }
        C7602w wVar = (C7602w) obj;
        if (this.f22168a == wVar.f22168a && this.f22169b == wVar.f22169b && this.f22170c == wVar.f22170c && C41536l.m120484d(this.f22177j, wVar.f22177j) && this.f22171d == wVar.f22171d && this.f22172e == wVar.f22172e && this.f22173f == wVar.f22173f && this.f22174g == wVar.f22174g && this.f22175h == wVar.f22175h && this.f22176i == wVar.f22176i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo22251f() {
        return this.f22171d;
    }

    /* renamed from: g */
    public final boolean mo22252g() {
        return this.f22168a;
    }

    /* renamed from: h */
    public final boolean mo22253h() {
        return this.f22172e;
    }

    public int hashCode() {
        int i;
        int i2 = (((((mo22252g() ? 1 : 0) * true) + (mo22255i() ? 1 : 0)) * 31) + this.f22170c) * 31;
        String str = this.f22177j;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((((i2 + i) * 31) + (mo22251f() ? 1 : 0)) * 31) + (mo22253h() ? 1 : 0)) * 31) + this.f22173f) * 31) + this.f22174g) * 31) + this.f22175h) * 31) + this.f22176i;
    }

    /* renamed from: i */
    public final boolean mo22255i() {
        return this.f22169b;
    }

    public C7602w(boolean z, boolean z2, String str, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, C7589q.f22137m.mo22217a(str).hashCode(), z3, z4, i, i2, i3, i4);
        this.f22177j = str;
    }
}
