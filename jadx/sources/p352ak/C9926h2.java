package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.drilldown.chart.DrilldownChart;
import p601sg.C17783h;

/* renamed from: ak.h2 */
public final class C9926h2 implements C6201a {

    /* renamed from: d */
    private final DrilldownChart f27054d;

    /* renamed from: e */
    public final DrilldownChart f27055e;

    private C9926h2(DrilldownChart drilldownChart, DrilldownChart drilldownChart2) {
        this.f27054d = drilldownChart;
        this.f27055e = drilldownChart2;
    }

    /* renamed from: a */
    public static C9926h2 m36409a(View view) {
        if (view != null) {
            DrilldownChart drilldownChart = (DrilldownChart) view;
            return new C9926h2(drilldownChart, drilldownChart);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9926h2 m36410d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_chart_percent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36409a(inflate);
    }

    /* renamed from: c */
    public DrilldownChart mo3946b() {
        return this.f27054d;
    }
}
