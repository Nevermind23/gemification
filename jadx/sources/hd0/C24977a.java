package hd0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hd0.a */
public final class C24977a {

    /* renamed from: a */
    private final double f64298a;

    /* renamed from: b */
    private final String f64299b;

    public C24977a(double d, String str) {
        C41536l.m120489i(str, "currency");
        this.f64298a = d;
        this.f64299b = str;
    }

    /* renamed from: a */
    public final String mo63385a() {
        return this.f64299b;
    }

    /* renamed from: b */
    public final double mo63386b() {
        return this.f64298a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24977a)) {
            return false;
        }
        C24977a aVar = (C24977a) obj;
        return Double.compare(this.f64298a, aVar.f64298a) == 0 && C41536l.m120484d(this.f64299b, aVar.f64299b);
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f64298a) * 31) + this.f64299b.hashCode();
    }

    public String toString() {
        double d = this.f64298a;
        String str = this.f64299b;
        return "Amount(value=" + d + ", currency=" + str + ")";
    }
}
