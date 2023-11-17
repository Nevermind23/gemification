package p950xy;

/* renamed from: xy.b */
public final class C29875b {

    /* renamed from: a */
    private final boolean f75591a;

    /* renamed from: b */
    private final boolean f75592b;

    /* renamed from: c */
    private final boolean f75593c;

    /* renamed from: d */
    private final boolean f75594d;

    public C29875b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f75591a = z;
        this.f75592b = z2;
        this.f75593c = z3;
        this.f75594d = z4;
    }

    /* renamed from: a */
    public final boolean mo70142a() {
        return this.f75591a;
    }

    /* renamed from: b */
    public final boolean mo70143b() {
        return this.f75592b;
    }

    /* renamed from: c */
    public final boolean mo70144c() {
        return this.f75594d;
    }

    /* renamed from: d */
    public final boolean mo70145d() {
        return this.f75593c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29875b)) {
            return false;
        }
        C29875b bVar = (C29875b) obj;
        return this.f75591a == bVar.f75591a && this.f75592b == bVar.f75592b && this.f75593c == bVar.f75593c && this.f75594d == bVar.f75594d;
    }

    public int hashCode() {
        boolean z = this.f75591a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f75592b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f75593c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f75594d;
        if (!z5) {
            z2 = z5;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f75591a;
        boolean z2 = this.f75592b;
        boolean z3 = this.f75593c;
        boolean z4 = this.f75594d;
        return "BonusAvailability(hasAmex=" + z + ", hasCashback=" + z2 + ", hasScool=" + z3 + ", hasPlus=" + z4 + ")";
    }
}
