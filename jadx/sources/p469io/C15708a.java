package p469io;

import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p455ho.C15552f;

/* renamed from: io.a */
public final class C15708a {

    /* renamed from: a */
    private final long f44535a;

    /* renamed from: b */
    private final String f44536b;

    /* renamed from: c */
    private final String f44537c;

    /* renamed from: d */
    private final C15552f f44538d;

    /* renamed from: e */
    private final String f44539e;

    /* renamed from: f */
    private final Double f44540f;

    /* renamed from: g */
    private final String f44541g;

    /* renamed from: h */
    private final Double f44542h;

    /* renamed from: i */
    private final Long f44543i;

    /* renamed from: j */
    private final Long f44544j;

    /* renamed from: k */
    private final Long f44545k;

    /* renamed from: l */
    private final Double f44546l;

    /* renamed from: m */
    private final Long f44547m;

    /* renamed from: n */
    private final C15710c f44548n;

    /* renamed from: o */
    private final Integer f44549o;

    /* renamed from: p */
    private final C24978b f44550p;

    /* renamed from: q */
    private final C24978b f44551q;

    /* renamed from: r */
    private final C24978b f44552r;

    /* renamed from: s */
    private final C24978b f44553s;

    /* renamed from: t */
    private final long f44554t;

    public C15708a(long j, String str, String str2, C15552f fVar, String str3, Double d, String str4, Double d2, Long l, Long l2, Long l3, Double d3, Long l4, C15710c cVar, Integer num, C24978b bVar, C24978b bVar2, C24978b bVar3, C24978b bVar4, long j2) {
        C24978b bVar5 = bVar;
        C24978b bVar6 = bVar2;
        C24978b bVar7 = bVar3;
        C24978b bVar8 = bVar4;
        C41536l.m120489i(str, "packageName");
        C41536l.m120489i(bVar5, "displayActivePackageChange");
        C41536l.m120489i(bVar6, "displayStandardFee");
        C41536l.m120489i(bVar7, "displayTransactionStatistics");
        C41536l.m120489i(bVar8, "closable");
        this.f44535a = j;
        this.f44536b = str;
        this.f44537c = str2;
        this.f44538d = fVar;
        this.f44539e = str3;
        this.f44540f = d;
        this.f44541g = str4;
        this.f44542h = d2;
        this.f44543i = l;
        this.f44544j = l2;
        this.f44545k = l3;
        this.f44546l = d3;
        this.f44547m = l4;
        this.f44548n = cVar;
        this.f44549o = num;
        this.f44550p = bVar5;
        this.f44551q = bVar6;
        this.f44552r = bVar7;
        this.f44553s = bVar8;
        this.f44554t = j2;
    }

    /* renamed from: a */
    public final C24978b mo43054a() {
        return this.f44553s;
    }

    /* renamed from: b */
    public final long mo43055b() {
        return this.f44554t;
    }

    /* renamed from: c */
    public final C24978b mo43056c() {
        return this.f44550p;
    }

    /* renamed from: d */
    public final C24978b mo43057d() {
        return this.f44551q;
    }

    /* renamed from: e */
    public final C24978b mo43058e() {
        return this.f44552r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15708a)) {
            return false;
        }
        C15708a aVar = (C15708a) obj;
        return this.f44535a == aVar.f44535a && C41536l.m120484d(this.f44536b, aVar.f44536b) && C41536l.m120484d(this.f44537c, aVar.f44537c) && this.f44538d == aVar.f44538d && C41536l.m120484d(this.f44539e, aVar.f44539e) && C41536l.m120484d(this.f44540f, aVar.f44540f) && C41536l.m120484d(this.f44541g, aVar.f44541g) && C41536l.m120484d(this.f44542h, aVar.f44542h) && C41536l.m120484d(this.f44543i, aVar.f44543i) && C41536l.m120484d(this.f44544j, aVar.f44544j) && C41536l.m120484d(this.f44545k, aVar.f44545k) && C41536l.m120484d(this.f44546l, aVar.f44546l) && C41536l.m120484d(this.f44547m, aVar.f44547m) && this.f44548n == aVar.f44548n && C41536l.m120484d(this.f44549o, aVar.f44549o) && this.f44550p == aVar.f44550p && this.f44551q == aVar.f44551q && this.f44552r == aVar.f44552r && this.f44553s == aVar.f44553s && this.f44554t == aVar.f44554t;
    }

    /* renamed from: f */
    public final Long mo43060f() {
        return this.f44544j;
    }

    /* renamed from: g */
    public final Double mo43061g() {
        return this.f44540f;
    }

    /* renamed from: h */
    public final String mo43062h() {
        return this.f44539e;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f44535a) * 31) + this.f44536b.hashCode()) * 31;
        String str = this.f44537c;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        C15552f fVar = this.f44538d;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str2 = this.f44539e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f44540f;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.f44541g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d2 = this.f44542h;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.f44543i;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f44544j;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f44545k;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d3 = this.f44546l;
        int hashCode10 = (hashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l4 = this.f44547m;
        int hashCode11 = (hashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        C15710c cVar = this.f44548n;
        int hashCode12 = (hashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.f44549o;
        if (num != null) {
            i = num.hashCode();
        }
        return ((((((((((hashCode12 + i) * 31) + this.f44550p.hashCode()) * 31) + this.f44551q.hashCode()) * 31) + this.f44552r.hashCode()) * 31) + this.f44553s.hashCode()) * 31) + C7397t.m28148a(this.f44554t);
    }

    /* renamed from: i */
    public final Double mo43064i() {
        return this.f44546l;
    }

    /* renamed from: j */
    public final C15552f mo43065j() {
        return this.f44538d;
    }

    /* renamed from: k */
    public final Long mo43066k() {
        return this.f44547m;
    }

    /* renamed from: l */
    public final Double mo43067l() {
        return this.f44542h;
    }

    /* renamed from: m */
    public final String mo43068m() {
        return this.f44541g;
    }

    /* renamed from: n */
    public final Long mo43069n() {
        return this.f44545k;
    }

    /* renamed from: o */
    public final String mo43070o() {
        return this.f44537c;
    }

    /* renamed from: p */
    public final long mo43071p() {
        return this.f44535a;
    }

    /* renamed from: q */
    public final String mo43072q() {
        return this.f44536b;
    }

    /* renamed from: r */
    public final Integer mo43073r() {
        return this.f44549o;
    }

    /* renamed from: s */
    public final Long mo43074s() {
        return this.f44543i;
    }

    /* renamed from: t */
    public final C15710c mo43075t() {
        return this.f44548n;
    }

    public String toString() {
        long j = this.f44535a;
        String str = this.f44536b;
        String str2 = this.f44537c;
        C15552f fVar = this.f44538d;
        String str3 = this.f44539e;
        Double d = this.f44540f;
        String str4 = this.f44541g;
        Double d2 = this.f44542h;
        Long l = this.f44543i;
        Long l2 = this.f44544j;
        Long l3 = this.f44545k;
        Double d3 = this.f44546l;
        Long l4 = this.f44547m;
        C15710c cVar = this.f44548n;
        Integer num = this.f44549o;
        C24978b bVar = this.f44550p;
        C24978b bVar2 = this.f44551q;
        C24978b bVar3 = this.f44552r;
        Long l5 = l4;
        long j2 = this.f44554t;
        return "PackageDetails(packageId=" + j + ", packageName=" + str + ", packageDesc=" + str2 + ", feePeriodType=" + fVar + ", feeCcy=" + str3 + ", feeAmount=" + d + ", limitType=" + str4 + ", initialLimitAmount=" + d2 + ", startDate=" + l + ", endDate=" + l2 + ", nextFeeGenDate=" + l3 + ", feeOverdueAmount=" + d3 + ", graceEndDate=" + l5 + ", status=" + cVar + ", priority=" + num + ", displayActivePackageChange=" + bVar + ", displayStandardFee=" + bVar2 + ", displayTransactionStatistics=" + bVar3 + ", closable=" + this.f44553s + ", closePackageId=" + j2 + ")";
    }
}
