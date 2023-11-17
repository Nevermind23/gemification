package oq0;

/* renamed from: oq0.b */
public final class C37708b {

    /* renamed from: a */
    private final boolean f90588a;

    /* renamed from: b */
    private final boolean f90589b;

    public C37708b(boolean z, boolean z2) {
        this.f90588a = z;
        this.f90589b = z2;
    }

    /* renamed from: a */
    public final C37708b mo90924a(boolean z, boolean z2) {
        return new C37708b(z, z2);
    }

    /* renamed from: b */
    public final boolean mo90925b() {
        return this.f90588a;
    }

    /* renamed from: c */
    public final boolean mo90926c() {
        return this.f90589b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37708b)) {
            return false;
        }
        C37708b bVar = (C37708b) obj;
        return this.f90588a == bVar.f90588a && this.f90589b == bVar.f90589b;
    }

    public int hashCode() {
        boolean z = this.f90588a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f90589b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f90588a;
        boolean z2 = this.f90589b;
        return "ChosenInsuranceInfoUiState(showLifeInsuranceInfo=" + z + ", showPaymentInsuranceInfo=" + z2 + ")";
    }
}
