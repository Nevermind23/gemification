package p596rp;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p469io.C15710c;

/* renamed from: rp.b */
public final class C17711b {

    /* renamed from: a */
    private final C17710a f49464a;

    /* renamed from: b */
    private final List f49465b;

    /* renamed from: c */
    private final Long f49466c;

    /* renamed from: d */
    private final String f49467d;

    /* renamed from: e */
    private final Double f49468e;

    /* renamed from: f */
    private final String f49469f;

    /* renamed from: g */
    private final String f49470g;

    /* renamed from: h */
    private final String f49471h;

    /* renamed from: i */
    private final String f49472i;

    /* renamed from: j */
    private final C15710c f49473j;

    /* renamed from: k */
    private final Double f49474k;

    /* renamed from: l */
    private final Double f49475l;

    /* renamed from: m */
    private final Integer f49476m;

    /* renamed from: n */
    private final String f49477n;

    /* renamed from: o */
    private final String f49478o;

    public C17711b(C17710a aVar, List list, Long l, String str, Double d, String str2, String str3, String str4, String str5, C15710c cVar, Double d2, Double d3, Integer num, String str6, String str7) {
        C41536l.m120489i(list, "paymentTypes");
        this.f49464a = aVar;
        this.f49465b = list;
        this.f49466c = l;
        this.f49467d = str;
        this.f49468e = d;
        this.f49469f = str2;
        this.f49470g = str3;
        this.f49471h = str4;
        this.f49472i = str5;
        this.f49473j = cVar;
        this.f49474k = d2;
        this.f49475l = d3;
        this.f49476m = num;
        this.f49477n = str6;
        this.f49478o = str7;
    }

    /* renamed from: a */
    public final Double mo45280a() {
        return this.f49474k;
    }

    /* renamed from: b */
    public final String mo45281b() {
        return this.f49477n;
    }

    /* renamed from: c */
    public final String mo45282c() {
        return this.f49472i;
    }

    /* renamed from: d */
    public final List mo45283d() {
        return this.f49465b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17711b)) {
            return false;
        }
        C17711b bVar = (C17711b) obj;
        return C41536l.m120484d(this.f49464a, bVar.f49464a) && C41536l.m120484d(this.f49465b, bVar.f49465b) && C41536l.m120484d(this.f49466c, bVar.f49466c) && C41536l.m120484d(this.f49467d, bVar.f49467d) && C41536l.m120484d(this.f49468e, bVar.f49468e) && C41536l.m120484d(this.f49469f, bVar.f49469f) && C41536l.m120484d(this.f49470g, bVar.f49470g) && C41536l.m120484d(this.f49471h, bVar.f49471h) && C41536l.m120484d(this.f49472i, bVar.f49472i) && this.f49473j == bVar.f49473j && C41536l.m120484d(this.f49474k, bVar.f49474k) && C41536l.m120484d(this.f49475l, bVar.f49475l) && C41536l.m120484d(this.f49476m, bVar.f49476m) && C41536l.m120484d(this.f49477n, bVar.f49477n) && C41536l.m120484d(this.f49478o, bVar.f49478o);
    }

    public int hashCode() {
        C17710a aVar = this.f49464a;
        int i = 0;
        int hashCode = (((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f49465b.hashCode()) * 31;
        Long l = this.f49466c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f49467d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f49468e;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f49469f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49470g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f49471h;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f49472i;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C15710c cVar = this.f49473j;
        int hashCode9 = (hashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Double d2 = this.f49474k;
        int hashCode10 = (hashCode9 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f49475l;
        int hashCode11 = (hashCode10 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f49476m;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f49477n;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f49478o;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        C17710a aVar = this.f49464a;
        List list = this.f49465b;
        Long l = this.f49466c;
        String str = this.f49467d;
        Double d = this.f49468e;
        String str2 = this.f49469f;
        String str3 = this.f49470g;
        String str4 = this.f49471h;
        String str5 = this.f49472i;
        C15710c cVar = this.f49473j;
        Double d2 = this.f49474k;
        Double d3 = this.f49475l;
        Integer num = this.f49476m;
        String str6 = this.f49477n;
        String str7 = this.f49478o;
        return "PackageItemUiModel(activePackageDetails=" + aVar + ", paymentTypes=" + list + ", clientKey=" + l + ", description=" + str + ", feeAmount=" + d + ", feeCcy=" + str2 + ", feePeriodType=" + str3 + ", packageGroup=" + str4 + ", packageName=" + str5 + ", packageStatus=" + cVar + ", annualFeeAmount=" + d2 + ", monthlyFeeAmount=" + d3 + ", priority=" + num + ", annualFeeCcy=" + str6 + ", monthlyFeeCcy=" + str7 + ")";
    }
}
