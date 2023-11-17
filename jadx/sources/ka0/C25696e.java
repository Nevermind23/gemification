package ka0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ka0.e */
public final class C25696e {

    /* renamed from: a */
    private final String f65434a;

    /* renamed from: b */
    private final C25695d f65435b;

    /* renamed from: c */
    private final String f65436c;

    /* renamed from: d */
    private final Boolean f65437d;

    /* renamed from: e */
    private final Boolean f65438e;

    /* renamed from: f */
    private final String f65439f;

    /* renamed from: g */
    private final String f65440g;

    /* renamed from: h */
    private final String f65441h;

    /* renamed from: i */
    private final String f65442i;

    /* renamed from: j */
    private final BigDecimal f65443j;

    /* renamed from: k */
    private final BigDecimal f65444k;

    /* renamed from: l */
    private final String f65445l;

    /* renamed from: m */
    private final String f65446m;

    /* renamed from: n */
    private final long f65447n;

    /* renamed from: o */
    private final long f65448o;

    /* renamed from: p */
    private final String f65449p;

    /* renamed from: q */
    private final String f65450q;

    /* renamed from: r */
    private final String f65451r;

    /* renamed from: s */
    private final List f65452s;

    /* renamed from: t */
    private final List f65453t;

    public C25696e(String str, C25695d dVar, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str7, String str8, long j, long j2, String str9, String str10, String str11, List list, List list2) {
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        String str12 = str9;
        String str13 = str10;
        String str14 = str11;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(dVar, "depositType");
        C41536l.m120489i(bigDecimal3, "preContractIrrMinAmount");
        C41536l.m120489i(bigDecimal4, "preContractIrrMaxAmount");
        C41536l.m120489i(str12, "minIntRate");
        C41536l.m120489i(str13, "maxIntRate");
        C41536l.m120489i(str14, "effectiveRate");
        C41536l.m120489i(list3, "advantages");
        C41536l.m120489i(list4, "disAdvantages");
        this.f65434a = str;
        this.f65435b = dVar;
        this.f65436c = str2;
        this.f65437d = bool;
        this.f65438e = bool2;
        this.f65439f = str3;
        this.f65440g = str4;
        this.f65441h = str5;
        this.f65442i = str6;
        this.f65443j = bigDecimal3;
        this.f65444k = bigDecimal4;
        this.f65445l = str7;
        this.f65446m = str8;
        this.f65447n = j;
        this.f65448o = j2;
        this.f65449p = str12;
        this.f65450q = str13;
        this.f65451r = str14;
        this.f65452s = list3;
        this.f65453t = list4;
    }

    /* renamed from: a */
    public final List mo64214a() {
        return this.f65452s;
    }

    /* renamed from: b */
    public final String mo64215b() {
        return this.f65439f;
    }

    /* renamed from: c */
    public final String mo64216c() {
        return this.f65445l;
    }

    /* renamed from: d */
    public final String mo64217d() {
        return this.f65440g;
    }

    /* renamed from: e */
    public final long mo64218e() {
        return this.f65448o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25696e)) {
            return false;
        }
        C25696e eVar = (C25696e) obj;
        return C41536l.m120484d(this.f65434a, eVar.f65434a) && this.f65435b == eVar.f65435b && C41536l.m120484d(this.f65436c, eVar.f65436c) && C41536l.m120484d(this.f65437d, eVar.f65437d) && C41536l.m120484d(this.f65438e, eVar.f65438e) && C41536l.m120484d(this.f65439f, eVar.f65439f) && C41536l.m120484d(this.f65440g, eVar.f65440g) && C41536l.m120484d(this.f65441h, eVar.f65441h) && C41536l.m120484d(this.f65442i, eVar.f65442i) && C41536l.m120484d(this.f65443j, eVar.f65443j) && C41536l.m120484d(this.f65444k, eVar.f65444k) && C41536l.m120484d(this.f65445l, eVar.f65445l) && C41536l.m120484d(this.f65446m, eVar.f65446m) && this.f65447n == eVar.f65447n && this.f65448o == eVar.f65448o && C41536l.m120484d(this.f65449p, eVar.f65449p) && C41536l.m120484d(this.f65450q, eVar.f65450q) && C41536l.m120484d(this.f65451r, eVar.f65451r) && C41536l.m120484d(this.f65452s, eVar.f65452s) && C41536l.m120484d(this.f65453t, eVar.f65453t);
    }

    /* renamed from: f */
    public final long mo64220f() {
        return this.f65447n;
    }

    /* renamed from: g */
    public final C25695d mo64221g() {
        return this.f65435b;
    }

    /* renamed from: h */
    public final String mo64222h() {
        return this.f65436c;
    }

    public int hashCode() {
        int hashCode = ((this.f65434a.hashCode() * 31) + this.f65435b.hashCode()) * 31;
        String str = this.f65436c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f65437d;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f65438e;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f65439f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f65440g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f65441h;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f65442i;
        int hashCode8 = (((((hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f65443j.hashCode()) * 31) + this.f65444k.hashCode()) * 31;
        String str6 = this.f65445l;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f65446m;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((((((((((((((hashCode9 + i) * 31) + C7397t.m28148a(this.f65447n)) * 31) + C7397t.m28148a(this.f65448o)) * 31) + this.f65449p.hashCode()) * 31) + this.f65450q.hashCode()) * 31) + this.f65451r.hashCode()) * 31) + this.f65452s.hashCode()) * 31) + this.f65453t.hashCode();
    }

    /* renamed from: i */
    public final List mo64224i() {
        return this.f65453t;
    }

    /* renamed from: j */
    public final String mo64225j() {
        return this.f65451r;
    }

    /* renamed from: k */
    public final String mo64226k() {
        return this.f65446m;
    }

    /* renamed from: l */
    public final Boolean mo64227l() {
        return this.f65438e;
    }

    /* renamed from: m */
    public final Boolean mo64228m() {
        return this.f65437d;
    }

    /* renamed from: n */
    public final String mo64229n() {
        return this.f65450q;
    }

    /* renamed from: o */
    public final String mo64230o() {
        return this.f65441h;
    }

    /* renamed from: p */
    public final String mo64231p() {
        return this.f65449p;
    }

    /* renamed from: q */
    public final String mo64232q() {
        return this.f65442i;
    }

    /* renamed from: r */
    public final BigDecimal mo64233r() {
        return this.f65444k;
    }

    /* renamed from: s */
    public final BigDecimal mo64234s() {
        return this.f65443j;
    }

    /* renamed from: t */
    public final String mo64235t() {
        return this.f65434a;
    }

    public String toString() {
        String str = this.f65434a;
        C25695d dVar = this.f65435b;
        String str2 = this.f65436c;
        Boolean bool = this.f65437d;
        Boolean bool2 = this.f65438e;
        String str3 = this.f65439f;
        String str4 = this.f65440g;
        String str5 = this.f65441h;
        String str6 = this.f65442i;
        BigDecimal bigDecimal = this.f65443j;
        BigDecimal bigDecimal2 = this.f65444k;
        String str7 = this.f65445l;
        String str8 = this.f65446m;
        long j = this.f65447n;
        long j2 = this.f65448o;
        String str9 = this.f65449p;
        String str10 = this.f65450q;
        String str11 = this.f65451r;
        List list = this.f65452s;
        List list2 = this.f65453t;
        return "DepositTypeDetails(prodType=" + str + ", depositType=" + dVar + ", dictionaryKey=" + str2 + ", hasPrimaryAccount=" + bool + ", hasInterestAccount=" + bool2 + ", advantagesKey=" + str3 + ", conditionsKey=" + str4 + ", minAmountKey=" + str5 + ", minMaxTermsKey=" + str6 + ", preContractIrrMinAmount=" + bigDecimal + ", preContractIrrMaxAmount=" + bigDecimal2 + ", commissionAmountKey=" + str7 + ", hasCampaign=" + str8 + ", depositMinEndDate=" + j + ", depositMaxEndDate=" + j2 + ", minIntRate=" + str9 + ", maxIntRate=" + str10 + ", effectiveRate=" + str11 + ", advantages=" + list + ", disAdvantages=" + list2 + ")";
    }
}
