package oy0;

import kotlin.jvm.internal.C41536l;

/* renamed from: oy0.d */
public final class C37838d {

    /* renamed from: a */
    private final C37836b f90877a;

    /* renamed from: b */
    private final boolean f90878b;

    /* renamed from: c */
    private final String f90879c;

    public C37838d(C37836b bVar, boolean z, String str) {
        this.f90877a = bVar;
        this.f90878b = z;
        this.f90879c = str;
    }

    /* renamed from: a */
    public final boolean mo91178a() {
        return C41358y.m119999O(C41341q.m119910m(C37836b.WARNING, C37836b.SUCCESS), this.f90877a);
    }

    /* renamed from: b */
    public final String mo91179b() {
        return this.f90879c;
    }

    /* renamed from: c */
    public final boolean mo91180c() {
        return this.f90878b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37838d)) {
            return false;
        }
        C37838d dVar = (C37838d) obj;
        return this.f90877a == dVar.f90877a && this.f90878b == dVar.f90878b && C41536l.m120484d(this.f90879c, dVar.f90879c);
    }

    public int hashCode() {
        C37836b bVar = this.f90877a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        boolean z = this.f90878b;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f90879c;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        C37836b bVar = this.f90877a;
        boolean z = this.f90878b;
        String str = this.f90879c;
        return "DepositBreakPossibilities(depositBreakType=" + bVar + ", canRequestCashCoverLoan=" + z + ", breakError=" + str + ")";
    }
}
