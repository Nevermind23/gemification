package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.q */
final class C6373q extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d {

    /* renamed from: a */
    private final String f19570a;

    /* renamed from: b */
    private final String f19571b;

    /* renamed from: c */
    private final long f19572c;

    /* renamed from: g9.q$b */
    static final class C6375b extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d.C6314a {

        /* renamed from: a */
        private String f19573a;

        /* renamed from: b */
        private String f19574b;

        /* renamed from: c */
        private Long f19575c;

        C6375b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d mo20115a() {
            String str = "";
            if (this.f19573a == null) {
                str = str + " name";
            }
            if (this.f19574b == null) {
                str = str + " code";
            }
            if (this.f19575c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C6373q(this.f19573a, this.f19574b, this.f19575c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d.C6314a mo20116b(long j) {
            this.f19575c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d.C6314a mo20117c(String str) {
            if (str != null) {
                this.f19574b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d.C6314a mo20118d(String str) {
            if (str != null) {
                this.f19573a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    /* renamed from: b */
    public long mo20112b() {
        return this.f19572c;
    }

    /* renamed from: c */
    public String mo20113c() {
        return this.f19571b;
    }

    /* renamed from: d */
    public String mo20114d() {
        return this.f19570a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d)) {
            return false;
        }
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d dVar = (C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d) obj;
        if (!this.f19570a.equals(dVar.mo20114d()) || !this.f19571b.equals(dVar.mo20113c()) || this.f19572c != dVar.mo20112b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f19572c;
        return ((((this.f19570a.hashCode() ^ 1000003) * 1000003) ^ this.f19571b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f19570a + ", code=" + this.f19571b + ", address=" + this.f19572c + "}";
    }

    private C6373q(String str, String str2, long j) {
        this.f19570a = str;
        this.f19571b = str2;
        this.f19572c = j;
    }
}
