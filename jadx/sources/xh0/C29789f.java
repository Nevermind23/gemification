package xh0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xh0.f */
public final class C29789f {

    /* renamed from: a */
    private final long f75345a;

    /* renamed from: b */
    private final BigDecimal f75346b;

    /* renamed from: c */
    private final String f75347c;

    /* renamed from: d */
    private final Long f75348d;

    /* renamed from: e */
    private final String f75349e;

    /* renamed from: f */
    private final String f75350f;

    /* renamed from: g */
    private final boolean f75351g;

    /* renamed from: h */
    private final String f75352h;

    /* renamed from: i */
    private final boolean f75353i;

    /* renamed from: j */
    private final List f75354j;

    /* renamed from: k */
    private final String f75355k;

    /* renamed from: l */
    private final String f75356l;

    /* renamed from: m */
    private final String f75357m;

    /* renamed from: n */
    private final String f75358n;

    /* renamed from: o */
    private final BigDecimal f75359o;

    /* renamed from: p */
    private final String f75360p;

    /* renamed from: q */
    private final String f75361q;

    /* renamed from: r */
    private final Long f75362r;

    /* renamed from: s */
    private final String f75363s;

    /* renamed from: t */
    private final BigDecimal f75364t;

    /* renamed from: u */
    private final C29780a f75365u;

    public C29789f(long j, BigDecimal bigDecimal, String str, Long l, String str2, String str3, boolean z, String str4, boolean z2, List list, String str5, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, Long l2, String str11, BigDecimal bigDecimal3, C29780a aVar) {
        C41536l.m120489i(list, "offerBrandList");
        this.f75345a = j;
        this.f75346b = bigDecimal;
        this.f75347c = str;
        this.f75348d = l;
        this.f75349e = str2;
        this.f75350f = str3;
        this.f75351g = z;
        this.f75352h = str4;
        this.f75353i = z2;
        this.f75354j = list;
        this.f75355k = str5;
        this.f75356l = str6;
        this.f75357m = str7;
        this.f75358n = str8;
        this.f75359o = bigDecimal2;
        this.f75360p = str9;
        this.f75361q = str10;
        this.f75362r = l2;
        this.f75363s = str11;
        this.f75364t = bigDecimal3;
        this.f75365u = aVar;
    }

    /* renamed from: a */
    public final BigDecimal mo69966a() {
        return this.f75346b;
    }

    /* renamed from: b */
    public final String mo69967b() {
        return this.f75347c;
    }

    /* renamed from: c */
    public final Long mo69968c() {
        return this.f75348d;
    }

    /* renamed from: d */
    public final C29780a mo69969d() {
        return this.f75365u;
    }

    /* renamed from: e */
    public final long mo69970e() {
        return this.f75345a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29789f)) {
            return false;
        }
        C29789f fVar = (C29789f) obj;
        return this.f75345a == fVar.f75345a && C41536l.m120484d(this.f75346b, fVar.f75346b) && C41536l.m120484d(this.f75347c, fVar.f75347c) && C41536l.m120484d(this.f75348d, fVar.f75348d) && C41536l.m120484d(this.f75349e, fVar.f75349e) && C41536l.m120484d(this.f75350f, fVar.f75350f) && this.f75351g == fVar.f75351g && C41536l.m120484d(this.f75352h, fVar.f75352h) && this.f75353i == fVar.f75353i && C41536l.m120484d(this.f75354j, fVar.f75354j) && C41536l.m120484d(this.f75355k, fVar.f75355k) && C41536l.m120484d(this.f75356l, fVar.f75356l) && C41536l.m120484d(this.f75357m, fVar.f75357m) && C41536l.m120484d(this.f75358n, fVar.f75358n) && C41536l.m120484d(this.f75359o, fVar.f75359o) && C41536l.m120484d(this.f75360p, fVar.f75360p) && C41536l.m120484d(this.f75361q, fVar.f75361q) && C41536l.m120484d(this.f75362r, fVar.f75362r) && C41536l.m120484d(this.f75363s, fVar.f75363s) && C41536l.m120484d(this.f75364t, fVar.f75364t) && C41536l.m120484d(this.f75365u, fVar.f75365u);
    }

    /* renamed from: f */
    public final String mo69972f() {
        return this.f75350f;
    }

    /* renamed from: g */
    public final boolean mo69973g() {
        return this.f75351g;
    }

    /* renamed from: h */
    public final String mo69974h() {
        return this.f75352h;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f75345a) * 31;
        BigDecimal bigDecimal = this.f75346b;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f75347c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f75348d;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f75349e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75350f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.f75351g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str4 = this.f75352h;
        int hashCode6 = (i2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z3 = this.f75353i;
        if (!z3) {
            z2 = z3;
        }
        int hashCode7 = (((hashCode6 + (z2 ? 1 : 0)) * 31) + this.f75354j.hashCode()) * 31;
        String str5 = this.f75355k;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f75356l;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f75357m;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f75358n;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f75359o;
        int hashCode12 = (hashCode11 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str9 = this.f75360p;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f75361q;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l2 = this.f75362r;
        int hashCode15 = (hashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str11 = this.f75363s;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f75364t;
        int hashCode17 = (hashCode16 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        C29780a aVar = this.f75365u;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode17 + i;
    }

    /* renamed from: i */
    public final boolean mo69976i() {
        return this.f75353i;
    }

    /* renamed from: j */
    public final List mo69977j() {
        return this.f75354j;
    }

    /* renamed from: k */
    public final String mo69978k() {
        return this.f75356l;
    }

    /* renamed from: l */
    public final String mo69979l() {
        return this.f75357m;
    }

    /* renamed from: m */
    public final String mo69980m() {
        return this.f75360p;
    }

    /* renamed from: n */
    public final String mo69981n() {
        return this.f75361q;
    }

    /* renamed from: o */
    public final BigDecimal mo69982o() {
        return this.f75364t;
    }

    public String toString() {
        long j = this.f75345a;
        BigDecimal bigDecimal = this.f75346b;
        String str = this.f75347c;
        Long l = this.f75348d;
        String str2 = this.f75349e;
        String str3 = this.f75350f;
        boolean z = this.f75351g;
        String str4 = this.f75352h;
        boolean z2 = this.f75353i;
        List list = this.f75354j;
        String str5 = this.f75355k;
        String str6 = this.f75356l;
        String str7 = this.f75357m;
        String str8 = this.f75358n;
        BigDecimal bigDecimal2 = this.f75359o;
        String str9 = this.f75360p;
        String str10 = this.f75361q;
        Long l2 = this.f75362r;
        String str11 = this.f75363s;
        BigDecimal bigDecimal3 = this.f75364t;
        C29780a aVar = this.f75365u;
        return "ClientGiftCard(giftCardId=" + j + ", availableAmount=" + bigDecimal + ", cardDesignStorageId=" + str + ", cardExpirationDate=" + l + ", ccy=" + str2 + ", giftCardPaymentCode=" + str3 + ", giftCardSeen=" + z + ", giftText=" + str4 + ", giveAwayPossible=" + z2 + ", offerBrandList=" + list + ", offerLogoStorageId=" + str5 + ", offerLogoStorageUrl=" + str6 + ", offerName=" + str7 + ", offerNameInt=" + str8 + ", primaryAmount=" + bigDecimal2 + ", srcClientFirstName=" + str9 + ", srcClientLastname=" + str10 + ", clientKey=" + l2 + ", ownerMobilePhone=" + str11 + ", usedAmount=" + bigDecimal3 + ", externalFile=" + aVar + ")";
    }
}
