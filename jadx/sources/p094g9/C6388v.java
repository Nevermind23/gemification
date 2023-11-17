package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.v */
final class C6388v extends C6285b0.C6297e.C6324e {

    /* renamed from: a */
    private final int f19606a;

    /* renamed from: b */
    private final String f19607b;

    /* renamed from: c */
    private final String f19608c;

    /* renamed from: d */
    private final boolean f19609d;

    /* renamed from: g9.v$b */
    static final class C6390b extends C6285b0.C6297e.C6324e.C6325a {

        /* renamed from: a */
        private Integer f19610a;

        /* renamed from: b */
        private String f19611b;

        /* renamed from: c */
        private String f19612c;

        /* renamed from: d */
        private Boolean f19613d;

        C6390b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6324e mo20163a() {
            String str = "";
            if (this.f19610a == null) {
                str = str + " platform";
            }
            if (this.f19611b == null) {
                str = str + " version";
            }
            if (this.f19612c == null) {
                str = str + " buildVersion";
            }
            if (this.f19613d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C6388v(this.f19610a.intValue(), this.f19611b, this.f19612c, this.f19613d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6324e.C6325a mo20164b(String str) {
            if (str != null) {
                this.f19612c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6324e.C6325a mo20165c(boolean z) {
            this.f19613d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6324e.C6325a mo20166d(int i) {
            this.f19610a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6324e.C6325a mo20167e(String str) {
            if (str != null) {
                this.f19611b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    /* renamed from: b */
    public String mo20159b() {
        return this.f19608c;
    }

    /* renamed from: c */
    public int mo20160c() {
        return this.f19606a;
    }

    /* renamed from: d */
    public String mo20161d() {
        return this.f19607b;
    }

    /* renamed from: e */
    public boolean mo20162e() {
        return this.f19609d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6324e)) {
            return false;
        }
        C6285b0.C6297e.C6324e eVar = (C6285b0.C6297e.C6324e) obj;
        if (this.f19606a != eVar.mo20160c() || !this.f19607b.equals(eVar.mo20161d()) || !this.f19608c.equals(eVar.mo20159b()) || this.f19609d != eVar.mo20162e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f19606a ^ 1000003) * 1000003) ^ this.f19607b.hashCode()) * 1000003) ^ this.f19608c.hashCode()) * 1000003;
        if (this.f19609d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f19606a + ", version=" + this.f19607b + ", buildVersion=" + this.f19608c + ", jailbroken=" + this.f19609d + "}";
    }

    private C6388v(int i, String str, String str2, boolean z) {
        this.f19606a = i;
        this.f19607b = str;
        this.f19608c = str2;
        this.f19609d = z;
    }
}
