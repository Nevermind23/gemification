package p341ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32319m;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m40.C26141a;
import m40.C26142b;
import n40.C26369a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p366bk.C10315d;
import p380ck.C10463g;
import p40.C27230a;
import p40.C27231b;
import p40.C27232c;
import p958yv.C30116b;
import p969zv.C30411a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel */
public final class CashFlowViewModel extends C21481a {

    /* renamed from: v */
    public static final C22143a f58866v = new C22143a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C30116b f58867d;

    /* renamed from: e */
    private final C36546y f58868e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C26369a f58869f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f58870g = new C1644x();

    /* renamed from: h */
    private final C1644x f58871h = new C1644x();

    /* renamed from: i */
    private String f58872i;

    /* renamed from: j */
    private final String[] f58873j;

    /* renamed from: k */
    private int f58874k;

    /* renamed from: l */
    private int f58875l;

    /* renamed from: m */
    private final int f58876m;

    /* renamed from: n */
    private final int f58877n;

    /* renamed from: o */
    private final int f58878o;

    /* renamed from: p */
    private int f58879p;

    /* renamed from: q */
    private boolean f58880q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f58881r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final ArrayList f58882s;

    /* renamed from: t */
    private int f58883t;

    /* renamed from: u */
    private boolean f58884u;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel$a */
    public static final class C22143a {
        private C22143a() {
        }

        public /* synthetic */ C22143a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel$b */
    static final class C22144b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CashFlowViewModel f58885d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22144b(CashFlowViewModel cashFlowViewModel) {
            super(1);
            this.f58885d = cashFlowViewModel;
        }

        /* renamed from: a */
        public final void mo54972a(C41205b bVar) {
            C21484c.m69417i(this.f58885d.f58870g, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54972a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel$c */
    static final class C22145c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CashFlowViewModel f58886d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22145c(CashFlowViewModel cashFlowViewModel) {
            super(1);
            this.f58886d = cashFlowViewModel;
        }

        /* renamed from: a */
        public final void mo54973a(List list) {
            this.f58886d.f58881r = list.isEmpty();
            CashFlowViewModel cashFlowViewModel = this.f58886d;
            C41536l.m120488h(list, "it");
            CashFlowViewModel cashFlowViewModel2 = this.f58886d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cashFlowViewModel2.f58869f.mo65576a((C30411a) it.next()));
            }
            cashFlowViewModel.m71764lw(arrayList);
            C21484c.m69418j(this.f58886d.f58870g, this.f58886d.f58882s);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54973a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel$d */
    static final class C22146d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CashFlowViewModel f58887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22146d(CashFlowViewModel cashFlowViewModel) {
            super(1);
            this.f58887d = cashFlowViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58887d.f58870g, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CashFlowViewModel(C30116b bVar, C36546y yVar, C26369a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "cashFlowUseCase");
        C41536l.m120489i(yVar, "app");
        C41536l.m120489i(aVar, "cashFlowMapper");
        this.f58867d = bVar;
        this.f58868e = yVar;
        this.f58869f = aVar;
        String w = C32319m.m95316w();
        C41536l.m120488h(w, "getMonthAndYear()");
        this.f58872i = w;
        this.f58873j = yVar.getResources().getStringArray(C10315d.f28604a);
        this.f58874k = -1;
        this.f58875l = -1;
        this.f58877n = 23;
        this.f58878o = 7;
        this.f58881r = true;
        this.f58882s = new ArrayList();
        this.f58884u = true;
        int i = 23 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Date date = new Date(C32319m.m95306m(i2));
            ArrayList arrayList = this.f58882s;
            BigDecimal bigDecimal = BigDecimal.ZERO;
            C41536l.m120488h(bigDecimal, "ZERO");
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            C41536l.m120488h(bigDecimal2, "ZERO");
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            C41536l.m120488h(bigDecimal3, "ZERO");
            arrayList.add(0, new C26142b(date, bigDecimal, bigDecimal2, bigDecimal3));
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(((C26142b) this.f58882s.get(0)).mo65050d());
        this.f58883t = instance.get(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public final void m71764lw(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f58882s.set(((this.f58877n - this.f58879p) - (list.size() - 1)) + i, list.get(i));
        }
        this.f58879p += list.size();
    }

    /* renamed from: ow */
    public static /* synthetic */ void m71765ow(CashFlowViewModel cashFlowViewModel, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = cashFlowViewModel.f58877n - cashFlowViewModel.f58878o;
        }
        cashFlowViewModel.mo54965nw(z, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m71766pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m71767qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m71768rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: sw */
    private final ArrayList m71769sw(int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        int size = this.f58882s.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == i) {
                arrayList.add(Integer.valueOf(i2));
            } else {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return arrayList;
    }

    /* renamed from: uw */
    private final String m71770uw(long j) {
        return new SimpleDateFormat("MMMM, yyyy", Locale.getDefault()).format(Long.valueOf(j));
    }

    /* renamed from: Aw */
    public final void mo54962Aw(String str, String str2) {
        C41536l.m120489i(str, "month");
        C41536l.m120489i(str2, "year");
        C10463g F = C36546y.m108282F();
        F.mo27152s("pfm_cash_flow", str + C11110u2.f31950c + str2, "select_month");
    }

    /* renamed from: Bw */
    public final void mo54963Bw() {
        if (this.f58882s.size() - this.f58879p > 0) {
            Calendar instance = Calendar.getInstance();
            ArrayList arrayList = this.f58882s;
            instance.setTime(((C26142b) arrayList.get(arrayList.size() - this.f58879p)).mo65050d());
            int i = instance.get(1);
            int i2 = instance.get(2);
            this.f58874k = i;
            this.f58875l = i2;
            this.f58872i = i + "-" + i2;
            return;
        }
        this.f58880q = true;
    }

    /* renamed from: mw */
    public final LiveData mo54964mw() {
        return this.f58870g;
    }

    /* renamed from: nw */
    public final void mo54965nw(boolean z, int i) {
        int i2 = this.f58878o;
        int size = this.f58882s.size() - this.f58879p;
        int i3 = this.f58878o;
        if (i < (size - i3) - 1) {
            i2 = (i3 * 2) + 1;
        }
        if ((i <= this.f58882s.size() - this.f58879p && !this.f58880q) || z || !C21484c.m69410b(this.f58870g)) {
            C41205b I = this.f58867d.mo70403b(this.f58872i, i2, this.f58876m, true).mo95083l(new C27230a(new C22144b(this))).mo95070I(new C27231b(new C22145c(this)), new C27232c(new C22146d(this)));
            C41536l.m120488h(I, "fun getCashFlow(reload: …        )\n        }\n    }");
            addDisposable(I);
        }
    }

    /* renamed from: tw */
    public final C1644x mo54966tw() {
        return this.f58871h;
    }

    /* renamed from: vw */
    public final String mo54967vw(float f) {
        String str;
        if (f < Utils.FLOAT_EPSILON) {
            return "";
        }
        String[] strArr = this.f58873j;
        if (strArr != null) {
            str = strArr[(((int) f) + this.f58883t) % strArr.length];
        } else {
            str = null;
        }
        String substring = String.valueOf(str).substring(0, 3);
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: ww */
    public final int mo54968ww() {
        return this.f58882s.size() - 1;
    }

    /* renamed from: xw */
    public final void mo54969xw(int i) {
        boolean z;
        this.f58884u = false;
        String str = C32303f.m95204o(((C26142b) this.f58882s.get(i)).mo65049c().doubleValue()) + "₾";
        String str2 = C32303f.m95204o(((C26142b) this.f58882s.get(i)).mo65048b().doubleValue()) + "₾";
        double doubleValue = ((C26142b) this.f58882s.get(i)).mo65047a().doubleValue();
        if (doubleValue < Utils.DOUBLE_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        String str3 = C32303f.m95204o(Math.abs(doubleValue)) + "₾";
        Calendar instance = Calendar.getInstance();
        instance.setTime(((C26142b) this.f58882s.get(i)).mo65050d());
        String valueOf = String.valueOf(instance.get(1));
        String valueOf2 = String.valueOf(instance.get(2) + 1);
        C1644x xVar = this.f58871h;
        String uw = m71770uw(instance.getTime().getTime());
        C41536l.m120488h(uw, "getFormattedDate(calendar.time.time)");
        xVar.mo4826r(new C26141a(str, str2, str3, uw, z));
        mo54962Aw(valueOf2, valueOf);
    }

    /* renamed from: yw */
    public final C41224m mo54970yw(int i, int i2, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = this.f58882s.size();
        for (int i6 = 0; i6 < size; i6++) {
            float f = (float) i6;
            arrayList.add(new BarEntry(f, ((C26142b) this.f58882s.get(i6)).mo65049c().floatValue(), (Object) Integer.valueOf(i6)));
            arrayList2.add(new BarEntry(f, ((C26142b) this.f58882s.get(i6)).mo65048b().floatValue(), (Object) Integer.valueOf(i6)));
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setColors((List<Integer>) m71769sw(i5, i, i2));
        BarDataSet barDataSet2 = new BarDataSet(arrayList2, "");
        barDataSet2.setColors((List<Integer>) m71769sw(i5, i3, i4));
        return new C41224m(barDataSet, barDataSet2);
    }

    /* renamed from: zw */
    public final void mo54971zw() {
        if (this.f58881r) {
            m71765ow(this, false, 0, 2, (Object) null);
        }
    }
}
