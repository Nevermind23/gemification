package ge0;

import java.util.Locale;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;
import p342j$.time.format.DateTimeFormatter;

/* renamed from: ge0.c */
public class C24705c implements C24707e {

    /* renamed from: b */
    private final DateTimeFormatter f63596b;

    public C24705c() {
        this(DateTimeFormatter.ofPattern("d", Locale.getDefault()));
    }

    /* renamed from: a */
    public String mo63109a(CalendarDay calendarDay) {
        return this.f63596b.format(calendarDay.mo58860d());
    }

    public C24705c(DateTimeFormatter dateTimeFormatter) {
        this.f63596b = dateTimeFormatter;
    }
}
