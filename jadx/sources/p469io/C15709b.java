package p469io;

import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: io.b */
public final class C15709b {

    /* renamed from: a */
    private final long f44555a;

    /* renamed from: b */
    private final String f44556b;

    /* renamed from: c */
    private final String f44557c;

    /* renamed from: d */
    private final int f44558d;

    /* renamed from: e */
    private final String f44559e;

    /* renamed from: f */
    private final Double f44560f;

    /* renamed from: g */
    private final String f44561g;

    /* renamed from: h */
    private final Double f44562h;

    /* renamed from: i */
    private final String f44563i;

    /* renamed from: j */
    private final Double f44564j;

    /* renamed from: k */
    private final String f44565k;

    /* renamed from: l */
    private final C15710c f44566l;

    /* renamed from: m */
    private final String f44567m;

    /* renamed from: n */
    private final String f44568n;

    /* renamed from: o */
    private final Double f44569o;

    /* renamed from: p */
    private final String f44570p;

    /* renamed from: q */
    private final String f44571q;

    /* renamed from: r */
    private final Boolean f44572r;

    /* renamed from: s */
    private final C15708a f44573s;

    /* renamed from: t */
    private final C15708a f44574t;

    /* renamed from: u */
    private final List f44575u;

    public C15709b(long j, String str, String str2, int i, String str3, Double d, String str4, Double d2, String str5, Double d3, String str6, C15710c cVar, String str7, String str8, Double d4, String str9, String str10, Boolean bool, C15708a aVar, C15708a aVar2, List list) {
        this.f44555a = j;
        this.f44556b = str;
        this.f44557c = str2;
        this.f44558d = i;
        this.f44559e = str3;
        this.f44560f = d;
        this.f44561g = str4;
        this.f44562h = d2;
        this.f44563i = str5;
        this.f44564j = d3;
        this.f44565k = str6;
        this.f44566l = cVar;
        this.f44567m = str7;
        this.f44568n = str8;
        this.f44569o = d4;
        this.f44570p = str9;
        this.f44571q = str10;
        this.f44572r = bool;
        this.f44573s = aVar;
        this.f44574t = aVar2;
        this.f44575u = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C15709b m56625b(C15709b bVar, long j, String str, String str2, int i, String str3, Double d, String str4, Double d2, String str5, Double d3, String str6, C15710c cVar, String str7, String str8, Double d4, String str9, String str10, Boolean bool, C15708a aVar, C15708a aVar2, List list, int i2, Object obj) {
        C15709b bVar2 = bVar;
        int i3 = i2;
        return bVar.mo43077a((i3 & 1) != 0 ? bVar2.f44555a : j, (i3 & 2) != 0 ? bVar2.f44556b : str, (i3 & 4) != 0 ? bVar2.f44557c : str2, (i3 & 8) != 0 ? bVar2.f44558d : i, (i3 & 16) != 0 ? bVar2.f44559e : str3, (i3 & 32) != 0 ? bVar2.f44560f : d, (i3 & 64) != 0 ? bVar2.f44561g : str4, (i3 & 128) != 0 ? bVar2.f44562h : d2, (i3 & C11398b.f33139r) != 0 ? bVar2.f44563i : str5, (i3 & C11398b.f33140s) != 0 ? bVar2.f44564j : d3, (i3 & C11398b.f33141t) != 0 ? bVar2.f44565k : str6, (i3 & C11398b.f33142u) != 0 ? bVar2.f44566l : cVar, (i3 & C11398b.f33143v) != 0 ? bVar2.f44567m : str7, (i3 & 8192) != 0 ? bVar2.f44568n : str8, (i3 & 16384) != 0 ? bVar2.f44569o : d4, (i3 & 32768) != 0 ? bVar2.f44570p : str9, (i3 & 65536) != 0 ? bVar2.f44571q : str10, (i3 & 131072) != 0 ? bVar2.f44572r : bool, (i3 & 262144) != 0 ? bVar2.f44573s : aVar, (i3 & 524288) != 0 ? bVar2.f44574t : aVar2, (i3 & 1048576) != 0 ? bVar2.f44575u : list);
    }

    /* renamed from: a */
    public final C15709b mo43077a(long j, String str, String str2, int i, String str3, Double d, String str4, Double d2, String str5, Double d3, String str6, C15710c cVar, String str7, String str8, Double d4, String str9, String str10, Boolean bool, C15708a aVar, C15708a aVar2, List list) {
        return new C15709b(j, str, str2, i, str3, d, str4, d2, str5, d3, str6, cVar, str7, str8, d4, str9, str10, bool, aVar, aVar2, list);
    }

    /* renamed from: c */
    public final C15708a mo43078c() {
        return this.f44573s;
    }

    /* renamed from: d */
    public final Double mo43079d() {
        return this.f44564j;
    }

    /* renamed from: e */
    public final String mo43080e() {
        return this.f44565k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15709b)) {
            return false;
        }
        C15709b bVar = (C15709b) obj;
        return this.f44555a == bVar.f44555a && C41536l.m120484d(this.f44556b, bVar.f44556b) && C41536l.m120484d(this.f44557c, bVar.f44557c) && this.f44558d == bVar.f44558d && C41536l.m120484d(this.f44559e, bVar.f44559e) && C41536l.m120484d(this.f44560f, bVar.f44560f) && C41536l.m120484d(this.f44561g, bVar.f44561g) && C41536l.m120484d(this.f44562h, bVar.f44562h) && C41536l.m120484d(this.f44563i, bVar.f44563i) && C41536l.m120484d(this.f44564j, bVar.f44564j) && C41536l.m120484d(this.f44565k, bVar.f44565k) && this.f44566l == bVar.f44566l && C41536l.m120484d(this.f44567m, bVar.f44567m) && C41536l.m120484d(this.f44568n, bVar.f44568n) && C41536l.m120484d(this.f44569o, bVar.f44569o) && C41536l.m120484d(this.f44570p, bVar.f44570p) && C41536l.m120484d(this.f44571q, bVar.f44571q) && C41536l.m120484d(this.f44572r, bVar.f44572r) && C41536l.m120484d(this.f44573s, bVar.f44573s) && C41536l.m120484d(this.f44574t, bVar.f44574t) && C41536l.m120484d(this.f44575u, bVar.f44575u);
    }

    /* renamed from: f */
    public final long mo43082f() {
        return this.f44555a;
    }

    /* renamed from: g */
    public final String mo43083g() {
        return this.f44557c;
    }

    /* renamed from: h */
    public final Double mo43084h() {
        return this.f44560f;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f44555a) * 31;
        String str = this.f44556b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f44557c;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f44558d) * 31;
        String str3 = this.f44559e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.f44560f;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.f44561g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.f44562h;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.f44563i;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d3 = this.f44564j;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str6 = this.f44565k;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C15710c cVar = this.f44566l;
        int hashCode10 = (hashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str7 = this.f44567m;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f44568n;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d4 = this.f44569o;
        int hashCode13 = (hashCode12 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str9 = this.f44570p;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f44571q;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.f44572r;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        C15708a aVar = this.f44573s;
        int hashCode17 = (hashCode16 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C15708a aVar2 = this.f44574t;
        int hashCode18 = (hashCode17 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        List list = this.f44575u;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode18 + i;
    }

    /* renamed from: i */
    public final String mo43086i() {
        return this.f44561g;
    }

    /* renamed from: j */
    public final String mo43087j() {
        return this.f44559e;
    }

    /* renamed from: k */
    public final Double mo43088k() {
        return this.f44569o;
    }

    /* renamed from: l */
    public final Double mo43089l() {
        return this.f44562h;
    }

    /* renamed from: m */
    public final String mo43090m() {
        return this.f44563i;
    }

    /* renamed from: n */
    public final List mo43091n() {
        return this.f44575u;
    }

    /* renamed from: o */
    public final String mo43092o() {
        return this.f44570p;
    }

    /* renamed from: p */
    public final String mo43093p() {
        return this.f44556b;
    }

    /* renamed from: q */
    public final C15710c mo43094q() {
        return this.f44566l;
    }

    /* renamed from: r */
    public final C15708a mo43095r() {
        return this.f44574t;
    }

    /* renamed from: s */
    public final int mo43096s() {
        return this.f44558d;
    }

    /* renamed from: t */
    public final Boolean mo43097t() {
        return this.f44572r;
    }

    public String toString() {
        long j = this.f44555a;
        String str = this.f44556b;
        String str2 = this.f44557c;
        int i = this.f44558d;
        String str3 = this.f44559e;
        Double d = this.f44560f;
        String str4 = this.f44561g;
        Double d2 = this.f44562h;
        String str5 = this.f44563i;
        Double d3 = this.f44564j;
        String str6 = this.f44565k;
        C15710c cVar = this.f44566l;
        String str7 = this.f44567m;
        String str8 = this.f44568n;
        Double d4 = this.f44569o;
        String str9 = this.f44570p;
        String str10 = this.f44571q;
        Boolean bool = this.f44572r;
        C15708a aVar = this.f44573s;
        C15708a aVar2 = this.f44574t;
        List list = this.f44575u;
        return "PackageItem(clientKey=" + j + ", packageName=" + str + ", description=" + str2 + ", priority=" + i + ", feePeriodType=" + str3 + ", feeAmount=" + d + ", feeCcy=" + str4 + ", monthlyFeeAmount=" + d2 + ", monthlyFeeCcy=" + str5 + ", annualFeeAmount=" + d3 + ", annualFeeCcy=" + str6 + ", packageStatus=" + cVar + ", recommendedPackage=" + str7 + ", limitType=" + str8 + ", initialLimitAmount=" + d4 + ", packageGroup=" + str9 + ", advertisementText=" + str10 + ", showDefault=" + bool + ", activePackageDetails=" + aVar + ", pendingPackageDetails=" + aVar2 + ", packageBenefits=" + list + ")";
    }
}
