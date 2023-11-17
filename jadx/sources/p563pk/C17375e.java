package p563pk;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: pk.e */
public final class C17375e {

    /* renamed from: a */
    private final long f48724a;

    /* renamed from: b */
    private final String f48725b;

    /* renamed from: c */
    private final String f48726c;

    /* renamed from: d */
    private final String f48727d;

    /* renamed from: e */
    private final String f48728e;

    /* renamed from: f */
    private final long f48729f;

    /* renamed from: g */
    private final String f48730g;

    /* renamed from: h */
    private final long f48731h;

    /* renamed from: i */
    private final String f48732i;

    /* renamed from: j */
    private final long f48733j;

    /* renamed from: k */
    private final String f48734k;

    /* renamed from: l */
    private final String f48735l;

    /* renamed from: m */
    private final String f48736m;

    /* renamed from: n */
    private final double f48737n;

    /* renamed from: o */
    private final double f48738o;

    /* renamed from: p */
    private final boolean f48739p;

    /* renamed from: q */
    private final boolean f48740q;

    /* renamed from: r */
    private final String f48741r;

    /* renamed from: s */
    private final String f48742s;

    /* renamed from: t */
    private final String f48743t;

    /* renamed from: u */
    private final String f48744u;

    /* renamed from: v */
    private final C17376f f48745v;

    /* renamed from: w */
    private final C17376f f48746w;

    public C17375e(long j, String str, String str2, String str3, String str4, long j2, String str5, long j3, String str6, long j4, String str7, String str8, String str9, double d, double d2, boolean z, boolean z2, String str10, String str11, String str12, String str13, C17376f fVar, C17376f fVar2) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        C17376f fVar3 = fVar;
        C17376f fVar4 = fVar2;
        C41536l.m120489i(str14, "cardClass");
        C41536l.m120489i(str15, "cardType");
        C41536l.m120489i(str16, "productCode");
        C41536l.m120489i(str17, "subProductCode");
        C41536l.m120489i(str18, "lastFour");
        C41536l.m120489i(str19, "mainCur");
        C41536l.m120489i(str20, "ccy");
        C41536l.m120489i(str21, "pan2");
        C41536l.m120489i(fVar3, "cardImage");
        C41536l.m120489i(fVar4, "cardSmallImage");
        this.f48724a = j;
        this.f48725b = str14;
        this.f48726c = str15;
        this.f48727d = str16;
        this.f48728e = str17;
        this.f48729f = j2;
        this.f48730g = str18;
        this.f48731h = j3;
        this.f48732i = str19;
        this.f48733j = j4;
        this.f48734k = str20;
        this.f48735l = str21;
        this.f48736m = str9;
        this.f48737n = d;
        this.f48738o = d2;
        this.f48739p = z;
        this.f48740q = z2;
        this.f48741r = str10;
        this.f48742s = str11;
        this.f48743t = str12;
        this.f48744u = str13;
        this.f48745v = fVar3;
        this.f48746w = fVar4;
    }

    /* renamed from: a */
    public final long mo44835a() {
        return this.f48733j;
    }

    /* renamed from: b */
    public final double mo44836b() {
        return this.f48737n;
    }

    /* renamed from: c */
    public final String mo44837c() {
        return this.f48725b;
    }

    /* renamed from: d */
    public final long mo44838d() {
        return this.f48724a;
    }

    /* renamed from: e */
    public final C17376f mo44839e() {
        return this.f48745v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17375e)) {
            return false;
        }
        C17375e eVar = (C17375e) obj;
        return this.f48724a == eVar.f48724a && C41536l.m120484d(this.f48725b, eVar.f48725b) && C41536l.m120484d(this.f48726c, eVar.f48726c) && C41536l.m120484d(this.f48727d, eVar.f48727d) && C41536l.m120484d(this.f48728e, eVar.f48728e) && this.f48729f == eVar.f48729f && C41536l.m120484d(this.f48730g, eVar.f48730g) && this.f48731h == eVar.f48731h && C41536l.m120484d(this.f48732i, eVar.f48732i) && this.f48733j == eVar.f48733j && C41536l.m120484d(this.f48734k, eVar.f48734k) && C41536l.m120484d(this.f48735l, eVar.f48735l) && C41536l.m120484d(this.f48736m, eVar.f48736m) && Double.compare(this.f48737n, eVar.f48737n) == 0 && Double.compare(this.f48738o, eVar.f48738o) == 0 && this.f48739p == eVar.f48739p && this.f48740q == eVar.f48740q && C41536l.m120484d(this.f48741r, eVar.f48741r) && C41536l.m120484d(this.f48742s, eVar.f48742s) && C41536l.m120484d(this.f48743t, eVar.f48743t) && C41536l.m120484d(this.f48744u, eVar.f48744u) && C41536l.m120484d(this.f48745v, eVar.f48745v) && C41536l.m120484d(this.f48746w, eVar.f48746w);
    }

    /* renamed from: f */
    public final String mo44841f() {
        return this.f48736m;
    }

    /* renamed from: g */
    public final C17376f mo44842g() {
        return this.f48746w;
    }

    /* renamed from: h */
    public final String mo44843h() {
        return this.f48734k;
    }

    public int hashCode() {
        int a = ((((((((((((((((((((((C7397t.m28148a(this.f48724a) * 31) + this.f48725b.hashCode()) * 31) + this.f48726c.hashCode()) * 31) + this.f48727d.hashCode()) * 31) + this.f48728e.hashCode()) * 31) + C7397t.m28148a(this.f48729f)) * 31) + this.f48730g.hashCode()) * 31) + C7397t.m28148a(this.f48731h)) * 31) + this.f48732i.hashCode()) * 31) + C7397t.m28148a(this.f48733j)) * 31) + this.f48734k.hashCode()) * 31) + this.f48735l.hashCode()) * 31;
        String str = this.f48736m;
        int i = 0;
        int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.f48737n)) * 31) + Double.doubleToLongBits(this.f48738o)) * 31;
        boolean z = this.f48739p;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f48740q;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str2 = this.f48741r;
        int hashCode2 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48742s;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48743t;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f48744u;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((hashCode4 + i) * 31) + this.f48745v.hashCode()) * 31) + this.f48746w.hashCode();
    }

    /* renamed from: i */
    public final long mo44845i() {
        return this.f48731h;
    }

    /* renamed from: j */
    public final String mo44846j() {
        return this.f48735l;
    }

    /* renamed from: k */
    public final boolean mo44847k() {
        return this.f48739p;
    }

    public String toString() {
        long j = this.f48724a;
        String str = this.f48725b;
        String str2 = this.f48726c;
        String str3 = this.f48727d;
        String str4 = this.f48728e;
        long j2 = this.f48729f;
        String str5 = this.f48730g;
        long j3 = this.f48731h;
        String str6 = this.f48732i;
        long j4 = this.f48733j;
        String str7 = this.f48734k;
        String str8 = this.f48735l;
        String str9 = this.f48736m;
        long j5 = j4;
        double d = this.f48737n;
        double d2 = this.f48738o;
        boolean z = this.f48739p;
        boolean z2 = this.f48740q;
        String str10 = this.f48741r;
        String str11 = this.f48742s;
        String str12 = this.f48743t;
        String str13 = this.f48744u;
        C17376f fVar = this.f48745v;
        C17376f fVar2 = this.f48746w;
        return "InsuranceCard(cardId=" + j + ", cardClass=" + str + ", cardType=" + str2 + ", productCode=" + str3 + ", subProductCode=" + str4 + ", clientKey=" + j2 + ", lastFour=" + str5 + ", expDate=" + j3 + ", mainCur=" + str6 + ", acctKey=" + j5 + ", ccy=" + str7 + ", pan2=" + str8 + ", cardName=" + str9 + ", availableAmount=" + d + ", availableAmountBaseCcy=" + d2 + ", isDefault=" + z + ", isHidden=" + z2 + ", extMerchantId=" + str10 + ", isLocalCard=" + str11 + ", cardData=" + str12 + ", paymentCardType=" + str13 + ", cardImage=" + fVar + ", cardSmallImage=" + fVar2 + ")";
    }
}
