package l50;

import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: l50.u */
public final class C25841u {

    /* renamed from: a */
    private final long f65790a;

    /* renamed from: b */
    private final long f65791b;

    /* renamed from: c */
    private final String f65792c;

    /* renamed from: d */
    private final String f65793d;

    /* renamed from: e */
    private final String f65794e;

    /* renamed from: f */
    private final String f65795f;

    /* renamed from: g */
    private final String f65796g;

    /* renamed from: h */
    private final Long f65797h;

    /* renamed from: i */
    private final String f65798i;

    /* renamed from: j */
    private final String f65799j;

    /* renamed from: k */
    private final C24978b f65800k;

    /* renamed from: l */
    private final C24978b f65801l;

    /* renamed from: m */
    private final String f65802m;

    /* renamed from: n */
    private final C24978b f65803n;

    /* renamed from: o */
    private final C24978b f65804o;

    /* renamed from: p */
    private final C24978b f65805p;

    /* renamed from: q */
    private final String f65806q;

    /* renamed from: r */
    private final C24978b f65807r;

    /* renamed from: s */
    private final String f65808s;

    public C25841u(long j, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, C24978b bVar, C24978b bVar2, String str8, C24978b bVar3, C24978b bVar4, C24978b bVar5, String str9, C24978b bVar6, String str10) {
        C24978b bVar7 = bVar;
        C24978b bVar8 = bVar2;
        C24978b bVar9 = bVar3;
        C41536l.m120489i(str2, "subProductCode");
        C41536l.m120489i(bVar7, "insAllow");
        C41536l.m120489i(bVar8, "sec3D");
        C41536l.m120489i(bVar9, "dgPassYN");
        this.f65790a = j;
        this.f65791b = j2;
        this.f65792c = str;
        this.f65793d = str2;
        this.f65794e = str3;
        this.f65795f = str4;
        this.f65796g = str5;
        this.f65797h = l;
        this.f65798i = str6;
        this.f65799j = str7;
        this.f65800k = bVar7;
        this.f65801l = bVar8;
        this.f65802m = str8;
        this.f65803n = bVar9;
        this.f65804o = bVar4;
        this.f65805p = bVar5;
        this.f65806q = str9;
        this.f65807r = bVar6;
        this.f65808s = str10;
    }

    /* renamed from: a */
    public final long mo64614a() {
        return this.f65790a;
    }

    /* renamed from: b */
    public final C24978b mo64615b() {
        return this.f65803n;
    }

    /* renamed from: c */
    public final C24978b mo64616c() {
        return this.f65807r;
    }

    /* renamed from: d */
    public final C24978b mo64617d() {
        return this.f65800k;
    }

    /* renamed from: e */
    public final String mo64618e() {
        return this.f65798i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25841u)) {
            return false;
        }
        C25841u uVar = (C25841u) obj;
        return this.f65790a == uVar.f65790a && this.f65791b == uVar.f65791b && C41536l.m120484d(this.f65792c, uVar.f65792c) && C41536l.m120484d(this.f65793d, uVar.f65793d) && C41536l.m120484d(this.f65794e, uVar.f65794e) && C41536l.m120484d(this.f65795f, uVar.f65795f) && C41536l.m120484d(this.f65796g, uVar.f65796g) && C41536l.m120484d(this.f65797h, uVar.f65797h) && C41536l.m120484d(this.f65798i, uVar.f65798i) && C41536l.m120484d(this.f65799j, uVar.f65799j) && this.f65800k == uVar.f65800k && this.f65801l == uVar.f65801l && C41536l.m120484d(this.f65802m, uVar.f65802m) && this.f65803n == uVar.f65803n && this.f65804o == uVar.f65804o && this.f65805p == uVar.f65805p && C41536l.m120484d(this.f65806q, uVar.f65806q) && this.f65807r == uVar.f65807r && C41536l.m120484d(this.f65808s, uVar.f65808s);
    }

    /* renamed from: f */
    public final String mo64620f() {
        return this.f65799j;
    }

    /* renamed from: g */
    public final String mo64621g() {
        return this.f65802m;
    }

    /* renamed from: h */
    public final C24978b mo64622h() {
        return this.f65801l;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f65790a) * 31) + C7397t.m28148a(this.f65791b)) * 31;
        String str = this.f65792c;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f65793d.hashCode()) * 31;
        String str2 = this.f65794e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f65795f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f65796g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f65797h;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.f65798i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f65799j;
        int hashCode7 = (((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f65800k.hashCode()) * 31) + this.f65801l.hashCode()) * 31;
        String str7 = this.f65802m;
        int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.f65803n.hashCode()) * 31;
        C24978b bVar = this.f65804o;
        int hashCode9 = (hashCode8 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C24978b bVar2 = this.f65805p;
        int hashCode10 = (hashCode9 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str8 = this.f65806q;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        C24978b bVar3 = this.f65807r;
        int hashCode12 = (hashCode11 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        String str9 = this.f65808s;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode12 + i;
    }

    /* renamed from: i */
    public final C24978b mo64624i() {
        return this.f65804o;
    }

    public String toString() {
        long j = this.f65790a;
        long j2 = this.f65791b;
        String str = this.f65792c;
        String str2 = this.f65793d;
        String str3 = this.f65794e;
        String str4 = this.f65795f;
        String str5 = this.f65796g;
        Long l = this.f65797h;
        String str6 = this.f65798i;
        String str7 = this.f65799j;
        C24978b bVar = this.f65800k;
        C24978b bVar2 = this.f65801l;
        String str8 = this.f65802m;
        C24978b bVar3 = this.f65803n;
        C24978b bVar4 = this.f65804o;
        C24978b bVar5 = this.f65805p;
        String str9 = this.f65806q;
        C24978b bVar6 = this.f65807r;
        String str10 = this.f65808s;
        return "InsSecUIModel(cardId=" + j + ", acctKey=" + j2 + ", cardName=" + str + ", subProductCode=" + str2 + ", lastFour=" + str3 + ", dictionaryKey=" + str4 + ", insuranceId=" + str5 + ", insuranceNo=" + l + ", insuranceType=" + str6 + ", insuranceTypeKey=" + str7 + ", insAllow=" + bVar + ", sec3D=" + bVar2 + ", mobile=" + str8 + ", dgPassYN=" + bVar3 + ", secAllow=" + bVar4 + ", isScoolcard=" + bVar5 + ", dictionaryValue=" + str9 + ", digipassAllow=" + bVar6 + ", attachmentFileBase64=" + str10 + ")";
    }
}
