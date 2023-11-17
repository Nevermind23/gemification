package wp0;

import kotlin.jvm.internal.C41536l;

/* renamed from: wp0.i */
public final class C39638i {

    /* renamed from: a */
    private final String f94240a;

    /* renamed from: b */
    private final String f94241b;

    /* renamed from: c */
    private final String f94242c;

    /* renamed from: d */
    private final String f94243d;

    /* renamed from: e */
    private final String f94244e;

    /* renamed from: f */
    private final String f94245f;

    /* renamed from: g */
    private final String f94246g;

    /* renamed from: h */
    private final String f94247h;

    public C39638i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f94240a = str;
        this.f94241b = str2;
        this.f94242c = str3;
        this.f94243d = str4;
        this.f94244e = str5;
        this.f94245f = str6;
        this.f94246g = str7;
        this.f94247h = str8;
    }

    /* renamed from: a */
    public final String mo93374a() {
        return this.f94240a;
    }

    /* renamed from: b */
    public final String mo93375b() {
        return this.f94241b;
    }

    /* renamed from: c */
    public final String mo93376c() {
        return this.f94242c;
    }

    /* renamed from: d */
    public final String mo93377d() {
        return this.f94243d;
    }

    /* renamed from: e */
    public final String mo93378e() {
        return this.f94244e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39638i)) {
            return false;
        }
        C39638i iVar = (C39638i) obj;
        return C41536l.m120484d(this.f94240a, iVar.f94240a) && C41536l.m120484d(this.f94241b, iVar.f94241b) && C41536l.m120484d(this.f94242c, iVar.f94242c) && C41536l.m120484d(this.f94243d, iVar.f94243d) && C41536l.m120484d(this.f94244e, iVar.f94244e) && C41536l.m120484d(this.f94245f, iVar.f94245f) && C41536l.m120484d(this.f94246g, iVar.f94246g) && C41536l.m120484d(this.f94247h, iVar.f94247h);
    }

    /* renamed from: f */
    public final String mo93380f() {
        return this.f94245f;
    }

    /* renamed from: g */
    public final String mo93381g() {
        return this.f94246g;
    }

    /* renamed from: h */
    public final String mo93382h() {
        return this.f94247h;
    }

    public int hashCode() {
        String str = this.f94240a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f94241b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94242c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94243d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f94244e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f94245f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f94246g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f94247h;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.f94240a;
        String str2 = this.f94241b;
        String str3 = this.f94242c;
        String str4 = this.f94243d;
        String str5 = this.f94244e;
        String str6 = this.f94245f;
        String str7 = this.f94246g;
        String str8 = this.f94247h;
        return "ScheduleInfo(ccy=" + str + ", comAmount=" + str2 + ", insAmount=" + str3 + ", intAmount=" + str4 + ", outAmount=" + str5 + ", payDate=" + str6 + ", priAmount=" + str7 + ", sumAmount=" + str8 + ")";
    }
}
