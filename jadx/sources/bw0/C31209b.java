package bw0;

import j31.C36725a;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: bw0.b */
public final class C31209b {

    /* renamed from: a */
    private final long f77551a;

    /* renamed from: b */
    private final String f77552b;

    /* renamed from: c */
    private final String f77553c;

    /* renamed from: d */
    private final String f77554d;

    /* renamed from: e */
    private final String f77555e;

    /* renamed from: f */
    private final String f77556f;

    /* renamed from: g */
    private final long f77557g;

    /* renamed from: h */
    private final String f77558h;

    /* renamed from: i */
    private final long f77559i;

    /* renamed from: j */
    private final long f77560j;

    /* renamed from: k */
    private final String f77561k;

    /* renamed from: l */
    private final String f77562l;

    /* renamed from: m */
    private final String f77563m;

    /* renamed from: n */
    private final String f77564n;

    /* renamed from: o */
    private final double f77565o;

    /* renamed from: p */
    private final boolean f77566p;

    /* renamed from: q */
    private final String f77567q;

    /* renamed from: r */
    private final C36725a f77568r;

    /* renamed from: s */
    private final C36725a f77569s;

    public C31209b(long j, String str, String str2, String str3, String str4, String str5, long j2, String str6, long j3, long j4, String str7, String str8, String str9, String str10, double d, boolean z, String str11, C36725a aVar, C36725a aVar2) {
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str11;
        C36725a aVar3 = aVar;
        C36725a aVar4 = aVar2;
        C41536l.m120489i(str12, "cardClass");
        C41536l.m120489i(str13, "cardClassCode");
        C41536l.m120489i(str14, "cardType");
        C41536l.m120489i(str15, "productCode");
        C41536l.m120489i(str16, "subProductCode");
        C41536l.m120489i(str17, "lastFour");
        C41536l.m120489i(str18, "acctNo");
        C41536l.m120489i(str19, "ccy");
        C41536l.m120489i(str20, "pan2");
        C41536l.m120489i(str21, "name");
        C41536l.m120489i(aVar3, "cardImage");
        C41536l.m120489i(aVar4, "cardSmallImage");
        this.f77551a = j;
        this.f77552b = str12;
        this.f77553c = str13;
        this.f77554d = str14;
        this.f77555e = str15;
        this.f77556f = str16;
        this.f77557g = j2;
        this.f77558h = str17;
        this.f77559i = j3;
        this.f77560j = j4;
        this.f77561k = str18;
        this.f77562l = str19;
        this.f77563m = str20;
        this.f77564n = str10;
        this.f77565o = d;
        this.f77566p = z;
        this.f77567q = str21;
        this.f77568r = aVar3;
        this.f77569s = aVar4;
    }

    /* renamed from: a */
    public final long mo71432a() {
        return this.f77560j;
    }

    /* renamed from: b */
    public final String mo71433b() {
        return this.f77561k;
    }

    /* renamed from: c */
    public final double mo71434c() {
        return this.f77565o;
    }

    /* renamed from: d */
    public final long mo71435d() {
        return this.f77551a;
    }

    /* renamed from: e */
    public final C36725a mo71436e() {
        return this.f77568r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31209b)) {
            return false;
        }
        C31209b bVar = (C31209b) obj;
        return this.f77551a == bVar.f77551a && C41536l.m120484d(this.f77552b, bVar.f77552b) && C41536l.m120484d(this.f77553c, bVar.f77553c) && C41536l.m120484d(this.f77554d, bVar.f77554d) && C41536l.m120484d(this.f77555e, bVar.f77555e) && C41536l.m120484d(this.f77556f, bVar.f77556f) && this.f77557g == bVar.f77557g && C41536l.m120484d(this.f77558h, bVar.f77558h) && this.f77559i == bVar.f77559i && this.f77560j == bVar.f77560j && C41536l.m120484d(this.f77561k, bVar.f77561k) && C41536l.m120484d(this.f77562l, bVar.f77562l) && C41536l.m120484d(this.f77563m, bVar.f77563m) && C41536l.m120484d(this.f77564n, bVar.f77564n) && Double.compare(this.f77565o, bVar.f77565o) == 0 && this.f77566p == bVar.f77566p && C41536l.m120484d(this.f77567q, bVar.f77567q) && C41536l.m120484d(this.f77568r, bVar.f77568r) && C41536l.m120484d(this.f77569s, bVar.f77569s);
    }

    /* renamed from: f */
    public final C36725a mo71438f() {
        return this.f77569s;
    }

    /* renamed from: g */
    public final String mo71439g() {
        return this.f77554d;
    }

    /* renamed from: h */
    public final String mo71440h() {
        return this.f77562l;
    }

    public int hashCode() {
        int a = ((((((((((((((((((((((((C7397t.m28148a(this.f77551a) * 31) + this.f77552b.hashCode()) * 31) + this.f77553c.hashCode()) * 31) + this.f77554d.hashCode()) * 31) + this.f77555e.hashCode()) * 31) + this.f77556f.hashCode()) * 31) + C7397t.m28148a(this.f77557g)) * 31) + this.f77558h.hashCode()) * 31) + C7397t.m28148a(this.f77559i)) * 31) + C7397t.m28148a(this.f77560j)) * 31) + this.f77561k.hashCode()) * 31) + this.f77562l.hashCode()) * 31) + this.f77563m.hashCode()) * 31;
        String str = this.f77564n;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.f77565o)) * 31;
        boolean z = this.f77566p;
        if (z) {
            z = true;
        }
        return ((((((hashCode + (z ? 1 : 0)) * 31) + this.f77567q.hashCode()) * 31) + this.f77568r.hashCode()) * 31) + this.f77569s.hashCode();
    }

    /* renamed from: i */
    public final long mo71442i() {
        return this.f77559i;
    }

    /* renamed from: j */
    public final String mo71443j() {
        return this.f77558h;
    }

    /* renamed from: k */
    public final String mo71444k() {
        return this.f77567q;
    }

    /* renamed from: l */
    public final boolean mo71445l() {
        return this.f77566p;
    }

    public String toString() {
        long j = this.f77551a;
        String str = this.f77552b;
        String str2 = this.f77553c;
        String str3 = this.f77554d;
        String str4 = this.f77555e;
        String str5 = this.f77556f;
        long j2 = this.f77557g;
        String str6 = this.f77558h;
        long j3 = this.f77559i;
        long j4 = this.f77560j;
        String str7 = this.f77561k;
        String str8 = this.f77562l;
        String str9 = this.f77563m;
        String str10 = this.f77564n;
        long j5 = j4;
        double d = this.f77565o;
        boolean z = this.f77566p;
        String str11 = this.f77567q;
        C36725a aVar = this.f77568r;
        C36725a aVar2 = this.f77569s;
        return "Card(cardId=" + j + ", cardClass=" + str + ", cardClassCode=" + str2 + ", cardType=" + str3 + ", productCode=" + str4 + ", subProductCode=" + str5 + ", clientKey=" + j2 + ", lastFour=" + str6 + ", expDate=" + j3 + ", acctKey=" + j5 + ", acctNo=" + str7 + ", ccy=" + str8 + ", pan2=" + str9 + ", cardName=" + str10 + ", availableAmountBaseCcy=" + d + ", isDefault=" + z + ", name=" + str11 + ", cardImage=" + aVar + ", cardSmallImage=" + aVar2 + ")";
    }
}
