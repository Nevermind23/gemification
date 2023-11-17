package xe0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.j */
public final class C29752j {

    /* renamed from: a */
    private final String f75221a;

    /* renamed from: b */
    private final String f75222b;

    /* renamed from: c */
    private final String f75223c;

    /* renamed from: d */
    private final BigDecimal f75224d;

    /* renamed from: e */
    private final List f75225e;

    /* renamed from: f */
    private final String f75226f;

    public C29752j(String str, String str2, String str3, BigDecimal bigDecimal, List list, String str4) {
        C41536l.m120489i(str, "tickerName");
        C41536l.m120489i(str2, "companyName");
        C41536l.m120489i(str3, "price");
        C41536l.m120489i(bigDecimal, "pctChange");
        C41536l.m120489i(list, "myWatchListIds");
        this.f75221a = str;
        this.f75222b = str2;
        this.f75223c = str3;
        this.f75224d = bigDecimal;
        this.f75225e = list;
        this.f75226f = str4;
    }

    /* renamed from: a */
    public final String mo69812a() {
        return this.f75222b;
    }

    /* renamed from: b */
    public final String mo69813b() {
        return this.f75226f;
    }

    /* renamed from: c */
    public final List mo69814c() {
        return this.f75225e;
    }

    /* renamed from: d */
    public final BigDecimal mo69815d() {
        return this.f75224d;
    }

    /* renamed from: e */
    public final String mo69816e() {
        return this.f75223c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29752j)) {
            return false;
        }
        C29752j jVar = (C29752j) obj;
        return C41536l.m120484d(this.f75221a, jVar.f75221a) && C41536l.m120484d(this.f75222b, jVar.f75222b) && C41536l.m120484d(this.f75223c, jVar.f75223c) && C41536l.m120484d(this.f75224d, jVar.f75224d) && C41536l.m120484d(this.f75225e, jVar.f75225e) && C41536l.m120484d(this.f75226f, jVar.f75226f);
    }

    /* renamed from: f */
    public final String mo69818f() {
        return this.f75221a;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f75221a.hashCode() * 31) + this.f75222b.hashCode()) * 31) + this.f75223c.hashCode()) * 31) + this.f75224d.hashCode()) * 31) + this.f75225e.hashCode()) * 31;
        String str = this.f75226f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f75221a;
        String str2 = this.f75222b;
        String str3 = this.f75223c;
        BigDecimal bigDecimal = this.f75224d;
        List list = this.f75225e;
        String str4 = this.f75226f;
        return "SearchSymbolItem(tickerName=" + str + ", companyName=" + str2 + ", price=" + str3 + ", pctChange=" + bigDecimal + ", myWatchListIds=" + list + ", imageUrl=" + str4 + ")";
    }
}
