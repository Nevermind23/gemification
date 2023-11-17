package p563pk;

import kotlin.jvm.internal.C41536l;

/* renamed from: pk.c */
public final class C17373c {

    /* renamed from: a */
    private final String f48717a;

    /* renamed from: b */
    private final String f48718b;

    public C17373c(String str, String str2) {
        C41536l.m120489i(str, "phoneNumber");
        C41536l.m120489i(str2, "email");
        this.f48717a = str;
        this.f48718b = str2;
    }

    /* renamed from: a */
    public final String mo44829a() {
        return this.f48718b;
    }

    /* renamed from: b */
    public final String mo44830b() {
        return this.f48717a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17373c)) {
            return false;
        }
        C17373c cVar = (C17373c) obj;
        return C41536l.m120484d(this.f48717a, cVar.f48717a) && C41536l.m120484d(this.f48718b, cVar.f48718b);
    }

    public int hashCode() {
        return (this.f48717a.hashCode() * 31) + this.f48718b.hashCode();
    }

    public String toString() {
        String str = this.f48717a;
        String str2 = this.f48718b;
        return "ContactInfo(phoneNumber=" + str + ", email=" + str2 + ")";
    }
}
