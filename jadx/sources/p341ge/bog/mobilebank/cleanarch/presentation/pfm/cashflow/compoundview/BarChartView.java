package p341ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.res.C0808h;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import g91.C32335t0;
import g91.C32343x;
import he1.C41217g;
import he1.C41224m;
import java.util.HashSet;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o40.C26721a;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartView */
public final class BarChartView extends LinearLayout {

    /* renamed from: s */
    public static final C22137a f58845s = new C22137a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f58846d;

    /* renamed from: e */
    private final C41217g f58847e;

    /* renamed from: f */
    private final C41217g f58848f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public CashFlowViewModel f58849g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f58850h;

    /* renamed from: i */
    private int f58851i;

    /* renamed from: j */
    private int f58852j;

    /* renamed from: k */
    private int f58853k;

    /* renamed from: l */
    private int f58854l;

    /* renamed from: m */
    private int f58855m;

    /* renamed from: n */
    private int f58856n;

    /* renamed from: o */
    private int f58857o;

    /* renamed from: p */
    private String f58858p;

    /* renamed from: q */
    private int f58859q;

    /* renamed from: r */
    private boolean f58860r;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartView$a */
    public static final class C22137a {
        private C22137a() {
        }

        public /* synthetic */ C22137a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartView$b */
    static final class C22138b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BarChartView f58861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22138b(BarChartView barChartView) {
            super(0);
            this.f58861d = barChartView;
        }

        /* renamed from: b */
        public final BarChartFooterView invoke() {
            return (BarChartFooterView) this.f58861d.findViewById(C10322k.footerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartView$c */
    public static final class C22139c extends ValueFormatter {

        /* renamed from: a */
        final /* synthetic */ BarChartView f58862a;

        C22139c(BarChartView barChartView) {
            this.f58862a = barChartView;
        }

        public String getFormattedValue(float f) {
            CashFlowViewModel a = this.f58862a.f58849g;
            if (a == null) {
                C41536l.m120506z("cashFlowViewModel");
                a = null;
            }
            return a.mo54967vw(f);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartView$d */
    public static final class C22140d implements OnChartValueSelectedListener {

        /* renamed from: a */
        final /* synthetic */ BarChartView f58863a;

        C22140d(BarChartView barChartView) {
            this.f58863a = barChartView;
        }

        public void onNothingSelected() {
        }

        public void onValueSelected(Entry entry, Highlight highlight) {
            Object obj;
            BarChartView barChartView = this.f58863a;
            CashFlowViewModel cashFlowViewModel = null;
            if (entry != null) {
                obj = entry.getData();
            } else {
                obj = null;
            }
            C41536l.m120487g(obj, "null cannot be cast to non-null type kotlin.Int");
            barChartView.f58850h = ((Integer) obj).intValue();
            BarChartView barChartView2 = this.f58863a;
            barChartView2.m71750k(barChartView2.f58850h);
            CashFlowViewModel a = this.f58863a.f58849g;
            if (a == null) {
                C41536l.m120506z("cashFlowViewModel");
            } else {
                cashFlowViewModel = a;
            }
            cashFlowViewModel.mo54969xw(this.f58863a.f58850h);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartView$e */
    static final class C22141e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BarChartView f58864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22141e(BarChartView barChartView) {
            super(0);
            this.f58864d = barChartView;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            return (LinearLayout) this.f58864d.findViewById(C10322k.chart_progress_bar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartView$f */
    static final class C22142f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BarChartView f58865d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22142f(BarChartView barChartView) {
            super(0);
            this.f58865d = barChartView;
        }

        /* renamed from: b */
        public final StackedBarChart invoke() {
            return (StackedBarChart) this.f58865d.findViewById(C10322k.ccCombinedChart);
        }
    }

    public BarChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    private final void m71746f(int i) {
        CashFlowViewModel cashFlowViewModel = this.f58849g;
        if (cashFlowViewModel == null) {
            C41536l.m120506z("cashFlowViewModel");
            cashFlowViewModel = null;
        }
        C41224m yw = cashFlowViewModel.mo54970yw(this.f58851i, this.f58853k, this.f58852j, this.f58854l, i);
        BarDataSet barDataSet = (BarDataSet) yw.mo95678e();
        barDataSet.setDrawValues(false);
        barDataSet.setHighLightColor(this.f58857o);
        barDataSet.setHighLightAlpha(20);
        BarDataSet barDataSet2 = (BarDataSet) yw.mo95680f();
        barDataSet2.setDrawValues(false);
        barDataSet2.setHighLightColor(this.f58857o);
        barDataSet2.setHighLightAlpha(20);
        BarData barData = new BarData(barDataSet, barDataSet2);
        barData.setBarWidth(0.3f);
        getStackedBarChart().setData(barData);
        getStackedBarChart().groupBars(Utils.FLOAT_EPSILON, 0.3f, 0.05f);
    }

    /* renamed from: g */
    private final void m71747g() {
        CashFlowViewModel cashFlowViewModel = this.f58849g;
        if (cashFlowViewModel == null) {
            C41536l.m120506z("cashFlowViewModel");
            cashFlowViewModel = null;
        }
        int ww = cashFlowViewModel.mo54968ww();
        m71749j();
        m71746f(ww);
        getStackedBarChart().getXAxis().setAxisMaximum(((BarData) getStackedBarChart().getData()).getXMax() + 1.0f);
        getStackedBarChart().setVisibleXRangeMaximum(7.0f);
        this.f58859q = ww;
    }

    private final BarChartFooterView getFooterView() {
        Object value = this.f58847e.getValue();
        C41536l.m120488h(value, "<get-footerView>(...)");
        return (BarChartFooterView) value;
    }

    private final LinearLayout getLayoutProgress() {
        Object value = this.f58848f.getValue();
        C41536l.m120488h(value, "<get-layoutProgress>(...)");
        return (LinearLayout) value;
    }

    private final StackedBarChart getStackedBarChart() {
        Object value = this.f58846d.getValue();
        C41536l.m120488h(value, "<get-stackedBarChart>(...)");
        return (StackedBarChart) value;
    }

    /* renamed from: i */
    private final void m71748i(int i) {
        BarEntry barEntry = (BarEntry) ((IBarDataSet) getStackedBarChart().getBarData().getDataSets().get(0)).getEntryForIndex(i);
        Highlight highlight = new Highlight(barEntry.getX(), barEntry.getY(), 0);
        highlight.setDataIndex(1);
        getStackedBarChart().highlightValue(highlight, true);
    }

    /* renamed from: j */
    private final void m71749j() {
        StackedBarChart stackedBarChart = getStackedBarChart();
        stackedBarChart.setDragEnabled(false);
        stackedBarChart.animateY(500, Easing.EaseInOutExpo);
        ChartAnimator animator = stackedBarChart.getAnimator();
        C41536l.m120488h(animator, "animator");
        ViewPortHandler viewPortHandler = stackedBarChart.getViewPortHandler();
        C41536l.m120488h(viewPortHandler, "viewPortHandler");
        stackedBarChart.setRenderer(new C26721a(stackedBarChart, animator, viewPortHandler, false, (HashSet) null, 24, (DefaultConstructorMarker) null));
        Legend legend = stackedBarChart.getLegend();
        if (legend != null) {
            legend.setEnabled(false);
        }
        YAxis axisRight = stackedBarChart.getAxisRight();
        if (axisRight != null) {
            axisRight.setEnabled(false);
        }
        YAxis axisLeft = stackedBarChart.getAxisLeft();
        if (axisLeft != null) {
            C41536l.m120488h(axisLeft, "axisLeft");
            axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisLeft.setAxisMinimum(Utils.FLOAT_EPSILON);
            axisLeft.setDrawGridLines(true);
            axisLeft.setDrawAxisLine(false);
            axisLeft.setTextColor(Color.rgb(102, 102, 102));
        }
        XAxis xAxis = stackedBarChart.getXAxis();
        if (xAxis != null) {
            C41536l.m120488h(xAxis, "xAxis");
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setAxisMinimum(Utils.FLOAT_EPSILON);
            xAxis.setYOffset((float) C32343x.m95392H(4.0f));
            xAxis.setDrawAxisLine(true);
            xAxis.setDrawGridLines(false);
            xAxis.setValueFormatter(new C22139c(this));
            xAxis.setCenterAxisLabels(true);
            xAxis.setTextColor(Color.rgb(102, 102, 102));
        }
        stackedBarChart.setExtraOffsets(Utils.FLOAT_EPSILON, -((float) C32343x.m95392H(50.0f)), Utils.FLOAT_EPSILON, 6.0f);
        Resources resources = stackedBarChart.getResources();
        int i = C10318g.f28625J0;
        stackedBarChart.setBackgroundColor(C0808h.m3029d(resources, i, (Resources.Theme) null));
        stackedBarChart.setDrawGridBackground(true);
        stackedBarChart.setGridBackgroundColor(C0808h.m3029d(stackedBarChart.getResources(), i, (Resources.Theme) null));
        stackedBarChart.setDrawBarShadow(false);
        stackedBarChart.setScaleEnabled(false);
        stackedBarChart.getDescription().setEnabled(false);
        stackedBarChart.setHighlightFullBarEnabled(false);
        stackedBarChart.setOnChartValueSelectedListener(new C22140d(this));
        stackedBarChart.invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m71750k(int i) {
        m71746f(i);
        getStackedBarChart().notifyDataSetChanged();
        getStackedBarChart().invalidate();
    }

    /* renamed from: e */
    public final void mo54955e() {
        m71747g();
        int i = this.f58850h;
        if (i >= 0) {
            m71748i(i);
        }
        if (this.f58860r) {
            mo54956h();
        }
    }

    /* renamed from: h */
    public final void mo54956h() {
        if (getStackedBarChart().getBarData() != null && getStackedBarChart().getBarData().getDataSetCount() > 0) {
            getStackedBarChart().moveViewToX((float) this.f58859q);
            m71748i(this.f58859q);
        }
    }

    public final void setLoading(boolean z) {
        if (z) {
            getLayoutProgress().setVisibility(0);
        } else {
            getLayoutProgress().setVisibility(8);
        }
    }

    public final void setViewModel(CashFlowViewModel cashFlowViewModel) {
        C41536l.m120489i(cashFlowViewModel, "cashFlowViewModel");
        this.f58849g = cashFlowViewModel;
        getFooterView().setViewModel(cashFlowViewModel);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BarChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BarChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58846d = C41219i.m119470b(new C22142f(this));
        this.f58847e = C41219i.m119470b(new C22138b(this));
        this.f58848f = C41219i.m119470b(new C22141e(this));
        this.f58850h = -1;
        this.f58858p = "";
        this.f58860r = true;
        View.inflate(context, C10324m.component_barchart, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29048H, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "getContext().obtainStyle…eable.BarChartView, 0, 0)");
        String string = obtainStyledAttributes.getString(C10330s.f29078K);
        if (string != null) {
            this.f58858p = string;
        }
        this.f58851i = obtainStyledAttributes.getColor(C10330s.f29058I, 0);
        this.f58852j = obtainStyledAttributes.getColor(C10330s.f29098M, 0);
        this.f58853k = obtainStyledAttributes.getColor(C10330s.f29068J, 0);
        this.f58854l = obtainStyledAttributes.getColor(C10330s.f29108N, 0);
        this.f58855m = C10318g.color_black_solid_200;
        this.f58856n = obtainStyledAttributes.getColor(C10330s.f29088L, 0);
        this.f58857o = C32335t0.m95357b();
        obtainStyledAttributes.recycle();
        getStackedBarChart().setNoDataText("");
    }
}
