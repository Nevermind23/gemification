package p028ba;

import p028ba.C2193d;

/* renamed from: ba.a */
final class C2186a extends C2193d {

    /* renamed from: a */
    private final String f6379a;

    /* renamed from: b */
    private final String f6380b;

    /* renamed from: c */
    private final String f6381c;

    /* renamed from: d */
    private final C2197f f6382d;

    /* renamed from: e */
    private final C2193d.C2195b f6383e;

    /* renamed from: ba.a$b */
    static final class C2188b extends C2193d.C2194a {

        /* renamed from: a */
        private String f6384a;

        /* renamed from: b */
        private String f6385b;

        /* renamed from: c */
        private String f6386c;

        /* renamed from: d */
        private C2197f f6387d;

        /* renamed from: e */
        private C2193d.C2195b f6388e;

        C2188b() {
        }

        /* renamed from: a */
        public C2193d mo7107a() {
            return new C2186a(this.f6384a, this.f6385b, this.f6386c, this.f6387d, this.f6388e);
        }

        /* renamed from: b */
        public C2193d.C2194a mo7108b(C2197f fVar) {
            this.f6387d = fVar;
            return this;
        }

        /* renamed from: c */
        public C2193d.C2194a mo7109c(String str) {
            this.f6385b = str;
            return this;
        }

        /* renamed from: d */
        public C2193d.C2194a mo7110d(String str) {
            this.f6386c = str;
            return this;
        }

        /* renamed from: e */
        public C2193d.C2194a mo7111e(C2193d.C2195b bVar) {
            this.f6388e = bVar;
            return this;
        }

        /* renamed from: f */
        public C2193d.C2194a mo7112f(String str) {
            this.f6384a = str;
            return this;
        }
    }

    /* renamed from: b */
    public C2197f mo7099b() {
        return this.f6382d;
    }

    /* renamed from: c */
    public String mo7100c() {
        return this.f6380b;
    }

    /* renamed from: d */
    public String mo7101d() {
        return this.f6381c;
    }

    /* renamed from: e */
    public C2193d.C2195b mo7102e() {
        return this.f6383e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2193d)) {
            return false;
        }
        C2193d dVar = (C2193d) obj;
        String str = this.f6379a;
        if (str != null ? str.equals(dVar.mo7104f()) : dVar.mo7104f() == null) {
            String str2 = this.f6380b;
            if (str2 != null ? str2.equals(dVar.mo7100c()) : dVar.mo7100c() == null) {
                String str3 = this.f6381c;
                if (str3 != null ? str3.equals(dVar.mo7101d()) : dVar.mo7101d() == null) {
                    C2197f fVar = this.f6382d;
                    if (fVar != null ? fVar.equals(dVar.mo7099b()) : dVar.mo7099b() == null) {
                        C2193d.C2195b bVar = this.f6383e;
                        if (bVar == null) {
                            if (dVar.mo7102e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.mo7102e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo7104f() {
        return this.f6379a;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f6379a;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        String str2 = this.f6380b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f6381c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        C2197f fVar = this.f6382d;
        if (fVar == null) {
            i4 = 0;
        } else {
            i4 = fVar.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        C2193d.C2195b bVar = this.f6383e;
        if (bVar != null) {
            i5 = bVar.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f6379a + ", fid=" + this.f6380b + ", refreshToken=" + this.f6381c + ", authToken=" + this.f6382d + ", responseCode=" + this.f6383e + "}";
    }

    private C2186a(String str, String str2, String str3, C2197f fVar, C2193d.C2195b bVar) {
        this.f6379a = str;
        this.f6380b = str2;
        this.f6381c = str3;
        this.f6382d = fVar;
        this.f6383e = bVar;
    }
}
