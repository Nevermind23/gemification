package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.h0 */
public final class C17087h0 {

    /* renamed from: a */
    private final String f47788a;

    /* renamed from: b */
    private final String f47789b;

    /* renamed from: c */
    private final boolean f47790c;

    public C17087h0(String str, String str2, boolean z) {
        C41536l.m120489i(str, "regionId");
        C41536l.m120489i(str2, "regionName");
        this.f47788a = str;
        this.f47789b = str2;
        this.f47790c = z;
    }

    /* renamed from: a */
    public final boolean mo44357a() {
        return this.f47790c;
    }

    /* renamed from: b */
    public final String mo44358b() {
        return this.f47788a;
    }

    /* renamed from: c */
    public final String mo44359c() {
        return this.f47789b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17087h0)) {
            return false;
        }
        C17087h0 h0Var = (C17087h0) obj;
        return C41536l.m120484d(this.f47788a, h0Var.f47788a) && C41536l.m120484d(this.f47789b, h0Var.f47789b) && this.f47790c == h0Var.f47790c;
    }

    public int hashCode() {
        int hashCode = ((this.f47788a.hashCode() * 31) + this.f47789b.hashCode()) * 31;
        boolean z = this.f47790c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f47788a;
        String str2 = this.f47789b;
        boolean z = this.f47790c;
        return "Region(regionId=" + str + ", regionName=" + str2 + ", regionFlag=" + z + ")";
    }
}
