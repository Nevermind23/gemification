package i20;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: i20.h */
public final class C25111h implements C25110g {

    /* renamed from: a */
    private final String f64527a;

    /* renamed from: b */
    private final String f64528b;

    /* renamed from: c */
    private final long f64529c;

    /* renamed from: d */
    private final String f64530d;

    /* renamed from: e */
    private final String f64531e;

    /* renamed from: f */
    private final Long f64532f;

    /* renamed from: g */
    private final long f64533g;

    /* renamed from: h */
    private final Double f64534h;

    /* renamed from: i */
    private final String f64535i;

    /* renamed from: j */
    private final String f64536j;

    public C25111h(String str, String str2, long j, String str3, String str4, Long l, long j2, Double d, String str5, String str6) {
        C41536l.m120489i(str2, "productType");
        this.f64527a = str;
        this.f64528b = str2;
        this.f64529c = j;
        this.f64530d = str3;
        this.f64531e = str4;
        this.f64532f = l;
        this.f64533g = j2;
        this.f64534h = d;
        this.f64535i = str5;
        this.f64536j = str6;
    }

    /* renamed from: a */
    public final Double mo63614a() {
        return this.f64534h;
    }

    /* renamed from: b */
    public final String mo63615b() {
        return this.f64535i;
    }

    /* renamed from: c */
    public final String mo63616c() {
        return this.f64531e;
    }

    /* renamed from: d */
    public final Long mo63617d() {
        return this.f64532f;
    }

    /* renamed from: e */
    public final String mo63618e() {
        return this.f64536j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25111h)) {
            return false;
        }
        C25111h hVar = (C25111h) obj;
        return C41536l.m120484d(this.f64527a, hVar.f64527a) && C41536l.m120484d(this.f64528b, hVar.f64528b) && this.f64529c == hVar.f64529c && C41536l.m120484d(this.f64530d, hVar.f64530d) && C41536l.m120484d(this.f64531e, hVar.f64531e) && C41536l.m120484d(this.f64532f, hVar.f64532f) && this.f64533g == hVar.f64533g && C41536l.m120484d(this.f64534h, hVar.f64534h) && C41536l.m120484d(this.f64535i, hVar.f64535i) && C41536l.m120484d(this.f64536j, hVar.f64536j);
    }

    /* renamed from: f */
    public final String mo63620f() {
        return this.f64527a;
    }

    /* renamed from: g */
    public final long mo63621g() {
        return this.f64529c;
    }

    /* renamed from: h */
    public final String mo63622h() {
        return this.f64528b;
    }

    public int hashCode() {
        String str = this.f64527a;
        int i = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f64528b.hashCode()) * 31) + C7397t.m28148a(this.f64529c)) * 31;
        String str2 = this.f64530d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64531e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f64532f;
        int hashCode4 = (((hashCode3 + (l == null ? 0 : l.hashCode())) * 31) + C7397t.m28148a(this.f64533g)) * 31;
        Double d = this.f64534h;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.f64535i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f64536j;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }

    /* renamed from: i */
    public final String mo63624i() {
        return this.f64530d;
    }

    /* renamed from: j */
    public final long mo63625j() {
        return this.f64533g;
    }

    public String toString() {
        String str = this.f64527a;
        String str2 = this.f64528b;
        long j = this.f64529c;
        String str3 = this.f64530d;
        String str4 = this.f64531e;
        Long l = this.f64532f;
        long j2 = this.f64533g;
        Double d = this.f64534h;
        String str5 = this.f64535i;
        String str6 = this.f64536j;
        return "UpcomingPaymentUIModel(productGroup=" + str + ", productType=" + str2 + ", productKey=" + j + ", subProductCode=" + str3 + ", name=" + str4 + ", payDate=" + l + ", todayDate=" + j2 + ", amount=" + d + ", ccy=" + str5 + ", productDictionaryKey=" + str6 + ")";
    }
}
