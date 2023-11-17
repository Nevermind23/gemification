package j71;

import kotlin.jvm.internal.C41536l;

/* renamed from: j71.j */
public final class C36758j {

    /* renamed from: a */
    private final String f88718a;

    /* renamed from: b */
    private final double f88719b;

    /* renamed from: c */
    private final String f88720c;

    /* renamed from: d */
    private final String f88721d;

    /* renamed from: e */
    private boolean f88722e;

    public C36758j(String str, double d, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "typeId");
        C41536l.m120489i(str2, "typeCode");
        C41536l.m120489i(str3, "title");
        this.f88718a = str;
        this.f88719b = d;
        this.f88720c = str2;
        this.f88721d = str3;
        this.f88722e = z;
    }

    /* renamed from: a */
    public final double mo89640a() {
        return this.f88719b;
    }

    /* renamed from: b */
    public final String mo89641b() {
        return this.f88721d;
    }

    /* renamed from: c */
    public final String mo89642c() {
        return this.f88720c;
    }

    /* renamed from: d */
    public final String mo89643d() {
        return this.f88718a;
    }

    /* renamed from: e */
    public final boolean mo89644e() {
        return this.f88722e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36758j)) {
            return false;
        }
        C36758j jVar = (C36758j) obj;
        return C41536l.m120484d(this.f88718a, jVar.f88718a) && Double.compare(this.f88719b, jVar.f88719b) == 0 && C41536l.m120484d(this.f88720c, jVar.f88720c) && C41536l.m120484d(this.f88721d, jVar.f88721d) && this.f88722e == jVar.f88722e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f88718a.hashCode() * 31) + Double.doubleToLongBits(this.f88719b)) * 31) + this.f88720c.hashCode()) * 31) + this.f88721d.hashCode()) * 31;
        boolean z = this.f88722e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f88718a;
        double d = this.f88719b;
        String str2 = this.f88720c;
        String str3 = this.f88721d;
        boolean z = this.f88722e;
        return "TransportCardPassType(typeId=" + str + ", price=" + d + ", typeCode=" + str2 + ", title=" + str3 + ", isDefault=" + z + ")";
    }
}
