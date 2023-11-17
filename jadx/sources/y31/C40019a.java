package y31;

import kotlin.jvm.internal.C41536l;

/* renamed from: y31.a */
public final class C40019a {

    /* renamed from: a */
    private final String f95015a;

    /* renamed from: b */
    private final String f95016b;

    /* renamed from: c */
    private final String f95017c;

    /* renamed from: d */
    private final String f95018d;

    public C40019a(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "number");
        C41536l.m120489i(str3, "normalizedNumber");
        C41536l.m120489i(str4, "photoUri");
        this.f95015a = str;
        this.f95016b = str2;
        this.f95017c = str3;
        this.f95018d = str4;
    }

    /* renamed from: a */
    public final String mo93839a() {
        return this.f95015a;
    }

    /* renamed from: b */
    public final String mo93840b() {
        return this.f95017c;
    }

    /* renamed from: c */
    public final String mo93841c() {
        return this.f95016b;
    }

    /* renamed from: d */
    public final String mo93842d() {
        return this.f95018d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40019a)) {
            return false;
        }
        C40019a aVar = (C40019a) obj;
        return C41536l.m120484d(this.f95015a, aVar.f95015a) && C41536l.m120484d(this.f95016b, aVar.f95016b) && C41536l.m120484d(this.f95017c, aVar.f95017c) && C41536l.m120484d(this.f95018d, aVar.f95018d);
    }

    public int hashCode() {
        return (((((this.f95015a.hashCode() * 31) + this.f95016b.hashCode()) * 31) + this.f95017c.hashCode()) * 31) + this.f95018d.hashCode();
    }

    public String toString() {
        String str = this.f95015a;
        String str2 = this.f95016b;
        String str3 = this.f95017c;
        String str4 = this.f95018d;
        return "ContactUiModel(name=" + str + ", number=" + str2 + ", normalizedNumber=" + str3 + ", photoUri=" + str4 + ")";
    }
}
