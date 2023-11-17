package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.y */
public final class C17108y {

    /* renamed from: a */
    private final C17085g0 f47908a;

    /* renamed from: b */
    private final String f47909b;

    public C17108y(C17085g0 g0Var, String str) {
        C41536l.m120489i(g0Var, "regType");
        C41536l.m120489i(str, "dictionaryKey");
        this.f47908a = g0Var;
        this.f47909b = str;
    }

    /* renamed from: a */
    public final String mo44516a() {
        return this.f47909b;
    }

    /* renamed from: b */
    public final C17085g0 mo44517b() {
        return this.f47908a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17108y)) {
            return false;
        }
        C17108y yVar = (C17108y) obj;
        return this.f47908a == yVar.f47908a && C41536l.m120484d(this.f47909b, yVar.f47909b);
    }

    public int hashCode() {
        return (this.f47908a.hashCode() * 31) + this.f47909b.hashCode();
    }

    public String toString() {
        C17085g0 g0Var = this.f47908a;
        String str = this.f47909b;
        return "DebitCardRegType(regType=" + g0Var + ", dictionaryKey=" + str + ")";
    }
}
