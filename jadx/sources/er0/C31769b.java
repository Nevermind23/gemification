package er0;

import com.salesforce.marketingcloud.storage.p385db.C11767h;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: er0.b */
public final class C31769b {

    /* renamed from: a */
    private final long f78370a;

    /* renamed from: b */
    private final long f78371b;

    /* renamed from: c */
    private final String f78372c;

    /* renamed from: d */
    private final String f78373d;

    /* renamed from: e */
    private final String f78374e;

    /* renamed from: f */
    private final String f78375f;

    /* renamed from: g */
    private final String f78376g;

    /* renamed from: h */
    private final String f78377h;

    /* renamed from: i */
    private final String f78378i;

    /* renamed from: j */
    private final long f78379j;

    /* renamed from: k */
    private final String f78380k;

    /* renamed from: l */
    private final String f78381l;

    /* renamed from: m */
    private final String f78382m;

    /* renamed from: n */
    private final long f78383n;

    /* renamed from: o */
    private final String f78384o;

    /* renamed from: p */
    private final String f78385p;

    public C31769b(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j3, String str8, String str9, String str10, long j4, String str11, String str12) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        C41536l.m120489i(str13, "cadastralCode");
        C41536l.m120489i(str14, "propertyType");
        C41536l.m120489i(str15, "registrationNumber");
        C41536l.m120489i(str16, "parcelFunction");
        C41536l.m120489i(str17, "address");
        C41536l.m120489i(str18, C11767h.C11768a.f34132b);
        C41536l.m120489i(str19, C11767h.C11768a.f34133c);
        C41536l.m120489i(str20, "zone");
        C41536l.m120489i(str21, "zoneName");
        this.f78370a = j;
        this.f78371b = j2;
        this.f78372c = str13;
        this.f78373d = str14;
        this.f78374e = str15;
        this.f78375f = str16;
        this.f78376g = str17;
        this.f78377h = str18;
        this.f78378i = str19;
        this.f78379j = j3;
        this.f78380k = str20;
        this.f78381l = str21;
        this.f78382m = str10;
        this.f78383n = j4;
        this.f78384o = str11;
        this.f78385p = str12;
    }

    /* renamed from: a */
    public final String mo72207a() {
        return this.f78376g;
    }

    /* renamed from: b */
    public final String mo72208b() {
        return this.f78372c;
    }

    /* renamed from: c */
    public final long mo72209c() {
        return this.f78370a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31769b)) {
            return false;
        }
        C31769b bVar = (C31769b) obj;
        return this.f78370a == bVar.f78370a && this.f78371b == bVar.f78371b && C41536l.m120484d(this.f78372c, bVar.f78372c) && C41536l.m120484d(this.f78373d, bVar.f78373d) && C41536l.m120484d(this.f78374e, bVar.f78374e) && C41536l.m120484d(this.f78375f, bVar.f78375f) && C41536l.m120484d(this.f78376g, bVar.f78376g) && C41536l.m120484d(this.f78377h, bVar.f78377h) && C41536l.m120484d(this.f78378i, bVar.f78378i) && this.f78379j == bVar.f78379j && C41536l.m120484d(this.f78380k, bVar.f78380k) && C41536l.m120484d(this.f78381l, bVar.f78381l) && C41536l.m120484d(this.f78382m, bVar.f78382m) && this.f78383n == bVar.f78383n && C41536l.m120484d(this.f78384o, bVar.f78384o) && C41536l.m120484d(this.f78385p, bVar.f78385p);
    }

    public int hashCode() {
        int a = ((((((((((((((((((((((C7397t.m28148a(this.f78370a) * 31) + C7397t.m28148a(this.f78371b)) * 31) + this.f78372c.hashCode()) * 31) + this.f78373d.hashCode()) * 31) + this.f78374e.hashCode()) * 31) + this.f78375f.hashCode()) * 31) + this.f78376g.hashCode()) * 31) + this.f78377h.hashCode()) * 31) + this.f78378i.hashCode()) * 31) + C7397t.m28148a(this.f78379j)) * 31) + this.f78380k.hashCode()) * 31) + this.f78381l.hashCode()) * 31;
        String str = this.f78382m;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.f78383n)) * 31;
        String str2 = this.f78384o;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f78385p;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.f78370a;
        long j2 = this.f78371b;
        String str = this.f78372c;
        String str2 = this.f78373d;
        String str3 = this.f78374e;
        String str4 = this.f78375f;
        String str5 = this.f78376g;
        String str6 = this.f78377h;
        String str7 = this.f78378i;
        long j3 = this.f78379j;
        String str8 = this.f78380k;
        String str9 = this.f78381l;
        String str10 = str8;
        String str11 = this.f78382m;
        long j4 = this.f78383n;
        String str12 = this.f78384o;
        String str13 = this.f78385p;
        return "LoanProperty(id=" + j + ", reference=" + j2 + ", cadastralCode=" + str + ", propertyType=" + str2 + ", registrationNumber=" + str3 + ", parcelFunction=" + str4 + ", address=" + str5 + ", latitude=" + str6 + ", longitude=" + str7 + ", updateDate=" + j3 + ", zone=" + str10 + ", zoneName=" + str9 + ", sectorName=" + str11 + ", propertyArea=" + j4 + ", dictionaryKey=" + str12 + ", dictionaryValue=" + str13 + ")";
    }
}
