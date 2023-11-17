package hm0;

import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z11.C40140b;

/* renamed from: hm0.f */
public final class C25044f {

    /* renamed from: a */
    private final String f64391a;

    /* renamed from: b */
    private final String f64392b;

    /* renamed from: c */
    private final String f64393c;

    /* renamed from: d */
    private final String f64394d;

    /* renamed from: e */
    private final String f64395e;

    /* renamed from: f */
    private final String f64396f;

    /* renamed from: g */
    private final String f64397g;

    /* renamed from: h */
    private final String f64398h;

    /* renamed from: i */
    private final String f64399i;

    /* renamed from: j */
    private final String f64400j;

    /* renamed from: k */
    private final C40140b f64401k;

    public C25044f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C40140b bVar) {
        C41536l.m120489i(str, "company");
        C41536l.m120489i(str2, "maxLimitText");
        C41536l.m120489i(str3, "startDate");
        C41536l.m120489i(str4, "endDate");
        C41536l.m120489i(str5, "price");
        C41536l.m120489i(str6, "riskInsurance");
        C41536l.m120489i(str7, "firstName");
        C41536l.m120489i(str8, "lastName");
        C41536l.m120489i(str9, "idNumber");
        C41536l.m120489i(str10, "dateOfBirth");
        this.f64391a = str;
        this.f64392b = str2;
        this.f64393c = str3;
        this.f64394d = str4;
        this.f64395e = str5;
        this.f64396f = str6;
        this.f64397g = str7;
        this.f64398h = str8;
        this.f64399i = str9;
        this.f64400j = str10;
        this.f64401k = bVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C25044f m79986b(C25044f fVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C40140b bVar, int i, Object obj) {
        C25044f fVar2 = fVar;
        int i2 = i;
        return fVar.mo63474a((i2 & 1) != 0 ? fVar2.f64391a : str, (i2 & 2) != 0 ? fVar2.f64392b : str2, (i2 & 4) != 0 ? fVar2.f64393c : str3, (i2 & 8) != 0 ? fVar2.f64394d : str4, (i2 & 16) != 0 ? fVar2.f64395e : str5, (i2 & 32) != 0 ? fVar2.f64396f : str6, (i2 & 64) != 0 ? fVar2.f64397g : str7, (i2 & 128) != 0 ? fVar2.f64398h : str8, (i2 & C11398b.f33139r) != 0 ? fVar2.f64399i : str9, (i2 & C11398b.f33140s) != 0 ? fVar2.f64400j : str10, (i2 & C11398b.f33141t) != 0 ? fVar2.f64401k : bVar);
    }

    /* renamed from: a */
    public final C25044f mo63474a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C40140b bVar) {
        C41536l.m120489i(str, "company");
        C41536l.m120489i(str2, "maxLimitText");
        String str11 = str3;
        C41536l.m120489i(str11, "startDate");
        String str12 = str4;
        C41536l.m120489i(str12, "endDate");
        String str13 = str5;
        C41536l.m120489i(str13, "price");
        String str14 = str6;
        C41536l.m120489i(str14, "riskInsurance");
        String str15 = str7;
        C41536l.m120489i(str15, "firstName");
        String str16 = str8;
        C41536l.m120489i(str16, "lastName");
        String str17 = str9;
        C41536l.m120489i(str17, "idNumber");
        String str18 = str10;
        C41536l.m120489i(str18, "dateOfBirth");
        return new C25044f(str, str2, str11, str12, str13, str14, str15, str16, str17, str18, bVar);
    }

    /* renamed from: c */
    public final String mo63475c() {
        return this.f64391a;
    }

    /* renamed from: d */
    public final String mo63476d() {
        return this.f64400j;
    }

    /* renamed from: e */
    public final String mo63477e() {
        return this.f64394d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25044f)) {
            return false;
        }
        C25044f fVar = (C25044f) obj;
        return C41536l.m120484d(this.f64391a, fVar.f64391a) && C41536l.m120484d(this.f64392b, fVar.f64392b) && C41536l.m120484d(this.f64393c, fVar.f64393c) && C41536l.m120484d(this.f64394d, fVar.f64394d) && C41536l.m120484d(this.f64395e, fVar.f64395e) && C41536l.m120484d(this.f64396f, fVar.f64396f) && C41536l.m120484d(this.f64397g, fVar.f64397g) && C41536l.m120484d(this.f64398h, fVar.f64398h) && C41536l.m120484d(this.f64399i, fVar.f64399i) && C41536l.m120484d(this.f64400j, fVar.f64400j) && C41536l.m120484d(this.f64401k, fVar.f64401k);
    }

    /* renamed from: f */
    public final String mo63479f() {
        return this.f64397g;
    }

    /* renamed from: g */
    public final String mo63480g() {
        return this.f64399i;
    }

    /* renamed from: h */
    public final String mo63481h() {
        return this.f64398h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.f64391a.hashCode() * 31) + this.f64392b.hashCode()) * 31) + this.f64393c.hashCode()) * 31) + this.f64394d.hashCode()) * 31) + this.f64395e.hashCode()) * 31) + this.f64396f.hashCode()) * 31) + this.f64397g.hashCode()) * 31) + this.f64398h.hashCode()) * 31) + this.f64399i.hashCode()) * 31) + this.f64400j.hashCode()) * 31;
        C40140b bVar = this.f64401k;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    /* renamed from: i */
    public final String mo63483i() {
        return this.f64392b;
    }

    /* renamed from: j */
    public final String mo63484j() {
        return this.f64395e;
    }

    /* renamed from: k */
    public final String mo63485k() {
        return this.f64396f;
    }

    /* renamed from: l */
    public final C40140b mo63486l() {
        return this.f64401k;
    }

    /* renamed from: m */
    public final String mo63487m() {
        return this.f64393c;
    }

    public String toString() {
        String str = this.f64391a;
        String str2 = this.f64392b;
        String str3 = this.f64393c;
        String str4 = this.f64394d;
        String str5 = this.f64395e;
        String str6 = this.f64396f;
        String str7 = this.f64397g;
        String str8 = this.f64398h;
        String str9 = this.f64399i;
        String str10 = this.f64400j;
        C40140b bVar = this.f64401k;
        return "InsuranceSummaryUiModel(company=" + str + ", maxLimitText=" + str2 + ", startDate=" + str3 + ", endDate=" + str4 + ", price=" + str5 + ", riskInsurance=" + str6 + ", firstName=" + str7 + ", lastName=" + str8 + ", idNumber=" + str9 + ", dateOfBirth=" + str10 + ", selectedAcct=" + bVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25044f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C40140b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i & C11398b.f33141t) != 0 ? null : bVar);
    }
}
