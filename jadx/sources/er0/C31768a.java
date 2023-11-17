package er0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: er0.a */
public final class C31768a {

    /* renamed from: a */
    private final long f78359a;

    /* renamed from: b */
    private final long f78360b;

    /* renamed from: c */
    private final String f78361c;

    /* renamed from: d */
    private final String f78362d;

    /* renamed from: e */
    private final String f78363e;

    /* renamed from: f */
    private final String f78364f;

    /* renamed from: g */
    private final String f78365g;

    /* renamed from: h */
    private final String f78366h;

    /* renamed from: i */
    private final String f78367i;

    /* renamed from: j */
    private final String f78368j;

    /* renamed from: k */
    private final String f78369k;

    public C31768a(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C41536l.m120489i(str, "cadastralCode");
        C41536l.m120489i(str4, "address");
        C41536l.m120489i(str8, "firstName");
        C41536l.m120489i(str9, "lastName");
        this.f78359a = j;
        this.f78360b = j2;
        this.f78361c = str;
        this.f78362d = str2;
        this.f78363e = str3;
        this.f78364f = str4;
        this.f78365g = str5;
        this.f78366h = str6;
        this.f78367i = str7;
        this.f78368j = str8;
        this.f78369k = str9;
    }

    /* renamed from: a */
    public final String mo72198a() {
        return this.f78364f;
    }

    /* renamed from: b */
    public final String mo72199b() {
        return this.f78361c;
    }

    /* renamed from: c */
    public final String mo72200c() {
        return this.f78368j;
    }

    /* renamed from: d */
    public final long mo72201d() {
        return this.f78359a;
    }

    /* renamed from: e */
    public final String mo72202e() {
        return this.f78369k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31768a)) {
            return false;
        }
        C31768a aVar = (C31768a) obj;
        return this.f78359a == aVar.f78359a && this.f78360b == aVar.f78360b && C41536l.m120484d(this.f78361c, aVar.f78361c) && C41536l.m120484d(this.f78362d, aVar.f78362d) && C41536l.m120484d(this.f78363e, aVar.f78363e) && C41536l.m120484d(this.f78364f, aVar.f78364f) && C41536l.m120484d(this.f78365g, aVar.f78365g) && C41536l.m120484d(this.f78366h, aVar.f78366h) && C41536l.m120484d(this.f78367i, aVar.f78367i) && C41536l.m120484d(this.f78368j, aVar.f78368j) && C41536l.m120484d(this.f78369k, aVar.f78369k);
    }

    /* renamed from: f */
    public final String mo72204f() {
        return this.f78362d;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f78359a) * 31) + C7397t.m28148a(this.f78360b)) * 31) + this.f78361c.hashCode()) * 31;
        String str = this.f78362d;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78363e;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f78364f.hashCode()) * 31;
        String str3 = this.f78365g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f78366h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f78367i;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((hashCode4 + i) * 31) + this.f78368j.hashCode()) * 31) + this.f78369k.hashCode();
    }

    public String toString() {
        long j = this.f78359a;
        long j2 = this.f78360b;
        String str = this.f78361c;
        String str2 = this.f78362d;
        String str3 = this.f78363e;
        String str4 = this.f78364f;
        String str5 = this.f78365g;
        String str6 = this.f78366h;
        String str7 = this.f78367i;
        String str8 = this.f78368j;
        String str9 = this.f78369k;
        return "ExternalLoanProperty(id=" + j + ", propertyId=" + j2 + ", cadastralCode=" + str + ", name=" + str2 + ", organizationName=" + str3 + ", address=" + str4 + ", taxId=" + str5 + ", countryId=" + str6 + ", countryName=" + str7 + ", firstName=" + str8 + ", lastName=" + str9 + ")";
    }
}
