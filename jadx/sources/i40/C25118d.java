package i40;

import com.github.mikephil.charting.data.BarData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: i40.d */
public final class C25118d {

    /* renamed from: a */
    private final ArrayList f64562a;

    /* renamed from: b */
    private final BarData f64563b;

    /* renamed from: c */
    private final HashSet f64564c;

    /* renamed from: d */
    private final List f64565d;

    public C25118d(ArrayList arrayList, BarData barData, HashSet hashSet, List list) {
        C41536l.m120489i(arrayList, "chartLabels");
        C41536l.m120489i(barData, "chartData");
        C41536l.m120489i(hashSet, "overspentIndexes");
        C41536l.m120489i(list, "budgetingMonths");
        this.f64562a = arrayList;
        this.f64563b = barData;
        this.f64564c = hashSet;
        this.f64565d = list;
    }

    /* renamed from: a */
    public final List mo63659a() {
        return this.f64565d;
    }

    /* renamed from: b */
    public final BarData mo63660b() {
        return this.f64563b;
    }

    /* renamed from: c */
    public final ArrayList mo63661c() {
        return this.f64562a;
    }

    /* renamed from: d */
    public final HashSet mo63662d() {
        return this.f64564c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25118d)) {
            return false;
        }
        C25118d dVar = (C25118d) obj;
        return C41536l.m120484d(this.f64562a, dVar.f64562a) && C41536l.m120484d(this.f64563b, dVar.f64563b) && C41536l.m120484d(this.f64564c, dVar.f64564c) && C41536l.m120484d(this.f64565d, dVar.f64565d);
    }

    public int hashCode() {
        return (((((this.f64562a.hashCode() * 31) + this.f64563b.hashCode()) * 31) + this.f64564c.hashCode()) * 31) + this.f64565d.hashCode();
    }

    public String toString() {
        ArrayList arrayList = this.f64562a;
        BarData barData = this.f64563b;
        HashSet hashSet = this.f64564c;
        List list = this.f64565d;
        return "BudgetingHistoryModel(chartLabels=" + arrayList + ", chartData=" + barData + ", overspentIndexes=" + hashSet + ", budgetingMonths=" + list + ")";
    }
}
