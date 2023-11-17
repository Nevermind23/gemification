package p70;

import kotlin.jvm.internal.C41536l;

/* renamed from: p70.c */
public final class C27241c {

    /* renamed from: a */
    private final int f68254a;

    /* renamed from: b */
    private final String f68255b;

    /* renamed from: c */
    private final String f68256c;

    /* renamed from: d */
    private final double f68257d;

    public C27241c(int i, String str, String str2, double d) {
        C41536l.m120489i(str, "productCode");
        C41536l.m120489i(str2, "ccy");
        this.f68254a = i;
        this.f68255b = str;
        this.f68256c = str2;
        this.f68257d = d;
    }

    /* renamed from: a */
    public final String mo66526a() {
        return this.f68256c;
    }

    /* renamed from: b */
    public final int mo66527b() {
        return this.f68254a;
    }

    /* renamed from: c */
    public final double mo66528c() {
        return this.f68257d;
    }

    /* renamed from: d */
    public final String mo66529d() {
        return this.f68255b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27241c)) {
            return false;
        }
        C27241c cVar = (C27241c) obj;
        return this.f68254a == cVar.f68254a && C41536l.m120484d(this.f68255b, cVar.f68255b) && C41536l.m120484d(this.f68256c, cVar.f68256c) && Double.compare(this.f68257d, cVar.f68257d) == 0;
    }

    public int hashCode() {
        return (((((this.f68254a * 31) + this.f68255b.hashCode()) * 31) + this.f68256c.hashCode()) * 31) + Double.doubleToLongBits(this.f68257d);
    }

    public String toString() {
        int i = this.f68254a;
        String str = this.f68255b;
        String str2 = this.f68256c;
        double d = this.f68257d;
        return "OverdueProductInfo(id=" + i + ", productCode=" + str + ", ccy=" + str2 + ", overdueAmount=" + d + ")";
    }
}
