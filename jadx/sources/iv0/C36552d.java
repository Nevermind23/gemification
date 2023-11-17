package iv0;

import kotlin.jvm.internal.C41536l;

/* renamed from: iv0.d */
public final class C36552d {

    /* renamed from: a */
    private final C36549a f88086a;

    /* renamed from: b */
    private final String f88087b;

    /* renamed from: c */
    private final String f88088c;

    /* renamed from: d */
    private final String f88089d;

    public C36552d(C36549a aVar, String str, String str2, String str3) {
        C41536l.m120489i(aVar, "balanceAmount");
        this.f88086a = aVar;
        this.f88087b = str;
        this.f88088c = str2;
        this.f88089d = str3;
    }

    /* renamed from: a */
    public final C36549a mo89345a() {
        return this.f88086a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36552d)) {
            return false;
        }
        C36552d dVar = (C36552d) obj;
        return C41536l.m120484d(this.f88086a, dVar.f88086a) && C41536l.m120484d(this.f88087b, dVar.f88087b) && C41536l.m120484d(this.f88088c, dVar.f88088c) && C41536l.m120484d(this.f88089d, dVar.f88089d);
    }

    public int hashCode() {
        int hashCode = this.f88086a.hashCode() * 31;
        String str = this.f88087b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88088c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88089d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        C36549a aVar = this.f88086a;
        String str = this.f88087b;
        String str2 = this.f88088c;
        String str3 = this.f88089d;
        return "OpenBankAccountBalance(balanceAmount=" + aVar + ", balanceType=" + str + ", referenceDate=" + str2 + ", lastChangeDateTime=" + str3 + ")";
    }
}
