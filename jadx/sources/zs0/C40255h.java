package zs0;

import kotlin.jvm.internal.C41536l;

/* renamed from: zs0.h */
public final class C40255h {

    /* renamed from: a */
    private final String f95691a;

    /* renamed from: b */
    private final String f95692b;

    /* renamed from: c */
    private final String f95693c;

    /* renamed from: d */
    private final String f95694d;

    /* renamed from: e */
    private final String f95695e;

    public C40255h(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "periodType");
        C41536l.m120489i(str2, "startDate");
        C41536l.m120489i(str3, "endDate");
        this.f95691a = str;
        this.f95692b = str2;
        this.f95693c = str3;
        this.f95694d = str4;
        this.f95695e = str5;
    }

    /* renamed from: a */
    public final String mo94274a() {
        return this.f95694d;
    }

    /* renamed from: b */
    public final String mo94275b() {
        return this.f95695e;
    }

    /* renamed from: c */
    public final String mo94276c() {
        return this.f95693c;
    }

    /* renamed from: d */
    public final String mo94277d() {
        return this.f95691a;
    }

    /* renamed from: e */
    public final String mo94278e() {
        return this.f95692b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40255h)) {
            return false;
        }
        C40255h hVar = (C40255h) obj;
        return C41536l.m120484d(this.f95691a, hVar.f95691a) && C41536l.m120484d(this.f95692b, hVar.f95692b) && C41536l.m120484d(this.f95693c, hVar.f95693c) && C41536l.m120484d(this.f95694d, hVar.f95694d) && C41536l.m120484d(this.f95695e, hVar.f95695e);
    }

    public int hashCode() {
        int hashCode = ((((this.f95691a.hashCode() * 31) + this.f95692b.hashCode()) * 31) + this.f95693c.hashCode()) * 31;
        String str = this.f95694d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95695e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f95691a;
        String str2 = this.f95692b;
        String str3 = this.f95693c;
        String str4 = this.f95694d;
        String str5 = this.f95695e;
        return "PiggyBankPausePeriod(periodType=" + str + ", startDate=" + str2 + ", endDate=" + str3 + ", dictionaryKey=" + str4 + ", dictionaryValue=" + str5 + ")";
    }
}
