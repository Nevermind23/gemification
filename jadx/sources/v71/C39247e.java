package v71;

import kotlin.jvm.internal.C41536l;

/* renamed from: v71.e */
public final class C39247e {

    /* renamed from: a */
    private final String f93449a;

    /* renamed from: b */
    private final String f93450b;

    /* renamed from: c */
    private final String f93451c;

    public C39247e(String str, String str2, String str3) {
        C41536l.m120489i(str, "passTitle");
        C41536l.m120489i(str2, "startDate");
        C41536l.m120489i(str3, "endDate");
        this.f93449a = str;
        this.f93450b = str2;
        this.f93451c = str3;
    }

    /* renamed from: a */
    public final String mo92886a() {
        return this.f93451c;
    }

    /* renamed from: b */
    public final String mo92887b() {
        return this.f93449a;
    }

    /* renamed from: c */
    public final String mo92888c() {
        return this.f93450b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39247e)) {
            return false;
        }
        C39247e eVar = (C39247e) obj;
        return C41536l.m120484d(this.f93449a, eVar.f93449a) && C41536l.m120484d(this.f93450b, eVar.f93450b) && C41536l.m120484d(this.f93451c, eVar.f93451c);
    }

    public int hashCode() {
        return (((this.f93449a.hashCode() * 31) + this.f93450b.hashCode()) * 31) + this.f93451c.hashCode();
    }

    public String toString() {
        String str = this.f93449a;
        String str2 = this.f93450b;
        String str3 = this.f93451c;
        return "PassTypeUiItem(passTitle=" + str + ", startDate=" + str2 + ", endDate=" + str3 + ")";
    }
}
