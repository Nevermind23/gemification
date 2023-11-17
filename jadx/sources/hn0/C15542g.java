package hn0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.g */
public final class C15542g {

    /* renamed from: a */
    private final int f44114a;

    /* renamed from: b */
    private final String f44115b;

    /* renamed from: c */
    private final String f44116c;

    public C15542g(int i, String str, String str2) {
        C41536l.m120489i(str, "activityDesc");
        C41536l.m120489i(str2, "code");
        this.f44114a = i;
        this.f44115b = str;
        this.f44116c = str2;
    }

    /* renamed from: a */
    public final String mo42686a() {
        return this.f44115b;
    }

    /* renamed from: b */
    public final int mo42687b() {
        return this.f44114a;
    }

    /* renamed from: c */
    public final boolean mo42688c() {
        return C41536l.m120484d(this.f44116c, "EMPLOYED");
    }

    /* renamed from: d */
    public final boolean mo42689d() {
        return C41536l.m120484d(this.f44116c, "PRIVATE_BUSINESS");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15542g)) {
            return false;
        }
        C15542g gVar = (C15542g) obj;
        return this.f44114a == gVar.f44114a && C41536l.m120484d(this.f44115b, gVar.f44115b) && C41536l.m120484d(this.f44116c, gVar.f44116c);
    }

    public int hashCode() {
        return (((this.f44114a * 31) + this.f44115b.hashCode()) * 31) + this.f44116c.hashCode();
    }

    public String toString() {
        int i = this.f44114a;
        String str = this.f44115b;
        String str2 = this.f44116c;
        return "Occupation(id=" + i + ", activityDesc=" + str + ", code=" + str2 + ")";
    }
}
