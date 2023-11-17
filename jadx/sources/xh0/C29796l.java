package xh0;

import com.salesforce.marketingcloud.C11398b;
import j31.C36725a;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xh0.l */
public final class C29796l {

    /* renamed from: a */
    private final long f75424a;

    /* renamed from: b */
    private final String f75425b;

    /* renamed from: c */
    private final String f75426c;

    /* renamed from: d */
    private final String f75427d;

    /* renamed from: e */
    private final BigDecimal f75428e;

    /* renamed from: f */
    private final C36725a f75429f;

    /* renamed from: g */
    private final String f75430g;

    /* renamed from: h */
    private final C36725a f75431h;

    /* renamed from: i */
    private final C36725a f75432i;

    /* renamed from: j */
    private final boolean f75433j;

    /* renamed from: k */
    private final boolean f75434k;

    /* renamed from: l */
    private final boolean f75435l;

    /* renamed from: m */
    private final Long f75436m;

    /* renamed from: n */
    private final String f75437n;

    /* renamed from: o */
    private final String f75438o;

    /* renamed from: p */
    private final String f75439p;

    /* renamed from: q */
    private final Long f75440q;

    /* renamed from: r */
    private final BigDecimal f75441r;

    /* renamed from: s */
    private final List f75442s;

    /* renamed from: t */
    private final String f75443t;

    public C29796l(long j, String str, String str2, String str3, BigDecimal bigDecimal, C36725a aVar, String str4, C36725a aVar2, C36725a aVar3, boolean z, boolean z2, boolean z3, Long l, String str5, String str6, String str7, Long l2, BigDecimal bigDecimal2, List list, String str8) {
        this.f75424a = j;
        this.f75425b = str;
        this.f75426c = str2;
        this.f75427d = str3;
        this.f75428e = bigDecimal;
        this.f75429f = aVar;
        this.f75430g = str4;
        this.f75431h = aVar2;
        this.f75432i = aVar3;
        this.f75433j = z;
        this.f75434k = z2;
        this.f75435l = z3;
        this.f75436m = l;
        this.f75437n = str5;
        this.f75438o = str6;
        this.f75439p = str7;
        this.f75440q = l2;
        this.f75441r = bigDecimal2;
        this.f75442s = list;
        this.f75443t = str8;
    }

    /* renamed from: b */
    public static /* synthetic */ C29796l m90522b(C29796l lVar, long j, String str, String str2, String str3, BigDecimal bigDecimal, C36725a aVar, String str4, C36725a aVar2, C36725a aVar3, boolean z, boolean z2, boolean z3, Long l, String str5, String str6, String str7, Long l2, BigDecimal bigDecimal2, List list, String str8, int i, Object obj) {
        C29796l lVar2 = lVar;
        int i2 = i;
        return lVar.mo70020a((i2 & 1) != 0 ? lVar2.f75424a : j, (i2 & 2) != 0 ? lVar2.f75425b : str, (i2 & 4) != 0 ? lVar2.f75426c : str2, (i2 & 8) != 0 ? lVar2.f75427d : str3, (i2 & 16) != 0 ? lVar2.f75428e : bigDecimal, (i2 & 32) != 0 ? lVar2.f75429f : aVar, (i2 & 64) != 0 ? lVar2.f75430g : str4, (i2 & 128) != 0 ? lVar2.f75431h : aVar2, (i2 & C11398b.f33139r) != 0 ? lVar2.f75432i : aVar3, (i2 & C11398b.f33140s) != 0 ? lVar2.f75433j : z, (i2 & C11398b.f33141t) != 0 ? lVar2.f75434k : z2, (i2 & C11398b.f33142u) != 0 ? lVar2.f75435l : z3, (i2 & C11398b.f33143v) != 0 ? lVar2.f75436m : l, (i2 & 8192) != 0 ? lVar2.f75437n : str5, (i2 & 16384) != 0 ? lVar2.f75438o : str6, (i2 & 32768) != 0 ? lVar2.f75439p : str7, (i2 & 65536) != 0 ? lVar2.f75440q : l2, (i2 & 131072) != 0 ? lVar2.f75441r : bigDecimal2, (i2 & 262144) != 0 ? lVar2.f75442s : list, (i2 & 524288) != 0 ? lVar2.f75443t : str8);
    }

    /* renamed from: a */
    public final C29796l mo70020a(long j, String str, String str2, String str3, BigDecimal bigDecimal, C36725a aVar, String str4, C36725a aVar2, C36725a aVar3, boolean z, boolean z2, boolean z3, Long l, String str5, String str6, String str7, Long l2, BigDecimal bigDecimal2, List list, String str8) {
        return new C29796l(j, str, str2, str3, bigDecimal, aVar, str4, aVar2, aVar3, z, z2, z3, l, str5, str6, str7, l2, bigDecimal2, list, str8);
    }

    /* renamed from: c */
    public final String mo70021c() {
        return this.f75425b;
    }

    /* renamed from: d */
    public final BigDecimal mo70022d() {
        return this.f75428e;
    }

    /* renamed from: e */
    public final String mo70023e() {
        return this.f75430g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29796l)) {
            return false;
        }
        C29796l lVar = (C29796l) obj;
        return this.f75424a == lVar.f75424a && C41536l.m120484d(this.f75425b, lVar.f75425b) && C41536l.m120484d(this.f75426c, lVar.f75426c) && C41536l.m120484d(this.f75427d, lVar.f75427d) && C41536l.m120484d(this.f75428e, lVar.f75428e) && C41536l.m120484d(this.f75429f, lVar.f75429f) && C41536l.m120484d(this.f75430g, lVar.f75430g) && C41536l.m120484d(this.f75431h, lVar.f75431h) && C41536l.m120484d(this.f75432i, lVar.f75432i) && this.f75433j == lVar.f75433j && this.f75434k == lVar.f75434k && this.f75435l == lVar.f75435l && C41536l.m120484d(this.f75436m, lVar.f75436m) && C41536l.m120484d(this.f75437n, lVar.f75437n) && C41536l.m120484d(this.f75438o, lVar.f75438o) && C41536l.m120484d(this.f75439p, lVar.f75439p) && C41536l.m120484d(this.f75440q, lVar.f75440q) && C41536l.m120484d(this.f75441r, lVar.f75441r) && C41536l.m120484d(this.f75442s, lVar.f75442s) && C41536l.m120484d(this.f75443t, lVar.f75443t);
    }

    /* renamed from: f */
    public final C36725a mo70025f() {
        return this.f75431h;
    }

    /* renamed from: g */
    public final C36725a mo70026g() {
        return this.f75432i;
    }

    /* renamed from: h */
    public final long mo70027h() {
        return this.f75424a;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f75424a) * 31;
        String str = this.f75425b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75426c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75427d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.f75428e;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        C36725a aVar = this.f75429f;
        int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.f75430g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C36725a aVar2 = this.f75431h;
        int hashCode7 = (hashCode6 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C36725a aVar3 = this.f75432i;
        int hashCode8 = (hashCode7 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        boolean z = this.f75433j;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f75434k;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f75435l;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        Long l = this.f75436m;
        int hashCode9 = (i4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.f75437n;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f75438o;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f75439p;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.f75440q;
        int hashCode13 = (hashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f75441r;
        int hashCode14 = (hashCode13 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        List list = this.f75442s;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.f75443t;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode15 + i;
    }

    /* renamed from: i */
    public final Long mo70029i() {
        return this.f75436m;
    }

    /* renamed from: j */
    public final String mo70030j() {
        return this.f75437n;
    }

    /* renamed from: k */
    public final List mo70031k() {
        return this.f75442s;
    }

    /* renamed from: l */
    public final boolean mo70032l() {
        return this.f75434k;
    }

    public String toString() {
        long j = this.f75424a;
        String str = this.f75425b;
        String str2 = this.f75426c;
        String str3 = this.f75427d;
        BigDecimal bigDecimal = this.f75428e;
        C36725a aVar = this.f75429f;
        String str4 = this.f75430g;
        C36725a aVar2 = this.f75431h;
        C36725a aVar3 = this.f75432i;
        boolean z = this.f75433j;
        boolean z2 = this.f75434k;
        boolean z3 = this.f75435l;
        Long l = this.f75436m;
        String str5 = this.f75437n;
        String str6 = this.f75438o;
        String str7 = this.f75439p;
        Long l2 = this.f75440q;
        BigDecimal bigDecimal2 = this.f75441r;
        List list = this.f75442s;
        String str8 = this.f75443t;
        return "GiftCardsTransferAccount(id=" + j + ", acctNo=" + str + ", attachmentId=" + str2 + ", attachmentUrl=" + str3 + ", availableAmount=" + bigDecimal + ", cardExternalFile=" + aVar + ", ccy=" + str4 + ", externalFile=" + aVar2 + ", externalIcon=" + aVar3 + ", hasDeposit=" + z + ", isDefault=" + z2 + ", isScoolCardAccount=" + z3 + ", mainAcctKey=" + l + ", name=" + str5 + ", productCode=" + str6 + ", productGroup=" + str7 + ", productId=" + l2 + ", realAmount=" + bigDecimal2 + ", subAccounts=" + list + ", subProductCode=" + str8 + ")";
    }
}
