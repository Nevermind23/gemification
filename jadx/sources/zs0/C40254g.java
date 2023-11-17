package zs0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: zs0.g */
public final class C40254g {

    /* renamed from: a */
    private final long f95688a;

    /* renamed from: b */
    private final String f95689b;

    /* renamed from: c */
    private final double f95690c;

    public C40254g(long j, String str, double d) {
        C41536l.m120489i(str, "acctNo");
        this.f95688a = j;
        this.f95689b = str;
        this.f95690c = d;
    }

    /* renamed from: a */
    public final long mo94268a() {
        return this.f95688a;
    }

    /* renamed from: b */
    public final String mo94269b() {
        return this.f95689b;
    }

    /* renamed from: c */
    public final double mo94270c() {
        return this.f95690c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40254g)) {
            return false;
        }
        C40254g gVar = (C40254g) obj;
        return this.f95688a == gVar.f95688a && C41536l.m120484d(this.f95689b, gVar.f95689b) && Double.compare(this.f95690c, gVar.f95690c) == 0;
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f95688a) * 31) + this.f95689b.hashCode()) * 31) + Double.doubleToLongBits(this.f95690c);
    }

    public String toString() {
        long j = this.f95688a;
        String str = this.f95689b;
        double d = this.f95690c;
        return "DepositAccount(acctKey=" + j + ", acctNo=" + str + ", availableAmount=" + d + ")";
    }
}
