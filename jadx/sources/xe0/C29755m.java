package xe0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.m */
public final class C29755m {

    /* renamed from: a */
    private final String f75239a;

    /* renamed from: b */
    private final String f75240b;

    /* renamed from: c */
    private final String f75241c;

    /* renamed from: d */
    private final String f75242d;

    /* renamed from: e */
    private final String f75243e;

    /* renamed from: f */
    private final String f75244f;

    /* renamed from: g */
    private final String f75245g;

    /* renamed from: h */
    private final String f75246h;

    /* renamed from: i */
    private final String f75247i;

    /* renamed from: j */
    private final String f75248j;

    /* renamed from: k */
    private final String f75249k;

    /* renamed from: l */
    private final String f75250l;

    /* renamed from: m */
    private final String f75251m;

    /* renamed from: n */
    private final String f75252n;

    public C29755m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        C41536l.m120489i(str, "marketCap");
        C41536l.m120489i(str2, "openPrice");
        C41536l.m120489i(str3, "closePrice");
        C41536l.m120489i(str4, "askPrice");
        C41536l.m120489i(str5, "peRatio");
        C41536l.m120489i(str6, "bidPrice");
        C41536l.m120489i(str7, "eps");
        C41536l.m120489i(str8, "daysRange");
        C41536l.m120489i(str9, "fiftyTwoRange");
        this.f75239a = str;
        this.f75240b = str2;
        this.f75241c = str3;
        this.f75242d = str4;
        this.f75243e = str5;
        this.f75244f = str6;
        this.f75245g = str7;
        this.f75246h = str8;
        this.f75247i = str9;
        this.f75248j = str10;
        this.f75249k = str11;
        this.f75250l = str12;
        this.f75251m = str13;
        this.f75252n = str14;
    }

    /* renamed from: a */
    public final String mo69839a() {
        return this.f75242d;
    }

    /* renamed from: b */
    public final String mo69840b() {
        return this.f75249k;
    }

    /* renamed from: c */
    public final String mo69841c() {
        return this.f75244f;
    }

    /* renamed from: d */
    public final String mo69842d() {
        return this.f75251m;
    }

    /* renamed from: e */
    public final String mo69843e() {
        return this.f75241c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29755m)) {
            return false;
        }
        C29755m mVar = (C29755m) obj;
        return C41536l.m120484d(this.f75239a, mVar.f75239a) && C41536l.m120484d(this.f75240b, mVar.f75240b) && C41536l.m120484d(this.f75241c, mVar.f75241c) && C41536l.m120484d(this.f75242d, mVar.f75242d) && C41536l.m120484d(this.f75243e, mVar.f75243e) && C41536l.m120484d(this.f75244f, mVar.f75244f) && C41536l.m120484d(this.f75245g, mVar.f75245g) && C41536l.m120484d(this.f75246h, mVar.f75246h) && C41536l.m120484d(this.f75247i, mVar.f75247i) && C41536l.m120484d(this.f75248j, mVar.f75248j) && C41536l.m120484d(this.f75249k, mVar.f75249k) && C41536l.m120484d(this.f75250l, mVar.f75250l) && C41536l.m120484d(this.f75251m, mVar.f75251m) && C41536l.m120484d(this.f75252n, mVar.f75252n);
    }

    /* renamed from: f */
    public final String mo69845f() {
        return this.f75246h;
    }

    /* renamed from: g */
    public final String mo69846g() {
        return this.f75248j;
    }

    /* renamed from: h */
    public final String mo69847h() {
        return this.f75245g;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f75239a.hashCode() * 31) + this.f75240b.hashCode()) * 31) + this.f75241c.hashCode()) * 31) + this.f75242d.hashCode()) * 31) + this.f75243e.hashCode()) * 31) + this.f75244f.hashCode()) * 31) + this.f75245g.hashCode()) * 31) + this.f75246h.hashCode()) * 31) + this.f75247i.hashCode()) * 31;
        String str = this.f75248j;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75249k;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75250l;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f75251m;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f75252n;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final String mo69849i() {
        return this.f75247i;
    }

    /* renamed from: j */
    public final String mo69850j() {
        return this.f75239a;
    }

    /* renamed from: k */
    public final String mo69851k() {
        return this.f75240b;
    }

    /* renamed from: l */
    public final String mo69852l() {
        return this.f75250l;
    }

    /* renamed from: m */
    public final String mo69853m() {
        return this.f75243e;
    }

    /* renamed from: n */
    public final String mo69854n() {
        return this.f75252n;
    }

    public String toString() {
        String str = this.f75239a;
        String str2 = this.f75240b;
        String str3 = this.f75241c;
        String str4 = this.f75242d;
        String str5 = this.f75243e;
        String str6 = this.f75244f;
        String str7 = this.f75245g;
        String str8 = this.f75246h;
        String str9 = this.f75247i;
        String str10 = this.f75248j;
        String str11 = this.f75249k;
        String str12 = this.f75250l;
        String str13 = this.f75251m;
        String str14 = this.f75252n;
        return "ShareSymbolFundamentals(marketCap=" + str + ", openPrice=" + str2 + ", closePrice=" + str3 + ", askPrice=" + str4 + ", peRatio=" + str5 + ", bidPrice=" + str6 + ", eps=" + str7 + ", daysRange=" + str8 + ", fiftyTwoRange=" + str9 + ", dividendYield=" + str10 + ", avgVolumeTen=" + str11 + ", pbRatio=" + str12 + ", bookValuePerShare=" + str13 + ", sharesOutstanding=" + str14 + ")";
    }
}
