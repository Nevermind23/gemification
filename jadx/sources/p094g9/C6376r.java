package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.r */
final class C6376r extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e {

    /* renamed from: a */
    private final String f19576a;

    /* renamed from: b */
    private final int f19577b;

    /* renamed from: c */
    private final C6331c0 f19578c;

    /* renamed from: g9.r$b */
    static final class C6378b extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6316a {

        /* renamed from: a */
        private String f19579a;

        /* renamed from: b */
        private Integer f19580b;

        /* renamed from: c */
        private C6331c0 f19581c;

        C6378b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e mo20122a() {
            String str = "";
            if (this.f19579a == null) {
                str = str + " name";
            }
            if (this.f19580b == null) {
                str = str + " importance";
            }
            if (this.f19581c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C6376r(this.f19579a, this.f19580b.intValue(), this.f19581c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6316a mo20123b(C6331c0 c0Var) {
            if (c0Var != null) {
                this.f19581c = c0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6316a mo20124c(int i) {
            this.f19580b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6316a mo20125d(String str) {
            if (str != null) {
                this.f19579a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    /* renamed from: b */
    public C6331c0 mo20119b() {
        return this.f19578c;
    }

    /* renamed from: c */
    public int mo20120c() {
        return this.f19577b;
    }

    /* renamed from: d */
    public String mo20121d() {
        return this.f19576a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e)) {
            return false;
        }
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e eVar = (C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e) obj;
        if (!this.f19576a.equals(eVar.mo20121d()) || this.f19577b != eVar.mo20120c() || !this.f19578c.equals(eVar.mo20119b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f19576a.hashCode() ^ 1000003) * 1000003) ^ this.f19577b) * 1000003) ^ this.f19578c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f19576a + ", importance=" + this.f19577b + ", frames=" + this.f19578c + "}";
    }

    private C6376r(String str, int i, C6331c0 c0Var) {
        this.f19576a = str;
        this.f19577b = i;
        this.f19578c = c0Var;
    }
}
