package xy0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.r */
public final class C39954r {

    /* renamed from: a */
    private final long f94887a;

    /* renamed from: b */
    private final long f94888b;

    /* renamed from: c */
    private final String f94889c;

    /* renamed from: d */
    private final String f94890d;

    /* renamed from: e */
    private final String f94891e;

    /* renamed from: f */
    private final double f94892f;

    /* renamed from: g */
    private final String f94893g;

    public C39954r(long j, long j2, String str, String str2, String str3, double d, String str4) {
        this.f94887a = j;
        this.f94888b = j2;
        this.f94889c = str;
        this.f94890d = str2;
        this.f94891e = str3;
        this.f94892f = d;
        this.f94893g = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39954r)) {
            return false;
        }
        C39954r rVar = (C39954r) obj;
        return this.f94887a == rVar.f94887a && this.f94888b == rVar.f94888b && C41536l.m120484d(this.f94889c, rVar.f94889c) && C41536l.m120484d(this.f94890d, rVar.f94890d) && C41536l.m120484d(this.f94891e, rVar.f94891e) && Double.compare(this.f94892f, rVar.f94892f) == 0 && C41536l.m120484d(this.f94893g, rVar.f94893g);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f94887a) * 31) + C7397t.m28148a(this.f94888b)) * 31;
        String str = this.f94889c;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94890d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94891e;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.doubleToLongBits(this.f94892f)) * 31;
        String str4 = this.f94893g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.f94887a;
        long j2 = this.f94888b;
        String str = this.f94889c;
        String str2 = this.f94890d;
        String str3 = this.f94891e;
        double d = this.f94892f;
        String str4 = this.f94893g;
        return "LoanInvoice(loanKey=" + j + ", paymentDate=" + j2 + ", invoiceType=" + str + ", feeType=" + str2 + ", ccy=" + str3 + ", amount=" + d + ", invoiceTypeDictionaryKey=" + str4 + ")";
    }
}
