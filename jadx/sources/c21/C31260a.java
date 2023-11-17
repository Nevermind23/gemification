package c21;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: c21.a */
public final class C31260a {

    /* renamed from: a */
    private final long f77627a;

    /* renamed from: b */
    private final String f77628b;

    /* renamed from: c */
    private final double f77629c;

    /* renamed from: d */
    private final String f77630d;

    /* renamed from: e */
    private final int f77631e;

    /* renamed from: f */
    private final String f77632f;

    /* renamed from: g */
    private final String f77633g;

    /* renamed from: h */
    private final boolean f77634h;

    /* renamed from: i */
    private final boolean f77635i;

    /* renamed from: j */
    private final boolean f77636j;

    public C31260a(long j, String str, double d, String str2, int i, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(str, "acctName");
        C41536l.m120489i(str2, "ccy");
        this.f77627a = j;
        this.f77628b = str;
        this.f77629c = d;
        this.f77630d = str2;
        this.f77631e = i;
        this.f77632f = str3;
        this.f77633g = str4;
        this.f77634h = z;
        this.f77635i = z2;
        this.f77636j = z3;
    }

    /* renamed from: a */
    public final long mo71505a() {
        return this.f77627a;
    }

    /* renamed from: b */
    public final String mo71506b() {
        return this.f77628b;
    }

    /* renamed from: c */
    public final String mo71507c() {
        return this.f77633g;
    }

    /* renamed from: d */
    public final int mo71508d() {
        return this.f77631e;
    }

    /* renamed from: e */
    public final double mo71509e() {
        return this.f77629c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31260a)) {
            return false;
        }
        C31260a aVar = (C31260a) obj;
        return this.f77627a == aVar.f77627a && C41536l.m120484d(this.f77628b, aVar.f77628b) && Double.compare(this.f77629c, aVar.f77629c) == 0 && C41536l.m120484d(this.f77630d, aVar.f77630d) && this.f77631e == aVar.f77631e && C41536l.m120484d(this.f77632f, aVar.f77632f) && C41536l.m120484d(this.f77633g, aVar.f77633g) && this.f77634h == aVar.f77634h && this.f77635i == aVar.f77635i && this.f77636j == aVar.f77636j;
    }

    /* renamed from: f */
    public final String mo71511f() {
        return this.f77630d;
    }

    /* renamed from: g */
    public final boolean mo71512g() {
        return this.f77634h;
    }

    /* renamed from: h */
    public final boolean mo71513h() {
        return this.f77635i;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f77627a) * 31) + this.f77628b.hashCode()) * 31) + Double.doubleToLongBits(this.f77629c)) * 31) + this.f77630d.hashCode()) * 31) + this.f77631e) * 31;
        String str = this.f77632f;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f77633g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f77634h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f77635i;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f77636j;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo71515i() {
        return this.f77632f;
    }

    /* renamed from: j */
    public final boolean mo71516j() {
        return this.f77636j;
    }

    public String toString() {
        long j = this.f77627a;
        String str = this.f77628b;
        double d = this.f77629c;
        String str2 = this.f77630d;
        int i = this.f77631e;
        String str3 = this.f77632f;
        String str4 = this.f77633g;
        boolean z = this.f77634h;
        boolean z2 = this.f77635i;
        boolean z3 = this.f77636j;
        return "SelectorCardAccount(acctKey=" + j + ", acctName=" + str + ", availableAmount=" + d + ", ccy=" + str2 + ", attachmentId=" + i + ", imageUrl=" + str3 + ", acctNo=" + str4 + ", hasDarkAttachment=" + z + ", hasDarkImageUrl=" + z2 + ", isDefault=" + z3 + ")";
    }
}
