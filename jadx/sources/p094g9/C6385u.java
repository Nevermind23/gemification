package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.u */
final class C6385u extends C6285b0.C6297e.C6304d.C6322d {

    /* renamed from: a */
    private final String f19604a;

    /* renamed from: g9.u$b */
    static final class C6387b extends C6285b0.C6297e.C6304d.C6322d.C6323a {

        /* renamed from: a */
        private String f19605a;

        C6387b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6304d.C6322d mo20157a() {
            String str = "";
            if (this.f19605a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new C6385u(this.f19605a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6322d.C6323a mo20158b(String str) {
            if (str != null) {
                this.f19605a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    /* renamed from: b */
    public String mo20156b() {
        return this.f19604a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6285b0.C6297e.C6304d.C6322d) {
            return this.f19604a.equals(((C6285b0.C6297e.C6304d.C6322d) obj).mo20156b());
        }
        return false;
    }

    public int hashCode() {
        return this.f19604a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f19604a + "}";
    }

    private C6385u(String str) {
        this.f19604a = str;
    }
}
