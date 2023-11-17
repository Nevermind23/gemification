package bw0;

import kotlin.jvm.internal.C41536l;

/* renamed from: bw0.c */
public final class C31210c {

    /* renamed from: a */
    private final double f77570a;

    /* renamed from: b */
    private final String f77571b;

    public C31210c(double d, String str) {
        C41536l.m120489i(str, "comCcy");
        this.f77570a = d;
        this.f77571b = str;
    }

    /* renamed from: a */
    public final double mo71447a() {
        return this.f77570a;
    }

    /* renamed from: b */
    public final String mo71448b() {
        return this.f77571b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31210c)) {
            return false;
        }
        C31210c cVar = (C31210c) obj;
        return Double.compare(this.f77570a, cVar.f77570a) == 0 && C41536l.m120484d(this.f77571b, cVar.f77571b);
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f77570a) * 31) + this.f77571b.hashCode();
    }

    public String toString() {
        double d = this.f77570a;
        String str = this.f77571b;
        return "Commission(comAmount=" + d + ", comCcy=" + str + ")";
    }
}
