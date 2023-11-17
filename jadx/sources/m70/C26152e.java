package m70;

import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.C41536l;

/* renamed from: m70.e */
public final class C26152e {

    /* renamed from: a */
    private final BigDecimal f66333a;

    /* renamed from: b */
    private final String f66334b;

    /* renamed from: c */
    private final double f66335c;

    /* renamed from: d */
    private final double f66336d;

    /* renamed from: e */
    private final String f66337e;

    /* renamed from: f */
    private final Date f66338f;

    /* renamed from: g */
    private final String f66339g;

    public C26152e(BigDecimal bigDecimal, String str, double d, double d2, String str2, Date date, String str3) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f66333a = bigDecimal;
        this.f66334b = str;
        this.f66335c = d;
        this.f66336d = d2;
        this.f66337e = str2;
        this.f66338f = date;
        this.f66339g = str3;
    }

    /* renamed from: a */
    public final BigDecimal mo65155a() {
        return this.f66333a;
    }

    /* renamed from: b */
    public final String mo65156b() {
        return this.f66334b;
    }

    /* renamed from: c */
    public final double mo65157c() {
        return this.f66335c;
    }

    /* renamed from: d */
    public final double mo65158d() {
        return this.f66336d;
    }

    /* renamed from: e */
    public final String mo65159e() {
        return this.f66337e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26152e)) {
            return false;
        }
        C26152e eVar = (C26152e) obj;
        return C41536l.m120484d(this.f66333a, eVar.f66333a) && C41536l.m120484d(this.f66334b, eVar.f66334b) && Double.compare(this.f66335c, eVar.f66335c) == 0 && Double.compare(this.f66336d, eVar.f66336d) == 0 && C41536l.m120484d(this.f66337e, eVar.f66337e) && C41536l.m120484d(this.f66338f, eVar.f66338f) && C41536l.m120484d(this.f66339g, eVar.f66339g);
    }

    /* renamed from: f */
    public final String mo65161f() {
        return this.f66339g;
    }

    /* renamed from: g */
    public final Date mo65162g() {
        return this.f66338f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66333a.hashCode() * 31) + this.f66334b.hashCode()) * 31) + Double.doubleToLongBits(this.f66335c)) * 31) + Double.doubleToLongBits(this.f66336d)) * 31;
        String str = this.f66337e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f66338f;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.f66339g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f66333a;
        String str = this.f66334b;
        double d = this.f66335c;
        double d2 = this.f66336d;
        String str2 = this.f66337e;
        Date date = this.f66338f;
        String str3 = this.f66339g;
        return "AccountStudDepInfo(amount=" + bigDecimal + ", ccy=" + str + ", intAccrued=" + d + ", intRate=" + d2 + ", intWithPeriodType=" + str2 + ", maturityDate=" + date + ", intWithPeriodTypeKey=" + str3 + ")";
    }
}
