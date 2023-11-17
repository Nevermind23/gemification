package w51;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: w51.f0 */
public final class C39556f0 {

    /* renamed from: a */
    private final boolean f94029a;

    /* renamed from: b */
    private final boolean f94030b;

    /* renamed from: c */
    private final boolean f94031c;

    /* renamed from: d */
    private final boolean f94032d;

    /* renamed from: e */
    private final boolean f94033e;

    /* renamed from: f */
    private final boolean f94034f;

    /* renamed from: g */
    private final List f94035g;

    public C39556f0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list) {
        C41536l.m120489i(list, "statements");
        this.f94029a = z;
        this.f94030b = z2;
        this.f94031c = z3;
        this.f94032d = z4;
        this.f94033e = z5;
        this.f94034f = z6;
        this.f94035g = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C39556f0 m114968b(C39556f0 f0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = f0Var.f94029a;
        }
        if ((i & 2) != 0) {
            z2 = f0Var.f94030b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = f0Var.f94031c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = f0Var.f94032d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = f0Var.f94033e;
        }
        boolean z12 = z5;
        if ((i & 32) != 0) {
            z6 = f0Var.f94034f;
        }
        boolean z13 = z6;
        if ((i & 64) != 0) {
            list = f0Var.f94035g;
        }
        return f0Var.mo93225a(z, z7, z8, z9, z12, z13, list);
    }

    /* renamed from: a */
    public final C39556f0 mo93225a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list) {
        List list2 = list;
        C41536l.m120489i(list2, "statements");
        return new C39556f0(z, z2, z3, z4, z5, z6, list2);
    }

    /* renamed from: c */
    public final boolean mo93226c() {
        return this.f94032d;
    }

    /* renamed from: d */
    public final boolean mo93227d() {
        return this.f94030b;
    }

    /* renamed from: e */
    public final boolean mo93228e() {
        return this.f94031c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39556f0)) {
            return false;
        }
        C39556f0 f0Var = (C39556f0) obj;
        return this.f94029a == f0Var.f94029a && this.f94030b == f0Var.f94030b && this.f94031c == f0Var.f94031c && this.f94032d == f0Var.f94032d && this.f94033e == f0Var.f94033e && this.f94034f == f0Var.f94034f && C41536l.m120484d(this.f94035g, f0Var.f94035g);
    }

    /* renamed from: f */
    public final boolean mo93230f() {
        return this.f94029a;
    }

    /* renamed from: g */
    public final boolean mo93231g() {
        return this.f94033e;
    }

    /* renamed from: h */
    public final boolean mo93232h() {
        return this.f94034f;
    }

    public int hashCode() {
        boolean z = this.f94029a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f94030b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f94031c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f94032d;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f94033e;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f94034f;
        if (!z7) {
            z2 = z7;
        }
        return ((i5 + (z2 ? 1 : 0)) * 31) + this.f94035g.hashCode();
    }

    /* renamed from: i */
    public final List mo93234i() {
        return this.f94035g;
    }

    public String toString() {
        boolean z = this.f94029a;
        boolean z2 = this.f94030b;
        boolean z3 = this.f94031c;
        boolean z4 = this.f94032d;
        boolean z5 = this.f94033e;
        boolean z6 = this.f94034f;
        List list = this.f94035g;
        return "StatementsUiState(moreLoading=" + z + ", dataLoading=" + z2 + ", moreError=" + z3 + ", dataError=" + z4 + ", noData=" + z5 + ", showDownloadButton=" + z6 + ", statements=" + list + ")";
    }
}
