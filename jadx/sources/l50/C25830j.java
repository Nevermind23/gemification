package l50;

import kotlin.jvm.internal.C41536l;

/* renamed from: l50.j */
public final class C25830j {

    /* renamed from: a */
    private final double f65697a;

    /* renamed from: b */
    private final Double f65698b;

    /* renamed from: c */
    private final Double f65699c;

    /* renamed from: d */
    private final String f65700d;

    public C25830j(double d, Double d2, Double d3, String str) {
        C41536l.m120489i(str, "ccy");
        this.f65697a = d;
        this.f65698b = d2;
        this.f65699c = d3;
        this.f65700d = str;
    }

    /* renamed from: a */
    public final double mo64510a() {
        return this.f65697a;
    }

    /* renamed from: b */
    public final String mo64511b() {
        return this.f65700d;
    }

    /* renamed from: c */
    public final Double mo64512c() {
        return this.f65698b;
    }

    /* renamed from: d */
    public final Double mo64513d() {
        return this.f65699c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25830j)) {
            return false;
        }
        C25830j jVar = (C25830j) obj;
        return Double.compare(this.f65697a, jVar.f65697a) == 0 && C41536l.m120484d(this.f65698b, jVar.f65698b) && C41536l.m120484d(this.f65699c, jVar.f65699c) && C41536l.m120484d(this.f65700d, jVar.f65700d);
    }

    public int hashCode() {
        int a = Double.doubleToLongBits(this.f65697a) * 31;
        Double d = this.f65698b;
        int i = 0;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f65699c;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f65700d.hashCode();
    }

    public String toString() {
        double d = this.f65697a;
        Double d2 = this.f65698b;
        Double d3 = this.f65699c;
        String str = this.f65700d;
        return "AccountWithCardsStudDepInfoUIModel(amount=" + d + ", intAccrued=" + d2 + ", intRate=" + d3 + ", ccy=" + str + ")";
    }
}
