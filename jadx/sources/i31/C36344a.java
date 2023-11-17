package i31;

import kotlin.jvm.internal.C41536l;

/* renamed from: i31.a */
public final class C36344a {

    /* renamed from: a */
    private final double f87710a;

    /* renamed from: b */
    private final String f87711b;

    /* renamed from: c */
    private final Double f87712c;

    public C36344a(double d, String str, Double d2) {
        C41536l.m120489i(str, "insuranceType");
        this.f87710a = d;
        this.f87711b = str;
        this.f87712c = d2;
    }

    /* renamed from: a */
    public final double mo89058a() {
        return this.f87710a;
    }

    /* renamed from: b */
    public final String mo89059b() {
        return this.f87711b;
    }

    /* renamed from: c */
    public final Double mo89060c() {
        return this.f87712c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36344a)) {
            return false;
        }
        C36344a aVar = (C36344a) obj;
        return Double.compare(this.f87710a, aVar.f87710a) == 0 && C41536l.m120484d(this.f87711b, aVar.f87711b) && C41536l.m120484d(this.f87712c, aVar.f87712c);
    }

    public int hashCode() {
        int a = ((Double.doubleToLongBits(this.f87710a) * 31) + this.f87711b.hashCode()) * 31;
        Double d = this.f87712c;
        return a + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        double d = this.f87710a;
        String str = this.f87711b;
        Double d2 = this.f87712c;
        return "CardInsuranceFee(fee=" + d + ", insuranceType=" + str + ", realFee=" + d2 + ")";
    }
}
