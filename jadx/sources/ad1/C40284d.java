package ad1;

import kotlin.jvm.internal.C41536l;

/* renamed from: ad1.d */
public final class C40284d {

    /* renamed from: a */
    private final String f95728a;

    /* renamed from: b */
    private final String f95729b;

    public C40284d(String str, String str2) {
        this.f95728a = str;
        this.f95729b = str2;
    }

    /* renamed from: a */
    public final String mo94303a() {
        return this.f95729b;
    }

    /* renamed from: b */
    public final String mo94304b() {
        return this.f95728a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40284d)) {
            return false;
        }
        C40284d dVar = (C40284d) obj;
        return C41536l.m120484d(this.f95728a, dVar.f95728a) && C41536l.m120484d(this.f95729b, dVar.f95729b);
    }

    public int hashCode() {
        String str = this.f95728a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95729b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TMXInitConfigParameters(orgId=" + this.f95728a + ", fpServer=" + this.f95729b + ')';
    }
}
