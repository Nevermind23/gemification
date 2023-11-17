package p962yz;

/* renamed from: yz.a */
public final class C30124a {

    /* renamed from: a */
    private final boolean f75962a;

    /* renamed from: b */
    private final boolean f75963b;

    public C30124a(boolean z, boolean z2) {
        this.f75962a = z;
        this.f75963b = z2;
    }

    /* renamed from: a */
    public final boolean mo70423a() {
        return this.f75963b;
    }

    /* renamed from: b */
    public final boolean mo70424b() {
        return this.f75962a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30124a)) {
            return false;
        }
        C30124a aVar = (C30124a) obj;
        return this.f75962a == aVar.f75962a && this.f75963b == aVar.f75963b;
    }

    public int hashCode() {
        boolean z = this.f75962a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f75963b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f75962a;
        boolean z2 = this.f75963b;
        return "CreditInfoPermissionStatus(isActive=" + z + ", statusChangedAllowed=" + z2 + ")";
    }
}
