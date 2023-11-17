package p946xu;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xu.a */
public final class C29859a {

    /* renamed from: a */
    private final long f75561a;

    /* renamed from: b */
    private final BigDecimal f75562b;

    /* renamed from: c */
    private final String f75563c;

    /* renamed from: d */
    private final Long f75564d;

    /* renamed from: e */
    private final BigDecimal f75565e;

    /* renamed from: f */
    private final String f75566f;

    /* renamed from: g */
    private final BigDecimal f75567g;

    /* renamed from: h */
    private final String f75568h;

    /* renamed from: i */
    private final String f75569i;

    /* renamed from: j */
    private final String f75570j;

    public C29859a(long j, BigDecimal bigDecimal, String str, Long l, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, String str3, String str4, String str5) {
        this.f75561a = j;
        this.f75562b = bigDecimal;
        this.f75563c = str;
        this.f75564d = l;
        this.f75565e = bigDecimal2;
        this.f75566f = str2;
        this.f75567g = bigDecimal3;
        this.f75568h = str3;
        this.f75569i = str4;
        this.f75570j = str5;
    }

    /* renamed from: a */
    public final BigDecimal mo70115a() {
        return this.f75562b;
    }

    /* renamed from: b */
    public final String mo70116b() {
        return this.f75563c;
    }

    /* renamed from: c */
    public final BigDecimal mo70117c() {
        return this.f75565e;
    }

    /* renamed from: d */
    public final String mo70118d() {
        return this.f75566f;
    }

    /* renamed from: e */
    public final Long mo70119e() {
        return this.f75564d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29859a)) {
            return false;
        }
        C29859a aVar = (C29859a) obj;
        return this.f75561a == aVar.f75561a && C41536l.m120484d(this.f75562b, aVar.f75562b) && C41536l.m120484d(this.f75563c, aVar.f75563c) && C41536l.m120484d(this.f75564d, aVar.f75564d) && C41536l.m120484d(this.f75565e, aVar.f75565e) && C41536l.m120484d(this.f75566f, aVar.f75566f) && C41536l.m120484d(this.f75567g, aVar.f75567g) && C41536l.m120484d(this.f75568h, aVar.f75568h) && C41536l.m120484d(this.f75569i, aVar.f75569i) && C41536l.m120484d(this.f75570j, aVar.f75570j);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f75561a) * 31;
        BigDecimal bigDecimal = this.f75562b;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f75563c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f75564d;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f75565e;
        int hashCode4 = (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.f75566f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f75567g;
        int hashCode6 = (hashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str3 = this.f75568h;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f75569i;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f75570j;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        long j = this.f75561a;
        BigDecimal bigDecimal = this.f75562b;
        String str = this.f75563c;
        Long l = this.f75564d;
        BigDecimal bigDecimal2 = this.f75565e;
        String str2 = this.f75566f;
        BigDecimal bigDecimal3 = this.f75567g;
        String str3 = this.f75568h;
        String str4 = this.f75569i;
        String str5 = this.f75570j;
        return "CreditApplication(appId=" + j + ", amount=" + bigDecimal + ", currency=" + str + ", term=" + l + ", loanAmount=" + bigDecimal2 + ", loanCurrency=" + str2 + ", commissionAmt=" + bigDecimal3 + ", subProduct=" + str3 + ", condition=" + str4 + ", rsDataApprovePhone=" + str5 + ")";
    }
}
