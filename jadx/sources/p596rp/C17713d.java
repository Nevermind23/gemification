package p596rp;

import kotlin.jvm.internal.C41536l;

/* renamed from: rp.d */
public final class C17713d {

    /* renamed from: a */
    private final double f49486a;

    /* renamed from: b */
    private final String f49487b;

    /* renamed from: c */
    private final C17712c f49488c;

    public C17713d(double d, String str, C17712c cVar) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(cVar, "type");
        this.f49486a = d;
        this.f49487b = str;
        this.f49488c = cVar;
    }

    /* renamed from: a */
    public final double mo45291a() {
        return this.f49486a;
    }

    /* renamed from: b */
    public final String mo45292b() {
        return this.f49487b;
    }

    /* renamed from: c */
    public final C17712c mo45293c() {
        return this.f49488c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17713d)) {
            return false;
        }
        C17713d dVar = (C17713d) obj;
        return Double.compare(this.f49486a, dVar.f49486a) == 0 && C41536l.m120484d(this.f49487b, dVar.f49487b) && this.f49488c == dVar.f49488c;
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.f49486a) * 31) + this.f49487b.hashCode()) * 31) + this.f49488c.hashCode();
    }

    public String toString() {
        double d = this.f49486a;
        String str = this.f49487b;
        C17712c cVar = this.f49488c;
        return "PaymentFeeUiModel(amount=" + d + ", ccy=" + str + ", type=" + cVar + ")";
    }
}
