package u00;

import i20.C25110g;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: u00.c */
public final class C28535c implements C25110g {

    /* renamed from: a */
    private final String f72434a;

    /* renamed from: b */
    private final BigDecimal f72435b;

    /* renamed from: c */
    private final String f72436c;

    /* renamed from: d */
    private final int f72437d;

    /* renamed from: e */
    private final String f72438e;

    public C28535c(String str, BigDecimal bigDecimal, String str2, int i, String str3) {
        C41536l.m120489i(str, "productGroup");
        C41536l.m120489i(bigDecimal, "amountSum");
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "nameDictionaryKey");
        this.f72434a = str;
        this.f72435b = bigDecimal;
        this.f72436c = str2;
        this.f72437d = i;
        this.f72438e = str3;
    }

    /* renamed from: a */
    public final BigDecimal mo68259a() {
        return this.f72435b;
    }

    /* renamed from: b */
    public final String mo68260b() {
        return this.f72436c;
    }

    /* renamed from: c */
    public final int mo68261c() {
        return this.f72437d;
    }

    /* renamed from: d */
    public final String mo68262d() {
        return this.f72438e;
    }

    /* renamed from: e */
    public final String mo68263e() {
        return this.f72434a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28535c)) {
            return false;
        }
        C28535c cVar = (C28535c) obj;
        return C41536l.m120484d(this.f72434a, cVar.f72434a) && C41536l.m120484d(this.f72435b, cVar.f72435b) && C41536l.m120484d(this.f72436c, cVar.f72436c) && this.f72437d == cVar.f72437d && C41536l.m120484d(this.f72438e, cVar.f72438e);
    }

    public int hashCode() {
        return (((((((this.f72434a.hashCode() * 31) + this.f72435b.hashCode()) * 31) + this.f72436c.hashCode()) * 31) + this.f72437d) * 31) + this.f72438e.hashCode();
    }

    public String toString() {
        String str = this.f72434a;
        BigDecimal bigDecimal = this.f72435b;
        String str2 = this.f72436c;
        int i = this.f72437d;
        String str3 = this.f72438e;
        return "UpcomingPaymentSummaryUIModel(productGroup=" + str + ", amountSum=" + bigDecimal + ", ccy=" + str2 + ", count=" + i + ", nameDictionaryKey=" + str3 + ")";
    }
}
