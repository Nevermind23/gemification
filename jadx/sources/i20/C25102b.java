package i20;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: i20.b */
public final class C25102b {

    /* renamed from: a */
    private final long f64457a;

    /* renamed from: b */
    private final String f64458b;

    /* renamed from: c */
    private final long f64459c;

    /* renamed from: d */
    private final BigDecimal f64460d;

    /* renamed from: e */
    private final String f64461e;

    /* renamed from: f */
    private final boolean f64462f;

    /* renamed from: g */
    private final String f64463g;

    /* renamed from: h */
    private final String f64464h;

    /* renamed from: i */
    private final BigDecimal f64465i;

    public C25102b(long j, String str, long j2, BigDecimal bigDecimal, String str2, boolean z, String str3, String str4, BigDecimal bigDecimal2) {
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str2, "format");
        C41536l.m120489i(str4, "prodType");
        this.f64457a = j;
        this.f64458b = str;
        this.f64459c = j2;
        this.f64460d = bigDecimal;
        this.f64461e = str2;
        this.f64462f = z;
        this.f64463g = str3;
        this.f64464h = str4;
        this.f64465i = bigDecimal2;
    }

    /* renamed from: a */
    public final BigDecimal mo63544a() {
        return this.f64460d;
    }

    /* renamed from: b */
    public final BigDecimal mo63545b() {
        return this.f64465i;
    }

    /* renamed from: c */
    public final String mo63546c() {
        return this.f64458b;
    }

    /* renamed from: d */
    public final String mo63547d() {
        return this.f64461e;
    }

    /* renamed from: e */
    public final String mo63548e() {
        return this.f64464h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25102b)) {
            return false;
        }
        C25102b bVar = (C25102b) obj;
        return this.f64457a == bVar.f64457a && C41536l.m120484d(this.f64458b, bVar.f64458b) && this.f64459c == bVar.f64459c && C41536l.m120484d(this.f64460d, bVar.f64460d) && C41536l.m120484d(this.f64461e, bVar.f64461e) && this.f64462f == bVar.f64462f && C41536l.m120484d(this.f64463g, bVar.f64463g) && C41536l.m120484d(this.f64464h, bVar.f64464h) && C41536l.m120484d(this.f64465i, bVar.f64465i);
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f64457a) * 31) + this.f64458b.hashCode()) * 31) + C7397t.m28148a(this.f64459c)) * 31) + this.f64460d.hashCode()) * 31) + this.f64461e.hashCode()) * 31;
        boolean z = this.f64462f;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.f64463g;
        int i2 = 0;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.f64464h.hashCode()) * 31;
        BigDecimal bigDecimal = this.f64465i;
        if (bigDecimal != null) {
            i2 = bigDecimal.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        long j = this.f64457a;
        String str = this.f64458b;
        long j2 = this.f64459c;
        BigDecimal bigDecimal = this.f64460d;
        String str2 = this.f64461e;
        boolean z = this.f64462f;
        String str3 = this.f64463g;
        String str4 = this.f64464h;
        BigDecimal bigDecimal2 = this.f64465i;
        return "AssetLiabilityPointUIModel(id=" + j + ", dictionaryKey=" + str + ", orderNo=" + j2 + ", amount=" + bigDecimal + ", format=" + str2 + ", scoolcardFlag=" + z + ", firstName=" + str3 + ", prodType=" + str4 + ", amountInGel=" + bigDecimal2 + ")";
    }
}
