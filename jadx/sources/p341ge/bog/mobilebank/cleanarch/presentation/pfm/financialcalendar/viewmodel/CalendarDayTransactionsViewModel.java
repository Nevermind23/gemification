package p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel;

import androidx.lifecycle.C1644x;
import b50.C19333a;
import d50.C19909b;
import f50.C20432f;
import h50.C24882b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;
import p721bw.C19413a;
import p737dt.C20100q;
import p784hw.C25074c;
import p793iw.C25264c;
import p891su.C28261a;
import ue1.C43075l;
import x40.C29646a;
import x40.C29647b;
import y40.C29921a;
import z40.C30196a;
import z40.C30197b;
import z40.C30198c;
import z40.C30199d;
import z40.C30200e;
import z40.C30201f;
import z40.C30202g;
import z40.C30203h;
import z40.C30204i;
import z40.C30205j;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel */
public final class CalendarDayTransactionsViewModel extends C21481a {

    /* renamed from: l */
    public static final C22201a f58981l = new C22201a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C19413a f58982d;

    /* renamed from: e */
    private final C25074c f58983e;

    /* renamed from: f */
    private final C1644x f58984f = new C1644x();

    /* renamed from: g */
    private final C1644x f58985g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final List f58986h = new ArrayList();

    /* renamed from: i */
    private CalendarDay f58987i;

    /* renamed from: j */
    private final C1644x f58988j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public CalendarDay f58989k;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$a */
    public static final class C22201a {
        private C22201a() {
        }

        public /* synthetic */ C22201a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$b */
    static final class C22202b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsViewModel f58990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22202b(CalendarDayTransactionsViewModel calendarDayTransactionsViewModel) {
            super(1);
            this.f58990d = calendarDayTransactionsViewModel;
        }

        /* renamed from: a */
        public final void mo55032a(C25264c cVar) {
            this.f58990d.m71928Hw(cVar.mo63845c(), cVar.mo63847e());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55032a((C25264c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$c */
    static final class C22203c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22203c f58991d = new C22203c();

        C22203c() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C25264c cVar) {
            C41536l.m120489i(cVar, "transactions");
            ArrayList arrayList = new ArrayList();
            for (C20432f.C20434b.C20436b a : C19333a.m64786e(C24882b.m79537e(cVar.mo63846d()))) {
                C19333a.m64782a(arrayList, a, true);
            }
            return arrayList;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$d */
    static final class C22204d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsViewModel f58992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22204d(CalendarDayTransactionsViewModel calendarDayTransactionsViewModel) {
            super(1);
            this.f58992d = calendarDayTransactionsViewModel;
        }

        /* renamed from: a */
        public final void mo55034a(C41205b bVar) {
            C21484c.m69417i(this.f58992d.mo55030tw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55034a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$e */
    static final class C22205e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsViewModel f58993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22205e(CalendarDayTransactionsViewModel calendarDayTransactionsViewModel) {
            super(1);
            this.f58993d = calendarDayTransactionsViewModel;
        }

        /* renamed from: a */
        public final void mo55035a(List list) {
            C1644x tw = this.f58993d.mo55030tw();
            C41536l.m120488h(list, "it");
            C21484c.m69418j(tw, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55035a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$f */
    static final class C22206f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsViewModel f58994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22206f(CalendarDayTransactionsViewModel calendarDayTransactionsViewModel) {
            super(1);
            this.f58994d = calendarDayTransactionsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58994d.mo55030tw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$g */
    static final class C22207g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22207g f58995d = new C22207g();

        C22207g() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return C29647b.m89977b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$h */
    static final class C22208h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsViewModel f58996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22208h(CalendarDayTransactionsViewModel calendarDayTransactionsViewModel) {
            super(1);
            this.f58996d = calendarDayTransactionsViewModel;
        }

        /* renamed from: a */
        public final void mo55038a(C41205b bVar) {
            C21484c.m69417i(this.f58996d.mo55028rw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55038a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$i */
    static final class C22209i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsViewModel f58997d;

        /* renamed from: e */
        final /* synthetic */ CalendarDay f58998e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22209i(CalendarDayTransactionsViewModel calendarDayTransactionsViewModel, CalendarDay calendarDay) {
            super(1);
            this.f58997d = calendarDayTransactionsViewModel;
            this.f58998e = calendarDay;
        }

        /* renamed from: a */
        public final void mo55039a(List list) {
            List ow = this.f58997d.f58986h;
            C41536l.m120488h(list, "list");
            ow.removeAll(list);
            if (!(!this.f58997d.f58986h.isEmpty())) {
                this.f58997d.f58986h.addAll(list);
            } else if (((C29646a) C41358y.m120007W(list)).mo69565b().mo58868j(((C29646a) C41358y.m120007W(this.f58997d.f58986h)).mo69565b())) {
                this.f58997d.f58986h.addAll(0, list);
            } else {
                this.f58997d.f58986h.addAll(list);
            }
            C21484c.m69418j(this.f58997d.mo55028rw(), this.f58997d.f58986h);
            this.f58997d.f58989k = this.f58998e;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55039a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel$j */
    static final class C22210j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CalendarDayTransactionsViewModel f58999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22210j(CalendarDayTransactionsViewModel calendarDayTransactionsViewModel) {
            super(1);
            this.f58999d = calendarDayTransactionsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58999d.mo55028rw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarDayTransactionsViewModel(C19413a aVar, C25074c cVar, C20100q qVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "financialCalendarUseCase");
        C41536l.m120489i(cVar, "getTransactions");
        C41536l.m120489i(qVar, "transactionsEvent");
        this.f58982d = aVar;
        this.f58983e = cVar;
        addDisposable(qVar.mo48496c(new C30205j(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final List m71924Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m71925Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m71926Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final void m71927Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public final void m71928Hw(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.f58988j.mo4823o(new C41224m(bigDecimal, bigDecimal2));
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m71939nw(CalendarDayTransactionsViewModel calendarDayTransactionsViewModel, C19909b bVar) {
        C41536l.m120489i(calendarDayTransactionsViewModel, "this$0");
        calendarDayTransactionsViewModel.mo55031uw();
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m71943vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final List m71944ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m71945xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m71946yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m71947zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Aw */
    public final void mo55025Aw(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "selectedDay");
        if (!C41536l.m120484d(calendarDay, this.f58987i) && !(this.f58985g.mo4814f() instanceof C21503d.C21504a)) {
            this.f58987i = calendarDay;
            mo55031uw();
        }
    }

    /* renamed from: Bw */
    public final void mo55026Bw(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "firstDayOfWeek");
        C29921a aVar = C29921a.f75710a;
        CalendarDay d = aVar.mo70222d(calendarDay);
        if (!(!this.f58986h.isEmpty()) || !calendarDay.mo58869k(((C29646a) C41358y.m120007W(this.f58986h)).mo69565b(), ((C29646a) C41358y.m120019i0(this.f58986h)).mo69565b()) || !d.mo58869k(((C29646a) C41358y.m120007W(this.f58986h)).mo69565b(), ((C29646a) C41358y.m120019i0(this.f58986h)).mo69565b())) {
            C41224m c = aVar.mo70221c(calendarDay);
            C41205b I = this.f58982d.mo47645a((String) c.mo95675a(), (String) c.mo95676b(), true).mo95062A(new C30196a(C22207g.f58995d)).mo95083l(new C30197b(new C22208h(this))).mo95070I(new C30198c(new C22209i(this, calendarDay)), new C30199d(new C22210j(this)));
            C41536l.m120488h(I, "fun onWeekSelected(first…        )\n        }\n    }");
            addDisposable(I);
            return;
        }
        C21484c.m69418j(this.f58984f, this.f58986h);
    }

    /* renamed from: Gw */
    public final void mo55027Gw(CalendarDay calendarDay, boolean z) {
        String str;
        String str2;
        C41536l.m120489i(calendarDay, "destinationDay");
        if (z) {
            CalendarDay calendarDay2 = this.f58989k;
            str2 = "navigate_through_weeks";
            if (calendarDay2 != null) {
                CalendarDay calendarDay3 = null;
                if (calendarDay2 == null) {
                    C41536l.m120506z("currentWeekStartDay");
                    calendarDay2 = null;
                }
                if (calendarDay.mo58867i(calendarDay2)) {
                    str = "next";
                } else {
                    CalendarDay calendarDay4 = this.f58989k;
                    if (calendarDay4 == null) {
                        C41536l.m120506z("currentWeekStartDay");
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
            str = "from_week_view";
            str2 = "open_day_view";
        }
        C36546y.m108282F().mo27152s("pfm_calendar", str, str2);
    }

    /* renamed from: rw */
    public final C1644x mo55028rw() {
        return this.f58984f;
    }

    /* renamed from: sw */
    public final C1644x mo55029sw() {
        return this.f58988j;
    }

    /* renamed from: tw */
    public final C1644x mo55030tw() {
        return this.f58985g;
    }

    /* renamed from: uw */
    public final boolean mo55031uw() {
        CalendarDay calendarDay = this.f58987i;
        if (calendarDay == null) {
            return false;
        }
        C41224m a = C29921a.f75710a.mo70219a(calendarDay);
        long longValue = ((Number) a.mo95675a()).longValue();
        ((Number) a.mo95676b()).longValue();
        C41205b I = C25074c.m80040d(this.f58983e, Long.valueOf(longValue), Long.valueOf(longValue), (Integer) null, (Integer) null, (Integer) null, (List) null, (List) null, (List) null, (String) null, (List) null, (List) null, false, (C28261a) null, true, 8188, (Object) null).mo95084m(new C30200e(new C22202b(this))).mo95062A(new C30201f(C22203c.f58991d)).mo95083l(new C30202g(new C22204d(this))).mo95070I(new C30203h(new C22205e(this)), new C30204i(new C22206f(this)));
        C41536l.m120488h(I, "fun loadDayTransactions(…      true\n    } ?: false");
        addDisposable(I);
        return true;
    }
}
