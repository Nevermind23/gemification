package ys0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ys0.b */
public final class C40058b {

    /* renamed from: a */
    private final long f95190a;

    /* renamed from: b */
    private final String f95191b;

    /* renamed from: c */
    private final double f95192c;

    /* renamed from: d */
    private final String f95193d;

    public C40058b(long j, String str, double d, String str2) {
        C41536l.m120489i(str, "schemeType");
        this.f95190a = j;
        this.f95191b = str;
        this.f95192c = d;
        this.f95193d = str2;
    }

    /* renamed from: a */
    public final String mo93933a() {
        return this.f95193d;
    }

    /* renamed from: b */
    public final long mo93934b() {
        return this.f95190a;
    }

    /* renamed from: c */
    public final String mo93935c() {
        return this.f95191b;
    }

    /* renamed from: d */
    public final double mo93936d() {
        return this.f95192c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40058b)) {
            return false;
        }
        C40058b bVar = (C40058b) obj;
        return this.f95190a == bVar.f95190a && C41536l.m120484d(this.f95191b, bVar.f95191b) && Double.compare(this.f95192c, bVar.f95192c) == 0 && C41536l.m120484d(this.f95193d, bVar.f95193d);
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f95190a) * 31) + this.f95191b.hashCode()) * 31) + Double.doubleToLongBits(this.f95192c)) * 31;
        String str = this.f95193d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f95190a;
        String str = this.f95191b;
        double d = this.f95192c;
        String str2 = this.f95193d;
        return "MoneyBoxTariff(id=" + j + ", schemeType=" + str + ", tariff=" + d + ", dfltCcy=" + str2 + ")";
    }
}
