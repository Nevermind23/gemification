package wp0;

import kotlin.jvm.internal.C41536l;

/* renamed from: wp0.f */
public final class C39634f {

    /* renamed from: a */
    private final C39631c f94206a;

    /* renamed from: b */
    private final C39631c f94207b;

    /* renamed from: c */
    private final String f94208c;

    /* renamed from: d */
    private final String f94209d;

    /* renamed from: e */
    private final String f94210e;

    /* renamed from: f */
    private final Double f94211f;

    /* renamed from: g */
    private final String f94212g;

    /* renamed from: h */
    private final String f94213h;

    /* renamed from: i */
    private final Double f94214i;

    /* renamed from: j */
    private final String f94215j;

    /* renamed from: k */
    private final String f94216k;

    public C39634f(C39631c cVar, C39631c cVar2, String str, String str2, String str3, Double d, String str4, String str5, Double d2, String str6, String str7) {
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(str2, "providerName");
        C41536l.m120489i(str3, "providerNameEn");
        this.f94206a = cVar;
        this.f94207b = cVar2;
        this.f94208c = str;
        this.f94209d = str2;
        this.f94210e = str3;
        this.f94211f = d;
        this.f94212g = str4;
        this.f94213h = str5;
        this.f94214i = d2;
        this.f94215j = str6;
        this.f94216k = str7;
    }

    /* renamed from: a */
    public final C39631c mo93343a() {
        return this.f94206a;
    }

    /* renamed from: b */
    public final C39631c mo93344b() {
        return this.f94207b;
    }

    /* renamed from: c */
    public final String mo93345c() {
        return this.f94208c;
    }

    /* renamed from: d */
    public final String mo93346d() {
        return this.f94209d;
    }

    /* renamed from: e */
    public final String mo93347e() {
        return this.f94210e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39634f)) {
            return false;
        }
        C39634f fVar = (C39634f) obj;
        return C41536l.m120484d(this.f94206a, fVar.f94206a) && C41536l.m120484d(this.f94207b, fVar.f94207b) && C41536l.m120484d(this.f94208c, fVar.f94208c) && C41536l.m120484d(this.f94209d, fVar.f94209d) && C41536l.m120484d(this.f94210e, fVar.f94210e) && C41536l.m120484d(this.f94211f, fVar.f94211f) && C41536l.m120484d(this.f94212g, fVar.f94212g) && C41536l.m120484d(this.f94213h, fVar.f94213h) && C41536l.m120484d(this.f94214i, fVar.f94214i) && C41536l.m120484d(this.f94215j, fVar.f94215j) && C41536l.m120484d(this.f94216k, fVar.f94216k);
    }

    public int hashCode() {
        C39631c cVar = this.f94206a;
        int i = 0;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        C39631c cVar2 = this.f94207b;
        int hashCode2 = (((((((hashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31) + this.f94208c.hashCode()) * 31) + this.f94209d.hashCode()) * 31) + this.f94210e.hashCode()) * 31;
        Double d = this.f94211f;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f94212g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94213h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.f94214i;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.f94215j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94216k;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        C39631c cVar = this.f94206a;
        C39631c cVar2 = this.f94207b;
        String str = this.f94208c;
        String str2 = this.f94209d;
        String str3 = this.f94210e;
        Double d = this.f94211f;
        String str4 = this.f94212g;
        String str5 = this.f94213h;
        Double d2 = this.f94214i;
        String str6 = this.f94215j;
        String str7 = this.f94216k;
        return "ProviderInfo(incomeInsuranceInfo=" + cVar + ", lifeInsuranceInfo=" + cVar2 + ", providerId=" + str + ", providerName=" + str2 + ", providerNameEn=" + str3 + ", insIncomeRate=" + d + ", insIncomeRateCcy=" + str4 + ", insIncomeRateType=" + str5 + ", insLifeRate=" + d2 + ", insLifeRateCcy=" + str6 + ", insLifeRateType=" + str7 + ")";
    }
}
