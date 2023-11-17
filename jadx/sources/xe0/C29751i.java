package xe0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.i */
public final class C29751i {

    /* renamed from: a */
    private final BigDecimal f75213a;

    /* renamed from: b */
    private final BigDecimal f75214b;

    /* renamed from: c */
    private final BigDecimal f75215c;

    /* renamed from: d */
    private final BigDecimal f75216d;

    /* renamed from: e */
    private final BigDecimal f75217e;

    /* renamed from: f */
    private final BigDecimal f75218f;

    /* renamed from: g */
    private final String f75219g;

    /* renamed from: h */
    private final String f75220h;

    public C29751i(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str, String str2) {
        C41536l.m120489i(bigDecimal, "equityValue");
        C41536l.m120489i(bigDecimal2, "dailyProfitValue");
        C41536l.m120489i(bigDecimal3, "dailyProfitPercent");
        C41536l.m120489i(bigDecimal4, "totalProfitValue");
        C41536l.m120489i(bigDecimal5, "totalProfitPercent");
        C41536l.m120489i(bigDecimal6, "cashAvailableForTrade");
        C41536l.m120489i(str, "regDate");
        C41536l.m120489i(str2, "dwAccountNo");
        this.f75213a = bigDecimal;
        this.f75214b = bigDecimal2;
        this.f75215c = bigDecimal3;
        this.f75216d = bigDecimal4;
        this.f75217e = bigDecimal5;
        this.f75218f = bigDecimal6;
        this.f75219g = str;
        this.f75220h = str2;
    }

    /* renamed from: a */
    public final BigDecimal mo69801a() {
        return this.f75218f;
    }

    /* renamed from: b */
    public final BigDecimal mo69802b() {
        return this.f75215c;
    }

    /* renamed from: c */
    public final BigDecimal mo69803c() {
        return this.f75214b;
    }

    /* renamed from: d */
    public final String mo69804d() {
        return this.f75220h;
    }

    /* renamed from: e */
    public final BigDecimal mo69805e() {
        return this.f75213a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29751i)) {
            return false;
        }
        C29751i iVar = (C29751i) obj;
        return C41536l.m120484d(this.f75213a, iVar.f75213a) && C41536l.m120484d(this.f75214b, iVar.f75214b) && C41536l.m120484d(this.f75215c, iVar.f75215c) && C41536l.m120484d(this.f75216d, iVar.f75216d) && C41536l.m120484d(this.f75217e, iVar.f75217e) && C41536l.m120484d(this.f75218f, iVar.f75218f) && C41536l.m120484d(this.f75219g, iVar.f75219g) && C41536l.m120484d(this.f75220h, iVar.f75220h);
    }

    /* renamed from: f */
    public final String mo69807f() {
        return this.f75219g;
    }

    /* renamed from: g */
    public final BigDecimal mo69808g() {
        return this.f75217e;
    }

    /* renamed from: h */
    public final BigDecimal mo69809h() {
        return this.f75216d;
    }

    public int hashCode() {
        return (((((((((((((this.f75213a.hashCode() * 31) + this.f75214b.hashCode()) * 31) + this.f75215c.hashCode()) * 31) + this.f75216d.hashCode()) * 31) + this.f75217e.hashCode()) * 31) + this.f75218f.hashCode()) * 31) + this.f75219g.hashCode()) * 31) + this.f75220h.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f75213a;
        BigDecimal bigDecimal2 = this.f75214b;
        BigDecimal bigDecimal3 = this.f75215c;
        BigDecimal bigDecimal4 = this.f75216d;
        BigDecimal bigDecimal5 = this.f75217e;
        BigDecimal bigDecimal6 = this.f75218f;
        String str = this.f75219g;
        String str2 = this.f75220h;
        return "PortfolioOverview(equityValue=" + bigDecimal + ", dailyProfitValue=" + bigDecimal2 + ", dailyProfitPercent=" + bigDecimal3 + ", totalProfitValue=" + bigDecimal4 + ", totalProfitPercent=" + bigDecimal5 + ", cashAvailableForTrade=" + bigDecimal6 + ", regDate=" + str + ", dwAccountNo=" + str2 + ")";
    }
}
