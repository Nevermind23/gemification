package x90;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: x90.b */
public final class C29662b {

    /* renamed from: a */
    private final long f74853a;

    /* renamed from: b */
    private final String f74854b;

    /* renamed from: c */
    private final String f74855c;

    /* renamed from: d */
    private final double f74856d;

    /* renamed from: e */
    private final String f74857e;

    /* renamed from: f */
    private String f74858f;

    /* renamed from: g */
    private String f74859g;

    /* renamed from: h */
    private String f74860h;

    /* renamed from: i */
    private Long f74861i;

    /* renamed from: j */
    private String f74862j;

    /* renamed from: k */
    private String f74863k;

    /* renamed from: l */
    private String f74864l;

    /* renamed from: m */
    private String f74865m;

    /* renamed from: n */
    private C29663c f74866n;

    public C29662b(long j, String str, String str2, double d, String str3, String str4, String str5, String str6, Long l, String str7, String str8, String str9, String str10, C29663c cVar) {
        C29663c cVar2 = cVar;
        C41536l.m120489i(str2, "benefAcctNo");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(cVar2, "details");
        this.f74853a = j;
        this.f74854b = str;
        this.f74855c = str2;
        this.f74856d = d;
        this.f74857e = str3;
        this.f74858f = str4;
        this.f74859g = str5;
        this.f74860h = str6;
        this.f74861i = l;
        this.f74862j = str7;
        this.f74863k = str8;
        this.f74864l = str9;
        this.f74865m = str10;
        this.f74866n = cVar2;
    }

    /* renamed from: a */
    public final double mo69611a() {
        return this.f74856d;
    }

    /* renamed from: b */
    public final String mo69612b() {
        return this.f74855c;
    }

    /* renamed from: c */
    public final String mo69613c() {
        return this.f74854b;
    }

    /* renamed from: d */
    public final String mo69614d() {
        return this.f74857e;
    }

    /* renamed from: e */
    public final String mo69615e() {
        return this.f74862j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29662b)) {
            return false;
        }
        C29662b bVar = (C29662b) obj;
        return this.f74853a == bVar.f74853a && C41536l.m120484d(this.f74854b, bVar.f74854b) && C41536l.m120484d(this.f74855c, bVar.f74855c) && Double.compare(this.f74856d, bVar.f74856d) == 0 && C41536l.m120484d(this.f74857e, bVar.f74857e) && C41536l.m120484d(this.f74858f, bVar.f74858f) && C41536l.m120484d(this.f74859g, bVar.f74859g) && C41536l.m120484d(this.f74860h, bVar.f74860h) && C41536l.m120484d(this.f74861i, bVar.f74861i) && C41536l.m120484d(this.f74862j, bVar.f74862j) && C41536l.m120484d(this.f74863k, bVar.f74863k) && C41536l.m120484d(this.f74864l, bVar.f74864l) && C41536l.m120484d(this.f74865m, bVar.f74865m) && C41536l.m120484d(this.f74866n, bVar.f74866n);
    }

    /* renamed from: f */
    public final C29663c mo69617f() {
        return this.f74866n;
    }

    /* renamed from: g */
    public final String mo69618g() {
        return this.f74865m;
    }

    /* renamed from: h */
    public final Long mo69619h() {
        return this.f74861i;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f74853a) * 31;
        String str = this.f74854b;
        int i = 0;
        int hashCode = (((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f74855c.hashCode()) * 31) + Double.doubleToLongBits(this.f74856d)) * 31) + this.f74857e.hashCode()) * 31;
        String str2 = this.f74858f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f74859g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f74860h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f74861i;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.f74862j;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f74863k;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f74864l;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f74865m;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return ((hashCode8 + i) * 31) + this.f74866n.hashCode();
    }

    /* renamed from: i */
    public final long mo69621i() {
        return this.f74853a;
    }

    /* renamed from: j */
    public final String mo69622j() {
        return this.f74859g;
    }

    /* renamed from: k */
    public final String mo69623k() {
        return this.f74860h;
    }

    /* renamed from: l */
    public final String mo69624l() {
        return this.f74864l;
    }

    /* renamed from: m */
    public final String mo69625m() {
        return this.f74858f;
    }

    /* renamed from: n */
    public final String mo69626n() {
        return this.f74863k;
    }

    public String toString() {
        long j = this.f74853a;
        String str = this.f74854b;
        String str2 = this.f74855c;
        double d = this.f74856d;
        String str3 = this.f74857e;
        String str4 = this.f74858f;
        String str5 = this.f74859g;
        String str6 = this.f74860h;
        Long l = this.f74861i;
        String str7 = this.f74862j;
        String str8 = this.f74863k;
        String str9 = this.f74864l;
        String str10 = this.f74865m;
        C29663c cVar = this.f74866n;
        return "Sto(paymentId=" + j + ", benefName=" + str + ", benefAcctNo=" + str2 + ", amount=" + d + ", ccy=" + str3 + ", serviceCode=" + str4 + ", periodType=" + str5 + ", periodTypeDictionaryKey=" + str6 + ", nextSentDate=" + l + ", debitType=" + str7 + ", status=" + str8 + ", productCode=" + str9 + ", dictionaryKey=" + str10 + ", details=" + cVar + ")";
    }
}
