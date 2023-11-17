package tr0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: tr0.g */
public final class C38786g {

    /* renamed from: a */
    private final BigDecimal f92777a;

    /* renamed from: b */
    private final String f92778b;

    /* renamed from: c */
    private final Long f92779c;

    /* renamed from: d */
    private final String f92780d;

    /* renamed from: e */
    private final String f92781e;

    /* renamed from: f */
    private final String f92782f;

    /* renamed from: g */
    private final String f92783g;

    public C38786g(BigDecimal bigDecimal, String str, Long l, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f92777a = bigDecimal;
        this.f92778b = str;
        this.f92779c = l;
        this.f92780d = str2;
        this.f92781e = str3;
        this.f92782f = str4;
        this.f92783g = str5;
    }

    /* renamed from: a */
    public final BigDecimal mo92444a() {
        return this.f92777a;
    }

    /* renamed from: b */
    public final String mo92445b() {
        return this.f92778b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38786g)) {
            return false;
        }
        C38786g gVar = (C38786g) obj;
        return C41536l.m120484d(this.f92777a, gVar.f92777a) && C41536l.m120484d(this.f92778b, gVar.f92778b) && C41536l.m120484d(this.f92779c, gVar.f92779c) && C41536l.m120484d(this.f92780d, gVar.f92780d) && C41536l.m120484d(this.f92781e, gVar.f92781e) && C41536l.m120484d(this.f92782f, gVar.f92782f) && C41536l.m120484d(this.f92783g, gVar.f92783g);
    }

    public int hashCode() {
        int hashCode = ((this.f92777a.hashCode() * 31) + this.f92778b.hashCode()) * 31;
        Long l = this.f92779c;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f92780d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92781e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92782f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f92783g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f92777a;
        String str = this.f92778b;
        Long l = this.f92779c;
        String str2 = this.f92780d;
        String str3 = this.f92781e;
        String str4 = this.f92782f;
        String str5 = this.f92783g;
        return "LoanPlnHistorySummary(amount=" + bigDecimal + ", ccy=" + str + ", operDate=" + l + ", operType=" + str2 + ", operTypeDictionaryKey=" + str3 + ", operTypeDictionaryValue=" + str4 + ", productDictionaryKey=" + str5 + ")";
    }
}
