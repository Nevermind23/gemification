package j90;

import kotlin.jvm.internal.C41536l;

/* renamed from: j90.c */
public final class C25360c {

    /* renamed from: a */
    private final String f65006a;

    /* renamed from: b */
    private final String f65007b;

    public C25360c(String str, String str2) {
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(str2, "ccy");
        this.f65006a = str;
        this.f65007b = str2;
    }

    /* renamed from: a */
    public final String mo63940a() {
        return this.f65006a;
    }

    /* renamed from: b */
    public final String mo63941b() {
        return this.f65007b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25360c)) {
            return false;
        }
        C25360c cVar = (C25360c) obj;
        return C41536l.m120484d(this.f65006a, cVar.f65006a) && C41536l.m120484d(this.f65007b, cVar.f65007b);
    }

    public int hashCode() {
        return (this.f65006a.hashCode() * 31) + this.f65007b.hashCode();
    }

    public String toString() {
        String str = this.f65006a;
        String str2 = this.f65007b;
        return "LoanCalculationUiModel(amount=" + str + ", ccy=" + str2 + ")";
    }
}
