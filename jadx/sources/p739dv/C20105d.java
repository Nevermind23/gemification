package p739dv;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: dv.d */
public final class C20105d {

    /* renamed from: a */
    private final String f54741a;

    /* renamed from: b */
    private final String f54742b;

    /* renamed from: c */
    private final long f54743c;

    /* renamed from: d */
    private final String f54744d;

    /* renamed from: e */
    private final String f54745e;

    /* renamed from: f */
    private final Long f54746f;

    /* renamed from: g */
    private final BigDecimal f54747g;

    /* renamed from: h */
    private final String f54748h;

    /* renamed from: i */
    private final boolean f54749i;

    /* renamed from: j */
    private final boolean f54750j;

    /* renamed from: k */
    private final String f54751k;

    /* renamed from: l */
    private final Long f54752l;

    public C20105d(String str, String str2, long j, String str3, String str4, Long l, BigDecimal bigDecimal, String str5, boolean z, boolean z2, String str6, Long l2) {
        C41536l.m120489i(str2, "productType");
        this.f54741a = str;
        this.f54742b = str2;
        this.f54743c = j;
        this.f54744d = str3;
        this.f54745e = str4;
        this.f54746f = l;
        this.f54747g = bigDecimal;
        this.f54748h = str5;
        this.f54749i = z;
        this.f54750j = z2;
        this.f54751k = str6;
        this.f54752l = l2;
    }

    /* renamed from: a */
    public final BigDecimal mo48526a() {
        return this.f54747g;
    }

    /* renamed from: b */
    public final String mo48527b() {
        return this.f54748h;
    }

    /* renamed from: c */
    public final String mo48528c() {
        return this.f54745e;
    }

    /* renamed from: d */
    public final Long mo48529d() {
        return this.f54746f;
    }

    /* renamed from: e */
    public final String mo48530e() {
        return this.f54751k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20105d)) {
            return false;
        }
        C20105d dVar = (C20105d) obj;
        return C41536l.m120484d(this.f54741a, dVar.f54741a) && C41536l.m120484d(this.f54742b, dVar.f54742b) && this.f54743c == dVar.f54743c && C41536l.m120484d(this.f54744d, dVar.f54744d) && C41536l.m120484d(this.f54745e, dVar.f54745e) && C41536l.m120484d(this.f54746f, dVar.f54746f) && C41536l.m120484d(this.f54747g, dVar.f54747g) && C41536l.m120484d(this.f54748h, dVar.f54748h) && this.f54749i == dVar.f54749i && this.f54750j == dVar.f54750j && C41536l.m120484d(this.f54751k, dVar.f54751k) && C41536l.m120484d(this.f54752l, dVar.f54752l);
    }

    /* renamed from: f */
    public final String mo48532f() {
        return this.f54741a;
    }

    /* renamed from: g */
    public final long mo48533g() {
        return this.f54743c;
    }

    /* renamed from: h */
    public final String mo48534h() {
        return this.f54742b;
    }

    public int hashCode() {
        String str = this.f54741a;
        int i = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f54742b.hashCode()) * 31) + C7397t.m28148a(this.f54743c)) * 31;
        String str2 = this.f54744d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54745e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f54746f;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal = this.f54747g;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str4 = this.f54748h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.f54749i;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f54750j;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str5 = this.f54751k;
        int hashCode7 = (i3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.f54752l;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final String mo48536i() {
        return this.f54744d;
    }

    public String toString() {
        String str = this.f54741a;
        String str2 = this.f54742b;
        long j = this.f54743c;
        String str3 = this.f54744d;
        String str4 = this.f54745e;
        Long l = this.f54746f;
        BigDecimal bigDecimal = this.f54747g;
        String str5 = this.f54748h;
        boolean z = this.f54749i;
        boolean z2 = this.f54750j;
        String str6 = this.f54751k;
        Long l2 = this.f54752l;
        return "UpcomingPayment(productGroup=" + str + ", productType=" + str2 + ", productKey=" + j + ", subProductCode=" + str3 + ", name=" + str4 + ", payDate=" + l + ", amount=" + bigDecimal + ", ccy=" + str5 + ", isCustom=" + z + ", overdueFlag=" + z2 + ", productDictionaryKey=" + str6 + ", pfmId=" + l2 + ")";
    }
}
