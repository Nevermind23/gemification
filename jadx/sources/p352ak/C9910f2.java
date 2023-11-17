package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.drilldown.chart.DrilldownChart;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.f2 */
public final class C9910f2 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26977d;

    /* renamed from: e */
    public final AppCompatTextView f26978e;

    /* renamed from: f */
    public final DrilldownChart f26979f;

    /* renamed from: g */
    public final AppCompatTextView f26980g;

    private C9910f2(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, DrilldownChart drilldownChart, AppCompatTextView appCompatTextView2) {
        this.f26977d = constraintLayout;
        this.f26978e = appCompatTextView;
        this.f26979f = drilldownChart;
        this.f26980g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9910f2 m36351a(View view) {
        int i = C17782g.f49676C;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.chart;
            DrilldownChart drilldownChart = (DrilldownChart) C6202b.m24689a(view, i);
            if (drilldownChart != null) {
                i = C17782g.f49745Y8;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    return new C9910f2((ConstraintLayout) view, appCompatTextView, drilldownChart, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9910f2 m36352d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_chart, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36351a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26977d;
    }
}
