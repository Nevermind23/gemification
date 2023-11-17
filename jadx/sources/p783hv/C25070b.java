package p783hv;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: hv.b */
public final class C25070b {

    /* renamed from: a */
    private final boolean f64419a;

    /* renamed from: b */
    private final List f64420b;

    /* renamed from: c */
    private final boolean f64421c;

    /* renamed from: d */
    private final double f64422d;

    /* renamed from: e */
    private final double f64423e;

    /* renamed from: f */
    private final double f64424f;

    public C25070b(boolean z, List list, boolean z2, double d, double d2, double d3) {
        C41536l.m120489i(list, "receivers");
        this.f64419a = z;
        this.f64420b = list;
        this.f64421c = z2;
        this.f64422d = d;
        this.f64423e = d2;
        this.f64424f = d3;
    }

    /* renamed from: b */
    public static /* synthetic */ C25070b m80025b(C25070b bVar, boolean z, List list, boolean z2, double d, double d2, double d3, int i, Object obj) {
        C25070b bVar2 = bVar;
        return bVar.mo63513a((i & 1) != 0 ? bVar2.f64419a : z, (i & 2) != 0 ? bVar2.f64420b : list, (i & 4) != 0 ? bVar2.f64421c : z2, (i & 8) != 0 ? bVar2.f64422d : d, (i & 16) != 0 ? bVar2.f64423e : d2, (i & 32) != 0 ? bVar2.f64424f : d3);
    }

    /* renamed from: a */
    public final C25070b mo63513a(boolean z, List list, boolean z2, double d, double d2, double d3) {
        C41536l.m120489i(list, "receivers");
        return new C25070b(z, list, z2, d, d2, d3);
    }

    /* renamed from: c */
    public final double mo63514c() {
        return this.f64422d;
    }

    /* renamed from: d */
    public final boolean mo63515d() {
        return mo63520h() == 2 && this.f64421c;
    }

    /* renamed from: e */
    public final boolean mo63516e() {
        return this.f64421c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25070b)) {
            return false;
        }
        C25070b bVar = (C25070b) obj;
        return this.f64419a == bVar.f64419a && C41536l.m120484d(this.f64420b, bVar.f64420b) && this.f64421c == bVar.f64421c && Double.compare(this.f64422d, bVar.f64422d) == 0 && Double.compare(this.f64423e, bVar.f64423e) == 0 && Double.compare(this.f64424f, bVar.f64424f) == 0;
    }

    /* renamed from: f */
    public final double mo63518f() {
        return this.f64423e;
    }

    /* renamed from: g */
    public final List mo63519g() {
        return this.f64420b;
    }

    /* renamed from: h */
    public final int mo63520h() {
        return this.f64420b.size() + (this.f64421c ? 1 : 0);
    }

    public int hashCode() {
        boolean z = this.f64419a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((z ? 1 : 0) * true) + this.f64420b.hashCode()) * 31;
        boolean z3 = this.f64421c;
        if (!z3) {
            z2 = z3;
        }
        return ((((((hashCode + (z2 ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f64422d)) * 31) + Double.doubleToLongBits(this.f64423e)) * 31) + Double.doubleToLongBits(this.f64424f);
    }

    /* renamed from: i */
    public final double mo63522i() {
        return this.f64424f;
    }

    /* renamed from: j */
    public final boolean mo63523j() {
        return this.f64419a;
    }

    public String toString() {
        boolean z = this.f64419a;
        List list = this.f64420b;
        boolean z2 = this.f64421c;
        double d = this.f64422d;
        double d2 = this.f64423e;
        double d3 = this.f64424f;
        return "BillSplitData(splitManually=" + z + ", receivers=" + list + ", includeCurrentUser=" + z2 + ", currentUserAmount=" + d + ", operationsAmount=" + d2 + ", splitAmount=" + d3 + ")";
    }
}
