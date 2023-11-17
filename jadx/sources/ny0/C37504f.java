package ny0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ny0.f */
public final class C37504f {

    /* renamed from: a */
    private final C37500b f90190a;

    /* renamed from: b */
    private final int f90191b;

    public C37504f(C37500b bVar, int i) {
        C41536l.m120489i(bVar, "deposit");
        this.f90190a = bVar;
        this.f90191b = i;
    }

    /* renamed from: a */
    public final C37500b mo90703a() {
        return this.f90190a;
    }

    /* renamed from: b */
    public final int mo90704b() {
        return this.f90191b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37504f)) {
            return false;
        }
        C37504f fVar = (C37504f) obj;
        return C41536l.m120484d(this.f90190a, fVar.f90190a) && this.f90191b == fVar.f90191b;
    }

    public int hashCode() {
        return (this.f90190a.hashCode() * 31) + this.f90191b;
    }

    public String toString() {
        C37500b bVar = this.f90190a;
        int i = this.f90191b;
        return "DepositItem(deposit=" + bVar + ", index=" + i + ")";
    }
}
