package m70;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: m70.f */
public final class C26153f {

    /* renamed from: a */
    private final long f66340a;

    /* renamed from: b */
    private final String f66341b;

    /* renamed from: c */
    private final BigDecimal f66342c;

    /* renamed from: d */
    private final BigDecimal f66343d;

    /* renamed from: e */
    private final String f66344e;

    /* renamed from: f */
    private final boolean f66345f;

    /* renamed from: g */
    private final Long f66346g;

    /* renamed from: h */
    private final C26151d f66347h;

    public C26153f(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l, C26151d dVar) {
        C41536l.m120489i(str, "printAcctNo");
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(str2, "ccy");
        this.f66340a = j;
        this.f66341b = str;
        this.f66342c = bigDecimal;
        this.f66343d = bigDecimal2;
        this.f66344e = str2;
        this.f66345f = z;
        this.f66346g = l;
        this.f66347h = dVar;
    }

    /* renamed from: a */
    public final long mo65165a() {
        return this.f66340a;
    }

    /* renamed from: b */
    public final BigDecimal mo65166b() {
        return this.f66342c;
    }

    /* renamed from: c */
    public final String mo65167c() {
        return this.f66344e;
    }

    /* renamed from: d */
    public final boolean mo65168d() {
        return this.f66345f;
    }

    /* renamed from: e */
    public final C26151d mo65169e() {
        return this.f66347h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26153f)) {
            return false;
        }
        C26153f fVar = (C26153f) obj;
        return this.f66340a == fVar.f66340a && C41536l.m120484d(this.f66341b, fVar.f66341b) && C41536l.m120484d(this.f66342c, fVar.f66342c) && C41536l.m120484d(this.f66343d, fVar.f66343d) && C41536l.m120484d(this.f66344e, fVar.f66344e) && this.f66345f == fVar.f66345f && C41536l.m120484d(this.f66346g, fVar.f66346g) && C41536l.m120484d(this.f66347h, fVar.f66347h);
    }

    /* renamed from: f */
    public final Long mo65171f() {
        return this.f66346g;
    }

    /* renamed from: g */
    public final String mo65172g() {
        return this.f66341b;
    }

    /* renamed from: h */
    public final BigDecimal mo65173h() {
        return this.f66343d;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f66340a) * 31) + this.f66341b.hashCode()) * 31) + this.f66342c.hashCode()) * 31;
        BigDecimal bigDecimal = this.f66343d;
        int i = 0;
        int hashCode = (((a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.f66344e.hashCode()) * 31;
        boolean z = this.f66345f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Long l = this.f66346g;
        int hashCode2 = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        C26151d dVar = this.f66347h;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.f66340a;
        String str = this.f66341b;
        BigDecimal bigDecimal = this.f66342c;
        BigDecimal bigDecimal2 = this.f66343d;
        String str2 = this.f66344e;
        boolean z = this.f66345f;
        Long l = this.f66346g;
        C26151d dVar = this.f66347h;
        return "AccountSubAccount(acctKey=" + j + ", printAcctNo=" + str + ", availableAmount=" + bigDecimal + ", realAmount=" + bigDecimal2 + ", ccy=" + str2 + ", hasOverdraft=" + z + ", pfmAcctId=" + l + ", overdraftParam=" + dVar + ")";
    }
}
