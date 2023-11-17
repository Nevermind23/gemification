package wp0;

import kotlin.jvm.internal.C41536l;

/* renamed from: wp0.c */
public final class C39631c {

    /* renamed from: a */
    private final double f94193a;

    /* renamed from: b */
    private final String f94194b;

    /* renamed from: c */
    private final C39635g f94195c;

    public C39631c(double d, String str, C39635g gVar) {
        C41536l.m120489i(gVar, "rateType");
        this.f94193a = d;
        this.f94194b = str;
        this.f94195c = gVar;
    }

    /* renamed from: a */
    public final double mo93323a() {
        return this.f94193a;
    }

    /* renamed from: b */
    public final String mo93324b() {
        return this.f94194b;
    }

    /* renamed from: c */
    public final C39635g mo93325c() {
        return this.f94195c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39631c)) {
            return false;
        }
        C39631c cVar = (C39631c) obj;
        return Double.compare(this.f94193a, cVar.f94193a) == 0 && C41536l.m120484d(this.f94194b, cVar.f94194b) && this.f94195c == cVar.f94195c;
    }

    public int hashCode() {
        int a = Double.doubleToLongBits(this.f94193a) * 31;
        String str = this.f94194b;
        return ((a + (str == null ? 0 : str.hashCode())) * 31) + this.f94195c.hashCode();
    }

    public String toString() {
        double d = this.f94193a;
        String str = this.f94194b;
        C39635g gVar = this.f94195c;
        return "InsuranceInfo(rate=" + d + ", rateCcy=" + str + ", rateType=" + gVar + ")";
    }
}
