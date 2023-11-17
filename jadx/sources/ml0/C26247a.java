package ml0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ml0.a */
public final class C26247a {

    /* renamed from: a */
    private final String f66459a;

    /* renamed from: b */
    private final String f66460b;

    /* renamed from: c */
    private final String f66461c;

    /* renamed from: d */
    private final String f66462d;

    /* renamed from: e */
    private final String f66463e;

    public C26247a(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str4, "contactUsage");
        C41536l.m120489i(str5, "route");
        this.f66459a = str;
        this.f66460b = str2;
        this.f66461c = str3;
        this.f66462d = str4;
        this.f66463e = str5;
    }

    /* renamed from: a */
    public final String mo65266a() {
        return this.f66459a;
    }

    /* renamed from: b */
    public final String mo65267b() {
        return this.f66463e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26247a)) {
            return false;
        }
        C26247a aVar = (C26247a) obj;
        return C41536l.m120484d(this.f66459a, aVar.f66459a) && C41536l.m120484d(this.f66460b, aVar.f66460b) && C41536l.m120484d(this.f66461c, aVar.f66461c) && C41536l.m120484d(this.f66462d, aVar.f66462d) && C41536l.m120484d(this.f66463e, aVar.f66463e);
    }

    public int hashCode() {
        int hashCode = this.f66459a.hashCode() * 31;
        String str = this.f66460b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f66461c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + this.f66462d.hashCode()) * 31) + this.f66463e.hashCode();
    }

    public String toString() {
        String str = this.f66459a;
        String str2 = this.f66460b;
        String str3 = this.f66461c;
        String str4 = this.f66462d;
        String str5 = this.f66463e;
        return "InsuranceContactInformation(contactId=" + str + ", contactIdDescription_EN=" + str2 + ", contactIdDescription_GE=" + str3 + ", contactUsage=" + str4 + ", route=" + str5 + ")";
    }
}
