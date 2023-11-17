package py0;

import p190o1.C7397t;

/* renamed from: py0.c */
public final class C38049c {

    /* renamed from: a */
    private final long f91414a;

    /* renamed from: b */
    private final long f91415b;

    /* renamed from: c */
    private final int f91416c;

    /* renamed from: d */
    private final int f91417d;

    public C38049c(long j, long j2, int i, int i2) {
        this.f91414a = j;
        this.f91415b = j2;
        this.f91416c = i;
        this.f91417d = i2;
    }

    /* renamed from: a */
    public final long mo91448a() {
        return this.f91415b;
    }

    /* renamed from: b */
    public final int mo91449b() {
        return this.f91417d;
    }

    /* renamed from: c */
    public final long mo91450c() {
        return this.f91414a;
    }

    /* renamed from: d */
    public final int mo91451d() {
        return this.f91416c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38049c)) {
            return false;
        }
        C38049c cVar = (C38049c) obj;
        return this.f91414a == cVar.f91414a && this.f91415b == cVar.f91415b && this.f91416c == cVar.f91416c && this.f91417d == cVar.f91417d;
    }

    public int hashCode() {
        return (((((C7397t.m28148a(this.f91414a) * 31) + C7397t.m28148a(this.f91415b)) * 31) + this.f91416c) * 31) + this.f91417d;
    }

    public String toString() {
        long j = this.f91414a;
        long j2 = this.f91415b;
        int i = this.f91416c;
        int i2 = this.f91417d;
        return "DepositProlongationPeriod(minMaturityDate=" + j + ", maxMaturityDate=" + j2 + ", minMonths=" + i + ", maxMonths=" + i2 + ")";
    }
}
