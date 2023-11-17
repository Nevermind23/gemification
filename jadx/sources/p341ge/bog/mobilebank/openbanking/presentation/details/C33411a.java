package p341ge.bog.mobilebank.openbanking.presentation.details;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.a */
final class C33411a {

    /* renamed from: a */
    private final boolean f81589a;

    /* renamed from: b */
    private final boolean f81590b;

    public C33411a(boolean z, boolean z2) {
        this.f81589a = z;
        this.f81590b = z2;
    }

    /* renamed from: a */
    public final boolean mo79227a() {
        return this.f81590b;
    }

    /* renamed from: b */
    public final boolean mo79228b() {
        return this.f81589a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33411a)) {
            return false;
        }
        C33411a aVar = (C33411a) obj;
        return this.f81589a == aVar.f81589a && this.f81590b == aVar.f81590b;
    }

    public int hashCode() {
        boolean z = this.f81589a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f81590b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f81589a;
        boolean z2 = this.f81590b;
        return "PagingResult(isEmpty=" + z + ", hasMorePages=" + z2 + ")";
    }
}
