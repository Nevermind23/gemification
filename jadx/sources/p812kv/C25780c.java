package p812kv;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: kv.c */
public final class C25780c {

    /* renamed from: a */
    private final long f65591a;

    /* renamed from: b */
    private final boolean f65592b;

    /* renamed from: c */
    private final double f65593c;

    /* renamed from: d */
    private final String f65594d;

    /* renamed from: e */
    private final String f65595e;

    /* renamed from: f */
    private final boolean f65596f;

    public C25780c(long j, boolean z, double d, String str, String str2, boolean z2) {
        this.f65591a = j;
        this.f65592b = z;
        this.f65593c = d;
        this.f65594d = str;
        this.f65595e = str2;
        this.f65596f = z2;
    }

    /* renamed from: a */
    public final double mo64396a() {
        return this.f65593c;
    }

    /* renamed from: b */
    public final String mo64397b() {
        return this.f65594d;
    }

    /* renamed from: c */
    public final long mo64398c() {
        return this.f65591a;
    }

    /* renamed from: d */
    public final String mo64399d() {
        return this.f65595e;
    }

    /* renamed from: e */
    public final boolean mo64400e() {
        return this.f65596f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25780c)) {
            return false;
        }
        C25780c cVar = (C25780c) obj;
        return this.f65591a == cVar.f65591a && this.f65592b == cVar.f65592b && Double.compare(this.f65593c, cVar.f65593c) == 0 && C41536l.m120484d(this.f65594d, cVar.f65594d) && C41536l.m120484d(this.f65595e, cVar.f65595e) && this.f65596f == cVar.f65596f;
    }

    /* renamed from: f */
    public final boolean mo64402f() {
        return this.f65592b;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f65591a) * 31;
        boolean z = this.f65592b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int a2 = (((a + (z ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f65593c)) * 31;
        String str = this.f65594d;
        int i = 0;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65595e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z3 = this.f65596f;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        long j = this.f65591a;
        boolean z = this.f65592b;
        double d = this.f65593c;
        String str = this.f65594d;
        String str2 = this.f65595e;
        boolean z2 = this.f65596f;
        return "MoneyRequestBillSplitOperation(id=" + j + ", isCashOperation=" + z + ", amount=" + d + ", description=" + str + ", imageUrl=" + str2 + ", tintIcon=" + z2 + ")";
    }
}
