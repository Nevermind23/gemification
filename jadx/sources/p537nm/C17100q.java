package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.q */
public final class C17100q {

    /* renamed from: a */
    private final C17099p f47881a;

    public C17100q(C17099p pVar) {
        this.f47881a = pVar;
    }

    /* renamed from: a */
    public final C17099p mo44470a() {
        return this.f47881a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17100q) && C41536l.m120484d(this.f47881a, ((C17100q) obj).f47881a);
    }

    public int hashCode() {
        C17099p pVar = this.f47881a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }

    public String toString() {
        C17099p pVar = this.f47881a;
        return "DebitCardCommissionWrapper(commission=" + pVar + ")";
    }
}
