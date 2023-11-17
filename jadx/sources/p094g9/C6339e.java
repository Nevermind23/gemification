package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.e */
final class C6339e extends C6285b0.C6291c {

    /* renamed from: a */
    private final String f19458a;

    /* renamed from: b */
    private final String f19459b;

    /* renamed from: g9.e$b */
    static final class C6341b extends C6285b0.C6291c.C6292a {

        /* renamed from: a */
        private String f19460a;

        /* renamed from: b */
        private String f19461b;

        C6341b() {
        }

        /* renamed from: a */
        public C6285b0.C6291c mo19987a() {
            String str = "";
            if (this.f19460a == null) {
                str = str + " key";
            }
            if (this.f19461b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C6339e(this.f19460a, this.f19461b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6291c.C6292a mo19988b(String str) {
            if (str != null) {
                this.f19460a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        /* renamed from: c */
        public C6285b0.C6291c.C6292a mo19989c(String str) {
            if (str != null) {
                this.f19461b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    /* renamed from: b */
    public String mo19985b() {
        return this.f19458a;
    }

    /* renamed from: c */
    public String mo19986c() {
        return this.f19459b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6291c)) {
            return false;
        }
        C6285b0.C6291c cVar = (C6285b0.C6291c) obj;
        if (!this.f19458a.equals(cVar.mo19985b()) || !this.f19459b.equals(cVar.mo19986c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f19458a.hashCode() ^ 1000003) * 1000003) ^ this.f19459b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f19458a + ", value=" + this.f19459b + "}";
    }

    private C6339e(String str, String str2) {
        this.f19458a = str;
        this.f19459b = str2;
    }
}
