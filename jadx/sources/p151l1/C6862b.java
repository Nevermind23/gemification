package p151l1;

/* renamed from: l1.b */
public final class C6862b {

    /* renamed from: a */
    private final boolean f20547a;

    /* renamed from: b */
    private final boolean f20548b;

    /* renamed from: c */
    private final boolean f20549c;

    /* renamed from: d */
    private final boolean f20550d;

    public C6862b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f20547a = z;
        this.f20548b = z2;
        this.f20549c = z3;
        this.f20550d = z4;
    }

    /* renamed from: a */
    public final boolean mo20934a() {
        return this.f20547a;
    }

    /* renamed from: b */
    public final boolean mo20935b() {
        return this.f20549c;
    }

    /* renamed from: c */
    public final boolean mo20936c() {
        return this.f20550d;
    }

    /* renamed from: d */
    public final boolean mo20937d() {
        return this.f20548b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6862b)) {
            return false;
        }
        C6862b bVar = (C6862b) obj;
        return this.f20547a == bVar.f20547a && this.f20548b == bVar.f20548b && this.f20549c == bVar.f20549c && this.f20550d == bVar.f20550d;
    }

    public int hashCode() {
        boolean z = this.f20547a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f20548b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f20549c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f20550d;
        if (!z5) {
            z2 = z5;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f20547a + ", isValidated=" + this.f20548b + ", isMetered=" + this.f20549c + ", isNotRoaming=" + this.f20550d + ')';
    }
}
