package p828mr;

import kotlin.jvm.internal.C41536l;

/* renamed from: mr.g */
public final class C26263g {

    /* renamed from: a */
    private final C26258b f66579a;

    /* renamed from: b */
    private final C26258b f66580b;

    /* renamed from: c */
    private final String f66581c;

    /* renamed from: d */
    private final String f66582d;

    /* renamed from: e */
    private final String f66583e;

    /* renamed from: f */
    private final Double f66584f;

    /* renamed from: g */
    private final String f66585g;

    /* renamed from: h */
    private final String f66586h;

    /* renamed from: i */
    private final Double f66587i;

    /* renamed from: j */
    private final String f66588j;

    /* renamed from: k */
    private final String f66589k;

    public C26263g(C26258b bVar, C26258b bVar2, String str, String str2, String str3, Double d, String str4, String str5, Double d2, String str6, String str7) {
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(str2, "providerName");
        C41536l.m120489i(str3, "providerNameEn");
        this.f66579a = bVar;
        this.f66580b = bVar2;
        this.f66581c = str;
        this.f66582d = str2;
        this.f66583e = str3;
        this.f66584f = d;
        this.f66585g = str4;
        this.f66586h = str5;
        this.f66587i = d2;
        this.f66588j = str6;
        this.f66589k = str7;
    }

    /* renamed from: a */
    public final C26258b mo65414a() {
        return this.f66579a;
    }

    /* renamed from: b */
    public final C26258b mo65415b() {
        return this.f66580b;
    }

    /* renamed from: c */
    public final String mo65416c() {
        return this.f66581c;
    }

    /* renamed from: d */
    public final String mo65417d() {
        return this.f66582d;
    }

    /* renamed from: e */
    public final String mo65418e() {
        return this.f66583e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26263g)) {
            return false;
        }
        C26263g gVar = (C26263g) obj;
        return C41536l.m120484d(this.f66579a, gVar.f66579a) && C41536l.m120484d(this.f66580b, gVar.f66580b) && C41536l.m120484d(this.f66581c, gVar.f66581c) && C41536l.m120484d(this.f66582d, gVar.f66582d) && C41536l.m120484d(this.f66583e, gVar.f66583e) && C41536l.m120484d(this.f66584f, gVar.f66584f) && C41536l.m120484d(this.f66585g, gVar.f66585g) && C41536l.m120484d(this.f66586h, gVar.f66586h) && C41536l.m120484d(this.f66587i, gVar.f66587i) && C41536l.m120484d(this.f66588j, gVar.f66588j) && C41536l.m120484d(this.f66589k, gVar.f66589k);
    }

    public int hashCode() {
        C26258b bVar = this.f66579a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        C26258b bVar2 = this.f66580b;
        int hashCode2 = (((((((hashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31) + this.f66581c.hashCode()) * 31) + this.f66582d.hashCode()) * 31) + this.f66583e.hashCode()) * 31;
        Double d = this.f66584f;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f66585g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f66586h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.f66587i;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.f66588j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f66589k;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        C26258b bVar = this.f66579a;
        C26258b bVar2 = this.f66580b;
        String str = this.f66581c;
        String str2 = this.f66582d;
        String str3 = this.f66583e;
        Double d = this.f66584f;
        String str4 = this.f66585g;
        String str5 = this.f66586h;
        Double d2 = this.f66587i;
        String str6 = this.f66588j;
        String str7 = this.f66589k;
        return "ProviderInfo(incomeInsuranceInfo=" + bVar + ", lifeInsuranceInfo=" + bVar2 + ", providerId=" + str + ", providerName=" + str2 + ", providerNameEn=" + str3 + ", insIncomeRate=" + d + ", insIncomeRateCcy=" + str4 + ", insIncomeRateType=" + str5 + ", insLifeRate=" + d2 + ", insLifeRateCcy=" + str6 + ", insLifeRateType=" + str7 + ")";
    }
}
