package p852ov;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;

/* renamed from: ov.b */
public final class C27087b {

    /* renamed from: a */
    private final C27088c f68033a;

    /* renamed from: b */
    private final OfferProductCode f68034b;

    /* renamed from: c */
    private final String f68035c;

    /* renamed from: d */
    private final BigDecimal f68036d;

    /* renamed from: e */
    private final String f68037e;

    /* renamed from: f */
    private final String f68038f;

    /* renamed from: g */
    private final String f68039g;

    /* renamed from: h */
    private final String f68040h;

    public C27087b(C27088c cVar, OfferProductCode offerProductCode, String str, BigDecimal bigDecimal, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(cVar, "operationType");
        C41536l.m120489i(offerProductCode, "limitCategory");
        C41536l.m120489i(str, "loanCcy");
        C41536l.m120489i(bigDecimal, "loanAmount");
        this.f68033a = cVar;
        this.f68034b = offerProductCode;
        this.f68035c = str;
        this.f68036d = bigDecimal;
        this.f68037e = str2;
        this.f68038f = str3;
        this.f68039g = str4;
        this.f68040h = str5;
    }

    /* renamed from: a */
    public final String mo66348a() {
        return this.f68039g;
    }

    /* renamed from: b */
    public final String mo66349b() {
        return this.f68040h;
    }

    /* renamed from: c */
    public final OfferProductCode mo66350c() {
        return this.f68034b;
    }

    /* renamed from: d */
    public final BigDecimal mo66351d() {
        return this.f68036d;
    }

    /* renamed from: e */
    public final String mo66352e() {
        return this.f68035c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27087b)) {
            return false;
        }
        C27087b bVar = (C27087b) obj;
        return this.f68033a == bVar.f68033a && C41536l.m120484d(this.f68034b, bVar.f68034b) && C41536l.m120484d(this.f68035c, bVar.f68035c) && C41536l.m120484d(this.f68036d, bVar.f68036d) && C41536l.m120484d(this.f68037e, bVar.f68037e) && C41536l.m120484d(this.f68038f, bVar.f68038f) && C41536l.m120484d(this.f68039g, bVar.f68039g) && C41536l.m120484d(this.f68040h, bVar.f68040h);
    }

    /* renamed from: f */
    public final C27088c mo66354f() {
        return this.f68033a;
    }

    /* renamed from: g */
    public final String mo66355g() {
        return this.f68037e;
    }

    /* renamed from: h */
    public final String mo66356h() {
        return this.f68038f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f68033a.hashCode() * 31) + this.f68034b.hashCode()) * 31) + this.f68035c.hashCode()) * 31) + this.f68036d.hashCode()) * 31;
        String str = this.f68037e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f68038f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f68039g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f68040h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        C27088c cVar = this.f68033a;
        OfferProductCode offerProductCode = this.f68034b;
        String str = this.f68035c;
        BigDecimal bigDecimal = this.f68036d;
        String str2 = this.f68037e;
        String str3 = this.f68038f;
        String str4 = this.f68039g;
        String str5 = this.f68040h;
        return "LoanOfferLimit(operationType=" + cVar + ", limitCategory=" + offerProductCode + ", loanCcy=" + str + ", loanAmount=" + bigDecimal + ", titleDictionaryKey=" + str2 + ", titleDictionaryKeyValue=" + str3 + ", infoDictionaryKey=" + str4 + ", infoDictionaryKeyValue=" + str5 + ")";
    }
}
