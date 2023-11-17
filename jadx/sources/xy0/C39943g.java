package xy0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.g */
public final class C39943g {

    /* renamed from: a */
    private final long f94786a;

    /* renamed from: b */
    private final String f94787b;

    /* renamed from: c */
    private final String f94788c;

    /* renamed from: d */
    private final double f94789d;

    public C39943g(long j, String str, String str2, double d) {
        C41536l.m120489i(str, "ccy");
        this.f94786a = j;
        this.f94787b = str;
        this.f94788c = str2;
        this.f94789d = d;
    }

    /* renamed from: a */
    public final String mo93705a() {
        return this.f94787b;
    }

    /* renamed from: b */
    public final double mo93706b() {
        return this.f94789d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39943g)) {
            return false;
        }
        C39943g gVar = (C39943g) obj;
        return this.f94786a == gVar.f94786a && C41536l.m120484d(this.f94787b, gVar.f94787b) && C41536l.m120484d(this.f94788c, gVar.f94788c) && Double.compare(this.f94789d, gVar.f94789d) == 0;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f94786a) * 31) + this.f94787b.hashCode()) * 31;
        String str = this.f94788c;
        return ((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.f94789d);
    }

    public String toString() {
        long j = this.f94786a;
        String str = this.f94787b;
        String str2 = this.f94788c;
        double d = this.f94789d;
        return "CashAgreement(id=" + j + ", ccy=" + str + ", note=" + str2 + ", quantity=" + d + ")";
    }
}
