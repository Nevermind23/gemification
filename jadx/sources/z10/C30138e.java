package z10;

/* renamed from: z10.e */
public final class C30138e {

    /* renamed from: a */
    private final boolean f75998a;

    /* renamed from: b */
    private final boolean f75999b;

    public C30138e(boolean z, boolean z2) {
        this.f75998a = z;
        this.f75999b = z2;
    }

    /* renamed from: a */
    public final boolean mo70480a() {
        return this.f75999b;
    }

    /* renamed from: b */
    public final boolean mo70481b() {
        return this.f75998a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30138e)) {
            return false;
        }
        C30138e eVar = (C30138e) obj;
        return this.f75998a == eVar.f75998a && this.f75999b == eVar.f75999b;
    }

    public int hashCode() {
        boolean z = this.f75998a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f75999b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f75998a;
        boolean z2 = this.f75999b;
        return "WarningTextOptions(showWarning=" + z + ", animate=" + z2 + ")";
    }
}
