package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel;

import androidx.core.content.C0767a;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import g91.C32319m;
import g91.C32335t0;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import i40.C25116b;
import i40.C25118d;
import iu0.C36546y;
import j40.C25326a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import k40.C25634f;
import k40.C25635g;
import k40.C25636h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p366bk.C10315d;
import p366bk.C10318g;
import p925vv.C29171e;
import p936wv.C29579e;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetHistoryViewModel */
public final class BudgetHistoryViewModel extends C21481a {

    /* renamed from: h */
    public static final C22115a f58799h = new C22115a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C29171e f58800d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25326a f58801e;

    /* renamed from: f */
    private final C36546y f58802f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f58803g = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetHistoryViewModel$a */
    public static final class C22115a {
        private C22115a() {
        }

        public /* synthetic */ C22115a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetHistoryViewModel$b */
    static final class C22116b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BudgetHistoryViewModel f58804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22116b(BudgetHistoryViewModel budgetHistoryViewModel) {
            super(1);
            this.f58804d = budgetHistoryViewModel;
        }

        /* renamed from: a */
        public final void mo54917a(C41205b bVar) {
            C21484c.m69417i(this.f58804d.f58803g, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54917a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetHistoryViewModel$c */
    static final class C22117c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BudgetHistoryViewModel f58805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22117c(BudgetHistoryViewModel budgetHistoryViewModel) {
            super(1);
            this.f58805d = budgetHistoryViewModel;
        }

        /* renamed from: a */
        public final void mo54918a(C29579e eVar) {
            List<C25116b> i = this.f58805d.f58801e.mo63897i(eVar);
            C41224m gw = this.f58805d.m71661kw(i);
            BarData barData = (BarData) gw.mo95675a();
            HashSet hashSet = (HashSet) gw.mo95676b();
            C1644x iw = this.f58805d.f58803g;
            BudgetHistoryViewModel budgetHistoryViewModel = this.f58805d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(i, 10));
            for (C25116b b : i) {
                arrayList.add(b.mo63644b());
            }
            C21484c.m69418j(iw, new C25118d(budgetHistoryViewModel.m71662lw(arrayList), barData, hashSet, i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54918a((C29579e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetHistoryViewModel$d */
    static final class C22118d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BudgetHistoryViewModel f58806d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22118d(BudgetHistoryViewModel budgetHistoryViewModel) {
            super(1);
            this.f58806d = budgetHistoryViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58806d.f58803g, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BudgetHistoryViewModel(C29171e eVar, C25326a aVar, C36546y yVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "budgetingHistoryUseCase");
        C41536l.m120489i(aVar, "budgetingMapper");
        C41536l.m120489i(yVar, "app");
        this.f58800d = eVar;
        this.f58801e = aVar;
        this.f58802f = yVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public final C41224m m71661kw(List list) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int min = Math.min(C41341q.m119909l(list), 6);
        int size = list.size() - 1;
        for (int i = 0; i < size; i++) {
            arrayList.add(new BarEntry((float) i, new float[]{((C25116b) list.get(i)).mo63646d().floatValue(), 0.0f}, (Object) Integer.valueOf(i)));
        }
        BigDecimal d = ((C25116b) list.get(min)).mo63646d();
        BigDecimal c = ((C25116b) list.get(min)).mo63645c();
        BigDecimal subtract = d.subtract(c);
        C41536l.m120488h(subtract, "this.subtract(other)");
        if (subtract.compareTo(BigDecimal.ZERO) < 0) {
            subtract = c.subtract(d);
            C41536l.m120488h(subtract, "this.subtract(other)");
        } else {
            hashSet.add(Integer.valueOf(min));
            d = c;
        }
        arrayList.add(new BarEntry((float) min, new float[]{d.floatValue(), subtract.floatValue()}, (Object) Integer.valueOf(min)));
        return new C41224m(m71664nw(arrayList, hashSet, min), hashSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public final ArrayList m71662lw(List list) {
        String[] stringArray = this.f58802f.getResources().getStringArray(C10315d.f28604a);
        C41536l.m120488h(stringArray, "app.resources.getStringArray(R.array.months)");
        Calendar instance = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            instance.setTime(C32319m.m95289I((String) list.get(i)));
            String str = stringArray[instance.get(2)];
            C41536l.m120488h(str, "months[monthIdx]");
            String substring = str.substring(0, 3);
            C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
        }
        return arrayList;
    }

    /* renamed from: mw */
    private final List m71663mw(HashSet hashSet, int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i; i3++) {
            C36546y yVar = this.f58802f;
            if (C32335t0.m95361f() == 0) {
                i2 = C10318g.budgeting_pfm_highlight_color;
            } else if (C32335t0.m95361f() == 2) {
                i2 = C10318g.budgeting_pfm_highlight_color_wealth;
            } else {
                i2 = C10318g.budgeting_pfm_highlight_color_solo;
            }
            arrayList.add(Integer.valueOf(C0767a.m2893c(yVar, i2)));
            arrayList.add(Integer.valueOf(C0767a.m2893c(this.f58802f, C10318g.budgeting_chart_background_color)));
        }
        arrayList.add(Integer.valueOf(C0767a.m2893c(this.f58802f, C10318g.budgeting_chart_positive_color)));
        if (hashSet.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(C0767a.m2893c(this.f58802f, C10318g.budgeting_chart_negative_color)));
        } else {
            arrayList.add(Integer.valueOf(C0767a.m2893c(this.f58802f, C10318g.budgeting_chart_neutral_color)));
        }
        return arrayList;
    }

    /* renamed from: nw */
    private final BarData m71664nw(ArrayList arrayList, HashSet hashSet, int i) {
        int i2;
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        C36546y yVar = this.f58802f;
        if (C32335t0.m95361f() == 0) {
            i2 = C10318g.budgeting_pfm_highlight_color;
        } else if (C32335t0.m95361f() == 2) {
            i2 = C10318g.budgeting_pfm_highlight_color_wealth;
        } else {
            i2 = C10318g.budgeting_pfm_highlight_color_solo;
        }
        barDataSet.setHighLightColor(C0767a.m2893c(yVar, i2));
        barDataSet.setHighLightAlpha(20);
        barDataSet.setDrawIcons(false);
        barDataSet.setColors((List<Integer>) m71663mw(hashSet, i));
        barDataSet.setDrawValues(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(barDataSet);
        BarData barData = new BarData((List<IBarDataSet>) arrayList2);
        barData.setValueTextColor(-1);
        barData.setBarWidth(0.25f);
        return barData;
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m71665pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m71666qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m71667rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ow */
    public final void mo54915ow() {
        String a = C32319m.m95294a(new Date(C32319m.m95307n(6)));
        String a2 = C32319m.m95294a(new Date());
        C29171e eVar = this.f58800d;
        C41536l.m120488h(a, "fromDate");
        C41536l.m120488h(a2, "toDate");
        C41205b I = eVar.mo69011b(a, a2).mo95083l(new C25634f(new C22116b(this))).mo95070I(new C25635g(new C22117c(this)), new C25636h(new C22118d(this)));
        C41536l.m120488h(I, "fun getBudgetHistoryData…or(it) })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: sw */
    public final LiveData mo54916sw() {
        return this.f58803g;
    }
}
