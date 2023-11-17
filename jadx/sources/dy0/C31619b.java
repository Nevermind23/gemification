package dy0;

/* renamed from: dy0.b */
public final class C31619b {

    /* renamed from: a */
    private final boolean f78184a;

    /* renamed from: b */
    private final boolean f78185b;

    public C31619b(boolean z, boolean z2) {
        this.f78184a = z;
        this.f78185b = z2;
    }

    /* renamed from: a */
    public final boolean mo72038a() {
        return this.f78184a;
    }

    /* renamed from: b */
    public final boolean mo72039b() {
        return this.f78185b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31619b)) {
            return false;
        }
        C31619b bVar = (C31619b) obj;
        return this.f78184a == bVar.f78184a && this.f78185b == bVar.f78185b;
    }

    public int hashCode() {
        boolean z = this.f78184a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f78185b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f78184a;
        boolean z2 = this.f78185b;
        return "FormLoadingUiModel(formLoading=" + z + ", includeAmount=" + z2 + ")";
    }
}
