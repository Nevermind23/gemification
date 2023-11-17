package p342j$.time.temporal;

import java.io.Serializable;
import p342j$.time.C9288c;

/* renamed from: j$.time.temporal.o */
public final class C9347o implements Serializable {

    /* renamed from: a */
    private final long f25889a;

    /* renamed from: b */
    private final long f25890b;

    /* renamed from: c */
    private final long f25891c;

    /* renamed from: d */
    private final long f25892d;

    private C9347o(long j, long j2, long j3, long j4) {
        this.f25889a = j;
        this.f25890b = j2;
        this.f25891c = j3;
        this.f25892d = j4;
    }

    /* renamed from: c */
    private String m34510c(TemporalField temporalField, long j) {
        if (temporalField != null) {
            return "Invalid value for " + temporalField + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    /* renamed from: i */
    public static C9347o m34511i(long j, long j2) {
        if (j <= j2) {
            return new C9347o(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: j */
    public static C9347o m34512j(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (1 <= j3) {
            return new C9347o(j, 1, j2, j3);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    /* renamed from: k */
    public static C9347o m34513k(long j, long j2) {
        return m34512j(1, j, j2);
    }

    /* renamed from: a */
    public final int mo25134a(TemporalField temporalField, long j) {
        if (mo25140g() && mo25141h(j)) {
            return (int) j;
        }
        throw new C9288c(m34510c(temporalField, j));
    }

    /* renamed from: b */
    public final void mo25135b(TemporalField temporalField, long j) {
        if (!mo25141h(j)) {
            throw new C9288c(m34510c(temporalField, j));
        }
    }

    /* renamed from: d */
    public final long mo25136d() {
        return this.f25892d;
    }

    /* renamed from: e */
    public final long mo25137e() {
        return this.f25889a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9347o)) {
            return false;
        }
        C9347o oVar = (C9347o) obj;
        return this.f25889a == oVar.f25889a && this.f25890b == oVar.f25890b && this.f25891c == oVar.f25891c && this.f25892d == oVar.f25892d;
    }

    /* renamed from: f */
    public final boolean mo25139f() {
        return this.f25889a == this.f25890b && this.f25891c == this.f25892d;
    }

    /* renamed from: g */
    public final boolean mo25140g() {
        return this.f25889a >= -2147483648L && this.f25892d <= 2147483647L;
    }

    /* renamed from: h */
    public final boolean mo25141h(long j) {
        return j >= this.f25889a && j <= this.f25892d;
    }

    public final int hashCode() {
        long j = this.f25889a;
        long j2 = this.f25890b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.f25891c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.f25892d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25889a);
        if (this.f25889a != this.f25890b) {
            sb.append('/');
            sb.append(this.f25890b);
        }
        sb.append(" - ");
        sb.append(this.f25891c);
        if (this.f25891c != this.f25892d) {
            sb.append('/');
            sb.append(this.f25892d);
        }
        return sb.toString();
    }
}
