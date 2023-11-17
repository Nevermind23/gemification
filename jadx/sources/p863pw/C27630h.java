package p863pw;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: pw.h */
public final class C27630h {

    /* renamed from: a */
    private final BigDecimal f70637a;

    /* renamed from: b */
    private final String f70638b;

    /* renamed from: c */
    private final int f70639c;

    public C27630h(BigDecimal bigDecimal, String str, int i) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f70637a = bigDecimal;
        this.f70638b = str;
        this.f70639c = i;
    }

    /* renamed from: a */
    public final BigDecimal mo67069a() {
        return this.f70637a;
    }

    /* renamed from: b */
    public final String mo67070b() {
        return this.f70638b;
    }

    /* renamed from: c */
    public final int mo67071c() {
        return this.f70639c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27630h)) {
            return false;
        }
        C27630h hVar = (C27630h) obj;
        return C41536l.m120484d(this.f70637a, hVar.f70637a) && C41536l.m120484d(this.f70638b, hVar.f70638b) && this.f70639c == hVar.f70639c;
    }

    public int hashCode() {
        return (((this.f70637a.hashCode() * 31) + this.f70638b.hashCode()) * 31) + this.f70639c;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f70637a;
        String str = this.f70638b;
        int i = this.f70639c;
        return "AccountSubAccountAmountSums(amount=" + bigDecimal + ", ccy=" + str + ", orderNo=" + i + ")";
    }
}
