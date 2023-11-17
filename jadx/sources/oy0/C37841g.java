package oy0;

import kotlin.jvm.internal.C41536l;

/* renamed from: oy0.g */
public final class C37841g {

    /* renamed from: a */
    private final C37836b f90885a;

    /* renamed from: b */
    private final String f90886b;

    public C37841g(C37836b bVar, String str) {
        this.f90885a = bVar;
        this.f90886b = str;
    }

    /* renamed from: a */
    public final String mo91188a() {
        return this.f90886b;
    }

    /* renamed from: b */
    public final C37836b mo91189b() {
        return this.f90885a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37841g)) {
            return false;
        }
        C37841g gVar = (C37841g) obj;
        return this.f90885a == gVar.f90885a && C41536l.m120484d(this.f90886b, gVar.f90886b);
    }

    public int hashCode() {
        C37836b bVar = this.f90885a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.f90886b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        C37836b bVar = this.f90885a;
        String str = this.f90886b;
        return "DepositBreakValidation(errorType=" + bVar + ", errorKey=" + str + ")";
    }
}
