package zs0;

import kotlin.jvm.internal.C41536l;

/* renamed from: zs0.d */
public final class C40251d {

    /* renamed from: a */
    private final String f95655a;

    /* renamed from: b */
    private final double f95656b;

    /* renamed from: c */
    private final double f95657c;

    public C40251d(String str, double d, double d2) {
        C41536l.m120489i(str, "ccy");
        this.f95655a = str;
        this.f95656b = d;
        this.f95657c = d2;
    }

    /* renamed from: a */
    public final String mo94226a() {
        return this.f95655a;
    }

    /* renamed from: b */
    public final double mo94227b() {
        return this.f95656b;
    }

    /* renamed from: c */
    public final double mo94228c() {
        return this.f95657c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40251d)) {
            return false;
        }
        C40251d dVar = (C40251d) obj;
        return C41536l.m120484d(this.f95655a, dVar.f95655a) && Double.compare(this.f95656b, dVar.f95656b) == 0 && Double.compare(this.f95657c, dVar.f95657c) == 0;
    }

    public int hashCode() {
        return (((this.f95655a.hashCode() * 31) + Double.doubleToLongBits(this.f95656b)) * 31) + Double.doubleToLongBits(this.f95657c);
    }

    public String toString() {
        String str = this.f95655a;
        double d = this.f95656b;
        double d2 = this.f95657c;
        return "CasInfoSummary(ccy=" + str + ", totalAmount=" + d + ", totalAmountAcct=" + d2 + ")";
    }
}
