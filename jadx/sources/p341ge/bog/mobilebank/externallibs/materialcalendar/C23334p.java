package p341ge.bog.mobilebank.externallibs.materialcalendar;

import java.util.Collection;
import p342j$.time.DayOfWeek;
import p342j$.time.LocalDate;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.p */
class C23334p extends C23318e {
    public C23334p(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, DayOfWeek dayOfWeek, boolean z) {
        super(materialCalendarView, calendarDay, dayOfWeek, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo59018b(Collection collection, LocalDate localDate) {
        for (int i = 0; i < 7; i++) {
            mo59017a(collection, localDate);
            localDate = localDate.plusDays(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo59027h() {
        return this.f61023l ? 2 : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo59029j(CalendarDay calendarDay) {
        return true;
    }
}
