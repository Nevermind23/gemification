package g40;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import g91.C32290b1;
import g91.C32319m;
import g91.C32335t0;
import g91.C32343x;
import g91.C32359z0;
import he1.C41238w;
import i40.C25115a;
import i40.C25116b;
import i40.C25118d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o40.C26721a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.BudgetProgressBar;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import q40.C27680a;
import r90.C27950a;
import ue1.C43075l;
import ue1.C43079p;
import x00.C29615f;

/* renamed from: g40.h */
public final class C20682h extends C29615f {

    /* renamed from: o */
    public static final C20691c f55793o = new C20691c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20693e f55794f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C43079p f55795g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayList f55796h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public BarData f55797i = new BarData();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final HashSet f55798j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final ArrayList f55799k = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f55800l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public RecyclerView f55801m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ExpandableItemView f55802n;

    /* renamed from: g40.h$a */
    public final class C20683a extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C25115a f55803d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ExpandableItemView f55804e;

        /* renamed from: f */
        final /* synthetic */ C20682h f55805f;

        /* renamed from: g40.h$a$a */
        static final class C20684a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C20683a f55806d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20684a(C20683a aVar) {
                super(1);
                this.f55806d = aVar;
            }

            /* renamed from: a */
            public final void mo49202a(View view) {
                C41536l.m120489i(view, "view");
                C20683a aVar = this.f55806d;
                C25115a m = aVar.f55803d;
                if (m == null) {
                    C41536l.m120506z("budget");
                    m = null;
                }
                aVar.m67006p(view, m);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49202a((View) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: g40.h$a$b */
        static final class C20685b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C20683a f55807d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20685b(C20683a aVar) {
                super(2);
                this.f55807d = aVar;
            }

            /* renamed from: a */
            public final void mo49203a(View view, int i) {
                C41536l.m120489i(view, "view");
                C20683a aVar = this.f55807d;
                C25115a m = aVar.f55803d;
                if (m == null) {
                    C41536l.m120506z("budget");
                    m = null;
                }
                aVar.m67006p(view, (C25115a) m.mo63630d().get(i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo49203a((View) obj, ((Number) obj2).intValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: g40.h$a$c */
        static final class C20686c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ View f55808d;

            /* renamed from: e */
            final /* synthetic */ C20682h f55809e;

            /* renamed from: f */
            final /* synthetic */ C20683a f55810f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20686c(View view, C20682h hVar, C20683a aVar) {
                super(1);
                this.f55808d = view;
                this.f55809e = hVar;
                this.f55810f = aVar;
            }

            /* renamed from: a */
            public final void mo49204a(boolean z) {
                Drawable background;
                Drawable background2;
                BogImageView bogImageView = (BogImageView) this.f55808d.findViewById(C10322k.arrowIV);
                C25115a aVar = null;
                if (z) {
                    ExpandableItemView G = this.f55809e.f55802n;
                    if (G != null) {
                        G.mo53625f(true);
                    }
                    this.f55809e.f55802n = this.f55810f.f55804e;
                    if (!(bogImageView == null || (background2 = bogImageView.getBackground()) == null)) {
                        background2.setColorFilter(C32335t0.m95357b(), PorterDuff.Mode.SRC_IN);
                    }
                    if (bogImageView != null) {
                        bogImageView.setColorFilter(C0767a.m2893c(this.f55808d.getContext(), C10318g.f28616A));
                    }
                    C25115a m = this.f55810f.f55803d;
                    if (m == null) {
                        C41536l.m120506z("budget");
                    } else {
                        aVar = m;
                    }
                    if (!aVar.mo63630d().isEmpty()) {
                        this.f55810f.f55804e.setPadding(0, 0, 0, C32343x.m95394I(11));
                        return;
                    }
                    return;
                }
                this.f55809e.f55802n = null;
                if (!(bogImageView == null || (background = bogImageView.getBackground()) == null)) {
                    background.setColorFilter(C0767a.m2893c(this.f55808d.getContext(), C10318g.pfm_light_gray), PorterDuff.Mode.SRC_IN);
                }
                if (bogImageView != null) {
                    bogImageView.setColorFilter(C0767a.m2893c(this.f55808d.getContext(), C10318g.gray));
                }
                this.f55810f.f55804e.setPadding(0, 0, 0, 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49204a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: g40.h$a$d */
        static final class C20687d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C20682h f55811d;

            /* renamed from: e */
            final /* synthetic */ C25115a f55812e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20687d(C20682h hVar, C25115a aVar) {
                super(1);
                this.f55811d = hVar;
                this.f55812e = aVar;
            }

            /* renamed from: a */
            public final void mo49205a(View view) {
                String str;
                C41536l.m120489i(view, "it");
                C25116b bVar = (C25116b) C41358y.m120010Z(this.f55811d.f55796h, this.f55811d.f55800l);
                C43079p I = this.f55811d.f55795g;
                if (I != null) {
                    C25115a aVar = this.f55812e;
                    if (bVar != null) {
                        str = bVar.mo63644b();
                    } else {
                        str = null;
                    }
                    I.invoke(aVar, C32319m.m95285E(str));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49205a((View) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20683a(C20682h hVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55805f = hVar;
            View findViewById = view.findViewById(C10322k.expandableItem);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.expandableItem)");
            ExpandableItemView expandableItemView = (ExpandableItemView) findViewById;
            this.f55804e = expandableItemView;
            RecyclerView L = hVar.f55801m;
            if (L == null) {
                C41536l.m120506z("recyclerView");
                L = null;
            }
            expandableItemView.setScrollableParent(L);
            this.f55804e.setScrollOffset(-20);
            this.f55804e.setOnBindHeader(new C20684a(this));
            this.f55804e.setOnBindItem(new C20685b(this));
            this.f55804e.setOnStateChanged(new C20686c(view, hVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final void m67006p(View view, C25115a aVar) {
            C20680f fVar;
            View view2 = view;
            C20682h hVar = this.f55805f;
            View findViewById = view2.findViewById(C10322k.f28851jf);
            C41536l.m120488h(findViewById, "contentView.findViewById(R.id.headerContainer)");
            View findViewById2 = view2.findViewById(C10322k.f28913yq);
            C41536l.m120488h(findViewById2, "contentView.findViewById(R.id.progressBar)");
            BudgetProgressBar budgetProgressBar = (BudgetProgressBar) findViewById2;
            View findViewById3 = view2.findViewById(C10322k.iconIV);
            C41536l.m120488h(findViewById3, "contentView.findViewById(R.id.iconIV)");
            ImageView imageView = (ImageView) findViewById3;
            View findViewById4 = view2.findViewById(C10322k.categoryNameTV);
            C41536l.m120488h(findViewById4, "contentView.findViewById(R.id.categoryNameTV)");
            View findViewById5 = view2.findViewById(C10322k.spentTV);
            C41536l.m120488h(findViewById5, "contentView.findViewById(R.id.spentTV)");
            View findViewById6 = view2.findViewById(C10322k.plannedTV);
            C41536l.m120488h(findViewById6, "contentView.findViewById(R.id.plannedTV)");
            BogImageView bogImageView = (BogImageView) view2.findViewById(C10322k.arrowIV);
            String S = C32359z0.m95548S(aVar.mo63639k());
            String S2 = C32359z0.m95548S(aVar.mo63638j());
            int parseColor = Color.parseColor(aVar.mo63631e());
            imageView.setColorFilter(parseColor, PorterDuff.Mode.SRC_IN);
            imageView.setImageResource(C27680a.f70771a.mo67216a(aVar.mo63629c()));
            ((BogTextView) findViewById4).setText(C27950a.m86287d(aVar.mo63634g(), false, 2, (Object) null));
            C41524c0 c0Var = C41524c0.f97701a;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{S2, "₾"}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            ((BogTextView) findViewById5).setText(format);
            String format2 = String.format("%s %s", Arrays.copyOf(new Object[]{S, "₾"}, 2));
            C41536l.m120488h(format2, "format(format, *args)");
            ((BogTextView) findViewById6).setText(format2);
            budgetProgressBar.setPositiveProgressColor(parseColor);
            budgetProgressBar.mo53614g(aVar.mo63639k().floatValue(), aVar.mo63638j().floatValue(), true);
            if (!aVar.mo63630d().isEmpty()) {
                if (bogImageView != null) {
                    bogImageView.setVisibility(0);
                }
                if (bogImageView != null) {
                    bogImageView.setImageDrawable(C32290b1.m95122l(this.itemView.getContext(), bogImageView.getDrawable(), C10318g.budgeting_dark_gray));
                }
            } else if (bogImageView != null) {
                bogImageView.setVisibility(8);
            }
            C20687d dVar = new C20687d(hVar, aVar);
            if (!aVar.mo63630d().isEmpty()) {
                if (aVar.mo63638j().compareTo(BigDecimal.ZERO) <= 0) {
                    dVar = null;
                }
                if (dVar != null) {
                    fVar = new C20680f(dVar);
                } else {
                    fVar = null;
                }
                findViewById.setOnClickListener(fVar);
                view2.setOnClickListener(new C20681g(this));
            } else if (aVar.mo63638j().compareTo(BigDecimal.ZERO) > 0) {
                view2.setOnClickListener(new C20678d(dVar));
                findViewById.setOnClickListener(new C20679e(dVar));
            } else {
                view2.setOnClickListener((View.OnClickListener) null);
                findViewById.setOnClickListener((View.OnClickListener) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static final void m67007q(C43075l lVar, View view) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(view);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m67008r(C43075l lVar, View view) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(view);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public static final void m67009s(C43075l lVar, View view) {
            lVar.invoke(view);
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public static final void m67010t(C20683a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f55804e.mo53648w();
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49201o(i40.C25115a r5) {
            /*
                r4 = this;
                java.lang.String r0 = "budget"
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                r4.f55803d = r5
                java.util.List r5 = r5.mo63630d()
                int r5 = r5.size()
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r4.f55804e
                r1 = 2
                r2 = 0
                r3 = 0
                p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView.m69446y(r0, r5, r3, r1, r2)
                g40.h r0 = r4.f55805f
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r0.f55802n
                if (r0 == 0) goto L_0x0036
                g40.h r0 = r4.f55805f
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r0.f55802n
                kotlin.jvm.internal.C41536l.m120486f(r0)
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r1 = r4.f55804e
                boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
                if (r0 == 0) goto L_0x0036
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r4.f55804e
                r0.mo53635i(r3)
                goto L_0x003b
            L_0x0036:
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r4.f55804e
                r0.mo53625f(r3)
            L_0x003b:
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r4.f55804e
                if (r5 <= 0) goto L_0x0040
                r3 = 1
            L_0x0040:
                r0.setScrollToTopWhenExpanded(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g40.C20682h.C20683a.mo49201o(i40.a):void");
        }
    }

    /* renamed from: g40.h$b */
    public final class C20688b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private BarChart f55813d;

        /* renamed from: e */
        private TextView f55814e;

        /* renamed from: f */
        final /* synthetic */ C20682h f55815f;

        /* renamed from: g40.h$b$a */
        public static final class C20689a extends ValueFormatter {

            /* renamed from: a */
            final /* synthetic */ C20682h f55816a;

            C20689a(C20682h hVar) {
                this.f55816a = hVar;
            }

            public String getFormattedValue(float f) {
                Object obj = this.f55816a.f55799k.get((int) f);
                C41536l.m120488h(obj, "chartLabels[value.toInt()]");
                return (String) obj;
            }
        }

        /* renamed from: g40.h$b$b */
        public static final class C20690b implements OnChartValueSelectedListener {

            /* renamed from: a */
            final /* synthetic */ C20682h f55817a;

            /* renamed from: b */
            final /* synthetic */ C20688b f55818b;

            C20690b(C20682h hVar, C20688b bVar) {
                this.f55817a = hVar;
                this.f55818b = bVar;
            }

            public void onNothingSelected() {
            }

            public void onValueSelected(Entry entry, Highlight highlight) {
                Object obj;
                if (entry != null) {
                    obj = entry.getData();
                } else {
                    obj = null;
                }
                C41536l.m120487g(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                if (this.f55817a.f55800l != intValue) {
                    this.f55818b.m67019l(intValue);
                    this.f55817a.f55794f.mo49208a(intValue);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20688b(C20682h hVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55815f = hVar;
            View findViewById = view.findViewById(C10322k.bc_history_chart);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.bc_history_chart)");
            this.f55813d = (BarChart) findViewById;
            View findViewById2 = view.findViewById(C10322k.yearTV);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.yearTV)");
            this.f55814e = (TextView) findViewById2;
            m67018k();
        }

        /* renamed from: j */
        private final void m67017j(int i) {
            BarEntry barEntry = (BarEntry) ((IBarDataSet) this.f55813d.getBarData().getDataSets().get(0)).getEntryForIndex(i);
            Highlight highlight = new Highlight(barEntry.getX(), barEntry.getY(), 0);
            highlight.setDataIndex(0);
            this.f55813d.highlightValue(highlight, true);
        }

        /* renamed from: k */
        private final void m67018k() {
            BarChart barChart = this.f55813d;
            C20682h hVar = this.f55815f;
            barChart.setVisibleXRangeMaximum(6.0f);
            Resources resources = barChart.getResources();
            int i = C10318g.f28625J0;
            barChart.setGridBackgroundColor(C0808h.m3029d(resources, i, (Resources.Theme) null));
            Legend legend = barChart.getLegend();
            if (legend != null) {
                legend.setEnabled(false);
            }
            YAxis axisRight = barChart.getAxisRight();
            if (axisRight != null) {
                axisRight.setEnabled(false);
            }
            YAxis axisLeft = barChart.getAxisLeft();
            if (axisLeft != null) {
                C41536l.m120488h(axisLeft, "axisLeft");
                axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
                axisLeft.setAxisMinimum(Utils.FLOAT_EPSILON);
                axisLeft.setDrawGridLines(true);
                axisLeft.setDrawAxisLine(false);
                axisLeft.setGridColor(C0767a.m2893c(barChart.getContext(), C10318g.f28629P0));
                axisLeft.setTextColor(C0767a.m2893c(barChart.getContext(), C10318g.f28627N0));
            }
            XAxis xAxis = barChart.getXAxis();
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setYOffset((float) C32343x.m95392H(4.0f));
            xAxis.setDrawAxisLine(true);
            xAxis.setDrawGridLines(false);
            xAxis.setValueFormatter(new C20689a(hVar));
            xAxis.setTextColor(C0767a.m2893c(barChart.getContext(), C10318g.f28627N0));
            barChart.setExtraOffsets(Utils.FLOAT_EPSILON, -((float) C32343x.m95392H(50.0f)), Utils.FLOAT_EPSILON, (float) C32343x.m95392H(6.0f));
            barChart.setBackgroundColor(C0808h.m3029d(barChart.getResources(), i, (Resources.Theme) null));
            barChart.setDrawGridBackground(true);
            barChart.setDrawBarShadow(false);
            barChart.setScaleEnabled(false);
            barChart.getDescription().setEnabled(false);
            barChart.setHighlightFullBarEnabled(false);
            barChart.setOnChartValueSelectedListener(new C20690b(hVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final void m67019l(int i) {
            TextView textView = this.f55814e;
            String substring = ((C25116b) this.f55815f.f55796h.get(i)).mo63644b().substring(0, 4);
            C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            textView.setText(substring);
        }

        /* renamed from: i */
        public final void mo49206i() {
            BarChart barChart = this.f55813d;
            ChartAnimator animator = barChart.getAnimator();
            C41536l.m120488h(animator, "chart.animator");
            ViewPortHandler viewPortHandler = this.f55813d.getViewPortHandler();
            C41536l.m120488h(viewPortHandler, "chart.viewPortHandler");
            barChart.setRenderer(new C26721a(barChart, animator, viewPortHandler, true, this.f55815f.f55798j));
            this.f55813d.setData(this.f55815f.f55797i);
            this.f55813d.getXAxis().setAxisMaximum(((BarData) this.f55813d.getData()).getXMax() + 0.5f);
            this.f55813d.getXAxis().setAxisMinimum(-0.5f);
            this.f55813d.animateY(500, Easing.EaseInOutExpo);
            this.f55813d.invalidate();
            m67017j(this.f55815f.f55800l);
            m67019l(this.f55815f.f55800l);
        }
    }

    /* renamed from: g40.h$c */
    public static final class C20691c {
        private C20691c() {
        }

        public /* synthetic */ C20691c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g40.h$d */
    public final class C20692d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private BudgetProgressBar f55819d;

        /* renamed from: e */
        private TextView f55820e;

        /* renamed from: f */
        private TextView f55821f;

        /* renamed from: g */
        private TextView f55822g;

        /* renamed from: h */
        private TextView f55823h;

        /* renamed from: i */
        final /* synthetic */ C20682h f55824i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20692d(C20682h hVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55824i = hVar;
            View findViewById = view.findViewById(C10322k.budgetProgressBar);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.budgetProgressBar)");
            this.f55819d = (BudgetProgressBar) findViewById;
            View findViewById2 = view.findViewById(C10322k.totalOverspentTV);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.totalOverspentTV)");
            this.f55820e = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.totalSpentTV);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.totalSpentTV)");
            this.f55821f = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C10322k.dateTV);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.dateTV)");
            this.f55822g = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C10322k.mainLabelTV);
            C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.mainLabelTV)");
            this.f55823h = (TextView) findViewById5;
        }

        /* renamed from: h */
        public final void mo49207h() {
            Object obj = this.f55824i.f55796h.get(this.f55824i.f55800l);
            C41536l.m120488h(obj, "monthsBudgetingData[selectedIndex]");
            C25116b bVar = (C25116b) obj;
            C20682h hVar = this.f55824i;
            if (hVar.f55800l == hVar.f55796h.size() - 1) {
                this.f55823h.setText(this.itemView.getContext().getString(C10328q.current_budget));
            } else {
                this.f55823h.setText(this.itemView.getContext().getString(C10328q.budget_history));
            }
            String T = C32359z0.m95549T(bVar.mo63645c());
            String T2 = C32359z0.m95549T(bVar.mo63646d());
            this.f55819d.mo53614g(bVar.mo63645c().floatValue(), bVar.mo63646d().floatValue(), true);
            this.f55822g.setText(C32319m.m95302i(C32319m.m95289I(bVar.mo63644b()).getTime(), this.itemView.getContext()));
            TextView textView = this.f55821f;
            C41524c0 c0Var = C41524c0.f97701a;
            String format = String.format("%s%s", Arrays.copyOf(new Object[]{T2, "₾"}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            textView.setText(format);
            TextView textView2 = this.f55820e;
            String format2 = String.format("%s %s", Arrays.copyOf(new Object[]{T, "₾"}, 2));
            C41536l.m120488h(format2, "format(format, *args)");
            textView2.setText(format2);
        }
    }

    /* renamed from: g40.h$e */
    public interface C20693e {
        /* renamed from: a */
        void mo49208a(int i);
    }

    public C20682h(C20693e eVar, C43079p pVar) {
        C41536l.m120489i(eVar, "onChartBarActionListener");
        this.f55794f = eVar;
        this.f55795g = pVar;
    }

    /* renamed from: O */
    public final void mo49199O(C25118d dVar) {
        C41536l.m120489i(dVar, "data");
        this.f55796h.clear();
        this.f55796h.addAll(dVar.mo63659a());
        this.f55800l = dVar.mo63659a().size() - 1;
        this.f55797i = dVar.mo63660b();
        this.f55798j.clear();
        this.f55798j.addAll(dVar.mo63662d());
        this.f55799k.clear();
        this.f55799k.addAll(dVar.mo63661c());
        C29615f.m89897A(this, 0, 1, false, 4, (Object) null);
        C29615f.m89897A(this, 1, 1, false, 4, (Object) null);
        C29615f.m89897A(this, 2, ((C25116b) dVar.mo63659a().get(this.f55800l)).mo63643a().size(), false, 4, (Object) null);
    }

    /* renamed from: P */
    public final void mo49200P(int i) {
        this.f55800l = i;
        C29615f.m89897A(this, 1, 1, false, 4, (Object) null);
        C29615f.m89897A(this, 2, ((C25116b) this.f55796h.get(this.f55800l)).mo63643a().size(), false, 4, (Object) null);
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(0, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(1, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(2, 0, 2, (DefaultConstructorMarker) null));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f55801m = recyclerView;
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budgeting_history_chart_item, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context)\n   …hart_item, parent, false)");
            return new C20688b(this, inflate);
        } else if (i != 1) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budget_history_recycler_item, viewGroup, false);
            C41536l.m120488h(inflate2, "from(parent.context)\n   …cler_item, parent, false)");
            return new C20683a(this, inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budgeting_month_overview_item, viewGroup, false);
            C41536l.m120488h(inflate3, "from(parent.context)\n   …view_item, parent, false)");
            return new C20692d(this, inflate3);
        }
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C20688b) {
            ((C20688b) f0Var).mo49206i();
        } else if (f0Var instanceof C20692d) {
            ((C20692d) f0Var).mo49207h();
        } else if (f0Var instanceof C20683a) {
            ((C20683a) f0Var).mo49201o((C25115a) ((C25116b) this.f55796h.get(this.f55800l)).mo63643a().get(i2));
        }
    }
}
