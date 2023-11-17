package gc0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gc0.a */
public final class C20792a {

    /* renamed from: a */
    private final boolean f56028a;

    /* renamed from: b */
    private final boolean f56029b;

    /* renamed from: c */
    private final boolean f56030c;

    public C20792a(boolean z, boolean z2, boolean z3) {
        this.f56028a = z;
        this.f56029b = z2;
        this.f56030c = z3;
    }

    /* renamed from: a */
    public final boolean mo49383a() {
        return this.f56028a;
    }

    /* renamed from: b */
    public final boolean mo49384b() {
        return this.f56030c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20792a)) {
            return false;
        }
        C20792a aVar = (C20792a) obj;
        return this.f56028a == aVar.f56028a && this.f56029b == aVar.f56029b && this.f56030c == aVar.f56030c;
    }

    public int hashCode() {
        boolean z = this.f56028a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f56029b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f56030c;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f56028a;
        boolean z2 = this.f56029b;
        boolean z3 = this.f56030c;
        return "ButtonState(isEnabled=" + z + ", isLoading=" + z2 + ", isVisible=" + z3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20792a(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3);
    }
}
