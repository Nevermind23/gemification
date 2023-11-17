package p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;
import p721bw.C19413a;
import p925vv.C29167c;
import p936wv.C29581g;
import ue1.C43075l;
import x40.C29647b;
import y40.C29921a;
import z40.C30208m;
import z40.C30209n;
import z40.C30210o;
import z40.C30211p;
import z40.C30212q;
import z40.C30213r;
import z40.C30214s;
import z40.C30215t;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel */
public final class FinancialCalendarViewModel extends C21481a {

    /* renamed from: d */
    private final C19413a f59000d;

    /* renamed from: e */
    private final C29167c f59001e;

    /* renamed from: f */
    private final C1644x f59002f = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f59003g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public CalendarDay f59004h;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel$a */
    static final class C22211a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22211a f59005d = new C22211a();

        C22211a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C29581g gVar) {
            int i;
            C41536l.m120489i(gVar, "budgetingResult");
            if (!gVar.mo69470a().mo69441a().isEmpty()) {
                BigDecimal divide = gVar.mo69470a().mo69447f().divide(gVar.mo69470a().mo69448g(), 2, RoundingMode.HALF_UP);
                C41536l.m120488h(divide, "budgetingResult.pfmData.…_UP\n                    )");
                BigDecimal valueOf = BigDecimal.valueOf((long) 100);
                C41536l.m120488h(valueOf, "valueOf(this.toLong())");
                BigDecimal multiply = divide.multiply(valueOf);
                C41536l.m120488h(multiply, "this.multiply(other)");
                i = multiply.setScale(0).intValue();
            } else {
                i = -1;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel$b */
    static final class C22212b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22212b f59006d = new C22212b();

        C22212b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo55047a(C41205b bVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55047a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel$c */
    static final class C22213c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FinancialCalendarViewModel f59007d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22213c(FinancialCalendarViewModel financialCalendarViewModel) {
            super(1);
            this.f59007d = financialCalendarViewModel;
        }

        /* renamed from: a */
        public final void mo55048a(Integer num) {
            C1644x lw = this.f59007d.f59003g;
            C41536l.m120488h(num, "percentage");
            C21484c.m69418j(lw, num);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55048a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel$d */
    static final class C22214d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FinancialCalendarViewModel f59008d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22214d(FinancialCalendarViewModel financialCalendarViewModel) {
            super(1);
            this.f59008d = financialCalendarViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59008d.f59003g, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel$e */
    static final class C22215e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22215e f59009d = new C22215e();

        C22215e() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return C29647b.m89977b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel$f */
    static final class C22216f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FinancialCalendarViewModel f59010d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22216f(FinancialCalendarViewModel financialCalendarViewModel) {
            super(1);
            this.f59010d = financialCalendarViewModel;
        }

        /* renamed from: a */
        public final void mo55051a(C41205b bVar) {
            C21484c.m69417i(this.f59010d.mo55043tw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55051a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel$g */
    static final class C22217g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FinancialCalendarViewModel f59011d;

        /* renamed from: e */
        final /* synthetic */ CalendarDay f59012e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22217g(FinancialCalendarViewModel financialCalendarViewModel, CalendarDay calendarDay) {
            super(1);
            this.f59011d = financialCalendarViewModel;
            this.f59012e = calendarDay;
        }

        /* renamed from: a */
        public final void mo55052a(List list) {
            C1644x tw = this.f59011d.mo55043tw();
            C41536l.m120488h(list, "list");
            C21484c.m69418j(tw, list);
            this.f59011d.f59004h = this.f59012e;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55052a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel$h */
    static final class C22218h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FinancialCalendarViewModel f59013d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22218h(FinancialCalendarViewModel financialCalendarViewModel) {
            super(1);
            this.f59013d = financialCalendarViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59013d.mo55043tw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinancialCalendarViewModel(C19413a aVar, C29167c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "financialCalendarUseCase");
        C41536l.m120489i(cVar, "budgetingUseCase");
        this.f59000d = aVar;
        this.f59001e = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final Integer m71971ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m71972pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m71973qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m71974rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final List m71975vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m71976ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m71977xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m71978yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: nw */
    public final void mo55041nw() {
        C41205b G0 = this.f59001e.mo69008d().mo95026k0(new C30212q(C22211a.f59005d)).mo94980F(new C30213r(C22212b.f59006d)).mo94983G0(new C30214s(new C22213c(this)), new C30215t(new C22214d(this)));
        C41536l.m120488h(G0, "fun getBudgetingPercenta…or(it) })\n        )\n    }");
        addDisposable(G0);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f59001e.mo69007c();
    }

    /* renamed from: sw */
    public final LiveData mo55042sw() {
        return this.f59003g;
    }

    /* renamed from: tw */
    public final C1644x mo55043tw() {
        return this.f59002f;
    }

    /* renamed from: uw */
    public final void mo55044uw(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "dayOfMonth");
        C41224m b = C29921a.f75710a.mo70220b(calendarDay);
        C41205b I = this.f59000d.mo47645a((String) b.mo95675a(), (String) b.mo95676b(), true).mo95062A(new C30208m(C22215e.f59009d)).mo95083l(new C30209n(new C22216f(this))).mo95070I(new C30210o(new C22217g(this, calendarDay)), new C30211p(new C22218h(this)));
        C41536l.m120488h(I, "fun getFinancialCalendar…or(it) })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: zw */
    public final void mo55045zw(CalendarDay calendarDay, boolean z) {
        String str;
        String str2;
        C41536l.m120489i(calendarDay, "calendarDay");
        if (z) {
            CalendarDay calendarDay2 = this.f59004h;
            str2 = "navigate_through_months";
            if (calendarDay2 != null) {
                CalendarDay calendarDay3 = null;
                if (calendarDay2 == null) {
                    C41536l.m120506z("currentMonthStartDay");
                    calendarDay2 = null;
                }
                if (calendarDay.mo58867i(calendarDay2)) {
                    str = "next";
                } else {
                    CalendarDay calendarDay4 = this.f59004h;
                    if (calendarDay4 == null) {
                        C41536l.m120506z("currentMonthStartDay");
                    } else {
                        calendarDay3 = calendarDay4;
                    }
                    if (calendarDay.mo58868j(calendarDay3)) {
                        str = "previous";
                    }
                }
            }
            str = "";
        } else {
            str = "from_month_view";
            str2 = "open_day_view";
        }
        C36546y.m108282F().mo27152s("pfm_calendar", str, str2);
    }
}
