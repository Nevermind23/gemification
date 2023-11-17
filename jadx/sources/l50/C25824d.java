package l50;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: l50.d */
public final class C25824d {

    /* renamed from: a */
    private final long f65662a;

    /* renamed from: b */
    private final BigDecimal f65663b;

    /* renamed from: c */
    private final String f65664c;

    /* renamed from: d */
    private final Long f65665d;

    public C25824d(long j, BigDecimal bigDecimal, String str, Long l) {
        C41536l.m120489i(str, "ccy");
        this.f65662a = j;
        this.f65663b = bigDecimal;
        this.f65664c = str;
        this.f65665d = l;
    }

    /* renamed from: a */
    public final long mo64466a() {
        return this.f65662a;
    }

    /* renamed from: b */
    public final Long mo64467b() {
        return this.f65665d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25824d)) {
            return false;
        }
        C25824d dVar = (C25824d) obj;
        return this.f65662a == dVar.f65662a && C41536l.m120484d(this.f65663b, dVar.f65663b) && C41536l.m120484d(this.f65664c, dVar.f65664c) && C41536l.m120484d(this.f65665d, dVar.f65665d);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f65662a) * 31;
        BigDecimal bigDecimal = this.f65663b;
        int i = 0;
        int hashCode = (((a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.f65664c.hashCode()) * 31;
        Long l = this.f65665d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f65662a;
        BigDecimal bigDecimal = this.f65663b;
        String str = this.f65664c;
        Long l = this.f65665d;
        return "AccountSubAccountsUIModel(acctKey=" + j + ", realAmount=" + bigDecimal + ", ccy=" + str + ", pfmAcctId=" + l + ")";
    }
}
