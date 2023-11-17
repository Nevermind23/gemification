package p393di;

import kotlin.jvm.internal.C41536l;

/* renamed from: di.a */
public final class C12130a {

    /* renamed from: a */
    private final double f35634a;

    /* renamed from: b */
    private final String f35635b;

    public C12130a(double d, String str) {
        this.f35634a = d;
        this.f35635b = str;
    }

    /* renamed from: a */
    public final String mo32327a() {
        return this.f35635b;
    }

    /* renamed from: b */
    public final double mo32328b() {
        return this.f35634a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12130a)) {
            return false;
        }
        C12130a aVar = (C12130a) obj;
        return Double.compare(this.f35634a, aVar.f35634a) == 0 && C41536l.m120484d(this.f35635b, aVar.f35635b);
    }

    public int hashCode() {
        int a = Double.doubleToLongBits(this.f35634a) * 31;
        String str = this.f35635b;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        double d = this.f35634a;
        String str = this.f35635b;
        return "DrilldownAmount(value=" + d + ", currency=" + str + ")";
    }
}
