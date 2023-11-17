package hn0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.c */
public final class C15538c {

    /* renamed from: a */
    private final String f44104a;

    /* renamed from: b */
    private final String f44105b;

    public C15538c(String str, String str2) {
        C41536l.m120489i(str, "countryCode");
        C41536l.m120489i(str2, "countryName");
        this.f44104a = str;
        this.f44105b = str2;
    }

    /* renamed from: a */
    public final String mo42663a() {
        return this.f44104a;
    }

    /* renamed from: b */
    public final String mo42664b() {
        return this.f44105b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15538c)) {
            return false;
        }
        C15538c cVar = (C15538c) obj;
        return C41536l.m120484d(this.f44104a, cVar.f44104a) && C41536l.m120484d(this.f44105b, cVar.f44105b);
    }

    public int hashCode() {
        return (this.f44104a.hashCode() * 31) + this.f44105b.hashCode();
    }

    public String toString() {
        String str = this.f44104a;
        String str2 = this.f44105b;
        return "Country(countryCode=" + str + ", countryName=" + str2 + ")";
    }
}
