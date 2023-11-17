package ge0;

import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;
import p342j$.time.format.DateTimeFormatter;

/* renamed from: ge0.d */
public class C24706d implements C24709g {

    /* renamed from: b */
    private final DateTimeFormatter f63597b;

    public C24706d() {
        this(DateTimeFormatter.ofPattern("LLLL yyyy"));
    }

    /* renamed from: a */
    public CharSequence mo63110a(CalendarDay calendarDay) {
        return this.f63597b.format(calendarDay.mo58860d());
    }

    public C24706d(DateTimeFormatter dateTimeFormatter) {
        this.f63597b = dateTimeFormatter;
    }
}
