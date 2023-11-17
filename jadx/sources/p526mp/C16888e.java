package p526mp;

import kotlin.jvm.internal.C41536l;

/* renamed from: mp.e */
public final class C16888e {

    /* renamed from: a */
    private final String f47220a;

    /* renamed from: b */
    private final String f47221b;

    /* renamed from: c */
    private final boolean f47222c;

    public C16888e(String str, String str2, boolean z) {
        C41536l.m120489i(str2, "selectedPackage");
        this.f47220a = str;
        this.f47221b = str2;
        this.f47222c = z;
    }

    /* renamed from: a */
    public final String mo44052a() {
        return this.f47220a;
    }

    /* renamed from: b */
    public final String mo44053b() {
        return this.f47221b;
    }

    /* renamed from: c */
    public final boolean mo44054c() {
        return this.f47222c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16888e)) {
            return false;
        }
        C16888e eVar = (C16888e) obj;
        return C41536l.m120484d(this.f47220a, eVar.f47220a) && C41536l.m120484d(this.f47221b, eVar.f47221b) && this.f47222c == eVar.f47222c;
    }

    public int hashCode() {
        String str = this.f47220a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f47221b.hashCode()) * 31;
        boolean z = this.f47222c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f47220a;
        String str2 = this.f47221b;
        boolean z = this.f47222c;
        return "RecommendedPackageDetails(activePackage=" + str + ", selectedPackage=" + str2 + ", isSelectedSolo=" + z + ")";
    }
}
