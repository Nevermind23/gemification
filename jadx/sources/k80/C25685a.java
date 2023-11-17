package k80;

import kotlin.jvm.internal.C41536l;

/* renamed from: k80.a */
public final class C25685a {

    /* renamed from: a */
    private final String f65409a;

    /* renamed from: b */
    private final String f65410b;

    public C25685a(String str, String str2) {
        C41536l.m120489i(str, "serviceKey");
        C41536l.m120489i(str2, "serviceStatus");
        this.f65409a = str;
        this.f65410b = str2;
    }

    /* renamed from: a */
    public final String mo64188a() {
        return this.f65409a;
    }

    /* renamed from: b */
    public final String mo64189b() {
        return this.f65410b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25685a)) {
            return false;
        }
        C25685a aVar = (C25685a) obj;
        return C41536l.m120484d(this.f65409a, aVar.f65409a) && C41536l.m120484d(this.f65410b, aVar.f65410b);
    }

    public int hashCode() {
        return (this.f65409a.hashCode() * 31) + this.f65410b.hashCode();
    }

    public String toString() {
        String str = this.f65409a;
        String str2 = this.f65410b;
        return "CreditInfoStatus(serviceKey=" + str + ", serviceStatus=" + str2 + ")";
    }
}
