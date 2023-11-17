package p854ox;

import kotlin.jvm.internal.C41536l;

/* renamed from: ox.a */
public final class C27093a {

    /* renamed from: a */
    private final String f68052a;

    /* renamed from: b */
    private final String f68053b;

    /* renamed from: c */
    private final String f68054c;

    /* renamed from: d */
    private final String f68055d;

    /* renamed from: e */
    private final String f68056e;

    /* renamed from: f */
    private final String f68057f;

    /* renamed from: g */
    private final String f68058g;

    /* renamed from: h */
    private final String f68059h;

    public C27093a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f68052a = str;
        this.f68053b = str2;
        this.f68054c = str3;
        this.f68055d = str4;
        this.f68056e = str5;
        this.f68057f = str6;
        this.f68058g = str7;
        this.f68059h = str8;
    }

    /* renamed from: a */
    public final String mo66376a() {
        return this.f68057f;
    }

    /* renamed from: b */
    public final String mo66377b() {
        return this.f68054c;
    }

    /* renamed from: c */
    public final String mo66378c() {
        return this.f68052a;
    }

    /* renamed from: d */
    public final String mo66379d() {
        return this.f68053b;
    }

    /* renamed from: e */
    public final String mo66380e() {
        return this.f68056e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27093a)) {
            return false;
        }
        C27093a aVar = (C27093a) obj;
        return C41536l.m120484d(this.f68052a, aVar.f68052a) && C41536l.m120484d(this.f68053b, aVar.f68053b) && C41536l.m120484d(this.f68054c, aVar.f68054c) && C41536l.m120484d(this.f68055d, aVar.f68055d) && C41536l.m120484d(this.f68056e, aVar.f68056e) && C41536l.m120484d(this.f68057f, aVar.f68057f) && C41536l.m120484d(this.f68058g, aVar.f68058g) && C41536l.m120484d(this.f68059h, aVar.f68059h);
    }

    /* renamed from: f */
    public final String mo66382f() {
        return this.f68058g;
    }

    /* renamed from: g */
    public final String mo66383g() {
        return this.f68059h;
    }

    /* renamed from: h */
    public final String mo66384h() {
        return this.f68055d;
    }

    public int hashCode() {
        String str = this.f68052a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f68053b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f68054c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f68055d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f68056e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f68057f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f68058g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f68059h;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.f68052a;
        String str2 = this.f68053b;
        String str3 = this.f68054c;
        String str4 = this.f68055d;
        String str5 = this.f68056e;
        String str6 = this.f68057f;
        String str7 = this.f68058g;
        String str8 = this.f68059h;
        return "VerificationProcessData(merchantLogoId=" + str + ", merchantName=" + str2 + ", ip=" + str3 + ", userAgent=" + str4 + ", os=" + str5 + ", country=" + str6 + ", serviceName=" + str7 + ", terminalId=" + str8 + ")";
    }
}
