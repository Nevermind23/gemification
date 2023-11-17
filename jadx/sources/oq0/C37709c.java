package oq0;

import kotlin.jvm.internal.C41536l;

/* renamed from: oq0.c */
public final class C37709c {

    /* renamed from: a */
    private final Object f90590a;

    /* renamed from: b */
    private final boolean f90591b;

    /* renamed from: c */
    private final boolean f90592c;

    public C37709c(Object obj, boolean z, boolean z2) {
        this.f90590a = obj;
        this.f90591b = z;
        this.f90592c = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C37709c m110842b(C37709c cVar, Object obj, boolean z, boolean z2, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = cVar.f90590a;
        }
        if ((i & 2) != 0) {
            z = cVar.f90591b;
        }
        if ((i & 4) != 0) {
            z2 = cVar.f90592c;
        }
        return cVar.mo90930a(obj, z, z2);
    }

    /* renamed from: a */
    public final C37709c mo90930a(Object obj, boolean z, boolean z2) {
        return new C37709c(obj, z, z2);
    }

    /* renamed from: c */
    public Object mo90931c() {
        return this.f90590a;
    }

    /* renamed from: d */
    public boolean mo90932d() {
        return this.f90591b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37709c)) {
            return false;
        }
        C37709c cVar = (C37709c) obj;
        return C41536l.m120484d(this.f90590a, cVar.f90590a) && this.f90591b == cVar.f90591b && this.f90592c == cVar.f90592c;
    }

    public int hashCode() {
        Object obj = this.f90590a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        boolean z = this.f90591b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f90592c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        Object obj = this.f90590a;
        boolean z = this.f90591b;
        boolean z2 = this.f90592c;
        return "DataInput(value=" + obj + ", isVisible=" + z + ", isEditable=" + z2 + ")";
    }
}
