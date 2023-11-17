package ld0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ld0.a */
public final class C25950a {

    /* renamed from: a */
    private final int f66024a;

    /* renamed from: b */
    private final String f66025b;

    /* renamed from: c */
    private final String f66026c;

    /* renamed from: d */
    private final String f66027d;

    /* renamed from: e */
    private final String f66028e;

    /* renamed from: f */
    private final String f66029f;

    /* renamed from: g */
    private final String f66030g;

    public C25950a(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "contractType");
        C41536l.m120489i(str3, "channelCode");
        C41536l.m120489i(str4, "languageCode");
        C41536l.m120489i(str5, "contractTemplate");
        this.f66024a = i;
        this.f66025b = str;
        this.f66026c = str2;
        this.f66027d = str3;
        this.f66028e = str4;
        this.f66029f = str5;
        this.f66030g = str6;
    }

    /* renamed from: a */
    public final String mo64864a() {
        return this.f66029f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25950a)) {
            return false;
        }
        C25950a aVar = (C25950a) obj;
        return this.f66024a == aVar.f66024a && C41536l.m120484d(this.f66025b, aVar.f66025b) && C41536l.m120484d(this.f66026c, aVar.f66026c) && C41536l.m120484d(this.f66027d, aVar.f66027d) && C41536l.m120484d(this.f66028e, aVar.f66028e) && C41536l.m120484d(this.f66029f, aVar.f66029f) && C41536l.m120484d(this.f66030g, aVar.f66030g);
    }

    public int hashCode() {
        int hashCode = ((this.f66024a * 31) + this.f66025b.hashCode()) * 31;
        String str = this.f66026c;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f66027d.hashCode()) * 31) + this.f66028e.hashCode()) * 31) + this.f66029f.hashCode()) * 31;
        String str2 = this.f66030g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        int i = this.f66024a;
        String str = this.f66025b;
        String str2 = this.f66026c;
        String str3 = this.f66027d;
        String str4 = this.f66028e;
        String str5 = this.f66029f;
        String str6 = this.f66030g;
        return "PreContract(templateId=" + i + ", contractType=" + str + ", dictionaryKeyId=" + str2 + ", channelCode=" + str3 + ", languageCode=" + str4 + ", contractTemplate=" + str5 + ", templateDesc=" + str6 + ")";
    }
}
