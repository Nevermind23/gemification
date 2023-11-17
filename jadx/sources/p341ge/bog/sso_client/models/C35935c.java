package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.c */
public final class C35935c {

    /* renamed from: a */
    private final String f86921a;

    /* renamed from: b */
    private final String f86922b;

    /* renamed from: c */
    private final String f86923c;

    /* renamed from: d */
    private final String f86924d;

    /* renamed from: e */
    private final String f86925e;

    public C35935c(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "firstName");
        C41536l.m120489i(str2, "firstNameInt");
        C41536l.m120489i(str3, "hashId");
        C41536l.m120489i(str4, "lastName");
        C41536l.m120489i(str5, "lastNameInt");
        this.f86921a = str;
        this.f86922b = str2;
        this.f86923c = str3;
        this.f86924d = str4;
        this.f86925e = str5;
    }

    /* renamed from: a */
    public final String mo88468a() {
        return this.f86921a;
    }

    /* renamed from: b */
    public final String mo88469b() {
        return this.f86922b;
    }

    /* renamed from: c */
    public final String mo88470c() {
        return this.f86923c;
    }

    /* renamed from: d */
    public final String mo88471d() {
        return this.f86924d;
    }

    /* renamed from: e */
    public final String mo88472e() {
        return this.f86925e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35935c)) {
            return false;
        }
        C35935c cVar = (C35935c) obj;
        return C41536l.m120484d(this.f86921a, cVar.f86921a) && C41536l.m120484d(this.f86922b, cVar.f86922b) && C41536l.m120484d(this.f86923c, cVar.f86923c) && C41536l.m120484d(this.f86924d, cVar.f86924d) && C41536l.m120484d(this.f86925e, cVar.f86925e);
    }

    public int hashCode() {
        return (((((((this.f86921a.hashCode() * 31) + this.f86922b.hashCode()) * 31) + this.f86923c.hashCode()) * 31) + this.f86924d.hashCode()) * 31) + this.f86925e.hashCode();
    }

    public String toString() {
        return "Contact(firstName=" + this.f86921a + ", firstNameInt=" + this.f86922b + ", hashId=" + this.f86923c + ", lastName=" + this.f86924d + ", lastNameInt=" + this.f86925e + ')';
    }
}
