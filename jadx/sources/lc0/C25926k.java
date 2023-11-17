package lc0;

/* renamed from: lc0.k */
public final class C25926k {

    /* renamed from: a */
    private final boolean f65947a;

    /* renamed from: b */
    private final boolean f65948b;

    /* renamed from: c */
    private final boolean f65949c;

    public C25926k(boolean z, boolean z2, boolean z3) {
        this.f65947a = z;
        this.f65948b = z2;
        this.f65949c = z3;
    }

    /* renamed from: a */
    public final boolean mo64773a() {
        return this.f65949c;
    }

    /* renamed from: b */
    public final boolean mo64774b() {
        return this.f65947a;
    }

    /* renamed from: c */
    public final boolean mo64775c() {
        return this.f65948b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25926k)) {
            return false;
        }
        C25926k kVar = (C25926k) obj;
        return this.f65947a == kVar.f65947a && this.f65948b == kVar.f65948b && this.f65949c == kVar.f65949c;
    }

    public int hashCode() {
        boolean z = this.f65947a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f65948b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f65949c;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f65947a;
        boolean z2 = this.f65948b;
        boolean z3 = this.f65949c;
        return "AmountInfoState(initialWithInterest=" + z + ", lowerThanInitial=" + z2 + ", initial=" + z3 + ")";
    }
}
