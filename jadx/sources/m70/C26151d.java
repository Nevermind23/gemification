package m70;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: m70.d */
public final class C26151d {

    /* renamed from: a */
    private final long f66325a;

    /* renamed from: b */
    private final double f66326b;

    /* renamed from: c */
    private final double f66327c;

    /* renamed from: d */
    private final double f66328d;

    /* renamed from: e */
    private final double f66329e;

    /* renamed from: f */
    private final long f66330f;

    /* renamed from: g */
    private final String f66331g;

    /* renamed from: h */
    private final String f66332h;

    public C26151d(long j, double d, double d2, double d3, double d4, long j2, String str, String str2) {
        this.f66325a = j;
        this.f66326b = d;
        this.f66327c = d2;
        this.f66328d = d3;
        this.f66329e = d4;
        this.f66330f = j2;
        this.f66331g = str;
        this.f66332h = str2;
    }

    /* renamed from: a */
    public final long mo65144a() {
        return this.f66325a;
    }

    /* renamed from: b */
    public final long mo65145b() {
        return this.f66330f;
    }

    /* renamed from: c */
    public final String mo65146c() {
        return this.f66331g;
    }

    /* renamed from: d */
    public final String mo65147d() {
        return this.f66332h;
    }

    /* renamed from: e */
    public final double mo65148e() {
        return this.f66329e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26151d)) {
            return false;
        }
        C26151d dVar = (C26151d) obj;
        return this.f66325a == dVar.f66325a && Double.compare(this.f66326b, dVar.f66326b) == 0 && Double.compare(this.f66327c, dVar.f66327c) == 0 && Double.compare(this.f66328d, dVar.f66328d) == 0 && Double.compare(this.f66329e, dVar.f66329e) == 0 && this.f66330f == dVar.f66330f && C41536l.m120484d(this.f66331g, dVar.f66331g) && C41536l.m120484d(this.f66332h, dVar.f66332h);
    }

    /* renamed from: f */
    public final double mo65150f() {
        return this.f66328d;
    }

    /* renamed from: g */
    public final double mo65151g() {
        return this.f66326b;
    }

    /* renamed from: h */
    public final double mo65152h() {
        return this.f66327c;
    }

    public int hashCode() {
        int a = ((((((((((C7397t.m28148a(this.f66325a) * 31) + Double.doubleToLongBits(this.f66326b)) * 31) + Double.doubleToLongBits(this.f66327c)) * 31) + Double.doubleToLongBits(this.f66328d)) * 31) + Double.doubleToLongBits(this.f66329e)) * 31) + C7397t.m28148a(this.f66330f)) * 31;
        String str = this.f66331g;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f66332h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f66325a;
        double d = this.f66326b;
        double d2 = this.f66327c;
        double d3 = this.f66328d;
        double d4 = this.f66329e;
        long j2 = this.f66330f;
        String str = this.f66331g;
        String str2 = this.f66332h;
        return "AccountOverdraftParam(acctKey=" + j + ", overdraftLimit=" + d + ", unusedOverdraftLimit=" + d2 + ", interestRate=" + d3 + ", intAccruedOverdraft=" + d4 + ", endDate=" + j2 + ", fileId=" + str + ", fileUrl=" + str2 + ")";
    }
}
