package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.f */
final class C6342f extends C6285b0.C6293d {

    /* renamed from: a */
    private final C6331c0 f19462a;

    /* renamed from: b */
    private final String f19463b;

    /* renamed from: g9.f$b */
    static final class C6344b extends C6285b0.C6293d.C6294a {

        /* renamed from: a */
        private C6331c0 f19464a;

        /* renamed from: b */
        private String f19465b;

        C6344b() {
        }

        /* renamed from: a */
        public C6285b0.C6293d mo19992a() {
            String str = "";
            if (this.f19464a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new C6342f(this.f19464a, this.f19465b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6293d.C6294a mo19993b(C6331c0 c0Var) {
            if (c0Var != null) {
                this.f19464a = c0Var;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        /* renamed from: c */
        public C6285b0.C6293d.C6294a mo19994c(String str) {
            this.f19465b = str;
            return this;
        }
    }

    /* renamed from: b */
    public C6331c0 mo19990b() {
        return this.f19462a;
    }

    /* renamed from: c */
    public String mo19991c() {
        return this.f19463b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6293d)) {
            return false;
        }
        C6285b0.C6293d dVar = (C6285b0.C6293d) obj;
        if (this.f19462a.equals(dVar.mo19990b())) {
            String str = this.f19463b;
            if (str == null) {
                if (dVar.mo19991c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.mo19991c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f19462a.hashCode() ^ 1000003) * 1000003;
        String str = this.f19463b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f19462a + ", orgId=" + this.f19463b + "}";
    }

    private C6342f(C6331c0 c0Var, String str) {
        this.f19462a = c0Var;
        this.f19463b = str;
    }
}
