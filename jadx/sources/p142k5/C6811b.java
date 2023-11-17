package p142k5;

/* renamed from: k5.b */
public final class C6811b {

    /* renamed from: a */
    private final String f20464a;

    private C6811b(String str) {
        if (str != null) {
            this.f20464a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C6811b m26540b(String str) {
        return new C6811b(str);
    }

    /* renamed from: a */
    public String mo20883a() {
        return this.f20464a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6811b)) {
            return false;
        }
        return this.f20464a.equals(((C6811b) obj).f20464a);
    }

    public int hashCode() {
        return this.f20464a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f20464a + "\"}";
    }
}
