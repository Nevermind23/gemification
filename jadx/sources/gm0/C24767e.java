package gm0;

import kotlin.jvm.internal.C41536l;

/* renamed from: gm0.e */
public final class C24767e {

    /* renamed from: a */
    private final String f63659a;

    /* renamed from: b */
    private final String f63660b;

    /* renamed from: c */
    private final String f63661c;

    /* renamed from: d */
    private final String f63662d;

    public C24767e(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "surName");
        C41536l.m120489i(str3, "id");
        C41536l.m120489i(str4, "birthDate");
        this.f63659a = str;
        this.f63660b = str2;
        this.f63661c = str3;
        this.f63662d = str4;
    }

    /* renamed from: a */
    public final String mo63160a() {
        return this.f63662d;
    }

    /* renamed from: b */
    public final String mo63161b() {
        return this.f63661c;
    }

    /* renamed from: c */
    public final String mo63162c() {
        return this.f63659a;
    }

    /* renamed from: d */
    public final String mo63163d() {
        return this.f63660b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24767e)) {
            return false;
        }
        C24767e eVar = (C24767e) obj;
        return C41536l.m120484d(this.f63659a, eVar.f63659a) && C41536l.m120484d(this.f63660b, eVar.f63660b) && C41536l.m120484d(this.f63661c, eVar.f63661c) && C41536l.m120484d(this.f63662d, eVar.f63662d);
    }

    public int hashCode() {
        return (((((this.f63659a.hashCode() * 31) + this.f63660b.hashCode()) * 31) + this.f63661c.hashCode()) * 31) + this.f63662d.hashCode();
    }

    public String toString() {
        String str = this.f63659a;
        String str2 = this.f63660b;
        String str3 = this.f63661c;
        String str4 = this.f63662d;
        return "TravelInsuranceSuccessUiModel(name=" + str + ", surName=" + str2 + ", id=" + str3 + ", birthDate=" + str4 + ")";
    }
}
