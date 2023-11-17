package p341ge.bog.mobilebank.externallibs.materialcalendar;

import java.util.Collection;
import p342j$.time.DayOfWeek;
import p342j$.time.LocalDate;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.l */
class C23328l extends C23318e {
    public C23328l(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, DayOfWeek dayOfWeek, boolean z) {
        super(materialCalendarView, calendarDay, dayOfWeek, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo59018b(Collection collection, LocalDate localDate) {
        for (int i = 0; i < 6; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                mo59017a(collection, localDate);
                localDate = localDate.plusDays(1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo59027h() {
        return this.f61023l ? 7 : 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo59029j(CalendarDay calendarDay) {
        return calendarDay.mo58864f() == mo59023g().mo58864f();
    }

    /* renamed from: y */
    public CalendarDay mo59080y() {
        return mo59023g();
    }
}
