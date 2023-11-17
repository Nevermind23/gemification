package cx0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: cx0.a */
public final class C31453a {

    /* renamed from: B */
    public static final C31454a f78000B = new C31454a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final String f78001A;

    /* renamed from: a */
    private final boolean f78002a;

    /* renamed from: b */
    private final boolean f78003b;

    /* renamed from: c */
    private final long f78004c;

    /* renamed from: d */
    private final String f78005d;

    /* renamed from: e */
    private final String f78006e;

    /* renamed from: f */
    private final String f78007f;

    /* renamed from: g */
    private final String f78008g;

    /* renamed from: h */
    private final String f78009h;

    /* renamed from: i */
    private final String f78010i;

    /* renamed from: j */
    private final String f78011j;

    /* renamed from: k */
    private final String f78012k;

    /* renamed from: l */
    private final String f78013l;

    /* renamed from: m */
    private final int f78014m;

    /* renamed from: n */
    private final String f78015n;

    /* renamed from: o */
    private final Double f78016o;

    /* renamed from: p */
    private final boolean f78017p;

    /* renamed from: q */
    private final boolean f78018q;

    /* renamed from: r */
    private final boolean f78019r;

    /* renamed from: s */
    private final String f78020s;

    /* renamed from: t */
    private final String f78021t;

    /* renamed from: u */
    private final String f78022u;

    /* renamed from: v */
    private final String f78023v;

    /* renamed from: w */
    private final Boolean f78024w;

    /* renamed from: x */
    private final String f78025x;

    /* renamed from: y */
    private final boolean f78026y;

    /* renamed from: z */
    private final String f78027z;

    /* renamed from: cx0.a$a */
    public static final class C31454a {
        private C31454a() {
        }

        public /* synthetic */ C31454a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C31453a(boolean z, boolean z2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, Double d, boolean z3, boolean z4, boolean z5, String str11, String str12, String str13, String str14, Boolean bool, String str15, boolean z6, String str16, String str17) {
        String str18 = str3;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        String str22 = str17;
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str18, "serviceType");
        C41536l.m120489i(str19, "serviceName");
        C41536l.m120489i(str20, "serviceNameDictValue");
        C41536l.m120489i(str21, "channel");
        C41536l.m120489i(str22, "searchKeysDictValue");
        this.f78002a = z;
        this.f78003b = z2;
        this.f78004c = j;
        this.f78005d = str;
        this.f78006e = str2;
        this.f78007f = str18;
        this.f78008g = str4;
        this.f78009h = str5;
        this.f78010i = str6;
        this.f78011j = str19;
        this.f78012k = str20;
        this.f78013l = str21;
        this.f78014m = i;
        this.f78015n = str10;
        this.f78016o = d;
        this.f78017p = z3;
        this.f78018q = z4;
        this.f78019r = z5;
        this.f78020s = str11;
        this.f78021t = str12;
        this.f78022u = str13;
        this.f78023v = str14;
        this.f78024w = bool;
        this.f78025x = str15;
        this.f78026y = z6;
        this.f78027z = str16;
        this.f78001A = str22;
    }

    /* renamed from: A */
    public final boolean mo71815A() {
        return this.f78017p;
    }

    /* renamed from: a */
    public final String mo71816a() {
        return this.f78020s;
    }

    /* renamed from: b */
    public final String mo71817b() {
        return this.f78021t;
    }

    /* renamed from: c */
    public final String mo71818c() {
        return this.f78022u;
    }

    /* renamed from: d */
    public final String mo71819d() {
        return this.f78023v;
    }

    /* renamed from: e */
    public final String mo71820e() {
        return this.f78013l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31453a)) {
            return false;
        }
        C31453a aVar = (C31453a) obj;
        return this.f78002a == aVar.f78002a && this.f78003b == aVar.f78003b && this.f78004c == aVar.f78004c && C41536l.m120484d(this.f78005d, aVar.f78005d) && C41536l.m120484d(this.f78006e, aVar.f78006e) && C41536l.m120484d(this.f78007f, aVar.f78007f) && C41536l.m120484d(this.f78008g, aVar.f78008g) && C41536l.m120484d(this.f78009h, aVar.f78009h) && C41536l.m120484d(this.f78010i, aVar.f78010i) && C41536l.m120484d(this.f78011j, aVar.f78011j) && C41536l.m120484d(this.f78012k, aVar.f78012k) && C41536l.m120484d(this.f78013l, aVar.f78013l) && this.f78014m == aVar.f78014m && C41536l.m120484d(this.f78015n, aVar.f78015n) && C41536l.m120484d(this.f78016o, aVar.f78016o) && this.f78017p == aVar.f78017p && this.f78018q == aVar.f78018q && this.f78019r == aVar.f78019r && C41536l.m120484d(this.f78020s, aVar.f78020s) && C41536l.m120484d(this.f78021t, aVar.f78021t) && C41536l.m120484d(this.f78022u, aVar.f78022u) && C41536l.m120484d(this.f78023v, aVar.f78023v) && C41536l.m120484d(this.f78024w, aVar.f78024w) && C41536l.m120484d(this.f78025x, aVar.f78025x) && this.f78026y == aVar.f78026y && C41536l.m120484d(this.f78027z, aVar.f78027z) && C41536l.m120484d(this.f78001A, aVar.f78001A);
    }

    /* renamed from: f */
    public final String mo71822f() {
        return this.f78009h;
    }

    /* renamed from: g */
    public final boolean mo71823g() {
        return this.f78026y;
    }

    /* renamed from: h */
    public final String mo71824h() {
        return this.f78008g;
    }

    public int hashCode() {
        boolean z = this.f78002a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f78003b;
        if (z3) {
            z3 = true;
        }
        int a = (((((i + (z3 ? 1 : 0)) * 31) + C7397t.m28148a(this.f78004c)) * 31) + this.f78005d.hashCode()) * 31;
        String str = this.f78006e;
        int i2 = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f78007f.hashCode()) * 31;
        String str2 = this.f78008g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f78009h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f78010i;
        int hashCode4 = (((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f78011j.hashCode()) * 31) + this.f78012k.hashCode()) * 31) + this.f78013l.hashCode()) * 31) + this.f78014m) * 31;
        String str5 = this.f78015n;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.f78016o;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        boolean z4 = this.f78017p;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode6 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f78018q;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f78019r;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        String str6 = this.f78020s;
        int hashCode7 = (i5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f78021t;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f78022u;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f78023v;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.f78024w;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.f78025x;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        boolean z7 = this.f78026y;
        if (!z7) {
            z2 = z7;
        }
        int i6 = (hashCode12 + (z2 ? 1 : 0)) * 31;
        String str11 = this.f78027z;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return ((i6 + i2) * 31) + this.f78001A.hashCode();
    }

    /* renamed from: i */
    public final boolean mo71826i() {
        return this.f78019r;
    }

    /* renamed from: j */
    public final long mo71827j() {
        return this.f78004c;
    }

    /* renamed from: k */
    public final String mo71828k() {
        return this.f78015n;
    }

    /* renamed from: l */
    public final String mo71829l() {
        return this.f78025x;
    }

    /* renamed from: m */
    public final int mo71830m() {
        return this.f78014m;
    }

    /* renamed from: n */
    public final Double mo71831n() {
        return this.f78016o;
    }

    /* renamed from: o */
    public final String mo71832o() {
        return this.f78006e;
    }

    /* renamed from: p */
    public final String mo71833p() {
        return this.f78001A;
    }

    /* renamed from: q */
    public final String mo71834q() {
        return this.f78027z;
    }

    /* renamed from: r */
    public final String mo71835r() {
        return this.f78010i;
    }

    /* renamed from: s */
    public final String mo71836s() {
        return this.f78005d;
    }

    /* renamed from: t */
    public final String mo71837t() {
        return this.f78011j;
    }

    public String toString() {
        boolean z = this.f78002a;
        boolean z2 = this.f78003b;
        long j = this.f78004c;
        String str = this.f78005d;
        String str2 = this.f78006e;
        String str3 = this.f78007f;
        String str4 = this.f78008g;
        String str5 = this.f78009h;
        String str6 = this.f78010i;
        String str7 = this.f78011j;
        String str8 = this.f78012k;
        String str9 = this.f78013l;
        int i = this.f78014m;
        String str10 = this.f78015n;
        Double d = this.f78016o;
        boolean z3 = this.f78017p;
        boolean z4 = this.f78018q;
        boolean z5 = this.f78019r;
        String str11 = this.f78020s;
        String str12 = this.f78021t;
        String str13 = this.f78022u;
        String str14 = this.f78023v;
        Boolean bool = this.f78024w;
        String str15 = this.f78025x;
        boolean z6 = this.f78026y;
        String str16 = this.f78027z;
        String str17 = this.f78001A;
        return "PaymentConfig(isDDAllowed=" + z + ", templateAllowed=" + z2 + ", id=" + j + ", serviceId=" + str + ", paymentServiceId=" + str2 + ", serviceType=" + str3 + ", debtServiceId=" + str4 + ", commission=" + str5 + ", serviceCategory=" + str6 + ", serviceName=" + str7 + ", serviceNameDictValue=" + str8 + ", channel=" + str9 + ", orderingNumber=" + i + ", logo=" + str10 + ", payAmountLimit=" + d + ", isTemplateAccessAllowed=" + z3 + ", isCarTemplateAllowed=" + z4 + ", hasDebt=" + z5 + ", additionalData=" + str11 + ", bonusProductTypes=" + str12 + ", categoryColor=" + str13 + ", categoryIconColor=" + str14 + ", isPopular=" + bool + ", oldLogo=" + str15 + ", ddEnabled=" + z6 + ", searchKeysDictionaryKey=" + str16 + ", searchKeysDictValue=" + str17 + ")";
    }

    /* renamed from: u */
    public final String mo71839u() {
        return this.f78012k;
    }

    /* renamed from: v */
    public final String mo71840v() {
        return this.f78007f;
    }

    /* renamed from: w */
    public final boolean mo71841w() {
        return this.f78003b;
    }

    /* renamed from: x */
    public final boolean mo71842x() {
        return this.f78018q;
    }

    /* renamed from: y */
    public final boolean mo71843y() {
        return this.f78002a;
    }

    /* renamed from: z */
    public final Boolean mo71844z() {
        return this.f78024w;
    }
}
