package p863pw;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: pw.a */
public final class C27623a {

    /* renamed from: A */
    private final boolean f70562A;

    /* renamed from: B */
    private final boolean f70563B;

    /* renamed from: C */
    private final List f70564C;

    /* renamed from: D */
    private final String f70565D;

    /* renamed from: E */
    private final Long f70566E;

    /* renamed from: F */
    private final String f70567F;

    /* renamed from: G */
    private final C27626d f70568G;

    /* renamed from: a */
    private final long f70569a;

    /* renamed from: b */
    private final String f70570b;

    /* renamed from: c */
    private final String f70571c;

    /* renamed from: d */
    private final BigDecimal f70572d;

    /* renamed from: e */
    private final BigDecimal f70573e;

    /* renamed from: f */
    private final String f70574f;

    /* renamed from: g */
    private final int f70575g;

    /* renamed from: h */
    private final String f70576h;

    /* renamed from: i */
    private final String f70577i;

    /* renamed from: j */
    private final String f70578j;

    /* renamed from: k */
    private final String f70579k;

    /* renamed from: l */
    private final long f70580l;

    /* renamed from: m */
    private final String f70581m;

    /* renamed from: n */
    private final long f70582n;

    /* renamed from: o */
    private final boolean f70583o;

    /* renamed from: p */
    private final boolean f70584p;

    /* renamed from: q */
    private final Long f70585q;

    /* renamed from: r */
    private final BigDecimal f70586r;

    /* renamed from: s */
    private final boolean f70587s;

    /* renamed from: t */
    private final String f70588t;

    /* renamed from: u */
    private final boolean f70589u;

    /* renamed from: v */
    private final boolean f70590v;

    /* renamed from: w */
    private final boolean f70591w;

    /* renamed from: x */
    private final boolean f70592x;

    /* renamed from: y */
    private final boolean f70593y;

    /* renamed from: z */
    private final boolean f70594z;

    public C27623a(long j, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, int i, String str4, String str5, String str6, String str7, long j2, String str8, long j3, boolean z, boolean z2, Long l, BigDecimal bigDecimal3, boolean z3, String str9, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z12, boolean z13, List list, String str10, Long l2, String str11, C27626d dVar) {
        String str12 = str2;
        BigDecimal bigDecimal4 = bigDecimal;
        BigDecimal bigDecimal5 = bigDecimal2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str7;
        String str16 = str8;
        BigDecimal bigDecimal6 = bigDecimal3;
        String str17 = str9;
        List list2 = list;
        String str18 = str11;
        C41536l.m120489i(str12, "printAcctNo");
        C41536l.m120489i(bigDecimal4, "availableAmount");
        C41536l.m120489i(bigDecimal5, "amount");
        C41536l.m120489i(str13, "ccy");
        C41536l.m120489i(str14, "productCode");
        C41536l.m120489i(str15, "ccyType");
        C41536l.m120489i(str16, "productGroup");
        C41536l.m120489i(bigDecimal6, "overlimitAmountMc");
        C41536l.m120489i(str17, "isCardInactive");
        C41536l.m120489i(list2, "productFunctions");
        C41536l.m120489i(str18, "displayWarning");
        this.f70569a = j;
        this.f70570b = str;
        this.f70571c = str12;
        this.f70572d = bigDecimal4;
        this.f70573e = bigDecimal5;
        this.f70574f = str13;
        this.f70575g = i;
        this.f70576h = str14;
        this.f70577i = str5;
        this.f70578j = str6;
        this.f70579k = str15;
        this.f70580l = j2;
        this.f70581m = str16;
        this.f70582n = j3;
        this.f70583o = z;
        this.f70584p = z2;
        this.f70585q = l;
        this.f70586r = bigDecimal6;
        this.f70587s = z3;
        this.f70588t = str17;
        this.f70589u = z4;
        this.f70590v = z5;
        this.f70591w = z6;
        this.f70592x = z7;
        this.f70593y = z8;
        this.f70594z = z9;
        this.f70562A = z12;
        this.f70563B = z13;
        this.f70564C = list2;
        this.f70565D = str10;
        this.f70566E = l2;
        this.f70567F = str18;
        this.f70568G = dVar;
    }

    /* renamed from: a */
    public final C27626d mo67001a() {
        return this.f70568G;
    }

    /* renamed from: b */
    public final long mo67002b() {
        return this.f70569a;
    }

    /* renamed from: c */
    public final String mo67003c() {
        return this.f70570b;
    }

    /* renamed from: d */
    public final BigDecimal mo67004d() {
        return this.f70573e;
    }

    /* renamed from: e */
    public final String mo67005e() {
        return this.f70565D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27623a)) {
            return false;
        }
        C27623a aVar = (C27623a) obj;
        return this.f70569a == aVar.f70569a && C41536l.m120484d(this.f70570b, aVar.f70570b) && C41536l.m120484d(this.f70571c, aVar.f70571c) && C41536l.m120484d(this.f70572d, aVar.f70572d) && C41536l.m120484d(this.f70573e, aVar.f70573e) && C41536l.m120484d(this.f70574f, aVar.f70574f) && this.f70575g == aVar.f70575g && C41536l.m120484d(this.f70576h, aVar.f70576h) && C41536l.m120484d(this.f70577i, aVar.f70577i) && C41536l.m120484d(this.f70578j, aVar.f70578j) && C41536l.m120484d(this.f70579k, aVar.f70579k) && this.f70580l == aVar.f70580l && C41536l.m120484d(this.f70581m, aVar.f70581m) && this.f70582n == aVar.f70582n && this.f70583o == aVar.f70583o && this.f70584p == aVar.f70584p && C41536l.m120484d(this.f70585q, aVar.f70585q) && C41536l.m120484d(this.f70586r, aVar.f70586r) && this.f70587s == aVar.f70587s && C41536l.m120484d(this.f70588t, aVar.f70588t) && this.f70589u == aVar.f70589u && this.f70590v == aVar.f70590v && this.f70591w == aVar.f70591w && this.f70592x == aVar.f70592x && this.f70593y == aVar.f70593y && this.f70594z == aVar.f70594z && this.f70562A == aVar.f70562A && this.f70563B == aVar.f70563B && C41536l.m120484d(this.f70564C, aVar.f70564C) && C41536l.m120484d(this.f70565D, aVar.f70565D) && C41536l.m120484d(this.f70566E, aVar.f70566E) && C41536l.m120484d(this.f70567F, aVar.f70567F) && C41536l.m120484d(this.f70568G, aVar.f70568G);
    }

    /* renamed from: f */
    public final BigDecimal mo67007f() {
        return this.f70572d;
    }

    /* renamed from: g */
    public final String mo67008g() {
        return this.f70574f;
    }

    /* renamed from: h */
    public final String mo67009h() {
        return this.f70579k;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f70569a) * 31;
        String str = this.f70570b;
        int i = 0;
        int hashCode = (((((((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f70571c.hashCode()) * 31) + this.f70572d.hashCode()) * 31) + this.f70573e.hashCode()) * 31) + this.f70574f.hashCode()) * 31) + this.f70575g) * 31) + this.f70576h.hashCode()) * 31;
        String str2 = this.f70577i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70578j;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f70579k.hashCode()) * 31) + C7397t.m28148a(this.f70580l)) * 31) + this.f70581m.hashCode()) * 31) + C7397t.m28148a(this.f70582n)) * 31;
        boolean z = this.f70583o;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f70584p;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        Long l = this.f70585q;
        int hashCode4 = (((i3 + (l == null ? 0 : l.hashCode())) * 31) + this.f70586r.hashCode()) * 31;
        boolean z4 = this.f70587s;
        if (z4) {
            z4 = true;
        }
        int hashCode5 = (((hashCode4 + (z4 ? 1 : 0)) * 31) + this.f70588t.hashCode()) * 31;
        boolean z5 = this.f70589u;
        if (z5) {
            z5 = true;
        }
        int i4 = (hashCode5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f70590v;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f70591w;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.f70592x;
        if (z8) {
            z8 = true;
        }
        int i7 = (i6 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.f70593y;
        if (z9) {
            z9 = true;
        }
        int i8 = (i7 + (z9 ? 1 : 0)) * 31;
        boolean z12 = this.f70594z;
        if (z12) {
            z12 = true;
        }
        int i9 = (i8 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f70562A;
        if (z13) {
            z13 = true;
        }
        int i12 = (i9 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f70563B;
        if (!z14) {
            z2 = z14;
        }
        int hashCode6 = (((i12 + (z2 ? 1 : 0)) * 31) + this.f70564C.hashCode()) * 31;
        String str4 = this.f70565D;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f70566E;
        int hashCode8 = (((hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.f70567F.hashCode()) * 31;
        C27626d dVar = this.f70568G;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public final boolean mo67011i() {
        return this.f70589u;
    }

    /* renamed from: j */
    public final long mo67012j() {
        return this.f70580l;
    }

    /* renamed from: k */
    public final Long mo67013k() {
        return this.f70566E;
    }

    /* renamed from: l */
    public final String mo67014l() {
        return this.f70571c;
    }

    /* renamed from: m */
    public final String mo67015m() {
        return this.f70576h;
    }

    /* renamed from: n */
    public final String mo67016n() {
        return this.f70577i;
    }

    /* renamed from: o */
    public final List mo67017o() {
        return this.f70564C;
    }

    /* renamed from: p */
    public final String mo67018p() {
        return this.f70581m;
    }

    /* renamed from: q */
    public final long mo67019q() {
        return this.f70582n;
    }

    /* renamed from: r */
    public final boolean mo67020r() {
        return this.f70587s;
    }

    /* renamed from: s */
    public final boolean mo67021s() {
        return this.f70583o;
    }

    /* renamed from: t */
    public final boolean mo67022t() {
        return this.f70584p;
    }

    public String toString() {
        long j = this.f70569a;
        String str = this.f70570b;
        String str2 = this.f70571c;
        BigDecimal bigDecimal = this.f70572d;
        BigDecimal bigDecimal2 = this.f70573e;
        String str3 = this.f70574f;
        int i = this.f70575g;
        String str4 = this.f70576h;
        String str5 = this.f70577i;
        String str6 = this.f70578j;
        String str7 = this.f70579k;
        long j2 = this.f70580l;
        String str8 = this.f70581m;
        long j3 = j2;
        long j4 = this.f70582n;
        boolean z = this.f70583o;
        boolean z2 = this.f70584p;
        Long l = this.f70585q;
        BigDecimal bigDecimal3 = this.f70586r;
        boolean z3 = this.f70587s;
        String str9 = this.f70588t;
        boolean z4 = this.f70589u;
        boolean z5 = this.f70590v;
        boolean z6 = this.f70591w;
        boolean z7 = this.f70592x;
        boolean z8 = this.f70593y;
        boolean z9 = this.f70594z;
        boolean z12 = this.f70562A;
        boolean z13 = this.f70563B;
        List list = this.f70564C;
        String str10 = this.f70565D;
        Long l2 = this.f70566E;
        String str11 = this.f70567F;
        C27626d dVar = this.f70568G;
        return "Account(acctKey=" + j + ", acctName=" + str + ", printAcctNo=" + str2 + ", availableAmount=" + bigDecimal + ", amount=" + bigDecimal2 + ", ccy=" + str3 + ", orderNo=" + i + ", productCode=" + str4 + ", productDictionaryKey=" + str5 + ", subType=" + str6 + ", ccyType=" + str7 + ", mainAcctKey=" + j3 + ", productGroup=" + str8 + ", productId=" + j4 + ", isDefault=" + z + ", isHidden=" + z2 + ", attachmentId=" + l + ", overlimitAmountMc=" + bigDecimal3 + ", isCardExpiring=" + z3 + ", isCardInactive=" + str9 + ", hasDigitalCard=" + z4 + ", paymentOwnAccounts=" + z5 + ", paymentConversion=" + z6 + ", paymentOwnAccountsDst=" + z7 + ", paymentConversionDst=" + z8 + ", paymentWithinBank=" + z9 + ", paymentWithinGeorgia=" + z12 + ", paymentForeign=" + z13 + ", productFunctions=" + list + ", attachmentUrl=" + str10 + ", pfmAcctId=" + l2 + ", displayWarning=" + str11 + ", accountDetails=" + dVar + ")";
    }
}
