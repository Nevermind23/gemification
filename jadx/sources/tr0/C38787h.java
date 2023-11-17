package tr0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: tr0.h */
public final class C38787h {

    /* renamed from: a */
    private final long f92784a;

    /* renamed from: b */
    private final BigDecimal f92785b;

    /* renamed from: c */
    private final String f92786c;

    /* renamed from: d */
    private final long f92787d;

    /* renamed from: e */
    private final long f92788e;

    /* renamed from: f */
    private final String f92789f;

    /* renamed from: g */
    private final String f92790g;

    /* renamed from: h */
    private final String f92791h;

    public C38787h(long j, BigDecimal bigDecimal, String str, long j2, long j3, String str2, String str3, String str4) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f92784a = j;
        this.f92785b = bigDecimal;
        this.f92786c = str;
        this.f92787d = j2;
        this.f92788e = j3;
        this.f92789f = str2;
        this.f92790g = str3;
        this.f92791h = str4;
    }

    /* renamed from: a */
    public final BigDecimal mo92449a() {
        return this.f92785b;
    }

    /* renamed from: b */
    public final String mo92450b() {
        return this.f92786c;
    }

    /* renamed from: c */
    public final long mo92451c() {
        return this.f92788e;
    }

    /* renamed from: d */
    public final String mo92452d() {
        return this.f92790g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38787h)) {
            return false;
        }
        C38787h hVar = (C38787h) obj;
        return this.f92784a == hVar.f92784a && C41536l.m120484d(this.f92785b, hVar.f92785b) && C41536l.m120484d(this.f92786c, hVar.f92786c) && this.f92787d == hVar.f92787d && this.f92788e == hVar.f92788e && C41536l.m120484d(this.f92789f, hVar.f92789f) && C41536l.m120484d(this.f92790g, hVar.f92790g) && C41536l.m120484d(this.f92791h, hVar.f92791h);
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f92784a) * 31) + this.f92785b.hashCode()) * 31) + this.f92786c.hashCode()) * 31) + C7397t.m28148a(this.f92787d)) * 31) + C7397t.m28148a(this.f92788e)) * 31;
        String str = this.f92789f;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92790g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92791h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.f92784a;
        BigDecimal bigDecimal = this.f92785b;
        String str = this.f92786c;
        long j2 = this.f92787d;
        long j3 = this.f92788e;
        String str2 = this.f92789f;
        String str3 = this.f92790g;
        String str4 = this.f92791h;
        return "LoanPlnRepayment(agreeId=" + j + ", amount=" + bigDecimal + ", ccy=" + str + ", id=" + j2 + ", operDate=" + j3 + ", operType=" + str2 + ", operTypeDictionaryKey=" + str3 + ", operTypeDictionaryValue=" + str4 + ")";
    }
}
