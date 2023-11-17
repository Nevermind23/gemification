package o60;

import kotlin.jvm.internal.C41536l;

/* renamed from: o60.a */
public final class C26760a {

    /* renamed from: a */
    private final String f67411a;

    /* renamed from: b */
    private final String f67412b;

    /* renamed from: c */
    private final String f67413c;

    /* renamed from: d */
    private final String f67414d;

    /* renamed from: e */
    private final String f67415e;

    public C26760a(String str, String str2, String str3, String str4, String str5) {
        this.f67411a = str;
        this.f67412b = str2;
        this.f67413c = str3;
        this.f67414d = str4;
        this.f67415e = str5;
    }

    /* renamed from: a */
    public final String mo65960a() {
        return this.f67412b;
    }

    /* renamed from: b */
    public final String mo65961b() {
        return this.f67413c;
    }

    /* renamed from: c */
    public final String mo65962c() {
        return this.f67411a;
    }

    /* renamed from: d */
    public final String mo65963d() {
        return this.f67414d;
    }

    /* renamed from: e */
    public final String mo65964e() {
        return this.f67415e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26760a)) {
            return false;
        }
        C26760a aVar = (C26760a) obj;
        return C41536l.m120484d(this.f67411a, aVar.f67411a) && C41536l.m120484d(this.f67412b, aVar.f67412b) && C41536l.m120484d(this.f67413c, aVar.f67413c) && C41536l.m120484d(this.f67414d, aVar.f67414d) && C41536l.m120484d(this.f67415e, aVar.f67415e);
    }

    public int hashCode() {
        String str = this.f67411a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f67412b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67413c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f67414d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f67415e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f67411a;
        String str2 = this.f67412b;
        String str3 = this.f67413c;
        String str4 = this.f67414d;
        String str5 = this.f67415e;
        return "ProductDescriptionDetails(orderNo=" + str + ", headerDictionaryKey=" + str2 + ", headerDictionaryKeyValue=" + str3 + ", textDictionaryKey=" + str4 + ", textDictionaryKeyValue=" + str5 + ")";
    }
}
