package at0;

import p190o1.C7397t;

/* renamed from: at0.a */
public final class C31064a {

    /* renamed from: a */
    private final long f77256a;

    public C31064a(long j) {
        this.f77256a = j;
    }

    /* renamed from: a */
    public final long mo71260a() {
        return this.f77256a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31064a) && this.f77256a == ((C31064a) obj).f77256a;
    }

    public int hashCode() {
        return C7397t.m28148a(this.f77256a);
    }

    public String toString() {
        long j = this.f77256a;
        return "OpenMoneyBoxResult(casId=" + j + ")";
    }
}
