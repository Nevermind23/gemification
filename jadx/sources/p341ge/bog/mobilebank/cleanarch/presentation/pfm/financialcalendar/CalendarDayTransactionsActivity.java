package p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import ge0.C24708f;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;
import p341ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView;
import p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout;
import p366bk.C10315d;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import u40.C28577a;
import u40.C28578b;
import u40.C28579c;
import u40.C28580d;
import u40.C28581e;
import u40.C28582f;
import ue1.C43064a;
import ue1.C43075l;
import v40.C28990a;
import w40.C29225b;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity */
public final class CalendarDayTransactionsActivity extends C30772sa {

    /* renamed from: Q */
    public static final C22165a f58928Q = new C22165a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f58929F = new C1617p0(C41520a0.m120436b(CalendarDayTransactionsViewModel.class), new C22176l(this), new C22175k(this), new C22177m((C43064a) null, this));

    /* renamed from: G */
    private final C41217g f58930G = C41219i.m119470b(new C22166b(this));

    /* renamed from: H */
    private final C41217g f58931H = C41219i.m119470b(new C22168d(this));

    /* renamed from: I */
    private final C41217g f58932I = C41219i.m119470b(new C22167c(this));

    /* renamed from: J */
    private final C41217g f58933J = C41219i.m119470b(new C22169e(this));

    /* renamed from: K */
    private final C41217g f58934K = C41219i.m119470b(new C22178n(this));

    /* renamed from: L */
    private final C41217g f58935L = C41219i.m119470b(new C22174j(this));
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C28990a f58936M;

    /* renamed from: N */
    private CalendarDay f58937N;

    /* renamed from: O */
    private C29225b f58938O;

    /* renamed from: P */
    private CalendarDay f58939P;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$a */
    public static final class C22165a {
        private C22165a() {
        }

        public /* synthetic */ C22165a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54999a(Context context, CalendarDay calendarDay) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(calendarDay, "date");
            Intent intent = new Intent(context, CalendarDayTransactionsActivity.class);
            intent.putExtra("SELECTED_DATE", calendarDay);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$b */
    static final class C22166b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsActivity f58940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22166b(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
            super(0);
            this.f58940d = calendarDayTransactionsActivity;
        }

        /* renamed from: b */
        public final MaterialCalendarView invoke() {
            return (MaterialCalendarView) this.f58940d.findViewById(C10322k.calendarView);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$c */
    static final class C22167c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsActivity f58941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22167c(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
            super(0);
            this.f58941d = calendarDayTransactionsActivity;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f58941d.findViewById(C10322k.outcome_amount);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$d */
    static final class C22168d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsActivity f58942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22168d(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
            super(0);
            this.f58942d = calendarDayTransactionsActivity;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f58942d.findViewById(C10322k.income_amount);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$e */
    static final class C22169e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsActivity f58943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22169e(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
            super(0);
            this.f58943d = calendarDayTransactionsActivity;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f58943d.findViewById(C10322k.last_operations);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$f */
    /* synthetic */ class C22170f extends C41535k implements C43075l {
        C22170f(Object obj) {
            super(1, obj, CalendarDayTransactionsActivity.class, "onCalendarResponse", "onCalendarResponse(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo55004b(List list) {
            C41536l.m120489i(list, "p0");
            ((CalendarDayTransactionsActivity) this.receiver).m71857c3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55004b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$g */
    /* synthetic */ class C22171g extends C41535k implements C43075l {
        C22171g(Object obj) {
            super(1, obj, CalendarDayTransactionsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55005b(boolean z) {
            ((CalendarDayTransactionsActivity) this.receiver).m71860f3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55005b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$h */
    static final class C22172h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsActivity f58944d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22172h(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
            super(1);
            this.f58944d = calendarDayTransactionsActivity;
        }

        /* renamed from: a */
        public final void mo55006a(List list) {
            C41536l.m120489i(list, "it");
            C28990a L2 = this.f58944d.f58936M;
            if (L2 == null) {
                C41536l.m120506z("transactionAdapter");
                L2 = null;
            }
            L2.mo68830l(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55006a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$i */
    static final class C22173i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsActivity f58945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22173i(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
            super(1);
            this.f58945d = calendarDayTransactionsActivity;
        }

        /* renamed from: a */
        public final void mo55007a(boolean z) {
            this.f58945d.m71849U2().setRefreshing(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55007a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$j */
    static final class C22174j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsActivity f58946d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22174j(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
            super(0);
            this.f58946d = calendarDayTransactionsActivity;
        }

        /* renamed from: b */
        public final FrameLayout invoke() {
            return (FrameLayout) this.f58946d.findViewById(C10322k.f28913yq);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$k */
    public static final class C22175k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58947d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22175k(ComponentActivity componentActivity) {
            super(0);
            this.f58947d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58947d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$l */
    public static final class C22176l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58948d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22176l(ComponentActivity componentActivity) {
            super(0);
            this.f58948d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58948d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$m */
    public static final class C22177m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58949d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58950e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22177m(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58949d = aVar;
            this.f58950e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58949d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58950e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity$n */
    static final class C22178n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsActivity f58951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22178n(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
            super(0);
            this.f58951d = calendarDayTransactionsActivity;
        }

        /* renamed from: b */
        public final BogSwipeRefreshLayout invoke() {
            return (BogSwipeRefreshLayout) this.f58951d.findViewById(C10322k.f28739Gw);
        }
    }

    /* renamed from: O2 */
    private final void m71843O2() {
        m71844P2().mo58882G();
        MaterialCalendarView P2 = m71844P2();
        C29225b bVar = this.f58938O;
        if (bVar == null) {
            C41536l.m120506z("dayDecoratorFactory");
            bVar = null;
        }
        P2.mo58910j(bVar.mo69071c(C41341q.m119907j()));
    }

    /* renamed from: P2 */
    private final MaterialCalendarView m71844P2() {
        Object value = this.f58930G.getValue();
        C41536l.m120488h(value, "<get-calendarView>(...)");
        return (MaterialCalendarView) value;
    }

    /* renamed from: Q2 */
    private final TextView m71845Q2() {
        Object value = this.f58932I.getValue();
        C41536l.m120488h(value, "<get-expensesTv>(...)");
        return (TextView) value;
    }

    /* renamed from: R2 */
    private final TextView m71846R2() {
        Object value = this.f58931H.getValue();
        C41536l.m120488h(value, "<get-incomeTv>(...)");
        return (TextView) value;
    }

    /* renamed from: S2 */
    private final RecyclerView m71847S2() {
        Object value = this.f58933J.getValue();
        C41536l.m120488h(value, "<get-lastOperationsRecyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: T2 */
    private final FrameLayout m71848T2() {
        Object value = this.f58935L.getValue();
        C41536l.m120488h(value, "<get-progressBar>(...)");
        return (FrameLayout) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final BogSwipeRefreshLayout m71849U2() {
        Object value = this.f58934K.getValue();
        C41536l.m120488h(value, "<get-swipeRefreshLayout>(...)");
        return (BogSwipeRefreshLayout) value;
    }

    /* renamed from: V2 */
    private final CalendarDayTransactionsViewModel m71850V2() {
        return (CalendarDayTransactionsViewModel) this.f58929F.getValue();
    }

    /* renamed from: W2 */
    private final void m71851W2() {
        m71843O2();
        MaterialCalendarView P2 = m71844P2();
        CalendarDay calendarDay = this.f58939P;
        if (calendarDay == null) {
            C41536l.m120506z("selectedDate");
            calendarDay = null;
        }
        P2.mo58883H(calendarDay, false);
        m71844P2().setOnMonthChangedListener(new C28579c(this));
        m71844P2().setOnDateChangedListener(new C28580d(this));
        m71844P2().setOnTitleClickListener(new C28581e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m71852X2(CalendarDayTransactionsActivity calendarDayTransactionsActivity, MaterialCalendarView materialCalendarView, CalendarDay calendarDay) {
        C41536l.m120489i(calendarDayTransactionsActivity, "this$0");
        C41536l.m120489i(calendarDay, "firstDayOfWeek");
        calendarDayTransactionsActivity.m71850V2().mo55027Gw(calendarDay, true);
        calendarDayTransactionsActivity.m71843O2();
        calendarDayTransactionsActivity.m71850V2().mo55026Bw(calendarDay);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m71853Y2(CalendarDayTransactionsActivity calendarDayTransactionsActivity, MaterialCalendarView materialCalendarView, CalendarDay calendarDay, boolean z) {
        C41536l.m120489i(calendarDayTransactionsActivity, "this$0");
        C41536l.m120489i(materialCalendarView, "<anonymous parameter 0>");
        C41536l.m120489i(calendarDay, "calendarDay");
        if (z) {
            calendarDayTransactionsActivity.f58939P = calendarDay;
            calendarDayTransactionsActivity.m71850V2().mo55027Gw(calendarDay, false);
            calendarDayTransactionsActivity.m71850V2().mo55025Aw(calendarDay);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m71854Z2(CalendarDayTransactionsActivity calendarDayTransactionsActivity, View view) {
        C41536l.m120489i(calendarDayTransactionsActivity, "this$0");
        calendarDayTransactionsActivity.onBackPressed();
    }

    /* renamed from: a3 */
    private final void m71855a3() {
        C21484c.m69412d(m71850V2().mo55028rw(), this, new C22170f(this), new C22171g(this), (C43075l) null, 8, (Object) null);
        C21484c.m69412d(m71850V2().mo55030tw(), this, new C22172h(this), new C22173i(this), (C43075l) null, 8, (Object) null);
        m71850V2().mo55029sw().mo4819k(this, new C28578b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m71856b3(CalendarDayTransactionsActivity calendarDayTransactionsActivity, C41224m mVar) {
        C41536l.m120489i(calendarDayTransactionsActivity, "this$0");
        C41536l.m120489i(mVar, "incomeExpense");
        calendarDayTransactionsActivity.m71846R2().setText("");
        calendarDayTransactionsActivity.m71845Q2().setText("");
        BigDecimal bigDecimal = (BigDecimal) mVar.mo95678e();
        if (bigDecimal != null) {
            TextView R2 = calendarDayTransactionsActivity.m71846R2();
            BigDecimal abs = bigDecimal.abs();
            C41536l.m120488h(abs, "income.abs()");
            R2.setText(C32343x.m95408P(abs, "₾"));
        }
        BigDecimal bigDecimal2 = (BigDecimal) mVar.mo95680f();
        if (bigDecimal2 != null) {
            TextView Q2 = calendarDayTransactionsActivity.m71845Q2();
            BigDecimal abs2 = bigDecimal2.abs();
            C41536l.m120488h(abs2, "outcome.abs()");
            Q2.setText(C32343x.m95408P(abs2, "₾"));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m71857c3(List list) {
        m71844P2().mo58882G();
        MaterialCalendarView P2 = m71844P2();
        C29225b bVar = this.f58938O;
        if (bVar == null) {
            C41536l.m120506z("dayDecoratorFactory");
            bVar = null;
        }
        P2.mo58910j(bVar.mo69071c(list));
        m71844P2().post(new C28582f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m71858d3(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
        C41536l.m120489i(calendarDayTransactionsActivity, "this$0");
        MaterialCalendarView P2 = calendarDayTransactionsActivity.m71844P2();
        CalendarDay calendarDay = calendarDayTransactionsActivity.f58939P;
        if (calendarDay == null) {
            C41536l.m120506z("selectedDate");
            calendarDay = null;
        }
        P2.setSelectedDate(calendarDay);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m71859e3(CalendarDayTransactionsActivity calendarDayTransactionsActivity) {
        C41536l.m120489i(calendarDayTransactionsActivity, "this$0");
        calendarDayTransactionsActivity.m71849U2().setRefreshing(calendarDayTransactionsActivity.m71850V2().mo55031uw());
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m71860f3(boolean z) {
        if (z) {
            m71848T2().setVisibility(0);
        } else {
            m71848T2().setVisibility(8);
        }
    }

    /* renamed from: g3 */
    private final void m71861g3() {
        m71844P2().setLeftArrow(C10320i.pfm_calendar_left_arrow_with_circle);
        m71844P2().setRightArrow(C10320i.pfm_calendar_right_arrow_with_circle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_transactions_per_day;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m71861g3();
        m71844P2().setTitleFormatter(new C24708f(getResources().getTextArray(C10315d.f28604a)));
        this.f58938O = new C29225b(this, true);
        m71847S2().setLayoutManager(new LinearLayoutManager(this));
        this.f58936M = new C28990a(this);
        RecyclerView S2 = m71847S2();
        C28990a aVar = this.f58936M;
        CalendarDay calendarDay = null;
        if (aVar == null) {
            C41536l.m120506z("transactionAdapter");
            aVar = null;
        }
        S2.setAdapter(aVar);
        m71849U2().setOnRefreshListener(new C28577a(this));
        Parcelable parcelableExtra = getIntent().getParcelableExtra("SELECTED_DATE");
        C41536l.m120486f(parcelableExtra);
        CalendarDay calendarDay2 = (CalendarDay) parcelableExtra;
        this.f58939P = calendarDay2;
        if (calendarDay2 == null) {
            C41536l.m120506z("selectedDate");
            calendarDay2 = null;
        }
        this.f58937N = calendarDay2;
        m71851W2();
        CalendarDayTransactionsViewModel V2 = m71850V2();
        CalendarDay currentDate = m71844P2().getCurrentDate();
        C41536l.m120488h(currentDate, "calendarView.currentDate");
        V2.mo55026Bw(currentDate);
        CalendarDayTransactionsViewModel V22 = m71850V2();
        CalendarDay calendarDay3 = this.f58939P;
        if (calendarDay3 == null) {
            C41536l.m120506z("selectedDate");
        } else {
            calendarDay = calendarDay3;
        }
        V22.mo55025Aw(calendarDay);
        m71855a3();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.financial_calendar);
        C41536l.m120488h(string, "getString(R.string.financial_calendar)");
        return string;
    }
}
