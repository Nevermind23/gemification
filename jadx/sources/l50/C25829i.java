package l50;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: l50.i */
public final class C25829i {

    /* renamed from: a */
    private final long f65691a;

    /* renamed from: b */
    private final BigDecimal f65692b;

    /* renamed from: c */
    private final Double f65693c;

    /* renamed from: d */
    private final Double f65694d;

    /* renamed from: e */
    private final Double f65695e;

    /* renamed from: f */
    private final Long f65696f;

    public C25829i(long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l) {
        this.f65691a = j;
        this.f65692b = bigDecimal;
        this.f65693c = d;
        this.f65694d = d2;
        this.f65695e = d3;
        this.f65696f = l;
    }

    /* renamed from: a */
    public final long mo64501a() {
        return this.f65691a;
    }

    /* renamed from: b */
    public final Long mo64502b() {
        return this.f65696f;
    }

    /* renamed from: c */
    public final Double mo64503c() {
        return this.f65695e;
    }

    /* renamed from: d */
    public final Double mo64504d() {
        return this.f65694d;
    }

    /* renamed from: e */
    public final BigDecimal mo64505e() {
        return this.f65692b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25829i)) {
            return false;
        }
        C25829i iVar = (C25829i) obj;
        return this.f65691a == iVar.f65691a && C41536l.m120484d(this.f65692b, iVar.f65692b) && C41536l.m120484d(this.f65693c, iVar.f65693c) && C41536l.m120484d(this.f65694d, iVar.f65694d) && C41536l.m120484d(this.f65695e, iVar.f65695e) && C41536l.m120484d(this.f65696f, iVar.f65696f);
    }

    /* renamed from: f */
    public final Double mo64507f() {
        return this.f65693c;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f65691a) * 31;
        BigDecimal bigDecimal = this.f65692b;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Double d = this.f65693c;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f65694d;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f65695e;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l = this.f65696f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.f65691a;
        BigDecimal bigDecimal = this.f65692b;
        Double d = this.f65693c;
        Double d2 = this.f65694d;
        Double d3 = this.f65695e;
        Long l = this.f65696f;
        return "AccountWithCardsOverdraftParamUIModel(acctKey=" + j + ", overdraftLimit=" + bigDecimal + ", unusedOverdraftLimit=" + d + ", interestRate=" + d2 + ", intAccruedOverdraft=" + d3 + ", endDate=" + l + ")";
    }
}
