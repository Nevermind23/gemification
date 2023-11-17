package p863pw;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: pw.g */
public final class C27629g {

    /* renamed from: a */
    private final long f70629a;

    /* renamed from: b */
    private final String f70630b;

    /* renamed from: c */
    private final BigDecimal f70631c;

    /* renamed from: d */
    private final BigDecimal f70632d;

    /* renamed from: e */
    private final String f70633e;

    /* renamed from: f */
    private final boolean f70634f;

    /* renamed from: g */
    private final Long f70635g;

    /* renamed from: h */
    private final C27627e f70636h;

    public C27629g(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l, C27627e eVar) {
        C41536l.m120489i(str, "printAcctNo");
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(str2, "ccy");
        this.f70629a = j;
        this.f70630b = str;
        this.f70631c = bigDecimal;
        this.f70632d = bigDecimal2;
        this.f70633e = str2;
        this.f70634f = z;
        this.f70635g = l;
        this.f70636h = eVar;
    }

    /* renamed from: a */
    public final long mo67059a() {
        return this.f70629a;
    }

    /* renamed from: b */
    public final BigDecimal mo67060b() {
        return this.f70631c;
    }

    /* renamed from: c */
    public final String mo67061c() {
        return this.f70633e;
    }

    /* renamed from: d */
    public final boolean mo67062d() {
        return this.f70634f;
    }

    /* renamed from: e */
    public final C27627e mo67063e() {
        return this.f70636h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27629g)) {
            return false;
        }
        C27629g gVar = (C27629g) obj;
        return this.f70629a == gVar.f70629a && C41536l.m120484d(this.f70630b, gVar.f70630b) && C41536l.m120484d(this.f70631c, gVar.f70631c) && C41536l.m120484d(this.f70632d, gVar.f70632d) && C41536l.m120484d(this.f70633e, gVar.f70633e) && this.f70634f == gVar.f70634f && C41536l.m120484d(this.f70635g, gVar.f70635g) && C41536l.m120484d(this.f70636h, gVar.f70636h);
    }

    /* renamed from: f */
    public final Long mo67065f() {
        return this.f70635g;
    }

    /* renamed from: g */
    public final BigDecimal mo67066g() {
        return this.f70632d;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f70629a) * 31) + this.f70630b.hashCode()) * 31) + this.f70631c.hashCode()) * 31;
        BigDecimal bigDecimal = this.f70632d;
        int i = 0;
        int hashCode = (((a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.f70633e.hashCode()) * 31;
        boolean z = this.f70634f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Long l = this.f70635g;
        int hashCode2 = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        C27627e eVar = this.f70636h;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.f70629a;
        String str = this.f70630b;
        BigDecimal bigDecimal = this.f70631c;
        BigDecimal bigDecimal2 = this.f70632d;
        String str2 = this.f70633e;
        boolean z = this.f70634f;
        Long l = this.f70635g;
        C27627e eVar = this.f70636h;
        return "AccountSubAccount(acctKey=" + j + ", printAcctNo=" + str + ", availableAmount=" + bigDecimal + ", realAmount=" + bigDecimal2 + ", ccy=" + str2 + ", hasOverdraft=" + z + ", pfmAcctId=" + l + ", overdraftParam=" + eVar + ")";
    }
}
