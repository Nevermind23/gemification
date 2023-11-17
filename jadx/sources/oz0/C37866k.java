package oz0;

/* renamed from: oz0.k */
public final class C37866k {

    /* renamed from: a */
    private final boolean f90926a;

    /* renamed from: b */
    private final boolean f90927b;

    public C37866k(boolean z, boolean z2) {
        this.f90926a = z;
        this.f90927b = z2;
    }

    /* renamed from: a */
    public final boolean mo91213a() {
        return this.f90927b;
    }

    /* renamed from: b */
    public final boolean mo91214b() {
        return this.f90926a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37866k)) {
            return false;
        }
        C37866k kVar = (C37866k) obj;
        return this.f90926a == kVar.f90926a && this.f90927b == kVar.f90927b;
    }

    public int hashCode() {
        boolean z = this.f90926a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f90927b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f90926a;
        boolean z2 = this.f90927b;
        return "CreditCardFillViewState(minimumPaymentEnabled=" + z + ", fullPaymentDueEnabled=" + z2 + ")";
    }
}
