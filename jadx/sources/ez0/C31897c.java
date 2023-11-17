package ez0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ez0.c */
public final class C31897c {

    /* renamed from: a */
    private final String f78625a;

    /* renamed from: b */
    private final String f78626b;

    public C31897c(String str, String str2) {
        C41536l.m120489i(str, "description");
        C41536l.m120489i(str2, "limit");
        this.f78625a = str;
        this.f78626b = str2;
    }

    /* renamed from: a */
    public final String mo72325a() {
        return this.f78625a;
    }

    /* renamed from: b */
    public final String mo72326b() {
        return this.f78626b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31897c)) {
            return false;
        }
        C31897c cVar = (C31897c) obj;
        return C41536l.m120484d(this.f78625a, cVar.f78625a) && C41536l.m120484d(this.f78626b, cVar.f78626b);
    }

    public int hashCode() {
        return (this.f78625a.hashCode() * 31) + this.f78626b.hashCode();
    }

    public String toString() {
        String str = this.f78625a;
        String str2 = this.f78626b;
        return "InsuranceLimitInfo(description=" + str + ", limit=" + str2 + ")";
    }
}
