package r80;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: r80.a */
public final class C27947a {

    /* renamed from: a */
    private final long f71148a;

    /* renamed from: b */
    private final String f71149b;

    /* renamed from: c */
    private final String f71150c;

    /* renamed from: d */
    private final String f71151d;

    /* renamed from: e */
    private final int f71152e;

    /* renamed from: f */
    private final int f71153f;

    /* renamed from: g */
    private final BigDecimal f71154g;

    /* renamed from: h */
    private final BigDecimal f71155h;

    /* renamed from: i */
    private final BigDecimal f71156i;

    /* renamed from: j */
    private final String f71157j;

    /* renamed from: k */
    private final String f71158k;

    /* renamed from: l */
    private final String f71159l;

    public C27947a(long j, String str, String str2, String str3, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(str2, "subProductType");
        C41536l.m120489i(str3, "periodType");
        C41536l.m120489i(bigDecimal, "maxAmount");
        C41536l.m120489i(bigDecimal2, "minAmount");
        C41536l.m120489i(bigDecimal3, "incomeMinAmount");
        C41536l.m120489i(str4, "status");
        C41536l.m120489i(str5, "productCurrency");
        C41536l.m120489i(str6, "prodTermsDictionaryKey");
        this.f71148a = j;
        this.f71149b = str;
        this.f71150c = str2;
        this.f71151d = str3;
        this.f71152e = i;
        this.f71153f = i2;
        this.f71154g = bigDecimal;
        this.f71155h = bigDecimal2;
        this.f71156i = bigDecimal3;
        this.f71157j = str4;
        this.f71158k = str5;
        this.f71159l = str6;
    }

    /* renamed from: a */
    public final long mo67515a() {
        return this.f71148a;
    }

    /* renamed from: b */
    public final BigDecimal mo67516b() {
        return this.f71156i;
    }

    /* renamed from: c */
    public final BigDecimal mo67517c() {
        return this.f71154g;
    }

    /* renamed from: d */
    public final int mo67518d() {
        return this.f71152e;
    }

    /* renamed from: e */
    public final BigDecimal mo67519e() {
        return this.f71155h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27947a)) {
            return false;
        }
        C27947a aVar = (C27947a) obj;
        return this.f71148a == aVar.f71148a && C41536l.m120484d(this.f71149b, aVar.f71149b) && C41536l.m120484d(this.f71150c, aVar.f71150c) && C41536l.m120484d(this.f71151d, aVar.f71151d) && this.f71152e == aVar.f71152e && this.f71153f == aVar.f71153f && C41536l.m120484d(this.f71154g, aVar.f71154g) && C41536l.m120484d(this.f71155h, aVar.f71155h) && C41536l.m120484d(this.f71156i, aVar.f71156i) && C41536l.m120484d(this.f71157j, aVar.f71157j) && C41536l.m120484d(this.f71158k, aVar.f71158k) && C41536l.m120484d(this.f71159l, aVar.f71159l);
    }

    /* renamed from: f */
    public final int mo67521f() {
        return this.f71153f;
    }

    /* renamed from: g */
    public final String mo67522g() {
        return this.f71151d;
    }

    /* renamed from: h */
    public final String mo67523h() {
        return this.f71159l;
    }

    public int hashCode() {
        return (((((((((((((((((((((C7397t.m28148a(this.f71148a) * 31) + this.f71149b.hashCode()) * 31) + this.f71150c.hashCode()) * 31) + this.f71151d.hashCode()) * 31) + this.f71152e) * 31) + this.f71153f) * 31) + this.f71154g.hashCode()) * 31) + this.f71155h.hashCode()) * 31) + this.f71156i.hashCode()) * 31) + this.f71157j.hashCode()) * 31) + this.f71158k.hashCode()) * 31) + this.f71159l.hashCode();
    }

    /* renamed from: i */
    public final String mo67525i() {
        return this.f71158k;
    }

    /* renamed from: j */
    public final String mo67526j() {
        return this.f71149b;
    }

    /* renamed from: k */
    public final String mo67527k() {
        return this.f71157j;
    }

    /* renamed from: l */
    public final String mo67528l() {
        return this.f71150c;
    }

    public String toString() {
        long j = this.f71148a;
        String str = this.f71149b;
        String str2 = this.f71150c;
        String str3 = this.f71151d;
        int i = this.f71152e;
        int i2 = this.f71153f;
        BigDecimal bigDecimal = this.f71154g;
        BigDecimal bigDecimal2 = this.f71155h;
        BigDecimal bigDecimal3 = this.f71156i;
        String str4 = this.f71157j;
        String str5 = this.f71158k;
        String str6 = this.f71159l;
        return "ClaDetails(Id=" + j + ", productType=" + str + ", subProductType=" + str2 + ", periodType=" + str3 + ", maxPeriod=" + i + ", minPeriod=" + i2 + ", maxAmount=" + bigDecimal + ", minAmount=" + bigDecimal2 + ", incomeMinAmount=" + bigDecimal3 + ", status=" + str4 + ", productCurrency=" + str5 + ", prodTermsDictionaryKey=" + str6 + ")";
    }
}
