package p551om;

import kotlin.jvm.internal.C41536l;

/* renamed from: om.c */
public final class C17267c {

    /* renamed from: a */
    private final double f48547a;

    /* renamed from: b */
    private final String f48548b;

    public C17267c(double d, String str) {
        C41536l.m120489i(str, "feeCcy");
        this.f48547a = d;
        this.f48548b = str;
    }

    /* renamed from: a */
    public final double mo44665a() {
        return this.f48547a;
    }

    /* renamed from: b */
    public final String mo44666b() {
        return this.f48548b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17267c)) {
            return false;
        }
        C17267c cVar = (C17267c) obj;
        return Double.compare(this.f48547a, cVar.f48547a) == 0 && C41536l.m120484d(this.f48548b, cVar.f48548b);
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f48547a) * 31) + this.f48548b.hashCode();
    }

    public String toString() {
        double d = this.f48547a;
        String str = this.f48548b;
        return "DebitCardDeliveryFee(feeAmount=" + d + ", feeCcy=" + str + ")";
    }
}
