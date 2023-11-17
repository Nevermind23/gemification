package j71;

import kotlin.jvm.internal.C41536l;

/* renamed from: j71.d */
public final class C36751d {

    /* renamed from: a */
    private final Integer f88680a;

    /* renamed from: b */
    private final String f88681b;

    /* renamed from: c */
    private final String f88682c;

    /* renamed from: d */
    private final String f88683d;

    /* renamed from: e */
    private final String f88684e;

    /* renamed from: f */
    private final String f88685f;

    /* renamed from: g */
    private final boolean f88686g;

    /* renamed from: h */
    private final String f88687h;

    public C36751d(Integer num, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        C41536l.m120489i(str, "channelCode");
        C41536l.m120489i(str2, "languageCode");
        C41536l.m120489i(str3, "fileType");
        C41536l.m120489i(str4, "fileSubType");
        this.f88680a = num;
        this.f88681b = str;
        this.f88682c = str2;
        this.f88683d = str3;
        this.f88684e = str4;
        this.f88685f = str5;
        this.f88686g = z;
        this.f88687h = str6;
    }

    /* renamed from: a */
    public final String mo89604a() {
        return this.f88687h;
    }

    /* renamed from: b */
    public final boolean mo89605b() {
        return this.f88686g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36751d)) {
            return false;
        }
        C36751d dVar = (C36751d) obj;
        return C41536l.m120484d(this.f88680a, dVar.f88680a) && C41536l.m120484d(this.f88681b, dVar.f88681b) && C41536l.m120484d(this.f88682c, dVar.f88682c) && C41536l.m120484d(this.f88683d, dVar.f88683d) && C41536l.m120484d(this.f88684e, dVar.f88684e) && C41536l.m120484d(this.f88685f, dVar.f88685f) && this.f88686g == dVar.f88686g && C41536l.m120484d(this.f88687h, dVar.f88687h);
    }

    public int hashCode() {
        Integer num = this.f88680a;
        int i = 0;
        int hashCode = (((((((((num == null ? 0 : num.hashCode()) * 31) + this.f88681b.hashCode()) * 31) + this.f88682c.hashCode()) * 31) + this.f88683d.hashCode()) * 31) + this.f88684e.hashCode()) * 31;
        String str = this.f88685f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f88686g;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str2 = this.f88687h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        Integer num = this.f88680a;
        String str = this.f88681b;
        String str2 = this.f88682c;
        String str3 = this.f88683d;
        String str4 = this.f88684e;
        String str5 = this.f88685f;
        boolean z = this.f88686g;
        String str6 = this.f88687h;
        return "CardBackground(id=" + num + ", channelCode=" + str + ", languageCode=" + str2 + ", fileType=" + str3 + ", fileSubType=" + str4 + ", extFileId=" + str5 + ", isDark=" + z + ", fileUrl=" + str6 + ")";
    }
}
