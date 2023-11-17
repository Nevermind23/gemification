package p714az;

/* renamed from: az.a */
public final class C19288a {

    /* renamed from: a */
    private final boolean f53500a;

    /* renamed from: b */
    private final boolean f53501b;

    public C19288a(boolean z, boolean z2) {
        this.f53500a = z;
        this.f53501b = z2;
    }

    /* renamed from: a */
    public final boolean mo47512a() {
        return this.f53500a;
    }

    /* renamed from: b */
    public final boolean mo47513b() {
        return this.f53501b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19288a)) {
            return false;
        }
        C19288a aVar = (C19288a) obj;
        return this.f53500a == aVar.f53500a && this.f53501b == aVar.f53501b;
    }

    public int hashCode() {
        boolean z = this.f53500a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f53501b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f53500a;
        boolean z2 = this.f53501b;
        return "BirthdayPopupData(showPopup=" + z + ", isRB=" + z2 + ")";
    }
}
