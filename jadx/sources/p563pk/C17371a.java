package p563pk;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: pk.a */
public final class C17371a {

    /* renamed from: a */
    private final String f48707a;

    /* renamed from: b */
    private final String f48708b;

    /* renamed from: c */
    private final String f48709c;

    /* renamed from: d */
    private final Double f48710d;

    /* renamed from: e */
    private final List f48711e;

    public C17371a(String str, String str2, String str3, Double d, List list) {
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(str2, "providerName");
        C41536l.m120489i(list, "limitAmounts");
        this.f48707a = str;
        this.f48708b = str2;
        this.f48709c = str3;
        this.f48710d = d;
        this.f48711e = list;
    }

    /* renamed from: a */
    public final List mo44813a() {
        return this.f48711e;
    }

    /* renamed from: b */
    public final Double mo44814b() {
        return this.f48710d;
    }

    /* renamed from: c */
    public final String mo44815c() {
        return this.f48707a;
    }

    /* renamed from: d */
    public final String mo44816d() {
        return this.f48709c;
    }

    /* renamed from: e */
    public final String mo44817e() {
        return this.f48708b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17371a)) {
            return false;
        }
        C17371a aVar = (C17371a) obj;
        return C41536l.m120484d(this.f48707a, aVar.f48707a) && C41536l.m120484d(this.f48708b, aVar.f48708b) && C41536l.m120484d(this.f48709c, aVar.f48709c) && C41536l.m120484d(this.f48710d, aVar.f48710d) && C41536l.m120484d(this.f48711e, aVar.f48711e);
    }

    public int hashCode() {
        int hashCode = ((this.f48707a.hashCode() * 31) + this.f48708b.hashCode()) * 31;
        String str = this.f48709c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f48710d;
        if (d != null) {
            i = d.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f48711e.hashCode();
    }

    public String toString() {
        String str = this.f48707a;
        String str2 = this.f48708b;
        String str3 = this.f48709c;
        Double d = this.f48710d;
        List list = this.f48711e;
        return "AutoLiabilityInsuranceProvider(providerId=" + str + ", providerName=" + str2 + ", providerLogoUrl=" + str3 + ", monthlyPayment=" + d + ", limitAmounts=" + list + ")";
    }
}
