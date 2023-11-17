package p863pw;

import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: pw.n */
public final class C27636n {

    /* renamed from: a */
    private final long f70699a;

    /* renamed from: b */
    private final long f70700b;

    /* renamed from: c */
    private final String f70701c;

    /* renamed from: d */
    private final String f70702d;

    /* renamed from: e */
    private final String f70703e;

    /* renamed from: f */
    private final String f70704f;

    /* renamed from: g */
    private final String f70705g;

    /* renamed from: h */
    private final Long f70706h;

    /* renamed from: i */
    private final String f70707i;

    /* renamed from: j */
    private final String f70708j;

    /* renamed from: k */
    private final C24978b f70709k;

    /* renamed from: l */
    private final C24978b f70710l;

    /* renamed from: m */
    private final String f70711m;

    /* renamed from: n */
    private final C24978b f70712n;

    /* renamed from: o */
    private final C24978b f70713o;

    /* renamed from: p */
    private final C24978b f70714p;

    /* renamed from: q */
    private final String f70715q;

    /* renamed from: r */
    private final C24978b f70716r;

    /* renamed from: s */
    private final String f70717s;

    /* renamed from: t */
    private final Long f70718t;

    public C27636n(long j, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, C24978b bVar, C24978b bVar2, String str8, C24978b bVar3, C24978b bVar4, C24978b bVar5, String str9, C24978b bVar6, String str10, Long l2) {
        C24978b bVar7 = bVar;
        C24978b bVar8 = bVar2;
        C24978b bVar9 = bVar3;
        C24978b bVar10 = bVar5;
        C24978b bVar11 = bVar6;
        C41536l.m120489i(str2, "subProductCode");
        C41536l.m120489i(bVar7, "insAllow");
        C41536l.m120489i(bVar8, "sec3D");
        C41536l.m120489i(bVar9, "dgPassYN");
        C41536l.m120489i(bVar10, "isScoolcard");
        C41536l.m120489i(bVar11, "digipassAllow");
        this.f70699a = j;
        this.f70700b = j2;
        this.f70701c = str;
        this.f70702d = str2;
        this.f70703e = str3;
        this.f70704f = str4;
        this.f70705g = str5;
        this.f70706h = l;
        this.f70707i = str6;
        this.f70708j = str7;
        this.f70709k = bVar7;
        this.f70710l = bVar8;
        this.f70711m = str8;
        this.f70712n = bVar9;
        this.f70713o = bVar4;
        this.f70714p = bVar10;
        this.f70715q = str9;
        this.f70716r = bVar11;
        this.f70717s = str10;
        this.f70718t = l2;
    }

    /* renamed from: a */
    public final long mo67144a() {
        return this.f70700b;
    }

    /* renamed from: b */
    public final String mo67145b() {
        return this.f70717s;
    }

    /* renamed from: c */
    public final long mo67146c() {
        return this.f70699a;
    }

    /* renamed from: d */
    public final String mo67147d() {
        return this.f70701c;
    }

    /* renamed from: e */
    public final C24978b mo67148e() {
        return this.f70712n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27636n)) {
            return false;
        }
        C27636n nVar = (C27636n) obj;
        return this.f70699a == nVar.f70699a && this.f70700b == nVar.f70700b && C41536l.m120484d(this.f70701c, nVar.f70701c) && C41536l.m120484d(this.f70702d, nVar.f70702d) && C41536l.m120484d(this.f70703e, nVar.f70703e) && C41536l.m120484d(this.f70704f, nVar.f70704f) && C41536l.m120484d(this.f70705g, nVar.f70705g) && C41536l.m120484d(this.f70706h, nVar.f70706h) && C41536l.m120484d(this.f70707i, nVar.f70707i) && C41536l.m120484d(this.f70708j, nVar.f70708j) && this.f70709k == nVar.f70709k && this.f70710l == nVar.f70710l && C41536l.m120484d(this.f70711m, nVar.f70711m) && this.f70712n == nVar.f70712n && this.f70713o == nVar.f70713o && this.f70714p == nVar.f70714p && C41536l.m120484d(this.f70715q, nVar.f70715q) && this.f70716r == nVar.f70716r && C41536l.m120484d(this.f70717s, nVar.f70717s) && C41536l.m120484d(this.f70718t, nVar.f70718t);
    }

    /* renamed from: f */
    public final String mo67150f() {
        return this.f70704f;
    }

    /* renamed from: g */
    public final String mo67151g() {
        return this.f70715q;
    }

    /* renamed from: h */
    public final C24978b mo67152h() {
        return this.f70716r;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f70699a) * 31) + C7397t.m28148a(this.f70700b)) * 31;
        String str = this.f70701c;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f70702d.hashCode()) * 31;
        String str2 = this.f70703e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70704f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f70705g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f70706h;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.f70707i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f70708j;
        int hashCode7 = (((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f70709k.hashCode()) * 31) + this.f70710l.hashCode()) * 31;
        String str7 = this.f70711m;
        int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.f70712n.hashCode()) * 31;
        C24978b bVar = this.f70713o;
        int hashCode9 = (((hashCode8 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f70714p.hashCode()) * 31;
        String str8 = this.f70715q;
        int hashCode10 = (((hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.f70716r.hashCode()) * 31;
        String str9 = this.f70717s;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l2 = this.f70718t;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode11 + i;
    }

    /* renamed from: i */
    public final C24978b mo67154i() {
        return this.f70709k;
    }

    /* renamed from: j */
    public final String mo67155j() {
        return this.f70705g;
    }

    /* renamed from: k */
    public final Long mo67156k() {
        return this.f70706h;
    }

    /* renamed from: l */
    public final String mo67157l() {
        return this.f70707i;
    }

    /* renamed from: m */
    public final String mo67158m() {
        return this.f70708j;
    }

    /* renamed from: n */
    public final String mo67159n() {
        return this.f70703e;
    }

    /* renamed from: o */
    public final String mo67160o() {
        return this.f70711m;
    }

    /* renamed from: p */
    public final Long mo67161p() {
        return this.f70718t;
    }

    /* renamed from: q */
    public final C24978b mo67162q() {
        return this.f70710l;
    }

    /* renamed from: r */
    public final C24978b mo67163r() {
        return this.f70713o;
    }

    /* renamed from: s */
    public final String mo67164s() {
        return this.f70702d;
    }

    /* renamed from: t */
    public final C24978b mo67165t() {
        return this.f70714p;
    }

    public String toString() {
        long j = this.f70699a;
        long j2 = this.f70700b;
        String str = this.f70701c;
        String str2 = this.f70702d;
        String str3 = this.f70703e;
        String str4 = this.f70704f;
        String str5 = this.f70705g;
        Long l = this.f70706h;
        String str6 = this.f70707i;
        String str7 = this.f70708j;
        C24978b bVar = this.f70709k;
        C24978b bVar2 = this.f70710l;
        String str8 = this.f70711m;
        C24978b bVar3 = this.f70712n;
        C24978b bVar4 = this.f70713o;
        C24978b bVar5 = this.f70714p;
        String str9 = this.f70715q;
        C24978b bVar6 = this.f70716r;
        String str10 = this.f70717s;
        Long l2 = this.f70718t;
        return "CardInsSecCard(cardId=" + j + ", acctKey=" + j2 + ", cardName=" + str + ", subProductCode=" + str2 + ", lastFour=" + str3 + ", dictionaryKey=" + str4 + ", insuranceId=" + str5 + ", insuranceNo=" + l + ", insuranceType=" + str6 + ", insuranceTypeKey=" + str7 + ", insAllow=" + bVar + ", sec3D=" + bVar2 + ", mobile=" + str8 + ", dgPassYN=" + bVar3 + ", secAllow=" + bVar4 + ", isScoolcard=" + bVar5 + ", dictionaryValue=" + str9 + ", digipassAllow=" + bVar6 + ", attachmentFileBase64=" + str10 + ", nextChargeDate=" + l2 + ")";
    }
}
