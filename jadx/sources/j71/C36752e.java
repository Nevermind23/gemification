package j71;

import kotlin.jvm.internal.C41536l;

/* renamed from: j71.e */
public final class C36752e {

    /* renamed from: a */
    private final boolean f88688a;

    /* renamed from: b */
    private final String f88689b;

    /* renamed from: c */
    private final String f88690c;

    public C36752e(boolean z, String str, String str2) {
        C41536l.m120489i(str2, "fileType");
        this.f88688a = z;
        this.f88689b = str;
        this.f88690c = str2;
    }

    /* renamed from: a */
    public final String mo89609a() {
        return this.f88689b;
    }

    /* renamed from: b */
    public final boolean mo89610b() {
        return this.f88688a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36752e)) {
            return false;
        }
        C36752e eVar = (C36752e) obj;
        return this.f88688a == eVar.f88688a && C41536l.m120484d(this.f88689b, eVar.f88689b) && C41536l.m120484d(this.f88690c, eVar.f88690c);
    }

    public int hashCode() {
        boolean z = this.f88688a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f88689b;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.f88690c.hashCode();
    }

    public String toString() {
        boolean z = this.f88688a;
        String str = this.f88689b;
        String str2 = this.f88690c;
        return "CardExternalFile(isDark=" + z + ", fileUrl=" + str + ", fileType=" + str2 + ")";
    }
}
