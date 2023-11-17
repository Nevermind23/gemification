package d40;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import c40.C19472a;
import c40.C19473b;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32303f;
import g91.C32335t0;
import g91.C32343x;
import g91.C32359z0;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.NoDataView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarFilterView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10329r;
import p630ui.C18168a;
import q40.C27680a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: d40.c */
public final class C19902c extends RecyclerView.C1734f0 {

    /* renamed from: u */
    public static final C19903a f54412u = new C19903a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final PieChart f54413d;

    /* renamed from: e */
    private final CalendarFilterView f54414e;

    /* renamed from: f */
    private final ViewGroup f54415f;

    /* renamed from: g */
    private final ImageView f54416g;

    /* renamed from: h */
    private final BogTextView f54417h;

    /* renamed from: i */
    private final ViewGroup f54418i;

    /* renamed from: j */
    private final BogImageView f54419j;

    /* renamed from: k */
    private final BogTextView f54420k;

    /* renamed from: l */
    private final NoDataView f54421l;

    /* renamed from: m */
    private final View f54422m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C43075l f54423n;

    /* renamed from: o */
    private C43064a f54424o;

    /* renamed from: p */
    private C43064a f54425p;

    /* renamed from: q */
    private C43064a f54426q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C43075l f54427r;

    /* renamed from: s */
    private final C19472a f54428s;

    /* renamed from: t */
    private final C18168a f54429t;

    /* renamed from: d40.c$a */
    public static final class C19903a {
        private C19903a() {
        }

        public /* synthetic */ C19903a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19902c m65782b(C19903a aVar, ViewGroup viewGroup, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return aVar.mo48279a(viewGroup, z);
        }

        /* renamed from: a */
        public final C19902c mo48279a(ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.analysis_recycler_chart_item, viewGroup, false);
            C41536l.m120488h(inflate, "view");
            return new C19902c(inflate, z);
        }
    }

    /* renamed from: d40.c$c */
    static final class C19905c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19902c f54442d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19905c(C19902c cVar) {
            super(1);
            this.f54442d = cVar;
        }

        /* renamed from: a */
        public final void mo48295a(FilterValue.Calendar calendar) {
            C41536l.m120489i(calendar, "it");
            C43075l l = this.f54442d.f54427r;
            if (l != null) {
                l.invoke(calendar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48295a((FilterValue.Calendar) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d40.c$d */
    public static final class C19906d implements OnChartValueSelectedListener {

        /* renamed from: a */
        final /* synthetic */ C19904b f54443a;

        /* renamed from: b */
        final /* synthetic */ PieChart f54444b;

        /* renamed from: c */
        final /* synthetic */ PieDataSet f54445c;

        /* renamed from: d */
        final /* synthetic */ C19902c f54446d;

        C19906d(C19904b bVar, PieChart pieChart, PieDataSet pieDataSet, C19902c cVar) {
            this.f54443a = bVar;
            this.f54444b = pieChart;
            this.f54445c = pieDataSet;
            this.f54446d = cVar;
        }

        public void onNothingSelected() {
            if (this.f54443a.mo48287g() != -1) {
                this.f54444b.highlightValue((float) this.f54443a.mo48287g(), ((PieEntry) this.f54445c.getEntryForIndex(this.f54443a.mo48287g())).getY(), 0);
            }
        }

        public void onValueSelected(Entry entry, Highlight highlight) {
            Object data;
            boolean z;
            if (this.f54443a.mo48287g() == -1 || !C41536l.m120484d(entry, this.f54445c.getEntryForIndex(this.f54443a.mo48287g()))) {
                Object obj = null;
                this.f54446d.f54413d.highlightValue((Highlight) null);
                if (!this.f54443a.mo48286f()) {
                    onNothingSelected();
                } else if (entry != null && (data = entry.getData()) != null) {
                    C19902c cVar = this.f54446d;
                    C19904b bVar = this.f54443a;
                    C43075l m = cVar.f54423n;
                    if (m != null) {
                        Iterator it = bVar.mo48290i().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((AnalysisChildModel) next).mo54781f() == ((Long) data).longValue()) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                obj = next;
                                break;
                            }
                        }
                        C41536l.m120486f(obj);
                        m.invoke(obj);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19902c(View view, boolean z) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.pieChart);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.pieChart)");
        PieChart pieChart = (PieChart) findViewById;
        this.f54413d = pieChart;
        View findViewById2 = view.findViewById(C10322k.calendarFilterView);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.calendarFilterView)");
        this.f54414e = (CalendarFilterView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.backBtn);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.backBtn)");
        ViewGroup viewGroup = (ViewGroup) findViewById3;
        this.f54415f = viewGroup;
        View findViewById4 = view.findViewById(C10322k.backIV);
        C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.backIV)");
        ImageView imageView = (ImageView) findViewById4;
        this.f54416g = imageView;
        View findViewById5 = view.findViewById(C10322k.backTV);
        C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.backTV)");
        BogTextView bogTextView = (BogTextView) findViewById5;
        this.f54417h = bogTextView;
        View findViewById6 = view.findViewById(C10322k.faqBtn);
        C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.faqBtn)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById6;
        this.f54418i = viewGroup2;
        View findViewById7 = view.findViewById(C10322k.faqImg);
        C41536l.m120488h(findViewById7, "itemView.findViewById(R.id.faqImg)");
        BogImageView bogImageView = (BogImageView) findViewById7;
        this.f54419j = bogImageView;
        View findViewById8 = view.findViewById(C10322k.faqTxt);
        C41536l.m120488h(findViewById8, "itemView.findViewById(R.id.faqTxt)");
        BogTextView bogTextView2 = (BogTextView) findViewById8;
        this.f54420k = bogTextView2;
        View findViewById9 = view.findViewById(C10322k.noDataView);
        C41536l.m120488h(findViewById9, "itemView.findViewById(R.id.noDataView)");
        this.f54421l = (NoDataView) findViewById9;
        View findViewById10 = view.findViewById(C10322k.notClickableArea);
        C41536l.m120488h(findViewById10, "itemView.findViewById(R.id.notClickableArea)");
        this.f54422m = findViewById10;
        C19472a aVar = new C19472a(pieChart, pieChart.getAnimator(), pieChart.getViewPortHandler());
        this.f54428s = aVar;
        Context context = view.getContext();
        C41536l.m120488h(context, "itemView.context");
        this.f54429t = new C18168a(context, C10329r.f28972g);
        C19473b.m65016d(pieChart, z);
        pieChart.setRenderer(aVar);
        if (C32335t0.m95361f() == 0) {
            Context context2 = view.getContext();
            int i = C10318g.color_primary_retail;
            imageView.setColorFilter(C0767a.m2893c(context2, i));
            bogTextView.setTextColor(C0767a.m2893c(view.getContext(), i));
            bogTextView2.setTextColor(C0767a.m2893c(view.getContext(), i));
            bogImageView.setColorFilter(C0767a.m2893c(view.getContext(), i));
        } else if (C32335t0.m95361f() == 2) {
            Context context3 = view.getContext();
            int i2 = C10318g.color_accent_wealth;
            imageView.setColorFilter(C0767a.m2893c(context3, i2));
            bogTextView.setTextColor(C0767a.m2893c(view.getContext(), i2));
            bogTextView2.setTextColor(C0767a.m2893c(view.getContext(), i2));
            bogImageView.setColorFilter(C0767a.m2893c(view.getContext(), i2));
        } else {
            Context context4 = view.getContext();
            int i3 = C10318g.color_accent_solo;
            imageView.setColorFilter(C0767a.m2893c(context4, i3));
            bogTextView.setTextColor(C0767a.m2893c(view.getContext(), i3));
            bogTextView2.setTextColor(C0767a.m2893c(view.getContext(), i3));
            bogImageView.setColorFilter(C0767a.m2893c(view.getContext(), i3));
        }
        viewGroup.setOnClickListener(new C19900a(this));
        viewGroup2.setOnClickListener(new C19901b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m65769j(C19902c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C43064a aVar = cVar.f54424o;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m65770k(C19902c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C43064a aVar = cVar.f54426q;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: p */
    private final float m65774p(BigDecimal bigDecimal, AnalysisChildModel analysisChildModel, boolean z) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        if (z) {
            bigDecimal2 = analysisChildModel.mo54783h().abs();
        } else if ((analysisChildModel.mo54783h().compareTo(BigDecimal.ZERO) >= 0 || bigDecimal.compareTo(BigDecimal.ZERO) <= 0) && (analysisChildModel.mo54783h().compareTo(BigDecimal.ZERO) <= 0 || bigDecimal.compareTo(BigDecimal.ZERO) >= 0)) {
            bigDecimal2 = analysisChildModel.mo54783h().abs();
        } else {
            bigDecimal2 = BigDecimal.valueOf(0);
            C41536l.m120488h(bigDecimal2, "valueOf(this.toLong())");
        }
        if (bigDecimal.abs().compareTo(BigDecimal.ZERO) > 0) {
            C41536l.m120488h(bigDecimal2, C11755a.C11756a.f34100b);
            BigDecimal Y0 = C32343x.m95427Y0(bigDecimal2, 2);
            BigDecimal abs = bigDecimal.abs();
            C41536l.m120488h(abs, "this.abs()");
            bigDecimal3 = Y0.divide(C32343x.m95427Y0(abs, 2), 2);
        } else {
            bigDecimal3 = BigDecimal.ZERO;
        }
        return bigDecimal3.floatValue();
    }

    /* renamed from: o */
    public final Object mo48272o(C19904b bVar) {
        int i;
        C41536l.m120489i(bVar, "data");
        View view = this.itemView;
        C18168a aVar = this.f54429t;
        C41536l.m120488h(view, "itemView");
        aVar.mo45824a(view);
        ViewGroup viewGroup = this.f54415f;
        if (bVar.mo48291j()) {
            i = 0;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
        this.f54414e.setClickable(bVar.mo48284e());
        this.f54414e.setMode(CalendarFilterView.C21519a.MONTH_PICKER);
        this.f54414e.setOnValueChanged(new C19905c(this));
        if (bVar.mo48290i().isEmpty()) {
            this.f54422m.setVisibility(8);
            NoDataView noDataView = this.f54421l;
            noDataView.setVisibility(0);
            noDataView.mo53658d(this.f54425p);
            noDataView.setShowButton(bVar.mo48293l());
            this.f54414e.setVisibility(8);
            return C41238w.f97225a;
        }
        this.f54421l.setVisibility(8);
        this.f54422m.setVisibility(0);
        this.f54414e.setVisibility(0);
        this.f54414e.setValue(bVar.mo48280a());
        Context context = view.getContext();
        C41536l.m120488h(context, "context");
        PieDataSet q = mo48273q(context, bVar.mo48282c(), bVar.mo48290i(), bVar.mo48292k());
        ArrayList<AnalysisChildModel> i2 = bVar.mo48290i();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(i2, 10));
        for (AnalysisChildModel e : i2) {
            arrayList.add(Integer.valueOf(Color.parseColor(e.mo54779e())));
        }
        q.setColors((List<Integer>) arrayList);
        q.setDrawValues(false);
        q.setSliceSpace(10.0f);
        q.setSelectionShift(8.0f);
        PieData pieData = new PieData(q);
        pieData.setHighlightEnabled(true);
        PieChart pieChart = this.f54413d;
        pieChart.setData(pieData);
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{C32359z0.m95549T(C32343x.m95427Y0(bVar.mo48283d(), 2)), C32303f.m95197h("GEL")}, 2));
        C41536l.m120488h(format, "format(format, *args)");
        Context context2 = pieChart.getContext();
        C41536l.m120488h(context2, "context");
        C19473b.m65015c(pieChart, context2, bVar.mo48281b(), format, bVar.mo48288h());
        pieChart.setOnChartValueSelectedListener((OnChartValueSelectedListener) null);
        if (bVar.mo48287g() != -1) {
            this.f54428s.mo47702a(bVar.mo48287g());
            pieChart.highlightValue((float) bVar.mo48287g(), ((PieEntry) q.getEntryForIndex(bVar.mo48287g())).getY(), 0);
        }
        pieChart.setOnChartValueSelectedListener(new C19906d(bVar, pieChart, q, this));
        return pieChart;
    }

    /* renamed from: q */
    public final PieDataSet mo48273q(Context context, BigDecimal bigDecimal, List list, boolean z) {
        Drawable drawable;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(bigDecimal, "categoryValue");
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnalysisChildModel analysisChildModel = (AnalysisChildModel) it.next();
            Drawable e = C0767a.m2895e(context, C27680a.f70771a.mo67216a(analysisChildModel.mo54781f()));
            Drawable drawable2 = null;
            if (e != null) {
                drawable = C32343x.m95460k(e, C0767a.m2893c(context, C10318g.f28616A));
            } else {
                drawable = null;
            }
            float p = m65774p(bigDecimal, analysisChildModel, z);
            if (p > 0.04f) {
                drawable2 = drawable;
            }
            arrayList.add(new PieEntry(p, drawable2, (Object) Long.valueOf(analysisChildModel.mo54781f())));
        }
        return new PieDataSet(arrayList, "");
    }

    /* renamed from: r */
    public final void mo48274r(C43064a aVar) {
        this.f54424o = aVar;
    }

    /* renamed from: s */
    public final void mo48275s(C43075l lVar) {
        this.f54427r = lVar;
    }

    /* renamed from: t */
    public final void mo48276t(C43075l lVar) {
        this.f54423n = lVar;
    }

    /* renamed from: u */
    public final void mo48277u(C43064a aVar) {
        this.f54426q = aVar;
    }

    /* renamed from: v */
    public final void mo48278v(C43064a aVar) {
        this.f54425p = aVar;
    }

    /* renamed from: d40.c$b */
    public static final class C19904b {

        /* renamed from: a */
        private final String f54430a;

        /* renamed from: b */
        private final BigDecimal f54431b;

        /* renamed from: c */
        private final BigDecimal f54432c;

        /* renamed from: d */
        private final Drawable f54433d;

        /* renamed from: e */
        private final ArrayList f54434e;

        /* renamed from: f */
        private final FilterValue.Calendar f54435f;

        /* renamed from: g */
        private final boolean f54436g;

        /* renamed from: h */
        private final boolean f54437h;

        /* renamed from: i */
        private final boolean f54438i;

        /* renamed from: j */
        private final boolean f54439j;

        /* renamed from: k */
        private final int f54440k;

        /* renamed from: l */
        private final boolean f54441l;

        public C19904b(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, Drawable drawable, ArrayList arrayList, FilterValue.Calendar calendar, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
            C41536l.m120489i(str, "categoryName");
            C41536l.m120489i(bigDecimal, "categoryValue");
            C41536l.m120489i(bigDecimal2, "centerTextValue");
            C41536l.m120489i(arrayList, "listItems");
            C41536l.m120489i(calendar, "calendarValue");
            this.f54430a = str;
            this.f54431b = bigDecimal;
            this.f54432c = bigDecimal2;
            this.f54433d = drawable;
            this.f54434e = arrayList;
            this.f54435f = calendar;
            this.f54436g = z;
            this.f54437h = z2;
            this.f54438i = z3;
            this.f54439j = z4;
            this.f54440k = i;
            this.f54441l = z5;
        }

        /* renamed from: a */
        public final FilterValue.Calendar mo48280a() {
            return this.f54435f;
        }

        /* renamed from: b */
        public final String mo48281b() {
            return this.f54430a;
        }

        /* renamed from: c */
        public final BigDecimal mo48282c() {
            return this.f54431b;
        }

        /* renamed from: d */
        public final BigDecimal mo48283d() {
            return this.f54432c;
        }

        /* renamed from: e */
        public final boolean mo48284e() {
            return this.f54438i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19904b)) {
                return false;
            }
            C19904b bVar = (C19904b) obj;
            return C41536l.m120484d(this.f54430a, bVar.f54430a) && C41536l.m120484d(this.f54431b, bVar.f54431b) && C41536l.m120484d(this.f54432c, bVar.f54432c) && C41536l.m120484d(this.f54433d, bVar.f54433d) && C41536l.m120484d(this.f54434e, bVar.f54434e) && C41536l.m120484d(this.f54435f, bVar.f54435f) && this.f54436g == bVar.f54436g && this.f54437h == bVar.f54437h && this.f54438i == bVar.f54438i && this.f54439j == bVar.f54439j && this.f54440k == bVar.f54440k && this.f54441l == bVar.f54441l;
        }

        /* renamed from: f */
        public final boolean mo48286f() {
            return this.f54441l;
        }

        /* renamed from: g */
        public final int mo48287g() {
            return this.f54440k;
        }

        /* renamed from: h */
        public final Drawable mo48288h() {
            return this.f54433d;
        }

        public int hashCode() {
            int hashCode = ((((this.f54430a.hashCode() * 31) + this.f54431b.hashCode()) * 31) + this.f54432c.hashCode()) * 31;
            Drawable drawable = this.f54433d;
            int hashCode2 = (((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f54434e.hashCode()) * 31) + this.f54435f.hashCode()) * 31;
            boolean z = this.f54436g;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f54437h;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f54438i;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f54439j;
            if (z5) {
                z5 = true;
            }
            int i4 = (((i3 + (z5 ? 1 : 0)) * 31) + this.f54440k) * 31;
            boolean z6 = this.f54441l;
            if (!z6) {
                z2 = z6;
            }
            return i4 + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final ArrayList mo48290i() {
            return this.f54434e;
        }

        /* renamed from: j */
        public final boolean mo48291j() {
            return this.f54437h;
        }

        /* renamed from: k */
        public final boolean mo48292k() {
            return this.f54436g;
        }

        /* renamed from: l */
        public final boolean mo48293l() {
            return this.f54439j;
        }

        public String toString() {
            String str = this.f54430a;
            BigDecimal bigDecimal = this.f54431b;
            BigDecimal bigDecimal2 = this.f54432c;
            Drawable drawable = this.f54433d;
            ArrayList arrayList = this.f54434e;
            FilterValue.Calendar calendar = this.f54435f;
            boolean z = this.f54436g;
            boolean z2 = this.f54437h;
            boolean z3 = this.f54438i;
            boolean z4 = this.f54439j;
            int i = this.f54440k;
            boolean z5 = this.f54441l;
            return "Data(categoryName=" + str + ", categoryValue=" + bigDecimal + ", centerTextValue=" + bigDecimal2 + ", image=" + drawable + ", listItems=" + arrayList + ", calendarValue=" + calendar + ", showFilteredValues=" + z + ", showBackBtn=" + z2 + ", enableCalendarPicker=" + z3 + ", showResetButton=" + z4 + ", highlightedSliceIndex=" + i + ", highlightableOnClick=" + z5 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C19904b(java.lang.String r17, java.math.BigDecimal r18, java.math.BigDecimal r19, android.graphics.drawable.Drawable r20, java.util.ArrayList r21, p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue.Calendar r22, boolean r23, boolean r24, boolean r25, boolean r26, int r27, boolean r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
            /*
                r16 = this;
                r0 = r29
                r1 = r0 & 128(0x80, float:1.794E-43)
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r11 = r2
                goto L_0x000b
            L_0x0009:
                r11 = r24
            L_0x000b:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0011
                r12 = r2
                goto L_0x0013
            L_0x0011:
                r12 = r25
            L_0x0013:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0019
                r13 = r2
                goto L_0x001b
            L_0x0019:
                r13 = r26
            L_0x001b:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0022
                r1 = -1
                r14 = r1
                goto L_0x0024
            L_0x0022:
                r14 = r27
            L_0x0024:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x002b
                r0 = 1
                r15 = r0
                goto L_0x002d
            L_0x002b:
                r15 = r28
            L_0x002d:
                r3 = r16
                r4 = r17
                r5 = r18
                r6 = r19
                r7 = r20
                r8 = r21
                r9 = r22
                r10 = r23
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d40.C19902c.C19904b.<init>(java.lang.String, java.math.BigDecimal, java.math.BigDecimal, android.graphics.drawable.Drawable, java.util.ArrayList, ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$Calendar, boolean, boolean, boolean, boolean, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
