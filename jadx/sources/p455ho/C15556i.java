package p455ho;

import kotlin.jvm.internal.C41536l;

/* renamed from: ho.i */
public final class C15556i {

    /* renamed from: a */
    private final String f44181a;

    /* renamed from: b */
    private final String f44182b;

    /* renamed from: c */
    private final String f44183c;

    public C15556i(String str, String str2, String str3) {
        this.f44181a = str;
        this.f44182b = str2;
        this.f44183c = str3;
    }

    /* renamed from: a */
    public final String mo42762a() {
        return this.f44182b;
    }

    /* renamed from: b */
    public final String mo42763b() {
        return this.f44183c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15556i)) {
            return false;
        }
        C15556i iVar = (C15556i) obj;
        return C41536l.m120484d(this.f44181a, iVar.f44181a) && C41536l.m120484d(this.f44182b, iVar.f44182b) && C41536l.m120484d(this.f44183c, iVar.f44183c);
    }

    public int hashCode() {
        String str = this.f44181a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44182b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f44183c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f44181a;
        String str2 = this.f44182b;
        String str3 = this.f44183c;
        return "PackageDelReasons(packageName=" + str + ", delReason=" + str2 + ", delReasonDictionaryKey=" + str3 + ")";
    }
}
