package o70;

import kotlin.jvm.internal.C41536l;

/* renamed from: o70.b */
public final class C26763b {

    /* renamed from: a */
    private final boolean f67426a;

    /* renamed from: b */
    private final String f67427b;

    /* renamed from: c */
    private final String f67428c;

    /* renamed from: d */
    private final String f67429d;

    public C26763b(boolean z, String str, String str2, String str3) {
        C41536l.m120489i(str3, "fileSubType");
        this.f67426a = z;
        this.f67427b = str;
        this.f67428c = str2;
        this.f67429d = str3;
    }

    /* renamed from: a */
    public final String mo65984a() {
        return this.f67429d;
    }

    /* renamed from: b */
    public final String mo65985b() {
        return this.f67428c;
    }

    /* renamed from: c */
    public final String mo65986c() {
        return this.f67427b;
    }

    /* renamed from: d */
    public final boolean mo65987d() {
        return this.f67426a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26763b)) {
            return false;
        }
        C26763b bVar = (C26763b) obj;
        return this.f67426a == bVar.f67426a && C41536l.m120484d(this.f67427b, bVar.f67427b) && C41536l.m120484d(this.f67428c, bVar.f67428c) && C41536l.m120484d(this.f67429d, bVar.f67429d);
    }

    public int hashCode() {
        boolean z = this.f67426a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f67427b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f67428c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + this.f67429d.hashCode();
    }

    public String toString() {
        boolean z = this.f67426a;
        String str = this.f67427b;
        String str2 = this.f67428c;
        String str3 = this.f67429d;
        return "CardExternalFile(isDark=" + z + ", fileUrl=" + str + ", fileType=" + str2 + ", fileSubType=" + str3 + ")";
    }
}
