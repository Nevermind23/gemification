package hn0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.b */
public final class C15537b {

    /* renamed from: a */
    private final String f44101a;

    /* renamed from: b */
    private final String f44102b;

    /* renamed from: c */
    private final String f44103c;

    public C15537b(String str, String str2, String str3) {
        C41536l.m120489i(str, "regionCode");
        C41536l.m120489i(str2, "name");
        this.f44101a = str;
        this.f44102b = str2;
        this.f44103c = str3;
    }

    /* renamed from: a */
    public final String mo42657a() {
        return this.f44103c;
    }

    /* renamed from: b */
    public final String mo42658b() {
        return this.f44102b;
    }

    /* renamed from: c */
    public final String mo42659c() {
        return this.f44101a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15537b)) {
            return false;
        }
        C15537b bVar = (C15537b) obj;
        return C41536l.m120484d(this.f44101a, bVar.f44101a) && C41536l.m120484d(this.f44102b, bVar.f44102b) && C41536l.m120484d(this.f44103c, bVar.f44103c);
    }

    public int hashCode() {
        int hashCode = ((this.f44101a.hashCode() * 31) + this.f44102b.hashCode()) * 31;
        String str = this.f44103c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f44101a;
        String str2 = this.f44102b;
        String str3 = this.f44103c;
        return "City(regionCode=" + str + ", name=" + str2 + ", countryCode=" + str3 + ")";
    }
}
