package lx0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: lx0.e */
public final class C37180e {

    /* renamed from: a */
    private final long f89537a;

    /* renamed from: b */
    private final String f89538b;

    /* renamed from: c */
    private final String f89539c;

    /* renamed from: d */
    private final String f89540d;

    /* renamed from: e */
    private final String f89541e;

    /* renamed from: f */
    private final BigDecimal f89542f;

    /* renamed from: g */
    private final String f89543g;

    /* renamed from: h */
    private final String f89544h;

    /* renamed from: i */
    private final int f89545i;

    /* renamed from: j */
    private final String f89546j;

    public C37180e(long j, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, String str6, int i, String str7) {
        C41536l.m120489i(str, "masterServiceId");
        C41536l.m120489i(str2, "paymentServiceId");
        C41536l.m120489i(str3, "packageName");
        C41536l.m120489i(str4, "packageDesc");
        C41536l.m120489i(bigDecimal, "packageAmount");
        C41536l.m120489i(str5, "channel");
        C41536l.m120489i(str6, "status");
        C41536l.m120489i(str7, "defaultIconUrl");
        this.f89537a = j;
        this.f89538b = str;
        this.f89539c = str2;
        this.f89540d = str3;
        this.f89541e = str4;
        this.f89542f = bigDecimal;
        this.f89543g = str5;
        this.f89544h = str6;
        this.f89545i = i;
        this.f89546j = str7;
    }

    /* renamed from: a */
    public final String mo90185a() {
        return this.f89546j;
    }

    /* renamed from: b */
    public final long mo90186b() {
        return this.f89537a;
    }

    /* renamed from: c */
    public final int mo90187c() {
        return this.f89545i;
    }

    /* renamed from: d */
    public final BigDecimal mo90188d() {
        return this.f89542f;
    }

    /* renamed from: e */
    public final String mo90189e() {
        return this.f89541e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37180e)) {
            return false;
        }
        C37180e eVar = (C37180e) obj;
        return this.f89537a == eVar.f89537a && C41536l.m120484d(this.f89538b, eVar.f89538b) && C41536l.m120484d(this.f89539c, eVar.f89539c) && C41536l.m120484d(this.f89540d, eVar.f89540d) && C41536l.m120484d(this.f89541e, eVar.f89541e) && C41536l.m120484d(this.f89542f, eVar.f89542f) && C41536l.m120484d(this.f89543g, eVar.f89543g) && C41536l.m120484d(this.f89544h, eVar.f89544h) && this.f89545i == eVar.f89545i && C41536l.m120484d(this.f89546j, eVar.f89546j);
    }

    /* renamed from: f */
    public final String mo90191f() {
        return this.f89540d;
    }

    /* renamed from: g */
    public final String mo90192g() {
        return this.f89539c;
    }

    public int hashCode() {
        return (((((((((((((((((C7397t.m28148a(this.f89537a) * 31) + this.f89538b.hashCode()) * 31) + this.f89539c.hashCode()) * 31) + this.f89540d.hashCode()) * 31) + this.f89541e.hashCode()) * 31) + this.f89542f.hashCode()) * 31) + this.f89543g.hashCode()) * 31) + this.f89544h.hashCode()) * 31) + this.f89545i) * 31) + this.f89546j.hashCode();
    }

    public String toString() {
        long j = this.f89537a;
        String str = this.f89538b;
        String str2 = this.f89539c;
        String str3 = this.f89540d;
        String str4 = this.f89541e;
        BigDecimal bigDecimal = this.f89542f;
        String str5 = this.f89543g;
        String str6 = this.f89544h;
        int i = this.f89545i;
        String str7 = this.f89546j;
        return "PaymentPackage(id=" + j + ", masterServiceId=" + str + ", paymentServiceId=" + str2 + ", packageName=" + str3 + ", packageDesc=" + str4 + ", packageAmount=" + bigDecimal + ", channel=" + str5 + ", status=" + str6 + ", orderNo=" + i + ", defaultIconUrl=" + str7 + ")";
    }
}
