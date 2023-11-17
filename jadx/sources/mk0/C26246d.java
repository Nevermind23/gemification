package mk0;

import kotlin.jvm.internal.C41536l;

/* renamed from: mk0.d */
public final class C26246d {

    /* renamed from: a */
    private final String f66452a;

    /* renamed from: b */
    private final String f66453b;

    /* renamed from: c */
    private final String f66454c;

    /* renamed from: d */
    private final String f66455d;

    /* renamed from: e */
    private final String f66456e;

    /* renamed from: f */
    private final String f66457f;

    /* renamed from: g */
    private final String f66458g;

    public C26246d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "address1");
        C41536l.m120489i(str2, "administrativeArea");
        C41536l.m120489i(str3, "countryCode");
        C41536l.m120489i(str4, "locality");
        C41536l.m120489i(str5, "name");
        C41536l.m120489i(str6, "phoneNumber");
        C41536l.m120489i(str7, "postalCode");
        this.f66452a = str;
        this.f66453b = str2;
        this.f66454c = str3;
        this.f66455d = str4;
        this.f66456e = str5;
        this.f66457f = str6;
        this.f66458g = str7;
    }

    /* renamed from: a */
    public final String mo65256a() {
        return this.f66452a;
    }

    /* renamed from: b */
    public final String mo65257b() {
        return this.f66453b;
    }

    /* renamed from: c */
    public final String mo65258c() {
        return this.f66454c;
    }

    /* renamed from: d */
    public final String mo65259d() {
        return this.f66455d;
    }

    /* renamed from: e */
    public final String mo65260e() {
        return this.f66456e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26246d)) {
            return false;
        }
        C26246d dVar = (C26246d) obj;
        return C41536l.m120484d(this.f66452a, dVar.f66452a) && C41536l.m120484d(this.f66453b, dVar.f66453b) && C41536l.m120484d(this.f66454c, dVar.f66454c) && C41536l.m120484d(this.f66455d, dVar.f66455d) && C41536l.m120484d(this.f66456e, dVar.f66456e) && C41536l.m120484d(this.f66457f, dVar.f66457f) && C41536l.m120484d(this.f66458g, dVar.f66458g);
    }

    /* renamed from: f */
    public final String mo65262f() {
        return this.f66457f;
    }

    /* renamed from: g */
    public final String mo65263g() {
        return this.f66458g;
    }

    public int hashCode() {
        return (((((((((((this.f66452a.hashCode() * 31) + this.f66453b.hashCode()) * 31) + this.f66454c.hashCode()) * 31) + this.f66455d.hashCode()) * 31) + this.f66456e.hashCode()) * 31) + this.f66457f.hashCode()) * 31) + this.f66458g.hashCode();
    }

    public String toString() {
        String str = this.f66452a;
        String str2 = this.f66453b;
        String str3 = this.f66454c;
        String str4 = this.f66455d;
        String str5 = this.f66456e;
        String str6 = this.f66457f;
        String str7 = this.f66458g;
        return "UserAddressUiModel(address1=" + str + ", administrativeArea=" + str2 + ", countryCode=" + str3 + ", locality=" + str4 + ", name=" + str5 + ", phoneNumber=" + str6 + ", postalCode=" + str7 + ")";
    }
}
