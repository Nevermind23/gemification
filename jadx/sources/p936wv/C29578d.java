package p936wv;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: wv.d */
public final class C29578d {

    /* renamed from: a */
    private final BigDecimal f74720a;

    /* renamed from: b */
    private final long f74721b;

    /* renamed from: c */
    private final long f74722c;

    /* renamed from: d */
    private Long f74723d;

    public C29578d(BigDecimal bigDecimal, long j, long j2, Long l) {
        C41536l.m120489i(bigDecimal, "amount");
        this.f74720a = bigDecimal;
        this.f74721b = j;
        this.f74722c = j2;
        this.f74723d = l;
    }

    /* renamed from: a */
    public final BigDecimal mo69451a() {
        return this.f74720a;
    }

    /* renamed from: b */
    public final long mo69452b() {
        return this.f74722c;
    }

    /* renamed from: c */
    public final Long mo69453c() {
        return this.f74723d;
    }

    /* renamed from: d */
    public final void mo69454d(Long l) {
        this.f74723d = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29578d)) {
            return false;
        }
        C29578d dVar = (C29578d) obj;
        return C41536l.m120484d(this.f74720a, dVar.f74720a) && this.f74721b == dVar.f74721b && this.f74722c == dVar.f74722c && C41536l.m120484d(this.f74723d, dVar.f74723d);
    }

    public int hashCode() {
        int hashCode = ((((this.f74720a.hashCode() * 31) + C7397t.m28148a(this.f74721b)) * 31) + C7397t.m28148a(this.f74722c)) * 31;
        Long l = this.f74723d;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.f74720a;
        long j = this.f74721b;
        long j2 = this.f74722c;
        Long l = this.f74723d;
        return "BudgetingExpense(amount=" + bigDecimal + ", number=" + j + ", catId=" + j2 + ", parentCatId=" + l + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29578d(BigDecimal bigDecimal, long j, long j2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, j, j2, (i & 8) != 0 ? null : l);
    }
}
