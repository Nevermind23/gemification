package s31;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: s31.a */
public final class C38421a {

    /* renamed from: a */
    private final long f92010a;

    /* renamed from: b */
    private final String f92011b;

    /* renamed from: c */
    private final String f92012c;

    /* renamed from: d */
    private final String f92013d;

    /* renamed from: e */
    private final Object f92014e;

    /* renamed from: f */
    private final String f92015f;

    /* renamed from: g */
    private final String f92016g;

    /* renamed from: h */
    private final String f92017h;

    /* renamed from: i */
    private final String f92018i;

    /* renamed from: j */
    private final String f92019j;

    /* renamed from: k */
    private final int f92020k;

    /* renamed from: l */
    private final String f92021l;

    /* renamed from: m */
    private final String f92022m;

    /* renamed from: n */
    private final Object f92023n;

    /* renamed from: o */
    private final Double f92024o;

    /* renamed from: p */
    private final boolean f92025p;

    /* renamed from: q */
    private final boolean f92026q;

    /* renamed from: r */
    private final boolean f92027r;

    /* renamed from: s */
    private final Integer f92028s;

    /* renamed from: t */
    private final String f92029t;

    /* renamed from: u */
    private final String f92030u;

    /* renamed from: v */
    private final String f92031v;

    /* renamed from: w */
    private final C38424d f92032w;

    public C38421a(long j, String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, Object obj2, Double d, boolean z, boolean z2, boolean z3, Integer num, String str11, String str12, String str13, C38424d dVar) {
        String str14 = str7;
        String str15 = str8;
        C38424d dVar2 = dVar;
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str3, "serviceType");
        C41536l.m120489i(str14, "serviceName");
        C41536l.m120489i(str15, "channel");
        C41536l.m120489i(dVar2, "serviceConfigJson");
        this.f92010a = j;
        this.f92011b = str;
        this.f92012c = str2;
        this.f92013d = str3;
        this.f92014e = obj;
        this.f92015f = str4;
        this.f92016g = str5;
        this.f92017h = str6;
        this.f92018i = str14;
        this.f92019j = str15;
        this.f92020k = i;
        this.f92021l = str9;
        this.f92022m = str10;
        this.f92023n = obj2;
        this.f92024o = d;
        this.f92025p = z;
        this.f92026q = z2;
        this.f92027r = z3;
        this.f92028s = num;
        this.f92029t = str11;
        this.f92030u = str12;
        this.f92031v = str13;
        this.f92032w = dVar2;
    }

    /* renamed from: a */
    public final String mo91947a() {
        return this.f92015f;
    }

    /* renamed from: b */
    public final String mo91948b() {
        return this.f92021l;
    }

    /* renamed from: c */
    public final String mo91949c() {
        return this.f92012c;
    }

    /* renamed from: d */
    public final C38424d mo91950d() {
        return this.f92032w;
    }

    /* renamed from: e */
    public final String mo91951e() {
        return this.f92011b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38421a)) {
            return false;
        }
        C38421a aVar = (C38421a) obj;
        return this.f92010a == aVar.f92010a && C41536l.m120484d(this.f92011b, aVar.f92011b) && C41536l.m120484d(this.f92012c, aVar.f92012c) && C41536l.m120484d(this.f92013d, aVar.f92013d) && C41536l.m120484d(this.f92014e, aVar.f92014e) && C41536l.m120484d(this.f92015f, aVar.f92015f) && C41536l.m120484d(this.f92016g, aVar.f92016g) && C41536l.m120484d(this.f92017h, aVar.f92017h) && C41536l.m120484d(this.f92018i, aVar.f92018i) && C41536l.m120484d(this.f92019j, aVar.f92019j) && this.f92020k == aVar.f92020k && C41536l.m120484d(this.f92021l, aVar.f92021l) && C41536l.m120484d(this.f92022m, aVar.f92022m) && C41536l.m120484d(this.f92023n, aVar.f92023n) && C41536l.m120484d(this.f92024o, aVar.f92024o) && this.f92025p == aVar.f92025p && this.f92026q == aVar.f92026q && this.f92027r == aVar.f92027r && C41536l.m120484d(this.f92028s, aVar.f92028s) && C41536l.m120484d(this.f92029t, aVar.f92029t) && C41536l.m120484d(this.f92030u, aVar.f92030u) && C41536l.m120484d(this.f92031v, aVar.f92031v) && C41536l.m120484d(this.f92032w, aVar.f92032w);
    }

    /* renamed from: f */
    public final String mo91953f() {
        return this.f92018i;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f92010a) * 31) + this.f92011b.hashCode()) * 31;
        String str = this.f92012c;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f92013d.hashCode()) * 31;
        Object obj = this.f92014e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.f92015f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92016g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f92017h;
        int hashCode5 = (((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f92018i.hashCode()) * 31) + this.f92019j.hashCode()) * 31) + this.f92020k) * 31;
        String str5 = this.f92021l;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f92022m;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj2 = this.f92023n;
        int hashCode8 = (hashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Double d = this.f92024o;
        int hashCode9 = (hashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        boolean z = this.f92025p;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f92026q;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f92027r;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        Integer num = this.f92028s;
        int hashCode10 = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f92029t;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f92030u;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f92031v;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return ((hashCode12 + i) * 31) + this.f92032w.hashCode();
    }

    public String toString() {
        long j = this.f92010a;
        String str = this.f92011b;
        String str2 = this.f92012c;
        String str3 = this.f92013d;
        Object obj = this.f92014e;
        String str4 = this.f92015f;
        String str5 = this.f92016g;
        String str6 = this.f92017h;
        String str7 = this.f92018i;
        String str8 = this.f92019j;
        int i = this.f92020k;
        String str9 = this.f92021l;
        String str10 = this.f92022m;
        Object obj2 = this.f92023n;
        Double d = this.f92024o;
        boolean z = this.f92025p;
        boolean z2 = this.f92026q;
        boolean z3 = this.f92027r;
        Integer num = this.f92028s;
        String str11 = this.f92029t;
        String str12 = this.f92030u;
        String str13 = this.f92031v;
        C38424d dVar = this.f92032w;
        return "PaymentConfigDetails(id=" + j + ", serviceId=" + str + ", paymentServiceId=" + str2 + ", serviceType=" + str3 + ", serviceConfig=" + obj + ", debtServiceId=" + str4 + ", commission=" + str5 + ", serviceCategory=" + str6 + ", serviceName=" + str7 + ", channel=" + str8 + ", orderingNumber=" + i + ", logo=" + str9 + ", additionalData=" + str10 + ", bonusProductTypes=" + obj2 + ", payAmountLimit=" + d + ", isTemplateAccessAllowed=" + z + ", isCarTemplateAllowed=" + z2 + ", hasDebt=" + z3 + ", orderId=" + num + ", categoryColor=" + str11 + ", categoryIconColor=" + str12 + ", categoryType=" + str13 + ", serviceConfigJson=" + dVar + ")";
    }
}
