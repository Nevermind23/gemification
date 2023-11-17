package oy0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: oy0.h */
public final class C37842h {

    /* renamed from: a */
    private final long f90887a;

    /* renamed from: b */
    private final String f90888b;

    /* renamed from: c */
    private final long f90889c;

    /* renamed from: d */
    private final String f90890d;

    /* renamed from: e */
    private final String f90891e;

    /* renamed from: f */
    private final double f90892f;

    /* renamed from: g */
    private final double f90893g;

    /* renamed from: h */
    private final double f90894h;

    /* renamed from: i */
    private final double f90895i;

    /* renamed from: j */
    private final double f90896j;

    /* renamed from: k */
    private final String f90897k;

    /* renamed from: l */
    private final double f90898l;

    /* renamed from: m */
    private final String f90899m;

    public C37842h(long j, String str, long j2, String str2, String str3, double d, double d2, double d3, double d4, double d5, String str4, double d6, String str5) {
        String str6 = str5;
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "agreeNo");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str6, "dictionaryKey");
        this.f90887a = j;
        this.f90888b = str;
        this.f90889c = j2;
        this.f90890d = str2;
        this.f90891e = str3;
        this.f90892f = d;
        this.f90893g = d2;
        this.f90894h = d3;
        this.f90895i = d4;
        this.f90896j = d5;
        this.f90897k = str4;
        this.f90898l = d6;
        this.f90899m = str6;
    }

    /* renamed from: a */
    public final long mo91193a() {
        return this.f90887a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37842h)) {
            return false;
        }
        C37842h hVar = (C37842h) obj;
        return this.f90887a == hVar.f90887a && C41536l.m120484d(this.f90888b, hVar.f90888b) && this.f90889c == hVar.f90889c && C41536l.m120484d(this.f90890d, hVar.f90890d) && C41536l.m120484d(this.f90891e, hVar.f90891e) && Double.compare(this.f90892f, hVar.f90892f) == 0 && Double.compare(this.f90893g, hVar.f90893g) == 0 && Double.compare(this.f90894h, hVar.f90894h) == 0 && Double.compare(this.f90895i, hVar.f90895i) == 0 && Double.compare(this.f90896j, hVar.f90896j) == 0 && C41536l.m120484d(this.f90897k, hVar.f90897k) && Double.compare(this.f90898l, hVar.f90898l) == 0 && C41536l.m120484d(this.f90899m, hVar.f90899m);
    }

    public int hashCode() {
        int a = ((((((((((((((((((C7397t.m28148a(this.f90887a) * 31) + this.f90888b.hashCode()) * 31) + C7397t.m28148a(this.f90889c)) * 31) + this.f90890d.hashCode()) * 31) + this.f90891e.hashCode()) * 31) + Double.doubleToLongBits(this.f90892f)) * 31) + Double.doubleToLongBits(this.f90893g)) * 31) + Double.doubleToLongBits(this.f90894h)) * 31) + Double.doubleToLongBits(this.f90895i)) * 31) + Double.doubleToLongBits(this.f90896j)) * 31;
        String str = this.f90897k;
        return ((((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.f90898l)) * 31) + this.f90899m.hashCode();
    }

    public String toString() {
        long j = this.f90887a;
        String str = this.f90888b;
        long j2 = this.f90889c;
        String str2 = this.f90890d;
        String str3 = this.f90891e;
        double d = this.f90892f;
        double d2 = this.f90893g;
        double d3 = this.f90894h;
        double d4 = this.f90895i;
        double d5 = this.f90896j;
        String str4 = this.f90897k;
        double d6 = this.f90898l;
        String str5 = this.f90899m;
        return "DepositLoanAgreement(agreeKey=" + j + ", prodType=" + str + ", clientKeyMain=" + j2 + ", agreeNo=" + str2 + ", ccy=" + str3 + ", agreeRate=" + d + ", agreeBalance=" + d2 + ", realAmount=" + d3 + ", availableAmount=" + d4 + ", provAmount=" + d5 + ", name=" + str4 + ", intAccrued=" + d6 + ", dictionaryKey=" + str5 + ")";
    }
}
