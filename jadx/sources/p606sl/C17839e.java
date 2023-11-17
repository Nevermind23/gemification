package p606sl;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: sl.e */
public final class C17839e {

    /* renamed from: a */
    private final long f50766a;

    /* renamed from: b */
    private final String f50767b;

    /* renamed from: c */
    private final String f50768c;

    /* renamed from: d */
    private final String f50769d;

    /* renamed from: e */
    private final BigDecimal f50770e;

    /* renamed from: f */
    private final long f50771f;

    /* renamed from: g */
    private final BigDecimal f50772g;

    public C17839e(long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2) {
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str2, "acctName");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(bigDecimal2, "realAmount");
        this.f50766a = j;
        this.f50767b = str;
        this.f50768c = str2;
        this.f50769d = str3;
        this.f50770e = bigDecimal;
        this.f50771f = j2;
        this.f50772g = bigDecimal2;
    }

    /* renamed from: a */
    public final long mo45453a() {
        return this.f50766a;
    }

    /* renamed from: b */
    public final String mo45454b() {
        return this.f50768c;
    }

    /* renamed from: c */
    public final String mo45455c() {
        return this.f50767b;
    }

    /* renamed from: d */
    public final BigDecimal mo45456d() {
        return this.f50770e;
    }

    /* renamed from: e */
    public final String mo45457e() {
        return this.f50769d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17839e)) {
            return false;
        }
        C17839e eVar = (C17839e) obj;
        return this.f50766a == eVar.f50766a && C41536l.m120484d(this.f50767b, eVar.f50767b) && C41536l.m120484d(this.f50768c, eVar.f50768c) && C41536l.m120484d(this.f50769d, eVar.f50769d) && C41536l.m120484d(this.f50770e, eVar.f50770e) && this.f50771f == eVar.f50771f && C41536l.m120484d(this.f50772g, eVar.f50772g);
    }

    /* renamed from: f */
    public final long mo45459f() {
        return this.f50771f;
    }

    /* renamed from: g */
    public final BigDecimal mo45460g() {
        return this.f50772g;
    }

    public int hashCode() {
        return (((((((((((C7397t.m28148a(this.f50766a) * 31) + this.f50767b.hashCode()) * 31) + this.f50768c.hashCode()) * 31) + this.f50769d.hashCode()) * 31) + this.f50770e.hashCode()) * 31) + C7397t.m28148a(this.f50771f)) * 31) + this.f50772g.hashCode();
    }

    public String toString() {
        long j = this.f50766a;
        String str = this.f50767b;
        String str2 = this.f50768c;
        String str3 = this.f50769d;
        BigDecimal bigDecimal = this.f50770e;
        long j2 = this.f50771f;
        BigDecimal bigDecimal2 = this.f50772g;
        return "BnplDetailsRepaymentAccount(acctKey=" + j + ", acctNo=" + str + ", acctName=" + str2 + ", ccy=" + str3 + ", availableAmount=" + bigDecimal + ", mainAcctKey=" + j2 + ", realAmount=" + bigDecimal2 + ")";
    }
}
