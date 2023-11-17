package p828mr;

import kotlin.jvm.internal.C41536l;

/* renamed from: mr.b */
public final class C26258b {

    /* renamed from: a */
    private final double f66545a;

    /* renamed from: b */
    private final String f66546b;

    /* renamed from: c */
    private final C26264h f66547c;

    public C26258b(double d, String str, C26264h hVar) {
        C41536l.m120489i(hVar, "rateType");
        this.f66545a = d;
        this.f66546b = str;
        this.f66547c = hVar;
    }

    /* renamed from: a */
    public final double mo65365a() {
        return this.f66545a;
    }

    /* renamed from: b */
    public final String mo65366b() {
        return this.f66546b;
    }

    /* renamed from: c */
    public final C26264h mo65367c() {
        return this.f66547c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26258b)) {
            return false;
        }
        C26258b bVar = (C26258b) obj;
        return Double.compare(this.f66545a, bVar.f66545a) == 0 && C41536l.m120484d(this.f66546b, bVar.f66546b) && this.f66547c == bVar.f66547c;
    }

    public int hashCode() {
        int a = Double.doubleToLongBits(this.f66545a) * 31;
        String str = this.f66546b;
        return ((a + (str == null ? 0 : str.hashCode())) * 31) + this.f66547c.hashCode();
    }

    public String toString() {
        double d = this.f66545a;
        String str = this.f66546b;
        C26264h hVar = this.f66547c;
        return "InsuranceInfo(rate=" + d + ", rateCcy=" + str + ", rateType=" + hVar + ")";
    }
}
