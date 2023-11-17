package q51;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: q51.b */
public final class C38131b {

    /* renamed from: a */
    private final long f91541a;

    /* renamed from: b */
    private final String f91542b;

    /* renamed from: c */
    private final String f91543c;

    /* renamed from: d */
    private final BigDecimal f91544d;

    /* renamed from: e */
    private final String f91545e;

    public C38131b(long j, String str, String str2, BigDecimal bigDecimal, String str3) {
        C41536l.m120489i(str, "accNo");
        C41536l.m120489i(str2, "displayName");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str3, "ccy");
        this.f91541a = j;
        this.f91542b = str;
        this.f91543c = str2;
        this.f91544d = bigDecimal;
        this.f91545e = str3;
    }

    /* renamed from: a */
    public final long mo91660a() {
        return this.f91541a;
    }

    /* renamed from: b */
    public final String mo91661b() {
        return this.f91542b;
    }

    /* renamed from: c */
    public final BigDecimal mo91662c() {
        return this.f91544d;
    }

    /* renamed from: d */
    public final String mo91663d() {
        return this.f91545e;
    }

    /* renamed from: e */
    public final String mo91664e() {
        return this.f91543c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38131b)) {
            return false;
        }
        C38131b bVar = (C38131b) obj;
        return this.f91541a == bVar.f91541a && C41536l.m120484d(this.f91542b, bVar.f91542b) && C41536l.m120484d(this.f91543c, bVar.f91543c) && C41536l.m120484d(this.f91544d, bVar.f91544d) && C41536l.m120484d(this.f91545e, bVar.f91545e);
    }

    public int hashCode() {
        return (((((((C7397t.m28148a(this.f91541a) * 31) + this.f91542b.hashCode()) * 31) + this.f91543c.hashCode()) * 31) + this.f91544d.hashCode()) * 31) + this.f91545e.hashCode();
    }

    public String toString() {
        long j = this.f91541a;
        String str = this.f91542b;
        String str2 = this.f91543c;
        BigDecimal bigDecimal = this.f91544d;
        String str3 = this.f91545e;
        return "StatementAccountModel(accId=" + j + ", accNo=" + str + ", displayName=" + str2 + ", amount=" + bigDecimal + ", ccy=" + str3 + ")";
    }
}
