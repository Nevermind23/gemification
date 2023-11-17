package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.d */
final class C6332d extends C6285b0.C6286a.C6287a {

    /* renamed from: a */
    private final String f19452a;

    /* renamed from: b */
    private final String f19453b;

    /* renamed from: c */
    private final String f19454c;

    /* renamed from: g9.d$b */
    static final class C6334b extends C6285b0.C6286a.C6287a.C6288a {

        /* renamed from: a */
        private String f19455a;

        /* renamed from: b */
        private String f19456b;

        /* renamed from: c */
        private String f19457c;

        C6334b() {
        }

        /* renamed from: a */
        public C6285b0.C6286a.C6287a mo19971a() {
            String str = "";
            if (this.f19455a == null) {
                str = str + " arch";
            }
            if (this.f19456b == null) {
                str = str + " libraryName";
            }
            if (this.f19457c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C6332d(this.f19455a, this.f19456b, this.f19457c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6286a.C6287a.C6288a mo19972b(String str) {
            if (str != null) {
                this.f19455a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        /* renamed from: c */
        public C6285b0.C6286a.C6287a.C6288a mo19973c(String str) {
            if (str != null) {
                this.f19457c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        /* renamed from: d */
        public C6285b0.C6286a.C6287a.C6288a mo19974d(String str) {
            if (str != null) {
                this.f19456b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    /* renamed from: b */
    public String mo19968b() {
        return this.f19452a;
    }

    /* renamed from: c */
    public String mo19969c() {
        return this.f19454c;
    }

    /* renamed from: d */
    public String mo19970d() {
        return this.f19453b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6286a.C6287a)) {
            return false;
        }
        C6285b0.C6286a.C6287a aVar = (C6285b0.C6286a.C6287a) obj;
        if (!this.f19452a.equals(aVar.mo19968b()) || !this.f19453b.equals(aVar.mo19970d()) || !this.f19454c.equals(aVar.mo19969c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f19452a.hashCode() ^ 1000003) * 1000003) ^ this.f19453b.hashCode()) * 1000003) ^ this.f19454c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f19452a + ", libraryName=" + this.f19453b + ", buildId=" + this.f19454c + "}";
    }

    private C6332d(String str, String str2, String str3) {
        this.f19452a = str;
        this.f19453b = str2;
        this.f19454c = str3;
    }
}
