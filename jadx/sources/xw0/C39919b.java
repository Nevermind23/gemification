package xw0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: xw0.b */
public final class C39919b {
    @C8664c("A")

    /* renamed from: a */
    private final boolean f94673a;
    @C8664c("B")

    /* renamed from: b */
    private final boolean f94674b;
    @C8664c("C")

    /* renamed from: c */
    private final long f94675c;
    @C8664c("D")

    /* renamed from: d */
    private final String f94676d;
    @C8664c("E")

    /* renamed from: e */
    private final String f94677e;
    @C8664c("F")

    /* renamed from: f */
    private final String f94678f;
    @C8664c("G")

    /* renamed from: g */
    private final String f94679g;
    @C8664c("H")

    /* renamed from: h */
    private final String f94680h;
    @C8664c("I")

    /* renamed from: i */
    private final String f94681i;
    @C8664c("J")

    /* renamed from: j */
    private final String f94682j;
    @C8664c("K")

    /* renamed from: k */
    private final String f94683k;
    @C8664c("L")

    /* renamed from: l */
    private final Integer f94684l;
    @C8664c("M")

    /* renamed from: m */
    private final String f94685m;
    @C8664c("N")

    /* renamed from: n */
    private final Double f94686n;
    @C8664c("O")

    /* renamed from: o */
    private final boolean f94687o;
    @C8664c("P")

    /* renamed from: p */
    private final boolean f94688p;
    @C8664c("Q")

    /* renamed from: q */
    private final boolean f94689q;
    @C8664c("R")

    /* renamed from: r */
    private final String f94690r;
    @C8664c("S")

    /* renamed from: s */
    private final String f94691s;
    @C8664c("T")

    /* renamed from: t */
    private final String f94692t;
    @C8664c("U")

    /* renamed from: u */
    private final String f94693u;
    @C8664c("V")

    /* renamed from: v */
    private final Boolean f94694v;
    @C8664c("W")

    /* renamed from: w */
    private final String f94695w;
    @C8664c("X")

    /* renamed from: x */
    private final Boolean f94696x;
    @C8664c("W")

    /* renamed from: y */
    private final String f94697y;

    public C39919b(boolean z, boolean z2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, Double d, boolean z3, boolean z4, boolean z5, String str10, String str11, String str12, String str13, Boolean bool, String str14, Boolean bool2, String str15) {
        String str16 = str7;
        String str17 = str8;
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str3, "serviceType");
        C41536l.m120489i(str16, "serviceName");
        C41536l.m120489i(str17, "channel");
        this.f94673a = z;
        this.f94674b = z2;
        this.f94675c = j;
        this.f94676d = str;
        this.f94677e = str2;
        this.f94678f = str3;
        this.f94679g = str4;
        this.f94680h = str5;
        this.f94681i = str6;
        this.f94682j = str16;
        this.f94683k = str17;
        this.f94684l = num;
        this.f94685m = str9;
        this.f94686n = d;
        this.f94687o = z3;
        this.f94688p = z4;
        this.f94689q = z5;
        this.f94690r = str10;
        this.f94691s = str11;
        this.f94692t = str12;
        this.f94693u = str13;
        this.f94694v = bool;
        this.f94695w = str14;
        this.f94696x = bool2;
        this.f94697y = str15;
    }

    /* renamed from: a */
    public final String mo93616a() {
        return this.f94690r;
    }

    /* renamed from: b */
    public final String mo93617b() {
        return this.f94691s;
    }

    /* renamed from: c */
    public final String mo93618c() {
        return this.f94692t;
    }

    /* renamed from: d */
    public final String mo93619d() {
        return this.f94693u;
    }

    /* renamed from: e */
    public final String mo93620e() {
        return this.f94683k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39919b)) {
            return false;
        }
        C39919b bVar = (C39919b) obj;
        return this.f94673a == bVar.f94673a && this.f94674b == bVar.f94674b && this.f94675c == bVar.f94675c && C41536l.m120484d(this.f94676d, bVar.f94676d) && C41536l.m120484d(this.f94677e, bVar.f94677e) && C41536l.m120484d(this.f94678f, bVar.f94678f) && C41536l.m120484d(this.f94679g, bVar.f94679g) && C41536l.m120484d(this.f94680h, bVar.f94680h) && C41536l.m120484d(this.f94681i, bVar.f94681i) && C41536l.m120484d(this.f94682j, bVar.f94682j) && C41536l.m120484d(this.f94683k, bVar.f94683k) && C41536l.m120484d(this.f94684l, bVar.f94684l) && C41536l.m120484d(this.f94685m, bVar.f94685m) && C41536l.m120484d(this.f94686n, bVar.f94686n) && this.f94687o == bVar.f94687o && this.f94688p == bVar.f94688p && this.f94689q == bVar.f94689q && C41536l.m120484d(this.f94690r, bVar.f94690r) && C41536l.m120484d(this.f94691s, bVar.f94691s) && C41536l.m120484d(this.f94692t, bVar.f94692t) && C41536l.m120484d(this.f94693u, bVar.f94693u) && C41536l.m120484d(this.f94694v, bVar.f94694v) && C41536l.m120484d(this.f94695w, bVar.f94695w) && C41536l.m120484d(this.f94696x, bVar.f94696x) && C41536l.m120484d(this.f94697y, bVar.f94697y);
    }

    /* renamed from: f */
    public final String mo93622f() {
        return this.f94680h;
    }

    /* renamed from: g */
    public final Boolean mo93623g() {
        return this.f94696x;
    }

    /* renamed from: h */
    public final String mo93624h() {
        return this.f94679g;
    }

    public int hashCode() {
        boolean z = this.f94673a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f94674b;
        if (z3) {
            z3 = true;
        }
        int a = (((((i + (z3 ? 1 : 0)) * 31) + C7397t.m28148a(this.f94675c)) * 31) + this.f94676d.hashCode()) * 31;
        String str = this.f94677e;
        int i2 = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f94678f.hashCode()) * 31;
        String str2 = this.f94679g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94680h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94681i;
        int hashCode4 = (((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f94682j.hashCode()) * 31) + this.f94683k.hashCode()) * 31;
        Integer num = this.f94684l;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f94685m;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.f94686n;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        boolean z4 = this.f94687o;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode7 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f94688p;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f94689q;
        if (!z6) {
            z2 = z6;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        String str6 = this.f94690r;
        int hashCode8 = (i5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f94691s;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f94692t;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f94693u;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.f94694v;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.f94695w;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.f94696x;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str11 = this.f94697y;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode14 + i2;
    }

    /* renamed from: i */
    public final boolean mo93626i() {
        return this.f94689q;
    }

    /* renamed from: j */
    public final long mo93627j() {
        return this.f94675c;
    }

    /* renamed from: k */
    public final String mo93628k() {
        return this.f94685m;
    }

    /* renamed from: l */
    public final String mo93629l() {
        return this.f94695w;
    }

    /* renamed from: m */
    public final Integer mo93630m() {
        return this.f94684l;
    }

    /* renamed from: n */
    public final Double mo93631n() {
        return this.f94686n;
    }

    /* renamed from: o */
    public final String mo93632o() {
        return this.f94677e;
    }

    /* renamed from: p */
    public final String mo93633p() {
        return this.f94697y;
    }

    /* renamed from: q */
    public final String mo93634q() {
        return this.f94681i;
    }

    /* renamed from: r */
    public final String mo93635r() {
        return this.f94676d;
    }

    /* renamed from: s */
    public final String mo93636s() {
        return this.f94682j;
    }

    /* renamed from: t */
    public final String mo93637t() {
        return this.f94678f;
    }

    public String toString() {
        boolean z = this.f94673a;
        boolean z2 = this.f94674b;
        long j = this.f94675c;
        String str = this.f94676d;
        String str2 = this.f94677e;
        String str3 = this.f94678f;
        String str4 = this.f94679g;
        String str5 = this.f94680h;
        String str6 = this.f94681i;
        String str7 = this.f94682j;
        String str8 = this.f94683k;
        Integer num = this.f94684l;
        String str9 = this.f94685m;
        Double d = this.f94686n;
        boolean z3 = this.f94687o;
        boolean z4 = this.f94688p;
        boolean z5 = this.f94689q;
        String str10 = this.f94690r;
        String str11 = this.f94691s;
        String str12 = this.f94692t;
        String str13 = this.f94693u;
        Boolean bool = this.f94694v;
        String str14 = this.f94695w;
        Boolean bool2 = this.f94696x;
        String str15 = this.f94697y;
        return "PaymentConfigLocalModel(isDDAllowed=" + z + ", templateAllowed=" + z2 + ", id=" + j + ", serviceId=" + str + ", paymentServiceId=" + str2 + ", serviceType=" + str3 + ", debtServiceId=" + str4 + ", commission=" + str5 + ", serviceCategory=" + str6 + ", serviceName=" + str7 + ", channel=" + str8 + ", orderingNumber=" + num + ", logo=" + str9 + ", payAmountLimit=" + d + ", isTemplateAccessAllowed=" + z3 + ", isCarTemplateAllowed=" + z4 + ", hasDebt=" + z5 + ", additionalData=" + str10 + ", bonusProductTypes=" + str11 + ", categoryColor=" + str12 + ", categoryIconColor=" + str13 + ", isPopular=" + bool + ", oldLogo=" + str14 + ", ddEnabled=" + bool2 + ", searchKeysDictionaryKey=" + str15 + ")";
    }

    /* renamed from: u */
    public final boolean mo93639u() {
        return this.f94674b;
    }

    /* renamed from: v */
    public final boolean mo93640v() {
        return this.f94688p;
    }

    /* renamed from: w */
    public final boolean mo93641w() {
        return this.f94673a;
    }

    /* renamed from: x */
    public final Boolean mo93642x() {
        return this.f94694v;
    }

    /* renamed from: y */
    public final boolean mo93643y() {
        return this.f94687o;
    }
}
