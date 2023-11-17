package p606sl;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: sl.i */
public final class C17843i {

    /* renamed from: a */
    private final long f50798a;

    /* renamed from: b */
    private final String f50799b;

    /* renamed from: c */
    private final double f50800c;

    /* renamed from: d */
    private final String f50801d;

    /* renamed from: e */
    private final String f50802e;

    /* renamed from: f */
    private final BigDecimal f50803f;

    /* renamed from: g */
    private final String f50804g;

    /* renamed from: h */
    private final String f50805h;

    /* renamed from: i */
    private final String f50806i;

    /* renamed from: j */
    private final List f50807j;

    /* renamed from: k */
    private final String f50808k;

    /* renamed from: l */
    private final Long f50809l;

    /* renamed from: m */
    private final String f50810m;

    public C17843i(long j, String str, double d, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, String str6, List list, String str7, Long l, String str8) {
        C41536l.m120489i(str3, "ccy");
        this.f50798a = j;
        this.f50799b = str;
        this.f50800c = d;
        this.f50801d = str2;
        this.f50802e = str3;
        this.f50803f = bigDecimal;
        this.f50804g = str4;
        this.f50805h = str5;
        this.f50806i = str6;
        this.f50807j = list;
        this.f50808k = str7;
        this.f50809l = l;
        this.f50810m = str8;
    }

    /* renamed from: a */
    public final double mo45474a() {
        return this.f50800c;
    }

    /* renamed from: b */
    public final String mo45475b() {
        return this.f50802e;
    }

    /* renamed from: c */
    public final long mo45476c() {
        return this.f50798a;
    }

    /* renamed from: d */
    public final String mo45477d() {
        return this.f50801d;
    }

    /* renamed from: e */
    public final String mo45478e() {
        return this.f50799b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17843i)) {
            return false;
        }
        C17843i iVar = (C17843i) obj;
        return this.f50798a == iVar.f50798a && C41536l.m120484d(this.f50799b, iVar.f50799b) && Double.compare(this.f50800c, iVar.f50800c) == 0 && C41536l.m120484d(this.f50801d, iVar.f50801d) && C41536l.m120484d(this.f50802e, iVar.f50802e) && C41536l.m120484d(this.f50803f, iVar.f50803f) && C41536l.m120484d(this.f50804g, iVar.f50804g) && C41536l.m120484d(this.f50805h, iVar.f50805h) && C41536l.m120484d(this.f50806i, iVar.f50806i) && C41536l.m120484d(this.f50807j, iVar.f50807j) && C41536l.m120484d(this.f50808k, iVar.f50808k) && C41536l.m120484d(this.f50809l, iVar.f50809l) && C41536l.m120484d(this.f50810m, iVar.f50810m);
    }

    /* renamed from: f */
    public final String mo45480f() {
        return this.f50805h;
    }

    /* renamed from: g */
    public final List mo45481g() {
        return this.f50807j;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f50798a) * 31;
        String str = this.f50799b;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.f50800c)) * 31;
        String str2 = this.f50801d;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f50802e.hashCode()) * 31;
        BigDecimal bigDecimal = this.f50803f;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.f50804g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50805h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50806i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f50807j;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.f50808k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.f50809l;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.f50810m;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        long j = this.f50798a;
        String str = this.f50799b;
        double d = this.f50800c;
        String str2 = this.f50801d;
        String str3 = this.f50802e;
        BigDecimal bigDecimal = this.f50803f;
        String str4 = this.f50804g;
        String str5 = this.f50805h;
        String str6 = this.f50806i;
        List list = this.f50807j;
        String str7 = this.f50808k;
        Long l = this.f50809l;
        String str8 = this.f50810m;
        return "BnplItem(loanKey=" + j + ", prodType=" + str + ", amount=" + d + ", loanName=" + str2 + ", ccy=" + str3 + ", bcAmount=" + bigDecimal + ", loanType=" + str4 + ", productDictionaryKey=" + str5 + ", installmentFlag=" + str6 + ", productFunctions=" + list + ", attachmentUrl=" + str7 + ", productId=" + l + ", acctRef=" + str8 + ")";
    }
}
