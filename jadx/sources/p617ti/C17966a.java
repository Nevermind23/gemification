package p617ti;

import kotlin.jvm.internal.C41536l;

/* renamed from: ti.a */
public final class C17966a {

    /* renamed from: a */
    private final double f51160a;

    /* renamed from: b */
    private final String f51161b;

    public C17966a(double d, String str) {
        C41536l.m120489i(str, "currency");
        this.f51160a = d;
        this.f51161b = str;
    }

    /* renamed from: a */
    public final double mo45636a() {
        return this.f51160a;
    }

    /* renamed from: b */
    public final String mo45637b() {
        return this.f51161b;
    }

    /* renamed from: c */
    public final double mo45638c() {
        return this.f51160a;
    }

    /* renamed from: d */
    public final String mo45639d() {
        return this.f51161b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17966a)) {
            return false;
        }
        C17966a aVar = (C17966a) obj;
        return Double.compare(this.f51160a, aVar.f51160a) == 0 && C41536l.m120484d(this.f51161b, aVar.f51161b);
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f51160a) * 31) + this.f51161b.hashCode();
    }

    public String toString() {
        double d = this.f51160a;
        String str = this.f51161b;
        return "AmountData(amount=" + d + ", currency=" + str + ")";
    }
}
