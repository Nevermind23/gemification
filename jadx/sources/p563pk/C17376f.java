package p563pk;

import kotlin.jvm.internal.C41536l;

/* renamed from: pk.f */
public final class C17376f {

    /* renamed from: a */
    private final boolean f48747a;

    /* renamed from: b */
    private final String f48748b;

    /* renamed from: c */
    private final String f48749c;

    public C17376f(boolean z, String str, String str2) {
        C41536l.m120489i(str, "fileUrl");
        C41536l.m120489i(str2, "fileType");
        this.f48747a = z;
        this.f48748b = str;
        this.f48749c = str2;
    }

    /* renamed from: a */
    public final String mo44849a() {
        return this.f48748b;
    }

    /* renamed from: b */
    public final boolean mo44850b() {
        return this.f48747a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17376f)) {
            return false;
        }
        C17376f fVar = (C17376f) obj;
        return this.f48747a == fVar.f48747a && C41536l.m120484d(this.f48748b, fVar.f48748b) && C41536l.m120484d(this.f48749c, fVar.f48749c);
    }

    public int hashCode() {
        boolean z = this.f48747a;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + this.f48748b.hashCode()) * 31) + this.f48749c.hashCode();
    }

    public String toString() {
        boolean z = this.f48747a;
        String str = this.f48748b;
        String str2 = this.f48749c;
        return "InsuranceCardExternalFile(isDark=" + z + ", fileUrl=" + str + ", fileType=" + str2 + ")";
    }
}
