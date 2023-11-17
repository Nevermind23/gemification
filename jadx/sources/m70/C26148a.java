package m70;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: m70.a */
public final class C26148a {

    /* renamed from: A */
    private final boolean f66269A;

    /* renamed from: B */
    private final boolean f66270B;

    /* renamed from: C */
    private final List f66271C;

    /* renamed from: D */
    private final String f66272D;

    /* renamed from: E */
    private final Long f66273E;

    /* renamed from: F */
    private final String f66274F;

    /* renamed from: G */
    private final C26150c f66275G;

    /* renamed from: a */
    private final long f66276a;

    /* renamed from: b */
    private final String f66277b;

    /* renamed from: c */
    private final String f66278c;

    /* renamed from: d */
    private final BigDecimal f66279d;

    /* renamed from: e */
    private final BigDecimal f66280e;

    /* renamed from: f */
    private final String f66281f;

    /* renamed from: g */
    private final int f66282g;

    /* renamed from: h */
    private final String f66283h;

    /* renamed from: i */
    private final String f66284i;

    /* renamed from: j */
    private final String f66285j;

    /* renamed from: k */
    private final String f66286k;

    /* renamed from: l */
    private final long f66287l;

    /* renamed from: m */
    private final String f66288m;

    /* renamed from: n */
    private final long f66289n;

    /* renamed from: o */
    private final boolean f66290o;

    /* renamed from: p */
    private final boolean f66291p;

    /* renamed from: q */
    private final Long f66292q;

    /* renamed from: r */
    private final BigDecimal f66293r;

    /* renamed from: s */
    private final boolean f66294s;

    /* renamed from: t */
    private final String f66295t;

    /* renamed from: u */
    private final boolean f66296u;

    /* renamed from: v */
    private final boolean f66297v;

    /* renamed from: w */
    private final boolean f66298w;

    /* renamed from: x */
    private final boolean f66299x;

    /* renamed from: y */
    private final boolean f66300y;

    /* renamed from: z */
    private final boolean f66301z;

    public C26148a(long j, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, int i, String str4, String str5, String str6, String str7, long j2, String str8, long j3, boolean z, boolean z2, Long l, BigDecimal bigDecimal3, boolean z3, String str9, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z12, boolean z13, List list, String str10, Long l2, String str11, C26150c cVar) {
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
        this.f66276a = j;
        this.f66277b = str;
        this.f66278c = str12;
        this.f66279d = bigDecimal4;
        this.f66280e = bigDecimal5;
        this.f66281f = str13;
        this.f66282g = i;
        this.f66283h = str14;
        this.f66284i = str5;
        this.f66285j = str6;
        this.f66286k = str15;
        this.f66287l = j2;
        this.f66288m = str16;
        this.f66289n = j3;
        this.f66290o = z;
        this.f66291p = z2;
        this.f66292q = l;
        this.f66293r = bigDecimal6;
        this.f66294s = z3;
        this.f66295t = str17;
        this.f66296u = z4;
        this.f66297v = z5;
        this.f66298w = z6;
        this.f66299x = z7;
        this.f66300y = z8;
        this.f66301z = z9;
        this.f66269A = z12;
        this.f66270B = z13;
        this.f66271C = list2;
        this.f66272D = str10;
        this.f66273E = l2;
        this.f66274F = str18;
        this.f66275G = cVar;
    }

    /* renamed from: A */
    public final String mo65079A() {
        return this.f66288m;
    }

    /* renamed from: B */
    public final long mo65080B() {
        return this.f66289n;
    }

    /* renamed from: C */
    public final String mo65081C() {
        return this.f66285j;
    }

    /* renamed from: D */
    public final boolean mo65082D() {
        return this.f66294s;
    }

    /* renamed from: E */
    public final String mo65083E() {
        return this.f66295t;
    }

    /* renamed from: F */
    public final boolean mo65084F() {
        return this.f66290o;
    }

    /* renamed from: G */
    public final boolean mo65085G() {
        return this.f66291p;
    }

    /* renamed from: a */
    public final C26150c mo65086a() {
        return this.f66275G;
    }

    /* renamed from: b */
    public final long mo65087b() {
        return this.f66276a;
    }

    /* renamed from: c */
    public final String mo65088c() {
        return this.f66277b;
    }

    /* renamed from: d */
    public final BigDecimal mo65089d() {
        return this.f66280e;
    }

    /* renamed from: e */
    public final Long mo65090e() {
        return this.f66292q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26148a)) {
            return false;
        }
        C26148a aVar = (C26148a) obj;
        return this.f66276a == aVar.f66276a && C41536l.m120484d(this.f66277b, aVar.f66277b) && C41536l.m120484d(this.f66278c, aVar.f66278c) && C41536l.m120484d(this.f66279d, aVar.f66279d) && C41536l.m120484d(this.f66280e, aVar.f66280e) && C41536l.m120484d(this.f66281f, aVar.f66281f) && this.f66282g == aVar.f66282g && C41536l.m120484d(this.f66283h, aVar.f66283h) && C41536l.m120484d(this.f66284i, aVar.f66284i) && C41536l.m120484d(this.f66285j, aVar.f66285j) && C41536l.m120484d(this.f66286k, aVar.f66286k) && this.f66287l == aVar.f66287l && C41536l.m120484d(this.f66288m, aVar.f66288m) && this.f66289n == aVar.f66289n && this.f66290o == aVar.f66290o && this.f66291p == aVar.f66291p && C41536l.m120484d(this.f66292q, aVar.f66292q) && C41536l.m120484d(this.f66293r, aVar.f66293r) && this.f66294s == aVar.f66294s && C41536l.m120484d(this.f66295t, aVar.f66295t) && this.f66296u == aVar.f66296u && this.f66297v == aVar.f66297v && this.f66298w == aVar.f66298w && this.f66299x == aVar.f66299x && this.f66300y == aVar.f66300y && this.f66301z == aVar.f66301z && this.f66269A == aVar.f66269A && this.f66270B == aVar.f66270B && C41536l.m120484d(this.f66271C, aVar.f66271C) && C41536l.m120484d(this.f66272D, aVar.f66272D) && C41536l.m120484d(this.f66273E, aVar.f66273E) && C41536l.m120484d(this.f66274F, aVar.f66274F) && C41536l.m120484d(this.f66275G, aVar.f66275G);
    }

    /* renamed from: f */
    public final String mo65092f() {
        return this.f66272D;
    }

    /* renamed from: g */
    public final BigDecimal mo65093g() {
        return this.f66279d;
    }

    /* renamed from: h */
    public final String mo65094h() {
        return this.f66281f;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f66276a) * 31;
        String str = this.f66277b;
        int i = 0;
        int hashCode = (((((((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f66278c.hashCode()) * 31) + this.f66279d.hashCode()) * 31) + this.f66280e.hashCode()) * 31) + this.f66281f.hashCode()) * 31) + this.f66282g) * 31) + this.f66283h.hashCode()) * 31;
        String str2 = this.f66284i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66285j;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f66286k.hashCode()) * 31) + C7397t.m28148a(this.f66287l)) * 31) + this.f66288m.hashCode()) * 31) + C7397t.m28148a(this.f66289n)) * 31;
        boolean z = this.f66290o;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f66291p;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        Long l = this.f66292q;
        int hashCode4 = (((i3 + (l == null ? 0 : l.hashCode())) * 31) + this.f66293r.hashCode()) * 31;
        boolean z4 = this.f66294s;
        if (z4) {
            z4 = true;
        }
        int hashCode5 = (((hashCode4 + (z4 ? 1 : 0)) * 31) + this.f66295t.hashCode()) * 31;
        boolean z5 = this.f66296u;
        if (z5) {
            z5 = true;
        }
        int i4 = (hashCode5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f66297v;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f66298w;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.f66299x;
        if (z8) {
            z8 = true;
        }
        int i7 = (i6 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.f66300y;
        if (z9) {
            z9 = true;
        }
        int i8 = (i7 + (z9 ? 1 : 0)) * 31;
        boolean z12 = this.f66301z;
        if (z12) {
            z12 = true;
        }
        int i9 = (i8 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f66269A;
        if (z13) {
            z13 = true;
        }
        int i12 = (i9 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f66270B;
        if (!z14) {
            z2 = z14;
        }
        int hashCode6 = (((i12 + (z2 ? 1 : 0)) * 31) + this.f66271C.hashCode()) * 31;
        String str4 = this.f66272D;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f66273E;
        int hashCode8 = (((hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.f66274F.hashCode()) * 31;
        C26150c cVar = this.f66275G;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public final String mo65096i() {
        return this.f66286k;
    }

    /* renamed from: j */
    public final String mo65097j() {
        return this.f66274F;
    }

    /* renamed from: k */
    public final boolean mo65098k() {
        return this.f66296u;
    }

    /* renamed from: l */
    public final long mo65099l() {
        return this.f66287l;
    }

    /* renamed from: m */
    public final int mo65100m() {
        return this.f66282g;
    }

    /* renamed from: n */
    public final BigDecimal mo65101n() {
        return this.f66293r;
    }

    /* renamed from: o */
    public final boolean mo65102o() {
        return this.f66298w;
    }

    /* renamed from: p */
    public final boolean mo65103p() {
        return this.f66300y;
    }

    /* renamed from: q */
    public final boolean mo65104q() {
        return this.f66270B;
    }

    /* renamed from: r */
    public final boolean mo65105r() {
        return this.f66297v;
    }

    /* renamed from: s */
    public final boolean mo65106s() {
        return this.f66299x;
    }

    /* renamed from: t */
    public final boolean mo65107t() {
        return this.f66301z;
    }

    public String toString() {
        long j = this.f66276a;
        String str = this.f66277b;
        String str2 = this.f66278c;
        BigDecimal bigDecimal = this.f66279d;
        BigDecimal bigDecimal2 = this.f66280e;
        String str3 = this.f66281f;
        int i = this.f66282g;
        String str4 = this.f66283h;
        String str5 = this.f66284i;
        String str6 = this.f66285j;
        String str7 = this.f66286k;
        long j2 = this.f66287l;
        String str8 = this.f66288m;
        long j3 = j2;
        long j4 = this.f66289n;
        boolean z = this.f66290o;
        boolean z2 = this.f66291p;
        Long l = this.f66292q;
        BigDecimal bigDecimal3 = this.f66293r;
        boolean z3 = this.f66294s;
        String str9 = this.f66295t;
        boolean z4 = this.f66296u;
        boolean z5 = this.f66297v;
        boolean z6 = this.f66298w;
        boolean z7 = this.f66299x;
        boolean z8 = this.f66300y;
        boolean z9 = this.f66301z;
        boolean z12 = this.f66269A;
        boolean z13 = this.f66270B;
        List list = this.f66271C;
        String str10 = this.f66272D;
        Long l2 = this.f66273E;
        String str11 = this.f66274F;
        C26150c cVar = this.f66275G;
        return "Account(acctKey=" + j + ", acctName=" + str + ", printAcctNo=" + str2 + ", availableAmount=" + bigDecimal + ", amount=" + bigDecimal2 + ", ccy=" + str3 + ", orderNo=" + i + ", productCode=" + str4 + ", productDictionaryKey=" + str5 + ", subType=" + str6 + ", ccyType=" + str7 + ", mainAcctKey=" + j3 + ", productGroup=" + str8 + ", productId=" + j4 + ", isDefault=" + z + ", isHidden=" + z2 + ", attachmentId=" + l + ", overlimitAmountMc=" + bigDecimal3 + ", isCardExpiring=" + z3 + ", isCardInactive=" + str9 + ", hasDigitalCard=" + z4 + ", paymentOwnAccounts=" + z5 + ", paymentConversion=" + z6 + ", paymentOwnAccountsDst=" + z7 + ", paymentConversionDst=" + z8 + ", paymentWithinBank=" + z9 + ", paymentWithinGeorgia=" + z12 + ", paymentForeign=" + z13 + ", productFunctions=" + list + ", attachmentUrl=" + str10 + ", pfmAcctId=" + l2 + ", displayWarning=" + str11 + ", accountDetails=" + cVar + ")";
    }

    /* renamed from: u */
    public final boolean mo65109u() {
        return this.f66269A;
    }

    /* renamed from: v */
    public final Long mo65110v() {
        return this.f66273E;
    }

    /* renamed from: w */
    public final String mo65111w() {
        return this.f66278c;
    }

    /* renamed from: x */
    public final String mo65112x() {
        return this.f66283h;
    }

    /* renamed from: y */
    public final String mo65113y() {
        return this.f66284i;
    }

    /* renamed from: z */
    public final List mo65114z() {
        return this.f66271C;
    }
}
