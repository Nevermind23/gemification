package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.t */
public final class C17103t {

    /* renamed from: a */
    private final C17102s f47893a;

    public C17103t(C17102s sVar) {
        this.f47893a = sVar;
    }

    /* renamed from: a */
    public final C17102s mo44487a() {
        return this.f47893a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17103t) && C41536l.m120484d(this.f47893a, ((C17103t) obj).f47893a);
    }

    public int hashCode() {
        C17102s sVar = this.f47893a;
        if (sVar == null) {
            return 0;
        }
        return sVar.hashCode();
    }

    public String toString() {
        C17102s sVar = this.f47893a;
        return "DebitCardFeeWrapper(fee=" + sVar + ")";
    }
}
