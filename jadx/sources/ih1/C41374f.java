package ih1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ih1.f */
public final class C41374f {

    /* renamed from: a */
    private boolean f97420a;

    /* renamed from: b */
    private boolean f97421b;

    /* renamed from: c */
    private boolean f97422c;

    public C41374f(boolean z, boolean z2, boolean z3) {
        this.f97420a = z;
        this.f97421b = z2;
        this.f97422c = z3;
    }

    /* renamed from: a */
    public final boolean mo96013a() {
        return this.f97421b;
    }

    /* renamed from: b */
    public final boolean mo96014b() {
        return this.f97420a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41374f)) {
            return false;
        }
        C41374f fVar = (C41374f) obj;
        return this.f97420a == fVar.f97420a && this.f97421b == fVar.f97421b && this.f97422c == fVar.f97422c;
    }

    public int hashCode() {
        boolean z = this.f97420a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f97421b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f97422c;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "Options(isCreatedAtStart=" + this.f97420a + ", override=" + this.f97421b + ", isExtraDefinition=" + this.f97422c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41374f(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
