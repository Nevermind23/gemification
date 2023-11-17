package ml0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ml0.f */
public final class C26253f {

    /* renamed from: a */
    private final Long f66505a;

    /* renamed from: b */
    private final String f66506b;

    /* renamed from: c */
    private final String f66507c;

    /* renamed from: d */
    private final String f66508d;

    /* renamed from: e */
    private final String f66509e;

    /* renamed from: f */
    private final Long f66510f;

    /* renamed from: g */
    private final String f66511g;

    /* renamed from: h */
    private final String f66512h;

    public C26253f(Long l, String str, String str2, String str3, String str4, Long l2, String str5, String str6) {
        this.f66505a = l;
        this.f66506b = str;
        this.f66507c = str2;
        this.f66508d = str3;
        this.f66509e = str4;
        this.f66510f = l2;
        this.f66511g = str5;
        this.f66512h = str6;
    }

    /* renamed from: a */
    public final String mo65315a() {
        return this.f66512h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26253f)) {
            return false;
        }
        C26253f fVar = (C26253f) obj;
        return C41536l.m120484d(this.f66505a, fVar.f66505a) && C41536l.m120484d(this.f66506b, fVar.f66506b) && C41536l.m120484d(this.f66507c, fVar.f66507c) && C41536l.m120484d(this.f66508d, fVar.f66508d) && C41536l.m120484d(this.f66509e, fVar.f66509e) && C41536l.m120484d(this.f66510f, fVar.f66510f) && C41536l.m120484d(this.f66511g, fVar.f66511g) && C41536l.m120484d(this.f66512h, fVar.f66512h);
    }

    public int hashCode() {
        Long l = this.f66505a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f66506b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f66507c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66508d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f66509e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f66510f;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.f66511g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f66512h;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        Long l = this.f66505a;
        String str = this.f66506b;
        String str2 = this.f66507c;
        String str3 = this.f66508d;
        String str4 = this.f66509e;
        Long l2 = this.f66510f;
        String str5 = this.f66511g;
        String str6 = this.f66512h;
        return "ProductLogo(id=" + l + ", channelCode=" + str + ", languageCode=" + str2 + ", fileType=" + str3 + ", fileSubType=" + str4 + ", extFileId=" + l2 + ", isDark=" + str5 + ", fileUrl=" + str6 + ")";
    }
}
