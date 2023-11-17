package g81;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import androidx.core.widget.C1314o;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import g91.C32297d;
import g91.C32309i;
import g91.C32314k;
import g91.C32335t0;
import iu0.C36546y;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import p341ge.bog.mobilebank.model.CcyHistoryWrapper;
import p341ge.bog.mobilebank.model.CcyRate;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.RateChartMarkerView;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import p630ui.C18168a;
import r90.C27950a;

/* renamed from: g81.g */
public class C32165g extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f79230d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList f79231e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList f79232f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public RecyclerView f79233g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f79234h = -1;

    /* renamed from: i */
    private int f79235i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public CcyRate[] f79236j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public CcyHistoryWrapper f79237k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C32168c f79238l;

    /* renamed from: g81.g$a */
    class C32166a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C32169d f79239d;

        /* renamed from: e */
        final /* synthetic */ int f79240e;

        C32166a(C32169d dVar, int i) {
            this.f79239d = dVar;
            this.f79240e = i;
        }

        public void onClick(View view) {
            this.f79239d.m94797n();
            C32169d dVar = this.f79239d;
            dVar.m94798o(dVar, this.f79240e);
        }
    }

    /* renamed from: g81.g$b */
    class C32167b implements View.OnClickListener {
        C32167b() {
        }

        public void onClick(View view) {
            C32297d.m95157e((C35388f2) C32165g.this.f79230d, C32165g.this.f79230d.getString(C10328q.ccy_rotate_device));
        }
    }

    /* renamed from: g81.g$c */
    public interface C32168c {
        /* renamed from: h0 */
        void mo72690h0(int i);
    }

    /* renamed from: g81.g$d */
    class C32169d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        TextView f79243d;

        /* renamed from: e */
        TextView f79244e;

        /* renamed from: f */
        TextView f79245f;

        /* renamed from: g */
        TextView f79246g;

        /* renamed from: h */
        TextView f79247h;

        /* renamed from: i */
        TextView f79248i;

        /* renamed from: j */
        ImageView f79249j;

        /* renamed from: k */
        ImageView f79250k;

        /* renamed from: l */
        AppCompatButton f79251l;

        /* renamed from: m */
        ViewGroup f79252m;

        /* renamed from: n */
        LineChart f79253n;

        /* renamed from: o */
        View f79254o;

        /* renamed from: p */
        float f79255p;

        /* renamed from: q */
        int f79256q;

        /* renamed from: r */
        View f79257r;

        /* renamed from: s */
        View f79258s;

        /* renamed from: t */
        TextView f79259t;

        /* renamed from: u */
        TextView f79260u;

        /* renamed from: g81.g$d$a */
        class C32170a extends ValueFormatter {
            C32170a() {
            }

            public String getAxisLabel(float f, AxisBase axisBase) {
                DecimalFormat decimalFormat = new DecimalFormat("###,###,##0.0000");
                if (f == C32169d.this.f79255p || axisBase.getAxisMaximum() == f) {
                    return "";
                }
                return decimalFormat.format((double) f);
            }
        }

        /* renamed from: g81.g$d$b */
        class C32171b extends ValueFormatter {
            C32171b() {
            }

            public String getAxisLabel(float f, AxisBase axisBase) {
                axisBase.setLabelCount(C32165g.this.f79232f.size());
                int size = C32165g.this.f79232f.size() - 1;
                int i = size / 4;
                float f2 = (float) size;
                if (f == f2) {
                    return C32165g.this.f79230d.getResources().getString(C10328q.date_utils_today);
                }
                if (f != Utils.FLOAT_EPSILON && ((f2 - f) + 1.0f) % ((float) i) == Utils.FLOAT_EPSILON) {
                    return C32309i.m95242c((String) C32165g.this.f79232f.get((int) f), "dd MMM");
                }
                return "";
            }
        }

        /* renamed from: g81.g$d$c */
        class C32172c implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            final /* synthetic */ int f79264d;

            /* renamed from: e */
            final /* synthetic */ int f79265e;

            /* renamed from: f */
            final /* synthetic */ C32169d f79266f;

            C32172c(int i, int i2, C32169d dVar) {
                this.f79264d = i;
                this.f79265e = i2;
                this.f79266f = dVar;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (this.f79264d == C32165g.this.f79230d.getResources().getDimensionPixelSize(C10319h.ccy_rate_item_height_expanded) && C32165g.this.f79233g != null) {
                    C32165g.this.f79233g.getLayoutManager().mo5197J1(this.f79265e);
                }
                ViewGroup.LayoutParams layoutParams = this.f79266f.f79252m.getLayoutParams();
                layoutParams.height = intValue;
                this.f79266f.f79252m.setLayoutParams(layoutParams);
            }
        }

        /* renamed from: g81.g$d$d */
        class C32173d extends AnimatorListenerAdapter {

            /* renamed from: d */
            final /* synthetic */ C32169d f79268d;

            C32173d(C32169d dVar) {
                this.f79268d = dVar;
            }

            public void onAnimationEnd(Animator animator) {
                this.f79268d.m94797n();
            }
        }

        public C32169d(View view) {
            super(view);
            new C18168a(view.getContext(), C10329r.f28972g).mo45824a(view);
            this.f79243d = (TextView) view.findViewById(C10322k.official_rate_tv);
            int i = C10322k.rate_difference_tv;
            this.f79244e = (TextView) view.findViewById(i);
            this.f79245f = (TextView) view.findViewById(C10322k.sell_rate_tv);
            this.f79246g = (TextView) view.findViewById(C10322k.buy_rate_tv);
            this.f79247h = (TextView) view.findViewById(C10322k.rate_ccy_header_tv);
            this.f79248i = (TextView) view.findViewById(i);
            this.f79249j = (ImageView) view.findViewById(C10322k.rate_difference_indicator_iv);
            AppCompatButton appCompatButton = (AppCompatButton) view.findViewById(C10322k.ccy_logo);
            this.f79251l = appCompatButton;
            m94799p(appCompatButton);
            this.f79251l.setTypeface(C0808h.m3033h(C36546y.m108285N(), C10321j.f28707e));
            this.f79252m = (ViewGroup) view.findViewById(C10322k.ccy_item_root);
            this.f79253n = (LineChart) view.findViewById(C10322k.line_chart);
            this.f79250k = (ImageView) view.findViewById(C10322k.arrow_iv);
            this.f79254o = view.findViewById(C10322k.f28803Wc);
            this.f79257r = view.findViewById(C10322k.clickable_view);
            this.f79258s = view.findViewById(C10322k.rotation_view);
            TextView textView = (TextView) view.findViewById(C10322k.bad_buy_rate);
            this.f79259t = textView;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
            TextView textView2 = (TextView) view.findViewById(C10322k.bad_sell_rate);
            this.f79260u = textView2;
            textView2.setPaintFlags(textView2.getPaintFlags() | 16);
            m94795l();
        }

        /* renamed from: j */
        private void m94793j(String str) {
            float f;
            if (str != null) {
                C32165g.this.f79231e = new ArrayList();
                C32165g.this.f79232f = new ArrayList();
                CcyHistoryWrapper.SimpleRate[] simpleRateArr = C32165g.this.f79237k.getRates().get(str);
                if (simpleRateArr != null) {
                    int length = simpleRateArr.length - this.f79256q;
                    for (int i = 0; i < this.f79256q; i++) {
                        int i2 = i + length;
                        if (simpleRateArr[i2].getRate() != null) {
                            f = simpleRateArr[i2].getRate().floatValue();
                        } else {
                            f = Utils.FLOAT_EPSILON;
                        }
                        C32165g.this.f79231e.add(new Entry((float) i, f));
                        C32165g.this.f79232f.add(simpleRateArr[i2].getDate());
                    }
                }
            }
        }

        /* renamed from: k */
        private LineDataSet m94794k(ArrayList arrayList) {
            LineDataSet lineDataSet = new LineDataSet(arrayList, "");
            Context i = C32165g.this.f79230d;
            int i2 = C10316e.chart_grid_color;
            lineDataSet.setColor(C32335t0.m95360e(i, i2, false));
            lineDataSet.setFillColor(C32335t0.m95360e(C32165g.this.f79230d, i2, false));
            lineDataSet.setCircleColor(C32335t0.m95360e(C32165g.this.f79230d, i2, false));
            lineDataSet.setDrawFilled(true);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setHighlightLineWidth(1.0f);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawValues(false);
            return lineDataSet;
        }

        /* renamed from: l */
        private void m94795l() {
            this.f79253n.setBackgroundColor(C0767a.m2893c(C32165g.this.f79230d, C10318g.f28625J0));
            YAxis axisLeft = this.f79253n.getAxisLeft();
            axisLeft.setDrawAxisLine(false);
            Context i = C32165g.this.f79230d;
            int i2 = C10316e.chart_grid_color;
            axisLeft.setGridColor(C32335t0.m95360e(i, i2, false));
            axisLeft.setGridColor(C32335t0.m95360e(C32165g.this.f79230d, i2, false));
            axisLeft.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
            Context i3 = C32165g.this.f79230d;
            int i4 = C10318g.f28628O0;
            axisLeft.setTextColor(C0767a.m2893c(i3, i4));
            Context i5 = C32165g.this.f79230d;
            int i6 = C10321j.f28708f;
            axisLeft.setTypeface(C0808h.m3033h(i5, i6));
            axisLeft.setValueFormatter(new C32170a());
            XAxis xAxis = this.f79253n.getXAxis();
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            xAxis.setTypeface(C0808h.m3033h(C32165g.this.f79230d, i6));
            xAxis.setTextColor(C0767a.m2893c(C32165g.this.f79230d, i4));
            xAxis.setDrawGridLines(false);
            xAxis.setDrawAxisLine(false);
            xAxis.setValueFormatter(new C32171b());
            this.f79253n.getAxisRight().setEnabled(false);
            this.f79253n.setDrawGridBackground(false);
            this.f79253n.setScaleEnabled(false);
            this.f79253n.getLegend().setEnabled(false);
            Description description = new Description();
            description.setText("");
            this.f79253n.setDescription(description);
            this.f79253n.setNoDataText("");
            LineChart lineChart = this.f79253n;
            lineChart.setViewPortOffsets(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, lineChart.getViewPortHandler().offsetBottom() + 50.0f);
            this.f79253n.invalidate();
        }

        /* renamed from: m */
        private void m94796m(int i, C32169d dVar, int i2) {
            if (dVar != null) {
                if (!(dVar.f79253n.getLineData() == null || dVar.f79253n.getLineData().getDataSetByIndex(0) == null)) {
                    dVar.f79253n.clear();
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{dVar.f79252m.getMeasuredHeight(), i});
                ofInt.addUpdateListener(new C32172c(i, i2, dVar));
                ofInt.addListener(new C32173d(dVar));
                ofInt.setDuration(300);
                ofInt.start();
                return;
            }
            C32165g.this.notifyItemChanged(i2);
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m94797n() {
            CcyHistoryWrapper g = C32165g.this.f79237k;
            int adapterPosition = getAdapterPosition();
            if (g == null || g.getCcy() == null || g.getCcy().length <= adapterPosition || adapterPosition == -1) {
                this.f79254o.setVisibility(0);
                return;
            }
            String ccy = C32165g.this.f79236j[getAdapterPosition()].getCcy();
            if (ccy == null || C32165g.this.f79237k == null || C32165g.this.f79237k.getRates() == null || C32165g.this.f79237k.getRates().get(ccy) == null || C32165g.this.f79237k.getRates().get(ccy).length == 0) {
                this.f79254o.setVisibility(0);
                return;
            }
            this.f79254o.setVisibility(8);
            CcyHistoryWrapper.SimpleRate[] simpleRateArr = C32165g.this.f79237k.getRates().get(ccy);
            int b = C32309i.m95241b(C32309i.C32310a.LAST_MONTH, simpleRateArr);
            this.f79256q = b;
            this.f79255p = C32309i.m95240a(b, simpleRateArr);
            this.f79253n.setMarker(new RateChartMarkerView(C32165g.this.f79230d, C32165g.this.f79232f, this.f79255p));
            this.f79253n.getAxisRight().setAxisMinimum(this.f79255p);
            m94793j(ccy);
            this.f79253n.setData(new LineData(m94794k(C32165g.this.f79231e)));
            this.f79253n.fitScreen();
            this.f79253n.setVisibleXRangeMinimum((float) (C32165g.this.f79232f.size() + 5));
            this.f79253n.animateY(500, Easing.EaseInOutExpo);
            this.f79253n.highlightValue((float) (C32165g.this.f79232f.size() - 1), 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public void m94798o(C32169d dVar, int i) {
            if (!(C32165g.this.f79234h == -1 || C32165g.this.f79233g == null)) {
                C32169d dVar2 = (C32169d) C32165g.this.f79233g.mo5320e0(C32165g.this.f79234h);
                m94796m(C32165g.this.f79230d.getResources().getDimensionPixelSize(C10319h.ccy_rate_item_height), dVar2, C32165g.this.f79234h);
                if (dVar2 != null) {
                    dVar2.f79250k.animate().rotation(Utils.FLOAT_EPSILON).setDuration(300).start();
                }
            }
            if (C32165g.this.f79234h != i) {
                m94796m(C32165g.this.f79230d.getResources().getDimensionPixelSize(C10319h.ccy_rate_item_height_expanded), dVar, i);
                dVar.f79250k.animate().rotation(180.0f).setDuration(300).start();
                C32165g.this.f79234h = i;
            } else {
                C32165g.this.f79234h = -1;
            }
            if (C32165g.this.f79238l != null) {
                C32165g.this.f79238l.mo72690h0(C32165g.this.f79234h);
            }
        }

        /* renamed from: p */
        private void m94799p(AppCompatButton appCompatButton) {
            C1314o.m4566h(appCompatButton, 9, 15, 1, 2);
        }
    }

    public C32165g(Context context, CcyRate[] ccyRateArr, CcyHistoryWrapper ccyHistoryWrapper, C32168c cVar) {
        this.f79230d = context;
        this.f79236j = ccyRateArr;
        this.f79237k = ccyHistoryWrapper;
        this.f79238l = cVar;
    }

    public int getItemCount() {
        return this.f79236j.length;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f79233g = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f79233g = null;
    }

    /* renamed from: q */
    public void mo72680q(String str) {
        this.f79235i = mo72681r(str);
        RecyclerView recyclerView = this.f79233g;
        if (recyclerView != null) {
            recyclerView.getLayoutManager().mo5197J1(this.f79235i);
        }
    }

    /* renamed from: r */
    public int mo72681r(String str) {
        CcyRate[] ccyRateArr = this.f79236j;
        if (ccyRateArr != null && ccyRateArr.length > 0) {
            int i = 0;
            while (true) {
                CcyRate[] ccyRateArr2 = this.f79236j;
                if (i >= ccyRateArr2.length) {
                    break;
                } else if (ccyRateArr2[i].getCcy().equals(str)) {
                    return i;
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    /* renamed from: s */
    public LineChart mo72682s() {
        RecyclerView recyclerView;
        C32169d dVar;
        int i = this.f79234h;
        if (i == -1 || (recyclerView = this.f79233g) == null || (dVar = (C32169d) recyclerView.mo5320e0(i)) == null) {
            return null;
        }
        return dVar.f79253n;
    }

    /* renamed from: t */
    public int mo72683t() {
        return this.f79234h;
    }

    /* renamed from: u */
    public void onBindViewHolder(C32169d dVar, int i) {
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = dVar.f79252m.getLayoutParams();
        if (this.f79234h == i) {
            dVar.m94797n();
            layoutParams.height = this.f79230d.getResources().getDimensionPixelSize(C10319h.ccy_rate_item_height_expanded);
            dVar.f79250k.setRotation(180.0f);
        } else {
            layoutParams.height = this.f79230d.getResources().getDimensionPixelSize(C10319h.ccy_rate_item_height);
            dVar.f79250k.setRotation(Utils.FLOAT_EPSILON);
        }
        if (i == this.f79235i) {
            dVar.m94797n();
            dVar.m94798o(dVar, i);
            this.f79234h = i;
            this.f79235i = -1;
        }
        dVar.f79252m.setLayoutParams(layoutParams);
        dVar.f79252m.requestLayout();
        int rateWeight = this.f79236j[i].getRateWeight();
        if (rateWeight > 0) {
            dVar.f79247h.setText(String.format("%d %s", new Object[]{Integer.valueOf(rateWeight), C27950a.m86286c(this.f79236j[i].getDictionaryKey(), false)}));
            BigDecimal difference = this.f79236j[i].getDifference();
            int c = C0767a.m2893c(this.f79230d, C10318g.currency_difference_zero_color);
            if (difference != null) {
                if (difference.doubleValue() > Utils.DOUBLE_EPSILON) {
                    i3 = C10320i.widget_ccy_down;
                    i2 = C0767a.m2893c(this.f79230d, C10318g.bog_error_red);
                } else if (difference.doubleValue() < Utils.DOUBLE_EPSILON) {
                    i3 = C10320i.widget_ccy_up;
                    i2 = C0767a.m2893c(this.f79230d, C10318g.bog_dialog_green_color);
                } else {
                    i2 = c;
                    i3 = -1;
                }
                dVar.f79248i.setText(String.valueOf(difference.abs().setScale(4, RoundingMode.UP)));
            } else {
                i2 = c;
                i3 = -1;
            }
            if (i3 == -1) {
                dVar.f79249j.setVisibility(8);
            } else {
                dVar.f79249j.setVisibility(0);
                dVar.f79249j.setImageResource(i3);
            }
            ((GradientDrawable) dVar.f79251l.getBackground()).setColor(i2);
            dVar.f79248i.setTextColor(i2);
            dVar.f79251l.setText(C32314k.m95245a(this.f79236j[i].getCcy()));
            BigDecimal currentRate = this.f79236j[i].getCurrentRate();
            if (currentRate != null) {
                dVar.f79243d.setText(String.valueOf(currentRate.setScale(4, RoundingMode.UP)));
            }
            BigDecimal dgtlSellRate = this.f79236j[i].getDgtlSellRate();
            BigDecimal dgtlBuyRate = this.f79236j[i].getDgtlBuyRate();
            if (dgtlSellRate != null) {
                dVar.f79245f.setText(String.valueOf(dgtlSellRate.setScale(4, RoundingMode.UP)));
            }
            if (dgtlBuyRate != null) {
                dVar.f79246g.setText(String.valueOf(dgtlBuyRate.setScale(4, RoundingMode.UP)));
            }
            dVar.f79260u.setText("");
            dVar.f79259t.setText("");
            BigDecimal sellRate = this.f79236j[i].getSellRate();
            BigDecimal buyRate = this.f79236j[i].getBuyRate();
            if (sellRate != null) {
                dVar.f79260u.setText(String.valueOf(sellRate.setScale(4, RoundingMode.UP)));
            }
            if (buyRate != null) {
                dVar.f79259t.setText(String.valueOf(buyRate.setScale(4, RoundingMode.UP)));
            }
        }
        dVar.f79257r.setOnClickListener(new C32166a(dVar, i));
        dVar.f79258s.setOnClickListener(new C32167b());
    }

    /* renamed from: v */
    public C32169d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C32169d(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.ccy_rate_recycler_item, viewGroup, false));
    }

    /* renamed from: w */
    public void mo72686w(CcyHistoryWrapper ccyHistoryWrapper) {
        this.f79237k = ccyHistoryWrapper;
        this.f79234h = -1;
        notifyDataSetChanged();
    }

    /* renamed from: x */
    public void mo72687x(CcyRate[] ccyRateArr) {
        this.f79236j = ccyRateArr;
    }
}
