package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.l */
public final class C17095l {

    /* renamed from: a */
    private final String f47822a;

    /* renamed from: b */
    private final String f47823b;

    /* renamed from: c */
    private final String f47824c;

    /* renamed from: d */
    private final String f47825d;

    /* renamed from: e */
    private final boolean f47826e;

    public C17095l(String str, String str2, String str3, String str4, boolean z) {
        C41536l.m120489i(str, "product");
        C41536l.m120489i(str2, "subProductCode");
        C41536l.m120489i(str3, "orderNumber");
        C41536l.m120489i(str4, "regionId");
        this.f47822a = str;
        this.f47823b = str2;
        this.f47824c = str3;
        this.f47825d = str4;
        this.f47826e = z;
    }

    /* renamed from: a */
    public final boolean mo44395a() {
        return this.f47826e;
    }

    /* renamed from: b */
    public final String mo44396b() {
        return this.f47824c;
    }

    /* renamed from: c */
    public final String mo44397c() {
        return this.f47822a;
    }

    /* renamed from: d */
    public final String mo44398d() {
        return this.f47825d;
    }

    /* renamed from: e */
    public final String mo44399e() {
        return this.f47823b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17095l)) {
            return false;
        }
        C17095l lVar = (C17095l) obj;
        return C41536l.m120484d(this.f47822a, lVar.f47822a) && C41536l.m120484d(this.f47823b, lVar.f47823b) && C41536l.m120484d(this.f47824c, lVar.f47824c) && C41536l.m120484d(this.f47825d, lVar.f47825d) && this.f47826e == lVar.f47826e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f47822a.hashCode() * 31) + this.f47823b.hashCode()) * 31) + this.f47824c.hashCode()) * 31) + this.f47825d.hashCode()) * 31;
        boolean z = this.f47826e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f47822a;
        String str2 = this.f47823b;
        String str3 = this.f47824c;
        String str4 = this.f47825d;
        boolean z = this.f47826e;
        return "CardSubType(product=" + str + ", subProductCode=" + str2 + ", orderNumber=" + str3 + ", regionId=" + str4 + ", digitalCardFlag=" + z + ")";
    }
}
