package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30862z9;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.tabs.TabLayout;
import com.salesforce.marketingcloud.C11398b;
import g91.C32309i;
import g91.C32314k;
import g91.C32335t0;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import p341ge.bog.mobilebank.model.CcyHistoryWrapper;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.views.widgets.RateChartMarkerView;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10321j;
import p90.C27444v1;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.RateChartLandscapeActivity */
public class RateChartLandscapeActivity extends C35414h0 {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C27444v1 f85411G;

    /* renamed from: H */
    protected Client f85412H;

    /* renamed from: I */
    private float f85413I;

    /* renamed from: J */
    private ArrayList f85414J = new ArrayList();

    /* renamed from: K */
    private ArrayList f85415K = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: L */
    public ArrayList f85416L = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public int f85417M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public int f85418N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f85419O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f85420P;

    /* renamed from: Q */
    private CcyHistoryWrapper.SimpleRate[] f85421Q;

    /* renamed from: R */
    boolean f85422R;

    /* renamed from: S */
    Handler f85423S = new Handler();

    /* renamed from: T */
    Runnable f85424T = new C35308a();

    /* renamed from: U */
    OrientationEventListener f85425U;

    /* renamed from: ge.bog.mobilebank.ui.activities.RateChartLandscapeActivity$a */
    class C35308a implements Runnable {
        C35308a() {
        }

        public void run() {
            RateChartLandscapeActivity rateChartLandscapeActivity = RateChartLandscapeActivity.this;
            if (rateChartLandscapeActivity.f85422R) {
                rateChartLandscapeActivity.finish();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.RateChartLandscapeActivity$b */
    class C35309b extends OrientationEventListener {
        C35309b(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            if (i != -1) {
                RateChartLandscapeActivity rateChartLandscapeActivity = RateChartLandscapeActivity.this;
                if (rateChartLandscapeActivity.f85422R != rateChartLandscapeActivity.m104728S2(i)) {
                    RateChartLandscapeActivity rateChartLandscapeActivity2 = RateChartLandscapeActivity.this;
                    rateChartLandscapeActivity2.f85422R = rateChartLandscapeActivity2.m104728S2(i);
                    RateChartLandscapeActivity rateChartLandscapeActivity3 = RateChartLandscapeActivity.this;
                    rateChartLandscapeActivity3.f85423S.removeCallbacks(rateChartLandscapeActivity3.f85424T);
                    RateChartLandscapeActivity rateChartLandscapeActivity4 = RateChartLandscapeActivity.this;
                    rateChartLandscapeActivity4.f85423S.postDelayed(rateChartLandscapeActivity4.f85424T, 500);
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.RateChartLandscapeActivity$c */
    class C35310c implements TabLayout.C5149d {
        C35310c() {
        }

        /* renamed from: a */
        public void mo16942a(TabLayout.C5153g gVar) {
            int g = gVar.mo16958g();
            if (g == 0) {
                RateChartLandscapeActivity rateChartLandscapeActivity = RateChartLandscapeActivity.this;
                rateChartLandscapeActivity.m104720K2(rateChartLandscapeActivity.f85418N);
            } else if (g == 1) {
                RateChartLandscapeActivity rateChartLandscapeActivity2 = RateChartLandscapeActivity.this;
                rateChartLandscapeActivity2.m104720K2(rateChartLandscapeActivity2.f85419O);
            } else {
                RateChartLandscapeActivity rateChartLandscapeActivity3 = RateChartLandscapeActivity.this;
                rateChartLandscapeActivity3.m104720K2(rateChartLandscapeActivity3.f85417M);
            }
            RateChartLandscapeActivity.this.mo86358U2();
        }

        /* renamed from: b */
        public void mo16943b(TabLayout.C5153g gVar) {
        }

        /* renamed from: c */
        public void mo16944c(TabLayout.C5153g gVar) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.RateChartLandscapeActivity$d */
    class C35311d implements OnChartValueSelectedListener {
        C35311d() {
        }

        public void onNothingSelected() {
        }

        public void onValueSelected(Entry entry, Highlight highlight) {
            if (RateChartLandscapeActivity.this.f85411G.f70056j.getHighlighted() == null || RateChartLandscapeActivity.this.f85411G.f70056j.getHighlighted()[0] != highlight) {
                RateChartLandscapeActivity.this.f85411G.f70056j.highlightValue(highlight);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.RateChartLandscapeActivity$e */
    class C35312e extends ValueFormatter {

        /* renamed from: a */
        final /* synthetic */ XAxis f85430a;

        C35312e(XAxis xAxis) {
            this.f85430a = xAxis;
        }

        public String getAxisLabel(float f, AxisBase axisBase) {
            int i;
            try {
                Field declaredField = AxisBase.class.getDeclaredField("mLabelCount");
                declaredField.setAccessible(true);
                declaredField.set(this.f85430a, Integer.valueOf(RateChartLandscapeActivity.this.f85416L.size()));
            } catch (Exception unused) {
            }
            if (RateChartLandscapeActivity.this.f85420P == RateChartLandscapeActivity.this.f85419O) {
                i = 6;
            } else if (RateChartLandscapeActivity.this.f85420P == RateChartLandscapeActivity.this.f85418N) {
                i = 3;
            } else {
                i = 12;
            }
            int G2 = RateChartLandscapeActivity.this.f85420P / i;
            if (f < ((float) (RateChartLandscapeActivity.this.f85420P - 1)) && ((f - ((float) (G2 / 2))) + 1.0f) % ((float) G2) == Utils.FLOAT_EPSILON) {
                return C32309i.m95242c((String) RateChartLandscapeActivity.this.f85416L.get((int) f), "MMM");
            }
            return "";
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.RateChartLandscapeActivity$f */
    class C35313f extends ValueFormatter {
        C35313f() {
        }

        public String getFormattedValue(float f) {
            DecimalFormat decimalFormat = new DecimalFormat("###,###,##0.0000");
            if (f != Utils.FLOAT_EPSILON) {
                return decimalFormat.format((double) f);
            }
            return "";
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.RateChartLandscapeActivity$g */
    class C35314g implements OnChartValueSelectedListener {
        C35314g() {
        }

        public void onNothingSelected() {
        }

        public void onValueSelected(Entry entry, Highlight highlight) {
            try {
                if (RateChartLandscapeActivity.this.f85411G.f70052f.getHighlighted() == null || RateChartLandscapeActivity.this.f85411G.f70052f.getHighlighted()[0] != highlight) {
                    RateChartLandscapeActivity.this.f85411G.f70052f.highlightValue(highlight);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public void m104720K2(int i) {
        String str;
        this.f85420P = i;
        this.f85416L = new ArrayList();
        this.f85414J = new ArrayList();
        this.f85415K = new ArrayList();
        CcyHistoryWrapper.SimpleRate[] simpleRateArr = this.f85421Q;
        if (simpleRateArr != null) {
            int i2 = this.f85417M - i;
            this.f85413I = C32309i.m95240a(i, simpleRateArr);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 + i2;
                String date = this.f85421Q[i4].getDate();
                float f = Utils.FLOAT_EPSILON;
                if (date != null) {
                    str = this.f85421Q[i4].getDate();
                    if (this.f85421Q[i4].getRate() != null) {
                        f = this.f85421Q[i4].getRate().floatValue();
                    }
                } else {
                    str = "";
                }
                this.f85416L.add(str);
                float f2 = (float) i3;
                this.f85414J.add(new Entry(f2, f));
                this.f85415K.add(new BarEntry(f2, f));
            }
        }
    }

    /* renamed from: L2 */
    private BarDataSet m104721L2() {
        BarDataSet barDataSet = new BarDataSet(this.f85415K, "");
        barDataSet.setColor(C0767a.m2893c(this, C10318g.f28632T0));
        barDataSet.setDrawValues(false);
        barDataSet.setHighLightColor(C32335t0.m95360e(this, C10316e.chart_grid_color, false));
        return barDataSet;
    }

    /* renamed from: M2 */
    private LineDataSet m104722M2() {
        LineDataSet lineDataSet = new LineDataSet(this.f85414J, "");
        int i = C10316e.chart_grid_color;
        lineDataSet.setColor(C32335t0.m95360e(this, i, false));
        lineDataSet.setFillColor(C32335t0.m95360e(this, i, false));
        lineDataSet.setCircleColor(C32335t0.m95360e(this, i, false));
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        return lineDataSet;
    }

    /* renamed from: N2 */
    private void m104723N2() {
        requestWindowFeature(1);
        getWindow().setFlags(C11398b.f33141t, C11398b.f33141t);
    }

    /* renamed from: O2 */
    private void m104724O2() {
        BarDataSet L2 = m104721L2();
        this.f85411G.f70052f.clear();
        this.f85411G.f70052f.setData(new BarData(L2));
        this.f85411G.f70052f.setBackgroundColor(C0767a.m2893c(this, C10318g.f28624I0));
        this.f85411G.f70052f.setDrawGridBackground(false);
        this.f85411G.f70052f.getXAxis().setEnabled(false);
        this.f85411G.f70052f.getAxisRight().setEnabled(false);
        this.f85411G.f70052f.getAxisLeft().setEnabled(false);
        this.f85411G.f70052f.getLegend().setEnabled(false);
        Description description = new Description();
        description.setText("");
        this.f85411G.f70052f.setDescription(description);
        this.f85411G.f70052f.setNoDataText("");
        this.f85411G.f70052f.getAxisLeft().setAxisMinimum(this.f85413I);
        this.f85411G.f70052f.setScaleYEnabled(false);
        this.f85411G.f70052f.setVisibleXRangeMinimum((float) (this.f85416L.size() + 7));
        this.f85411G.f70052f.setOnChartValueSelectedListener(new C35311d());
        this.f85411G.f70052f.setViewPortOffsets(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        this.f85411G.f70052f.animateY(1000, Easing.EaseInOutExpo);
        this.f85411G.f70052f.invalidate();
    }

    /* renamed from: P2 */
    private void m104725P2() {
        this.f85411G.f70056j.setData(new LineData(m104722M2()));
        this.f85411G.f70056j.setBackgroundColor(C0767a.m2893c(this, C10318g.f28624I0));
        this.f85411G.f70056j.setMarker(new RateChartMarkerView(this, this.f85416L, this.f85413I));
        this.f85411G.f70056j.getAxisRight().setAxisMinimum(this.f85413I);
        this.f85411G.f70056j.setDrawGridBackground(false);
        this.f85411G.f70056j.setScaleYEnabled(false);
        this.f85411G.f70056j.getLegend().setEnabled(false);
        this.f85411G.f70056j.fitScreen();
        Description description = new Description();
        description.setText("");
        this.f85411G.f70056j.setDescription(description);
        this.f85411G.f70056j.setNoDataText("");
        LineChart lineChart = this.f85411G.f70056j;
        lineChart.setViewPortOffsets(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, lineChart.getViewPortHandler().offsetBottom() + 40.0f);
        this.f85411G.f70056j.setVisibleXRangeMinimum((float) (this.f85416L.size() + 6));
        XAxis xAxis = this.f85411G.f70056j.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        int i = C10318g.banner_text_color_grey;
        xAxis.setTextColor(C0767a.m2893c(this, i));
        xAxis.setTypeface(C0808h.m3033h(this, C10321j.f28707e));
        xAxis.setValueFormatter(new C35312e(xAxis));
        YAxis axisLeft = this.f85411G.f70056j.getAxisLeft();
        axisLeft.setGridColor(C32335t0.m95360e(this, C10316e.chart_grid_color, false));
        axisLeft.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
        axisLeft.setTextColor(C0767a.m2893c(this, i));
        axisLeft.setTypeface(C0808h.m3033h(this, C10321j.f28708f));
        axisLeft.setValueFormatter(new C35313f());
        this.f85411G.f70056j.getAxisRight().setEnabled(false);
        this.f85411G.f70056j.setOnChartValueSelectedListener(new C35314g());
        ArrayList arrayList = this.f85416L;
        if (arrayList != null && arrayList.size() > 0) {
            this.f85411G.f70056j.highlightValue((float) (this.f85416L.size() - 1), 0);
        }
        this.f85411G.f70056j.animateY(1000, Easing.EaseInOutExpo);
        this.f85411G.f70056j.invalidate();
    }

    /* renamed from: Q2 */
    private void m104726Q2() {
        this.f85425U = new C35309b(this, 3);
    }

    /* renamed from: R2 */
    private void m104727R2() {
        this.f85411G.f70059m.addOnTabSelectedListener((TabLayout.C5149d) new C35310c());
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public boolean m104728S2(int i) {
        return (i >= 300 && i <= 360) || (i >= 0 && i <= 90);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void m104729T2() {
        m104730V2(this.f85411G.f70059m, true);
    }

    /* renamed from: V2 */
    private void m104730V2(TabLayout tabLayout, boolean z) {
        LinearLayout linearLayout = (LinearLayout) tabLayout.getChildAt(0);
        linearLayout.setEnabled(z);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            linearLayout.getChildAt(i).setEnabled(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        m104723N2();
        C27444v1 d = C27444v1.m85083d(getLayoutInflater());
        this.f85411G = d;
        setContentView((View) d.mo3946b());
        String stringExtra = getIntent().getStringExtra("CCY_HISTORY_WRAPPER_KEY");
        this.f85411G.f70057k.setText(C27950a.m86286c(getIntent().getStringExtra("CCY_DESCRIPTION"), false));
        this.f85411G.f70053g.setText(C32314k.m95245a(stringExtra));
        CcyHistoryWrapper ccyHistoryWrapper = this.f85412H.getCcyHistoryWrapper();
        if (!(ccyHistoryWrapper == null || ccyHistoryWrapper.getRates() == null || ccyHistoryWrapper.getRates().get(stringExtra) == null)) {
            CcyHistoryWrapper.SimpleRate[] simpleRateArr = ccyHistoryWrapper.getRates().get(stringExtra);
            this.f85421Q = simpleRateArr;
            this.f85417M = simpleRateArr.length;
            this.f85418N = C32309i.m95241b(C32309i.C32310a.LAST_THREE_MONTHS, simpleRateArr);
            this.f85419O = C32309i.m95241b(C32309i.C32310a.LAST_SIX_MONTHS, this.f85421Q);
        }
        CcyHistoryWrapper.SimpleRate[] simpleRateArr2 = this.f85421Q;
        if (simpleRateArr2 == null || simpleRateArr2.length == 0) {
            this.f85411G.f70054h.setVisibility(0);
        }
        m104720K2(this.f85418N);
        m104725P2();
        m104724O2();
        m104727R2();
        m104726Q2();
    }

    /* renamed from: U2 */
    public void mo86358U2() {
        m104730V2(this.f85411G.f70059m, false);
        LineData lineData = new LineData(m104722M2());
        this.f85411G.f70056j.clear();
        this.f85411G.f70056j.setMarker(new RateChartMarkerView(this, this.f85416L, this.f85413I));
        this.f85411G.f70056j.getAxisLeft().resetAxisMinimum();
        this.f85411G.f70056j.getAxisRight().setAxisMinimum(this.f85413I);
        this.f85411G.f70056j.setData(lineData);
        LineChart lineChart = this.f85411G.f70056j;
        Easing.EasingFunction easingFunction = Easing.EaseInOutExpo;
        lineChart.animateY(1000, easingFunction);
        ArrayList arrayList = this.f85416L;
        if (arrayList != null && arrayList.size() > 0) {
            this.f85411G.f70056j.highlightValue((float) (this.f85416L.size() - 1), 0);
        }
        BarDataSet L2 = m104721L2();
        this.f85411G.f70052f.clear();
        BarData barData = new BarData(L2);
        barData.setBarWidth(0.7f);
        this.f85411G.f70052f.getAxisLeft().resetAxisMinimum();
        this.f85411G.f70052f.getAxisLeft().setAxisMinimum(this.f85413I);
        this.f85411G.f70052f.setData(barData);
        this.f85411G.f70052f.animateY(1000, easingFunction);
        new Handler(getMainLooper()).postDelayed(new C30862z9(this), 1000);
    }

    public void onPause() {
        this.f85425U.disable();
        super.onPause();
    }

    public void onResume() {
        this.f85425U.enable();
        super.onResume();
    }
}
