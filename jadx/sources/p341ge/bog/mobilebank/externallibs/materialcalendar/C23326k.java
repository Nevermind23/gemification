package p341ge.bog.mobilebank.externallibs.materialcalendar;

import p342j$.time.Period;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.k */
class C23326k extends C23317d {

    /* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.k$a */
    public static class C23327a implements C23320f {

        /* renamed from: a */
        private final CalendarDay f61047a;

        /* renamed from: b */
        private final int f61048b;

        public C23327a(CalendarDay calendarDay, CalendarDay calendarDay2) {
            this.f61047a = CalendarDay.m75253a(calendarDay.mo58865g(), calendarDay.mo58864f(), 1);
            this.f61048b = mo59051a(calendarDay2) + 1;
        }

        /* renamed from: a */
        public int mo59051a(CalendarDay calendarDay) {
            return (int) Period.between(this.f61047a.mo58860d().withDayOfMonth(1), calendarDay.mo58860d().withDayOfMonth(1)).toTotalMonths();
        }

        public int getCount() {
            return this.f61048b;
        }

        public CalendarDay getItem(int i) {
            return CalendarDay.m75254b(this.f61047a.mo58860d().plusMonths((long) i));
        }
    }

    C23326k(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo58994G(Object obj) {
        return obj instanceof C23328l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public C23328l mo59012v(int i) {
        return new C23328l(this.f60997d, mo59015y(i), this.f60997d.getFirstDayOfWeek(), this.f61014u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public int mo58992D(C23328l lVar) {
        return mo59016z().mo59051a(lVar.mo59080y());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C23320f mo59011u(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new C23327a(calendarDay, calendarDay2);
    }
}
