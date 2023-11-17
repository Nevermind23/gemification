package q51;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: q51.a */
public final class C38130a {

    /* renamed from: a */
    private final long f91534a;

    /* renamed from: b */
    private final String f91535b;

    /* renamed from: c */
    private final String f91536c;

    /* renamed from: d */
    private final double f91537d;

    /* renamed from: e */
    private final String f91538e;

    /* renamed from: f */
    private final boolean f91539f;

    /* renamed from: g */
    private final boolean f91540g;

    public C38130a(long j, String str, String str2, double d, String str3, boolean z, boolean z2) {
        C41536l.m120489i(str2, "printAcctNo");
        C41536l.m120489i(str3, "ccy");
        this.f91534a = j;
        this.f91535b = str;
        this.f91536c = str2;
        this.f91537d = d;
        this.f91538e = str3;
        this.f91539f = z;
        this.f91540g = z2;
    }

    /* renamed from: a */
    public final long mo91650a() {
        return this.f91534a;
    }

    /* renamed from: b */
    public final String mo91651b() {
        return this.f91535b;
    }

    /* renamed from: c */
    public final double mo91652c() {
        return this.f91537d;
    }

    /* renamed from: d */
    public final String mo91653d() {
        return this.f91538e;
    }

    /* renamed from: e */
    public final String mo91654e() {
        return this.f91536c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38130a)) {
            return false;
        }
        C38130a aVar = (C38130a) obj;
        return this.f91534a == aVar.f91534a && C41536l.m120484d(this.f91535b, aVar.f91535b) && C41536l.m120484d(this.f91536c, aVar.f91536c) && Double.compare(this.f91537d, aVar.f91537d) == 0 && C41536l.m120484d(this.f91538e, aVar.f91538e) && this.f91539f == aVar.f91539f && this.f91540g == aVar.f91540g;
    }

    /* renamed from: f */
    public final boolean mo91656f() {
        return this.f91540g;
    }

    /* renamed from: g */
    public final boolean mo91657g() {
        return this.f91539f;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f91534a) * 31;
        String str = this.f91535b;
        int hashCode = (((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f91536c.hashCode()) * 31) + Double.doubleToLongBits(this.f91537d)) * 31) + this.f91538e.hashCode()) * 31;
        boolean z = this.f91539f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f91540g;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        long j = this.f91534a;
        String str = this.f91535b;
        String str2 = this.f91536c;
        double d = this.f91537d;
        String str3 = this.f91538e;
        boolean z = this.f91539f;
        boolean z2 = this.f91540g;
        return "SelectableAccount(acctKey=" + j + ", acctName=" + str + ", printAcctNo=" + str2 + ", availableAmount=" + d + ", ccy=" + str3 + ", isSelected=" + z + ", isDefault=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38130a(long j, String str, String str2, double d, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, d, str3, z, (i & 64) != 0 ? false : z2);
    }
}
