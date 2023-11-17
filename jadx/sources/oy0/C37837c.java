package oy0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: oy0.c */
public final class C37837c {

    /* renamed from: a */
    private final double f90874a;

    /* renamed from: b */
    private final double f90875b;

    /* renamed from: c */
    private final List f90876c;

    public C37837c(double d, double d2, List list) {
        C41536l.m120489i(list, "breakDestinationAccounts");
        this.f90874a = d;
        this.f90875b = d2;
        this.f90876c = list;
    }

    /* renamed from: a */
    public final double mo91172a() {
        return this.f90875b;
    }

    /* renamed from: b */
    public final List mo91173b() {
        return this.f90876c;
    }

    /* renamed from: c */
    public final double mo91174c() {
        return this.f90874a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37837c)) {
            return false;
        }
        C37837c cVar = (C37837c) obj;
        return Double.compare(this.f90874a, cVar.f90874a) == 0 && Double.compare(this.f90875b, cVar.f90875b) == 0 && C41536l.m120484d(this.f90876c, cVar.f90876c);
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.f90874a) * 31) + Double.doubleToLongBits(this.f90875b)) * 31) + this.f90876c.hashCode();
    }

    public String toString() {
        double d = this.f90874a;
        double d2 = this.f90875b;
        List list = this.f90876c;
        return "DepositBreakInfo(breakInterest=" + d + ", breakAmount=" + d2 + ", breakDestinationAccounts=" + list + ")";
    }
}
