package xy0;

import p190o1.C7397t;

/* renamed from: xy0.y */
public final class C39961y {

    /* renamed from: a */
    private final boolean f94937a;

    /* renamed from: b */
    private final long f94938b;

    public C39961y(boolean z, long j) {
        this.f94937a = z;
        this.f94938b = j;
    }

    /* renamed from: a */
    public final boolean mo93792a() {
        return this.f94937a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39961y)) {
            return false;
        }
        C39961y yVar = (C39961y) obj;
        return this.f94937a == yVar.f94937a && this.f94938b == yVar.f94938b;
    }

    public int hashCode() {
        boolean z = this.f94937a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + C7397t.m28148a(this.f94938b);
    }

    public String toString() {
        boolean z = this.f94937a;
        long j = this.f94938b;
        return "PensionStatus(isGranted=" + z + ", modificationDate=" + j + ")";
    }
}
