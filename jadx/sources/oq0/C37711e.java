package oq0;

/* renamed from: oq0.e */
public final class C37711e {

    /* renamed from: a */
    private final boolean f90599a;

    /* renamed from: b */
    private final boolean f90600b;

    /* renamed from: c */
    private final boolean f90601c;

    public C37711e(boolean z, boolean z2, boolean z3) {
        this.f90599a = z;
        this.f90600b = z2;
        this.f90601c = z3;
    }

    /* renamed from: b */
    public static /* synthetic */ C37711e m110855b(C37711e eVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = eVar.f90599a;
        }
        if ((i & 2) != 0) {
            z2 = eVar.f90600b;
        }
        if ((i & 4) != 0) {
            z3 = eVar.f90601c;
        }
        return eVar.mo90947a(z, z2, z3);
    }

    /* renamed from: a */
    public final C37711e mo90947a(boolean z, boolean z2, boolean z3) {
        return new C37711e(z, z2, z3);
    }

    /* renamed from: c */
    public Boolean mo90948c() {
        return Boolean.valueOf(this.f90601c);
    }

    /* renamed from: d */
    public boolean mo90949d() {
        return this.f90599a;
    }

    /* renamed from: e */
    public boolean mo90950e() {
        return this.f90600b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37711e)) {
            return false;
        }
        C37711e eVar = (C37711e) obj;
        return this.f90599a == eVar.f90599a && this.f90600b == eVar.f90600b && this.f90601c == eVar.f90601c;
    }

    public int hashCode() {
        boolean z = this.f90599a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f90600b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f90601c;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f90599a;
        boolean z2 = this.f90600b;
        boolean z3 = this.f90601c;
        return "ToggleInput(isEditable=" + z + ", isVisible=" + z2 + ", value=" + z3 + ")";
    }
}
