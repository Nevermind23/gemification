package i40;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: i40.b */
public final class C25116b {

    /* renamed from: a */
    private final String f64551a;

    /* renamed from: b */
    private BigDecimal f64552b;

    /* renamed from: c */
    private BigDecimal f64553c;

    /* renamed from: d */
    private List f64554d;

    public C25116b(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list) {
        C41536l.m120489i(str, "month");
        C41536l.m120489i(bigDecimal, "totalSpent");
        C41536l.m120489i(bigDecimal2, "totalBudget");
        C41536l.m120489i(list, "budgetModels");
        this.f64551a = str;
        this.f64552b = bigDecimal;
        this.f64553c = bigDecimal2;
        this.f64554d = list;
    }

    /* renamed from: a */
    public final List mo63643a() {
        return this.f64554d;
    }

    /* renamed from: b */
    public final String mo63644b() {
        return this.f64551a;
    }

    /* renamed from: c */
    public final BigDecimal mo63645c() {
        return this.f64553c;
    }

    /* renamed from: d */
    public final BigDecimal mo63646d() {
        return this.f64552b;
    }

    /* renamed from: e */
    public final void mo63647e(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f64554d = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25116b)) {
            return false;
        }
        C25116b bVar = (C25116b) obj;
        return C41536l.m120484d(this.f64551a, bVar.f64551a) && C41536l.m120484d(this.f64552b, bVar.f64552b) && C41536l.m120484d(this.f64553c, bVar.f64553c) && C41536l.m120484d(this.f64554d, bVar.f64554d);
    }

    /* renamed from: f */
    public final void mo63649f(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "<set-?>");
        this.f64552b = bigDecimal;
    }

    public int hashCode() {
        return (((((this.f64551a.hashCode() * 31) + this.f64552b.hashCode()) * 31) + this.f64553c.hashCode()) * 31) + this.f64554d.hashCode();
    }

    public String toString() {
        String str = this.f64551a;
        BigDecimal bigDecimal = this.f64552b;
        BigDecimal bigDecimal2 = this.f64553c;
        List list = this.f64554d;
        return "BudgetMonthModel(month=" + str + ", totalSpent=" + bigDecimal + ", totalBudget=" + bigDecimal2 + ", budgetModels=" + list + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C25116b(java.lang.String r1, java.math.BigDecimal r2, java.math.BigDecimal r3, java.util.List r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L_0x000b
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
            java.lang.String r6 = "ZERO"
            kotlin.jvm.internal.C41536l.m120488h(r3, r6)
        L_0x000b:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0014
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0014:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i40.C25116b.<init>(java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
