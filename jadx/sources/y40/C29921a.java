package y40;

import g91.C32319m;
import he1.C41224m;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;

/* renamed from: y40.a */
public final class C29921a {

    /* renamed from: a */
    public static final C29921a f75710a = new C29921a();

    private C29921a() {
    }

    /* renamed from: a */
    public final C41224m mo70219a(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "day");
        Calendar a = C29922b.m90783a(calendarDay);
        long timeInMillis = a.getTimeInMillis();
        a.set(11, 23);
        a.set(12, 59);
        a.set(13, 59);
        a.set(14, 999);
        return new C41224m(Long.valueOf(timeInMillis), Long.valueOf(a.getTimeInMillis()));
    }

    /* renamed from: b */
    public final C41224m mo70220b(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "dayOfMonth");
        Calendar a = C29922b.m90783a(calendarDay);
        a.set(5, 1);
        Date time = a.getTime();
        a.add(2, 1);
        return new C41224m(C32319m.m95299f(time, "yyyy-MM-dd"), C32319m.m95299f(a.getTime(), "yyyy-MM-dd"));
    }

    /* renamed from: c */
    public final C41224m mo70221c(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "firstDayOfWeek");
        Calendar a = C29922b.m90783a(calendarDay);
        a.set(5, 1);
        Date time = a.getTime();
        Calendar a2 = C29922b.m90783a(calendarDay);
        a2.add(5, 6);
        a2.set(5, a2.getActualMaximum(5));
        return new C41224m(C32319m.m95299f(time, "yyyy-MM-dd"), C32319m.m95299f(a2.getTime(), "yyyy-MM-dd"));
    }

    /* renamed from: d */
    public final CalendarDay mo70222d(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "firstDayOfWeek");
        Calendar a = C29922b.m90783a(calendarDay);
        a.add(7, 6);
        CalendarDay a2 = CalendarDay.m75253a(a.get(1), a.get(2) + 1, a.get(5));
        C41536l.m120488h(a2, "from(\n            endCal…r.DAY_OF_MONTH)\n        )");
        return a2;
    }
}
