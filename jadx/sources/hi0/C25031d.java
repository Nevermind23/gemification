package hi0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hi0.d */
public final class C25031d {

    /* renamed from: a */
    private final boolean f64375a;

    public C25031d(boolean z) {
        this.f64375a = z;
    }

    /* renamed from: a */
    public final C25031d mo63451a(boolean z) {
        return new C25031d(z);
    }

    /* renamed from: b */
    public final boolean mo63452b() {
        return this.f64375a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25031d) && this.f64375a == ((C25031d) obj).f64375a;
    }

    public int hashCode() {
        boolean z = this.f64375a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f64375a;
        return "NextButtonState(isLoading=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25031d(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
