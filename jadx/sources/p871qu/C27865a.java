package p871qu;

import kotlin.jvm.internal.C41536l;

/* renamed from: qu.a */
public final class C27865a {

    /* renamed from: a */
    private final String f70992a;

    /* renamed from: b */
    private final String f70993b;

    /* renamed from: c */
    private final String f70994c;

    /* renamed from: d */
    private final String f70995d;

    /* renamed from: e */
    private final String f70996e;

    /* renamed from: f */
    private final String f70997f;

    public C27865a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f70992a = str;
        this.f70993b = str2;
        this.f70994c = str3;
        this.f70995d = str4;
        this.f70996e = str5;
        this.f70997f = str6;
    }

    /* renamed from: a */
    public final String mo67391a() {
        return this.f70992a;
    }

    /* renamed from: b */
    public final String mo67392b() {
        return this.f70996e;
    }

    /* renamed from: c */
    public final String mo67393c() {
        return this.f70995d;
    }

    /* renamed from: d */
    public final String mo67394d() {
        return this.f70994c;
    }

    /* renamed from: e */
    public final String mo67395e() {
        return this.f70997f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27865a)) {
            return false;
        }
        C27865a aVar = (C27865a) obj;
        return C41536l.m120484d(this.f70992a, aVar.f70992a) && C41536l.m120484d(this.f70993b, aVar.f70993b) && C41536l.m120484d(this.f70994c, aVar.f70994c) && C41536l.m120484d(this.f70995d, aVar.f70995d) && C41536l.m120484d(this.f70996e, aVar.f70996e) && C41536l.m120484d(this.f70997f, aVar.f70997f);
    }

    public int hashCode() {
        String str = this.f70992a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f70993b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70994c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f70995d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f70996e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f70997f;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.f70992a;
        String str2 = this.f70993b;
        String str3 = this.f70994c;
        String str4 = this.f70995d;
        String str5 = this.f70996e;
        String str6 = this.f70997f;
        return "Contract(contractText=" + str + ", id=" + str2 + ", languageCode=" + str3 + ", inpSysdate=" + str4 + ", contractTypeId=" + str5 + ", templateVersionId=" + str6 + ")";
    }
}
