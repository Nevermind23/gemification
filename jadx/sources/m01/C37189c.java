package m01;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: m01.c */
public final class C37189c {

    /* renamed from: a */
    private final long f89567a;

    /* renamed from: b */
    private final BigDecimal f89568b;

    /* renamed from: c */
    private final String f89569c;

    public C37189c(long j, BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(str, "ccy");
        this.f89567a = j;
        this.f89568b = bigDecimal;
        this.f89569c = str;
    }

    /* renamed from: a */
    public final BigDecimal mo90216a() {
        return this.f89568b;
    }

    /* renamed from: b */
    public final String mo90217b() {
        return this.f89569c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37189c)) {
            return false;
        }
        C37189c cVar = (C37189c) obj;
        return this.f89567a == cVar.f89567a && C41536l.m120484d(this.f89568b, cVar.f89568b) && C41536l.m120484d(this.f89569c, cVar.f89569c);
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f89567a) * 31) + this.f89568b.hashCode()) * 31) + this.f89569c.hashCode();
    }

    public String toString() {
        long j = this.f89567a;
        BigDecimal bigDecimal = this.f89568b;
        String str = this.f89569c;
        return "AccountSubAccountData(acctKey=" + j + ", availableAmount=" + bigDecimal + ", ccy=" + str + ")";
    }
}
