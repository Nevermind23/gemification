package oy0;

import kotlin.jvm.internal.C41536l;

/* renamed from: oy0.e */
public final class C37839e {

    /* renamed from: a */
    private final C37840f f90880a;

    public C37839e(C37840f fVar) {
        C41536l.m120489i(fVar, "status");
        this.f90880a = fVar;
    }

    /* renamed from: a */
    public final C37840f mo91184a() {
        return this.f90880a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37839e) && this.f90880a == ((C37839e) obj).f90880a;
    }

    public int hashCode() {
        return this.f90880a.hashCode();
    }

    public String toString() {
        C37840f fVar = this.f90880a;
        return "DepositBreakProcessValidation(status=" + fVar + ")";
    }
}
