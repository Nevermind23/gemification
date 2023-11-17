package hi0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hi0.b */
public final class C25029b {

    /* renamed from: a */
    private final boolean f64371a;

    /* renamed from: b */
    private final boolean f64372b;

    public C25029b(boolean z, boolean z2) {
        this.f64371a = z;
        this.f64372b = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C25029b m79956b(C25029b bVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bVar.f64371a;
        }
        if ((i & 2) != 0) {
            z2 = bVar.f64372b;
        }
        return bVar.mo63439a(z, z2);
    }

    /* renamed from: a */
    public final C25029b mo63439a(boolean z, boolean z2) {
        return new C25029b(z, z2);
    }

    /* renamed from: c */
    public final boolean mo63440c() {
        return this.f64372b;
    }

    /* renamed from: d */
    public final boolean mo63441d() {
        return this.f64371a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25029b)) {
            return false;
        }
        C25029b bVar = (C25029b) obj;
        return this.f64371a == bVar.f64371a && this.f64372b == bVar.f64372b;
    }

    public int hashCode() {
        boolean z = this.f64371a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f64372b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f64371a;
        boolean z2 = this.f64372b;
        return "InputLayerEnabledState(isInputEnabled=" + z + ", isCheckBoxEnabled=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25029b(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }
}
