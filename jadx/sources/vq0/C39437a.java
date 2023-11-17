package vq0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: vq0.a */
public final class C39437a {

    /* renamed from: a */
    private final String f93651a;

    /* renamed from: b */
    private final String f93652b;

    /* renamed from: c */
    private final String f93653c;

    /* renamed from: d */
    private final String f93654d;

    /* renamed from: e */
    private final BigDecimal f93655e;

    /* renamed from: f */
    private final String f93656f;

    /* renamed from: g */
    private final String f93657g;

    /* renamed from: h */
    private final int f93658h;

    public C39437a(String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, String str6, int i) {
        C41536l.m120489i(str, "limitId");
        C41536l.m120489i(str2, "operationType");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str5, "ccy");
        C41536l.m120489i(str6, "effectiveRate");
        this.f93651a = str;
        this.f93652b = str2;
        this.f93653c = str3;
        this.f93654d = str4;
        this.f93655e = bigDecimal;
        this.f93656f = str5;
        this.f93657g = str6;
        this.f93658h = i;
    }

    /* renamed from: a */
    public final BigDecimal mo93063a() {
        return this.f93655e;
    }

    /* renamed from: b */
    public final String mo93064b() {
        return this.f93656f;
    }

    /* renamed from: c */
    public final String mo93065c() {
        return this.f93654d;
    }

    /* renamed from: d */
    public final String mo93066d() {
        return this.f93657g;
    }

    /* renamed from: e */
    public final int mo93067e() {
        return this.f93658h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39437a)) {
            return false;
        }
        C39437a aVar = (C39437a) obj;
        return C41536l.m120484d(this.f93651a, aVar.f93651a) && C41536l.m120484d(this.f93652b, aVar.f93652b) && C41536l.m120484d(this.f93653c, aVar.f93653c) && C41536l.m120484d(this.f93654d, aVar.f93654d) && C41536l.m120484d(this.f93655e, aVar.f93655e) && C41536l.m120484d(this.f93656f, aVar.f93656f) && C41536l.m120484d(this.f93657g, aVar.f93657g) && this.f93658h == aVar.f93658h;
    }

    /* renamed from: f */
    public final String mo93069f() {
        return this.f93652b;
    }

    /* renamed from: g */
    public final String mo93070g() {
        return this.f93653c;
    }

    public int hashCode() {
        int hashCode = ((this.f93651a.hashCode() * 31) + this.f93652b.hashCode()) * 31;
        String str = this.f93653c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93654d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((hashCode2 + i) * 31) + this.f93655e.hashCode()) * 31) + this.f93656f.hashCode()) * 31) + this.f93657g.hashCode()) * 31) + this.f93658h;
    }

    public String toString() {
        String str = this.f93651a;
        String str2 = this.f93652b;
        String str3 = this.f93653c;
        String str4 = this.f93654d;
        BigDecimal bigDecimal = this.f93655e;
        String str5 = this.f93656f;
        String str6 = this.f93657g;
        int i = this.f93658h;
        return "LoanSubtypeAdapterData(limitId=" + str + ", operationType=" + str2 + ", title=" + str3 + ", desc=" + str4 + ", amount=" + bigDecimal + ", ccy=" + str5 + ", effectiveRate=" + str6 + ", illustration=" + i + ")";
    }
}
