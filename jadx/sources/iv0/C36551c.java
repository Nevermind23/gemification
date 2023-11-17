package iv0;

import kotlin.jvm.internal.C41536l;

/* renamed from: iv0.c */
public final class C36551c {

    /* renamed from: a */
    private final String f88084a;

    /* renamed from: b */
    private final String f88085b;

    public C36551c(String str, String str2) {
        C41536l.m120489i(str, "consentId");
        C41536l.m120489i(str2, "authorizationUrl");
        this.f88084a = str;
        this.f88085b = str2;
    }

    /* renamed from: a */
    public final String mo89340a() {
        return this.f88085b;
    }

    /* renamed from: b */
    public final String mo89341b() {
        return this.f88084a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36551c)) {
            return false;
        }
        C36551c cVar = (C36551c) obj;
        return C41536l.m120484d(this.f88084a, cVar.f88084a) && C41536l.m120484d(this.f88085b, cVar.f88085b);
    }

    public int hashCode() {
        return (this.f88084a.hashCode() * 31) + this.f88085b.hashCode();
    }

    public String toString() {
        String str = this.f88084a;
        String str2 = this.f88085b;
        return "Consent(consentId=" + str + ", authorizationUrl=" + str2 + ")";
    }
}
