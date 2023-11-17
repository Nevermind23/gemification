package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.a0 */
public final class C17070a0 {

    /* renamed from: a */
    private final C17073b0 f47691a;

    /* renamed from: b */
    private final C17073b0 f47692b;

    public C17070a0(C17073b0 b0Var, C17073b0 b0Var2) {
        this.f47691a = b0Var;
        this.f47692b = b0Var2;
    }

    /* renamed from: a */
    public final C17073b0 mo44263a() {
        return this.f47692b;
    }

    /* renamed from: b */
    public final C17073b0 mo44264b() {
        return this.f47691a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17070a0)) {
            return false;
        }
        C17070a0 a0Var = (C17070a0) obj;
        return C41536l.m120484d(this.f47691a, a0Var.f47691a) && C41536l.m120484d(this.f47692b, a0Var.f47692b);
    }

    public int hashCode() {
        C17073b0 b0Var = this.f47691a;
        int i = 0;
        int hashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        C17073b0 b0Var2 = this.f47692b;
        if (b0Var2 != null) {
            i = b0Var2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        C17073b0 b0Var = this.f47691a;
        C17073b0 b0Var2 = this.f47692b;
        return "DebitCardTextContainer(plasticCard=" + b0Var + ", digitalCard=" + b0Var2 + ")";
    }
}
