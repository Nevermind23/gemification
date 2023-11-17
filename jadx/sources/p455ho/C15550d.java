package p455ho;

import kotlin.jvm.internal.C41536l;

/* renamed from: ho.d */
public final class C15550d {

    /* renamed from: a */
    private final String f44142a;

    /* renamed from: b */
    private final String f44143b;

    /* renamed from: c */
    private final String f44144c;

    public C15550d(String str, String str2, String str3) {
        C41536l.m120489i(str, "titleKey");
        C41536l.m120489i(str2, "descriptionKey");
        C41536l.m120489i(str3, "fileUrl");
        this.f44142a = str;
        this.f44143b = str2;
        this.f44144c = str3;
    }

    /* renamed from: a */
    public final String mo42725a() {
        return this.f44143b;
    }

    /* renamed from: b */
    public final String mo42726b() {
        return this.f44144c;
    }

    /* renamed from: c */
    public final String mo42727c() {
        return this.f44142a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15550d)) {
            return false;
        }
        C15550d dVar = (C15550d) obj;
        return C41536l.m120484d(this.f44142a, dVar.f44142a) && C41536l.m120484d(this.f44143b, dVar.f44143b) && C41536l.m120484d(this.f44144c, dVar.f44144c);
    }

    public int hashCode() {
        return (((this.f44142a.hashCode() * 31) + this.f44143b.hashCode()) * 31) + this.f44144c.hashCode();
    }

    public String toString() {
        String str = this.f44142a;
        String str2 = this.f44143b;
        String str3 = this.f44144c;
        return "BenefitType(titleKey=" + str + ", descriptionKey=" + str2 + ", fileUrl=" + str3 + ")";
    }
}
