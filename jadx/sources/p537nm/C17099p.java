package p537nm;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: nm.p */
public final class C17099p {

    /* renamed from: a */
    private final BigDecimal f47878a;

    /* renamed from: b */
    private final String f47879b;

    /* renamed from: c */
    private final boolean f47880c;

    public C17099p(BigDecimal bigDecimal, String str, boolean z) {
        this.f47878a = bigDecimal;
        this.f47879b = str;
        this.f47880c = z;
    }

    /* renamed from: a */
    public final BigDecimal mo44464a() {
        return this.f47878a;
    }

    /* renamed from: b */
    public final String mo44465b() {
        return this.f47879b;
    }

    /* renamed from: c */
    public final boolean mo44466c() {
        return this.f47880c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17099p)) {
            return false;
        }
        C17099p pVar = (C17099p) obj;
        return C41536l.m120484d(this.f47878a, pVar.f47878a) && C41536l.m120484d(this.f47879b, pVar.f47879b) && this.f47880c == pVar.f47880c;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f47878a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.f47879b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f47880c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        BigDecimal bigDecimal = this.f47878a;
        String str = this.f47879b;
        boolean z = this.f47880c;
        return "DebitCardCommission(comAmount=" + bigDecimal + ", comCcy=" + str + ", newAccPackage=" + z + ")";
    }
}
