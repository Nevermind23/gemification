package p537nm;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nm.i0 */
public final class C17090i0 {

    /* renamed from: a */
    private final String f47797a;

    /* renamed from: b */
    private final String f47798b;

    /* renamed from: c */
    private final String f47799c;

    /* renamed from: d */
    private final String f47800d;

    /* renamed from: e */
    private final long f47801e;

    /* renamed from: f */
    private final String f47802f;

    /* renamed from: g */
    private final String f47803g;

    /* renamed from: h */
    private final boolean f47804h;

    /* renamed from: i */
    private final String f47805i;

    /* renamed from: j */
    private final boolean f47806j;

    public C17090i0(String str, String str2, String str3, String str4, long j, String str5, String str6, boolean z, String str7, boolean z2) {
        C41536l.m120489i(str, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C41536l.m120489i(str3, "typeName");
        C41536l.m120489i(str4, "product");
        C41536l.m120489i(str5, "subProductCode");
        this.f47797a = str;
        this.f47798b = str2;
        this.f47799c = str3;
        this.f47800d = str4;
        this.f47801e = j;
        this.f47802f = str5;
        this.f47803g = str6;
        this.f47804h = z;
        this.f47805i = str7;
        this.f47806j = z2;
    }

    /* renamed from: a */
    public final String mo44365a() {
        return this.f47803g;
    }

    /* renamed from: b */
    public final String mo44366b() {
        return this.f47805i;
    }

    /* renamed from: c */
    public final boolean mo44367c() {
        return this.f47804h;
    }

    /* renamed from: d */
    public final long mo44368d() {
        return this.f47801e;
    }

    /* renamed from: e */
    public final String mo44369e() {
        return this.f47797a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17090i0)) {
            return false;
        }
        C17090i0 i0Var = (C17090i0) obj;
        return C41536l.m120484d(this.f47797a, i0Var.f47797a) && C41536l.m120484d(this.f47798b, i0Var.f47798b) && C41536l.m120484d(this.f47799c, i0Var.f47799c) && C41536l.m120484d(this.f47800d, i0Var.f47800d) && this.f47801e == i0Var.f47801e && C41536l.m120484d(this.f47802f, i0Var.f47802f) && C41536l.m120484d(this.f47803g, i0Var.f47803g) && this.f47804h == i0Var.f47804h && C41536l.m120484d(this.f47805i, i0Var.f47805i) && this.f47806j == i0Var.f47806j;
    }

    /* renamed from: f */
    public final String mo44371f() {
        return this.f47798b;
    }

    /* renamed from: g */
    public final String mo44372g() {
        return this.f47800d;
    }

    /* renamed from: h */
    public final boolean mo44373h() {
        return this.f47806j;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f47797a.hashCode() * 31) + this.f47798b.hashCode()) * 31) + this.f47799c.hashCode()) * 31) + this.f47800d.hashCode()) * 31) + C7397t.m28148a(this.f47801e)) * 31) + this.f47802f.hashCode()) * 31;
        String str = this.f47803g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f47804h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str2 = this.f47805i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z3 = this.f47806j;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo44375i() {
        return this.f47802f;
    }

    /* renamed from: j */
    public final String mo44376j() {
        return this.f47799c;
    }

    public String toString() {
        String str = this.f47797a;
        String str2 = this.f47798b;
        String str3 = this.f47799c;
        String str4 = this.f47800d;
        long j = this.f47801e;
        String str5 = this.f47802f;
        String str6 = this.f47803g;
        boolean z = this.f47804h;
        String str7 = this.f47805i;
        boolean z2 = this.f47806j;
        return "ScoolCardInfo(plcClass=" + str + ", plcType=" + str2 + ", typeName=" + str3 + ", product=" + str4 + ", linkId=" + j + ", subProductCode=" + str5 + ", cardNameKey=" + str6 + ", csFlag=" + z + ", cardNameValue=" + str7 + ", regionFlag=" + z2 + ")";
    }
}
