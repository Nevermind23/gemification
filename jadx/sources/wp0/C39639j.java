package wp0;

import kotlin.jvm.internal.C41536l;

/* renamed from: wp0.j */
public final class C39639j {

    /* renamed from: a */
    private Double f94248a;

    /* renamed from: b */
    private String f94249b;

    /* renamed from: c */
    private Double f94250c;

    /* renamed from: d */
    private Double f94251d;

    public C39639j(Double d, String str, Double d2, Double d3) {
        this.f94248a = d;
        this.f94249b = str;
        this.f94250c = d2;
        this.f94251d = d3;
    }

    /* renamed from: a */
    public final String mo93385a() {
        return this.f94249b;
    }

    /* renamed from: b */
    public final Double mo93386b() {
        return this.f94251d;
    }

    /* renamed from: c */
    public final Double mo93387c() {
        return this.f94248a;
    }

    /* renamed from: d */
    public final Double mo93388d() {
        return this.f94250c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39639j)) {
            return false;
        }
        C39639j jVar = (C39639j) obj;
        return C41536l.m120484d(this.f94248a, jVar.f94248a) && C41536l.m120484d(this.f94249b, jVar.f94249b) && C41536l.m120484d(this.f94250c, jVar.f94250c) && C41536l.m120484d(this.f94251d, jVar.f94251d);
    }

    public int hashCode() {
        Double d = this.f94248a;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.f94249b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.f94250c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f94251d;
        if (d3 != null) {
            i = d3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        Double d = this.f94248a;
        String str = this.f94249b;
        Double d2 = this.f94250c;
        Double d3 = this.f94251d;
        return "Summary(intAmount=" + d + ", ccy=" + str + ", priAmount=" + d2 + ", fullAmount=" + d3 + ")";
    }
}
