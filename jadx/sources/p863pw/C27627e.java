package p863pw;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: pw.e */
public final class C27627e {

    /* renamed from: a */
    private final long f70619a;

    /* renamed from: b */
    private final BigDecimal f70620b;

    /* renamed from: c */
    private final Double f70621c;

    /* renamed from: d */
    private final Double f70622d;

    /* renamed from: e */
    private final Double f70623e;

    /* renamed from: f */
    private final Long f70624f;

    public C27627e(long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l) {
        this.f70619a = j;
        this.f70620b = bigDecimal;
        this.f70621c = d;
        this.f70622d = d2;
        this.f70623e = d3;
        this.f70624f = l;
    }

    /* renamed from: a */
    public final long mo67043a() {
        return this.f70619a;
    }

    /* renamed from: b */
    public final Long mo67044b() {
        return this.f70624f;
    }

    /* renamed from: c */
    public final Double mo67045c() {
        return this.f70623e;
    }

    /* renamed from: d */
    public final Double mo67046d() {
        return this.f70622d;
    }

    /* renamed from: e */
    public final BigDecimal mo67047e() {
        return this.f70620b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27627e)) {
            return false;
        }
        C27627e eVar = (C27627e) obj;
        return this.f70619a == eVar.f70619a && C41536l.m120484d(this.f70620b, eVar.f70620b) && C41536l.m120484d(this.f70621c, eVar.f70621c) && C41536l.m120484d(this.f70622d, eVar.f70622d) && C41536l.m120484d(this.f70623e, eVar.f70623e) && C41536l.m120484d(this.f70624f, eVar.f70624f);
    }

    /* renamed from: f */
    public final Double mo67049f() {
        return this.f70621c;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f70619a) * 31;
        BigDecimal bigDecimal = this.f70620b;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Double d = this.f70621c;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f70622d;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f70623e;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l = this.f70624f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.f70619a;
        BigDecimal bigDecimal = this.f70620b;
        Double d = this.f70621c;
        Double d2 = this.f70622d;
        Double d3 = this.f70623e;
        Long l = this.f70624f;
        return "AccountOverdraftParam(acctKey=" + j + ", overdraftLimit=" + bigDecimal + ", unusedOverdraftLimit=" + d + ", interestRate=" + d2 + ", intAccruedOverdraft=" + d3 + ", endDate=" + l + ")";
    }
}
