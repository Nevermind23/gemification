package xh0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xh0.k */
public final class C29794k {

    /* renamed from: a */
    private final Long f75406a;

    /* renamed from: b */
    private final Long f75407b;

    /* renamed from: c */
    private final Long f75408c;

    /* renamed from: d */
    private final String f75409d;

    /* renamed from: e */
    private final String f75410e;

    /* renamed from: f */
    private final long f75411f;

    /* renamed from: g */
    private final String f75412g;

    /* renamed from: h */
    private final C29795a f75413h;

    /* renamed from: i */
    private final BigDecimal f75414i;

    /* renamed from: j */
    private final String f75415j;

    /* renamed from: k */
    private final String f75416k;

    /* renamed from: l */
    private final long f75417l;

    /* renamed from: m */
    private final Long f75418m;

    /* renamed from: n */
    private final String f75419n;

    /* renamed from: xh0.k$a */
    public enum C29795a {
        PAYMENT,
        PARTIAL_REVERSAL,
        FULL_REVERSAL
    }

    public C29794k(Long l, Long l2, Long l3, String str, String str2, long j, String str3, C29795a aVar, BigDecimal bigDecimal, String str4, String str5, long j2, Long l4, String str6) {
        C29795a aVar2 = aVar;
        BigDecimal bigDecimal2 = bigDecimal;
        String str7 = str4;
        C41536l.m120489i(str, "merchantAddress");
        C41536l.m120489i(str2, "merchantName");
        C41536l.m120489i(aVar2, "paymentType");
        C41536l.m120489i(bigDecimal2, "settlementAmount");
        C41536l.m120489i(str7, "settlementCcy");
        this.f75406a = l;
        this.f75407b = l2;
        this.f75408c = l3;
        this.f75409d = str;
        this.f75410e = str2;
        this.f75411f = j;
        this.f75412g = str3;
        this.f75413h = aVar2;
        this.f75414i = bigDecimal2;
        this.f75415j = str7;
        this.f75416k = str5;
        this.f75417l = j2;
        this.f75418m = l4;
        this.f75419n = str6;
    }

    /* renamed from: a */
    public final String mo70011a() {
        return this.f75409d;
    }

    /* renamed from: b */
    public final String mo70012b() {
        return this.f75410e;
    }

    /* renamed from: c */
    public final C29795a mo70013c() {
        return this.f75413h;
    }

    /* renamed from: d */
    public final BigDecimal mo70014d() {
        return this.f75414i;
    }

    /* renamed from: e */
    public final String mo70015e() {
        return this.f75415j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29794k)) {
            return false;
        }
        C29794k kVar = (C29794k) obj;
        return C41536l.m120484d(this.f75406a, kVar.f75406a) && C41536l.m120484d(this.f75407b, kVar.f75407b) && C41536l.m120484d(this.f75408c, kVar.f75408c) && C41536l.m120484d(this.f75409d, kVar.f75409d) && C41536l.m120484d(this.f75410e, kVar.f75410e) && this.f75411f == kVar.f75411f && C41536l.m120484d(this.f75412g, kVar.f75412g) && this.f75413h == kVar.f75413h && C41536l.m120484d(this.f75414i, kVar.f75414i) && C41536l.m120484d(this.f75415j, kVar.f75415j) && C41536l.m120484d(this.f75416k, kVar.f75416k) && this.f75417l == kVar.f75417l && C41536l.m120484d(this.f75418m, kVar.f75418m) && C41536l.m120484d(this.f75419n, kVar.f75419n);
    }

    /* renamed from: f */
    public final long mo70017f() {
        return this.f75417l;
    }

    public int hashCode() {
        Long l = this.f75406a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f75407b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f75408c;
        int hashCode3 = (((((((hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31) + this.f75409d.hashCode()) * 31) + this.f75410e.hashCode()) * 31) + C7397t.m28148a(this.f75411f)) * 31;
        String str = this.f75412g;
        int hashCode4 = (((((((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f75413h.hashCode()) * 31) + this.f75414i.hashCode()) * 31) + this.f75415j.hashCode()) * 31;
        String str2 = this.f75416k;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + C7397t.m28148a(this.f75417l)) * 31;
        Long l4 = this.f75418m;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.f75419n;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        Long l = this.f75406a;
        Long l2 = this.f75407b;
        Long l3 = this.f75408c;
        String str = this.f75409d;
        String str2 = this.f75410e;
        long j = this.f75411f;
        String str3 = this.f75412g;
        C29795a aVar = this.f75413h;
        BigDecimal bigDecimal = this.f75414i;
        String str4 = this.f75415j;
        String str5 = this.f75416k;
        long j2 = this.f75417l;
        Long l4 = this.f75418m;
        String str6 = this.f75419n;
        return "GiftCardTransaction(clientKey=" + l + ", giftCardId=" + l2 + ", id=" + l3 + ", merchantAddress=" + str + ", merchantName=" + str2 + ", offerId=" + j + ", paymentCode=" + str3 + ", paymentType=" + aVar + ", settlementAmount=" + bigDecimal + ", settlementCcy=" + str4 + ", terminalId=" + str5 + ", transactionDate=" + j2 + ", transactionId=" + l4 + ", transactionRrn=" + str6 + ")";
    }
}
