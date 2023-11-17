package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.v1 */
public final class C27444v1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70050d;

    /* renamed from: e */
    public final LinearLayout f70051e;

    /* renamed from: f */
    public final BarChart f70052f;

    /* renamed from: g */
    public final AppCompatButton f70053g;

    /* renamed from: h */
    public final FrameLayout f70054h;

    /* renamed from: i */
    public final LinearLayout f70055i;

    /* renamed from: j */
    public final LineChart f70056j;

    /* renamed from: k */
    public final BogTextView f70057k;

    /* renamed from: l */
    public final LinearLayout f70058l;

    /* renamed from: m */
    public final TabsView f70059m;

    private C27444v1(LinearLayout linearLayout, LinearLayout linearLayout2, BarChart barChart, AppCompatButton appCompatButton, FrameLayout frameLayout, LinearLayout linearLayout3, LineChart lineChart, BogTextView bogTextView, LinearLayout linearLayout4, TabsView tabsView) {
        this.f70050d = linearLayout;
        this.f70051e = linearLayout2;
        this.f70052f = barChart;
        this.f70053g = appCompatButton;
        this.f70054h = frameLayout;
        this.f70055i = linearLayout3;
        this.f70056j = lineChart;
        this.f70057k = bogTextView;
        this.f70058l = linearLayout4;
        this.f70059m = tabsView;
    }

    /* renamed from: a */
    public static C27444v1 m85082a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C10322k.bar_chart;
        BarChart barChart = (BarChart) C6202b.m24689a(view, i);
        if (barChart != null) {
            i = C10322k.ccy_logo;
            AppCompatButton appCompatButton = (AppCompatButton) C6202b.m24689a(view, i);
            if (appCompatButton != null) {
                i = C10322k.f28803Wc;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    i = C10322k.f28845if;
                    LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout2 != null) {
                        i = C10322k.line_chart;
                        LineChart lineChart = (LineChart) C6202b.m24689a(view, i);
                        if (lineChart != null) {
                            i = C10322k.rate_ccy_header_tv;
                            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
                            if (bogTextView != null) {
                                i = C10322k.rates_chart_root;
                                LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view, i);
                                if (linearLayout3 != null) {
                                    i = C10322k.tab_layout;
                                    TabsView tabsView = (TabsView) C6202b.m24689a(view, i);
                                    if (tabsView != null) {
                                        return new C27444v1(linearLayout, linearLayout, barChart, appCompatButton, frameLayout, linearLayout2, lineChart, bogTextView, linearLayout3, tabsView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27444v1 m85083d(LayoutInflater layoutInflater) {
        return m85084e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27444v1 m85084e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_rates_chart_landscape, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85082a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70050d;
    }
}
