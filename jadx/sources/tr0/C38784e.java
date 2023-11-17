package tr0;

import kotlin.jvm.internal.C41536l;

/* renamed from: tr0.e */
public final class C38784e {

    /* renamed from: a */
    private final String f92768a;

    /* renamed from: b */
    private final double f92769b;

    /* renamed from: c */
    private final String f92770c;

    /* renamed from: d */
    private final int f92771d;

    /* renamed from: e */
    private final boolean f92772e;

    /* renamed from: f */
    private final boolean f92773f;

    /* renamed from: g */
    private final boolean f92774g;

    public C38784e(String str, double d, String str2, int i, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(str, "parameterName");
        C41536l.m120489i(str2, "paramDictionaryKey");
        this.f92768a = str;
        this.f92769b = d;
        this.f92770c = str2;
        this.f92771d = i;
        this.f92772e = z;
        this.f92773f = z2;
        this.f92774g = z3;
    }

    /* renamed from: a */
    public final String mo92432a() {
        return this.f92770c;
    }

    /* renamed from: b */
    public final double mo92433b() {
        return this.f92769b;
    }

    /* renamed from: c */
    public final boolean mo92434c() {
        return this.f92772e;
    }

    /* renamed from: d */
    public final boolean mo92435d() {
        return this.f92774g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38784e)) {
            return false;
        }
        C38784e eVar = (C38784e) obj;
        return C41536l.m120484d(this.f92768a, eVar.f92768a) && Double.compare(this.f92769b, eVar.f92769b) == 0 && C41536l.m120484d(this.f92770c, eVar.f92770c) && this.f92771d == eVar.f92771d && this.f92772e == eVar.f92772e && this.f92773f == eVar.f92773f && this.f92774g == eVar.f92774g;
    }

    public int hashCode() {
        int hashCode = ((((((this.f92768a.hashCode() * 31) + Double.doubleToLongBits(this.f92769b)) * 31) + this.f92770c.hashCode()) * 31) + this.f92771d) * 31;
        boolean z = this.f92772e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f92773f;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f92774g;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f92768a;
        double d = this.f92769b;
        String str2 = this.f92770c;
        int i = this.f92771d;
        boolean z = this.f92772e;
        boolean z2 = this.f92773f;
        boolean z3 = this.f92774g;
        return "LoanPaymentParams(parameterName=" + str + ", parameterValue=" + d + ", paramDictionaryKey=" + str2 + ", orderNumber=" + i + ", isAmount=" + z + ", isHighLighted=" + z2 + ", isWarning=" + z3 + ")";
    }
}
