package p812kv;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: kv.b */
public final class C25779b {

    /* renamed from: a */
    private final long f65574a;

    /* renamed from: b */
    private final boolean f65575b;

    /* renamed from: c */
    private final C25781d f65576c;

    /* renamed from: d */
    private final String f65577d;

    /* renamed from: e */
    private final String f65578e;

    /* renamed from: f */
    private final String f65579f;

    /* renamed from: g */
    private final double f65580g;

    /* renamed from: h */
    private final double f65581h;

    /* renamed from: i */
    private final String f65582i;

    /* renamed from: j */
    private final String f65583j;

    /* renamed from: k */
    private final boolean f65584k;

    /* renamed from: l */
    private final boolean f65585l;

    /* renamed from: m */
    private final C25782e f65586m;

    /* renamed from: n */
    private final String f65587n;

    /* renamed from: o */
    private final boolean f65588o;

    /* renamed from: p */
    private final List f65589p;

    /* renamed from: q */
    private final List f65590q;

    public C25779b(long j, boolean z, C25781d dVar, String str, String str2, String str3, double d, double d2, String str4, String str5, boolean z2, boolean z3, C25782e eVar, String str6, boolean z4, List list, List list2) {
        String str7 = str4;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(dVar, "requestType");
        C41536l.m120489i(str, "clientKey");
        C41536l.m120489i(str7, "ccy");
        C41536l.m120489i(list3, "receivers");
        C41536l.m120489i(list4, "operations");
        this.f65574a = j;
        this.f65575b = z;
        this.f65576c = dVar;
        this.f65577d = str;
        this.f65578e = str2;
        this.f65579f = str3;
        this.f65580g = d;
        this.f65581h = d2;
        this.f65582i = str7;
        this.f65583j = str5;
        this.f65584k = z2;
        this.f65585l = z3;
        this.f65586m = eVar;
        this.f65587n = str6;
        this.f65588o = z4;
        this.f65589p = list3;
        this.f65590q = list4;
    }

    /* renamed from: a */
    public final String mo64381a() {
        return this.f65578e;
    }

    /* renamed from: b */
    public final double mo64382b() {
        return this.f65580g;
    }

    /* renamed from: c */
    public final String mo64383c() {
        return this.f65583j;
    }

    /* renamed from: d */
    public final boolean mo64384d() {
        return this.f65588o;
    }

    /* renamed from: e */
    public final long mo64385e() {
        return this.f65574a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25779b)) {
            return false;
        }
        C25779b bVar = (C25779b) obj;
        return this.f65574a == bVar.f65574a && this.f65575b == bVar.f65575b && this.f65576c == bVar.f65576c && C41536l.m120484d(this.f65577d, bVar.f65577d) && C41536l.m120484d(this.f65578e, bVar.f65578e) && C41536l.m120484d(this.f65579f, bVar.f65579f) && Double.compare(this.f65580g, bVar.f65580g) == 0 && Double.compare(this.f65581h, bVar.f65581h) == 0 && C41536l.m120484d(this.f65582i, bVar.f65582i) && C41536l.m120484d(this.f65583j, bVar.f65583j) && this.f65584k == bVar.f65584k && this.f65585l == bVar.f65585l && this.f65586m == bVar.f65586m && C41536l.m120484d(this.f65587n, bVar.f65587n) && this.f65588o == bVar.f65588o && C41536l.m120484d(this.f65589p, bVar.f65589p) && C41536l.m120484d(this.f65590q, bVar.f65590q);
    }

    /* renamed from: f */
    public final List mo64387f() {
        return this.f65590q;
    }

    /* renamed from: g */
    public final double mo64388g() {
        return this.f65581h;
    }

    /* renamed from: h */
    public final List mo64389h() {
        return this.f65589p;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f65574a) * 31;
        boolean z = this.f65575b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((a + (z ? 1 : 0)) * 31) + this.f65576c.hashCode()) * 31) + this.f65577d.hashCode()) * 31;
        String str = this.f65578e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65579f;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.doubleToLongBits(this.f65580g)) * 31) + Double.doubleToLongBits(this.f65581h)) * 31) + this.f65582i.hashCode()) * 31;
        String str3 = this.f65583j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z3 = this.f65584k;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode4 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f65585l;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        C25782e eVar = this.f65586m;
        int hashCode5 = (i3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str4 = this.f65587n;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i4 = (hashCode5 + i) * 31;
        boolean z5 = this.f65588o;
        if (!z5) {
            z2 = z5;
        }
        return ((((i4 + (z2 ? 1 : 0)) * 31) + this.f65589p.hashCode()) * 31) + this.f65590q.hashCode();
    }

    /* renamed from: i */
    public final C25782e mo64391i() {
        return this.f65586m;
    }

    /* renamed from: j */
    public final String mo64392j() {
        return this.f65587n;
    }

    /* renamed from: k */
    public final C25781d mo64393k() {
        return this.f65576c;
    }

    /* renamed from: l */
    public final boolean mo64394l() {
        return this.f65575b;
    }

    public String toString() {
        long j = this.f65574a;
        boolean z = this.f65575b;
        C25781d dVar = this.f65576c;
        String str = this.f65577d;
        String str2 = this.f65578e;
        String str3 = this.f65579f;
        double d = this.f65580g;
        double d2 = this.f65581h;
        String str4 = this.f65582i;
        String str5 = this.f65583j;
        boolean z2 = this.f65584k;
        boolean z3 = this.f65585l;
        C25782e eVar = this.f65586m;
        String str6 = this.f65587n;
        boolean z4 = this.f65588o;
        List list = this.f65589p;
        List list2 = this.f65590q;
        return "MoneyRequest(id=" + j + ", isOutGoingRequest=" + z + ", requestType=" + dVar + ", clientKey=" + str + ", acctNo=" + str2 + ", acctKey=" + str3 + ", amount=" + d + ", receivedAmount=" + d2 + ", ccy=" + str4 + ", description=" + str5 + ", canSplit=" + z2 + ", includeSelf=" + z3 + ", requestState=" + eVar + ", requestStateDescriptionKey=" + str6 + ", hasWarning=" + z4 + ", receivers=" + list + ", operations=" + list2 + ")";
    }
}
