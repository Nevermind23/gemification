package ug0;

import af1.C40303i;
import android.content.Context;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
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
import g91.C32335t0;
import g91.C32343x;
import ie0.C25183c;
import ie0.C25185e;
import ie0.C25186f;
import ie0.C25190j;
import ie1.C41315d0;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41545u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41554d;
import o31.C37594d;
import o31.C37606m;
import xe0.C29753k;

/* renamed from: ug0.a */
public interface C28775a {

    /* renamed from: g3 */
    public static final C28777b f73559g3 = C28777b.f73567a;

    /* renamed from: ug0.a$b */
    public static final class C28777b {

        /* renamed from: a */
        static final /* synthetic */ C28777b f73567a = new C28777b();

        /* renamed from: b */
        static final /* synthetic */ C40303i[] f73568b;

        /* renamed from: c */
        private static final C41554d f73569c;

        /* renamed from: d */
        private static final C41554d f73570d;

        /* renamed from: e */
        private static final C41554d f73571e;

        /* renamed from: f */
        private static final C41554d f73572f;

        /* renamed from: g */
        private static final C41554d f73573g;

        /* renamed from: h */
        private static final C41554d f73574h;

        /* renamed from: i */
        private static final C41554d f73575i;

        /* renamed from: j */
        private static final C41554d f73576j;

        /* renamed from: k */
        private static final C41554d f73577k;

        static {
            Class<C28777b> cls = C28777b.class;
            f73568b = new C40303i[]{C41520a0.m120441g(new C41545u(cls, "CHART_LABEL_VALUE_FORMATTER", "getCHART_LABEL_VALUE_FORMATTER$galtandtaggart_release()Ljava/text/DecimalFormat;", 0)), C41520a0.m120441g(new C41545u(cls, "CHART_LABEL_MONTH_FORMATTER", "getCHART_LABEL_MONTH_FORMATTER()Ljava/text/DateFormat;", 0)), C41520a0.m120441g(new C41545u(cls, "CHART_LABEL_MONTH_YEAR_FORMATTER", "getCHART_LABEL_MONTH_YEAR_FORMATTER()Ljava/text/DateFormat;", 0)), C41520a0.m120441g(new C41545u(cls, "CHART_LABEL_YEAR_FORMATTER", "getCHART_LABEL_YEAR_FORMATTER()Ljava/text/DateFormat;", 0)), C41520a0.m120441g(new C41545u(cls, "CHART_LABEL_HOUR_FORMATTER", "getCHART_LABEL_HOUR_FORMATTER()Ljava/text/DateFormat;", 0)), C41520a0.m120441g(new C41545u(cls, "CHART_LABEL_HOUR_DAY_FORMATTER", "getCHART_LABEL_HOUR_DAY_FORMATTER()Ljava/text/DateFormat;", 0)), C41520a0.m120441g(new C41545u(cls, "CHART_LABEL_DAY_FORMATTER", "getCHART_LABEL_DAY_FORMATTER()Ljava/text/DateFormat;", 0)), C41520a0.m120441g(new C41545u(cls, "CHART_LABEL_DAY_MONTH_FORMATTER", "getCHART_LABEL_DAY_MONTH_FORMATTER()Ljava/text/DateFormat;", 0)), C41520a0.m120441g(new C41545u(cls, "CHART_MARKER_LABEL_FULL_DATE_FORMATTER", "getCHART_MARKER_LABEL_FULL_DATE_FORMATTER()Ljava/text/DateFormat;", 0))};
            C37606m mVar = C37606m.f90354a;
            f73569c = C37606m.m110589g(mVar, "###,##0.00", (Locale) null, 2, (Object) null);
            f73570d = C37606m.m110587d(mVar, "MMM", (Locale) null, 2, (Object) null);
            f73571e = C37606m.m110587d(mVar, "MMM yyyy", (Locale) null, 2, (Object) null);
            f73572f = C37606m.m110587d(mVar, "yyyy", (Locale) null, 2, (Object) null);
            f73573g = C37606m.m110587d(mVar, "HH:mm", (Locale) null, 2, (Object) null);
            f73574h = C37606m.m110587d(mVar, "dd HH:mm", (Locale) null, 2, (Object) null);
            f73575i = C37606m.m110587d(mVar, "dd", (Locale) null, 2, (Object) null);
            f73576j = C37606m.m110587d(mVar, "MMM dd", (Locale) null, 2, (Object) null);
            f73577k = C37606m.m110587d(mVar, "d MMM, yyyy", (Locale) null, 2, (Object) null);
        }

        private C28777b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final DateFormat m88227i() {
            return (DateFormat) f73575i.getValue(this, f73568b[6]);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final DateFormat m88228j() {
            return (DateFormat) f73576j.getValue(this, f73568b[7]);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final DateFormat m88229k() {
            return (DateFormat) f73574h.getValue(this, f73568b[5]);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final DateFormat m88230l() {
            return (DateFormat) f73573g.getValue(this, f73568b[4]);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final DateFormat m88231m() {
            return (DateFormat) f73570d.getValue(this, f73568b[1]);
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final DateFormat m88232n() {
            return (DateFormat) f73571e.getValue(this, f73568b[2]);
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final DateFormat m88233p() {
            return (DateFormat) f73572f.getValue(this, f73568b[3]);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public final DateFormat m88234q() {
            return (DateFormat) f73577k.getValue(this, f73568b[8]);
        }

        /* renamed from: o */
        public final DecimalFormat mo68513o() {
            return (DecimalFormat) f73569c.getValue(this, f73568b[0]);
        }
    }

    /* renamed from: ug0.a$c */
    public static final class C28778c {

        /* renamed from: ug0.a$c$a */
        public static final class C28779a implements C41315d0 {

            /* renamed from: a */
            final /* synthetic */ Iterable f73578a;

            public C28779a(Iterable iterable) {
                this.f73578a = iterable;
            }

            /* renamed from: a */
            public Object mo35461a(Object obj) {
                return (String) obj;
            }

            /* renamed from: b */
            public Iterator mo35462b() {
                return this.f73578a.iterator();
            }
        }

        /* renamed from: ug0.a$c$b */
        public static final class C28780b extends ValueFormatter {
            C28780b() {
            }

            public String getAxisLabel(float f, AxisBase axisBase) {
                C41536l.m120489i(axisBase, "axis");
                String format = C28775a.f73559g3.mo68513o().format(Float.valueOf(f));
                C41536l.m120488h(format, "CHART_LABEL_VALUE_FORMATTER.format(value)");
                return format;
            }
        }

        /* renamed from: ug0.a$c$c */
        public static final class C28781c extends ValueFormatter {

            /* renamed from: a */
            final /* synthetic */ C28775a f73579a;

            C28781c(C28775a aVar) {
                this.f73579a = aVar;
            }

            public String getAxisLabel(float f, AxisBase axisBase) {
                String str;
                C41536l.m120489i(axisBase, "axis");
                if (!this.f73579a.mo60603H0().mo68508g() || (str = (String) C41358y.m120010Z(this.f73579a.mo60603H0().mo68502a(), (int) f)) == null) {
                    return "";
                }
                return str;
            }
        }

        /* renamed from: a */
        private static void m88236a(C28775a aVar, List list) {
            XAxis xAxis;
            DateFormat dateFormat;
            String str;
            aVar.mo60603H0().mo68503b().clear();
            aVar.mo60603H0().mo68502a().clear();
            aVar.mo60603H0().mo68504c().clear();
            LineChart d = aVar.mo60603H0().mo68505d();
            if (d != null) {
                xAxis = d.getXAxis();
            } else {
                xAxis = null;
            }
            int i = 0;
            if (xAxis != null) {
                xAxis.setLabelCount(5, false);
            }
            if (!list.isEmpty()) {
                Date a = ((C29753k) C41358y.m120007W(list)).mo69821a();
                Date a2 = ((C29753k) C41358y.m120019i0(list)).mo69821a();
                String f = aVar.mo60603H0().mo68507f();
                if (f != null) {
                    switch (C28784e.f73592a[C28782d.f73580e.mo68515a(f).ordinal()]) {
                        case 1:
                            if (!C37594d.m110562c(a, a2)) {
                                dateFormat = C28775a.f73559g3.m88229k();
                                break;
                            } else {
                                dateFormat = C28775a.f73559g3.m88230l();
                                break;
                            }
                        case 2:
                        case 3:
                            if (!C37594d.m110563d(a, a2)) {
                                dateFormat = C28775a.f73559g3.m88228j();
                                break;
                            } else {
                                dateFormat = C28775a.f73559g3.m88227i();
                                break;
                            }
                        case 4:
                        case 5:
                        case 6:
                            if (!C37594d.m110564e(a, a2)) {
                                if (xAxis != null) {
                                    xAxis.setLabelCount(4, true);
                                }
                                dateFormat = C28775a.f73559g3.m88232n();
                                break;
                            } else {
                                dateFormat = C28775a.f73559g3.m88231m();
                                break;
                            }
                        case 7:
                            if (xAxis != null) {
                                xAxis.setLabelCount(4, true);
                            }
                            dateFormat = C28775a.f73559g3.m88232n();
                            break;
                        case 8:
                            dateFormat = C28775a.f73559g3.m88233p();
                            break;
                        default:
                            dateFormat = C28775a.f73559g3.m88233p();
                            break;
                    }
                } else {
                    dateFormat = null;
                }
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C41341q.m119917t();
                    }
                    C29753k kVar = (C29753k) next;
                    aVar.mo60603H0().mo68503b().add(new Entry((float) i, Float.parseFloat(kVar.mo69822b())));
                    if (aVar.mo60603H0().mo68508g()) {
                        if (dateFormat != null) {
                            str = dateFormat.format(kVar.mo69821a());
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        } else {
                            C41536l.m120488h(str, "chartLabelFormatter?.for…t(historyItem.date) ?: \"\"");
                        }
                        aVar.mo60603H0().mo68502a().add(str);
                        List c = aVar.mo60603H0().mo68504c();
                        String format = C28775a.f73559g3.m88234q().format(kVar.mo69821a());
                        C41536l.m120488h(format, "CHART_MARKER_LABEL_FULL_…                        )");
                        c.add(format);
                    }
                    i = i2;
                }
            }
        }

        /* renamed from: b */
        private static LineDataSet m88237b(C28775a aVar, List list) {
            LineDataSet lineDataSet = new LineDataSet(list, "");
            if (aVar.mo60603H0().mo68506e() != null) {
                lineDataSet.setColor(C32335t0.m95357b());
                Context e = aVar.mo60603H0().mo68506e();
                C41536l.m120486f(e);
                lineDataSet.setFillDrawable(C0767a.m2895e(e, C25185e.chart_fill_shape));
                lineDataSet.setLineWidth(1.0f);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setDrawHorizontalHighlightIndicator(false);
                lineDataSet.setHighlightLineWidth(1.0f);
                Context e2 = aVar.mo60603H0().mo68506e();
                C41536l.m120486f(e2);
                lineDataSet.setHighLightColor(C0767a.m2893c(e2, 17170445));
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawValues(false);
            }
            return lineDataSet;
        }

        /* renamed from: c */
        public static void m88238c(C28775a aVar, boolean z, LineChart lineChart, Context context) {
            C41536l.m120489i(lineChart, "lineChart");
            C41536l.m120489i(context, "cont");
            aVar.mo60603H0().mo68511j(z);
            aVar.mo60603H0().mo68509h(lineChart);
            aVar.mo60603H0().mo68510i(context);
            LineChart d = aVar.mo60603H0().mo68505d();
            Context e = aVar.mo60603H0().mo68506e();
            if (d != null && e != null) {
                d.setBackgroundColor(C0767a.m2893c(e, C25183c.f64641c));
                d.setDrawGridBackground(false);
                d.setHardwareAccelerationEnabled(false);
                d.setScaleEnabled(false);
                d.setPinchZoom(false);
                d.setDoubleTapToZoomEnabled(false);
                d.setOnTouchListener(new C28785b());
                d.getLegend().setEnabled(false);
                Description description = new Description();
                description.setText("");
                d.setDescription(description);
                d.setNoDataText("");
                d.setNoDataTextColor(C32335t0.m95357b());
                d.getAxisLeft().setEnabled(false);
                d.getAxisRight().setEnabled(aVar.mo60603H0().mo68508g());
                YAxis axisRight = d.getAxisRight();
                C41536l.m120488h(axisRight, "chartView.axisRight");
                axisRight.setLabelCount(4, true);
                axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
                axisRight.setDrawAxisLine(false);
                axisRight.setDrawGridLines(true);
                axisRight.enableGridDashedLine(C32343x.m95396J(4.0f), C32343x.m95396J(4.0f), Utils.FLOAT_EPSILON);
                axisRight.setGridLineWidth(1.0f);
                int i = C25183c.color_black_solid_25;
                axisRight.setGridColor(C0767a.m2893c(e, i));
                int i2 = C25183c.f64642d;
                axisRight.setTextColor(C0767a.m2893c(e, i2));
                axisRight.setTextSize(11.0f);
                int i3 = C25186f.f64665a;
                axisRight.setTypeface(C0808h.m3033h(e, i3));
                axisRight.setValueFormatter(new C28780b());
                XAxis xAxis = d.getXAxis();
                C41536l.m120488h(xAxis, "chartView.xAxis");
                xAxis.setLabelCount(5, false);
                xAxis.setAvoidFirstLastClipping(true);
                xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
                xAxis.setTextSize(11.0f);
                xAxis.setTextColor(C0767a.m2893c(e, i2));
                xAxis.setTypeface(C0808h.m3033h(e, i3));
                xAxis.setDrawGridLines(false);
                xAxis.setDrawAxisLine(aVar.mo60603H0().mo68508g());
                xAxis.setAxisLineColor(C0767a.m2893c(e, i));
                xAxis.setAxisLineWidth(1.0f);
                if (aVar.mo60603H0().mo68508g()) {
                    d.setExtraTopOffset(78.0f);
                    d.setExtraBottomOffset(20.0f);
                    axisRight.setYOffset(-14.0f);
                    xAxis.setYOffset(7.0f);
                    xAxis.setGranularityEnabled(true);
                }
                xAxis.setValueFormatter(new C28781c(aVar));
                d.invalidate();
            }
        }

        /* renamed from: d */
        public static void m88239d(C28775a aVar, List list) {
            XAxis xAxis;
            LineChart d;
            float f;
            LineChart d2;
            String str;
            C41536l.m120489i(list, "historyItems");
            C28776a H0 = aVar.mo60603H0();
            Object obj = null;
            if (H0.mo68508g() && (d2 = H0.mo68505d()) != null) {
                Context e = H0.mo68506e();
                if (e != null) {
                    str = e.getString(C25190j.gt_chart_no_data);
                } else {
                    str = null;
                }
                d2.setNoDataText(str);
            }
            if (!list.isEmpty()) {
                m88236a(aVar, list);
                if (H0.mo68508g()) {
                    LineChart d3 = H0.mo68505d();
                    if (d3 != null) {
                        xAxis = d3.getXAxis();
                    } else {
                        xAxis = null;
                    }
                    if (xAxis != null) {
                        Iterator it = C41319f0.m119699a(new C28779a(H0.mo68502a())).entrySet().iterator();
                        if (it.hasNext()) {
                            obj = it.next();
                            if (it.hasNext()) {
                                int intValue = ((Number) ((Map.Entry) obj).getValue()).intValue();
                                do {
                                    Object next = it.next();
                                    int intValue2 = ((Number) ((Map.Entry) next).getValue()).intValue();
                                    if (intValue < intValue2) {
                                        obj = next;
                                        intValue = intValue2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        Map.Entry entry = (Map.Entry) obj;
                        if (entry != null) {
                            f = (float) ((Number) entry.getValue()).intValue();
                        } else {
                            f = Utils.FLOAT_EPSILON;
                        }
                        xAxis.setGranularity(f);
                    }
                    Context e2 = H0.mo68506e();
                    if (!(e2 == null || (d = H0.mo68505d()) == null)) {
                        C28792f fVar = new C28792f(e2, H0.mo68504c());
                        fVar.setChartView(aVar.mo60603H0().mo68505d());
                        d.setMarker(fVar);
                    }
                }
                LineData lineData = new LineData(m88237b(aVar, aVar.mo60603H0().mo68503b()));
                LineChart d4 = H0.mo68505d();
                if (d4 != null) {
                    d4.setData(lineData);
                }
                LineChart d5 = H0.mo68505d();
                if (d5 != null) {
                    d5.fitScreen();
                }
                LineChart d6 = H0.mo68505d();
                if (d6 != null) {
                    d6.highlightValue(((float) H0.mo68502a().size()) - 1.0f, 0);
                }
            } else {
                LineChart d7 = H0.mo68505d();
                if (d7 != null) {
                    d7.clear();
                }
            }
            LineChart d8 = H0.mo68505d();
            if (d8 != null) {
                d8.invalidate();
            }
        }
    }

    /* renamed from: ug0.a$d */
    public enum C28782d {
        DAY("1d"),
        WEEK("1w"),
        MONTH("1m"),
        THREE_MONTHS("3m"),
        SIX_MONTHS("6m"),
        YEAR("1y"),
        TWO_YEARS("2y"),
        FIVE_YEARS("5y"),
        ALL("ALL");
        

        /* renamed from: e */
        public static final C28783a f73580e = null;

        /* renamed from: d */
        private final String f73591d;

        /* renamed from: ug0.a$d$a */
        public static final class C28783a {
            private C28783a() {
            }

            public /* synthetic */ C28783a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C28782d mo68515a(String str) {
                C28782d dVar;
                C41536l.m120489i(str, "id");
                C28782d[] values = C28782d.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        dVar = null;
                        break;
                    }
                    dVar = values[i];
                    if (C41536l.m120484d(dVar.mo68514b(), str)) {
                        break;
                    }
                    i++;
                }
                if (dVar == null) {
                    return C28782d.ALL;
                }
                return dVar;
            }
        }

        static {
            f73580e = new C28783a((DefaultConstructorMarker) null);
        }

        private C28782d(String str) {
            this.f73591d = str;
        }

        /* renamed from: b */
        public final String mo68514b() {
            return this.f73591d;
        }
    }

    /* renamed from: ug0.a$e */
    public /* synthetic */ class C28784e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73592a;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ug0.a$d[] r0 = ug0.C28775a.C28782d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ug0.a$d r1 = ug0.C28775a.C28782d.DAY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ug0.a$d r1 = ug0.C28775a.C28782d.WEEK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ug0.a$d r1 = ug0.C28775a.C28782d.MONTH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ug0.a$d r1 = ug0.C28775a.C28782d.THREE_MONTHS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ug0.a$d r1 = ug0.C28775a.C28782d.SIX_MONTHS     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ug0.a$d r1 = ug0.C28775a.C28782d.YEAR     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                ug0.a$d r1 = ug0.C28775a.C28782d.TWO_YEARS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                ug0.a$d r1 = ug0.C28775a.C28782d.FIVE_YEARS     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f73592a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ug0.C28775a.C28784e.<clinit>():void");
        }
    }

    /* renamed from: H0 */
    C28776a mo60603H0();

    /* renamed from: ug0.a$a */
    public static final class C28776a {

        /* renamed from: a */
        private final List f73560a;

        /* renamed from: b */
        private final List f73561b;

        /* renamed from: c */
        private final List f73562c;

        /* renamed from: d */
        private boolean f73563d;

        /* renamed from: e */
        private Context f73564e;

        /* renamed from: f */
        private LineChart f73565f;

        /* renamed from: g */
        private String f73566g;

        public C28776a(List list, List list2, List list3, boolean z, Context context, LineChart lineChart, String str) {
            C41536l.m120489i(list, "chartLabels");
            C41536l.m120489i(list2, "chartMarkerLabels");
            C41536l.m120489i(list3, "chartLineEntries");
            this.f73560a = list;
            this.f73561b = list2;
            this.f73562c = list3;
            this.f73563d = z;
            this.f73564e = context;
            this.f73565f = lineChart;
            this.f73566g = str;
        }

        /* renamed from: a */
        public final List mo68502a() {
            return this.f73560a;
        }

        /* renamed from: b */
        public final List mo68503b() {
            return this.f73562c;
        }

        /* renamed from: c */
        public final List mo68504c() {
            return this.f73561b;
        }

        /* renamed from: d */
        public final LineChart mo68505d() {
            return this.f73565f;
        }

        /* renamed from: e */
        public final Context mo68506e() {
            return this.f73564e;
        }

        /* renamed from: f */
        public final String mo68507f() {
            return this.f73566g;
        }

        /* renamed from: g */
        public final boolean mo68508g() {
            return this.f73563d;
        }

        /* renamed from: h */
        public final void mo68509h(LineChart lineChart) {
            this.f73565f = lineChart;
        }

        /* renamed from: i */
        public final void mo68510i(Context context) {
            this.f73564e = context;
        }

        /* renamed from: j */
        public final void mo68511j(boolean z) {
            this.f73563d = z;
        }

        /* renamed from: k */
        public final void mo68512k(String str) {
            this.f73566g = str;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C28776a(java.util.List r6, java.util.List r7, java.util.List r8, boolean r9, android.content.Context r10, com.github.mikephil.charting.charts.LineChart r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r5 = this;
                r14 = r13 & 1
                if (r14 == 0) goto L_0x0009
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
            L_0x0009:
                r14 = r13 & 2
                if (r14 == 0) goto L_0x0012
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
            L_0x0012:
                r14 = r7
                r7 = r13 & 4
                if (r7 == 0) goto L_0x001c
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
            L_0x001c:
                r0 = r8
                r7 = r13 & 8
                if (r7 == 0) goto L_0x0022
                r9 = 0
            L_0x0022:
                r1 = r9
                r7 = r13 & 16
                r8 = 0
                if (r7 == 0) goto L_0x002a
                r2 = r8
                goto L_0x002b
            L_0x002a:
                r2 = r10
            L_0x002b:
                r7 = r13 & 32
                if (r7 == 0) goto L_0x0031
                r3 = r8
                goto L_0x0032
            L_0x0031:
                r3 = r11
            L_0x0032:
                r7 = r13 & 64
                if (r7 == 0) goto L_0x0038
                r4 = r8
                goto L_0x0039
            L_0x0038:
                r4 = r12
            L_0x0039:
                r7 = r5
                r8 = r6
                r9 = r14
                r10 = r0
                r11 = r1
                r12 = r2
                r13 = r3
                r14 = r4
                r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ug0.C28775a.C28776a.<init>(java.util.List, java.util.List, java.util.List, boolean, android.content.Context, com.github.mikephil.charting.charts.LineChart, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
