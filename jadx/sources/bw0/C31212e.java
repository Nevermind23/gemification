package bw0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: bw0.e */
public final class C31212e {

    /* renamed from: a */
    private final long f77574a;

    /* renamed from: b */
    private final long f77575b;

    /* renamed from: c */
    private final double f77576c;

    /* renamed from: d */
    private final String f77577d;

    public C31212e(long j, long j2, double d, String str) {
        C41536l.m120489i(str, "ccy");
        this.f77574a = j;
        this.f77575b = j2;
        this.f77576c = d;
        this.f77577d = str;
    }

    /* renamed from: a */
    public final long mo71456a() {
        return this.f77575b;
    }

    /* renamed from: b */
    public final double mo71457b() {
        return this.f77576c;
    }

    /* renamed from: c */
    public final long mo71458c() {
        return this.f77574a;
    }

    /* renamed from: d */
    public final String mo71459d() {
        return this.f77577d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31212e)) {
            return false;
        }
        C31212e eVar = (C31212e) obj;
        return this.f77574a == eVar.f77574a && this.f77575b == eVar.f77575b && Double.compare(this.f77576c, eVar.f77576c) == 0 && C41536l.m120484d(this.f77577d, eVar.f77577d);
    }

    public int hashCode() {
        return (((((C7397t.m28148a(this.f77574a) * 31) + C7397t.m28148a(this.f77575b)) * 31) + Double.doubleToLongBits(this.f77576c)) * 31) + this.f77577d.hashCode();
    }

    public String toString() {
        long j = this.f77574a;
        long j2 = this.f77575b;
        double d = this.f77576c;
        String str = this.f77577d;
        return "CreateInComeTopUpPaymentRequest(cardId=" + j + ", acctKey=" + j2 + ", amount=" + d + ", ccy=" + str + ")";
    }
}
