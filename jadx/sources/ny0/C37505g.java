package ny0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ny0.g */
public final class C37505g {

    /* renamed from: a */
    private final double f90192a;

    /* renamed from: b */
    private final double f90193b;

    /* renamed from: c */
    private final String f90194c;

    /* renamed from: d */
    private final double f90195d;

    /* renamed from: e */
    private final Long f90196e;

    /* renamed from: f */
    private final String f90197f;

    /* renamed from: g */
    private final long f90198g;

    /* renamed from: h */
    private final long f90199h;

    public C37505g(double d, double d2, String str, double d3, Long l, String str2, long j, long j2) {
        C41536l.m120489i(str, "sgcKey");
        C41536l.m120489i(str2, "ccy");
        this.f90192a = d;
        this.f90193b = d2;
        this.f90194c = str;
        this.f90195d = d3;
        this.f90196e = l;
        this.f90197f = str2;
        this.f90198g = j;
        this.f90199h = j2;
    }

    /* renamed from: a */
    public final double mo90708a() {
        return this.f90192a;
    }

    /* renamed from: b */
    public final String mo90709b() {
        return this.f90197f;
    }

    /* renamed from: c */
    public final Long mo90710c() {
        return this.f90196e;
    }

    /* renamed from: d */
    public final long mo90711d() {
        return this.f90198g;
    }

    /* renamed from: e */
    public final double mo90712e() {
        return this.f90195d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37505g)) {
            return false;
        }
        C37505g gVar = (C37505g) obj;
        return Double.compare(this.f90192a, gVar.f90192a) == 0 && Double.compare(this.f90193b, gVar.f90193b) == 0 && C41536l.m120484d(this.f90194c, gVar.f90194c) && Double.compare(this.f90195d, gVar.f90195d) == 0 && C41536l.m120484d(this.f90196e, gVar.f90196e) && C41536l.m120484d(this.f90197f, gVar.f90197f) && this.f90198g == gVar.f90198g && this.f90199h == gVar.f90199h;
    }

    /* renamed from: f */
    public final long mo90714f() {
        return this.f90199h;
    }

    /* renamed from: g */
    public final String mo90715g() {
        return this.f90194c;
    }

    public int hashCode() {
        int a = ((((((Double.doubleToLongBits(this.f90192a) * 31) + Double.doubleToLongBits(this.f90193b)) * 31) + this.f90194c.hashCode()) * 31) + Double.doubleToLongBits(this.f90195d)) * 31;
        Long l = this.f90196e;
        return ((((((a + (l == null ? 0 : l.hashCode())) * 31) + this.f90197f.hashCode()) * 31) + C7397t.m28148a(this.f90198g)) * 31) + C7397t.m28148a(this.f90199h);
    }

    public String toString() {
        double d = this.f90192a;
        double d2 = this.f90193b;
        String str = this.f90194c;
        double d3 = this.f90195d;
        Long l = this.f90196e;
        String str2 = this.f90197f;
        long j = this.f90198g;
        long j2 = this.f90199h;
        return "DepositSavingGoal(amount=" + d + ", currentAmount=" + d2 + ", sgcKey=" + str + ", monthlyAmount=" + d3 + ", endDate=" + l + ", ccy=" + str2 + ", id=" + j + ", sgcId=" + j2 + ")";
    }
}
