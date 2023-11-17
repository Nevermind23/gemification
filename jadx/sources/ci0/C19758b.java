package ci0;

/* renamed from: ci0.b */
public final class C19758b {

    /* renamed from: a */
    private final boolean f54118a;

    public C19758b(boolean z) {
        this.f54118a = z;
    }

    /* renamed from: a */
    public final C19758b mo47961a(boolean z) {
        return new C19758b(z);
    }

    /* renamed from: b */
    public final boolean mo47962b() {
        return this.f54118a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19758b) && this.f54118a == ((C19758b) obj).f54118a;
    }

    public int hashCode() {
        boolean z = this.f54118a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f54118a;
        return "AmountInputErrorState(shouldUpdateInput=" + z + ")";
    }
}
