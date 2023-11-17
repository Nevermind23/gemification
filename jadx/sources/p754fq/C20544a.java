package p754fq;

import kotlin.jvm.internal.C41536l;

/* renamed from: fq.a */
public final class C20544a {

    /* renamed from: a */
    private final String f55565a;

    /* renamed from: b */
    private final String f55566b;

    /* renamed from: c */
    private final String f55567c;

    /* renamed from: d */
    private final String f55568d;

    /* renamed from: e */
    private final String f55569e;

    /* renamed from: f */
    private final String f55570f;

    /* renamed from: g */
    private final String f55571g;

    /* renamed from: h */
    private final String f55572h;

    public C20544a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C41536l.m120489i(str2, "header");
        C41536l.m120489i(str3, "bodyTitle");
        C41536l.m120489i(str4, "body");
        C41536l.m120489i(str5, "footerTitle");
        C41536l.m120489i(str6, "footer");
        C41536l.m120489i(str7, "buttonTitle");
        this.f55565a = str;
        this.f55566b = str2;
        this.f55567c = str3;
        this.f55568d = str4;
        this.f55569e = str5;
        this.f55570f = str6;
        this.f55571g = str7;
        this.f55572h = str8;
    }

    /* renamed from: a */
    public final String mo49066a() {
        return this.f55568d;
    }

    /* renamed from: b */
    public final String mo49067b() {
        return this.f55567c;
    }

    /* renamed from: c */
    public final String mo49068c() {
        return this.f55571g;
    }

    /* renamed from: d */
    public final String mo49069d() {
        return this.f55572h;
    }

    /* renamed from: e */
    public final String mo49070e() {
        return this.f55570f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20544a)) {
            return false;
        }
        C20544a aVar = (C20544a) obj;
        return C41536l.m120484d(this.f55565a, aVar.f55565a) && C41536l.m120484d(this.f55566b, aVar.f55566b) && C41536l.m120484d(this.f55567c, aVar.f55567c) && C41536l.m120484d(this.f55568d, aVar.f55568d) && C41536l.m120484d(this.f55569e, aVar.f55569e) && C41536l.m120484d(this.f55570f, aVar.f55570f) && C41536l.m120484d(this.f55571g, aVar.f55571g) && C41536l.m120484d(this.f55572h, aVar.f55572h);
    }

    /* renamed from: f */
    public final String mo49072f() {
        return this.f55569e;
    }

    /* renamed from: g */
    public final String mo49073g() {
        return this.f55566b;
    }

    /* renamed from: h */
    public final String mo49074h() {
        return this.f55565a;
    }

    public int hashCode() {
        String str = this.f55565a;
        int i = 0;
        int hashCode = (((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.f55566b.hashCode()) * 31) + this.f55567c.hashCode()) * 31) + this.f55568d.hashCode()) * 31) + this.f55569e.hashCode()) * 31) + this.f55570f.hashCode()) * 31) + this.f55571g.hashCode()) * 31;
        String str2 = this.f55572h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f55565a;
        String str2 = this.f55566b;
        String str3 = this.f55567c;
        String str4 = this.f55568d;
        String str5 = this.f55569e;
        String str6 = this.f55570f;
        String str7 = this.f55571g;
        String str8 = this.f55572h;
        return "BannerDetailsUiModel(mainImageUrl=" + str + ", header=" + str2 + ", bodyTitle=" + str3 + ", body=" + str4 + ", footerTitle=" + str5 + ", footer=" + str6 + ", buttonTitle=" + str7 + ", deepLinkData=" + str8 + ")";
    }
}
