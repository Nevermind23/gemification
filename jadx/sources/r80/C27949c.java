package r80;

import kotlin.jvm.internal.C41536l;

/* renamed from: r80.c */
public final class C27949c {

    /* renamed from: a */
    private final String f71161a;

    /* renamed from: b */
    private final String f71162b;

    /* renamed from: c */
    private final String f71163c;

    public C27949c(String str, String str2, String str3) {
        C41536l.m120489i(str, "loanType");
        C41536l.m120489i(str2, "dictionaryKey");
        C41536l.m120489i(str3, "defaultSubProduct");
        this.f71161a = str;
        this.f71162b = str2;
        this.f71163c = str3;
    }

    /* renamed from: a */
    public final String mo67534a() {
        return this.f71163c;
    }

    /* renamed from: b */
    public final String mo67535b() {
        return this.f71161a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27949c)) {
            return false;
        }
        C27949c cVar = (C27949c) obj;
        return C41536l.m120484d(this.f71161a, cVar.f71161a) && C41536l.m120484d(this.f71162b, cVar.f71162b) && C41536l.m120484d(this.f71163c, cVar.f71163c);
    }

    public int hashCode() {
        return (((this.f71161a.hashCode() * 31) + this.f71162b.hashCode()) * 31) + this.f71163c.hashCode();
    }

    public String toString() {
        String str = this.f71161a;
        String str2 = this.f71162b;
        String str3 = this.f71163c;
        return "LoanType(loanType=" + str + ", dictionaryKey=" + str2 + ", defaultSubProduct=" + str3 + ")";
    }
}
