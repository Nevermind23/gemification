package dk0;

import kotlin.jvm.internal.C41536l;

/* renamed from: dk0.g */
public final class C20037g {

    /* renamed from: a */
    private final String f54648a;

    /* renamed from: b */
    private final String f54649b;

    /* renamed from: c */
    private final String f54650c;

    /* renamed from: d */
    private final String f54651d;

    /* renamed from: e */
    private final String f54652e;

    /* renamed from: f */
    private final String f54653f;

    /* renamed from: g */
    private final String f54654g;

    public C20037g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "address1");
        C41536l.m120489i(str2, "administrativeArea");
        C41536l.m120489i(str3, "countryCode");
        C41536l.m120489i(str4, "locality");
        C41536l.m120489i(str5, "name");
        C41536l.m120489i(str6, "phoneNumber");
        C41536l.m120489i(str7, "postalCode");
        this.f54648a = str;
        this.f54649b = str2;
        this.f54650c = str3;
        this.f54651d = str4;
        this.f54652e = str5;
        this.f54653f = str6;
        this.f54654g = str7;
    }

    /* renamed from: a */
    public final String mo48428a() {
        return this.f54648a;
    }

    /* renamed from: b */
    public final String mo48429b() {
        return this.f54649b;
    }

    /* renamed from: c */
    public final String mo48430c() {
        return this.f54650c;
    }

    /* renamed from: d */
    public final String mo48431d() {
        return this.f54651d;
    }

    /* renamed from: e */
    public final String mo48432e() {
        return this.f54652e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20037g)) {
            return false;
        }
        C20037g gVar = (C20037g) obj;
        return C41536l.m120484d(this.f54648a, gVar.f54648a) && C41536l.m120484d(this.f54649b, gVar.f54649b) && C41536l.m120484d(this.f54650c, gVar.f54650c) && C41536l.m120484d(this.f54651d, gVar.f54651d) && C41536l.m120484d(this.f54652e, gVar.f54652e) && C41536l.m120484d(this.f54653f, gVar.f54653f) && C41536l.m120484d(this.f54654g, gVar.f54654g);
    }

    /* renamed from: f */
    public final String mo48434f() {
        return this.f54653f;
    }

    /* renamed from: g */
    public final String mo48435g() {
        return this.f54654g;
    }

    public int hashCode() {
        return (((((((((((this.f54648a.hashCode() * 31) + this.f54649b.hashCode()) * 31) + this.f54650c.hashCode()) * 31) + this.f54651d.hashCode()) * 31) + this.f54652e.hashCode()) * 31) + this.f54653f.hashCode()) * 31) + this.f54654g.hashCode();
    }

    public String toString() {
        String str = this.f54648a;
        String str2 = this.f54649b;
        String str3 = this.f54650c;
        String str4 = this.f54651d;
        String str5 = this.f54652e;
        String str6 = this.f54653f;
        String str7 = this.f54654g;
        return "UserAddress(address1=" + str + ", administrativeArea=" + str2 + ", countryCode=" + str3 + ", locality=" + str4 + ", name=" + str5 + ", phoneNumber=" + str6 + ", postalCode=" + str7 + ")";
    }
}
