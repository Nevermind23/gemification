package sm0;

import kotlin.jvm.internal.C41536l;

/* renamed from: sm0.a */
public final class C28249a {

    /* renamed from: a */
    private final boolean f71683a;

    /* renamed from: b */
    private final boolean f71684b;

    /* renamed from: c */
    private final String f71685c;

    /* renamed from: d */
    private final int f71686d;

    public C28249a(boolean z, boolean z2, String str, int i) {
        C41536l.m120489i(str, "operationReference");
        this.f71683a = z;
        this.f71684b = z2;
        this.f71685c = str;
        this.f71686d = i;
    }

    /* renamed from: a */
    public final String mo67778a() {
        return this.f71685c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28249a)) {
            return false;
        }
        C28249a aVar = (C28249a) obj;
        return this.f71683a == aVar.f71683a && this.f71684b == aVar.f71684b && C41536l.m120484d(this.f71685c, aVar.f71685c) && this.f71686d == aVar.f71686d;
    }

    public int hashCode() {
        boolean z = this.f71683a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f71684b;
        if (!z3) {
            z2 = z3;
        }
        return ((((i + (z2 ? 1 : 0)) * 31) + this.f71685c.hashCode()) * 31) + this.f71686d;
    }

    public String toString() {
        boolean z = this.f71683a;
        boolean z2 = this.f71684b;
        String str = this.f71685c;
        int i = this.f71686d;
        return "ChildApproval(isNewUser=" + z + ", needApproveContact=" + z2 + ", operationReference=" + str + ", retryCount=" + i + ")";
    }
}
