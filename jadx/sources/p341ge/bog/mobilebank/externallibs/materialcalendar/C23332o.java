package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.view.View;
import android.view.ViewGroup;
import ge0.C24707e;
import ge0.C24709g;
import ge0.C24710h;
import java.util.List;
import p342j$.time.DayOfWeek;
import p342j$.time.temporal.ChronoUnit;
import p342j$.time.temporal.WeekFields;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.o */
public class C23332o extends C23317d {

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.o$a */
    public static class C23333a implements C23320f {

        /* renamed from: a */
        private final CalendarDay f61063a;

        /* renamed from: b */
        private final int f61064b;

        /* renamed from: c */
        private final DayOfWeek f61065c;

        public C23333a(CalendarDay calendarDay, CalendarDay calendarDay2, DayOfWeek dayOfWeek) {
            this.f61065c = dayOfWeek;
            this.f61063a = m75485b(calendarDay);
            this.f61064b = mo59051a(calendarDay2) + 1;
        }

        /* renamed from: b */
        private CalendarDay m75485b(CalendarDay calendarDay) {
            return CalendarDay.m75254b(calendarDay.mo58860d().mo24930a(WeekFields.m34452of(this.f61065c, 1).dayOfWeek(), 1));
        }

        /* renamed from: a */
        public int mo59051a(CalendarDay calendarDay) {
            return (int) ChronoUnit.WEEKS.between(this.f61063a.mo58860d(), calendarDay.mo58860d().mo24930a(WeekFields.m34452of(this.f61065c, 1).dayOfWeek(), 1));
        }

        public int getCount() {
            return this.f61064b;
        }

        public CalendarDay getItem(int i) {
            return CalendarDay.m75254b(this.f61063a.mo58860d().plusWeeks((long) i));
        }
    }

    public C23332o(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    /* renamed from: A */
    public /* bridge */ /* synthetic */ List mo58989A() {
        return super.mo58989A();
    }

    /* renamed from: B */
    public /* bridge */ /* synthetic */ int mo58990B() {
        return super.mo58990B();
    }

    /* renamed from: E */
    public /* bridge */ /* synthetic */ void mo58993E() {
        super.mo58993E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo58994G(Object obj) {
        return obj instanceof C23334p;
    }

    /* renamed from: H */
    public /* bridge */ /* synthetic */ C23317d mo58995H(C23317d dVar) {
        return super.mo58995H(dVar);
    }

    /* renamed from: I */
    public /* bridge */ /* synthetic */ void mo58996I(CalendarDay calendarDay, CalendarDay calendarDay2) {
        super.mo58996I(calendarDay, calendarDay2);
    }

    /* renamed from: J */
    public /* bridge */ /* synthetic */ void mo58997J(CalendarDay calendarDay, boolean z) {
        super.mo58997J(calendarDay, z);
    }

    /* renamed from: K */
    public /* bridge */ /* synthetic */ void mo58998K(int i) {
        super.mo58998K(i);
    }

    /* renamed from: L */
    public /* bridge */ /* synthetic */ void mo58999L(C24707e eVar) {
        super.mo58999L(eVar);
    }

    /* renamed from: M */
    public /* bridge */ /* synthetic */ void mo59000M(C24707e eVar) {
        super.mo59000M(eVar);
    }

    /* renamed from: N */
    public /* bridge */ /* synthetic */ void mo59001N(List list) {
        super.mo59001N(list);
    }

    /* renamed from: O */
    public /* bridge */ /* synthetic */ void mo59002O(CalendarDay calendarDay, CalendarDay calendarDay2) {
        super.mo59002O(calendarDay, calendarDay2);
    }

    /* renamed from: P */
    public /* bridge */ /* synthetic */ void mo59003P(int i) {
        super.mo59003P(i);
    }

    /* renamed from: Q */
    public /* bridge */ /* synthetic */ void mo59004Q(boolean z) {
        super.mo59004Q(z);
    }

    /* renamed from: R */
    public /* bridge */ /* synthetic */ void mo59005R(int i) {
        super.mo59005R(i);
    }

    /* renamed from: S */
    public /* bridge */ /* synthetic */ void mo59006S(boolean z) {
        super.mo59006S(z);
    }

    /* renamed from: T */
    public /* bridge */ /* synthetic */ void mo59007T(C24709g gVar) {
        super.mo59007T(gVar);
    }

    /* renamed from: U */
    public /* bridge */ /* synthetic */ void mo59008U(C24710h hVar) {
        super.mo59008U(hVar);
    }

    /* renamed from: V */
    public /* bridge */ /* synthetic */ void mo59009V(int i) {
        super.mo59009V(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public C23334p mo59012v(int i) {
        return new C23334p(this.f60997d, mo59015y(i), this.f60997d.getFirstDayOfWeek(), this.f61014u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public int mo58992D(C23334p pVar) {
        return mo59016z().mo59051a(pVar.mo59023g());
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo4594a(ViewGroup viewGroup, int i, Object obj) {
        super.mo4594a(viewGroup, i, obj);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ int mo6557d() {
        return super.mo6557d();
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo6558e(Object obj) {
        return super.mo6558e(obj);
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ CharSequence mo6559f(int i) {
        return super.mo6559f(i);
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ Object mo4596h(ViewGroup viewGroup, int i) {
        return super.mo4596h(viewGroup, i);
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo4597i(View view, Object obj) {
        return super.mo4597i(view, obj);
    }

    /* renamed from: t */
    public /* bridge */ /* synthetic */ void mo59010t() {
        super.mo59010t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C23320f mo59011u(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new C23333a(calendarDay, calendarDay2, this.f60997d.getFirstDayOfWeek());
    }

    /* renamed from: x */
    public /* bridge */ /* synthetic */ int mo59014x(CalendarDay calendarDay) {
        return super.mo59014x(calendarDay);
    }

    /* renamed from: y */
    public /* bridge */ /* synthetic */ CalendarDay mo59015y(int i) {
        return super.mo59015y(i);
    }

    /* renamed from: z */
    public /* bridge */ /* synthetic */ C23320f mo59016z() {
        return super.mo59016z();
    }
}
