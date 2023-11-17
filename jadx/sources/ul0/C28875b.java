package ul0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ul0.b */
public final class C28875b {

    /* renamed from: a */
    private final String f73708a;

    /* renamed from: b */
    private final String f73709b;

    public C28875b(String str, String str2) {
        this.f73708a = str;
        this.f73709b = str2;
    }

    /* renamed from: a */
    public final String mo68606a() {
        return this.f73708a;
    }

    /* renamed from: b */
    public final String mo68607b() {
        return this.f73709b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28875b)) {
            return false;
        }
        C28875b bVar = (C28875b) obj;
        return C41536l.m120484d(this.f73708a, bVar.f73708a) && C41536l.m120484d(this.f73709b, bVar.f73709b);
    }

    public int hashCode() {
        String str = this.f73708a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73709b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f73708a;
        String str2 = this.f73709b;
        return "LimitCurrency(code=" + str + ", name=" + str2 + ")";
    }
}
