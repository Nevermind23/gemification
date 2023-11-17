package i31;

import kotlin.jvm.internal.C41536l;

/* renamed from: i31.c */
public final class C36346c {

    /* renamed from: a */
    private final String f87716a;

    /* renamed from: b */
    private final String f87717b;

    /* renamed from: c */
    private final String f87718c;

    /* renamed from: d */
    private final String f87719d;

    /* renamed from: e */
    private final String f87720e;

    /* renamed from: f */
    private final String f87721f;

    /* renamed from: g */
    private final String f87722g;

    public C36346c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "insuranceType");
        C41536l.m120489i(str3, "cardSubProductCode");
        C41536l.m120489i(str4, "dictionaryKey");
        C41536l.m120489i(str5, "detailsDictionaryKey");
        C41536l.m120489i(str6, "insuranceLimitPosValue");
        C41536l.m120489i(str7, "insuranceLimitOnlinePaymentsValue");
        this.f87716a = str;
        this.f87717b = str2;
        this.f87718c = str3;
        this.f87719d = str4;
        this.f87720e = str5;
        this.f87721f = str6;
        this.f87722g = str7;
    }

    /* renamed from: a */
    public final String mo89070a() {
        return this.f87718c;
    }

    /* renamed from: b */
    public final String mo89071b() {
        return this.f87720e;
    }

    /* renamed from: c */
    public final String mo89072c() {
        return this.f87719d;
    }

    /* renamed from: d */
    public final String mo89073d() {
        return this.f87716a;
    }

    /* renamed from: e */
    public final String mo89074e() {
        return this.f87722g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36346c)) {
            return false;
        }
        C36346c cVar = (C36346c) obj;
        return C41536l.m120484d(this.f87716a, cVar.f87716a) && C41536l.m120484d(this.f87717b, cVar.f87717b) && C41536l.m120484d(this.f87718c, cVar.f87718c) && C41536l.m120484d(this.f87719d, cVar.f87719d) && C41536l.m120484d(this.f87720e, cVar.f87720e) && C41536l.m120484d(this.f87721f, cVar.f87721f) && C41536l.m120484d(this.f87722g, cVar.f87722g);
    }

    /* renamed from: f */
    public final String mo89076f() {
        return this.f87721f;
    }

    /* renamed from: g */
    public final String mo89077g() {
        return this.f87717b;
    }

    public int hashCode() {
        return (((((((((((this.f87716a.hashCode() * 31) + this.f87717b.hashCode()) * 31) + this.f87718c.hashCode()) * 31) + this.f87719d.hashCode()) * 31) + this.f87720e.hashCode()) * 31) + this.f87721f.hashCode()) * 31) + this.f87722g.hashCode();
    }

    public String toString() {
        String str = this.f87716a;
        String str2 = this.f87717b;
        String str3 = this.f87718c;
        String str4 = this.f87719d;
        String str5 = this.f87720e;
        String str6 = this.f87721f;
        String str7 = this.f87722g;
        return "CardInsuranceType(id=" + str + ", insuranceType=" + str2 + ", cardSubProductCode=" + str3 + ", dictionaryKey=" + str4 + ", detailsDictionaryKey=" + str5 + ", insuranceLimitPosValue=" + str6 + ", insuranceLimitOnlinePaymentsValue=" + str7 + ")";
    }
}
