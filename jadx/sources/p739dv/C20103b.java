package p739dv;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: dv.b */
public final class C20103b {

    /* renamed from: a */
    private final String f54729a;

    /* renamed from: b */
    private final BigDecimal f54730b;

    /* renamed from: c */
    private final String f54731c;

    public C20103b(String str, BigDecimal bigDecimal, String str2) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(bigDecimal, "amountBase");
        C41536l.m120489i(str2, "dictionaryKey");
        this.f54729a = str;
        this.f54730b = bigDecimal;
        this.f54731c = str2;
    }

    /* renamed from: a */
    public final BigDecimal mo48508a() {
        return this.f54730b;
    }

    /* renamed from: b */
    public final String mo48509b() {
        return this.f54731c;
    }

    /* renamed from: c */
    public final String mo48510c() {
        return this.f54729a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20103b)) {
            return false;
        }
        C20103b bVar = (C20103b) obj;
        return C41536l.m120484d(this.f54729a, bVar.f54729a) && C41536l.m120484d(this.f54730b, bVar.f54730b) && C41536l.m120484d(this.f54731c, bVar.f54731c);
    }

    public int hashCode() {
        return (((this.f54729a.hashCode() * 31) + this.f54730b.hashCode()) * 31) + this.f54731c.hashCode();
    }

    public String toString() {
        String str = this.f54729a;
        BigDecimal bigDecimal = this.f54730b;
        String str2 = this.f54731c;
        return "AssetLiabilityDetail(productType=" + str + ", amountBase=" + bigDecimal + ", dictionaryKey=" + str2 + ")";
    }
}
