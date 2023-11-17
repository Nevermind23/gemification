package o60;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: o60.b */
public final class C26761b {

    /* renamed from: a */
    private final String f67416a;

    /* renamed from: b */
    private final String f67417b;

    /* renamed from: c */
    private final String f67418c;

    /* renamed from: d */
    private final String f67419d;

    /* renamed from: e */
    private final String f67420e;

    /* renamed from: f */
    private final String f67421f;

    /* renamed from: g */
    private final String f67422g;

    /* renamed from: h */
    private final List f67423h;

    public C26761b(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C41536l.m120489i(list, "offerDetails");
        this.f67416a = str;
        this.f67417b = str2;
        this.f67418c = str3;
        this.f67419d = str4;
        this.f67420e = str5;
        this.f67421f = str6;
        this.f67422g = str7;
        this.f67423h = list;
    }

    /* renamed from: a */
    public final String mo65968a() {
        return this.f67422g;
    }

    /* renamed from: b */
    public final String mo65969b() {
        return this.f67418c;
    }

    /* renamed from: c */
    public final String mo65970c() {
        return this.f67419d;
    }

    /* renamed from: d */
    public final String mo65971d() {
        return this.f67420e;
    }

    /* renamed from: e */
    public final String mo65972e() {
        return this.f67421f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26761b)) {
            return false;
        }
        C26761b bVar = (C26761b) obj;
        return C41536l.m120484d(this.f67416a, bVar.f67416a) && C41536l.m120484d(this.f67417b, bVar.f67417b) && C41536l.m120484d(this.f67418c, bVar.f67418c) && C41536l.m120484d(this.f67419d, bVar.f67419d) && C41536l.m120484d(this.f67420e, bVar.f67420e) && C41536l.m120484d(this.f67421f, bVar.f67421f) && C41536l.m120484d(this.f67422g, bVar.f67422g) && C41536l.m120484d(this.f67423h, bVar.f67423h);
    }

    /* renamed from: f */
    public final List mo65974f() {
        return this.f67423h;
    }

    /* renamed from: g */
    public final String mo65975g() {
        return this.f67416a;
    }

    /* renamed from: h */
    public final String mo65976h() {
        return this.f67417b;
    }

    public int hashCode() {
        String str = this.f67416a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f67417b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f67418c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f67419d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f67420e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f67421f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f67422g;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((hashCode6 + i) * 31) + this.f67423h.hashCode();
    }

    public String toString() {
        String str = this.f67416a;
        String str2 = this.f67417b;
        String str3 = this.f67418c;
        String str4 = this.f67419d;
        String str5 = this.f67420e;
        String str6 = this.f67421f;
        String str7 = this.f67422g;
        List list = this.f67423h;
        return "ProductDescriptionText(titleDictionaryKey=" + str + ", titleDictionaryKeyValue=" + str2 + ", mainHeaderDictionaryKey=" + str3 + ", mainHeaderDictionaryKeyValue=" + str4 + ", mainTextDictionaryKey=" + str5 + ", mainTextDictionaryKeyValue=" + str6 + ", iconUrl=" + str7 + ", offerDetails=" + list + ")";
    }
}
