package p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import c10.C19452i;
import g91.C32319m;
import g91.C32335t0;
import ge0.C24708f;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.NoDataView;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.BudgetingBannerView;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.CalendarDayTransactionsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;
import p341ge.bog.mobilebank.externallibs.materialcalendar.MaterialCalendarView;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10315d;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r40.C27917c;
import t40.C28304a;
import u40.C28583g;
import u40.C28584h;
import u40.C28585i;
import u40.C28586j;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import w40.C29225b;
import y40.C29922b;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a */
public final class C22179a extends C35651n1 implements C21507e {

    /* renamed from: o */
    public static final C22180a f58952o = new C22180a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f58953d = C41219i.m119470b(new C22185f(this));

    /* renamed from: e */
    private final C41217g f58954e = C41219i.m119470b(new C22195p(this));

    /* renamed from: f */
    private final C41217g f58955f = C41219i.m119470b(new C22186g(this));

    /* renamed from: g */
    private final C41217g f58956g = C41219i.m119470b(new C22183d(this));

    /* renamed from: h */
    private final C41217g f58957h = C41219i.m119470b(new C22182c(this));

    /* renamed from: i */
    private final C41217g f58958i = C41219i.m119470b(new C22181b(this));

    /* renamed from: j */
    private final C41217g f58959j = C41219i.m119470b(new C22184e(this));

    /* renamed from: k */
    private final C41217g f58960k;

    /* renamed from: l */
    private C29225b f58961l;

    /* renamed from: m */
    private CalendarDay f58962m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f58963n;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$a */
    public static final class C22180a {
        private C22180a() {
        }

        public /* synthetic */ C22180a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C22179a mo55010a() {
            return new C22179a();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$b */
    static final class C22181b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C22179a f58964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22181b(C22179a aVar) {
            super(0);
            this.f58964d = aVar;
        }

        /* renamed from: b */
        public final ViewGroup invoke() {
            return (ViewGroup) this.f58964d.findView(C10322k.faqBtn);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$c */
    static final class C22182c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C22179a f58965d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22182c(C22179a aVar) {
            super(0);
            this.f58965d = aVar;
        }

        /* renamed from: b */
        public final BogImageView invoke() {
            return (BogImageView) this.f58965d.findView(C10322k.faqImg);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$d */
    static final class C22183d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C22179a f58966d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22183d(C22179a aVar) {
            super(0);
            this.f58966d = aVar;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f58966d.findView(C10322k.faqTxt);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$e */
    static final class C22184e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C22179a f58967d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22184e(C22179a aVar) {
            super(0);
            this.f58967d = aVar;
        }

        /* renamed from: b */
        public final BudgetingBannerView invoke() {
            return (BudgetingBannerView) this.f58967d.findView(C10322k.budgetingBanner);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$f */
    static final class C22185f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C22179a f58968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22185f(C22179a aVar) {
            super(0);
            this.f58968d = aVar;
        }

        /* renamed from: b */
        public final MaterialCalendarView invoke() {
            return (MaterialCalendarView) this.f58968d.findView(C10322k.calendarView);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$g */
    static final class C22186g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C22179a f58969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22186g(C22179a aVar) {
            super(0);
            this.f58969d = aVar;
        }

        /* renamed from: b */
        public final NoDataView invoke() {
            return (NoDataView) this.f58969d.findView(C10322k.noDataView);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$h */
    /* synthetic */ class C22187h extends C41535k implements C43075l {
        C22187h(Object obj) {
            super(1, obj, C22179a.class, "onCalendarResponse", "onCalendarResponse(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo55017b(List list) {
            C41536l.m120489i(list, "p0");
            ((C22179a) this.receiver).m71883H1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55017b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$i */
    /* synthetic */ class C22188i extends C41535k implements C43075l {
        C22188i(Object obj) {
            super(1, obj, C22179a.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55018b(boolean z) {
            ((C22179a) this.receiver).m71884I1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55018b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$j */
    static final class C22189j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22179a f58970d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22189j(C22179a aVar) {
            super(1);
            this.f58970d = aVar;
        }

        /* renamed from: a */
        public final void mo55019a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            if (this.f58970d.f58963n) {
                this.f58970d.handleError(aVar);
            }
            this.f58970d.m71878C1().setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55019a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$k */
    /* synthetic */ class C22190k extends C41535k implements C43075l {
        C22190k(Object obj) {
            super(1, obj, C22179a.class, "onBudgetingPercentageResponse", "onBudgetingPercentageResponse(I)V", 0);
        }

        /* renamed from: b */
        public final void mo55020b(int i) {
            ((C22179a) this.receiver).m71882G1(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55020b(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$l */
    /* synthetic */ class C22191l extends C41535k implements C43075l {
        C22191l(Object obj) {
            super(1, obj, C22179a.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55021b(boolean z) {
            ((C22179a) this.receiver).m71884I1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55021b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$m */
    /* synthetic */ class C22192m extends C41535k implements C43075l {
        C22192m(Object obj) {
            super(1, obj, C22179a.class, "onBudgetingPercentageError", "onBudgetingPercentageError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo55022b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C22179a) this.receiver).m71881F1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55022b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$n */
    static final class C22193n extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C22179a f58971d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22193n(C22179a aVar) {
            super(2);
            this.f58971d = aVar;
        }

        /* renamed from: a */
        public final void mo55023a(int i, int i2) {
            CalendarDay a = CalendarDay.m75253a(i, i2 + 1, 1);
            C41536l.m120488h(a, "from(year, month + 1, 1)");
            this.f58971d.m71904x1().setCurrentDate(a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo55023a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$o */
    static final class C22194o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C22179a f58972d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22194o(C22179a aVar) {
            super(0);
            this.f58972d = aVar;
        }

        public final void invoke() {
            FinancialCalendarViewModel o1 = this.f58972d.m71905y1();
            CalendarDay currentDate = this.f58972d.m71904x1().getCurrentDate();
            C41536l.m120488h(currentDate, "calendarView.currentDate");
            o1.mo55044uw(currentDate);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$p */
    static final class C22195p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C22179a f58973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22195p(C22179a aVar) {
            super(0);
            this.f58973d = aVar;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f58973d.findView(C10322k.f28913yq);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$q */
    public static final class C22196q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f58974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22196q(Fragment fragment) {
            super(0);
            this.f58974d = fragment;
        }

        public final Fragment invoke() {
            return this.f58974d;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$r */
    public static final class C22197r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58975d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22197r(C43064a aVar) {
            super(0);
            this.f58975d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f58975d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$s */
    public static final class C22198s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f58976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22198s(C41217g gVar) {
            super(0);
            this.f58976d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f58976d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$t */
    public static final class C22199t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58977d;

        /* renamed from: e */
        final /* synthetic */ C41217g f58978e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22199t(C43064a aVar, C41217g gVar) {
            super(0);
            this.f58977d = aVar;
            this.f58978e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58977d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f58978e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.a$u */
    public static final class C22200u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f58979d;

        /* renamed from: e */
        final /* synthetic */ C41217g f58980e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22200u(Fragment fragment, C41217g gVar) {
            super(0);
            this.f58979d = fragment;
            this.f58980e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f58980e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f58979d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C22179a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C22197r(new C22196q(this)));
        this.f58960k = C1514j0.m5374c(this, C41520a0.m120436b(FinancialCalendarViewModel.class), new C22198s(a), new C22199t((C43064a) null, a), new C22200u(this, a));
    }

    /* renamed from: A1 */
    private final BogImageView m71876A1() {
        Object value = this.f58957h.getValue();
        C41536l.m120488h(value, "<get-FAQIv>(...)");
        return (BogImageView) value;
    }

    /* renamed from: B1 */
    private final BogTextView m71877B1() {
        Object value = this.f58956g.getValue();
        C41536l.m120488h(value, "<get-FAQTv>(...)");
        return (BogTextView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final NoDataView m71878C1() {
        Object value = this.f58955f.getValue();
        C41536l.m120488h(value, "<get-noDataView>(...)");
        return (NoDataView) value;
    }

    /* renamed from: D1 */
    private final View m71879D1() {
        Object value = this.f58954e.getValue();
        C41536l.m120488h(value, "<get-progressBar>(...)");
        return (View) value;
    }

    /* renamed from: E1 */
    private final void m71880E1() {
        C21484c.m69411c(m71905y1().mo55043tw(), this, new C22187h(this), new C22188i(this), new C22189j(this));
        C21484c.m69411c(m71905y1().mo55042sw(), this, new C22190k(this), new C22191l(this), new C22192m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final void m71881F1(C21503d.C21504a aVar) {
        m71903v1().setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final void m71882G1(int i) {
        if (i < 0) {
            m71903v1().mo54868e();
        } else {
            m71903v1().mo54867c(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final void m71883H1(List list) {
        m71904x1().mo58882G();
        MaterialCalendarView x1 = m71904x1();
        C29225b bVar = this.f58961l;
        if (bVar == null) {
            C41536l.m120506z("dayDecoratorFactory");
            bVar = null;
        }
        x1.mo58910j(bVar.mo69071c(list));
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final void m71884I1(boolean z) {
        int i = 8;
        if (z) {
            m71878C1().setVisibility(8);
        }
        View D1 = m71879D1();
        if (z) {
            i = 0;
        }
        D1.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m71885J1(C22179a aVar, MaterialCalendarView materialCalendarView, CalendarDay calendarDay, boolean z) {
        C41536l.m120489i(aVar, "this$0");
        C41536l.m120489i(materialCalendarView, "<anonymous parameter 0>");
        C41536l.m120489i(calendarDay, "calendarDay");
        aVar.m71905y1().mo55045zw(calendarDay, false);
        CalendarDayTransactionsActivity.C22165a aVar2 = CalendarDayTransactionsActivity.f58928Q;
        Context requireContext = aVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar2.mo54999a(requireContext, calendarDay);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m71886K1(C22179a aVar, MaterialCalendarView materialCalendarView, CalendarDay calendarDay) {
        C41536l.m120489i(aVar, "this$0");
        C41536l.m120489i(calendarDay, "calendarDay");
        aVar.m71905y1().mo55045zw(calendarDay, true);
        aVar.m71905y1().mo55044uw(calendarDay);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m71887L1(C22179a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        CalendarDay currentDate = aVar.m71904x1().getCurrentDate();
        C41536l.m120488h(currentDate, "calendarView.currentDate");
        long timeInMillis = C29922b.m90783a(currentDate).getTimeInMillis();
        Date date = new Date();
        Date L = C32319m.m95292L(date, -2);
        Date L2 = C32319m.m95292L(date, 50);
        C19452i.C19453a aVar2 = C19452i.f53683y;
        long time = L.getTime();
        long time2 = L2.getTime();
        String string = aVar.getString(C10328q.select_month);
        C41536l.m120488h(string, "getString(R.string.select_month)");
        C19452i a = aVar2.mo47669a(timeInMillis, time, time2, string);
        a.mo47668H1(new C22193n(aVar));
        a.mo4576A1(aVar.requireActivity().getSupportFragmentManager(), "MONTH_PICKER");
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m71888M1(C22179a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        C28304a aVar2 = C28304a.f71822a;
        C1505h requireActivity = aVar.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        aVar2.mo67958a(requireActivity, C27917c.CALENDAR);
    }

    /* renamed from: N1 */
    private final void m71889N1() {
        m71904x1().setLeftArrow(C10320i.pfm_calendar_left_arrow_with_circle);
        m71904x1().setRightArrow(C10320i.pfm_calendar_right_arrow_with_circle);
    }

    /* renamed from: v1 */
    private final BudgetingBannerView m71903v1() {
        Object value = this.f58959j.getValue();
        C41536l.m120488h(value, "<get-budgetingBanner>(...)");
        return (BudgetingBannerView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final MaterialCalendarView m71904x1() {
        Object value = this.f58953d.getValue();
        C41536l.m120488h(value, "<get-calendarView>(...)");
        return (MaterialCalendarView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final FinancialCalendarViewModel m71905y1() {
        return (FinancialCalendarViewModel) this.f58960k.getValue();
    }

    /* renamed from: z1 */
    private final ViewGroup m71906z1() {
        Object value = this.f58958i.getValue();
        C41536l.m120488h(value, "<get-FAQBtn>(...)");
        return (ViewGroup) value;
    }

    /* renamed from: b3 */
    public void mo41971b3() {
        this.f58963n = true;
        m71904x1().setCurrentDate(CalendarDay.m75256l());
        CalendarDay l = CalendarDay.m75256l();
        C41536l.m120488h(l, "today()");
        this.f58962m = l;
    }

    /* renamed from: d3 */
    public void mo41972d3() {
        this.f58963n = false;
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_calendar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        this.f58961l = new C29225b(requireContext, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m71903v1().setAnalyticsLabel("from_calendar");
        CalendarDay l = CalendarDay.m75256l();
        C41536l.m120488h(l, "today()");
        this.f58962m = l;
        m71889N1();
        m71904x1().setTitleFormatter(new C24708f(getResources().getTextArray(C10315d.f28604a)));
        m71904x1().setOnDateChangedListener(new C28583g(this));
        m71904x1().setOnMonthChangedListener(new C28584h(this));
        m71904x1().setOnTitleClickListener(new C28585i(this));
        m71877B1().setTextColor(C32335t0.m95358c(getContext()));
        if (C32335t0.m95361f() == 1) {
            m71876A1().setColorFilter(C0767a.m2893c(requireContext(), C10318g.color_accent_solo));
        } else if (C32335t0.m95361f() == 2) {
            m71876A1().setColorFilter(C0767a.m2893c(requireContext(), C10318g.color_accent_wealth));
        }
        m71906z1().setOnClickListener(new C28586j(this));
        m71878C1().mo53658d(new C22194o(this));
        m71880E1();
        FinancialCalendarViewModel y1 = m71905y1();
        CalendarDay currentDate = m71904x1().getCurrentDate();
        C41536l.m120488h(currentDate, "calendarView.currentDate");
        y1.mo55044uw(currentDate);
        m71905y1().mo55041nw();
    }
}
