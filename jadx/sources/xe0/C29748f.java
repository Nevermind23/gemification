package xe0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.f */
public final class C29748f {

    /* renamed from: a */
    private final String f75196a;

    /* renamed from: b */
    private final String f75197b;

    /* renamed from: c */
    private final String f75198c;

    /* renamed from: d */
    private final String f75199d;

    /* renamed from: e */
    private final BigDecimal f75200e;

    /* renamed from: f */
    private final BigDecimal f75201f;

    /* renamed from: g */
    private final BigDecimal f75202g;

    /* renamed from: h */
    private final BigDecimal f75203h;

    /* renamed from: i */
    private final BigDecimal f75204i;

    /* renamed from: j */
    private final String f75205j;

    public C29748f(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str5) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str4, "price");
        C41536l.m120489i(bigDecimal, "openQty");
        C41536l.m120489i(bigDecimal2, "dailyChangeValue");
        C41536l.m120489i(bigDecimal3, "dailyChangePercent");
        C41536l.m120489i(bigDecimal4, "totalChangeValue");
        C41536l.m120489i(bigDecimal5, "totalChangePercent");
        this.f75196a = str;
        this.f75197b = str2;
        this.f75198c = str3;
        this.f75199d = str4;
        this.f75200e = bigDecimal;
        this.f75201f = bigDecimal2;
        this.f75202g = bigDecimal3;
        this.f75203h = bigDecimal4;
        this.f75204i = bigDecimal5;
        this.f75205j = str5;
    }

    /* renamed from: a */
    public final BigDecimal mo69783a() {
        return this.f75202g;
    }

    /* renamed from: b */
    public final BigDecimal mo69784b() {
        return this.f75201f;
    }

    /* renamed from: c */
    public final String mo69785c() {
        return this.f75205j;
    }

    /* renamed from: d */
    public final BigDecimal mo69786d() {
        return this.f75200e;
    }

    /* renamed from: e */
    public final String mo69787e() {
        return this.f75199d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29748f)) {
            return false;
        }
        C29748f fVar = (C29748f) obj;
        return C41536l.m120484d(this.f75196a, fVar.f75196a) && C41536l.m120484d(this.f75197b, fVar.f75197b) && C41536l.m120484d(this.f75198c, fVar.f75198c) && C41536l.m120484d(this.f75199d, fVar.f75199d) && C41536l.m120484d(this.f75200e, fVar.f75200e) && C41536l.m120484d(this.f75201f, fVar.f75201f) && C41536l.m120484d(this.f75202g, fVar.f75202g) && C41536l.m120484d(this.f75203h, fVar.f75203h) && C41536l.m120484d(this.f75204i, fVar.f75204i) && C41536l.m120484d(this.f75205j, fVar.f75205j);
    }

    /* renamed from: f */
    public final String mo69789f() {
        return this.f75197b;
    }

    /* renamed from: g */
    public final String mo69790g() {
        return this.f75196a;
    }

    /* renamed from: h */
    public final BigDecimal mo69791h() {
        return this.f75204i;
    }

    public int hashCode() {
        int hashCode = this.f75196a.hashCode() * 31;
        String str = this.f75197b;
        int i = 0;
        int hashCode2 = (((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f75198c.hashCode()) * 31) + this.f75199d.hashCode()) * 31) + this.f75200e.hashCode()) * 31) + this.f75201f.hashCode()) * 31) + this.f75202g.hashCode()) * 31) + this.f75203h.hashCode()) * 31) + this.f75204i.hashCode()) * 31;
        String str2 = this.f75205j;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final BigDecimal mo69793i() {
        return this.f75203h;
    }

    public String toString() {
        String str = this.f75196a;
        String str2 = this.f75197b;
        String str3 = this.f75198c;
        String str4 = this.f75199d;
        BigDecimal bigDecimal = this.f75200e;
        BigDecimal bigDecimal2 = this.f75201f;
        BigDecimal bigDecimal3 = this.f75202g;
        BigDecimal bigDecimal4 = this.f75203h;
        BigDecimal bigDecimal5 = this.f75204i;
        String str5 = this.f75205j;
        return "ClientSymbol(symbol=" + str + ", securityName=" + str2 + ", ccy=" + str3 + ", price=" + str4 + ", openQty=" + bigDecimal + ", dailyChangeValue=" + bigDecimal2 + ", dailyChangePercent=" + bigDecimal3 + ", totalChangeValue=" + bigDecimal4 + ", totalChangePercent=" + bigDecimal5 + ", imageUrl=" + str5 + ")";
    }
}
