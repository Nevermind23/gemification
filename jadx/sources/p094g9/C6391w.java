package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.w */
final class C6391w extends C6285b0.C6297e.C6326f {

    /* renamed from: a */
    private final String f19614a;

    /* renamed from: g9.w$b */
    static final class C6393b extends C6285b0.C6297e.C6326f.C6327a {

        /* renamed from: a */
        private String f19615a;

        C6393b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6326f mo20169a() {
            String str = "";
            if (this.f19615a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new C6391w(this.f19615a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6326f.C6327a mo20170b(String str) {
            if (str != null) {
                this.f19615a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    /* renamed from: b */
    public String mo20168b() {
        return this.f19614a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6285b0.C6297e.C6326f) {
            return this.f19614a.equals(((C6285b0.C6297e.C6326f) obj).mo20168b());
        }
        return false;
    }

    public int hashCode() {
        return this.f19614a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f19614a + "}";
    }

    private C6391w(String str) {
        this.f19614a = str;
    }
}
