package ih0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ih0.e */
public final class C25212e {

    /* renamed from: a */
    private final boolean f64777a;

    /* renamed from: b */
    private final boolean f64778b;

    /* renamed from: c */
    private final boolean f64779c;

    public C25212e(boolean z, boolean z2, boolean z3) {
        this.f64777a = z;
        this.f64778b = z2;
        this.f64779c = z3;
    }

    /* renamed from: a */
    public final boolean mo63730a() {
        return this.f64778b;
    }

    /* renamed from: b */
    public final boolean mo63731b() {
        return this.f64777a;
    }

    /* renamed from: c */
    public final boolean mo63732c() {
        return this.f64779c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25212e)) {
            return false;
        }
        C25212e eVar = (C25212e) obj;
        return this.f64777a == eVar.f64777a && this.f64778b == eVar.f64778b && this.f64779c == eVar.f64779c;
    }

    public int hashCode() {
        boolean z = this.f64777a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f64778b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f64779c;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f64777a;
        boolean z2 = this.f64778b;
        boolean z3 = this.f64779c;
        return "GamificationShortcutData(showShortcuts=" + z + ", animateHubNavIcon=" + z2 + ", isUnderAge=" + z3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25212e(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? false : z3);
    }
}
