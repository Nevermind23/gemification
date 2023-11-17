package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.f */
public final class C17082f {

    /* renamed from: a */
    private final String f47746a;

    /* renamed from: b */
    private final C17088i f47747b;

    /* renamed from: c */
    private final String f47748c;

    /* renamed from: d */
    private final String f47749d;

    /* renamed from: e */
    private final boolean f47750e;

    public C17082f(String str, C17088i iVar, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "clientCountry");
        C41536l.m120489i(iVar, "cardOrderAgreementStatus");
        C41536l.m120489i(str2, "countryNameGe");
        C41536l.m120489i(str3, "countryNameEn");
        this.f47746a = str;
        this.f47747b = iVar;
        this.f47748c = str2;
        this.f47749d = str3;
        this.f47750e = z;
    }

    /* renamed from: a */
    public final C17088i mo44310a() {
        return this.f47747b;
    }

    /* renamed from: b */
    public final String mo44311b() {
        return this.f47746a;
    }

    /* renamed from: c */
    public final String mo44312c() {
        return this.f47749d;
    }

    /* renamed from: d */
    public final String mo44313d() {
        return this.f47748c;
    }

    /* renamed from: e */
    public final boolean mo44314e() {
        return this.f47750e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17082f)) {
            return false;
        }
        C17082f fVar = (C17082f) obj;
        return C41536l.m120484d(this.f47746a, fVar.f47746a) && this.f47747b == fVar.f47747b && C41536l.m120484d(this.f47748c, fVar.f47748c) && C41536l.m120484d(this.f47749d, fVar.f47749d) && this.f47750e == fVar.f47750e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f47746a.hashCode() * 31) + this.f47747b.hashCode()) * 31) + this.f47748c.hashCode()) * 31) + this.f47749d.hashCode()) * 31;
        boolean z = this.f47750e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f47746a;
        C17088i iVar = this.f47747b;
        String str2 = this.f47748c;
        String str3 = this.f47749d;
        boolean z = this.f47750e;
        return "CardClientCountryInfo(clientCountry=" + str + ", cardOrderAgreementStatus=" + iVar + ", countryNameGe=" + str2 + ", countryNameEn=" + str3 + ", showInstantCard=" + z + ")";
    }
}
